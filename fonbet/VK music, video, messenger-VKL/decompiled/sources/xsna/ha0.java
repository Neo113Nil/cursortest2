package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityLifecycleExt.kt */
/* loaded from: classes17.dex */
public final class ha0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ l500 c;

    public ha0(Activity activity, l500 l500Var) {
        this.b = activity;
        this.c = l500Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2 = this.b;
        if (activity.equals(activity2)) {
            this.c.invoke();
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
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
