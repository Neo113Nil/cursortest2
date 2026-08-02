package xsna;

import android.os.SystemClock;
import com.vk.core.apps.BuildInfo;
import com.vk.metrics.eventtracking.Event;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Interceptor;
import xsna.c63;

/* compiled from: UndesirableBackgroundTrafficInterceptor.kt */
/* loaded from: classes.dex */
public final class x2q0 implements Interceptor, uz80 {
    public static final x2q0 a = new x2q0();
    public static final long b;
    public static final long c;
    public static final AtomicLong d;
    public static final AtomicLong e;

    /* compiled from: UndesirableBackgroundTrafficInterceptor.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void u() {
            AtomicLong atomicLong = x2q0.d;
            x2q0 x2q0Var = x2q0.a;
            atomicLong.set(SystemClock.elapsedRealtime() + x2q0.c);
            x2q0.e.set(SystemClock.elapsedRealtime() + x2q0.b);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = timeUnit.toMillis(60L);
        c = timeUnit.toMillis(15L);
        d = new AtomicLong();
        e = new AtomicLong();
        c63 c63Var = c63.a;
        c63.a(new a());
    }

    public static void a(Interceptor.a aVar) {
        c63 c63Var = c63.a;
        if (c63.f) {
            return;
        }
        Object c2 = aVar.request().c(Map.class);
        Map map = c2 instanceof Map ? (Map) c2 : null;
        if (map == null) {
            map = jgp.b;
        }
        boolean d2 = a201.d(aVar.request().a.b());
        String b2 = aVar.request().a.b();
        boolean z = SystemClock.elapsedRealtime() < d.get();
        if (d2) {
            b2 = "/newuim";
            z = SystemClock.elapsedRealtime() < e.get();
        }
        if (z) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b3 = h5s.b("CRUCIAL.ERROR.API.BACKGROUND_TRAFFIC");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                b3.a(value, str);
            }
        }
        b3.c("REQUEST_PATH", b2);
        bVar.k(b3.e());
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "UndesirableBackground";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        try {
            okhttp3.u a2 = aVar.a(aVar.request());
            if (BuildInfo.m()) {
                return a2;
            }
            a(aVar);
            return a2;
        } catch (IndexOutOfBoundsException e2) {
            throw new IOException("error! can't get correct tls connection", e2);
        }
    }
}
