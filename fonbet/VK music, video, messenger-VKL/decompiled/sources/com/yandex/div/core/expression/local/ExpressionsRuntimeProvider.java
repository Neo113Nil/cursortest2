package com.yandex.div.core.expression.local;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.j3;
import com.yandex.div2.md;
import com.yandex.div2.t4;
import java.util.Iterator;
import java.util.List;
import xsna.ikn;
import xsna.rff;
import xsna.zr;

/* compiled from: ExpressionsRuntimeProvider.kt */
/* loaded from: classes7.dex */
public class ExpressionsRuntimeProvider {
    private final DivActionBinder divActionBinder;
    private final DivVariableController divVariableController;
    private final Div2Logger logger;
    private final StoredValuesController storedValuesController;

    public ExpressionsRuntimeProvider(DivVariableController divVariableController, DivActionBinder divActionBinder, Div2Logger div2Logger, StoredValuesController storedValuesController) {
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = div2Logger;
        this.storedValuesController = storedValuesController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector, String str) {
        StoredValue storedValue = expressionsRuntimeProvider.storedValuesController.getStoredValue(str, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    private TriggersController toTriggersController(List<DivTrigger> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        List<DivTrigger> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }

    public ExpressionsRuntime createChildRuntime(DivStatePath divStatePath, ikn iknVar, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(expressionResolverImpl.getVariableController());
        List<t4> A = iknVar.A();
        FunctionProviderDecorator functionProviderDecorator = (FunctionProviderDecorator) expressionResolverImpl.getEvaluator().getEvaluationContext().getFunctionProvider();
        List<t4> list = A;
        if (list != null && !list.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(A));
        }
        ExpressionResolverImpl expressionResolverImpl2 = new ExpressionResolverImpl(expressionResolverImpl.getPath() + '/' + divStatePath.getLastDivId$div_release(), expressionResolverImpl.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, expressionResolverImpl.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecorator, expressionResolverImpl.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector, null, 32, null);
        List<md> f = iknVar.f();
        if (f != null) {
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (md) it.next(), expressionResolverImpl2, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl2, toTriggersController(iknVar.p(), expressionResolverImpl2, errorCollector));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpressionsRuntime createRootRuntime(j3 j3Var, final ErrorCollector errorCollector, RuntimeStore runtimeStore) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, 0 == true ? 1 : 0);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource$div_release());
        rff rffVar = new rff(this, errorCollector);
        FunctionProviderDecorator functionProviderDecorator = new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE);
        List<t4> list = j3Var.a;
        List<t4> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(list));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, rffVar, functionProviderDecorator, new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo113sendBIH1yYw(Evaluable evaluable, String str) {
                ErrorCollector.this.logWarning(new Throwable(zr.a("Warning occurred while evaluating '", evaluable.getRawExpr(), "':"), new Throwable(str)));
            }
        })), errorCollector, null, 32, null);
        List<md> list3 = j3Var.g;
        if (list3 != null) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (md) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(j3Var.f, expressionResolverImpl, errorCollector));
    }
}
