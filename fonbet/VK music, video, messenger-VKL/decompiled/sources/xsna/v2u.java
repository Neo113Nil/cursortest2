package xsna;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class v2u {
    public static final Object a = new Object();

    @Nullable
    public static do01 b = null;

    @Nullable
    public static HandlerThread c = null;
    public static boolean d = false;

    @NonNull
    public static do01 a(@NonNull Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    if (!d) {
                        context.getPackageName();
                        d = true;
                    }
                    b = new do01(context.getApplicationContext(), d ? b().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @NonNull
    public static HandlerThread b() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return c;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ConnectionResult c(fm01 fm01Var, a801 a801Var, String str, @Nullable Executor executor);

    public abstract void d(fm01 fm01Var, ServiceConnection serviceConnection);
}
