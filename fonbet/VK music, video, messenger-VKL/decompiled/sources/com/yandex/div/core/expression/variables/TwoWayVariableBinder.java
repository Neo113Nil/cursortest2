package com.yandex.div.core.expression.variables;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div2.j3;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TwoWayVariableBinder.kt */
/* loaded from: classes7.dex */
public abstract class TwoWayVariableBinder<T> {
    private final ErrorCollectors errorCollectors;

    /* compiled from: TwoWayVariableBinder.kt */
    public interface Callbacks<T> {
        void onVariableChanged(T t);

        void setViewStateChangeListener(izs<? super T, s3q0> izsVar);
    }

    public TwoWayVariableBinder(ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    public Disposable bindVariable(final BindingContext bindingContext, final String str, final Callbacks<T> callbacks, DivStatePath divStatePath) {
        final Div2View divView = bindingContext.getDivView();
        j3 divData = divView.getDivData();
        if (divData == null) {
            return Disposable.NULL;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DivDataTag dataTag = divView.getDataTag();
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null) {
            return Disposable.NULL;
        }
        callbacks.setViewStateChangeListener(new izs<T, s3q0>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2((TwoWayVariableBinder$bindVariable$1<T>) obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                if (epx.f(ref$ObjectRef.element, t)) {
                    return;
                }
                ref$ObjectRef.element = t;
                VariableMutationHandler.Companion.setVariable(divView, str, this.toStringValue(t), bindingContext.getExpressionResolver());
            }
        });
        return variableController.subscribeToVariableChange(str, this.errorCollectors.getOrCreate(dataTag, divData), true, new izs<Variable, s3q0>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Variable variable) {
                invoke2(variable);
                return s3q0.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                Object value = variable.getValue();
                T t = value;
                if (value == null) {
                    t = 0;
                }
                if (epx.f(ref$ObjectRef.element, t)) {
                    return;
                }
                ref$ObjectRef.element = t;
                callbacks.onVariableChanged(t);
            }
        });
    }

    public abstract String toStringValue(T t);
}
