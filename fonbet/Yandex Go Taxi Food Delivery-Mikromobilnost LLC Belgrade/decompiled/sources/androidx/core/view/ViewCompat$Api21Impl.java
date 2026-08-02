package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import defpackage.bx60;
import defpackage.n751;
import defpackage.np31;
import defpackage.vih0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ViewCompat$Api21Impl {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(vih0.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static n751 b(View view, n751 n751Var, Rect rect) {
        WindowInsets g = n751Var.g();
        if (g != null) {
            return n751.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return n751Var;
    }

    public static boolean c(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static ColorStateList d(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode e(View view) {
        return view.getBackgroundTintMode();
    }

    public static float f(View view) {
        return view.getElevation();
    }

    public static String g(View view) {
        return view.getTransitionName();
    }

    public static float h(View view) {
        return view.getTranslationZ();
    }

    public static float i(View view) {
        return view.getZ();
    }

    public static boolean j(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void k(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void l(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void m(View view, float f) {
        view.setElevation(f);
    }

    public static void n(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void o(final View view, final bx60 bx60Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = bx60Var != null ? new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat$Api21Impl.1
            n751 mLastInsets = null;

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                n751 h = n751.h(view2, windowInsets);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    ViewCompat$Api21Impl.a(windowInsets, view);
                    if (h.equals(this.mLastInsets)) {
                        return bx60Var.onApplyWindowInsets(view2, h).g();
                    }
                }
                this.mLastInsets = h;
                n751 onApplyWindowInsets = bx60Var.onApplyWindowInsets(view2, h);
                if (i >= 30) {
                    return onApplyWindowInsets.g();
                }
                WeakHashMap weakHashMap = b.a;
                np31.c(view2);
                return onApplyWindowInsets.g();
            }
        } : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(vih0.tag_on_apply_window_listener, onApplyWindowInsetsListener);
        }
        if (view.getTag(vih0.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (onApplyWindowInsetsListener != null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(vih0.tag_window_insets_animation_callback));
        }
    }

    public static void p(View view, String str) {
        view.setTransitionName(str);
    }

    public static void q(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void r(View view, float f) {
        view.setZ(f);
    }

    public static boolean s(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void t(View view) {
        view.stopNestedScroll();
    }
}
