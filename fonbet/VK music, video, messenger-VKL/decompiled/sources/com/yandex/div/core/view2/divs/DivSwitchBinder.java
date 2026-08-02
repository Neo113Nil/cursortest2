package com.yandex.div.core.view2.divs;

import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.a;
import com.yandex.div2.db;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivSwitchBinder.kt */
/* loaded from: classes7.dex */
public final class DivSwitchBinder extends DivViewBinder<a.n, db, DivSwitchView> {
    private final TwoWayBooleanVariableBinder variableBinder;

    public DivSwitchBinder(DivBaseBinder divBaseBinder, TwoWayBooleanVariableBinder twoWayBooleanVariableBinder) {
        super(divBaseBinder);
        this.variableBinder = twoWayBooleanVariableBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIsEnabled(DivSwitchView divSwitchView, db dbVar, ExpressionResolver expressionResolver) {
        divSwitchView.setEnabled(dbVar.o.evaluate(expressionResolver).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOnColor(DivSwitchView divSwitchView, db dbVar, ExpressionResolver expressionResolver) {
        Expression<Integer> expression = dbVar.s;
        divSwitchView.setColorOn(expression != null ? expression.evaluate(expressionResolver) : null);
    }

    private final void bindIsEnabled(final DivSwitchView divSwitchView, final db dbVar, db dbVar2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression = dbVar.o;
        Expression<Boolean> expression2 = dbVar.o;
        if (ExpressionsKt.equalsToConstant(expression, dbVar2 != null ? dbVar2.o : null)) {
            return;
        }
        applyIsEnabled(divSwitchView, dbVar, expressionResolver);
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divSwitchView.addSubscription(expression2.observe(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindIsEnabled$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivSwitchBinder.this.applyIsEnabled(divSwitchView, dbVar, expressionResolver);
            }
        }));
    }

    private final void bindOnColor(final DivSwitchView divSwitchView, final db dbVar, db dbVar2, final ExpressionResolver expressionResolver) {
        Expression<Integer> expression = dbVar.s;
        Expression<Integer> expression2 = dbVar.s;
        if (ExpressionsKt.equalsToConstant(expression, dbVar2 != null ? dbVar2.s : null)) {
            return;
        }
        applyOnColor(divSwitchView, dbVar, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        divSwitchView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindOnColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivSwitchBinder.this.applyOnColor(divSwitchView, dbVar, expressionResolver);
            }
        }) : null);
    }

    private final void observeVariable(final DivSwitchView divSwitchView, db dbVar, BindingContext bindingContext, DivStatePath divStatePath) {
        divSwitchView.addSubscription(this.variableBinder.bindVariable(bindingContext, dbVar.p, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$observeVariable$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(izs<? super Boolean, s3q0> izsVar) {
                DivSwitchView.this.setOnCheckedChangeListener(izsVar);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Boolean bool) {
                if (bool != null) {
                    DivSwitchView.this.setChecked(bool.booleanValue());
                }
            }
        }, divStatePath));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSwitchView divSwitchView, BindingContext bindingContext, db dbVar, db dbVar2, DivStatePath divStatePath) {
        bindIsEnabled(divSwitchView, dbVar, dbVar2, bindingContext.getExpressionResolver());
        bindOnColor(divSwitchView, dbVar, dbVar2, bindingContext.getExpressionResolver());
        observeVariable(divSwitchView, dbVar, bindingContext, divStatePath);
    }
}
