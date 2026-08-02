package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.web.view.marker.di.WebViewMarkerComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;

/* compiled from: VKSuperAppMiniAppFragment.kt */
/* loaded from: classes6.dex */
public class hgr0 extends com.vk.superapp.browser.ui.a {
    public static final Regex X = new Regex("(^|[a-z0-9.\\-]*\\.)test\\.mvk\\.com");
    public static final Regex Y = new Regex(".+miniapp\\.music\\..+/checkout.*");
    public static final Regex Z = new Regex("data:*+/*+");
    public final bpn0 S = new bpn0(new v5n0(this, 10));
    public final bpn0 T = new bpn0(new tsk0(this, 17));
    public izs<? super lvv0, s3q0> U = new xim0(this, 5);
    public final bpn0 V = new bpn0(new dei0(this, 20));
    public final Object W = msy.a(LazyThreadSafetyMode.NONE, new iml0(this, 10));

    /* compiled from: VKSuperAppMiniAppFragment.kt */
    public static final class a {
        public a() {
        }
    }

    /* compiled from: VKSuperAppMiniAppFragment.kt */
    public static final class b extends agu0 {
        public final /* synthetic */ kgr0 j;

        public b(kgr0 kgr0Var, hgr0 hgr0Var, wwv0 wwv0Var, tzu0 tzu0Var, rrn0 rrn0Var, kcj0 kcj0Var, l6n0 l6n0Var) {
            super(hgr0Var, wwv0Var, tzu0Var, rrn0Var, kcj0Var, l6n0Var);
            this.j = kgr0Var;
        }

        @Override // xsna.agu0, xsna.xc80
        public final boolean A() {
            agu0 agu0Var = this.j.b;
            return true;
        }

        @Override // xsna.agu0, xsna.xc80
        public final void B(Throwable th) {
            this.j.B(th);
        }

        @Override // xsna.agu0, xsna.xc80
        public final VkBrowserMenuFactory a() {
            return this.j.d.a();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void b(boolean z) {
            this.j.b(z);
        }

        @Override // xsna.agu0, xsna.yc80
        public final void c(ArrayList arrayList, zx90 zx90Var, gwg gwgVar) {
            this.j.c(arrayList, zx90Var, gwgVar);
        }

        @Override // xsna.agu0, xsna.xc80
        public final boolean i() {
            return this.j.b.c.i();
        }

        @Override // xsna.agu0, xsna.xc80
        public final boolean j(String str) {
            return hgr0.this.Ma(str);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void k() {
            this.j.k();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void l(int i, String str) {
            this.j.getClass();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void m(boolean z) {
            this.j.m(z);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void n() {
            this.j.n();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void o(WebIdentityContext webIdentityContext) {
            this.j.o(webIdentityContext);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void p(Intent intent) {
            this.j.p(intent);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void q() {
            this.j.q();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void r() {
            this.j.getClass();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void s() {
            this.j.s();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void t(boolean z) {
            this.j.t(z);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void u(Intent intent) {
            this.j.u(intent);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void v(int i, Intent intent) {
            this.j.v(i, intent);
        }

        @Override // xsna.agu0, xsna.xc80
        public final void w() {
            this.j.w();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void x() {
            this.j.x();
        }

        @Override // xsna.agu0, xsna.xc80
        public final void y(upn0 upn0Var) {
            this.j.y(upn0Var);
        }

        @Override // xsna.agu0, xsna.xc80
        public final Map<VkUiCommand, dvv0> z(long j) {
            return this.j.z(j);
        }
    }

    /* compiled from: VKSuperAppMiniAppFragment.kt */
    public static final class c {
        public c() {
        }

        public final vdr0 a() {
            return (vdr0) hgr0.this.V.getValue();
        }

        public final ggu0 b() {
            Regex regex = hgr0.X;
            return hgr0.this.vn();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public final agu0 En() {
        return new b(new kgr0(new ofc0(this, 18), new c(), super.En()), this, yn(), (tzu0) this.w.getValue(), new rrn0(this, 8), new kcj0(this, 11), new l6n0(this, 8));
    }

    @Override // com.vk.superapp.browser.ui.a, com.vk.superapp.base.js.bridge.VkUiView
    public final boolean Hb(zhx0 zhx0Var) {
        String str;
        WebServiceInfo webServiceInfo = zhx0Var.a.i;
        if (webServiceInfo == null || (str = webServiceInfo.b) == null) {
            return false;
        }
        return sxc0.a().h(this.B, str, webServiceInfo.e, new w2j0(this, 11));
    }

    @Override // com.vk.superapp.browser.ui.a
    public final void Hn(VkBrowserActivity.b bVar) {
        this.U = bVar;
    }

    public final ok8 Jn() {
        z1h0 parentFragment = getParentFragment();
        if (parentFragment instanceof ok8) {
            return (ok8) parentFragment;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
    
        if (xsna.epx.f(com.vk.core.preference.Preference.g(r3).getString("vkUiHostUri", "static.".concat(xsna.a0a.d)), r0) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Ma(String str) {
        boolean z;
        boolean z2;
        ok8 Jn;
        String url;
        String str2 = str;
        ok8 Jn2 = Jn();
        boolean Ma = Jn2 != null ? Jn2.Ma(str2) : false;
        if (Ma) {
            return Ma;
        }
        ok8 Jn3 = Jn();
        if (Jn3 != null) {
            str2 = Jn3.B9(str2);
        }
        String str3 = str2;
        if (!yn().S()) {
            String host = Uri.parse(str3).getHost();
            ArrayList a2 = e43.a("vk.com", "vk.ru");
            if (!a2.contains(a0a.d)) {
                a2.add(a0a.d);
            }
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (drm0.D(str3, "static." + ((String) it.next()), false)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            ArrayList a3 = e43.a("vk.com", "vk.ru");
            if (!a3.contains(a0a.d)) {
                a3.add(a0a.d);
            }
            if (!a3.isEmpty()) {
                Iterator it2 = a3.iterator();
                while (it2.hasNext()) {
                    if (epx.f(host, "id." + ((String) it2.next()))) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z && !z2 && !drm0.D(str3, "static.vkontakte.com", false)) {
                if (brm0.B(str3, "https://prod-app" + yn().b.getAppId(), false) && drm0.D(str3, "vk-apps", false)) {
                    un().v(str3, jgp.b, false);
                    return false;
                }
                Boolean bool = null;
                if (!BuildInfo.m()) {
                    String valueOf = String.valueOf(Uri.parse(str3).getHost());
                    if (!X.f(valueOf)) {
                        if (!valueOf.equals("static.".concat(a0a.d))) {
                            Context context = e43.a;
                            if (context == null) {
                                context = null;
                            }
                        }
                    }
                }
                if (((Regex) s06.a.getValue()).f(str3)) {
                    Context context2 = this.M;
                    if (context2 != null) {
                        try {
                            context2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3)));
                        } catch (Throwable th) {
                            xgx0.a.getClass();
                            xgx0.c("bank application by url=" + str3 + " not started", th);
                        }
                    }
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        boolean c2 = maz.c(xwk.d().e(), activity, str3, new LaunchContext(false, false, false, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null, String.valueOf(yn().b.getAppId()), null, null, null, "miniapps", null, false, false, false, null, null, null, null, null, wn().l(), false, null, null, null, 65011159), null, null, 24);
                        WebView view = un().getState().getView();
                        if (view != null && (url = view.getUrl()) != null) {
                            bool = Boolean.valueOf(Y.f(url));
                        }
                        boolean f = epx.f(bool, Boolean.TRUE);
                        if (c2 && f && (Jn = Jn()) != null) {
                            Jn.close();
                        }
                    }
                }
                return true;
            }
        } else if (!epx.f(str3, vn().d.l()) && !yn().o && !Z.a(str3)) {
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return true;
            }
            xwk.d().e().a(activity2, str3);
            return true;
        }
        return false;
    }

    @Override // com.vk.superapp.browser.ui.a, com.vk.superapp.base.js.bridge.VkUiView
    public final boolean R7(boolean z) {
        ((inj0) this.S.getValue()).a(z);
        return true;
    }

    @Override // com.vk.superapp.browser.ui.a, com.vk.superapp.base.js.bridge.VkUiView
    public final boolean Ze(String str, boolean z) {
        ((un3) this.T.getValue()).b(str, z);
        return true;
    }

    @Override // com.vk.superapp.browser.ui.a, com.vk.superapp.base.js.bridge.VkUiView
    public final izs<lvv0, s3q0> ke() {
        return this.U;
    }

    @Override // com.vk.superapp.browser.ui.a
    public final svv0 ln(Bundle bundle) {
        svv0 svv0Var;
        Bundle bundle2;
        ok8 Jn = Jn();
        if (Jn != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null || (bundle2 = parentFragment.getArguments()) == null) {
                bundle2 = bundle;
            }
            svv0Var = Jn.ln(bundle2);
        } else {
            svv0Var = null;
        }
        return svv0Var != null ? svv0Var : super.ln(bundle);
    }

    @Override // com.vk.superapp.browser.ui.a
    public final wwv0 m5(tvv0 tvv0Var) {
        wwv0 m5;
        ok8 Jn = Jn();
        return (Jn == null || (m5 = Jn.m5(tvv0Var)) == null) ? super.m5(tvv0Var) : m5;
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tdr0 m = vn().m();
        yfu0 yfu0Var = m.i;
        if (yfu0Var != null) {
            m.d(yfu0Var, false);
        }
        yfu0 yfu0Var2 = m.j;
        if (yfu0Var2 != null) {
            m.d(yfu0Var2, true);
        }
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        iok0 iok0Var = superappUiRouterBridge instanceof iok0 ? (iok0) superappUiRouterBridge : null;
        if (iok0Var != null) {
            z1h0 parentFragment = getParentFragment();
            ok8 ok8Var = parentFragment instanceof ok8 ? (ok8) parentFragment : null;
            if (ok8Var == null) {
                throw new IllegalStateException("Parent fragment must implement BrowserFragmentContract");
            }
            iok0Var.u0(ok8Var.Xg());
        }
        super.onCreate(bundle);
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = (FrameLayout) onCreateView;
        WebViewMarkerComponent webViewMarkerComponent = (WebViewMarkerComponent) m7m.d(this).mo408a(fpf0.a(WebViewMarkerComponent.class));
        if (webViewMarkerComponent.m7().isEnabled()) {
            TextView a2 = webViewMarkerComponent.Z().a(requireContext(), "VKUI");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            frameLayout.addView(a2, layoutParams);
        }
        return onCreateView;
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        iok0 iok0Var = superappUiRouterBridge instanceof iok0 ? (iok0) superappUiRouterBridge : null;
        if (iok0Var != null) {
            z1h0 parentFragment = getParentFragment();
            ok8 ok8Var = parentFragment instanceof ok8 ? (ok8) parentFragment : null;
            if (ok8Var == null) {
                throw new IllegalStateException("Parent fragment must implement BrowserFragmentContract");
            }
            iok0Var.x0(ok8Var.Xg());
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public i1v0 xn() {
        i1v0 i6yVar;
        r6y R5;
        i1v0 z3;
        ok8 Jn = Jn();
        if (Jn != null && (z3 = Jn.z3(yn())) != null) {
            return z3;
        }
        boolean booleanValue = ((Boolean) this.W.getValue()).booleanValue();
        if (booleanValue) {
            ok8 Jn2 = Jn();
            i6yVar = (Jn2 == null || (R5 = Jn2.R5(yn())) == null) ? null : new igr0(R5);
        } else {
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i6yVar = new i6y(yn());
        }
        return i6yVar == null ? this.m : i6yVar;
    }

    public void Kn() {
    }
}
