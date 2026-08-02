package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class j1 {
    public static final j1 a = new j1();
    public static k1 b;

    public static final void a(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        k1 k1Var = new k1(new o1(activity));
                        b = k1Var;
                        application.registerActivityLifecycleCallbacks(k1Var);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Activity a() {
        Activity a2;
        synchronized (a) {
            k1 k1Var = b;
            a2 = k1Var != null ? k1Var.a() : null;
        }
        return a2;
    }
}
