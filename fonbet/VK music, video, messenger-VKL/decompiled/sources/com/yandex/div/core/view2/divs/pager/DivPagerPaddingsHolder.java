package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPager;
import com.yandex.div2.y3;
import xsna.an10;

/* compiled from: DivPagerPaddingsHolder.kt */
/* loaded from: classes7.dex */
public final class DivPagerPaddingsHolder {
    private final Integer alignedBottom;
    private final Integer alignedLeft;
    private final Integer alignedRight;
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;
    private final DisplayMetrics metrics;
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;
    private final float top;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPagerPaddingsHolder(y3 y3Var, ExpressionResolver expressionResolver, View view, DisplayMetrics displayMetrics, boolean z, DivPager.ItemAlignment itemAlignment) {
        boolean z2;
        Expression<Long> expression;
        Expression<Long> expression2;
        this.resolver = expressionResolver;
        this.metrics = displayMetrics;
        if ((y3Var != null ? y3Var.e : null) == null) {
            if ((y3Var != null ? y3Var.b : null) == null) {
                z2 = false;
                this.hasRelativePaddings = z2;
                if (z2) {
                    if (y3Var != null) {
                        expression = y3Var.c;
                    }
                    expression = null;
                } else if (ViewsKt.isLayoutRtl(view)) {
                    if (y3Var != null) {
                        expression = y3Var.b;
                    }
                    expression = null;
                } else {
                    if (y3Var != null) {
                        expression = y3Var.e;
                    }
                    expression = null;
                }
                float padding = toPadding(expression);
                this.left = padding;
                float padding2 = toPadding(y3Var == null ? y3Var.f : null);
                this.top = padding2;
                if (z2) {
                    if (y3Var != null) {
                        expression2 = y3Var.d;
                    }
                    expression2 = null;
                } else if (ViewsKt.isLayoutRtl(view)) {
                    if (y3Var != null) {
                        expression2 = y3Var.e;
                    }
                    expression2 = null;
                } else {
                    if (y3Var != null) {
                        expression2 = y3Var.b;
                    }
                    expression2 = null;
                }
                float padding3 = toPadding(expression2);
                this.right = padding3;
                float padding4 = toPadding(y3Var == null ? y3Var.a : null);
                this.bottom = padding4;
                this.start = z ? padding2 : ViewsKt.isLayoutRtl(view) ? padding3 : padding;
                this.end = z ? padding4 : ViewsKt.isLayoutRtl(view) ? padding : padding3;
                this.alignedLeft = (z || (itemAlignment == DivPager.ItemAlignment.START && !ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(an10.b(padding)) : null;
                this.alignedTop = (!z || itemAlignment == DivPager.ItemAlignment.START) ? Integer.valueOf(an10.b(padding2)) : null;
                this.alignedRight = (z || (itemAlignment == DivPager.ItemAlignment.START && ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && !ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(an10.b(padding3)) : null;
                this.alignedBottom = (!z || itemAlignment == DivPager.ItemAlignment.END) ? Integer.valueOf(an10.b(padding4)) : null;
            }
        }
        z2 = true;
        this.hasRelativePaddings = z2;
        if (z2) {
        }
        float padding5 = toPadding(expression);
        this.left = padding5;
        float padding22 = toPadding(y3Var == null ? y3Var.f : null);
        this.top = padding22;
        if (z2) {
        }
        float padding32 = toPadding(expression2);
        this.right = padding32;
        float padding42 = toPadding(y3Var == null ? y3Var.a : null);
        this.bottom = padding42;
        this.start = z ? padding22 : ViewsKt.isLayoutRtl(view) ? padding32 : padding5;
        this.end = z ? padding42 : ViewsKt.isLayoutRtl(view) ? padding5 : padding32;
        this.alignedLeft = (z || (itemAlignment == DivPager.ItemAlignment.START && !ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(an10.b(padding5)) : null;
        this.alignedTop = (!z || itemAlignment == DivPager.ItemAlignment.START) ? Integer.valueOf(an10.b(padding22)) : null;
        this.alignedRight = (z || (itemAlignment == DivPager.ItemAlignment.START && ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && !ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(an10.b(padding32)) : null;
        this.alignedBottom = (!z || itemAlignment == DivPager.ItemAlignment.END) ? Integer.valueOf(an10.b(padding42)) : null;
    }

    private final float toPadding(Expression<Long> expression) {
        return expression != null ? BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }

    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.top;
    }
}
