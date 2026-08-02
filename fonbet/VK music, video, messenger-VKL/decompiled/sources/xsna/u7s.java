package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;

/* compiled from: ForegroundUiDetector.kt */
/* loaded from: classes.dex */
public final class u7s {
    public static final Handler c = new Handler(Looper.getMainLooper());
    public final jal a;
    public final HashSet<Integer> b;

    public u7s(Context context, jal jalVar) {
        this.a = jalVar;
        Application application = (Application) context.getApplicationContext();
        a aVar = new a();
        this.b = new HashSet<>();
        application.registerActivityLifecycleCallbacks(aVar);
    }

    public final void a(int i, boolean z) {
        HashSet<Integer> hashSet = this.b;
        boolean z2 = !hashSet.isEmpty();
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        if (z2 != (!hashSet.isEmpty())) {
            this.a.invoke(Boolean.valueOf(!hashSet.isEmpty()));
        }
    }

    /* compiled from: ForegroundUiDetector.kt */
    public final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int identityHashCode = System.identityHashCode(activity);
            u7s.c.removeCallbacksAndMessages(String.valueOf(System.identityHashCode(activity)));
            u7s.this.a(identityHashCode, true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int identityHashCode = System.identityHashCode(activity);
            String valueOf = String.valueOf(System.identityHashCode(activity));
            Handler handler = u7s.c;
            handler.removeCallbacksAndMessages(valueOf);
            final s7s s7sVar = new s7s(u7s.this, identityHashCode);
            handler.postDelayed(new Runnable() { // from class: xsna.t7s
                @Override // java.lang.Runnable
                public final void run() {
                    s7s.this.invoke();
                }
            }, valueOf, 1000L);
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
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
