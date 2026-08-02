package com.yandex.div.core.view2;

import com.yandex.div.json.expressions.ExpressionResolver;
import xsna.epx;

/* compiled from: BindingContext.kt */
/* loaded from: classes7.dex */
public final class BindingContext {
    private final Div2View divView;
    private final ExpressionResolver expressionResolver;

    public BindingContext(Div2View div2View, ExpressionResolver expressionResolver) {
        this.divView = div2View;
        this.expressionResolver = expressionResolver;
    }

    public final Div2View getDivView() {
        return this.divView;
    }

    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public final BindingContext getFor(ExpressionResolver expressionResolver) {
        return epx.f(this.expressionResolver, expressionResolver) ? this : new BindingContext(this.divView, expressionResolver);
    }
}
