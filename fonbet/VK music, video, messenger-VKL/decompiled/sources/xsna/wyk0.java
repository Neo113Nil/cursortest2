package xsna;

import com.vk.log.L;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.data.b;
import java.util.concurrent.TimeUnit;
import xsna.pox;

/* compiled from: StatsDispatchDaemon.java */
/* loaded from: classes7.dex */
public final class wyk0 {
    public static final long d;
    public static final long e;
    public static final long f;
    public boolean a = false;
    public pox b = null;
    public pox c = null;

    /* compiled from: StatsDispatchDaemon.java */
    public static class a implements pox.a {
        @Override // xsna.pox.a
        public final long a() {
            com.vkontakte.android.data.b h = com.vkontakte.android.data.b.h();
            h.getClass();
            if (o25.a().b()) {
                c63 c63Var = c63.a;
                if (c63.f) {
                    h.t.c();
                    b.d dVar = new b.d("geo_data");
                    dVar.b("1", "no_data_reason");
                    dVar.e();
                }
            }
            return wyk0.d;
        }
    }

    /* compiled from: StatsDispatchDaemon.java */
    public static class b implements pox.a {
        @Override // xsna.pox.a
        public final long a() {
            try {
                com.vkontakte.android.data.b.m();
                CoreFeatures coreFeatures = CoreFeatures.TRACK_EVENTS_BLOCKLIST;
                coreFeatures.getClass();
                if (!com.vk.toggle.b.A.a(coreFeatures)) {
                    return wyk0.e;
                }
                mfp0 b = com.vk.toggle.d.u0.b();
                if (b == null) {
                    mfp0.e.getClass();
                    b = mfp0.f;
                }
                return b.c;
            } catch (Throwable th) {
                L.e(th);
                return wyk0.f;
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        d = timeUnit.toMillis(1L);
        e = timeUnit.toMillis(1L);
        f = TimeUnit.SECONDS.toMillis(30L);
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        pox poxVar = new pox(new a());
        this.b = poxVar;
        poxVar.setName("vk-statsDispatchDaemon::Commit");
        long j = 7000;
        this.b.d = j;
        this.b.a();
        this.b.start();
        pox poxVar2 = new pox(new b());
        this.c = poxVar2;
        poxVar2.setName("vk-statsDispatchDaemon::Send");
        this.c.d = j;
        this.c.a();
        this.c.start();
    }
}
