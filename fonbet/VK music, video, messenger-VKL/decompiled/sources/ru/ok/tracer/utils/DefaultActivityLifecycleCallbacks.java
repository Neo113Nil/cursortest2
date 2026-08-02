package ru.ok.tracer.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: DefaultActivityLifecycleCallbacks.kt */
/* loaded from: classes11.dex */
public interface DefaultActivityLifecycleCallbacks extends Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(Activity activity);

    /* compiled from: DefaultActivityLifecycleCallbacks.kt */
    public static final class DefaultImpls {
        public static void onActivityDestroyed(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
        }

        public static void onActivityPaused(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
        }

        public static void onActivityResumed(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
        }

        public static void onActivityStarted(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
        }

        public static void onActivityStopped(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
        }

        public static void onActivityCreated(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity, Bundle bundle) {
        }

        public static void onActivitySaveInstanceState(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity, Bundle bundle) {
        }
    }
}
