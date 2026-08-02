package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutActivity;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.Regex;
import xsna.pgn0;

/* compiled from: VkBrowserOnWebCallback.kt */
/* loaded from: classes6.dex */
public class agu0 implements xc80 {
    public final com.vk.superapp.browser.ui.a b;
    public final wwv0 c;
    public final tzu0 d;
    public final gzs<BrowserPerfState> e;
    public final gzs<ggu0> f;
    public final gzs<mfu0> g;
    public final qnl h = new qnl();
    public final bpn0 i = new bpn0(new yo80(16));

    /* JADX WARN: Multi-variable type inference failed */
    public agu0(com.vk.superapp.browser.ui.a aVar, wwv0 wwv0Var, tzu0 tzu0Var, gzs<BrowserPerfState> gzsVar, gzs<ggu0> gzsVar2, gzs<? extends mfu0> gzsVar3) {
        this.b = aVar;
        this.c = wwv0Var;
        this.d = tzu0Var;
        this.e = gzsVar;
        this.f = gzsVar2;
        this.g = gzsVar3;
    }

    @Override // xsna.xc80
    public boolean A() {
        return true;
    }

    @Override // xsna.xc80
    public void B(Throwable th) {
        com.vk.superapp.browser.ui.a aVar = this.b;
        if (aVar.D) {
            return;
        }
        aVar.yn().p = th;
        aVar.C = false;
        aVar.D = false;
        aVar.In(th);
    }

    @Override // xsna.xc80
    public VkBrowserMenuFactory a() {
        Integer valueOf = Integer.valueOf(R.id.vk_mini_app_about);
        Integer valueOf2 = Integer.valueOf(R.id.vk_mini_app_fave);
        Integer valueOf3 = Integer.valueOf(R.id.vk_mini_app_share);
        Integer valueOf4 = Integer.valueOf(R.id.vk_mini_app_qr);
        Set y0 = rl3.y0(new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, Integer.valueOf(R.id.vk_mini_app_notification), Integer.valueOf(R.id.vk_mini_app_add_to_home), Integer.valueOf(R.id.vk_mini_app_report), Integer.valueOf(R.id.vk_mini_app_cache), Integer.valueOf(R.id.vk_mini_app_delete)});
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0Var.f.getClass();
        Set singleton = Collections.singleton(valueOf4);
        ggu0 invoke = this.f.invoke();
        return new VkBrowserMenuFactory(this.b.requireContext(), this.c, (wc80) invoke.k.getValue(), invoke, izi0.g(y0, singleton), this.g.invoke().getState().f());
    }

    @Override // xsna.yc80
    public void c(ArrayList arrayList, zx90 zx90Var, gwg gwgVar) {
        PermissionHelper.l(PermissionHelper.a, this.b.M, (String[]) arrayList.toArray(new String[0]), new kfg(zx90Var, this, arrayList, 6), gwgVar, 4);
    }

    @Override // xsna.xc80
    public boolean i() {
        return this.c.i();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:21|(7:90|91|(1:106)(1:95)|96|(1:98)(1:104)|(3:100|(1:102)|89)|27)(3:23|(1:25)|89)|(2:28|29)|30|(4:33|(1:85)(1:37)|38|(12:55|56|57|(2:78|(5:82|60|(1:77)(1:64)|65|(2:75|76)(1:(2:71|72)(2:73|74))))|59|60|(1:62)|77|65|(0)|75|76))|86|56|57|(0)|59|60|(0)|77|65|(0)|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a5, code lost:
    
        if (r10.c.o == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (xsna.drm0.D(r11, "static.vkontakte.com", false) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xc80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(String str) {
        Boolean bool;
        boolean z;
        Uri uri;
        boolean z2;
        Uri uri2;
        boolean z3;
        String scheme;
        int hashCode;
        Uri parse = Uri.parse(str);
        if (epx.f(parse.getPath(), "/blocked")) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            wdx0Var.getClass();
            wdx0 wdx0Var2 = e370.f;
            if (wdx0Var2 == null) {
                wdx0Var2 = null;
            }
            this.c.b.getAppId();
            new pgn0.b();
            String str2 = wdx0Var2.c().a;
            wdx0 wdx0Var3 = e370.f;
            if (wdx0Var3 == null) {
                wdx0Var3 = null;
            }
            this.c.b.getAppId();
            new pgn0.b();
            new BanInfo(null, str2, wdx0Var3.c().c);
            wdx0 wdx0Var4 = e370.f;
            if (wdx0Var4 == null) {
                wdx0Var4 = null;
            }
            wdx0Var4.getClass();
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            ((n76) (superappUiRouterBridge != null ? superappUiRouterBridge : null)).z0();
            return true;
        }
        wwv0 wwv0Var = this.c;
        if (wwv0Var.S()) {
            try {
                String queryParameter = parse.getQueryParameter("sak_open_external");
                bool = Boolean.valueOf(queryParameter != null && Integer.parseInt(queryParameter) == 1);
            } catch (Throwable unused) {
                bool = null;
            }
            if (!(bool != null ? bool.booleanValue() : false)) {
                if (!epx.f(str, this.g.invoke().l())) {
                }
                z = true;
            }
            z = false;
        } else {
            if (!drm0.D(str, "static.".concat(a0a.d), false)) {
            }
            z = true;
        }
        try {
            uri = Uri.parse(str);
        } catch (Throwable unused2) {
            uri = null;
        }
        if ((wwv0Var instanceof ezu0) && uri != null) {
            m2v0.a.getClass();
            String host = uri.getHost();
            boolean z4 = host != null && ((Regex) m2v0.c.getValue()).f(host);
            ezu0 ezu0Var = (ezu0) wwv0Var;
            boolean z5 = ezu0Var.t;
            ezu0Var.t = z4;
            if (z4 || z5 || (!((Boolean) this.i.getValue()).booleanValue() && !m2v0.a(uri) && ((scheme = uri.getScheme()) == null || ((hashCode = scheme.hashCode()) == 3765 ? !scheme.equals("vk") : !(hashCode == 1958875067 && scheme.equals("vkontakte")))))) {
                z2 = true;
                uri2 = Uri.parse(str);
                if (uri2 != null) {
                    m2v0.a.getClass();
                    String host2 = uri2.getHost();
                    if (host2 != null && ((Regex) m2v0.e.getValue()).f(host2)) {
                        z3 = true;
                        String scheme2 = parse.getScheme();
                        boolean z6 = scheme2 == null && brm0.B(scheme2, "bank", false);
                        com.vk.superapp.browser.ui.a aVar = this.b;
                        Context context = aVar.M;
                        if (!z || z2 || z3 || context == null) {
                            return false;
                        }
                        if (!z6) {
                            return this.h.a(context, str, aVar.vn().r);
                        }
                        enj.o(aVar.requireContext(), new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse), null);
                        return true;
                    }
                }
                z3 = false;
                String scheme22 = parse.getScheme();
                if (scheme22 == null) {
                }
                com.vk.superapp.browser.ui.a aVar2 = this.b;
                Context context2 = aVar2.M;
                if (z) {
                }
                return false;
            }
        }
        z2 = false;
        uri2 = Uri.parse(str);
        if (uri2 != null) {
        }
        z3 = false;
        String scheme222 = parse.getScheme();
        if (scheme222 == null) {
        }
        com.vk.superapp.browser.ui.a aVar22 = this.b;
        Context context22 = aVar22.M;
        if (z) {
        }
        return false;
    }

    @Override // xsna.xc80
    public void k() {
        BrowserPerfState invoke = this.e.invoke();
        if (invoke.l == 0) {
            invoke.l = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        }
    }

    @Override // xsna.xc80
    public void m(boolean z) {
        if (z) {
            com.vk.superapp.browser.ui.a aVar = this.b;
            FragmentActivity activity = aVar.getActivity();
            if (activity == null) {
                xgx0.a.getClass();
                xgx0.g("activity is null => browser already closed");
            } else {
                if ((activity instanceof VkBrowserActivity) || (activity instanceof ShortcutActivity)) {
                    ((VkSdkActivity) activity).finish();
                    return;
                }
                FragmentManager fragmentManager = aVar.getFragmentManager();
                if (fragmentManager != null) {
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                    aVar2.q(aVar);
                    aVar2.k(true);
                }
            }
        }
    }

    @Override // xsna.xc80
    public void n() {
        this.b.Cn();
    }

    @Override // xsna.xc80
    public void o(WebIdentityContext webIdentityContext) {
        this.d.d(webIdentityContext, true);
    }

    @Override // xsna.xc80
    public void p(Intent intent) {
        WebIdentityContext webIdentityContext;
        if (intent == null || !intent.hasExtra("arg_identity_context") || (webIdentityContext = (WebIdentityContext) intent.getParcelableExtra("arg_identity_context")) == null) {
            return;
        }
        this.d.d(webIdentityContext, true);
    }

    @Override // xsna.xc80
    public void q() {
        BrowserPerfState invoke = this.e.invoke();
        invoke.getClass();
        invoke.j = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
    }

    @Override // xsna.xc80
    public void t(boolean z) {
        upn0 upn0Var;
        if (z) {
            s200.s = false;
        }
        BrowserPerfState invoke = this.e.invoke();
        invoke.getClass();
        invoke.m = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        wwv0 wwv0Var = this.c;
        wwv0Var.e = true;
        io.reactivex.rxjava3.disposables.c cVar = wwv0Var.d;
        if (cVar != null) {
            cVar.dispose();
        }
        com.vk.superapp.browser.ui.a aVar = this.b;
        aVar.C = false;
        if (aVar.yn().e) {
            aVar.D = true;
            ahn0 ahn0Var = aVar.O;
            if (ahn0Var != null) {
                ahn0Var.c(false);
            }
            if (aVar.yn().I()) {
                aVar.vn().d.getState().m(aVar.vn().r());
            }
            tpn0 tpn0Var = aVar.yn().h;
            if (tpn0Var != null && (upn0Var = tpn0Var.e) != null) {
                tpn0Var.a(upn0Var);
            }
            aVar.i0();
        }
    }

    @Override // xsna.xc80
    public void u(Intent intent) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        List<UserId> s0 = superappUiRouterBridge.s0(intent);
        if (s0 == null) {
            this.g.invoke().m(JsApiMethodType.GET_FRIENDS, VkAppsErrors.Client.USER_DENIED, null, null);
            return;
        }
        kfr0 p = this.f.invoke().p();
        p.getClass();
        if (s0.isEmpty()) {
            p.c.m(JsApiMethodType.GET_FRIENDS, VkAppsErrors.Client.USER_DENIED, null, null);
            return;
        }
        vdx0 vdx0Var = e370.e;
        ufn0 v = (vdx0Var != null ? vdx0Var : null).v();
        p.a.getAppId();
        p.b.r.b(v.c(s0).subscribe(new o7y(new bnc0(p, 19), 23), new hdi0(new ehm0(p, 7), 5)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xc80
    public void w() {
        com.vk.superapp.browser.ui.a aVar = this.b;
        if (aVar.L == null) {
            View view = aVar.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                FrameLayout b = aVar.vn().s().b(aVar.getLayoutInflater(), viewGroup);
                aVar.L = b;
                b.setId(R.id.vk_browser_install);
                viewGroup.addView(aVar.L, -1, -1);
            }
        }
        View view2 = aVar.J;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = aVar.I;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        View view4 = aVar.K;
        if (view4 != null) {
            view4.setVisibility(4);
        }
        View view5 = aVar.L;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        View view6 = aVar.L;
        if (view6 != null) {
            ((rxv0) aVar.P.getValue()).a(view6, aVar.yn().b.m(), new qqt0(aVar, 2), new gbt0(aVar, 4));
        }
    }

    @Override // xsna.xc80
    public void x() {
        this.b.i0();
    }

    @Override // xsna.xc80
    public Map<VkUiCommand, dvv0> z(long j) {
        return null;
    }

    @Override // xsna.xc80
    public void r() {
    }

    @Override // xsna.xc80
    public void s() {
    }

    @Override // xsna.xc80
    public void b(boolean z) {
    }

    @Override // xsna.xc80
    public void y(upn0 upn0Var) {
    }

    @Override // xsna.xc80
    public void l(int i, String str) {
    }

    @Override // xsna.xc80
    public void v(int i, Intent intent) {
    }
}
