package xsna;

import android.app.Application;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.d;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.stat.background.StatSendPeriodicWorkWithStatInit;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.NotificationFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.irk0;

/* compiled from: AppStatInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class p93 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitAppStat";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0101  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke() {
        pll pllVar;
        usk0 b;
        com.vk.toggle.b bVar;
        final fsk0 fsk0Var;
        dwx0 h;
        NotificationFeatures notificationFeatures;
        o8f0 o8f0Var;
        lcn lcnVar;
        Application application = this.b;
        nb3 nb3Var = nb3.a;
        apl aplVar = new apl();
        CoreFeatures coreFeatures = CoreFeatures.SEQUENCE_BASED_ANALYTICS;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            try {
                pllVar = new pll(new bbu(new wki0(application).getWritableDatabase(), new ta3(0)));
            } catch (Exception e) {
                L.j(e, "SeqBasedAnalytics:initStat", "Can't create EventSequenceGenerator.");
                com.vk.metrics.eventtracking.b.a.a(e);
            }
            dru0 dru0Var = new dru0(pllVar);
            vhk0 vhk0Var = new vhk0();
            vhk0.d = new bpn0(new r63(1));
            b = com.vk.toggle.d.t0.b();
            if (b == null) {
                usk0.f.getClass();
                b = usk0.g;
            }
            dti dtiVar = new dti(dru0Var, new a0h0());
            List l = e43.l(new eta0("SAK"), new eta0("VK"));
            tb3 tb3Var = new tb3(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
            CoreFeatures coreFeatures2 = CoreFeatures.SAVE_STAT_STATE_ON_EACH_EVENT;
            coreFeatures2.getClass();
            bVar = com.vk.toggle.b.A;
            boolean a = bVar.a(coreFeatures2);
            qo qoVar = new qo(1);
            pu2 pu2Var = new pu2(1);
            ib3 ib3Var = new ib3(0);
            final irk0.a aVar = new irk0.a(dtiVar, l, qoVar, vhk0Var, aplVar, pu2Var, tb3Var, ib3Var, new jb3(application, 0), a);
            aVar.g = b.b;
            aVar.h = b.d;
            aVar.i = b.e;
            aVar.j = b.c;
            CoreFeatures coreFeatures3 = CoreFeatures.STAT_BREAK_CYCLE;
            coreFeatures3.getClass();
            aVar.k = bVar.a(coreFeatures3);
            nb3.b.getClass();
            o2l o2lVar = o2l.a;
            o2lVar.getClass();
            if (o2l.b("__dbg_force_send", false)) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.h = timeUnit.toMillis(1L);
                aVar.i = timeUnit.toMillis(1L);
                aVar.j = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
            nb3.a.getClass();
            cru0 cru0Var = new cru0(((Boolean) nb3.g.getValue()).booleanValue(), 1);
            o2lVar.getClass();
            cru0Var.e = !o2l.b("__dbg_network_stat_force", false) && BuildInfo.h();
            L.e("apply default event filter to stat");
            fsk0Var = qsk0.a;
            fsk0Var.n = new epf(new vyp[]{cru0Var, new rsr()});
            nb3.c.b(bVar.u(new kb3(0), null));
            fsk0Var.t = new lb3();
            fsk0Var.q = new xu2(1);
            wwk wwkVar = new wwk(application, ib3Var, aVar.g);
            fsk0Var.m = wwkVar;
            fsk0Var.g = wwkVar;
            fsk0Var.k = pu2Var;
            fsk0Var.d = aVar;
            ((ExecutorService) fsk0Var.h.getValue()).submit(new qhs(fsk0Var, 2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new qif0(false, aVar.h, new p9e0(fsk0Var, aVar)));
            arrayList.add(new qif0(false, aVar.i, new izs() { // from class: xsna.xrk0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    fsk0.i(fsk0.this, ((Boolean) obj).booleanValue(), aVar.j > ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, 4);
                    return s3q0.a;
                }
            }));
            fsk0Var.l = new o8f0(arrayList);
            fsk0Var.r = a;
            h = dwx0.h(application);
            if (h != null) {
                rfc a2 = fpf0.a(StatSendPeriodicWorkWithStatInit.class);
                long j = aVar.f;
                p6j p6jVar = new p6j(new b560(null), NetworkType.NOT_ROAMING, false, true, true, false, -1L, -1L, j5g.S0(new LinkedHashSet()));
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                d.a aVar2 = new d.a(a2.a());
                aVar2.c.e(timeUnit2.toMillis(j));
                h.e("background_stat_send", ExistingPeriodicWorkPolicy.KEEP, aVar2.f(p6jVar).b());
            }
            if (fsk0Var.f() && (o8f0Var = fsk0Var.l) != null && (lcnVar = o8f0Var.b) == null && o8f0Var != null) {
                if (lcnVar == null) {
                    throw new IllegalStateException("SendDaemon is already started");
                }
                o8f0Var.b = new lcn();
                Iterator<hji0> it = o8f0Var.a.iterator();
                while (it.hasNext()) {
                    hji0 next = it.next();
                    next.e = o8f0Var.b;
                    next.a();
                }
            }
            fsk0Var.p.countDown();
            notificationFeatures = NotificationFeatures.NOTIFICATION_PUSH_PIPELINE_ANALYTIC;
            notificationFeatures.getClass();
            if (bVar.a(notificationFeatures)) {
                c63 c63Var = c63.a;
                c63.a(new rb3(application));
            }
            ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc().c(new sb3());
            return s3q0.a;
        }
        pllVar = null;
        dru0 dru0Var2 = new dru0(pllVar);
        vhk0 vhk0Var2 = new vhk0();
        vhk0.d = new bpn0(new r63(1));
        b = com.vk.toggle.d.t0.b();
        if (b == null) {
        }
        dti dtiVar2 = new dti(dru0Var2, new a0h0());
        List l2 = e43.l(new eta0("SAK"), new eta0("VK"));
        tb3 tb3Var2 = new tb3(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
        CoreFeatures coreFeatures22 = CoreFeatures.SAVE_STAT_STATE_ON_EACH_EVENT;
        coreFeatures22.getClass();
        bVar = com.vk.toggle.b.A;
        boolean a3 = bVar.a(coreFeatures22);
        qo qoVar2 = new qo(1);
        pu2 pu2Var2 = new pu2(1);
        ib3 ib3Var2 = new ib3(0);
        final irk0.a aVar3 = new irk0.a(dtiVar2, l2, qoVar2, vhk0Var2, aplVar, pu2Var2, tb3Var2, ib3Var2, new jb3(application, 0), a3);
        aVar3.g = b.b;
        aVar3.h = b.d;
        aVar3.i = b.e;
        aVar3.j = b.c;
        CoreFeatures coreFeatures32 = CoreFeatures.STAT_BREAK_CYCLE;
        coreFeatures32.getClass();
        aVar3.k = bVar.a(coreFeatures32);
        nb3.b.getClass();
        o2l o2lVar2 = o2l.a;
        o2lVar2.getClass();
        if (o2l.b("__dbg_force_send", false)) {
        }
        nb3.a.getClass();
        cru0 cru0Var2 = new cru0(((Boolean) nb3.g.getValue()).booleanValue(), 1);
        o2lVar2.getClass();
        cru0Var2.e = !o2l.b("__dbg_network_stat_force", false) && BuildInfo.h();
        L.e("apply default event filter to stat");
        fsk0Var = qsk0.a;
        fsk0Var.n = new epf(new vyp[]{cru0Var2, new rsr()});
        nb3.c.b(bVar.u(new kb3(0), null));
        fsk0Var.t = new lb3();
        fsk0Var.q = new xu2(1);
        wwk wwkVar2 = new wwk(application, ib3Var2, aVar3.g);
        fsk0Var.m = wwkVar2;
        fsk0Var.g = wwkVar2;
        fsk0Var.k = pu2Var2;
        fsk0Var.d = aVar3;
        ((ExecutorService) fsk0Var.h.getValue()).submit(new qhs(fsk0Var, 2));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new qif0(false, aVar3.h, new p9e0(fsk0Var, aVar3)));
        arrayList2.add(new qif0(false, aVar3.i, new izs() { // from class: xsna.xrk0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                fsk0.i(fsk0.this, ((Boolean) obj).booleanValue(), aVar3.j > ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, 4);
                return s3q0.a;
            }
        }));
        fsk0Var.l = new o8f0(arrayList2);
        fsk0Var.r = a3;
        h = dwx0.h(application);
        if (h != null) {
        }
        if (fsk0Var.f()) {
            if (lcnVar == null) {
            }
        }
        fsk0Var.p.countDown();
        notificationFeatures = NotificationFeatures.NOTIFICATION_PUSH_PIPELINE_ANALYTIC;
        notificationFeatures.getClass();
        if (bVar.a(notificationFeatures)) {
        }
        ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc().c(new sb3());
        return s3q0.a;
    }
}
