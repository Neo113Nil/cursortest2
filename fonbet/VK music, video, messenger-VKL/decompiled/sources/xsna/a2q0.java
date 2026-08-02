package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;

/* compiled from: UiTrackingUtils.kt */
/* loaded from: classes.dex */
public final class a2q0 {
    public static final a2q0 a = new a2q0();

    public static Fragment a(Object obj) {
        Fragment fragment = null;
        if (obj instanceof o0q0) {
            Fragment uiTrackingFragment = ((o0q0) obj).getUiTrackingFragment();
            if (uiTrackingFragment == null) {
                if (obj instanceof Fragment) {
                    return (Fragment) obj;
                }
                return null;
            }
            fragment = uiTrackingFragment;
        } else if (obj instanceof Fragment) {
            fragment = (Fragment) obj;
        }
        return (!epx.f(fragment, obj) && (fragment instanceof o0q0)) ? a(fragment) : fragment;
    }

    public static UiTrackingScreen b(View view) {
        Fragment a2 = a(view);
        if (a2 != null) {
            UiTracker uiTracker = UiTracker.a;
            return UiTracker.e().f(a2);
        }
        UiTracker uiTracker2 = UiTracker.a;
        return UiTracker.e().e(view);
    }

    public static UiTrackingScreen c(Fragment fragment) {
        UiTrackingScreen uiTrackingScreen;
        Fragment a2 = a(fragment);
        if (a2 != null) {
            UiTracker uiTracker = UiTracker.a;
            uiTrackingScreen = UiTracker.e().f(a2);
        } else {
            uiTrackingScreen = null;
        }
        return uiTrackingScreen == null ? com.vk.core.ui.tracking.c.a(fragment) : uiTrackingScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UiTrackingScreen d(m0q0 m0q0Var) {
        if (m0q0Var instanceof Fragment) {
            return c((Fragment) m0q0Var);
        }
        if (m0q0Var instanceof View) {
            return b((View) m0q0Var);
        }
        if (!(m0q0Var instanceof Activity)) {
            if (m0q0Var instanceof Dialog) {
                return UiTracker.e().d((Dialog) m0q0Var);
            }
            return com.vk.core.ui.tracking.c.a(m0q0Var);
        }
        Activity activity = (Activity) m0q0Var;
        Fragment a2 = a(activity);
        UiTrackingScreen f = a2 != null ? UiTracker.e().f(a2) : null;
        return f == null ? UiTracker.e().c(activity) : f;
    }
}
