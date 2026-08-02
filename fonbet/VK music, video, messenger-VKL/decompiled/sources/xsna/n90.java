package xsna;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: ActivityExt.kt */
/* loaded from: classes.dex */
public final class n90 extends ja0 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ftg0 c;

    public n90(Activity activity, ftg0 ftg0Var) {
        this.b = activity;
        this.c = ftg0Var;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.b;
        if (activity.equals(activity2)) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c.a();
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.equals(this.b);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.equals(this.b);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.equals(this.b);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.equals(this.b);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.equals(this.b);
    }
}
