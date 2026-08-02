package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes10.dex */
final class ActivityRecreator$LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
    Object currentlyRecreatingToken;
    private Activity mActivity;
    private final int mRecreatingHashCode;
    private boolean mStarted = false;
    private boolean mDestroyed = false;
    private boolean mStopQueued = false;

    public ActivityRecreator$LifecycleCheckCallbacks(Activity activity) {
        this.mActivity = activity;
        this.mRecreatingHashCode = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.mActivity == activity) {
            this.mActivity = null;
            this.mDestroyed = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.mDestroyed || this.mStopQueued || this.mStarted) {
            return;
        }
        Object obj = this.currentlyRecreatingToken;
        int i = this.mRecreatingHashCode;
        try {
            Object obj2 = d.c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                d.f.postAtFrontOfQueue(new c(d.b.get(activity), obj2));
                this.mStopQueued = true;
                this.currentlyRecreatingToken = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.mActivity == activity) {
            this.mStarted = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
