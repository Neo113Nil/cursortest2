package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.v;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes8.dex */
public final class o2o0 implements m2o0 {
    public final Context a;
    public final zuj0 b;
    public final xk60 c;
    public final y72 d;

    public o2o0(Context context, zuj0 zuj0Var, xk60 xk60Var, y72 y72Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = xk60Var;
        this.d = y72Var;
    }

    public final v b(ScootersNotificationType scootersNotificationType, CharSequence charSequence, CharSequence charSequence2) {
        c(scootersNotificationType);
        v i = this.c.i(charSequence2, charSequence, null, g(scootersNotificationType), null, 0L);
        i.r = g(scootersNotificationType);
        return i;
    }

    public final void c(ScootersNotificationType scootersNotificationType) {
        int i = n2o0.a[scootersNotificationType.ordinal()];
        zuj0 zuj0Var = this.b;
        if (i == 1) {
            this.c.g(g(scootersNotificationType), 2, ((avj0) zuj0Var).h(kyh0.scooters_notification_channel_system), null, false);
            return;
        }
        if (i == 2) {
            this.c.g(g(scootersNotificationType), 3, ((avj0) zuj0Var).h(kyh0.scooters_notification_channel_default), null, true);
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        this.c.g(g(scootersNotificationType), 4, ((avj0) zuj0Var).h(kyh0.scooters_notification_channel_important), null, true);
    }

    public final PendingIntent d(Uri uri) {
        Class a = this.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
        Context context = this.a;
        return PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) a).setAction("android.intent.action.VIEW").setData(uri).addFlags(SelfTester_JCP.IMITA), 201326592);
    }

    public final boolean e(ScootersNotificationType scootersNotificationType) {
        return this.c.a(g(scootersNotificationType));
    }

    public final Notification f(int i, v vVar) {
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.e(i);
        return this.c.l(builder, vVar);
    }

    public final String g(ScootersNotificationType scootersNotificationType) {
        int i = n2o0.a[scootersNotificationType.ordinal()];
        if (i == 1) {
            return "scooters_low";
        }
        if (i == 2) {
            return "scooters";
        }
        if (i == 3) {
            return "scooters_high";
        }
        w511.b();
        return null;
    }
}
