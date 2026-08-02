package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.messaging.extension.view.ViewExtensionsKt$requestApplyInsetsWhenAttached$1;
import com.yandex.passport.sloth.ui.c0;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class ai91 {
    public static final q501 a = new q501(25);
    public static final gly0 b = new gly0();

    public static final m50 a(v40 v40Var, mfu mfuVar, c0 c0Var) {
        t50 activityResultRegistry;
        if (v40Var instanceof ComponentActivity) {
            return ((ComponentActivity) v40Var).getActivityResultRegistry().c(fga1.b(), mfuVar, c0Var);
        }
        if (!(v40Var instanceof Fragment)) {
            return v40Var instanceof ins0 ? ((ins0) v40Var).registerForActivityResult(mfuVar, c0Var) : v40Var.registerForActivityResult(mfuVar, c0Var);
        }
        Fragment fragment = (Fragment) v40Var;
        FragmentActivity activity = fragment.getActivity();
        return (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) ? fragment.registerForActivityResult(mfuVar, c0Var) : activityResultRegistry.c(fga1.b(), mfuVar, c0Var);
    }

    public static final void b(wls wlsVar, View view) {
        lcs lcsVar = new lcs(wlsVar);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(view, lcsVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewExtensionsKt$requestApplyInsetsWhenAttached$1());
        }
    }

    public static final void c(final View view, boolean z) {
        view.animate().cancel();
        if (!z) {
            view.setVisibility(8);
        } else {
            if (view.getVisibility() != 0) {
                return;
            }
            view.animate().alpha(0.0f).setInterpolator(new FastOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.messaging.extension.view.ViewExtensionsKt$hide$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    view.setVisibility(8);
                }
            }).start();
        }
    }

    public static void d(oza0 oza0Var, og7 og7Var) {
        oza0Var.d(Collections.singletonList(uxa0.a), og7Var);
    }

    public static void e(View view, boolean z) {
        if (z) {
            f(view, false);
        } else {
            c(view, false);
        }
    }

    public static final void f(View view, boolean z) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(1.0f);
            view.setVisibility(0);
        } else {
            if (view.getVisibility() != 0) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
            }
            view.animate().alpha(1.0f).setInterpolator(new FastOutSlowInInterpolator()).setListener(null).start();
        }
    }
}
