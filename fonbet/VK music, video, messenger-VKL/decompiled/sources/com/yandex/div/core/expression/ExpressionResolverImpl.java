package com.yandex.div.core.expression;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ExpressionResolverImpl.kt */
/* loaded from: classes7.dex */
public final class ExpressionResolverImpl implements ExpressionResolver {
    private final ErrorCollector errorCollector;
    private final Map<String, Object> evaluationsCache;
    private final Evaluator evaluator;
    private final Map<String, ObserverList<gzs<s3q0>>> expressionObservers;
    private final String itemBuilderData;
    private final String path;
    private final RuntimeStore runtimeStore;
    private boolean suppressMissingVariableException;
    private final Map<String, Set<String>> varToExpressions;
    private final VariableController variableController;

    public ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2) {
        this.path = str;
        this.runtimeStore = runtimeStore;
        this.variableController = variableController;
        this.evaluator = evaluator;
        this.errorCollector = errorCollector;
        this.itemBuilderData = str2;
        this.evaluationsCache = new LinkedHashMap();
        this.varToExpressions = new LinkedHashMap();
        this.expressionObservers = new LinkedHashMap();
    }

    private final <R> R getEvaluationResult(String str, Evaluable evaluable) {
        R r = (R) this.evaluationsCache.get(str);
        if (r != null) {
            return r;
        }
        R r2 = (R) this.evaluator.eval(evaluable);
        if (evaluable.checkIsCacheable()) {
            for (String str2 : evaluable.getVariables()) {
                Map<String, Set<String>> map = this.varToExpressions;
                Set<String> set = map.get(str2);
                if (set == null) {
                    set = new LinkedHashSet<>();
                    map.put(str2, set);
                }
                set.add(str);
            }
            this.evaluationsCache.put(str, r2);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <R, T> T safeConvert(String str, String str2, izs<? super R, ? extends T> izsVar, R r, TypeHelper<T> typeHelper) {
        T t = r;
        if (izsVar != null) {
            try {
                t = izsVar.invoke(r);
            } catch (ClassCastException e) {
                throw ParsingExceptionKt.typeMismatch(str, str2, r, e);
            } catch (Exception e2) {
                throw ParsingExceptionKt.invalidValue(str, str2, r, e2);
            }
        } else if (r == 0) {
            t = (T) null;
        }
        return safeConvert$fieldAwaitsStringButValueNotConverted(typeHelper, t) ? (T) String.valueOf(t) : t;
    }

    private static final <T> boolean safeConvert$fieldAwaitsStringButValueNotConverted(TypeHelper<T> typeHelper, T t) {
        return (t == null || !(typeHelper.getTypeDefault() instanceof String) || typeHelper.isTypeValid(t)) ? false : true;
    }

    private final <T> void safeValidate(String str, String str2, ValueValidator<T> valueValidator, T t) {
        try {
            if (valueValidator.isValid(t)) {
            } else {
                throw ParsingExceptionKt.invalidValue(str2, t);
            }
        } catch (ClassCastException e) {
            throw ParsingExceptionKt.typeMismatch(str, str2, t, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToExpression$lambda$7(ExpressionResolverImpl expressionResolverImpl, String str, gzs gzsVar) {
        ObserverList<gzs<s3q0>> observerList = expressionResolverImpl.expressionObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(gzsVar);
        }
    }

    private final String tryGetMissingVariableName(EvaluableException evaluableException) {
        if (evaluableException instanceof MissingVariableException) {
            return ((MissingVariableException) evaluableException).getVariableName();
        }
        return null;
    }

    private final <R, T> T tryResolve(String str, String str2, Evaluable evaluable, izs<? super R, ? extends T> izsVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper) {
        String str3;
        String str4;
        try {
            T t = (T) getEvaluationResult(str2, evaluable);
            if (typeHelper.isTypeValid(t)) {
                str3 = str;
                str4 = str2;
            } else {
                str3 = str;
                str4 = str2;
                Object safeConvert = safeConvert(str3, str4, izsVar, t, typeHelper);
                if (safeConvert == null) {
                    throw ParsingExceptionKt.invalidValue(str3, str4, t);
                }
                t = (T) safeConvert;
            }
            safeValidate(str3, str4, valueValidator, t);
            return t;
        } catch (EvaluableException e) {
            String tryGetMissingVariableName = tryGetMissingVariableName(e);
            if (tryGetMissingVariableName != null) {
                throw ParsingExceptionKt.missingVariable(str, str2, tryGetMissingVariableName, e);
            }
            throw ParsingExceptionKt.resolveFailed(str, str2, e);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public <R, T> T get(String str, String str2, Evaluable evaluable, izs<? super R, ? extends T> izsVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger) {
        try {
            return (T) tryResolve(str, str2, evaluable, izsVar, valueValidator, typeHelper);
        } catch (ParsingException e) {
            if (e.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.suppressMissingVariableException) {
                    throw ParsingExceptionKt.getSILENT_PARSING_EXCEPTION();
                }
                throw e;
            }
            parsingErrorLogger.logError(e);
            this.errorCollector.logError(e);
            return (T) tryResolve(str, str2, evaluable, izsVar, valueValidator, typeHelper);
        }
    }

    public final Evaluator getEvaluator() {
        return this.evaluator;
    }

    public final String getItemBuilderData() {
        return this.itemBuilderData;
    }

    public final String getPath() {
        return this.path;
    }

    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    public final VariableController getVariableController() {
        return this.variableController;
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public void notifyResolveFailed(ParsingException parsingException) {
        this.errorCollector.logError(parsingException);
    }

    public final void setSuppressMissingVariableException(boolean z) {
        this.suppressMissingVariableException = z;
    }

    public final void subscribeOnVariables$div_release() {
        this.variableController.setOnAnyVariableChangeCallback(this, new izs<Variable, s3q0>() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$subscribeOnVariables$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Variable variable) {
                invoke2(variable);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                Map map;
                Map map2;
                Map map3;
                map = ExpressionResolverImpl.this.varToExpressions;
                Set set = (Set) map.get(variable.getName());
                List<String> O0 = set != null ? j5g.O0(set) : null;
                if (O0 != null) {
                    ExpressionResolverImpl expressionResolverImpl = ExpressionResolverImpl.this;
                    for (String str : O0) {
                        map3 = expressionResolverImpl.evaluationsCache;
                        map3.remove(str);
                    }
                }
                if (O0 != null) {
                    ExpressionResolverImpl expressionResolverImpl2 = ExpressionResolverImpl.this;
                    for (String str2 : O0) {
                        map2 = expressionResolverImpl2.expressionObservers;
                        ObserverList observerList = (ObserverList) map2.get(str2);
                        if (observerList != null) {
                            Iterator<E> it = observerList.iterator();
                            while (it.hasNext()) {
                                ((gzs) it.next()).invoke();
                            }
                        }
                    }
                }
            }
        });
        this.variableController.restoreSubscriptions();
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public Disposable subscribeToExpression(final String str, List<String> list, final gzs<s3q0> gzsVar) {
        for (String str2 : list) {
            Map<String, Set<String>> map = this.varToExpressions;
            Set<String> set = map.get(str2);
            if (set == null) {
                set = new LinkedHashSet<>();
                map.put(str2, set);
            }
            set.add(str);
        }
        Map<String, ObserverList<gzs<s3q0>>> map2 = this.expressionObservers;
        ObserverList<gzs<s3q0>> observerList = map2.get(str);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(str, observerList);
        }
        observerList.addObserver(gzsVar);
        return new Disposable() { // from class: xsna.uaq
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ExpressionResolverImpl.subscribeToExpression$lambda$7(ExpressionResolverImpl.this, str, gzsVar);
            }
        };
    }

    public final JSONObject validateItemBuilderDataElement(Object obj, int i) {
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.errorCollector.logError(ParsingExceptionKt.typeMismatch(i, obj));
        return null;
    }

    public final ExpressionResolverImpl withConstants$div_release(String str, ConstantsProvider constantsProvider) {
        VariableAndConstantController variableAndConstantController = new VariableAndConstantController(this.variableController, constantsProvider);
        return new ExpressionResolverImpl(this.path + '/' + str, this.runtimeStore, variableAndConstantController, new Evaluator(new EvaluationContext(variableAndConstantController, this.evaluator.getEvaluationContext().getStoredValueProvider(), this.evaluator.getEvaluationContext().getFunctionProvider(), this.evaluator.getEvaluationContext().getWarningSender())), this.errorCollector, str);
    }

    public /* synthetic */ ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2, int i, zcl zclVar) {
        this(str, runtimeStore, variableController, evaluator, errorCollector, (i & 32) != 0 ? null : str2);
    }
}
