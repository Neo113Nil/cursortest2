package xsna;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.receivers.NotificationDeleteReceiver;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseNotification.kt */
/* loaded from: classes5.dex */
public abstract class ri6 {
    public final Object b;

    /* compiled from: BaseNotification.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ri6) this.receiver).i();
            return s3q0.a;
        }
    }

    public ri6(Context context) {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new ks2(3, context, this));
    }

    public abstract Notification a();

    public Intent b() {
        int i = NotificationDeleteReceiver.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return NotificationDeleteReceiver.a.a(context, null, null, e(), f());
    }

    public abstract String c();

    public abstract Map<String, String> d();

    public abstract int e();

    public abstract String f();

    public void g(NotificationManager notificationManager) {
        try {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"[Push][Channels]: Wait for channel=" + c()});
            }
            x870 x870Var = x870.a;
            x870.a.c(c(), false, new k4(1, this, notificationManager), new a(0, this, ri6.class, "onNotificationChannelFailObtain", "onNotificationChannelFailObtain()V", 0));
        } catch (Exception e) {
            L.j(e, "Notification notify exception");
        }
        ca70 ca70Var = ca70.a;
        Preference.F(System.currentTimeMillis(), "notifications_prefs", "last_notification_timestamp");
    }

    public final void h(Context context) {
        g((NotificationManager) context.getSystemService("notification"));
    }

    public void i() {
    }

    public void j() {
    }
}
