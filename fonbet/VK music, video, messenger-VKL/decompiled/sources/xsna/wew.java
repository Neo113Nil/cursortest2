package xsna;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;
import xsna.bqx0;
import xsna.iut0;
import xsna.oqx0;

/* compiled from: ImWindowInsetsController.kt */
/* loaded from: classes2.dex */
public final class wew {
    public final View a;
    public final View b;
    public final View c;
    public int d = 1;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public Integer i;
    public Integer j;
    public Integer k;

    public wew(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    public final boolean a(int i, FragmentActivity fragmentActivity) {
        int max;
        Integer num;
        Integer num2;
        if (this.g && fragmentActivity != null) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            bqx0 a = iut0.e.a(decorView);
            if (a == null) {
                max = 0;
            } else {
                bqx0.q qVar = a.a;
                max = Math.max(qVar.j(2).d, qVar.i(8).d);
            }
            bqx0 a2 = iut0.e.a(decorView);
            int i2 = a2 == null ? 0 : a2.a.i(8).d;
            Integer num3 = this.i;
            if (num3 == null || i != num3.intValue() || (num = this.j) == null || max != num.intValue() || (num2 = this.k) == null || i2 != num2.intValue()) {
                this.i = Integer.valueOf(i);
                this.j = Integer.valueOf(max);
                this.k = Integer.valueOf(i2);
                View view = this.a;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i3 = marginLayoutParams.topMargin;
                        marginLayoutParams.topMargin = i;
                        if (i != i3) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
                View view2 = this.b;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        int i4 = marginLayoutParams2.bottomMargin;
                        marginLayoutParams2.bottomMargin = max;
                        if (max != i4) {
                            view2.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.c;
                if (view3 == null) {
                    return true;
                }
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (marginLayoutParams3 == null) {
                    return true;
                }
                int i5 = marginLayoutParams3.bottomMargin;
                marginLayoutParams3.bottomMargin = i2;
                if (i2 == i5) {
                    return true;
                }
                view3.setLayoutParams(marginLayoutParams3);
                return true;
            }
        }
        return false;
    }

    public final void b(FragmentActivity fragmentActivity) {
        if (this.g && fragmentActivity != null) {
            Window window = fragmentActivity.getWindow();
            if (window != null) {
                oek0 oek0Var = new oek0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
                fVar.g(this.d);
                fVar.h(2);
            }
            View view = this.a;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = this.e;
                view.setLayoutParams(marginLayoutParams);
            }
            View view2 = this.b;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = this.f;
                view2.setLayoutParams(marginLayoutParams2);
            }
            View view3 = this.c;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.bottomMargin = 0;
                view3.setLayoutParams(marginLayoutParams3);
            }
            this.i = null;
            this.j = null;
            this.k = null;
            this.g = false;
        }
    }

    public final void c(FragmentActivity fragmentActivity) {
        Window window;
        if (fragmentActivity == null || (window = fragmentActivity.getWindow()) == null) {
            return;
        }
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        if (!this.h) {
            this.d = fVar.a();
            View view = this.a;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            this.e = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            View view2 = this.b;
            Object layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            this.f = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
            this.h = true;
        }
        fVar.g(2);
        fVar.b(2);
        this.g = true;
    }
}
