package xsna;

import android.app.NotificationManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class zkz0 implements Runnable {
    public final /* synthetic */ jlz0 b;

    public zkz0(jlz0 jlz0Var) {
        this.b = jlz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jlz0 jlz0Var = this.b;
        com.google.android.gms.common.a aVar = jlz0Var.d;
        Context context = jlz0Var.c;
        aVar.getClass();
        if (fau.a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }
}
