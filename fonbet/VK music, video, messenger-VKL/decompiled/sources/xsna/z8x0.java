package xsna;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLocks.kt */
/* loaded from: classes12.dex */
public final class z8x0 {
    public static final /* synthetic */ int a = 0;

    static {
        m100.d("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        synchronized (a9x0.a) {
            a9x0.b.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
