package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.LiteralsEscaper;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: Expression.kt */
/* loaded from: classes7.dex */
public abstract class Expression<T> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: Expression.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ Expression constant$default(Companion companion, Object obj, ParsingErrorLogger parsingErrorLogger, int i, Object obj2) {
            if ((i & 2) != 0) {
                parsingErrorLogger = ParsingErrorLogger.LOG;
            }
            return companion.constant(obj, parsingErrorLogger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Expression<T> constant(T t, ParsingErrorLogger parsingErrorLogger) {
            if (!(t instanceof String)) {
                return new ConstantExpression(t);
            }
            return new StringConstantExpression((String) t, null, parsingErrorLogger, 2, null);
        }

        public final boolean mayBeExpression(Object obj) {
            return (obj instanceof String) && drm0.D((CharSequence) obj, "@{", false);
        }

        private Companion() {
        }
    }

    /* compiled from: Expression.kt */
    public static class ConstantExpression<T> extends Expression<T> {
        private final T value;

        public ConstantExpression(T t) {
            this.value = t;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public T evaluate(ExpressionResolver expressionResolver) {
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Object getRawValue() {
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observe(ExpressionResolver expressionResolver, izs<? super T, s3q0> izsVar) {
            return Disposable.NULL;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observeAndGet(ExpressionResolver expressionResolver, izs<? super T, s3q0> izsVar) {
            izsVar.invoke(this.value);
            return Disposable.NULL;
        }
    }

    /* compiled from: Expression.kt */
    public static final class MutableExpression<R, T> extends Expression<T> {
        private final izs<R, T> converter;
        private Evaluable evaluable;
        private final String expressionKey;
        private final Expression<T> fieldDefaultValue;
        private T lastValidValue;
        private final ParsingErrorLogger logger;
        private final String rawExpression;
        private final String rawValue;
        private final TypeHelper<T> typeHelper;
        private final ValueValidator<T> validator;

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(String str, String str2, izs<? super R, ? extends T> izsVar, ValueValidator<T> valueValidator, ParsingErrorLogger parsingErrorLogger, TypeHelper<T> typeHelper, Expression<T> expression) {
            this.expressionKey = str;
            this.rawExpression = str2;
            this.converter = izsVar;
            this.validator = valueValidator;
            this.logger = parsingErrorLogger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = str2;
        }

        private final List<Evaluable> getDynamicVariables() {
            Object failure;
            try {
                Evaluable evaluable = this.evaluable;
                failure = evaluable != null ? evaluable.getDynamicVariables() : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return (List) (failure instanceof Result.Failure ? null : failure);
        }

        private final Evaluable getEvaluable() {
            Evaluable evaluable = this.evaluable;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                Evaluable lazy = Evaluable.Companion.lazy(this.rawExpression);
                this.evaluable = lazy;
                return lazy;
            } catch (EvaluableException e) {
                throw ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e);
            }
        }

        private final List<String> getVariables(ExpressionResolver expressionResolver) {
            try {
                return getEvaluable().getVariables();
            } catch (Exception e) {
                logError(ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e), expressionResolver);
                return EmptyList.b;
            }
        }

        private final void logError(ParsingException parsingException, ExpressionResolver expressionResolver) {
            this.logger.logError(parsingException);
            expressionResolver.notifyResolveFailed(parsingException);
        }

        private final String resolveVariableName(Evaluable evaluable, ExpressionResolver expressionResolver) {
            return (String) expressionResolver.get(this.expressionKey, evaluable.toString(), evaluable, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), TypeHelpersKt.TYPE_HELPER_STRING, this.logger);
        }

        private final T tryResolve(ExpressionResolver expressionResolver) {
            T t = (T) expressionResolver.get(this.expressionKey, this.rawExpression, getEvaluable(), this.converter, this.validator, this.typeHelper, this.logger);
            if (t == null) {
                throw ParsingExceptionKt.resolveFailed$default(this.expressionKey, this.rawExpression, null, 4, null);
            }
            if (this.typeHelper.isTypeValid(t)) {
                return t;
            }
            throw ParsingExceptionKt.typeMismatch$default(this.expressionKey, this.rawExpression, t, null, 8, null);
        }

        private final T tryResolveOrUseLast(ExpressionResolver expressionResolver) {
            T evaluate;
            try {
                T tryResolve = tryResolve(expressionResolver);
                this.lastValidValue = tryResolve;
                return tryResolve;
            } catch (ParsingException e) {
                String message = e.getMessage();
                if (message != null && message.length() != 0) {
                    logError(e, expressionResolver);
                }
                T t = this.lastValidValue;
                if (t != null) {
                    return t;
                }
                try {
                    Expression<T> expression = this.fieldDefaultValue;
                    if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
                        return this.typeHelper.getTypeDefault();
                    }
                    this.lastValidValue = evaluate;
                    return evaluate;
                } catch (ParsingException e2) {
                    logError(e2, expressionResolver);
                    throw e2;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.Expression
        public T evaluate(ExpressionResolver expressionResolver) {
            return tryResolveOrUseLast(expressionResolver);
        }

        public final List<String> getVariablesName(ExpressionResolver expressionResolver) {
            ArrayList arrayList;
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (dynamicVariables != null) {
                arrayList = new ArrayList();
                Iterator<T> it = dynamicVariables.iterator();
                while (it.hasNext()) {
                    String resolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                    if (resolveVariableName != null) {
                        arrayList.add(resolveVariableName);
                    }
                }
            } else {
                arrayList = null;
            }
            return (arrayList == null || arrayList.isEmpty()) ? variables : j5g.u0(arrayList, variables);
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observe(final ExpressionResolver expressionResolver, final izs<? super T, s3q0> izsVar) {
            List<Evaluable> list;
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (variables.isEmpty() && ((list = dynamicVariables) == null || list.isEmpty())) {
                return Disposable.NULL;
            }
            final gzs<s3q0> gzsVar = new gzs<s3q0>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$callbackWithValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    izsVar.invoke(this.evaluate(expressionResolver));
                }
            };
            Disposable subscribeToExpression = expressionResolver.subscribeToExpression(this.rawExpression, variables, gzsVar);
            List<Evaluable> list2 = dynamicVariables;
            if (list2 == null || list2.isEmpty()) {
                return subscribeToExpression;
            }
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            CompositeDisposableKt.plusAssign(compositeDisposable, subscribeToExpression);
            CompositeDisposableKt.plusAssign(compositeDisposable, observe(dynamicVariables, expressionResolver, gzsVar));
            for (final Evaluable evaluable : dynamicVariables) {
                final ExpressionResolver expressionResolver2 = expressionResolver;
                gzs<s3q0> gzsVar2 = new gzs<s3q0>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1$dynamicVarCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Disposable observe;
                        CompositeDisposable compositeDisposable2 = CompositeDisposable.this;
                        observe = this.observe(evaluable, expressionResolver2, (gzs<s3q0>) gzsVar);
                        CompositeDisposableKt.plusAssign(compositeDisposable2, observe);
                    }
                };
                CompositeDisposableKt.plusAssign(compositeDisposable, expressionResolver2.subscribeToExpression(evaluable.toString(), evaluable.getVariables(), gzsVar2));
                CompositeDisposableKt.plusAssign(compositeDisposable, observe(evaluable.getDynamicVariables(), expressionResolver2, gzsVar2));
                expressionResolver = expressionResolver2;
            }
            return compositeDisposable;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public String getRawValue() {
            return this.rawValue;
        }

        private final Disposable observe(List<? extends Evaluable> list, ExpressionResolver expressionResolver, gzs<s3q0> gzsVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String resolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                if (resolveVariableName != null) {
                    arrayList.add(resolveVariableName);
                }
            }
            return arrayList.isEmpty() ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, arrayList, gzsVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable observe(Evaluable evaluable, ExpressionResolver expressionResolver, gzs<s3q0> gzsVar) {
            String resolveVariableName = resolveVariableName(evaluable, expressionResolver);
            return resolveVariableName == null ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, Collections.singletonList(resolveVariableName), gzsVar);
        }
    }

    /* compiled from: Expression.kt */
    public static final class StringConstantExpression extends ConstantExpression<String> {
        private String cachedValue;
        private final String defaultValue;
        private final ParsingErrorLogger logger;
        private final String value;

        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger);
        }

        @Override // com.yandex.div.json.expressions.Expression.ConstantExpression, com.yandex.div.json.expressions.Expression
        public String evaluate(ExpressionResolver expressionResolver) {
            String str = this.cachedValue;
            if (str != null) {
                return str;
            }
            try {
                String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, this.value, null, 2, null);
                this.cachedValue = process$default;
                return process$default;
            } catch (EvaluableException e) {
                this.logger.logError(e);
                String str2 = this.defaultValue;
                this.cachedValue = str2;
                return str2;
            }
        }

        public StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger) {
            super(str);
            this.value = str;
            this.defaultValue = str2;
            this.logger = parsingErrorLogger;
        }
    }

    public static final <T> Expression<T> constant(T t, ParsingErrorLogger parsingErrorLogger) {
        return Companion.constant(t, parsingErrorLogger);
    }

    public static final boolean mayBeExpression(Object obj) {
        return Companion.mayBeExpression(obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Expression) {
            return epx.f(getRawValue(), ((Expression) obj).getRawValue());
        }
        return false;
    }

    public abstract T evaluate(ExpressionResolver expressionResolver);

    public abstract Object getRawValue();

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    public abstract Disposable observe(ExpressionResolver expressionResolver, izs<? super T, s3q0> izsVar);

    public Disposable observeAndGet(ExpressionResolver expressionResolver, izs<? super T, s3q0> izsVar) {
        T t;
        try {
            t = evaluate(expressionResolver);
        } catch (ParsingException unused) {
            t = null;
        }
        if (t != null) {
            izsVar.invoke(t);
        }
        return observe(expressionResolver, izsVar);
    }
}
