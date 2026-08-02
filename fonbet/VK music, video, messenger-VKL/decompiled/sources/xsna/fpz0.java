package xsna;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class fpz0 implements Executor {
    public static volatile fpz0 b;
    public static Context c;

    public static fpz0 a(Context context) {
        fpz0 fpz0Var;
        fpz0 fpz0Var2 = b;
        if (fpz0Var2 != null) {
            return fpz0Var2;
        }
        synchronized (fpz0.class) {
            try {
                fpz0Var = b;
                if (fpz0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    exc0.i(applicationContext);
                    c = applicationContext;
                    fpz0Var = new fpz0();
                    b = fpz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fpz0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dpz0.a.post(runnable);
    }
}
