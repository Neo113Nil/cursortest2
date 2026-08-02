package xsna;

import android.os.SystemClock;
import com.vk.log.L;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.concurrent.atomic.AtomicLong;
import xsna.k400;

/* compiled from: LiteSyncReporterImpl.kt */
/* loaded from: classes5.dex */
public final class yhz implements xhz {
    public final upj b = new upj();
    public final AtomicLong c = new AtomicLong();

    public yhz(cau0 cau0Var) {
    }

    @Override // xsna.xhz
    public final void a() {
        long andSet = this.c.getAndSet(0L);
        if (andSet <= 0) {
            L.l("startTime <= 0L. illegal state");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - andSet;
        L.e(defpackage.k0.a(uptimeMillis, "succeed. syncTime = "));
        k400.a aVar = k400.h;
        String c = com.vk.core.utils.newtork.b.c().c();
        aVar.getClass();
        k400 k400Var = new k400();
        String h = DevNullEventKey.LONG_POLL_LITE_SYNC_METRICS.h();
        long a = k400.a.a();
        if (uptimeMillis > a) {
            uptimeMillis = a;
        }
        int i = (int) uptimeMillis;
        long a2 = k400.a.a();
        if (8000 <= a2) {
            a2 = 8000;
        }
        k400Var.g = new SchemeStat$TypeDevNullItem(h, null, "light_sync_succeed", Integer.valueOf(i), c, Integer.valueOf((int) a2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
        k400Var.q();
    }

    @Override // xsna.xhz
    public final void b() {
        this.b.getClass();
        this.c.set(SystemClock.uptimeMillis());
    }

    @Override // xsna.xhz
    public final void c() {
        long andSet = this.c.getAndSet(0L);
        if (andSet <= 0) {
            L.l("startTime <= 0L. illegal state");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - andSet;
        L.e(defpackage.k0.a(uptimeMillis, "interrupted. timeSpend = "));
        k400.a aVar = k400.h;
        String c = com.vk.core.utils.newtork.b.c().c();
        aVar.getClass();
        k400 k400Var = new k400();
        String h = DevNullEventKey.LONG_POLL_LITE_SYNC_METRICS.h();
        long a = k400.a.a();
        if (uptimeMillis > a) {
            uptimeMillis = a;
        }
        int i = (int) uptimeMillis;
        long a2 = k400.a.a();
        if (8000 <= a2) {
            a2 = 8000;
        }
        k400Var.g = new SchemeStat$TypeDevNullItem(h, null, "light_sync_interrupted", Integer.valueOf(i), c, Integer.valueOf((int) a2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
        k400Var.q();
    }
}
