package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.v;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes12.dex */
public final class md50 {
    public final nd50 a;
    public final zuj0 b;
    public ld50 c;

    public md50(nd50 nd50Var, zuj0 zuj0Var) {
        this.a = nd50Var;
        this.b = zuj0Var;
    }

    public final ld50 a() {
        ld50 ld50Var = this.c;
        if (ld50Var != null) {
            return ld50Var;
        }
        String h = ((avj0) this.b).h(kyh0.navigator_background_notification_active_title);
        nd50 nd50Var = this.a;
        if (nd50Var.f) {
            nd50Var.c.g("navigator_low", 2, ((avj0) nd50Var.b).h(kyh0.notification_channel_navigator_low), null, false);
            nd50Var.f = false;
        }
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.a = 172332;
        Context context = nd50Var.a;
        Intent intent = new Intent(context, (Class<?>) nd50Var.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        Uri.Builder builder2 = new Uri.Builder();
        ((pux0) nd50Var.e).getClass();
        builder2.scheme(pux0.c);
        builder2.authority("navigator");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent.setData(builder2.build()).setAction("android.intent.action.VIEW").addFlags(SelfTester_JCP.IMITA), 201326592);
        Pair pair = evu0.J("") ? new Pair(h, "") : new Pair(h, "");
        v i = nd50Var.c.i((String) pair.getFirst(), (String) pair.getSecond(), null, "navigator_low", activity, 0L);
        Notification notification = i.K;
        i.h(8, true);
        i.h(2, true);
        i.h(16, false);
        i.n = false;
        notification.when = 0L;
        i.x = Constants.KEY_SERVICE;
        i.m = 2;
        i.A = 1;
        i.H = 1800000L;
        i.g(0);
        ld50 ld50Var2 = new ld50(nd50Var.c.l(builder, i));
        this.c = ld50Var2;
        return ld50Var2;
    }
}
