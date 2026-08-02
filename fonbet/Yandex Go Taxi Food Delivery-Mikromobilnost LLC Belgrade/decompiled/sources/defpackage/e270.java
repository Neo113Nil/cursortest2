package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.perf.b;

/* loaded from: classes9.dex */
public final class e270 {
    public final lx4 a;
    public final b b;
    public final AtomicLong c = new AtomicLong(0);
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public e270(lx4 lx4Var, b bVar) {
        this.a = lx4Var;
        this.b = bVar;
    }

    public final void a(String str, String str2, tls tlsVar, tls tlsVar2) {
        w3j0 j;
        String p = g8e.p(str, Extension.DOT_CHAR, str2);
        CopyOnWriteArraySet copyOnWriteArraySet = this.e;
        if (copyOnWriteArraySet.contains(p)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        Long l = (Long) concurrentHashMap.get(p);
        if (l != null) {
            long longValue = l.longValue();
            b bVar = this.b;
            long f = y6i0.f(longValue, bVar.e(), ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - f;
            long f2 = y6i0.f(elapsedRealtime - this.c.get(), bVar.e(), ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            jst.e.getClass();
            w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) this.a).d(str));
            w3j0Var.a.put("type", str2);
            w3j0Var.c(j2, RemoteBioParameters.TIME);
            w3j0Var.c(j2, "duration");
            w3j0Var.c(f2, "till_first_shot");
            j = w3j0Var.l().j((r2 & 1) == 0);
            j.m();
            tlsVar2.invoke(Long.valueOf(j2));
            copyOnWriteArraySet.add(p);
            concurrentHashMap.remove(p);
        }
    }
}
