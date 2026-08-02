package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.app.w0;
import androidx.core.app.x0;
import com.yandex.voip_calls.calls_go.IncomingCallAction;
import com.yandex.voip_calls.calls_go.NotificationActionReceiver;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class ll7 {
    public final NotificationManager a;
    public final Context b;

    public ll7(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
        this.b = context.getApplicationContext();
    }

    public final void a(String str) {
        q501 q501Var = nl7.b;
        Context context = this.b;
        PendingIntent activity = PendingIntent.getActivity(context, 0, q501.v(context), SelfTester_JCP.DECRYPT_CBC);
        v vVar = new v(context, "inapp_call");
        int i = m0h0.ic_inapp_call_notification;
        Notification notification = vVar.K;
        notification.icon = i;
        vVar.m = 2;
        vVar.n = false;
        vVar.z = -256;
        Intent intent = new Intent(context, (Class<?>) NotificationActionReceiver.class);
        intent.setAction(IncomingCallAction.DELETE.getAction());
        notification.deleteIntent = PendingIntent.getBroadcast(context, 0, intent, 301989888);
        notification.vibrate = new long[0];
        vVar.x = "call";
        vVar.i = activity;
        vVar.h(128, true);
        w0 w0Var = new w0();
        w0Var.a = str;
        x0 a = w0Var.a();
        IncomingCallAction incomingCallAction = IncomingCallAction.ANSWER;
        Intent v = q501.v(context);
        v.setAction(incomingCallAction.getAction());
        PendingIntent activity2 = PendingIntent.getActivity(context, incomingCallAction.ordinal(), v, 301989888);
        Intent intent2 = new Intent(context, (Class<?>) NotificationActionReceiver.class);
        intent2.setAction(IncomingCallAction.DECLINE.getAction());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 301989888);
        t.c cVar = new t.c();
        if (TextUtils.isEmpty(a.a)) {
            ny61.g("person must have a non-empty a name");
            return;
        }
        cVar.e = 1;
        cVar.f = a;
        cVar.g = activity2;
        cVar.h = broadcast;
        vVar.l(cVar);
        Notification b = vVar.b();
        if (qke.h(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        try {
            this.a.notify(228, b);
        } catch (Exception unused) {
        }
    }

    public final void b(String str, String str2) {
        q501 q501Var = nl7.b;
        Context context = this.b;
        PendingIntent activity = PendingIntent.getActivity(context, 0, q501.v(context), SelfTester_JCP.DECRYPT_CBC);
        v vVar = new v(context, "inapp_call");
        int i = m0h0.ic_inapp_call_notification;
        Notification notification = vVar.K;
        notification.icon = i;
        vVar.h(2, true);
        vVar.x = "call";
        vVar.o = true;
        vVar.r = "inapp_call";
        vVar.h = activity;
        vVar.h(16, false);
        vVar.L = true;
        vVar.e = v.d(str);
        vVar.f = v.d(str2);
        notification.when = System.currentTimeMillis();
        Notification b = vVar.b();
        if (qke.h(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        try {
            this.a.notify(228, b);
        } catch (Exception unused) {
        }
    }
}
