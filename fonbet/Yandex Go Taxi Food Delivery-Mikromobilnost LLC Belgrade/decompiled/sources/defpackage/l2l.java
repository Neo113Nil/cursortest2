package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public final class l2l {
    public final rvo a;
    public final DisplayMetrics b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l2l(DivEdgeInsets divEdgeInsets, rvo rvoVar, View view, DisplayMetrics displayMetrics, boolean z, DivPager$ItemAlignment divPager$ItemAlignment) {
        boolean z2;
        Expression expression;
        Expression expression2;
        this.a = rvoVar;
        this.b = displayMetrics;
        if ((divEdgeInsets != null ? divEdgeInsets.e : null) == null) {
            if ((divEdgeInsets != null ? divEdgeInsets.b : null) == null) {
                z2 = false;
                if (z2) {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.c;
                    }
                    expression = null;
                } else if (ffx.W(view)) {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.b;
                    }
                    expression = null;
                } else {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.e;
                    }
                    expression = null;
                }
                float a = a(expression);
                this.c = a;
                float a2 = a(divEdgeInsets == null ? divEdgeInsets.f : null);
                this.d = a2;
                if (z2) {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.d;
                    }
                    expression2 = null;
                } else if (ffx.W(view)) {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.e;
                    }
                    expression2 = null;
                } else {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.b;
                    }
                    expression2 = null;
                }
                float a3 = a(expression2);
                this.e = a3;
                float a4 = a(divEdgeInsets == null ? divEdgeInsets.a : null);
                this.f = a4;
                this.g = z ? a2 : ffx.W(view) ? a3 : a;
                this.h = z ? a4 : ffx.W(view) ? a : a3;
                this.i = (z || (divPager$ItemAlignment == DivPager$ItemAlignment.START && !ffx.W(view)) || (divPager$ItemAlignment == DivPager$ItemAlignment.END && ffx.W(view))) ? Integer.valueOf(m810.b(a)) : null;
                this.j = (!z || divPager$ItemAlignment == DivPager$ItemAlignment.START) ? Integer.valueOf(m810.b(a2)) : null;
                this.k = (z || (divPager$ItemAlignment == DivPager$ItemAlignment.START && ffx.W(view)) || (divPager$ItemAlignment == DivPager$ItemAlignment.END && !ffx.W(view))) ? Integer.valueOf(m810.b(a3)) : null;
                this.l = (!z || divPager$ItemAlignment == DivPager$ItemAlignment.END) ? Integer.valueOf(m810.b(a4)) : null;
            }
        }
        z2 = true;
        if (z2) {
        }
        float a5 = a(expression);
        this.c = a5;
        float a22 = a(divEdgeInsets == null ? divEdgeInsets.f : null);
        this.d = a22;
        if (z2) {
        }
        float a32 = a(expression2);
        this.e = a32;
        float a42 = a(divEdgeInsets == null ? divEdgeInsets.a : null);
        this.f = a42;
        this.g = z ? a22 : ffx.W(view) ? a32 : a5;
        this.h = z ? a42 : ffx.W(view) ? a5 : a32;
        this.i = (z || (divPager$ItemAlignment == DivPager$ItemAlignment.START && !ffx.W(view)) || (divPager$ItemAlignment == DivPager$ItemAlignment.END && ffx.W(view))) ? Integer.valueOf(m810.b(a5)) : null;
        this.j = (!z || divPager$ItemAlignment == DivPager$ItemAlignment.START) ? Integer.valueOf(m810.b(a22)) : null;
        this.k = (z || (divPager$ItemAlignment == DivPager$ItemAlignment.START && ffx.W(view)) || (divPager$ItemAlignment == DivPager$ItemAlignment.END && !ffx.W(view))) ? Integer.valueOf(m810.b(a32)) : null;
        this.l = (!z || divPager$ItemAlignment == DivPager$ItemAlignment.END) ? Integer.valueOf(m810.b(a42)) : null;
    }

    public final float a(Expression expression) {
        if (expression != null) {
            return a.q(Long.valueOf(((Number) expression.a(this.a)).longValue()), this.b);
        }
        return 0.0f;
    }
}
