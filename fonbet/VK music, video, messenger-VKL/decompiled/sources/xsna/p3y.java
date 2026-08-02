package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonMissingParams;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.core.js.bridge.api.events.BecameInteractive$Parameters;
import com.vk.superapp.core.js.bridge.api.events.BecameInteractive$Response;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Parameters;
import com.vk.superapp.core.js.bridge.api.events.ChangeFragment$Response;
import com.vk.superapp.core.js.bridge.api.events.Close$Error;
import com.vk.superapp.core.js.bridge.api.events.Close$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetClientVersion$Error;
import com.vk.superapp.core.js.bridge.api.events.GetClientVersion$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetClientVersion$Response;
import com.vk.superapp.core.js.bridge.api.events.GetConfig$Error;
import com.vk.superapp.core.js.bridge.api.events.GetConfig$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetConfig$Response;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Parameters;
import com.vk.superapp.core.js.bridge.api.events.Init$Error;
import com.vk.superapp.core.js.bridge.api.events.Init$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SendCustomEvent$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SendCustomEvent$Response;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageGet$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Parameters;
import com.vk.superapp.core.js.bridge.api.events.UpdateConfig$Response;
import com.vk.superapp.core.js.bridge.api.events.ViewHide$Response;
import com.vk.superapp.core.js.bridge.api.events.ViewRestore$Response;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import xsna.i19;
import xsna.k3y;
import xsna.lvv0;
import xsna.mgn0;
import xsna.p2y;

/* compiled from: JsCoreDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class p3y extends z46 implements k3y {
    public static final Rect m = new Rect(0, 0, 0, 0);
    public xwv0 d;
    public final com.vk.superapp.base.js.bridge.b e;
    public final os9 f;
    public final bpn0 g;
    public final bpn0 h;
    public boolean i;
    public Rect j;
    public final long k;
    public final bpn0 l;

    public p3y(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, s13 s13Var, os9 os9Var, awz awzVar) {
        super(xwv0Var, 4);
        this.d = xwv0Var;
        this.e = bVar;
        this.f = os9Var;
        this.g = new bpn0(new bzj(this, 21));
        this.h = new bpn0(new nuj(this, 16));
        this.j = m;
        this.k = System.currentTimeMillis();
        this.l = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(18));
    }

    @Override // xsna.k3y
    public final void B0(String str) {
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            xwv0Var.O(mvv0.a);
        }
        this.e.n(new JsMethod("VKWebAppViewHide"), new ViewHide$Response(null, new ViewHide$Response.Data(str, null), null, 1, null));
    }

    @Override // xsna.j3y
    public final void C(p2y<Init$Parameters> p2yVar) {
        final String b = p2yVar.b();
        sf3.b("VKWebAppInit", this.e, b);
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            tvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppInit"), new Init$Error(null, new Init$Error.Data(Init$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
        } else if (this.i) {
            X0().b(b, false);
        } else {
            final boolean z = epx.f(p2yVar.a().c(), Boolean.TRUE) && m();
            qro0.c(new gzs() { // from class: xsna.n3y
                @Override // xsna.gzs
                public final Object invoke() {
                    p3y p3yVar = p3y.this;
                    xwv0 xwv0Var = p3yVar.d;
                    r6y r6yVar = (r6y) p3yVar.f.c;
                    if (xwv0Var != null && !xwv0Var.i()) {
                        xwv0 xwv0Var2 = p3yVar.d;
                        WebApiApplication v = xwv0Var2 != null ? xwv0Var2.v() : null;
                        if (v != null && v.g()) {
                            v.r = true;
                        }
                        xc80 xc80Var = r6yVar.v;
                        if (xc80Var != null) {
                            xc80Var.t(true);
                        }
                        xc80 xc80Var2 = r6yVar.v;
                        if (xc80Var2 != null) {
                            xc80Var2.b(z);
                        }
                        r6yVar.R().y();
                        r6yVar.u = true;
                        p3yVar.X0().b(b, true);
                        p3yVar.i = true;
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.j3y
    public final void J0(p2y<GetLaunchParams$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        String b = p2yVar.b();
        sf3.b("VKWebAppGetLaunchParams", this.e, b);
        xwv0 xwv0Var = this.d;
        Long valueOf = xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null;
        if (this.d == null || valueOf == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            L0().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        GetLaunchParams$Parameters a = p2yVar.a();
        xwv0 xwv0Var2 = this.d;
        String c = xwv0Var2 != null ? xwv0Var2.c() : null;
        Uri parse = Uri.parse(c);
        xwv0 xwv0Var3 = this.d;
        Uri parse2 = Uri.parse(xwv0Var3 != null ? xwv0Var3.a() : null);
        String queryParameter = parse.getQueryParameter("vk_ref");
        if (queryParameter == null) {
            queryParameter = parse2.getQueryParameter("vk_ref");
        }
        String str = queryParameter;
        if (str == null || drm0.N(str) || c == null || drm0.N(c)) {
            L0().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        String queryParameter2 = parse.getQueryParameter("vk_group_id");
        Long n = queryParameter2 != null ? arm0.n(queryParameter2) : null;
        String queryParameter3 = parse.getQueryParameter("vk_profile_id");
        Long n2 = queryParameter3 != null ? arm0.n(queryParameter3) : null;
        xwv0 xwv0Var4 = this.d;
        if (xwv0Var4 == null || (view = xwv0Var4.getView()) == null || (D6 = view.D6()) == null) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        D6.b((vdx0Var != null ? vdx0Var : null).d().W(valueOf.longValue(), str, n, n2).subscribe(new c2y(new defpackage.y(13, this, b), 1), new m3y(new k8(19, this, a), 0)));
    }

    @Override // xsna.z46
    public final xwv0 L() {
        return this.d;
    }

    public final tvp L0() {
        return (tvp) this.g.getValue();
    }

    @Override // xsna.j3y
    public final void N(p2y<GetConfig$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetConfig", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            tvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppGetConfig"), new GetConfig$Error(null, new GetConfig$Error.Data(GetConfig$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
        } else {
            y1n0 X0 = X0();
            GetConfig$Response.Data w0 = w0(b);
            X0.getClass();
            com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppGetConfig"), new GetConfig$Response(null, w0, b, 1, null), null, null, false, null, 60);
        }
    }

    @Override // xsna.j3y
    public final void O(p2y<StorageGet$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppStorageGet"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        StorageGet$Parameters a = p2yVar.a();
        String d = a.d();
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            long appId = xwv0Var.getAppId();
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null || (D6 = view.D6()) == null) {
                return;
            }
            vdx0 vdx0Var = e370.e;
            D6.b((vdx0Var != null ? vdx0Var : null).s().b(appId, (String[]) a.c().toArray(new String[0])).subscribe(new ir0(new lfa(7, this, d), 20), new lz(new wqb(10, this, d), 18)));
        }
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppBecameInteractive(String str) {
        k3y.a.VKWebAppBecameInteractive(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppCallAPIMethod(String str) {
        k3y.a.VKWebAppCallAPIMethod(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppChangeFragment(String str) {
        k3y.a.VKWebAppChangeFragment(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppClose(String str) {
        k3y.a.VKWebAppClose(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetClientVersion(String str) {
        k3y.a.VKWebAppGetClientVersion(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetConfig(String str) {
        k3y.a.VKWebAppGetConfig(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetLaunchParams(String str) {
        k3y.a.VKWebAppGetLaunchParams(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppInit(String str) {
        k3y.a.VKWebAppInit(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppSendCustomEvent(String str) {
        k3y.a.VKWebAppSendCustomEvent(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppSetViewSettings(String str) {
        k3y.a.VKWebAppSetViewSettings(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppStorageGet(String str) {
        k3y.a.VKWebAppStorageGet(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppStorageSet(String str) {
        k3y.a.VKWebAppStorageSet(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppUpdateConfig(String str) {
        k3y.a.VKWebAppUpdateConfig(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppViewHide(String str) {
        k3y.a.VKWebAppViewHide(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppViewRestore(String str) {
        k3y.a.VKWebAppViewRestore(this, str);
    }

    public final y1n0 X0() {
        return (y1n0) this.h.getValue();
    }

    @Override // xsna.j3y
    public final void Z0(p2y<StorageSet$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppStorageSet"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            L0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        StorageSet$Parameters a = p2yVar.a();
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            long appId = xwv0Var.getAppId();
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null || (D6 = view.D6()) == null) {
                return;
            }
            vdx0 vdx0Var = e370.e;
            D6.b((vdx0Var != null ? vdx0Var : null).s().a(appId, a.d(), a.f()).subscribe(new qz(new td0(22, this, a), 24), new bf2(new yu1(13, this, a), 24)));
        }
    }

    @Override // xsna.j3y
    public final void i1(p2y<CallAPIMethod$Parameters> p2yVar) {
        String str;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        VkUiView view2;
        io.reactivex.rxjava3.disposables.b D62;
        this.e.k(new JsMethod("VKWebAppCallAPIMethod"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        int i = 0;
        if (p2yVar.a instanceof p2y.a) {
            L0().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_MISSING_PARAMS, null, null, new Responses$ReasonMissingParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 131062, null), p2yVar.b(), 1, null));
            return;
        }
        CallAPIMethod$Parameters a = p2yVar.a();
        MapBuilder a2 = q9y.a(a.d());
        String e = a.e();
        if (epx.f(a.f(), Boolean.TRUE)) {
            xwv0 xwv0Var = this.d;
            if (xwv0Var == null || (view2 = xwv0Var.getView()) == null || (D62 = view2.D6()) == null) {
                return;
            }
            D62.b(io.reactivex.rxjava3.core.q.T(i19.b.a).subscribe(new o3y(new nm1(16, this, e), i)));
            return;
        }
        if (((Boolean) this.l.getValue()).booleanValue()) {
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null) {
                return;
            }
            xwv0Var2.getAppId();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.getClass();
            o2l.a.getClass();
            String a3 = o2l.a();
            if (a3.length() == 0) {
                mgn0 mgn0Var = dgn0.a;
                mgn0 mgn0Var2 = dgn0.a;
                if (mgn0Var2 == null) {
                    mgn0Var2 = null;
                }
                String invoke = mgn0Var2.e.b.invoke();
                if (invoke.length() == 0) {
                    invoke = "api.".concat(a0a.d);
                }
                a3 = invoke;
            }
            String c = a.c();
            MapBuilder a4 = q9y.a(a.d());
            vdx0 vdx0Var2 = e370.e;
            xwv0Var2.getView().D6().b((vdx0Var2 != null ? vdx0Var2 : null).f().a(a3, c, a4).subscribe(new f2u(new lh(18, this, a), 2), new jz(new a5(10, a, this), 22)));
            return;
        }
        vdx0 vdx0Var3 = e370.e;
        if (vdx0Var3 == null) {
            vdx0Var3 = null;
        }
        vdx0Var3.getClass();
        if (vdx0.b.length() > 0) {
            vdx0 vdx0Var4 = e370.e;
            if (vdx0Var4 == null) {
                vdx0Var4 = null;
            }
            vdx0Var4.getClass();
            str = vdx0.b;
        } else {
            mgn0 mgn0Var3 = dgn0.a;
            mgn0 mgn0Var4 = dgn0.a;
            if (mgn0Var4 == null) {
                mgn0Var4 = null;
            }
            String invoke2 = mgn0Var4.e.b.invoke();
            if (invoke2.length() == 0) {
                invoke2 = zr.a("https://", "api.".concat(a0a.d), "/method");
            }
            str = invoke2;
        }
        String a5 = zr.a("https://", str, "/method");
        xwv0 xwv0Var3 = this.d;
        if (xwv0Var3 != null) {
            xwv0Var3.getAppId();
            xwv0 xwv0Var4 = this.d;
            if (xwv0Var4 == null || (view = xwv0Var4.getView()) == null || (D6 = view.D6()) == null) {
                return;
            }
            vdx0 vdx0Var5 = e370.e;
            D6.b((vdx0Var5 != null ? vdx0Var5 : null).f().b(a5, a.c(), a2).subscribe(new v8(new k82(12, this, e), 25), new k5(new defpackage.s(19, this, e), 26)));
        }
    }

    @Override // xsna.k3y
    public final void l0() {
        X0().b(null, true);
    }

    @Override // xsna.j3y
    public final void m1(p2y<Close$Parameters> p2yVar) {
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || xwv0Var.i()) {
            return;
        }
        this.e.k(new JsMethod("VKWebAppClose"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            tvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppClose"), new Close$Error(null, new Close$Error.Data(Close$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
            return;
        }
        Close$Parameters a = p2yVar.a();
        String f = a.f();
        if (f != null && !drm0.N(f)) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.j(f);
        }
        xwv0 xwv0Var2 = this.d;
        if (xwv0Var2 != null) {
            xwv0Var2.O(mvv0.a);
        }
        String f2 = a.f();
        if (f2 == null) {
            f2 = "";
        }
        String e = a.e();
        String str = e != null ? e : "";
        b9y c = a.c();
        qro0.c(new defpackage.u(17, this, new lvv0.c(f2, str, c != null ? c.toString() : null, a.d())));
    }

    @Override // xsna.k3y
    public final void p0(Rect rect) {
        if (rect.equals(m)) {
            return;
        }
        this.j = rect;
    }

    @Override // xsna.k3y
    public final void q() {
        this.e.n(new JsMethod("VKWebAppViewRestore"), new ViewRestore$Response(null, new x9y(), null, 1, null));
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
    }

    @Override // xsna.k3y
    public final void t(String str) {
        JsMethod jsMethod = new JsMethod("VKWebAppChangeFragment");
        if (str == null) {
            str = "";
        }
        this.e.n(jsMethod, new ChangeFragment$Response(null, new ChangeFragment$Response.Data(str, null), null, 1, null));
    }

    @Override // xsna.j3y
    public final void t0(p2y<GetClientVersion$Parameters> p2yVar) {
        mgn0.c Y;
        String b = p2yVar.b();
        sf3.b("VKWebAppGetClientVersion", this.e, b);
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            tvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppGetClientVersion"), new GetClientVersion$Error(null, new GetClientVersion$Error.Data(GetClientVersion$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
            return;
        }
        y1n0 X0 = X0();
        xwv0 xwv0Var = this.d;
        X0.getClass();
        if (xwv0Var == null || (Y = xwv0Var.Y()) == null) {
            return;
        }
        GetClientVersion$Response.Data.Platform platform = GetClientVersion$Response.Data.Platform.ANDROID;
        String str = Y.c;
        String str2 = Y.a;
        boolean L = xwv0Var.L();
        com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppGetClientVersion"), new GetClientVersion$Response(null, new GetClientVersion$Response.Data(platform, str, str2, Boolean.valueOf(L), xwv0Var.getUserAgent(), Y.d, Boolean.FALSE, null, xwv0Var.u(), Boolean.valueOf(xwv0Var.s()), null, b, 1152, null), b, 1, null), new yok(GetClientVersion$Response.Data.Platform.class, new GetClientVersion$Response.Data.Platform.Serializer()), null, false, null, 56);
    }

    public final GetConfig$Response.Data w0(String str) {
        Object obj;
        GetConfig$Response.Data.Insets insets;
        String concat;
        VkUiView view;
        Activity B0;
        String str2;
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        boolean M = dhr0.M();
        gfx0 gfx0Var2 = e370.b;
        if (gfx0Var2 == null) {
            gfx0Var2 = null;
        }
        gfx0Var2.getClass();
        xwv0 xwv0Var = this.d;
        mgn0.c Y = xwv0Var != null ? xwv0Var.Y() : null;
        float f = iah0.f().density;
        HashMap i = pn00.i(new Pair("device_id", dgn0.e()));
        Iterator it = RegistrationStatParamsFactory.a().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str3 = (String) pair.d();
            String str4 = (String) pair.g();
            if (str4 != null) {
                i.put(str3, str4);
            }
        }
        Iterator<E> it2 = GetConfig$Response.Data.App.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (brm0.w(((GetConfig$Response.Data.App) obj).name(), Y != null ? Y.a : null, true)) {
                break;
            }
        }
        GetConfig$Response.Data.App app2 = (GetConfig$Response.Data.App) obj;
        GetConfig$Response.Data.Appearance appearance = M ? GetConfig$Response.Data.Appearance.DARK : GetConfig$Response.Data.Appearance.LIGHT;
        xwv0 xwv0Var2 = this.d;
        if (xwv0Var2 == null || !xwv0Var2.r()) {
            insets = null;
        } else {
            Rect rect = this.j;
            insets = new GetConfig$Response.Data.Insets(Float.valueOf(rect.top / f), Float.valueOf(rect.left / f), Float.valueOf(rect.right / f), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        GetConfig$Response.Data.Scheme scheme = M ? GetConfig$Response.Data.Scheme.SPACE_GRAY : GetConfig$Response.Data.Scheme.BRIGHT_LIGHT;
        Integer m2 = (Y == null || (str2 = Y.b) == null) ? null : arm0.m(10, str2);
        long j = this.k;
        xwv0 xwv0Var3 = this.d;
        if (xwv0Var3 == null || (concat = xwv0Var3.D()) == null) {
            concat = "api.".concat(a0a.d);
        }
        String str5 = concat;
        String str6 = (String) i.get("device_id");
        String str7 = (String) i.get("service_group");
        String str8 = (String) i.get("flow_source");
        String str9 = (String) i.get("sak_version");
        String str10 = (String) i.get("external_device_id");
        String str11 = (String) i.get("flow_type");
        String str12 = (String) i.get("parent_app_id");
        String str13 = (String) i.get("auth_app_id");
        String str14 = (String) i.get("provider_app_id");
        String str15 = (String) i.get(O6.X0);
        String str16 = (String) i.get(CommonUrlParts.HUAWEI_OAID);
        xwv0 xwv0Var4 = this.d;
        Boolean valueOf = (xwv0Var4 == null || (view = xwv0Var4.getView()) == null || (B0 = view.B0()) == null) ? null : Boolean.valueOf(B0.isInMultiWindowMode());
        xwv0 xwv0Var5 = this.d;
        return new GetConfig$Response.Data(app2, m2, appearance, insets, scheme, Long.valueOf(j), str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, null, null, null, null, null, valueOf, xwv0Var5 != null ? xwv0Var5.a0() : null, str);
    }

    @Override // xsna.j3y
    public final void x1(p2y<SendCustomEvent$Parameters> p2yVar) {
        String str;
        WebApiApplication v;
        this.e.k(new JsMethod("VKWebAppSendCustomEvent"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        String str2 = null;
        if (p2yVar.a instanceof p2y.a) {
            L0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        SendCustomEvent$Parameters a = p2yVar.a();
        y1n0 X0 = X0();
        xwv0 xwv0Var = this.d;
        X0.getClass();
        String g = a.g();
        if (g == null) {
            g = "";
            str = g;
        } else {
            str = "";
        }
        String c = a.c();
        String f = a.f();
        if (f == null) {
            f = "none";
        }
        String h = a.h();
        if (h == null) {
            h = "type_action";
        }
        String d = a.d();
        if (xwv0Var != null && (v = xwv0Var.v()) != null) {
            str2 = v.w;
        }
        if (str2 == null) {
            str2 = str;
        }
        com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppSendCustomEvent"), new SendCustomEvent$Response(null, new SendCustomEvent$Response.Data(true, a.e()), a.e(), 1, null), null, new kmk(g, c, f, h, d, str2, "mobile_android"), false, null, 52);
    }

    @Override // xsna.k3y
    public final void y() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        GetConfig$Response.Data w0 = w0(null);
        y1n0 X0 = X0();
        X0.getClass();
        Integer d = w0.d();
        String b = w0.b();
        Long x = w0.x();
        String m2 = w0.m();
        String n = w0.n();
        String t = w0.t();
        Iterator<E> it = UpdateConfig$Response.Data.App.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String name = ((UpdateConfig$Response.Data.App) obj).name();
            GetConfig$Response.Data.App c = w0.c();
            if (brm0.w(name, c != null ? c.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.App app2 = (UpdateConfig$Response.Data.App) obj;
        Iterator<E> it2 = UpdateConfig$Response.Data.Appearance.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            String name2 = ((UpdateConfig$Response.Data.Appearance) obj2).name();
            GetConfig$Response.Data.Appearance e = w0.e();
            if (brm0.w(name2, e != null ? e.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.Appearance appearance = (UpdateConfig$Response.Data.Appearance) obj2;
        Iterator<E> it3 = UpdateConfig$Response.Data.Scheme.h().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            String name3 = ((UpdateConfig$Response.Data.Scheme) obj3).name();
            GetConfig$Response.Data.Scheme v = w0.v();
            if (brm0.w(name3, v != null ? v.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.Scheme scheme = (UpdateConfig$Response.Data.Scheme) obj3;
        Iterator<E> it4 = UpdateConfig$Response.Data.Adaptivity.h().iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            String name4 = ((UpdateConfig$Response.Data.Adaptivity) obj4).name();
            GetConfig$Response.Data.Adaptivity a = w0.a();
            if (brm0.w(name4, a != null ? a.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.Adaptivity adaptivity = (UpdateConfig$Response.Data.Adaptivity) obj4;
        Iterator<E> it5 = UpdateConfig$Response.Data.BackButton.h().iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            String name5 = ((UpdateConfig$Response.Data.BackButton) obj5).name();
            GetConfig$Response.Data.BackButton g = w0.g();
            if (brm0.w(name5, g != null ? g.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.BackButton backButton = (UpdateConfig$Response.Data.BackButton) obj5;
        Iterator<E> it6 = UpdateConfig$Response.Data.Integration.h().iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it6.next();
            String name6 = ((UpdateConfig$Response.Data.Integration) obj6).name();
            GetConfig$Response.Data.Integration p = w0.p();
            if (brm0.w(name6, p != null ? p.name() : null, true)) {
                break;
            }
        }
        UpdateConfig$Response.Data.Integration integration = (UpdateConfig$Response.Data.Integration) obj6;
        GetConfig$Response.Data.Insets o = w0.o();
        com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppUpdateConfig"), new UpdateConfig$Response(null, new UpdateConfig$Response.Data(app2, d, appearance, o != null ? new UpdateConfig$Response.Data.Insets(o.d(), o.b(), o.c(), o.a()) : null, scheme, x, b, w0.h(), w0.w(), w0.j(), w0.u(), w0.i(), w0.k(), w0.r(), w0.f(), w0.s(), w0.l(), w0.q(), m2, n, adaptivity, backButton, integration, w0.y(), w0.z(), t), null, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.j3y
    public final void y1(p2y<BecameInteractive$Parameters> p2yVar) {
        String b = p2yVar.b();
        xwv0 xwv0Var = this.d;
        WebApiApplication v = xwv0Var != null ? xwv0Var.v() : null;
        if (v != null && v.e()) {
            sf3.b("VKWebAppSendCustomEvent", this.e, b);
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null) {
                return;
            }
            if (p2yVar.a instanceof p2y.a) {
                L0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
                return;
            }
            xwv0Var2.h2();
        }
        y1n0 X0 = X0();
        X0.getClass();
        com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppBecameInteractive"), new BecameInteractive$Response(null, new BecameInteractive$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.j3y
    public final void z(p2y<SetViewSettings$Parameters> p2yVar) {
        String b = p2yVar.b();
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            WebApiApplication v = xwv0Var.v();
            if (v == null || v.y != 0) {
                sf3.b("VKWebAppSetViewSettings", this.e, b);
                xwv0 xwv0Var2 = this.d;
                if (xwv0Var2 != null && xwv0Var2.q()) {
                    L0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
                } else if (p2yVar.a instanceof p2y.a) {
                    L0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
                } else {
                    qro0.c(new mi1(this, p2yVar.a(), b, 4));
                }
            }
        }
    }

    @Override // xsna.k3y
    public final void U0() {
    }
}
