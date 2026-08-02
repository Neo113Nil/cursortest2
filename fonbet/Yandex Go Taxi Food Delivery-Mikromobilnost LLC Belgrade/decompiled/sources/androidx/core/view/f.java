package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import defpackage.n751;
import defpackage.q651;
import defpackage.t651;
import defpackage.u651;
import defpackage.vih0;
import java.util.List;

/* loaded from: classes10.dex */
public final class f extends t651 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final FastOutLinearInInterpolator f = new FastOutLinearInInterpolator();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public f(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void f(View view, u651 u651Var) {
        e k = k(view);
        if (k != null) {
            k.onEnd(u651Var);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), u651Var);
            }
        }
    }

    public static void g(View view, u651 u651Var, n751 n751Var, boolean z) {
        e k = k(view);
        if (k != null) {
            k.mDispachedInsets = n751Var;
            if (!z) {
                k.onPrepare(u651Var);
                z = k.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), u651Var, n751Var, z);
            }
        }
    }

    public static void h(View view, n751 n751Var, List list) {
        e k = k(view);
        if (k != null) {
            n751Var = k.onProgress(n751Var, list);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), n751Var, list);
            }
        }
    }

    public static void i(View view, u651 u651Var, q651 q651Var) {
        e k = k(view);
        if (k != null) {
            k.onStart(u651Var, q651Var);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), u651Var, q651Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(vih0.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static e k(View view) {
        Object tag = view.getTag(vih0.tag_window_insets_animation_callback);
        if (tag instanceof WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener) {
            return ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener) tag).mCallback;
        }
        return null;
    }

    public static void l(View view, e eVar) {
        View.OnApplyWindowInsetsListener windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener = eVar != null ? new WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(view, eVar) : null;
        view.setTag(vih0.tag_window_insets_animation_callback, windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener);
        if (view.getTag(vih0.tag_compat_insets_dispatch) == null && view.getTag(vih0.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener);
        }
    }
}
