package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.t;
import androidx.core.app.v;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.in_app_calls.calls.MicrophoneService;

/* loaded from: classes4.dex */
public abstract class dj7 {
    public static Notification a(Context context, String str, String str2, String str3, String str4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        f69 f69Var = xi7.a;
        f69.k("buildLegacyIncomingCallNotification", Collections.singletonList("CallNotificationBuilder"));
        try {
            v vVar = new v(context, "incoming_inapp_call");
            Notification notification = vVar.K;
            vVar.e = v.d(str);
            vVar.f = v.d(str2);
            notification.icon = m0h0.ic_phone_call;
            vVar.h = pendingIntent;
            vVar.a(0, str3, pendingIntent2);
            vVar.a(0, str4, pendingIntent3);
            vVar.m = 1;
            vVar.x = "call";
            vVar.i = pendingIntent;
            vVar.h(128, true);
            vVar.z = context.getColor(crg0.notification_icon_color);
            notification.deleteIntent = pendingIntent4;
            vVar.h(16, true);
            vVar.k(null);
            return vVar.b();
        } catch (Exception e) {
            xi7.a.m("buildLegacyIncomingCallNotification failed", e, Collections.singletonList("CallNotificationBuilder"));
            xi7.a.m("reportError: " + e, null, Collections.singletonList("Reporter"));
            g4j0.a("reportError", b.i(new Pair("error", e.toString()), new Pair("stacktrace", ljo.b(e))));
            v vVar2 = new v(context, "incoming_inapp_call");
            vVar2.f("Call");
            vVar2.e("Incoming call");
            vVar2.K.icon = m0h0.ic_phone_call;
            return vVar2.b();
        }
    }

    public static Notification b(MicrophoneService microphoneService, String str, String str2, String str3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        f69 f69Var = xi7.a;
        f69.k("buildLegacyOngoingCallNotification", Collections.singletonList("CallNotificationBuilder"));
        try {
            v vVar = new v(microphoneService, "ongoing_inapp_call");
            vVar.e = v.d(str);
            vVar.f = v.d(str2);
            vVar.K.icon = m0h0.ic_phone_call;
            vVar.h = pendingIntent;
            vVar.a(0, str3, pendingIntent2);
            vVar.h(2, true);
            vVar.z = microphoneService.getColor(crg0.notification_icon_color);
            vVar.n = false;
            vVar.l(new t.b());
            return vVar.b();
        } catch (Exception e) {
            xi7.a.m("buildLegacyOngoingCallNotification failed, falling back to legacy", e, Collections.singletonList("CallNotificationBuilder"));
            xi7.a.m("reportError: " + e, null, Collections.singletonList("Reporter"));
            g4j0.a("reportError", b.i(new Pair("error", e.toString()), new Pair("stacktrace", ljo.b(e))));
            v vVar2 = new v(microphoneService, "ongoing_inapp_call");
            vVar2.f("Call");
            vVar2.e("Ongoing call");
            vVar2.K.icon = m0h0.ic_phone_call;
            return vVar2.b();
        }
    }
}
