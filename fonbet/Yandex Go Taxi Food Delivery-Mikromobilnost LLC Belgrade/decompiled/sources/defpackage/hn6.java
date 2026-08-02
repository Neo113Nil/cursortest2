package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes14.dex */
public final /* synthetic */ class hn6 implements gn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yuf0 b;

    public /* synthetic */ hn6(yuf0 yuf0Var, int i) {
        this.a = i;
        this.b = yuf0Var;
    }

    @Override // defpackage.gn6
    public final NinePatchDrawable c(Drawable drawable) {
        int i = this.a;
        yuf0 yuf0Var = this.b;
        switch (i) {
            case 0:
                return ((kjz) yuf0Var.e).c(drawable, yuf0.i, yuf0.j, yuf0.k);
            case 1:
                return ((kjz) yuf0Var.e).c(drawable, yuf0.l, yuf0.m, yuf0.n);
            case 2:
                return ((kjz) yuf0Var.e).c(drawable, yuf0.o, yuf0.p, yuf0.q);
            case 3:
                return ((kjz) yuf0Var.e).c(drawable, yuf0.r, yuf0.s);
            default:
                return ((kjz) yuf0Var.e).c(drawable, yuf0.g, yuf0.h);
        }
    }
}
