package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityLifecycleExt.kt */
/* loaded from: classes17.dex */
public final class ga0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ l500 b;
    public final /* synthetic */ Activity c;

    public ga0(Activity activity, l500 l500Var) {
        this.b = l500Var;
        this.c = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.b.invoke();
        this.c.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
