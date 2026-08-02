package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
/* loaded from: classes.dex */
public final class txi0 implements Application.ActivityLifecycleCallbacks {
    public static final txi0 b = new txi0();
    public static boolean c;
    public static zti0 d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zti0 zti0Var = d;
        if (zti0Var != null) {
            zti0Var.b(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        s3q0 s3q0Var;
        zti0 zti0Var = d;
        if (zti0Var != null) {
            zti0Var.b(1);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
