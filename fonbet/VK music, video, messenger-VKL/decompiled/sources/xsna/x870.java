package xsna;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.PushComponent;
import com.vk.pushes.exceptions.ChannelNotFoundException;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: NotificationChannelsController.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes.dex */
public final class x870 {
    public static v870 f;
    public static final x870 a = new x870();
    public static final List<gzs<s3q0>> b = dez0.b();
    public static volatile AtomicBoolean c = new AtomicBoolean(false);
    public static final aa70 d = new aa70();
    public static final bpn0 e = new bpn0(new r12(9));
    public static final bpn0 g = new bpn0(new s12(5));

    /* compiled from: NotificationChannelsController.kt */
    /* loaded from: classes5.dex */
    public static final class a implements w8i {
    }

    @TargetApi(26)
    public static void a(Context context) {
        if (gz80.a(26)) {
            ca70 ca70Var = ca70.a;
            NotificationManager f2 = ca70.f(context);
            f2.createNotificationChannelGroup(new NotificationChannelGroup("calls", context.getString(R.string.voip_notification_channel_calls_group)));
            NotificationChannel notificationChannel = new NotificationChannel("incoming_calls", context.getString(R.string.voip_notification_channel_calls_incoming), 4);
            notificationChannel.setGroup("calls");
            notificationChannel.setSound(null, null);
            f2.createNotificationChannel(notificationChannel);
            NotificationChannel notificationChannel2 = new NotificationChannel("ongoing_call", context.getString(R.string.voip_notification_channel_calls_ongoing), 2);
            notificationChannel2.setGroup("calls");
            f2.createNotificationChannel(notificationChannel2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(u870 u870Var, int i) {
        boolean z;
        boolean z2;
        List<gzs<s3q0>> list;
        x870 x870Var = a;
        boolean z3 = true;
        boolean z4 = (i & 2) == 0;
        L.e("[Push][Channels]: Start init channels");
        if (c.getAndSet(true)) {
            return;
        }
        synchronized (x870Var) {
            v870 v870Var = f;
            if (v870Var != null) {
                try {
                    z = etu.a((Handler) e.getValue(), v870Var);
                } catch (Exception e2) {
                    L.j(e2, "[Push][Channels]: Error while removing emergency timeout");
                    z = false;
                }
                if (z) {
                    L.e("[Push][Channels]: Remove emergency timeout");
                    ((Handler) e.getValue()).removeCallbacks(v870Var);
                }
                f = null;
                s3q0 s3q0Var = s3q0.a;
            }
        }
        ad0.k();
        if (!BuildInfo.s()) {
            io.reactivex.rxjava3.core.a a2 = d.a();
            io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
            a2.subscribe(dVar);
            dVar.b();
            L.e("[Push][Channels]: GDPR passed");
        }
        if (!gz80.a(26)) {
            com.vk.pushes.a.f();
            return;
        }
        z870.a();
        u870Var.getClass();
        if (u870Var.a()) {
            zqn0 zqn0Var = zqn0.a;
            if (!zqn0Var.e("messages") || !zqn0Var.d(RTCStatsConstants.KEY_CHANNELS)) {
                z2 = true;
                int i2 = com.vk.pushes.a.b;
                if (!z4 && !z2) {
                    z3 = false;
                }
                com.vk.pushes.a.b(u870Var, z3);
                L.e("[Push][Channels]: Channels created");
                z4g.d().P();
                list = b;
                if (!list.isEmpty()) {
                    Iterator<gzs<s3q0>> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                    b.clear();
                }
                c.getAndSet(false);
            }
        }
        z2 = false;
        int i22 = com.vk.pushes.a.b;
        if (!z4) {
            z3 = false;
        }
        com.vk.pushes.a.b(u870Var, z3);
        L.e("[Push][Channels]: Channels created");
        z4g.d().P();
        list = b;
        if (!list.isEmpty()) {
        }
        c.getAndSet(false);
    }

    public final y870 c(String str, boolean z, gzs gzsVar, gzs gzsVar2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (!gz80.a(26) || notificationManager.getNotificationChannel(str) != null) {
            gzsVar.invoke();
            return null;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder a2 = t33.a("[Push][Channels]: Could not find channelId=", str, ". Start timer and wait for initChannels(). PushSubscriber::debugAttempts=");
            a2.append(((PushComponent) g.getValue()).sc().e);
            L.u(l, logType, new Object[]{a2.toString()});
        }
        gzsVar2.invoke();
        com.vk.metrics.eventtracking.b.a.a(new ChannelNotFoundException(air.b(JwtParser.SEPARATOR_CHAR, "Could not find channel ", str)));
        synchronized (this) {
            try {
                if (f == null) {
                    v870 v870Var = new v870(0);
                    if (z) {
                        ((Handler) e.getValue()).post(v870Var);
                    } else {
                        ((Handler) e.getValue()).postDelayed(v870Var, 3000L);
                    }
                    f = v870Var;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        b.add(gzsVar);
        return new y870(gzsVar);
    }
}
