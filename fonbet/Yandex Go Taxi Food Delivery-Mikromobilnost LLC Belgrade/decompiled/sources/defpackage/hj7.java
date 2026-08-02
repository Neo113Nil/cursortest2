package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.in_app_calls.calls.CallReceiver;
import ru.yandex.in_app_calls.calls.MicrophoneService;

/* loaded from: classes4.dex */
public final class hj7 implements ca20, oey {
    public static hj7 w;
    public final Context a;
    public final ej7 b;
    public final ea20 c;

    public hj7(Context context, tt5 tt5Var) {
        this.a = context;
        this.b = new ej7(context);
        ea20 ea20Var = new ea20(tt5Var, "call_notification_manager");
        this.c = ea20Var;
        f69 f69Var = xi7.a;
        f69.k("init", Collections.singletonList("CallNotificationManagerHandler"));
        w = this;
        ea20Var.b(this);
    }

    public final void a(x920 x920Var, ba20 ba20Var) {
        f69 f69Var = xi7.a;
        f69.k("handleCreateNotificationChannels", Collections.singletonList("CallNotificationManagerHandler"));
        String str = (String) x920Var.a("ongoingCallChannelName");
        if (str == null) {
            str = "Ongoing calls";
        }
        String str2 = (String) x920Var.a("incomingCallChannelName");
        if (str2 == null) {
            str2 = "Incoming calls";
        }
        f69.k("createIncomingCallChannel", Collections.singletonList("CallNotificationBuilder"));
        NotificationChannel notificationChannel = new NotificationChannel("incoming_inapp_call", str2, 4);
        notificationChannel.setShowBadge(false);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.enableVibration(true);
        notificationChannel.enableLights(true);
        notificationChannel.setBypassDnd(true);
        notificationChannel.setSound(null, null);
        Context context = this.a;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        f69.k("createOngoingCallChannel", Collections.singletonList("CallNotificationBuilder"));
        NotificationChannel notificationChannel2 = new NotificationChannel("ongoing_inapp_call", str, 2);
        notificationChannel2.setShowBadge(false);
        notificationChannel2.setLockscreenVisibility(1);
        Object systemService2 = context.getSystemService("notification");
        NotificationManager notificationManager2 = systemService2 instanceof NotificationManager ? (NotificationManager) systemService2 : null;
        if (notificationManager2 != null) {
            notificationManager2.createNotificationChannel(notificationChannel2);
        }
        Object systemService3 = context.getSystemService("notification");
        NotificationManager notificationManager3 = systemService3 instanceof NotificationManager ? (NotificationManager) systemService3 : null;
        if (notificationManager3 == null) {
            xi7.a.m("Failed to get NotificationManager", null, Collections.singletonList("CallNotificationBuilder"));
        } else if (notificationManager3.getNotificationChannel("inapp_call") == null) {
            xi7.a.m("Channel 'inapp_call' does not exist", null, Collections.singletonList("CallNotificationBuilder"));
        } else {
            notificationManager3.deleteNotificationChannel("inapp_call");
            f69.k("Successfully deleted channel 'inapp_call'", Collections.singletonList("CallNotificationBuilder"));
        }
        ba20Var.success(null);
    }

    public final void b(ba20 ba20Var) {
        MicrophoneService microphoneService;
        f69 f69Var = xi7.a;
        f69.k("handleHideOngoingCall", Collections.singletonList("CallNotificationManagerHandler"));
        ej7 ej7Var = this.b;
        ej7Var.getClass();
        f69.k("hideOngoingCall", Collections.singletonList("CallNotificationManager"));
        ej7Var.c = false;
        MicrophoneService.Companion.getClass();
        microphoneService = MicrophoneService.instance;
        if (microphoneService != null) {
            microphoneService.stopForeground();
        }
        ba20Var.success(null);
    }

    public final void c(x920 x920Var, ba20 ba20Var) {
        Notification a;
        Notification.CallStyle forIncomingCall;
        String str = (String) x920Var.a("title");
        String str2 = str == null ? "" : str;
        String str3 = (String) x920Var.a("subtitle");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) x920Var.a("accept");
        String str5 = str4 == null ? "" : str4;
        String str6 = (String) x920Var.a("decline");
        String str7 = str6 == null ? "" : str6;
        String str8 = (String) x920Var.a("pushId");
        String str9 = str8 != null ? str8 : "";
        f69 f69Var = xi7.a;
        StringBuilder v = b64.v("handleShowIncomingCall title: ", str2, ", subtitle: ", str3, " pushId: ");
        v.append(str9);
        f69.k(v.toString(), Collections.singletonList("CallNotificationManagerHandler"));
        ej7 ej7Var = this.b;
        ej7Var.getClass();
        f69.k("showIncomingCall", Collections.singletonList("CallNotificationManager"));
        Context context = ej7Var.a;
        f69.k("buildIncomingCallNotification", Collections.singletonList("CallNotificationBuilder"));
        PendingIntent activity = PendingIntent.getActivity(context, 0, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 201326592);
        Intent intent = new Intent(CallReceiver.ACTION_ACCEPT);
        intent.setClass(context, CallReceiver.class);
        intent.setPackage(context.getPackageName());
        intent.putExtra("pushId", str9);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        Intent intent2 = new Intent(CallReceiver.ACTION_DECLINE);
        intent2.setClass(context, CallReceiver.class);
        intent2.setPackage(context.getPackageName());
        intent2.putExtra("pushId", str9);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent2, 201326592);
        Intent intent3 = new Intent(CallReceiver.ACTION_DISMISS);
        intent3.setClass(context, CallReceiver.class);
        intent3.setPackage(context.getPackageName());
        intent3.putExtra("pushId", str9);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent3, 201326592);
        if (evu0.J(str3)) {
            dab1.q("incomingCallNotificationSubtitleIsEmpty");
            str3 = "Incoming call";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Person build = new Person.Builder().setName(str3).setImportant(true).build();
                Notification.Builder smallIcon = new Notification.Builder(context, "incoming_inapp_call").setContentText(str2).setSmallIcon(m0h0.ic_phone_call);
                forIncomingCall = Notification.CallStyle.forIncomingCall(build, broadcast2, broadcast);
                a = smallIcon.setStyle(forIncomingCall).setContentIntent(activity).setColor(context.getColor(crg0.notification_icon_color)).setCategory("call").setFullScreenIntent(activity, true).setDeleteIntent(broadcast3).setAutoCancel(true).build();
            } catch (Exception e) {
                xi7.a.m("buildIncomingCallNotification failed, falling back to legacy", e, Collections.singletonList("CallNotificationBuilder"));
                xi7.a.m("reportError: " + e, null, Collections.singletonList("Reporter"));
                g4j0.a("reportError", b.i(new Pair("error", e.toString()), new Pair("stacktrace", ljo.b(e))));
                a = dj7.a(context, str2, str3, str5, str7, activity, broadcast, broadcast2, broadcast3);
            }
        } else {
            a = dj7.a(context, str2, str3, str5, str7, activity, broadcast, broadcast2, broadcast3);
        }
        ej7Var.e.notify(MicrophoneService.NOTIFICATION_ID, a);
        ej7Var.d = true;
        ba20Var.success(null);
    }

    public final void d(x920 x920Var, ba20 ba20Var) {
        String str = (String) x920Var.a("title");
        if (str == null) {
            str = "";
        }
        String str2 = (String) x920Var.a("subtitle");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) x920Var.a("hangup");
        String str4 = str3 != null ? str3 : "";
        f69 f69Var = xi7.a;
        f69.k(b64.l("handleShowOngoingCall title: ", str, ", subtitle: ", str2), Collections.singletonList("CallNotificationManagerHandler"));
        fj7 fj7Var = new fj7(ba20Var, 0);
        gj7 gj7Var = new gj7(ba20Var, 0);
        ej7 ej7Var = this.b;
        Context context = ej7Var.a;
        f69.k("showOngoingCall", Collections.singletonList("CallNotificationManager"));
        ej7Var.a();
        if (ej7Var.b()) {
            f69.k("service is running", Collections.singletonList("CallNotificationManager"));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MicrophoneService.class);
        intent.putExtra("title", str);
        intent.putExtra("subtitle", str2);
        intent.putExtra("hangup", str4);
        try {
            MicrophoneService.Companion.getClass();
            Object systemService = context.getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null && notificationManager.getNotificationChannel("ongoing_inapp_call") != null) {
                if (ej7Var.b) {
                    f69.k("context.startService", Collections.singletonList("CallNotificationManager"));
                    context.startService(intent);
                } else {
                    f69.k("context.startForegroundService", Collections.singletonList("CallNotificationManager"));
                    context.startForegroundService(intent);
                }
                MicrophoneService.onStarted = fj7Var;
                MicrophoneService.onError = gj7Var;
                return;
            }
            gj7Var.invoke(new IllegalStateException("Can't start MicrophoneService: notification channel not exists"));
        } catch (Throwable th) {
            f69 f69Var2 = xi7.a;
            xi7.a.m("startForegroundService failed: " + th, null, Collections.singletonList("CallNotificationManager"));
            ej7Var.c = true;
            gj7Var.invoke(th);
        }
    }

    public final void f(String str, Map map) {
        f69 f69Var = xi7.a;
        f69.k("sendEvent name:" + str + " arguments: " + map, Collections.singletonList("CallNotificationManagerHandler"));
        this.c.a(str, map, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        try {
            String str = x920Var.a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -282102537:
                        if (!str.equals("createNotificationChannels")) {
                            break;
                        } else {
                            a(x920Var, (ba20) da20Var);
                            return;
                        }
                    case 776600892:
                        if (!str.equals("showOngoingCall")) {
                            break;
                        } else {
                            d(x920Var, (ba20) da20Var);
                            return;
                        }
                    case 1082851137:
                        if (!str.equals("showIncomingCall")) {
                            break;
                        } else {
                            c(x920Var, (ba20) da20Var);
                            return;
                        }
                    case 1771785687:
                        if (!str.equals("hideOngoingCall")) {
                            break;
                        } else {
                            b((ba20) da20Var);
                            return;
                        }
                    case 1868808710:
                        if (!str.equals("hideIncomingCall")) {
                            break;
                        } else {
                            f69 f69Var = xi7.a;
                            f69.k("handleHideIncomingCall", Collections.singletonList("CallNotificationManagerHandler"));
                            this.b.a();
                            ((ba20) da20Var).success(null);
                            return;
                        }
                }
            }
            ((ba20) da20Var).notImplemented();
        } catch (Exception e) {
            ((ba20) da20Var).error("UNKNOWN_ERROR", e.getMessage(), e);
        }
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        f69 f69Var = xi7.a;
        f69.k("onPause", Collections.singletonList("CallNotificationManagerHandler"));
        ej7 ej7Var = this.b;
        ej7Var.getClass();
        f69.k("onActivityPause", Collections.singletonList("CallNotificationManager"));
        ej7Var.b = false;
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        f69 f69Var = xi7.a;
        f69.k("onResume", Collections.singletonList("CallNotificationManagerHandler"));
        ej7 ej7Var = this.b;
        Context context = ej7Var.a;
        boolean z = ej7Var.b;
        boolean z2 = ej7Var.c;
        boolean b = ej7Var.b();
        StringBuilder u = qv10.u("onActivityResume isActivityResumed: ", " shouldStartOnResume: ", " isServiceRunning: ", z, z2);
        u.append(b);
        f69.k(u.toString(), Collections.singletonList("CallNotificationManager"));
        ej7Var.b = true;
        if (ej7Var.c) {
            if (!ej7Var.b()) {
                context.startService(new Intent(context, (Class<?>) MicrophoneService.class));
            }
            ej7Var.c = false;
        }
    }
}
