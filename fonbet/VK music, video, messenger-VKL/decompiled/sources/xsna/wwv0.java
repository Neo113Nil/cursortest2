package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import com.ironsource.B5;
import com.vk.core.apps.BuildInfo;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.network.kbh.state.NetworkState;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.mgn0;
import xsna.svv0;
import xsna.tpn0;

/* compiled from: VkUiPresenter.kt */
/* loaded from: classes6.dex */
public class wwv0 implements fvv0 {
    public static final List<Long> s = e43.l(51404928L, 51491207L);
    public final gvv0 a;
    public final tvv0 b;
    public final com.vk.superapp.navigation.api.di.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public boolean e;
    public io.reactivex.rxjava3.disposables.c f;
    public boolean g;
    public tpn0 h;
    public ovv0 i;
    public final ux90 j;
    public final tau0 k;
    public VkBridgeAnalytics l;
    public qfu0 m;
    public final ArrayList n;
    public boolean o;
    public Throwable p;
    public Integer q;
    public final bpn0 r;

    /* compiled from: VkUiPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkState.values().length];
            try {
                iArr[NetworkState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkState.UNSTABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkState.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wwv0(gvv0 gvv0Var, tvv0 tvv0Var, com.vk.superapp.navigation.api.di.c cVar) {
        this.a = gvv0Var;
        this.b = tvv0Var;
        this.c = cVar;
        this.j = new ux90(tvv0Var.getAppId());
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.r = new bpn0(new g2c0(17));
        svv0 data = tvv0Var.getData();
        if (data instanceof svv0.a) {
            svv0.a aVar = (svv0.a) data;
            WebApiApplication webApiApplication = aVar.a;
            tau0 tau0Var = new tau0(webApiApplication.b, webApiApplication.f(), aVar.c, webApiApplication.w, aVar.e, aVar.b);
            arrayList.add(tau0Var);
            arrayList.add(jgn0.b());
            this.k = tau0Var;
            WebApiApplication webApiApplication2 = aVar.a;
            c0(webApiApplication2.b, aVar.b, webApiApplication2.f(), webApiApplication2.w, webApiApplication2.D, Long.valueOf(webApiApplication2.q));
            return;
        }
        if (data instanceof svv0.b) {
            svv0.b bVar = (svv0.b) data;
            long j = bVar.b;
            if (j > 0) {
                tau0 tau0Var2 = new tau0(j, false, gvv0Var.T0(), null, null, bVar.a);
                arrayList.add(tau0Var2);
                arrayList.add(jgn0.b());
                this.k = tau0Var2;
                c0(bVar.b, bVar.a, false, null, null, null);
            }
        }
    }

    @Override // xsna.xwv0
    public final void B(boolean z) {
        tpn0 tpn0Var = this.h;
        if (tpn0Var != null) {
            tpn0Var.g = z;
        }
    }

    @Override // xsna.xwv0
    public final void C(WebApiApplication webApiApplication) {
        String str = webApiApplication.D;
        tvv0 tvv0Var = this.b;
        tvv0Var.j(str);
        if (tvv0Var instanceof rwv0) {
            ((rwv0) tvv0Var).a.h = webApiApplication.V;
        }
        if (tvv0Var.m() == null || !(tvv0Var instanceof zuv0)) {
            return;
        }
        zuv0 zuv0Var = (zuv0) tvv0Var;
        svv0.a aVar = zuv0Var.a;
        long j = webApiApplication.b;
        WebApiApplication webApiApplication2 = aVar.a;
        zuv0Var.a = new svv0.a(WebApiApplication.a(webApiApplication, null, null, null, j == webApiApplication2.b ? webApiApplication2.w : webApiApplication.w, webApiApplication2.z, -18874369), aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i);
    }

    @Override // xsna.xwv0
    public final String D() {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0.f fVar = mgn0Var.e;
        if (!epx.f(fVar.b.invoke(), "api.".concat(a0a.d))) {
            return fVar.b.invoke();
        }
        if (epx.f(fVar.h.invoke(), "api.".concat(a0a.d))) {
            return "api.".concat(a0a.d);
        }
        String invoke = fVar.h.invoke();
        return invoke == null ? "static.".concat(a0a.d) : invoke;
    }

    @Override // xsna.xwv0
    public final void D1(tb0 tb0Var) {
        this.a.D1(tb0Var);
    }

    @Override // xsna.xwv0
    public final VkBridgeAnalytics E() {
        return this.l;
    }

    @Override // xsna.xwv0
    public final void F() {
        this.p = null;
    }

    @Override // xsna.fvv0
    public final tpn0 G() {
        return this.h;
    }

    @Override // xsna.xwv0
    public final WebAdConfig H() {
        return this.b.o();
    }

    @Override // xsna.xwv0
    public final boolean I() {
        return this.b.getData().b();
    }

    @Override // xsna.fvv0
    public final ovv0 J() {
        return this.i;
    }

    @Override // xsna.xwv0
    public final boolean K() {
        return !this.b.h();
    }

    @Override // xsna.xwv0
    public final boolean L() {
        return ((Boolean) jgn0.b.getValue()).booleanValue();
    }

    @Override // xsna.xwv0
    public final qfu0 M() {
        return this.m;
    }

    @Override // xsna.xwv0
    public final void N() {
        this.e = false;
        this.d = io.reactivex.rxjava3.core.a.s(30L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bum(this, 4), new xvq0(new wo40(27), 8));
    }

    @Override // xsna.xwv0
    public final void O(yvv0 yvv0Var) {
        exv0 exv0Var;
        ysg0<exv0> ysg0Var = fxv0.a;
        if (yvv0Var instanceof axv0) {
            exv0Var = zwv0.a;
        } else {
            if (!(yvv0Var instanceof mvv0)) {
                throw new NoWhenBranchMatchedException();
            }
            exv0Var = nvv0.a;
        }
        ysg0Var.a(exv0Var);
    }

    @Override // xsna.xwv0
    public final List<k1w0> Q() {
        return this.n;
    }

    @Override // xsna.xwv0
    public final void R(List<? extends VKWebAppPermission> list) {
        fxv0.a.a(new swv0(this.b.getAppId(), list));
    }

    @Override // xsna.xwv0
    public final boolean S() {
        WebApiApplication m;
        tvv0 tvv0Var = this.b;
        return (tvv0Var.m() == null || (m = tvv0Var.m()) == null || m.B) ? false : true;
    }

    @Override // xsna.xwv0
    public final ux90 T() {
        return this.j;
    }

    @Override // xsna.xwv0
    public final String T0() {
        return this.a.T0();
    }

    @Override // xsna.xwv0
    public final boolean U(String str, String str2, boolean z) {
        try {
            upn0 upn0Var = (str2.length() == 0 && str.length() == 0) ? new upn0(z, 0, Integer.valueOf(krv0.l(R.attr.vk_ui_background_content))) : new upn0(z, (!myc0.f(str) || str.equals("none")) ? null : Integer.valueOf(tpn0.a.a(str)), myc0.f(str2) ? Integer.valueOf(tpn0.a.a(str2)) : null);
            B(false);
            tpn0 tpn0Var = this.h;
            if (tpn0Var != null) {
                tpn0Var.a(upn0Var);
            }
        } catch (IllegalArgumentException unused) {
        }
        return this.h != null;
    }

    @Override // xsna.xwv0
    public final void V() {
        this.g = true;
    }

    @Override // xsna.xwv0
    public final boolean W() {
        return s.contains(Long.valueOf(this.b.getAppId()));
    }

    @Override // xsna.xwv0
    public final io.reactivex.rxjava3.disposables.c X(io.reactivex.rxjava3.disposables.c cVar) {
        up2.j(cVar, this.a);
        return cVar;
    }

    @Override // xsna.xwv0
    public final mgn0.c Y() {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        return mgn0Var.c;
    }

    @Override // xsna.xwv0
    public final boolean Z() {
        tpn0 tpn0Var = this.h;
        return tpn0Var != null && tpn0Var.g;
    }

    @Override // xsna.xwv0
    public final String a() {
        return this.b.a();
    }

    @Override // xsna.xwv0
    public final Integer a0() {
        return this.q;
    }

    @Override // xsna.xwv0
    public final void b(boolean z) {
        tpn0 tpn0Var;
        if (r() == z || (tpn0Var = this.h) == null) {
            return;
        }
        tpn0Var.b(z);
    }

    @Override // xsna.xwv0
    public final String c() {
        tvv0 tvv0Var = this.b;
        WebApiApplication m = tvv0Var.m();
        boolean z = m != null ? m.B : false;
        String c = tvv0Var.c();
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0.e eVar = mgn0Var.e.m;
        return (c == null || eVar == null) ? c : eVar.b(c, z);
    }

    public final void c0(long j, String str, boolean z, String str2, String str3, Long l) {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0Var.getClass();
        this.l = this.c.b(j, str3, str, str2, z, (j19) this.r.getValue());
        this.m = this.c.c(z, str2, l, j);
    }

    @Override // xsna.fvv0
    public final tau0 d() {
        return this.k;
    }

    @Override // xsna.xwv0
    public final String e() {
        return this.b.i();
    }

    @Override // xsna.xwv0
    public final void e3(tb0 tb0Var) {
        this.a.e3(tb0Var);
    }

    @Override // xsna.xwv0
    public final boolean f() {
        return this.b.f();
    }

    @Override // xsna.xwv0
    public final boolean g() {
        return this.b.g();
    }

    @Override // xsna.xwv0
    public final long getAppId() {
        return this.b.getAppId();
    }

    @Override // xsna.xwv0
    public final String getUserAgent() {
        return dgq0.a(jgn0.a());
    }

    @Override // xsna.xwv0
    public final boolean h() {
        return this.b.h();
    }

    @Override // xsna.xwv0
    public final void h2() {
        this.a.h2();
    }

    @Override // xsna.xwv0
    public final boolean i() {
        return this.p != null;
    }

    @Override // xsna.xwv0
    public final Map<String, String> j() {
        return this.b.k();
    }

    @Override // xsna.xwv0
    public final void k(boolean z) {
        this.o = z;
    }

    @Override // xsna.xwv0
    public final String l() {
        svv0 data = this.b.getData();
        svv0.a aVar = data instanceof svv0.a ? (svv0.a) data : null;
        if (aVar != null) {
            return aVar.i;
        }
        return null;
    }

    @Override // xsna.fvv0
    public final void n(ovv0 ovv0Var) {
        this.i = ovv0Var;
    }

    @Override // xsna.xwv0
    public final boolean o() {
        return !S() || t().B;
    }

    @Override // xsna.xwv0
    public final void p(String str) {
        this.b.p(new yeq0(str));
        this.a.Hc(str);
    }

    @Override // xsna.xwv0
    public final boolean q() {
        return jgn0.c();
    }

    @Override // xsna.xwv0
    public final boolean r() {
        tpn0 tpn0Var = this.h;
        return tpn0Var != null && tpn0Var.f;
    }

    @Override // xsna.xwv0
    public final boolean s() {
        Context applicationContext;
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        if (!epx.f(mgn0Var.c.a, "vkclient")) {
            Activity B0 = this.a.B0();
            if (B0 == null || (applicationContext = B0.getApplicationContext()) == null) {
                return false;
            }
            bnj0 bnj0Var = bnj0.a;
            bnj0Var.getClass();
            try {
                applicationContext.getPackageManager().getPackageInfo("com.vkontakte.android", 1);
                if (!j5g.P(bnj0.b, bnj0.b(applicationContext, "com.vkontakte.android", new ai6(1, bnj0Var, bnj0.class, "calculateDigestHex", "calculateDigestHex(Landroid/content/pm/Signature;)Ljava/lang/String;", 0, 10)))) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.xwv0
    public final WebApiApplication t() {
        WebApiApplication m = this.b.m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("Application is null!");
    }

    @Override // xsna.xwv0
    public final String u() {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        String originatingPackageName;
        String initiatingPackageName;
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        String str = mgn0Var.c.e;
        if (str == null) {
            Application a2 = jgn0.a();
            try {
                if (BuildInfo.n()) {
                    str = "ru.vk.store";
                } else if (gz80.a(30)) {
                    installSourceInfo = a2.getPackageManager().getInstallSourceInfo(a2.getPackageName());
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (originatingPackageName != null && initiatingPackageName != null && (a2.getPackageManager().getApplicationInfo(initiatingPackageName, 0).flags & 1) != 0) {
                        installingPackageName = originatingPackageName;
                    }
                    str = installingPackageName;
                } else {
                    str = a2.getPackageManager().getInstallerPackageName(a2.getPackageName());
                }
            } catch (Throwable unused) {
                str = "unknown_pkg";
            }
        }
        return str == null ? "unknown_pkg" : str;
    }

    @Override // xsna.xwv0
    public final WebApiApplication v() {
        return this.b.m();
    }

    @Override // xsna.xwv0
    public final io.reactivex.rxjava3.disposables.c w(io.reactivex.rxjava3.disposables.c cVar) {
        bug0.c(cVar);
        return cVar;
    }

    @Override // xsna.xwv0
    public final String x(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        String str = "";
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    str = str + '&' + next + B5.U + brm0.y(URLEncoder.encode(optJSONObject.get(next).toString(), B5.O), "+", "%20");
                } catch (JSONException unused) {
                }
            }
        }
        return str;
    }

    @Override // xsna.xwv0
    public final Long y() {
        return this.b.y();
    }

    @Override // xsna.fvv0
    public final void z(tpn0 tpn0Var) {
        this.h = tpn0Var;
    }

    @Override // xsna.xwv0
    public gvv0 getView() {
        return this.a;
    }
}
