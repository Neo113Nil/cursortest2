package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import xsna.epx;

/* compiled from: DivItemBuilderResult.kt */
/* loaded from: classes7.dex */
public final class DivItemBuilderResult {
    private final a div;
    private final ExpressionResolver expressionResolver;

    public DivItemBuilderResult(a aVar, ExpressionResolver expressionResolver) {
        this.div = aVar;
        this.expressionResolver = expressionResolver;
    }

    public final a component1() {
        return this.div;
    }

    public final ExpressionResolver component2() {
        return this.expressionResolver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        return epx.f(this.div, divItemBuilderResult.div) && epx.f(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    public final a getDiv() {
        return this.div;
    }

    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public int hashCode() {
        return this.expressionResolver.hashCode() + (this.div.hashCode() * 31);
    }

    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }
}
