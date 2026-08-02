package xsna;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class nq01 {

    @Nullable
    public static nq01 e;
    public final Context a;
    public final ScheduledExecutorService b;
    public dm01 c = new dm01(this);
    public int d = 1;

    public nq01(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized nq01 a(Context context) {
        nq01 nq01Var;
        synchronized (nq01.class) {
            try {
                if (e == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    e = new nq01(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new zt50("MessengerIpcClient"))));
                }
                nq01Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nq01Var;
    }

    public final synchronized Task b(uo01 uo01Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(uo01Var.toString());
            }
            if (!this.c.m(uo01Var)) {
                dm01 dm01Var = new dm01(this);
                this.c = dm01Var;
                dm01Var.m(uo01Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return uo01Var.b.getTask();
    }
}
