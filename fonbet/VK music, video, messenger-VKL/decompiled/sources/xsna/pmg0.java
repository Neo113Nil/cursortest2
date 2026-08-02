package xsna;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import xsna.bqx0;

/* compiled from: RootViewPager.kt */
/* loaded from: classes.dex */
public final class pmg0 implements u080 {
    public final Rect b = new Rect();
    public final /* synthetic */ qmg0 c;

    public pmg0(qmg0 qmg0Var) {
        this.c = qmg0Var;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        bqx0 l = iut0.l(view, bqx0Var);
        bqx0.q qVar = l.a;
        if (qVar.s()) {
            return l;
        }
        h4x i = qVar.i(519);
        int i2 = i.a;
        Rect rect = this.b;
        rect.left = i2;
        rect.top = i.b;
        rect.right = i.c;
        rect.bottom = i.d;
        qmg0 qmg0Var = this.c;
        int childCount = qmg0Var.getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            bqx0 c = iut0.c(qmg0Var.getChildAt(i3), l);
            h4x i4 = qVar.i(519);
            if (c.a.s()) {
                z = true;
            }
            int i5 = i4.a;
            int i6 = rect.left;
            if (i5 > i6) {
                i5 = i6;
            }
            rect.left = i5;
            int i7 = i4.b;
            int i8 = rect.top;
            if (i7 > i8) {
                i7 = i8;
            }
            rect.top = i7;
            int i9 = i4.c;
            int i10 = rect.right;
            if (i9 > i10) {
                i9 = i10;
            }
            rect.right = i9;
            int i11 = i4.d;
            int i12 = rect.bottom;
            if (i11 > i12) {
                i11 = i12;
            }
            rect.bottom = i11;
        }
        if (z) {
            return bqx0.b;
        }
        int i13 = Build.VERSION.SDK_INT;
        bqx0.h gVar = i13 >= 36 ? new bqx0.g(l) : i13 >= 35 ? new bqx0.f(l) : i13 >= 34 ? new bqx0.e(l) : i13 >= 31 ? new bqx0.d(l) : i13 >= 30 ? new bqx0.c(l) : i13 >= 29 ? new bqx0.b(l) : new bqx0.a(l);
        gVar.d(519, h4x.d(rect));
        return gVar.b();
    }
}
