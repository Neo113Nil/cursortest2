package ru.ok.tracer;

import android.app.Activity;
import android.os.Bundle;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks;

/* compiled from: TracerActivityLifecycleCallbacks.kt */
/* loaded from: classes11.dex */
public final class TracerActivityLifecycleCallbacks implements DefaultActivityLifecycleCallbacks {
    private int startedActivityCount;
    private final SessionStateStorage stateStorage;

    public TracerActivityLifecycleCallbacks(SessionStateStorage sessionStateStorage) {
        this.stateStorage = sessionStateStorage;
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.startedActivityCount == 0) {
            this.stateStorage.setCurrentlyInBackground$tracer_commons_release(false);
        }
        this.startedActivityCount++;
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.startedActivityCount - 1;
        this.startedActivityCount = i;
        if (i == 0) {
            this.stateStorage.setCurrentlyInBackground$tracer_commons_release(true);
        }
    }
}
