package com.yandex.div.core.view2.divs;

import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.a;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivSeparatorBinder.kt */
/* loaded from: classes7.dex */
public final class DivSeparatorBinder extends DivViewBinder<a.k, DivSeparator, DivSeparatorView> {
    public DivSeparatorBinder(DivBaseBinder divBaseBinder) {
        super(divBaseBinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, DivSeparator.DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver) {
        if (delimiterStyle == null) {
            divSeparatorView.setDividerColor(335544320);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(delimiterStyle.a.evaluate(expressionResolver).intValue());
            divSeparatorView.setHorizontal(delimiterStyle.b.evaluate(expressionResolver) == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        }
    }

    private final void bindStyle(final DivSeparatorView divSeparatorView, final DivSeparator.DelimiterStyle delimiterStyle, DivSeparator.DelimiterStyle delimiterStyle2, final ExpressionResolver expressionResolver) {
        Expression<DivSeparator.DelimiterStyle.Orientation> expression;
        Expression<Integer> expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.a : null, delimiterStyle2 != null ? delimiterStyle2.a : null)) {
            if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.b : null, delimiterStyle2 != null ? delimiterStyle2.b : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.a : null)) {
            if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.b : null)) {
                return;
            }
        }
        izs<? super DivSeparator.DelimiterStyle.Orientation, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
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
                DivSeparatorBinder.this.applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
            }
        };
        divSeparatorView.addSubscription((delimiterStyle == null || (expression2 = delimiterStyle.a) == null) ? null : expression2.observe(expressionResolver, izsVar));
        if (delimiterStyle != null && (expression = delimiterStyle.b) != null) {
            disposable = expression.observe(expressionResolver, izsVar);
        }
        divSeparatorView.addSubscription(disposable);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSeparatorView divSeparatorView, BindingContext bindingContext, DivSeparator divSeparator, DivSeparator divSeparator2) {
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, divSeparator.b, divSeparator.d, divSeparator.x, divSeparator.o, divSeparator.u, divSeparator.t, divSeparator.B, divSeparator.A, divSeparator.c, divSeparator.k);
        bindStyle(divSeparatorView, divSeparator.m, divSeparator2 != null ? divSeparator2.m : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R$dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }
}
