package xsna;

import android.util.Log;
import com.vk.im.engine.reporters.performance.events.Category;
import com.vk.metrics.logging.PerfLogger;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BaseSpanPerformanceReporter.kt */
/* loaded from: classes5.dex */
public class wn6<SpanName, MeasuringPoint> implements eik0<mdz<SpanName>, MeasuringPoint> {
    public final String a;
    public volatile boolean g;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference<String> e = new AtomicReference<>();
    public final AtomicReference<String> f = new AtomicReference<>();
    public final bpn0 h = new bpn0(new re0(2));

    public wn6(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    public static void w(wn6 wn6Var, mdz mdzVar, izs izsVar, List list, List list2, int i) {
        ConcurrentHashMap concurrentHashMap;
        long j;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentSkipListSet concurrentSkipListSet;
        wn6 wn6Var2 = wn6Var;
        izs izsVar2 = izsVar;
        wto0 wto0Var = (wto0) wn6Var2.c.get(mdzVar);
        vto0 vto0Var = wto0Var != null ? wto0Var.a : null;
        ConcurrentHashMap concurrentHashMap3 = wn6Var2.c;
        List list3 = (i & 32) != 0 ? null : list;
        List list4 = (i & 64) != 0 ? null : list2;
        wn6Var2.getClass();
        String str = (String) izsVar2.invoke(mdzVar);
        Iterator it = wn6Var2.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mdz mdzVar2 = (mdz) entry.getKey();
            wto0 wto0Var2 = (wto0) entry.getValue();
            String str2 = wn6Var2.a;
            long j2 = mdzVar2.a;
            mdz mdzVar3 = mdzVar2.c;
            String str3 = (String) izsVar2.invoke(mdzVar2);
            String h = Category.TECH.h();
            Long a = wto0Var2.a();
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
            long longValue = a != null ? a.longValue() : 0L;
            long j3 = mdzVar3 != null ? mdzVar3.a : -1L;
            mdz mdzVar4 = (mdzVar3 == null || (concurrentSkipListSet = (ConcurrentSkipListSet) mdzVar3.d.getValue()) == null) ? null : (mdz) concurrentSkipListSet.lower(mdzVar2);
            Iterator it2 = it;
            long j4 = mdzVar4 != null ? mdzVar4.a : -1L;
            Long d = wto0Var2.a.d(vto0Var);
            vto0 vto0Var2 = vto0Var;
            long max = Math.max(0L, d != null ? d.longValue() : 0L);
            if (mdzVar3 != null) {
                vto0 vto0Var3 = wto0Var2.a;
                ?? r3 = concurrentHashMap4;
                wto0 wto0Var3 = (wto0) r3.get(mdzVar3);
                Long d2 = vto0Var3.d(wto0Var3 != null ? wto0Var3.a : null);
                concurrentHashMap = r3;
                if (d2 != null) {
                    j = d2.longValue();
                    concurrentHashMap2 = r3;
                    MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric = new MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric(str2, j2, str3, h, longValue, max, Math.max(0L, j), str, Long.valueOf(j3), Long.valueOf(j4), null, list4, list3, 1024, null);
                    kx6 kx6Var = new kx6();
                    kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric;
                    kx6Var.q();
                    wn6Var2 = wn6Var;
                    it = it2;
                    izsVar2 = izsVar;
                    concurrentHashMap3 = concurrentHashMap2;
                    vto0Var = vto0Var2;
                }
            } else {
                concurrentHashMap = concurrentHashMap4;
            }
            j = 0;
            concurrentHashMap2 = concurrentHashMap;
            MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric2 = new MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric(str2, j2, str3, h, longValue, max, Math.max(0L, j), str, Long.valueOf(j3), Long.valueOf(j4), null, list4, list3, 1024, null);
            kx6 kx6Var2 = new kx6();
            kx6Var2.f = mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric2;
            kx6Var2.q();
            wn6Var2 = wn6Var;
            it = it2;
            izsVar2 = izsVar;
            concurrentHashMap3 = concurrentHashMap2;
            vto0Var = vto0Var2;
        }
    }

    @Override // xsna.eik0
    public void b() {
        if (h()) {
            this.g = true;
        }
    }

    @Override // xsna.eik0
    public final void c(Object obj) {
        mdz mdzVar = (mdz) obj;
        if (h()) {
            ConcurrentHashMap concurrentHashMap = this.c;
            Object obj2 = concurrentHashMap.get(mdzVar);
            if (obj2 == null) {
                obj2 = new wto0(0);
                concurrentHashMap.put(mdzVar, obj2);
            }
            if (((wto0) obj2).a.c()) {
                u(mdzVar);
            }
        }
    }

    @Override // xsna.eik0
    public final void f(Object obj, Object obj2) {
        mdz<SpanName> mdzVar = (mdz) obj;
        if (h()) {
            ConcurrentHashMap concurrentHashMap = this.c;
            Object obj3 = concurrentHashMap.get(mdzVar);
            if (obj3 == null) {
                obj3 = new wto0(0);
                concurrentHashMap.put(mdzVar, obj3);
            }
            if (((wto0) obj3).b.c()) {
                t(mdzVar, obj2);
            }
        }
    }

    @Override // xsna.eik0
    public final void g(String str) {
        AtomicReference<String> atomicReference;
        if (h()) {
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(null, str)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    @Override // xsna.eik0
    public final boolean h() {
        return (this.d.get() || this.g) ? false : true;
    }

    @Override // xsna.eik0
    public final void m(String str) {
        AtomicReference<String> atomicReference;
        if (h()) {
            do {
                atomicReference = this.f;
                if (atomicReference.compareAndSet(null, str)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    @Override // xsna.eik0
    public final void n(Object obj) {
        if (h()) {
            ConcurrentHashMap concurrentHashMap = this.b;
            Object obj2 = concurrentHashMap.get(obj);
            if (obj2 == null) {
                obj2 = new vto0();
                concurrentHashMap.put(obj, obj2);
            }
            ((vto0) obj2).c();
        }
    }

    public final void q(Iterable<? extends SpanName> iterable, mdz<SpanName> mdzVar) {
        Set keySet = r().keySet();
        for (SpanName spanname : iterable) {
            if (!keySet.contains(spanname)) {
                this.c.put(mdzVar.a(spanname), new wto0(0));
            }
        }
    }

    public final LinkedHashMap r() {
        Set<Map.Entry> entrySet = this.c.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            mdz mdzVar = (mdz) entry.getKey();
            wto0 wto0Var = (wto0) entry.getValue();
            Object obj = mdzVar.b;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(obj, obj2);
            }
            ((List) obj2).add(wto0Var);
        }
        return linkedHashMap;
    }

    public final void s(Long l, String str) {
        if (l != null) {
            long longValue = l.longValue();
            if (((PerfLogger) this.h.getValue()).a) {
                Log.println(2, "PERF", str + ": " + longValue);
            }
        }
    }

    public void t(mdz<SpanName> mdzVar, Object obj) {
        throw null;
    }

    public final void v(gzs<s3q0> gzsVar) {
        if (h() && this.d.compareAndSet(false, true)) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.eik0
    public void d(Object obj) {
    }

    public void u(mdz mdzVar) {
    }
}
