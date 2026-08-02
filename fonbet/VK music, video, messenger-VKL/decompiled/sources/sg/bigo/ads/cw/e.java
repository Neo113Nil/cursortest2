package sg.bigo.ads.cw;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.an.m;

/* loaded from: classes9.dex */
final class e {
    volatile c b;
    volatile sg.bigo.ads.ay.a c;
    private final String g;
    final AtomicInteger a = new AtomicInteger(0);
    volatile long d = 0;
    volatile long e = SystemClock.elapsedRealtime();
    final AtomicInteger f = new AtomicInteger(0);

    public e(String str) {
        this.g = (String) m.a(str);
    }

    public final synchronized boolean a() {
        c cVar;
        try {
            if (this.b == null) {
                String str = this.g;
                HashMap hashMap = new HashMap();
                for (String str2 : str.substring(str.indexOf("?") + 1).split("&")) {
                    String[] split = str2.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
                this.c = sg.bigo.ads.core.player.b.a().c.a((String) hashMap.get("path"), (String) hashMap.get("name"));
                if (this.c == null) {
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "downloadInfo = null");
                    cVar = null;
                } else {
                    cVar = new c(this.c);
                }
            } else {
                cVar = this.b;
            }
            this.b = cVar;
        } catch (Throwable th) {
            throw th;
        }
        return this.b != null;
    }

    public final synchronized void b() {
        if (this.a.decrementAndGet() <= 0) {
            c cVar = this.b;
            synchronized (cVar.c) {
                cVar.d = true;
                cVar.b.b();
            }
            this.b = null;
        }
    }
}
