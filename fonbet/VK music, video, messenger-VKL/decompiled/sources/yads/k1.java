package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import xsna.g5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class k1 implements Application.ActivityLifecycleCallbacks {
    public final o1 a;

    public k1(o1 o1Var) {
        this.a = o1Var;
    }

    public final Activity a() {
        Activity activity;
        o1 o1Var = this.a;
        synchronized (o1Var) {
            g5g.D(o1Var.a, true, m1.b);
            WeakReference weakReference = (WeakReference) j5g.a0(o1Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        o1 o1Var = this.a;
        synchronized (o1Var) {
            g5g.D(o1Var.a, true, n1.b);
            WeakReference weakReference = (WeakReference) j5g.k0(o1Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
