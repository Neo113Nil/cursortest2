package xsna;

import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.superapp.core.perf.BrowserPerfState;

/* compiled from: WebAppBenchmarkBridge.kt */
/* loaded from: classes11.dex */
public final class zdx0 {
    public final void a(BrowserPerfState browserPerfState, v73 v73Var) {
        DevicePerformanceInfo.Class r10;
        if (browserPerfState.G()) {
            return;
        }
        Integer num = null;
        if (v73Var.a() <= 0) {
            l5m l5mVar = new l5m(null, null, 3);
            String h = DevNullEventKey.SA_UNKNOWN_APP_ID.h();
            String valueOf = String.valueOf(v73Var.a());
            String f = v73Var.f();
            String valueOf2 = String.valueOf(f != null ? drm0.l0(f, '?') : null);
            String c = v73Var.c();
            String valueOf3 = String.valueOf(c != null ? drm0.l0(c, '?') : null);
            String g = v73Var.g();
            String valueOf4 = String.valueOf(g != null ? drm0.l0(g, '?') : null);
            String d = v73Var.d();
            String valueOf5 = String.valueOf(d != null ? drm0.l0(d, '?') : null);
            String D = browserPerfState.D();
            l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, valueOf, null, valueOf2, null, valueOf3, null, valueOf4, null, valueOf5, null, String.valueOf(D != null ? drm0.l0(D, '?') : null), null, String.valueOf(v73Var.h()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -21846, 3, null);
            l5mVar.q();
        }
        int a = (int) v73Var.a();
        String D2 = browserPerfState.D();
        String valueOf6 = String.valueOf(browserPerfState.o());
        String valueOf7 = String.valueOf(browserPerfState.l());
        String valueOf8 = String.valueOf(browserPerfState.k());
        String valueOf9 = String.valueOf(browserPerfState.f());
        String valueOf10 = String.valueOf(browserPerfState.n());
        String valueOf11 = String.valueOf(browserPerfState.C());
        String valueOf12 = String.valueOf(browserPerfState.p());
        String valueOf13 = String.valueOf(browserPerfState.u());
        String valueOf14 = String.valueOf(browserPerfState.B());
        String valueOf15 = String.valueOf(browserPerfState.d());
        String valueOf16 = String.valueOf(browserPerfState.g());
        boolean b = v73Var.b();
        boolean K = browserPerfState.K();
        Integer i = browserPerfState.i();
        String j = browserPerfState.j();
        String e = v73Var.e();
        rxi0 rxi0Var = rxi0.a;
        long a2 = v73Var.a();
        rxi0Var.getClass();
        String b2 = rxi0.b(a2);
        boolean i2 = r6m.i();
        DevicePerformanceInfo a3 = DevicePerformanceInfo.a.a();
        if (a3 != null && (r10 = a3.d) != null) {
            num = Integer.valueOf(r10.h());
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance = new MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance(valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, null, null, null, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, Boolean.valueOf(K), Integer.valueOf(a), D2, Boolean.valueOf(b), null, null, null, i, j, e, b2, Boolean.valueOf(i2), num, String.valueOf(browserPerfState.e()), 1835232, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance;
        kx6Var.q();
    }
}
