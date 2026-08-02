package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import kotlin.Pair;
import xsna.oz50;
import xsna.q0q0;

/* compiled from: UITrackingActivity.kt */
/* loaded from: classes.dex */
public final class fxp0 extends ja0 {
    public final uzp0 b;
    public final eu2 c;
    public final bb3 d;
    public final ro e;
    public final Stack<Pair<WeakReference<Activity>, UiTrackingScreen>> f;
    public WeakReference<Activity> g;
    public boolean h;
    public boolean i;

    public fxp0(Application application, uzp0 uzp0Var, eu2 eu2Var, bb3 bb3Var) {
        ro roVar = ro.d;
        this.b = uzp0Var;
        this.c = eu2Var;
        this.d = bb3Var;
        this.e = roVar;
        this.f = new Stack<>();
        application.registerActivityLifecycleCallbacks(this);
    }

    public final boolean e(Activity activity) {
        this.c.getClass();
        rsr rsrVar = oz50.k;
        if (epx.f(oz50.b.d(), activity.getClass())) {
            return true;
        }
        this.d.getClass();
        rsr rsrVar2 = oz50.k;
        if (rsrVar2 == null) {
            rsrVar2 = null;
        }
        rsrVar2.getClass();
        return epx.f(FragmentWrapperActivity.class, activity.getClass());
    }

    public final void f() {
        m0q0 m0q0Var;
        try {
            t1q0 t1q0Var = UiTracker.j;
            UiTrackingScreen uiTrackingScreen = t1q0Var.b;
            if (uiTrackingScreen != null) {
                UiTrackingScreen b = UiTrackingScreen.b(uiTrackingScreen, null, null, 15);
                WeakReference<m0q0> weakReference = b.c;
                if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
                    m0q0Var.y(b);
                }
                if (!b.c(uiTrackingScreen)) {
                    t1q0Var.e(b);
                }
                this.b.h.getClass();
                Preference.F(qni0.a(), "ui_tracking_store", "last_activity_timestamp");
                Preference.H("ui_tracking_store", "last_activity_screen", b.a.name());
            }
        } catch (Throwable th) {
            L.i(th);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (UiTracker.e().h(activity)) {
            return;
        }
        t1q0 t1q0Var = UiTracker.j;
        t1q0Var.f.b.add(new q0q0.a(activity.getClass()));
        L.e("UiTracker: onActivityCreated ".concat(activity.getClass().getSimpleName()));
        Class<?> cls = activity.getClass();
        this.c.invoke();
        boolean equals = cls.equals(MainActivity.class);
        Stack<Pair<WeakReference<Activity>, UiTrackingScreen>> stack = this.f;
        if (equals && stack.isEmpty()) {
            this.h = true;
        }
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.g = weakReference;
        stack.push(new Pair<>(weakReference, t1q0Var.b));
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i;
        if (UiTracker.e().h(activity)) {
            return;
        }
        ArrayList arrayList = UiTracker.j.f.b;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            } else if (epx.f(((q0q0.a) listIterator.previous()).a, activity.getClass())) {
                i = listIterator.nextIndex();
                break;
            }
        }
        arrayList.remove(i);
        L.e("UiTracker: onActivityDestroyed ".concat(activity.getClass().getSimpleName()));
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (UiTracker.e().h(activity)) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"UiTracker: onActivityPaused ".concat(activity.getClass().getSimpleName())});
        }
        if (e(activity) && this.e.i()) {
            f();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        WeakReference<Activity> weakReference;
        super.onActivityPostDestroyed(activity);
        WeakReference<Activity> weakReference2 = this.g;
        if (!activity.equals(weakReference2 != null ? weakReference2.get() : null) || (weakReference = this.g) == null) {
            return;
        }
        weakReference.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i;
        UiTrackingScreen f;
        UiTrackingScreen uiTrackingScreen;
        if (UiTracker.e().h(activity)) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        w0q0 w0q0Var = UiTracker.f;
        if (w0q0Var == null || !w0q0Var.a.b) {
            L.e("UiTracker: onActivityStarted ".concat(activity.getClass().getSimpleName()));
            Stack<Pair<WeakReference<Activity>, UiTrackingScreen>> stack = this.f;
            boolean z = (stack.isEmpty() || epx.f(stack.peek().i().get(), activity)) ? false : true;
            boolean z2 = this.i;
            this.i = false;
            q0q0 q0q0Var = UiTracker.j.f;
            ArrayList arrayList = q0q0Var.b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (epx.f(((q0q0.a) listIterator.previous()).a, activity.getClass())) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (z && arrayList.size() > 1 && i <= arrayList.size() - 2) {
                UiTrackingScreen uiTrackingScreen2 = ((q0q0.a) arrayList.get(i + 1)).b;
                UiTrackingScreen uiTrackingScreen3 = ((q0q0.a) arrayList.get(i)).b;
                t1q0 t1q0Var = q0q0Var.a;
                if (uiTrackingScreen2 != null && uiTrackingScreen3 != null) {
                    t1q0Var.c = uiTrackingScreen3;
                    t1q0Var.e(uiTrackingScreen2);
                }
            }
            if (z) {
                if (!z2 && !stack.isEmpty()) {
                    this.g = stack.pop().i();
                    UiTracker.i.g();
                }
            } else if (UiTracker.j.b != null) {
                if (activity instanceof o0q0) {
                    Fragment uiTrackingFragment = ((o0q0) activity).getUiTrackingFragment();
                    if (uiTrackingFragment != null) {
                        a2q0.a.getClass();
                        f = a2q0.c(uiTrackingFragment);
                    } else {
                        f = UiTrackingScreen.Companion.b(activity);
                    }
                } else {
                    a2q0.a.getClass();
                    Fragment a = a2q0.a(activity);
                    f = a != null ? UiTracker.e().f(a) : null;
                    if (f == null) {
                        f = UiTracker.e().c(activity);
                    }
                }
                if (!f.e()) {
                    UiTracker.i.j(f, true);
                } else if (!e(activity)) {
                    L.G("UiTracker: failed while tracking activity ".concat(activity.getClass().getSimpleName()));
                }
            }
            if (this.h) {
                return;
            }
            Class<?> cls = activity.getClass();
            this.d.invoke();
            if (!cls.equals(FragmentWrapperActivity.class) || (uiTrackingScreen = UiTracker.j.b) == null) {
                return;
            }
            this.b.c(uiTrackingScreen);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (UiTracker.e().h(activity)) {
            return;
        }
        L.e("UiTracker: onActivityStopped ".concat(activity.getClass().getSimpleName()));
        if (!e(activity) || this.e.i()) {
            return;
        }
        f();
    }
}
