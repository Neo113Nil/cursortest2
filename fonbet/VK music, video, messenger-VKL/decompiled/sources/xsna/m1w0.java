package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.O6;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.js.bridge.events.EventNames;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.chromium.base.TimeUtils;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bex0;
import xsna.svv0;
import xsna.u13;

/* compiled from: VkWebBrowser.kt */
/* loaded from: classes6.dex */
public final class m1w0 implements mfu0 {
    public final tvv0 a;
    public final xc80 b;
    public final v1w0 c;
    public final fvv0 d;
    public final utg0 e;
    public final s93 f;
    public fgx0 g;
    public final cgx0 h;
    public final dgx0 i;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m1w0(tvv0 tvv0Var, v93 v93Var, agu0 agu0Var, v1w0 v1w0Var, wwv0 wwv0Var, n1w0 n1w0Var) {
        t93 t93Var;
        Long n;
        s1w0 s1w0Var = v93Var.d;
        this.a = tvv0Var;
        this.b = agu0Var;
        this.c = v1w0Var;
        this.d = wwv0Var;
        this.e = new utg0(this, 9);
        this.h = new cgx0(agu0Var, n1w0Var);
        this.i = new dgx0(agu0Var, new wpx0(1, v93Var, this));
        svv0 data = tvv0Var.getData();
        de3 de3Var = v93Var.a;
        u13 b = de3Var.b(data.a());
        boolean z = false;
        if (b != null) {
            boolean z2 = data instanceof svv0.a;
            if (z2) {
                WebView webView = b.a;
                Context context = webView != null ? webView.getContext() : null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && activity.isDestroyed()) {
                    de3Var.remove(((svv0.a) data).a.b);
                }
            }
            ArrayList o = e43.o("vk_ts", "sign");
            String c = data.c();
            if (z2 && ((svv0.a) data).a.f()) {
                String queryParameter = Uri.parse(c).getQueryParameter("timestamp");
                Long valueOf = (queryParameter == null || (n = arm0.n(queryParameter)) == null) ? null : Long.valueOf(n.longValue() * 1000);
                if (valueOf != null && valueOf.longValue() + TimeUtils.MILLISECONDS_PER_DAY > qni0.a()) {
                    o.add("api_hash");
                    o.add(O6.e1);
                    o.add("lc_name");
                    o.add("timestamp");
                    o.add("secret");
                    o.add(SharedKt.PARAM_ACCESS_TOKEN);
                    o.add("ref");
                    o.add("referrer");
                    o.add("fast");
                }
            }
            if (!((b.c == null || data.c() == null) ? false : !jeq0.d(Uri.parse(r10), o).buildUpon().fragment("").build().toString().equals(jeq0.d(Uri.parse(r11), o).buildUpon().fragment("").build().toString()))) {
                t93Var = new t93(s1w0Var, b, data);
                if (t93Var == null) {
                    t93Var.e = true;
                    t93Var.b(wwv0Var);
                } else {
                    svv0 data2 = tvv0Var.getData();
                    u13 u13Var = new u13(v93Var.b.create(), v93Var.c.get());
                    if ((data2 instanceof svv0.a) && ((svv0.a) data2).a.g()) {
                        z = true;
                    }
                    u13Var.h = z;
                    if (data2.b()) {
                        u13Var.l = true;
                        de3Var.c(data2.a(), u13Var);
                    }
                    t93Var = new t93(s1w0Var, u13Var, data2);
                }
                this.f = t93Var;
            }
            de3Var.remove(data.a());
        }
        t93Var = null;
        if (t93Var == null) {
        }
        this.f = t93Var;
    }

    @Override // xsna.mfu0
    public final void A(JsApiMethodType jsApiMethodType, Throwable th) {
        s93 s93Var = this.f;
        if (th != null) {
            s93Var.g().a.z(jsApiMethodType, th);
        } else {
            s93Var.g().a.y(jsApiMethodType);
        }
    }

    @Override // xsna.mfu0
    public final void B(JsMethod jsMethod) {
        this.f.g().a.b.remove(jsMethod);
    }

    @Override // xsna.mfu0
    public final boolean C() {
        s93 s93Var = this.f;
        try {
            WebView view = s93Var.getView();
            if (view == null) {
                return false;
            }
            if (!view.canGoBack()) {
                return false;
            }
            WebView view2 = s93Var.getView();
            if (view2 != null) {
                view2.goBack();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // xsna.mfu0
    public final String D(EventNames eventNames) {
        return this.f.g().a.h.get(eventNames);
    }

    @Override // xsna.mfu0
    public final void a() {
        this.f.g().a.Q().a();
    }

    @Override // xsna.mfu0
    public final void b(Context context) {
        this.f.g().a.Q().b(context);
    }

    @Override // xsna.mfu0
    public final void c(int i, Intent intent, boolean z) {
        this.h.h.c(i, intent, z);
    }

    @Override // xsna.mfu0
    public final boolean d(int i) {
        return this.h.h.d(i);
    }

    @Override // xsna.mfu0
    public final void destroy() {
        this.f.a();
        this.g = null;
    }

    @Override // xsna.mfu0
    public final void e(Context context) {
        this.f.g().a.Q().e(context);
    }

    @Override // xsna.mfu0
    public final void f() {
        this.f.g().a.Q().f();
    }

    @Override // xsna.mfu0
    public final void g(aj0 aj0Var, List<? extends AdvertisementType> list, WebAdConfig webAdConfig) {
        this.f.g().a.Q().g(aj0Var, list, webAdConfig);
    }

    @Override // xsna.mfu0
    public final s93 getState() {
        return this.f;
    }

    @Override // xsna.mfu0
    public final void h(Bundle bundle) {
        WebView view = this.f.getView();
        if (view != null) {
            view.saveState(bundle);
        }
    }

    @Override // xsna.mfu0
    public final void i() {
        this.f.g().a.Q().i();
    }

    @Override // xsna.mfu0
    public final void j(JsApiMethodType jsApiMethodType, JSONObject jSONObject) {
        this.f.g().a.A(jsApiMethodType, jSONObject);
    }

    @Override // xsna.mfu0
    public final void k(Intent intent, boolean z) {
        int i = cgx0.i;
        this.h.h.a(intent, z, new m1x0(2));
    }

    @Override // xsna.mfu0
    public final String l() {
        String url;
        WebView view = this.f.getView();
        return (view == null || (url = view.getUrl()) == null) ? "" : url;
    }

    @Override // xsna.mfu0
    public final void m(JsApiMethodType jsApiMethodType, VkAppsErrors.Client client, Pair<String, ? extends Object> pair, String str) {
        bex0.a.a(this.f.g().a, jsApiMethodType, client, str, pair, null, 48);
    }

    @Override // xsna.mfu0
    public final void n(JsApiMethodType jsApiMethodType, JSONObject jSONObject) {
        bex0.a.b(this.f.g().a, jsApiMethodType, jSONObject, null, 8);
    }

    @Override // xsna.mfu0
    public final boolean o() {
        this.f.g().a.getClass();
        return jgn0.c();
    }

    @Override // xsna.mfu0
    public final WebView p(FrameLayout frameLayout, Bundle bundle, g680 g680Var) {
        dgx0 dgx0Var = this.i;
        cgx0 cgx0Var = this.h;
        s93 s93Var = this.f;
        try {
            s93Var.g().a.v = this.b;
            WebView view = s93Var.getView();
            if (view == null) {
                xgx0.a.getClass();
                xgx0.b("Failed to prepare WebView: WebView is null");
                return null;
            }
            if (!s93Var.q() && bundle != null) {
                view.restoreState(bundle);
            }
            this.g = new fgx0(view, dgx0Var);
            cgx0Var.b = frameLayout;
            cgx0Var.a = new igx0(s93Var, g680Var);
            u13.a i = s93Var.i();
            cgx0Var.onShowCustomView(i.a, i.b);
            fgx0 fgx0Var = this.g;
            dgx0Var.getClass();
            WebView webView = fgx0Var.a;
            webView.setWebViewClient(dgx0Var);
            webView.setWebChromeClient(cgx0Var);
            fgx0Var.b = dgx0Var;
            this.c.a(view);
            view.addJavascriptInterface(s93Var.g().a, "AndroidBridge");
            s93Var.g().a.G(this.g);
            if (s93Var.q()) {
                s200.s = false;
                return view;
            }
            view.getSettings().setLoadsImagesAutomatically(false);
            return view;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.c("Failed to prepare WebView", e);
            qro0.e(200L, new pvh0(this, 23));
            return null;
        }
    }

    @Override // xsna.mfu0
    public final void pause() {
        WebView view = this.f.getView();
        if (view != null) {
            view.onPause();
        }
    }

    @Override // xsna.mfu0
    public final void q(String str) {
        WebView view = this.f.getView();
        if (view != null) {
            nr2.J(view, str);
        }
    }

    @Override // xsna.mfu0
    public final void r(JsApiEvent jsApiEvent, JSONObject jSONObject) {
        this.f.g().a.x(jsApiEvent, jSONObject);
    }

    @Override // xsna.mfu0
    public final void resume() {
        fvv0 fvv0Var = this.d;
        s93 s93Var = this.f;
        s93Var.b(fvv0Var);
        r6y r6yVar = s93Var.g().a;
        if (r6yVar.u) {
            r6yVar.R().y();
            r6yVar.u = true;
        }
        WebView view = s93Var.getView();
        if (view != null) {
            view.onResume();
        }
    }

    @Override // xsna.mfu0
    public final void s(EventNames eventNames, bd6 bd6Var) {
        r6y r6yVar = this.f.g().a;
        Map<EventNames, String> map = r6yVar.h;
        String str = map.get(eventNames);
        if (str != null) {
            bd6Var = bd6Var.a(str);
        }
        x9y h = r6yVar.j.toJsonTree(bd6Var).h();
        EventNames.Companion.getClass();
        r6yVar.m("VKWebApp" + eventNames.name(), null, new JSONObject(h.toString()));
        WebView r = r6yVar.r();
        if (r != null) {
            r.post(new zs6(0, r6yVar, h));
        }
        map.remove(eventNames);
        xgx0.a.getClass();
        xgx0.a("Send event to js for event: " + eventNames);
    }

    @Override // xsna.mfu0
    public final boolean t(boolean z) {
        if (z) {
            q("javascript:localStorage.clear()");
        }
        return jgn0.b().remove(this.a.getAppId()) != null;
    }

    @Override // xsna.mfu0
    public final void u() {
        r6y r6yVar = this.f.g().a;
        r6yVar.R().y();
        r6yVar.u = true;
    }

    @Override // xsna.mfu0
    public final void v(String str, Map map, boolean z) {
        String url;
        s93 s93Var = this.f;
        if (z) {
            WebView view = s93Var.getView();
            if (view != null) {
                view.reload();
                return;
            }
            return;
        }
        WebView view2 = s93Var.getView();
        if (epx.f((view2 == null || (url = view2.getUrl()) == null) ? null : drm0.l0(url, '#'), str != null ? drm0.l0(str, '#') : null)) {
            this.i.f = true;
        }
        if (str != null) {
            WebView view3 = s93Var.getView();
            if (view3 != null && zq70.C(Features.VISUAL_STATE_CALLBACK)) {
                try {
                    utg0 utg0Var = this.e;
                    int i = mix0.a;
                    oix0.a.getClass();
                    my2.i(view3, 1337L, utg0Var);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
            }
            if (map.isEmpty()) {
                WebView view4 = s93Var.getView();
                if (view4 != null) {
                    view4.loadUrl(str);
                    return;
                }
                return;
            }
            WebView view5 = s93Var.getView();
            if (view5 != null) {
                view5.loadUrl(str, map);
            }
        }
    }

    @Override // xsna.mfu0
    public final void w() {
        WebSettings settings;
        WebView view = this.f.getView();
        if (view == null || (settings = view.getSettings()) == null) {
            return;
        }
        settings.setLoadsImagesAutomatically(true);
    }

    @Override // xsna.mfu0
    public final void x(EventNames eventNames, com.vk.superapp.base.js.bridge.a aVar) {
        this.f.g().a.w(eventNames, aVar);
    }

    @Override // xsna.mfu0
    public final void y(Rect rect) {
        this.f.g().a.R().p0(rect);
    }

    @Override // xsna.mfu0
    public final void z(wlb0 wlb0Var) {
        r6y r6yVar = this.f.g().a;
        r6yVar.getClass();
        int i = uyp.a;
        EventNames eventNames = EventNames.AddToFavorites;
        r6yVar.w(eventNames, wlb0Var.c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), r6yVar.h.get(eventNames), 1, null)));
    }
}
