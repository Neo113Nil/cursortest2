package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* compiled from: ActivityLifecycleExt.kt */
/* loaded from: classes17.dex */
public final class ea0 {
    public static final void a(Activity activity, gzs<s3q0> gzsVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new a(activity, gzsVar));
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(new b(activity, gzsVar));
        }
    }

    /* compiled from: ActivityLifecycleExt.kt */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ Activity c;

        public a(Activity activity, gzs gzsVar) {
            this.b = gzsVar;
            this.c = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            this.b.invoke();
            this.c.unregisterActivityLifecycleCallbacks(this);
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
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    /* compiled from: ActivityLifecycleExt.kt */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ gzs<s3q0> c;

        public b(Activity activity, gzs<s3q0> gzsVar) {
            this.b = activity;
            this.c = gzsVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Activity activity2 = this.b;
            if (activity.equals(activity2)) {
                this.c.invoke();
                activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
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
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
