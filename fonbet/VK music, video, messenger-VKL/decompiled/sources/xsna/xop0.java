package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.c;
import com.google.firebase.perf.v1.g;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.u93;

/* compiled from: TransportManager.java */
/* loaded from: classes13.dex */
public final class xop0 implements u93.b {
    public static final ra2 s = ra2.d();
    public static final xop0 t = new xop0();
    public final ConcurrentHashMap b;
    public vhr e;

    @Nullable
    public kjr f;
    public uir g;
    public f9e0<top0> h;
    public spr i;
    public Context k;
    public txi l;
    public dxe0 m;
    public u93 n;
    public c.b o;
    public String p;
    public String q;
    public final ConcurrentLinkedQueue<xu90> c = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public boolean r = false;
    public final ThreadPoolExecutor j = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public xop0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static xop0 a() {
        return t;
    }

    public static String b(wv90 wv90Var) {
        if (wv90Var.k()) {
            com.google.firebase.perf.v1.i l = wv90Var.l();
            long v = l.v();
            Locale locale = Locale.ENGLISH;
            return ss9.a("trace metric: ", l.getName(), " (duration: ", new DecimalFormat("#.####").format(v / 1000.0d), "ms)");
        }
        if (wv90Var.j()) {
            NetworkRequestMetric a = wv90Var.a();
            long C = a.K() ? a.C() : 0L;
            String valueOf = a.G() ? String.valueOf(a.x()) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
            Locale locale2 = Locale.ENGLISH;
            return i5s.a(xe9.a("network request trace: ", a.getUrl(), " (responseCode: ", valueOf, ", responseTime: "), new DecimalFormat("#.####").format(C / 1000.0d), "ms)");
        }
        if (!wv90Var.i()) {
            return "log";
        }
        com.google.firebase.perf.v1.f e = wv90Var.e();
        Locale locale3 = Locale.ENGLISH;
        boolean p = e.p();
        int m = e.m();
        int h = e.h();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(p);
        sb.append(", cpuGaugeCount: ");
        sb.append(m);
        sb.append(", memoryGaugeCount: ");
        return h5s.c(h, ")", sb);
    }

    public final void c(com.google.firebase.perf.v1.g gVar) {
        if (gVar.k()) {
            this.n.b(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (gVar.j()) {
            this.n.b(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    public final void d(@NonNull vhr vhrVar, @NonNull uir uirVar, @NonNull f9e0<top0> f9e0Var) {
        this.e = vhrVar;
        vhrVar.a();
        this.q = vhrVar.c.g;
        this.g = uirVar;
        this.h = f9e0Var;
        this.j.execute(new p31(this, 21));
    }

    public final void e(com.google.firebase.perf.v1.i iVar, ApplicationProcessState applicationProcessState) {
        this.j.execute(new ir40(this, iVar, applicationProcessState, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0298, code lost:
    
        if (xsna.dxe0.a(r13.l().w()) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0405, code lost:
    
        c(r13);
        xsna.xop0.s.f("Event dropped due to device sampling - %s", b(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f3, code lost:
    
        if (xsna.txi.p(r5) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0369, code lost:
    
        if (xsna.dxe0.a(r13.l().w()) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0403, code lost:
    
        if (xsna.dxe0.a(r13.a().y()) != false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(g.b bVar, ApplicationProcessState applicationProcessState) {
        boolean z;
        boolean b;
        pyi pyiVar;
        lyi lyiVar;
        float floatValue;
        bzi bziVar;
        float floatValue2;
        String str;
        boolean z2 = true;
        if (!this.d.get()) {
            ConcurrentHashMap concurrentHashMap = this.b;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int intValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int intValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int intValue3 = num3.intValue();
            if (bVar.k() && intValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            } else if (bVar.j() && intValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            } else {
                if (!bVar.i() || intValue3 <= 0) {
                    s.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", b(bVar), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            }
            s.b("Transport is not initialized yet, %s will be queued for to be dispatched later", b(bVar));
            this.c.add(new xu90(bVar, applicationProcessState));
            return;
        }
        ra2 ra2Var = s;
        if (this.l.o() && (!this.o.m() || this.r)) {
            try {
                str = (String) Tasks.await(this.g.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ra2Var.c("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                c.b bVar2 = this.o;
                bVar2.q(applicationProcessState);
                if (!bVar.k()) {
                }
                bVar2 = bVar2.mo4clone();
                if (this.f == null) {
                    ra2 ra2Var2 = kjr.e;
                    this.f = (kjr) vhr.d().b(kjr.class);
                }
                kjr kjrVar = this.f;
                bVar2.n(kjrVar == null ? new HashMap(kjrVar.a) : Collections.EMPTY_MAP);
                bVar.b(bVar2);
                com.google.firebase.perf.v1.g build = bVar.build();
                if (!this.l.o()) {
                }
                z2 = false;
                if (z2) {
                }
            } catch (ExecutionException e2) {
                ra2Var.c("Unable to retrieve Installation Id: %s", e2.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                c.b bVar22 = this.o;
                bVar22.q(applicationProcessState);
                if (!bVar.k()) {
                }
                bVar22 = bVar22.mo4clone();
                if (this.f == null) {
                }
                kjr kjrVar2 = this.f;
                bVar22.n(kjrVar2 == null ? new HashMap(kjrVar2.a) : Collections.EMPTY_MAP);
                bVar.b(bVar22);
                com.google.firebase.perf.v1.g build2 = bVar.build();
                if (!this.l.o()) {
                }
                z2 = false;
                if (z2) {
                }
            } catch (TimeoutException e3) {
                ra2Var.c("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                c.b bVar222 = this.o;
                bVar222.q(applicationProcessState);
                if (!bVar.k()) {
                }
                bVar222 = bVar222.mo4clone();
                if (this.f == null) {
                }
                kjr kjrVar22 = this.f;
                bVar222.n(kjrVar22 == null ? new HashMap(kjrVar22.a) : Collections.EMPTY_MAP);
                bVar.b(bVar222);
                com.google.firebase.perf.v1.g build22 = bVar.build();
                if (!this.l.o()) {
                }
                z2 = false;
                if (z2) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.o.p(str);
            } else {
                ra2Var.h();
            }
        }
        c.b bVar2222 = this.o;
        bVar2222.q(applicationProcessState);
        if (!bVar.k() || bVar.j()) {
            bVar2222 = bVar2222.mo4clone();
            if (this.f == null && this.d.get()) {
                ra2 ra2Var22 = kjr.e;
                this.f = (kjr) vhr.d().b(kjr.class);
            }
            kjr kjrVar222 = this.f;
            bVar2222.n(kjrVar222 == null ? new HashMap(kjrVar222.a) : Collections.EMPTY_MAP);
        }
        bVar.b(bVar2222);
        com.google.firebase.perf.v1.g build222 = bVar.build();
        if (!this.l.o()) {
            if (build222.h().p()) {
                Context context = this.k;
                ArrayList arrayList = new ArrayList();
                if (build222.k()) {
                    arrayList.add(new jjr(build222.l()));
                }
                if (build222.j()) {
                    arrayList.add(new ijr(build222.a(), context));
                }
                if (build222.m()) {
                    arrayList.add(new gjr(build222.h()));
                }
                if (build222.i()) {
                    arrayList.add(new hjr(build222.e()));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((xv90) it.next()).a()) {
                        }
                    }
                    dxe0 dxe0Var = this.m;
                    dxe0Var.getClass();
                    float f = 1.0f;
                    if (build222.k()) {
                        txi txiVar = dxe0Var.a;
                        txiVar.getClass();
                        synchronized (bzi.class) {
                            try {
                                if (bzi.c == null) {
                                    bzi.c = new bzi(0);
                                }
                                bziVar = bzi.c;
                            } finally {
                            }
                        }
                        RemoteConfigManager remoteConfigManager = txiVar.a;
                        bziVar.getClass();
                        kt80<Float> kt80Var = remoteConfigManager.getFloat("fpr_vc_trace_sampling_rate");
                        if (kt80Var.b() && txi.p(kt80Var.a().floatValue())) {
                            txiVar.c.d(kt80Var.a().floatValue(), "com.google.firebase.perf.TraceSamplingRate");
                            floatValue2 = kt80Var.a().floatValue();
                        } else {
                            kt80<Float> b2 = txiVar.b(bziVar);
                            floatValue2 = (b2.b() && txi.p(b2.a().floatValue())) ? b2.a().floatValue() : 1.0f;
                        }
                        if (dxe0Var.b >= floatValue2) {
                        }
                    }
                    if (build222.k() && build222.l().getName().startsWith("_st_") && build222.l().q()) {
                        txi txiVar2 = dxe0Var.a;
                        txiVar2.getClass();
                        synchronized (lyi.class) {
                            try {
                                if (lyi.c == null) {
                                    lyi.c = new lyi(0);
                                }
                                lyiVar = lyi.c;
                            } finally {
                            }
                        }
                        kt80<Float> i = txiVar2.i(lyiVar);
                        if (i.b()) {
                            floatValue = i.a().floatValue() / 100.0f;
                        }
                        kt80<Float> kt80Var2 = txiVar2.a.getFloat("fpr_vc_fragment_sampling_rate");
                        if (kt80Var2.b() && txi.p(kt80Var2.a().floatValue())) {
                            txiVar2.c.d(kt80Var2.a().floatValue(), "com.google.firebase.perf.FragmentSamplingRate");
                            floatValue = kt80Var2.a().floatValue();
                        } else {
                            kt80<Float> b3 = txiVar2.b(lyiVar);
                            floatValue = (b3.b() && txi.p(b3.a().floatValue())) ? b3.a().floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        if (dxe0Var.c >= floatValue) {
                        }
                    }
                    if (build222.j()) {
                        txi txiVar3 = dxe0Var.a;
                        txiVar3.getClass();
                        synchronized (pyi.class) {
                            try {
                                if (pyi.c == null) {
                                    pyi.c = new pyi(0);
                                }
                                pyiVar = pyi.c;
                            } finally {
                            }
                        }
                        RemoteConfigManager remoteConfigManager2 = txiVar3.a;
                        pyiVar.getClass();
                        kt80<Float> kt80Var3 = remoteConfigManager2.getFloat("fpr_vc_network_request_sampling_rate");
                        if (kt80Var3.b() && txi.p(kt80Var3.a().floatValue())) {
                            txiVar3.c.d(kt80Var3.a().floatValue(), "com.google.firebase.perf.NetworkRequestSamplingRate");
                            f = kt80Var3.a().floatValue();
                        } else {
                            kt80<Float> b4 = txiVar3.b(pyiVar);
                            if (b4.b() && txi.p(b4.a().floatValue())) {
                                f = b4.a().floatValue();
                            }
                        }
                        if (dxe0Var.b >= f) {
                        }
                    }
                    dxe0 dxe0Var2 = this.m;
                    dxe0Var2.getClass();
                    if ((!build222.k() || (!(build222.l().getName().equals(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString()) || build222.l().getName().equals(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString())) || build222.l().r() <= 0)) && !build222.i()) {
                        if (build222.j()) {
                            b = dxe0Var2.e.b();
                        } else if (build222.k()) {
                            b = dxe0Var2.d.b();
                        } else {
                            z = true;
                        }
                        z = !b;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c(build222);
                        s.f("Rate limited (per device) - %s", b(build222));
                    }
                    if (z2) {
                        ra2 ra2Var3 = s;
                        if (build222.k()) {
                            String b5 = b(build222);
                            String name = build222.l().getName();
                            ra2Var3.f("Logging %s. In a minute, visit the Firebase console to view your data: %s", b5, name.startsWith("_st_") ? fw3.c(l370.B(this.q, this.p), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide") : fw3.c(l370.B(this.q, this.p), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide"));
                        } else {
                            ra2Var3.f("Logging %s", b(build222));
                        }
                        spr sprVar = this.i;
                        ra2 ra2Var4 = spr.d;
                        if (sprVar.c == null) {
                            top0 top0Var = sprVar.b.get();
                            if (top0Var != null) {
                                sprVar.c = top0Var.a(sprVar.a, new ijp("proto"), new wr(18));
                            } else {
                                ra2Var4.h();
                            }
                        }
                        pop0<com.google.firebase.perf.v1.g> pop0Var = sprVar.c;
                        if (pop0Var != null) {
                            pop0Var.b(new xl5(null, build222, Priority.DEFAULT, null));
                        } else {
                            ra2Var4.h();
                        }
                        SessionManager.getInstance().updatePerfSessionIfExpired();
                        return;
                    }
                    return;
                }
                ra2.d().a();
                s.i("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", b(build222));
                break;
            }
            s.i("App Instance ID is null or empty, dropping %s", b(build222));
        } else {
            s.f("Performance collection is not enabled, dropping %s", b(build222));
        }
        z2 = false;
        if (z2) {
        }
    }

    @Override // xsna.u93.b
    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.r = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.d.get()) {
            this.j.execute(new g0(this, 19));
        }
    }
}
