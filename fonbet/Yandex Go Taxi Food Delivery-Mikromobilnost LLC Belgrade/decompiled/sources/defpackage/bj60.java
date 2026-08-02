package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import defpackage.j3b;
import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import kotlin.jvm.internal.PropertyReference0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class bj60 {
    public final m5g0 a;
    public final x22 b;
    public final o1b0 c;
    public final w3c d;
    public final sls e;
    public final sls f;
    public final boolean g;
    public final i3y h;

    public bj60(m5g0 m5g0Var, x22 x22Var, o1b0 o1b0Var, w3c w3cVar, sls slsVar, sls slsVar2, boolean z, final sls slsVar3) {
        this.a = m5g0Var;
        this.b = x22Var;
        this.c = o1b0Var;
        this.d = w3cVar;
        this.e = slsVar;
        this.f = slsVar2;
        this.g = z;
        this.h = a.a(new sls() { // from class: com.yandex.messaging.internal.authorized.chat.notifications.e
            @Override // defpackage.sls
            public final Object invoke() {
                return ((j3b) ((ChatNotificationPublisher$publishReporter$3) sls.this).invoke()).N;
            }
        });
    }

    public static void c(bj60 bj60Var, String str) {
        bj60Var.b.reportEvent(str, b.n(bj60Var.a(), b.f()));
    }

    public final LinkedHashMap a() {
        Map f;
        Map f2;
        Pair pair = new Pair("chat id", this.c.b);
        Pair pair2 = new Pair(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, ((PropertyReference0) this.e).get());
        m5g0 m5g0Var = this.a;
        Map i = b.i(pair, pair2, new Pair("from_xiva_push", Boolean.valueOf(m5g0Var != null)), new Pair("is_inapp", Boolean.valueOf(this.g)));
        if (m5g0Var != null) {
            Pair pair3 = new Pair("transit_id", m5g0Var.a);
            this.d.getClass();
            f = b.i(pair3, new Pair("handle_time", Long.valueOf(SystemClock.elapsedRealtime() - m5g0Var.b)), new Pair("handle_time_uptime", Long.valueOf(SystemClock.uptimeMillis() - m5g0Var.c)));
        } else {
            f = b.f();
        }
        LinkedHashMap n = b.n(i, f);
        try {
            f2 = b.i(new Pair("chat type", (String) this.h.getValue()), new Pair("channel_id", ((PropertyReference0) this.f).get()));
        } catch (Exception unused) {
            f2 = b.f();
        }
        return b.n(n, f2);
    }

    public final void b(String str, Throwable th) {
        LinkedHashMap n = b.n(a(), gw00.e(new Pair(Constants.KEY_EXCEPTION, th)));
        x22 x22Var = this.b;
        x22Var.reportEvent(str, n);
        x22Var.reportError(str, th);
    }

    public final void d(String str, long[] jArr) {
        String str2 = null;
        Pair pair = new Pair("messages_count", jArr != null ? Integer.valueOf(jArr.length) : null);
        if (jArr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (long j : jArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) Extension.FIX_SPACE);
                }
                sb.append((CharSequence) String.valueOf(j));
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        }
        this.b.reportEvent(str, b.n(a(), b.i(pair, new Pair("message_timestamps", str2))));
    }

    public final void e(String str) {
        this.b.reportEvent("notification_not_show", b.n(a(), g8e.z(CRLReasonCodeExtension.REASON, str)));
    }
}
