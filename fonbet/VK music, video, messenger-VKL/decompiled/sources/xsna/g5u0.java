package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: VisibleActivityDetector.kt */
/* loaded from: classes.dex */
public final class g5u0 {
    public final HashSet<Integer> a;
    public final Handler b;
    public final CopyOnWriteArrayList<izs<Boolean, s3q0>> c;

    public g5u0(Context context) {
        a aVar = new a();
        this.a = new HashSet<>();
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList<>();
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(aVar);
    }

    public final void a(int i, boolean z) {
        boolean b = b();
        HashSet<Integer> hashSet = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        boolean b2 = b();
        if (b != b2) {
            Iterator<izs<Boolean, s3q0>> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.valueOf(b2));
            }
        }
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    /* compiled from: VisibleActivityDetector.kt */
    public final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int identityHashCode = System.identityHashCode(activity);
            String valueOf = String.valueOf(System.identityHashCode(activity));
            g5u0 g5u0Var = g5u0.this;
            g5u0Var.b.removeCallbacksAndMessages(valueOf);
            g5u0Var.a(identityHashCode, true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int identityHashCode = System.identityHashCode(activity);
            String valueOf = String.valueOf(System.identityHashCode(activity));
            g5u0 g5u0Var = g5u0.this;
            Handler handler = g5u0Var.b;
            handler.removeCallbacksAndMessages(valueOf);
            handler.postDelayed(new x560(new f5u0(g5u0Var, identityHashCode), 1), valueOf, 1000L);
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
