package defpackage;

import android.view.ViewGroup;

/* loaded from: classes11.dex */
public abstract class jgb1 {
    public static au2 a;

    public static float a(float f, float f2, int i) {
        return (Math.max(0, i - 1) * f2) + f;
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? (f2 / 2.0f) + f : f;
    }

    public static final int c(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int d(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final au2 e() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("LocationLive", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        long j = iq2.g;
        a6t0 a6t0Var = new a6t0(j);
        uq90 e = nnm.e(12.0f, 1.0f);
        e.b(11.0f, 11.0f, false, true, 11.0f, 11.0f);
        e.g(-2.0f);
        e.b(9.0f, 9.0f, false, false, -9.0f, -9.0f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        a6t0 a6t0Var2 = new a6t0(j);
        uq90 e2 = nnm.e(12.0f, 5.0f);
        e2.b(7.0f, 7.0f, false, true, 7.0f, 7.0f);
        e2.g(-2.0f);
        e2.b(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        e2.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", e2.a);
        a6t0 a6t0Var3 = new a6t0(j);
        uq90 uq90Var = new uq90();
        uq90Var.j(6.1f, 17.9f);
        uq90Var.h(1.0f, 16.0f);
        uq90Var.p(-1.0f);
        uq90Var.i(12.23f, -5.0f);
        uq90Var.i(0.77f, 0.77f);
        uq90Var.h(9.0f, 23.0f);
        uq90Var.f(8.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final int f(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int g(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static float h(float f, float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f;
    }
}
