package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.NetworkStateReceiver;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultApiProfiler.kt */
/* loaded from: classes11.dex */
public final class ial implements uz2 {
    public static final Set<String> a = rl3.y0(new String[]{"stats.", "statEvents.", "auth."});

    public static void d(String str, Throwable th) {
        if (th == null) {
            return;
        }
        L.g("Error ".concat(str), th);
        o2l.a.getClass();
        if (o2l.b("__dbg_api_errors", false)) {
            cvk.w("Error api: method=" + str + ", message=" + th.toString(), false);
        }
    }

    @Override // xsna.uz2
    public final void a(String str, String str2) {
        d(str, new Throwable("NetworkError: host=".concat(str2)));
        if (str.equals("queue.subscribe") || brm0.v(str, "subscribeToQueue", false)) {
            return;
        }
        Set<String> set = a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (brm0.B(str, (String) it.next(), false)) {
                    return;
                }
            }
        }
        String h = DevNullEventKey.NET_API_ERRORS.h();
        com.vk.core.utils.newtork.b.a.getClass();
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, str, Integer.valueOf(com.vk.core.utils.newtork.b.d() ? 1 : 0), str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    @Override // xsna.uz2
    public final void b(Exception exc, String str) {
        String str2;
        if (exc == null || !NetworkStateReceiver.b()) {
            return;
        }
        d(str, exc);
        VKApiExecutionException vKApiExecutionException = exc instanceof VKApiExecutionException ? (VKApiExecutionException) exc : null;
        if (vKApiExecutionException != null && vKApiExecutionException.s() == -3) {
            long currentTimeMillis = System.currentTimeMillis() - ow90.e.d;
            int s = vKApiExecutionException.s();
            String A = vKApiExecutionException.A();
            if (A == null) {
                A = "";
            }
            String t = vKApiExecutionException.t();
            String str3 = t.length() == 0 ? null : t;
            String h = DevNullEventKey.API_ERRORS.h();
            int i = (int) currentTimeMillis;
            if (i <= 0) {
                i = 0;
            }
            if (str3 != null) {
                str2 = "{\"error_message\":\"" + erm0.D0(900, t) + "\"}";
            } else {
                str2 = null;
            }
            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, str2, str, Integer.valueOf(s), A, Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, 3, null);
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = schemeStat$TypeDevNullItem;
            l5mVar.q();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("PERF.ERROR.REQUEST_ERROR");
        b.c("error_type", exc.getClass().getSimpleName());
        b.c("method", str);
        bVar.k(b.e());
    }

    @Override // xsna.uz2
    public final void c(long j, String str, String str2) {
        d(str, new Throwable("ApiError: host=" + str2 + ", times=" + j));
    }
}
