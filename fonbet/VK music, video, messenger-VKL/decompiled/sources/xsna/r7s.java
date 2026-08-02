package xsna;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vk.instantjobs.services.JobsForegroundService;

/* compiled from: ForegroundServiceWatchdog.kt */
/* loaded from: classes17.dex */
public final class r7s {

    /* compiled from: ForegroundServiceWatchdog.kt */
    public static final class a extends Exception {
        private final Throwable cause;

        public a(String str, Exception exc) {
            super(str);
            this.cause = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }
    }

    public static boolean a(JobsForegroundService jobsForegroundService, int i, Notification notification) {
        try {
            jobsForegroundService.startForeground(i, notification);
            return true;
        } catch (ForegroundServiceStartNotAllowedException e) {
            com.vk.metrics.eventtracking.b.a.q(e);
            return false;
        }
    }

    public static void b(Context context, Intent intent) {
        try {
            context.startForegroundService(intent);
        } catch (Exception e) {
            c63 c63Var = c63.a;
            if (c63.f) {
                throw e;
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            ComponentName component = intent.getComponent();
            bVar.q(new a(component != null ? component.getClassName() : null, e));
        }
    }
}
