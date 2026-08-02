package xsna;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.ads.js.bridge.api.events.CheckBannerAd$Error;
import com.vk.superapp.ads.js.bridge.api.events.CheckBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.CheckBannerAd$Response;
import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Error;
import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.HideBannerAd$Error;
import com.vk.superapp.ads.js.bridge.api.events.HideBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.HideBannerAd$Response;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Error;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Error;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Parameters;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonRequestsLimitReached;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import xsna.f1y;
import xsna.p2y;
import xsna.y31;

/* compiled from: JsAdsDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class n1y implements f1y {
    public xwv0 b;
    public final com.vk.superapp.base.js.bridge.b c;
    public final tbg d;
    public final a e;
    public final t9l f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public boolean m;
    public boolean n;
    public int o;
    public final bpn0 p;

    /* compiled from: JsAdsDelegateImpl.kt */
    public static final class a {
        public final zws a;
        public final del0 b;
        public final mel0 c;
        public final mel0 d;
        public final JsAdsDelegateComponentImpl.a e;

        public a(zws zwsVar, del0 del0Var, mel0 mel0Var, mel0 mel0Var2, JsAdsDelegateComponentImpl.a aVar) {
            this.a = zwsVar;
            this.b = del0Var;
            this.c = mel0Var;
            this.d = mel0Var2;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AdFactories(fullscreenAdFactory=" + this.a + ", stickyBannerAdFactory=" + this.b + ", stickyBannerViewFactoryProvider=" + this.c + ", stickyBannerRegularViewTypeFactoryProvider=" + this.d + ", externalAdDelegate=" + this.e + ')';
        }
    }

    public n1y(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, tbg tbgVar, a aVar) {
        t9l t9lVar = new t9l();
        this.b = xwv0Var;
        this.c = bVar;
        this.d = tbgVar;
        this.e = aVar;
        this.f = t9lVar;
        this.g = new bpn0(new c24(0));
        this.h = new bpn0(new r5i(this, 24));
        this.i = new bpn0(new yv2(18));
        this.j = new bpn0(new x3i(this, 20));
        this.k = new bpn0(new y3i(this, 20));
        this.l = new bpn0(new f5x(this, 1));
        this.m = true;
        this.p = new bpn0(new xqf(this, 27));
    }

    @Override // xsna.d1y
    public final void F(p2y<CheckNativeAds$Parameters> p2yVar) {
        Object failure;
        boolean booleanValue;
        VkUiView view;
        this.c.k(new JsMethod("VKWebAppCheckNativeAds"), p2yVar.b());
        j().a.put(new JsMethod("VKWebAppCheckNativeAds"), p2yVar.b);
        if (p2yVar.a instanceof p2y.a) {
            zvp l = l();
            String b = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(CheckNativeAds$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null)), 1, null), p2yVar.b, null, 8);
            wh0 d = d();
            d.getClass();
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.CHECK;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) d.a.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(null, null, eventType, requestType, requestSubtype, 500, "Invalid params", null, null, null, null));
                return;
            }
            return;
        }
        String str = p2yVar.b;
        xwv0 xwv0Var = this.b;
        Activity B0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.B0();
        xwv0 xwv0Var2 = this.b;
        Long valueOf = xwv0Var2 != null ? Long.valueOf(xwv0Var2.getAppId()) : null;
        if (valueOf == null || B0 == null) {
            zvp l2 = l();
            String b2 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l2.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(CheckNativeAds$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b2, 1, null)), 1, null), str, null, 8);
            wh0 d2 = d();
            d2.getClass();
            AdRequestEvent.EventType eventType2 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType2 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype2 = AdRequestEvent.RequestSubtype.CHECK;
            VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) d2.a.invoke();
            if (vkBridgeAnalytics2 != null) {
                vkBridgeAnalytics2.b(new AdRequestEvent(null, null, eventType2, requestType2, requestSubtype2, 101, "Missing container", null, null, null, null));
                return;
            }
            return;
        }
        CheckNativeAds$Parameters a2 = p2yVar.a();
        try {
            AdvertisementType.b bVar = AdvertisementType.Companion;
            String c = a2.c();
            bVar.getClass();
            failure = AdvertisementType.valueOf(c.toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        AdvertisementType advertisementType = (AdvertisementType) failure;
        if (advertisementType == null) {
            zvp l3 = l();
            String b3 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l3.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(CheckNativeAds$Error.Data.Type.CLIENT_ERROR, b3, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, B0.getString(R.string.vk_invalid_ad_format_error, a2.c()), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b3, 1, null)), 1, null), str, null, 8);
            wh0 d3 = d();
            String c2 = a2.c();
            d3.getClass();
            AdRequestEvent.EventType eventType3 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType3 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype3 = AdRequestEvent.RequestSubtype.CHECK;
            String concat = "Invalid ad format ".concat(c2);
            VkBridgeAnalytics vkBridgeAnalytics3 = (VkBridgeAnalytics) d3.a.invoke();
            if (vkBridgeAnalytics3 != null) {
                vkBridgeAnalytics3.b(new AdRequestEvent(null, null, eventType3, requestType3, requestSubtype3, 501, concat, null, null, null, null));
                return;
            }
            return;
        }
        WebAdConfig c3 = c(true);
        if (c3 == null) {
            zvp l4 = l();
            String b4 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l4.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(CheckNativeAds$Error.Data.Type.CLIENT_ERROR, b4, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, B0.getString(R.string.vk_invalid_ad_config_error), 1, null), null, null, 114686, null), b4, 1, null)), 1, null), str, null, 8);
            wh0 d4 = d();
            int longValue = (int) valueOf.longValue();
            d4.getClass();
            AdRequestEvent.AdFormat a3 = in00.a(advertisementType);
            AdRequestEvent.EventType eventType4 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType4 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype4 = AdRequestEvent.RequestSubtype.CHECK;
            String d5 = gq.d(Integer.valueOf(longValue), "Failed to get ad config id for app with id: ");
            VkBridgeAnalytics vkBridgeAnalytics4 = (VkBridgeAnalytics) d4.a.invoke();
            if (vkBridgeAnalytics4 != null) {
                vkBridgeAnalytics4.b(new AdRequestEvent(a3, null, eventType4, requestType4, requestSubtype4, 1302, d5, null, null, null, null));
                return;
            }
            return;
        }
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        if (!gnlVar.a().k(advertisementType, c3)) {
            Boolean d6 = a2.d();
            if (advertisementType == AdvertisementType.REWARD) {
                AdvertisementType advertisementType2 = AdvertisementType.INTERSTITIAL;
                gnl gnlVar2 = e370.m;
                if ((gnlVar2 != null ? gnlVar2 : null).a().k(advertisementType2, c3)) {
                    booleanValue = false;
                    h().d(B0, new y31.a(valueOf.longValue(), advertisementType, booleanValue, advertisementType), c3);
                    n(B0);
                    return;
                }
            }
            booleanValue = d6 != null ? d6.booleanValue() : true;
            h().d(B0, new y31.a(valueOf.longValue(), advertisementType, booleanValue, advertisementType), c3);
            n(B0);
            return;
        }
        zvp l5 = l();
        String b5 = p2yVar.b();
        com.vk.superapp.base.js.bridge.b.o(l5.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(CheckNativeAds$Error.Data.Type.CLIENT_ERROR, b5, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, B0.getString(R.string.vk_ad_user_is_banned_error), 1, null), null, null, 114686, null), b5, 1, null)), 1, null), p2yVar.b, null, 8);
        wh0 d7 = d();
        d7.getClass();
        AdRequestEvent.AdFormat a4 = in00.a(advertisementType);
        AdRequestEvent.EventType eventType5 = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType5 = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype5 = AdRequestEvent.RequestSubtype.CHECK;
        VkBridgeAnalytics vkBridgeAnalytics5 = (VkBridgeAnalytics) d7.a.invoke();
        if (vkBridgeAnalytics5 != null) {
            vkBridgeAnalytics5.b(new AdRequestEvent(a4, null, eventType5, requestType5, requestSubtype5, 1305, "User is banned", null, null, null, null));
        }
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppBannerAdClosedByUser(String str) {
        f1y.a.VKWebAppBannerAdClosedByUser(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppBannerAdUpdated(String str) {
        f1y.a.VKWebAppBannerAdUpdated(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppCheckBannerAd(String str) {
        f1y.a.VKWebAppCheckBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppCheckNativeAds(String str) {
        f1y.a.VKWebAppCheckNativeAds(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppHideBannerAd(String str) {
        f1y.a.VKWebAppHideBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppShowBannerAd(String str) {
        f1y.a.VKWebAppShowBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppShowNativeAds(String str) {
        f1y.a.VKWebAppShowNativeAds(this, str);
    }

    @Override // xsna.f1y
    public final void a() {
        h().a();
    }

    @Override // xsna.f1y
    public final void b(Context context) {
        WebApiApplication v;
        xwv0 xwv0Var;
        VkUiView view;
        VkUiView.BannerAd j0;
        xwv0 xwv0Var2 = this.b;
        if (xwv0Var2 == null || (v = xwv0Var2.v()) == null || v.v != 0 || (xwv0Var = this.b) == null || (view = xwv0Var.getView()) == null || (j0 = view.j0()) == null || !j0.Oe()) {
            return;
        }
        h().b(context);
    }

    public final WebAdConfig c(boolean z) {
        WebAdConfig H;
        WebApiApplication v;
        xwv0 xwv0Var = this.b;
        if (xwv0Var == null || (v = xwv0Var.v()) == null || (H = v.V) == null) {
            xwv0 xwv0Var2 = this.b;
            H = xwv0Var2 != null ? xwv0Var2.H() : null;
        }
        if (H == null) {
            return null;
        }
        int i = H.c;
        if (i != -1) {
            if (!z) {
                return H.e();
            }
            a aVar = this.e;
            if (i != 622) {
                aVar.e.b(new hax(1313, tgw.b(i, "Unexpected config id: received ", ", but expected 622")));
                return H.e();
            }
            if (i != 622) {
                return H.e();
            }
            if (!aVar.e.a.ia()) {
                aVar.e.b(new hax(1314, lhg.a(this.o, "Required ads SDK is not initialized, config id: 622, extra attempts count: ")));
                return H.e();
            }
        }
        return H;
    }

    public final wh0 d() {
        return (wh0) this.h.getValue();
    }

    @Override // xsna.d1y
    public final void d1(p2y<CheckBannerAd$Parameters> p2yVar) {
        CheckBannerAd$Response.Data data;
        VkUiView view;
        this.c.k(new JsMethod("VKWebAppCheckBannerAd"), p2yVar.b());
        String str = p2yVar.b;
        if (p2yVar.a instanceof p2y.a) {
            zvp l = l();
            String b = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l.a, new JsMethod("VKWebAppCheckBannerAd"), new CheckBannerAd$Error(null, new CheckBannerAd$Error.Data(CheckBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null)), 1, null), str, null, 8);
            return;
        }
        BannerParamsSnapshot g = h().g();
        xwv0 xwv0Var = this.b;
        VkUiView.BannerAd j0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.j0();
        if (j0 == null) {
            zvp l2 = l();
            String b2 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l2.a, new JsMethod("VKWebAppCheckBannerAd"), new CheckBannerAd$Error(null, new CheckBannerAd$Error.Data(CheckBannerAd$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b2, 1, null)), 1, null), str, null, 8);
            return;
        }
        e2n0 e2n0Var = (e2n0) this.k.getValue();
        String b3 = p2yVar.b();
        boolean Oe = j0.Oe();
        e2n0Var.getClass();
        if (g.equals(new BannerParamsSnapshot(0, 0, false, null, null, null, null, null))) {
            data = new CheckBannerAd$Response.Data(Oe, null, null, null, null, null, null, null, b3, 254, null);
        } else {
            int i = g.b;
            int i2 = g.c;
            String a2 = e2n0.a(g.f);
            String a3 = e2n0.a(g.e);
            String a4 = e2n0.a(g.h);
            String a5 = e2n0.a(g.g);
            BannerParamsSnapshot.Orientation orientation = g.i;
            data = new CheckBannerAd$Response.Data(Oe, Integer.valueOf(i), Integer.valueOf(i2), a2, a5, a3, a4, orientation != null ? e2n0.a(orientation) : null, b3);
        }
        com.vk.superapp.base.js.bridge.b.p(e2n0Var.a, new JsMethod("VKWebAppCheckBannerAd"), new CheckBannerAd$Response(null, data, b3, 1, null), null, null, false, str, 28);
    }

    @Override // xsna.f1y
    public final void e(Context context) {
        h().n(context, c(false));
    }

    @Override // xsna.f1y
    public final void f() {
        this.m = true;
    }

    @Override // xsna.f1y
    public final void g(aj0 aj0Var, List<? extends AdvertisementType> list, WebAdConfig webAdConfig) {
        VkUiView view;
        xwv0 xwv0Var = this.b;
        Activity B0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.B0();
        xwv0 xwv0Var2 = this.b;
        Long valueOf = xwv0Var2 != null ? Long.valueOf(xwv0Var2.getAppId()) : null;
        h().l(aj0Var, new m1y(this, 0));
        if (B0 == null || valueOf == null || webAdConfig == null) {
            return;
        }
        qro0.c(new yrr(this, webAdConfig, B0, valueOf, list));
    }

    public final y31 h() {
        return (y31) this.l.getValue();
    }

    @Override // xsna.f1y
    public final void i() {
        this.m = false;
    }

    public final k19 j() {
        return (k19) this.i.getValue();
    }

    @Override // xsna.d1y
    public final void j1(p2y<ShowNativeAds$Parameters> p2yVar) {
        Object failure;
        boolean booleanValue;
        VkUiView view;
        this.c.k(new JsMethod("VKWebAppShowNativeAds"), p2yVar.b());
        j().a.put(new JsMethod("VKWebAppShowNativeAds"), p2yVar.b);
        if (!this.m) {
            zvp l = l();
            String b = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null)), 1, null), p2yVar.b, null, 8);
            wh0 d = d();
            d.getClass();
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) d.a.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(null, null, eventType, requestType, requestSubtype, 901, "Unable to show native ad in background", null, null, null, null));
                return;
            }
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            zvp l2 = l();
            String b2 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l2.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b2, 1, null)), 1, null), p2yVar.b, null, 8);
            wh0 d2 = d();
            d2.getClass();
            AdRequestEvent.EventType eventType2 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType2 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype2 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) d2.a.invoke();
            if (vkBridgeAnalytics2 != null) {
                vkBridgeAnalytics2.b(new AdRequestEvent(null, null, eventType2, requestType2, requestSubtype2, 500, "Invalid params", null, null, null, null));
                return;
            }
            return;
        }
        xwv0 xwv0Var = this.b;
        final Activity B0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.B0();
        xwv0 xwv0Var2 = this.b;
        Long valueOf = xwv0Var2 != null ? Long.valueOf(xwv0Var2.getAppId()) : null;
        if (valueOf == null || B0 == null) {
            zvp l3 = l();
            String b3 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l3.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b3, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b3, 1, null)), 1, null), p2yVar.b, null, 8);
            wh0 d3 = d();
            d3.getClass();
            AdRequestEvent.EventType eventType3 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType3 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype3 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics3 = (VkBridgeAnalytics) d3.a.invoke();
            if (vkBridgeAnalytics3 != null) {
                vkBridgeAnalytics3.b(new AdRequestEvent(null, null, eventType3, requestType3, requestSubtype3, 101, "Missing container", null, null, null, null));
                return;
            }
            return;
        }
        long longValue = valueOf.longValue();
        String str = p2yVar.b;
        String b4 = p2yVar.b();
        ShowNativeAds$Parameters a2 = p2yVar.a();
        try {
            AdvertisementType.b bVar = AdvertisementType.Companion;
            String c = a2.c();
            bVar.getClass();
            failure = AdvertisementType.valueOf(c.toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        AdvertisementType advertisementType = (AdvertisementType) failure;
        if (advertisementType == null) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b4, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, B0.getString(R.string.vk_invalid_ad_format_error, a2.c()), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b4, 1, null)), 1, null), str, null, 8);
            wh0 d4 = d();
            String c2 = a2.c();
            d4.getClass();
            AdRequestEvent.EventType eventType4 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType4 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype4 = AdRequestEvent.RequestSubtype.SHOW;
            String concat = "Invalid ad format ".concat(c2);
            VkBridgeAnalytics vkBridgeAnalytics4 = (VkBridgeAnalytics) d4.a.invoke();
            if (vkBridgeAnalytics4 != null) {
                vkBridgeAnalytics4.b(new AdRequestEvent(null, null, eventType4, requestType4, requestSubtype4, 501, concat, null, null, null, null));
                return;
            }
            return;
        }
        final WebAdConfig c3 = c(true);
        if (c3 == null) {
            zvp l4 = l();
            String b5 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l4.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b5, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, B0.getString(R.string.vk_invalid_ad_config_error), 1, null), null, null, 114686, null), b5, 1, null)), 1, null), str, null, 8);
            wh0 d5 = d();
            d5.getClass();
            AdRequestEvent.AdFormat a3 = in00.a(advertisementType);
            AdRequestEvent.EventType eventType5 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType5 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype5 = AdRequestEvent.RequestSubtype.SHOW;
            String d6 = gq.d(Integer.valueOf((int) longValue), "Failed to get ad config id for app with id: ");
            VkBridgeAnalytics vkBridgeAnalytics5 = (VkBridgeAnalytics) d5.a.invoke();
            if (vkBridgeAnalytics5 != null) {
                vkBridgeAnalytics5.b(new AdRequestEvent(a3, null, eventType5, requestType5, requestSubtype5, 1302, d6, null, null, null, null));
                return;
            }
            return;
        }
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        if (gnlVar.a().k(advertisementType, c3)) {
            zvp l5 = l();
            String b6 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l5.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b6, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, B0.getString(R.string.vk_ad_user_is_banned_error), 1, null), null, null, 114686, null), b6, 1, null)), 1, null), str, null, 8);
            wh0 d7 = d();
            d7.getClass();
            AdRequestEvent.AdFormat a4 = in00.a(advertisementType);
            AdRequestEvent.EventType eventType6 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType6 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype6 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics6 = (VkBridgeAnalytics) d7.a.invoke();
            if (vkBridgeAnalytics6 != null) {
                vkBridgeAnalytics6.b(new AdRequestEvent(a4, null, eventType6, requestType6, requestSubtype6, 1305, "User is banned", null, null, null, null));
                return;
            }
            return;
        }
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        if (System.currentTimeMillis() < gnlVar2.a().a(advertisementType, longValue)) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, b4, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_REQUESTS_LIMIT_REACHED, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonRequestsLimitReached(0, null, 3, null), null, null, null, null, null, 129022, null), b4, 1, null)), 1, null), str, null, 8);
            wh0 d8 = d();
            d8.getClass();
            AdRequestEvent.AdFormat a5 = in00.a(advertisementType);
            AdRequestEvent.EventType eventType7 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType7 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype7 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics7 = (VkBridgeAnalytics) d8.a.invoke();
            if (vkBridgeAnalytics7 != null) {
                vkBridgeAnalytics7.b(new AdRequestEvent(a5, null, eventType7, requestType7, requestSubtype7, 1001, "Requests limit reached", null, null, null, null));
                return;
            }
            return;
        }
        Boolean d9 = a2.d();
        if (advertisementType == AdvertisementType.REWARD) {
            AdvertisementType advertisementType2 = AdvertisementType.INTERSTITIAL;
            gnl gnlVar3 = e370.m;
            if ((gnlVar3 != null ? gnlVar3 : null).a().k(advertisementType2, c3)) {
                booleanValue = false;
                final y31.a aVar = new y31.a(longValue, advertisementType, booleanValue, advertisementType);
                qro0.c(new gzs() { // from class: xsna.h1y
                    @Override // xsna.gzs
                    public final Object invoke() {
                        n1y.this.h().k(B0, aVar, c3);
                        return s3q0.a;
                    }
                });
                n(B0);
            }
        }
        booleanValue = d9 != null ? d9.booleanValue() : true;
        final y31.a aVar2 = new y31.a(longValue, advertisementType, booleanValue, advertisementType);
        qro0.c(new gzs() { // from class: xsna.h1y
            @Override // xsna.gzs
            public final Object invoke() {
                n1y.this.h().k(B0, aVar2, c3);
                return s3q0.a;
            }
        });
        n(B0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0486, code lost:
    
        if (r6.Y6(xsna.in00.b(r11)) == true) goto L184;
     */
    @Override // xsna.d1y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(p2y<ShowBannerAd$Parameters> p2yVar) {
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        Object failure5;
        BannerAdUiData bannerAdUiData;
        BannerAdUiData.LayoutType layoutType;
        VkUiView view;
        VkUiView view2;
        final String b = p2yVar.b();
        final String str = p2yVar.b;
        this.c.k(new JsMethod("VKWebAppShowBannerAd"), b);
        j().a.put(new JsMethod("VKWebAppShowBannerAd"), str);
        final Context context = ((r6y) this.d.c).l;
        xwv0 xwv0Var = this.b;
        VkUiView.BannerAd j0 = (xwv0Var == null || (view2 = xwv0Var.getView()) == null) ? null : view2.j0();
        if (j0 == null || context == null) {
            l().a(b, str);
            wh0 d = d();
            d.getClass();
            AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) d.a.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(adFormat, null, eventType, requestType, requestSubtype, 101, "Missing container", null, null, null, null));
                return;
            }
            return;
        }
        if (j0.Oe()) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, context.getString(R.string.vk_show_banner_ad_error), 1, null), null, null, 114686, null), b, 1, null)), 1, null), str, null, 8);
            wh0 d2 = d();
            d2.getClass();
            AdRequestEvent.AdFormat adFormat2 = AdRequestEvent.AdFormat.BANNER;
            AdRequestEvent.EventType eventType2 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType2 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype2 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) d2.a.invoke();
            if (vkBridgeAnalytics2 != null) {
                vkBridgeAnalytics2.b(new AdRequestEvent(adFormat2, null, eventType2, requestType2, requestSubtype2, 1306, "Banner is already displaying", null, null, null, null));
                return;
            }
            return;
        }
        if (!h().h(c(false))) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, context.getString(R.string.vk_invalid_ad_config_error), 1, null), null, null, 114686, null), b, 1, null)), 1, null), str, null, 8);
            wh0 d3 = d();
            WebAdConfig c = c(false);
            Integer valueOf = c != null ? Integer.valueOf(c.b) : null;
            d3.getClass();
            AdRequestEvent.AdFormat adFormat3 = AdRequestEvent.AdFormat.BANNER;
            AdRequestEvent.EventType eventType3 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType3 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype3 = AdRequestEvent.RequestSubtype.SHOW;
            String d4 = gq.d(valueOf, "Failed to get config with given id ");
            VkBridgeAnalytics vkBridgeAnalytics3 = (VkBridgeAnalytics) d3.a.invoke();
            if (vkBridgeAnalytics3 != null) {
                vkBridgeAnalytics3.b(new AdRequestEvent(adFormat3, null, eventType3, requestType3, requestSubtype3, 1303, d4, null, null, null, null));
                return;
            }
            return;
        }
        WebAdConfig c2 = c(false);
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        List<hel0> y = gnlVar.a().j0().y(c2);
        if (!(y instanceof Collection) || !y.isEmpty()) {
            Iterator<T> it = y.iterator();
            while (it.hasNext()) {
                if (((hel0) it.next()).a == -1) {
                    com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, context.getString(R.string.vk_ad_user_is_banned_error), 1, null), null, null, 114686, null), b, 1, null)), 1, null), str, null, 8);
                    wh0 d5 = d();
                    d5.getClass();
                    AdRequestEvent.AdFormat adFormat4 = AdRequestEvent.AdFormat.BANNER;
                    AdRequestEvent.EventType eventType4 = AdRequestEvent.EventType.REQUEST;
                    AdRequestEvent.RequestType requestType4 = AdRequestEvent.RequestType.BRIDGE;
                    AdRequestEvent.RequestSubtype requestSubtype4 = AdRequestEvent.RequestSubtype.SHOW;
                    VkBridgeAnalytics vkBridgeAnalytics4 = (VkBridgeAnalytics) d5.a.invoke();
                    if (vkBridgeAnalytics4 != null) {
                        vkBridgeAnalytics4.b(new AdRequestEvent(adFormat4, null, eventType4, requestType4, requestSubtype4, 1305, "User is banned", null, null, null, null));
                        return;
                    }
                    return;
                }
            }
        }
        xwv0 xwv0Var2 = this.b;
        Long valueOf2 = xwv0Var2 != null ? Long.valueOf(xwv0Var2.getAppId()) : null;
        long currentTimeMillis = System.currentTimeMillis();
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        if (currentTimeMillis < (valueOf2 != null ? gnlVar2.a().j0().u().h(valueOf2.longValue()) : 0L)) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_REQUESTS_LIMIT_REACHED, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonRequestsLimitReached(0, null, 3, null), null, null, null, null, null, 129022, null), b, 1, null)), 1, null), str, null, 8);
            wh0 d6 = d();
            d6.getClass();
            AdRequestEvent.AdFormat adFormat5 = AdRequestEvent.AdFormat.BANNER;
            AdRequestEvent.EventType eventType5 = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType5 = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype5 = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics5 = (VkBridgeAnalytics) d6.a.invoke();
            if (vkBridgeAnalytics5 != null) {
                vkBridgeAnalytics5.b(new AdRequestEvent(adFormat5, null, eventType5, requestType5, requestSubtype5, 1001, "Requests limit reached", null, null, null, null));
                return;
            }
            return;
        }
        String str2 = "";
        if (p2yVar.a instanceof p2y.a) {
            bannerAdUiData = BannerAdUiData.g;
        } else {
            ShowBannerAd$Parameters a2 = p2yVar.a();
            try {
                String f = a2.f();
                String upperCase = f != null ? f.toUpperCase(Locale.ROOT) : null;
                if (upperCase == null) {
                    upperCase = "";
                }
                failure = BannerAdUiData.LayoutType.valueOf(upperCase);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = BannerAdUiData.LayoutType.RESIZE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            BannerAdUiData.LayoutType layoutType2 = (BannerAdUiData.LayoutType) failure;
            try {
                String d7 = a2.d();
                String upperCase2 = d7 != null ? d7.toUpperCase(Locale.ROOT) : null;
                if (upperCase2 == null) {
                    upperCase2 = "";
                }
                failure2 = BannerAdUiData.BannerLocation.valueOf(upperCase2);
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Object obj2 = BannerAdUiData.BannerLocation.BOTTOM;
            if (failure2 instanceof Result.Failure) {
                failure2 = obj2;
            }
            BannerAdUiData.BannerLocation bannerLocation = (BannerAdUiData.BannerLocation) failure2;
            try {
                String c3 = a2.c();
                String upperCase3 = c3 != null ? c3.toUpperCase(Locale.ROOT) : null;
                if (upperCase3 == null) {
                    upperCase3 = "";
                }
                failure3 = BannerAdUiData.BannerAlign.valueOf(upperCase3);
            } catch (Throwable th3) {
                failure3 = new Result.Failure(th3);
            }
            Object obj3 = BannerAdUiData.BannerAlign.UNSPECIFIED;
            if (failure3 instanceof Result.Failure) {
                failure3 = obj3;
            }
            BannerAdUiData.BannerAlign bannerAlign = (BannerAdUiData.BannerAlign) failure3;
            try {
                String e = a2.e();
                String upperCase4 = e != null ? e.toUpperCase(Locale.ROOT) : null;
                if (upperCase4 == null) {
                    upperCase4 = "";
                }
                failure4 = BannerAdUiData.HeightType.valueOf(upperCase4);
            } catch (Throwable th4) {
                failure4 = new Result.Failure(th4);
            }
            Object obj4 = BannerAdUiData.HeightType.UNSPECIFIED;
            if (failure4 instanceof Result.Failure) {
                failure4 = obj4;
            }
            BannerAdUiData.HeightType heightType = (BannerAdUiData.HeightType) failure4;
            try {
                String g = a2.g();
                String upperCase5 = g != null ? g.toUpperCase(Locale.ROOT) : null;
                if (upperCase5 != null) {
                    str2 = upperCase5;
                }
                failure5 = BannerAdUiData.Orientation.valueOf(str2);
            } catch (Throwable th5) {
                failure5 = new Result.Failure(th5);
            }
            Object obj5 = BannerAdUiData.Orientation.UNSPECIFIED;
            if (failure5 instanceof Result.Failure) {
                failure5 = obj5;
            }
            bannerAdUiData = new BannerAdUiData(layoutType2, layoutType2, bannerLocation, bannerAlign, heightType, (BannerAdUiData.Orientation) failure5);
        }
        final WebAdConfig c4 = c(false);
        n36 n36Var = (n36) this.p.getValue();
        n36Var.getClass();
        BannerAdUiData.Orientation orientation = bannerAdUiData.f;
        BannerAdUiData.BannerAlign bannerAlign2 = bannerAdUiData.d;
        BannerAdUiData.BannerLocation bannerLocation2 = bannerAdUiData.c;
        n1y n1yVar = (n1y) n36Var.a.c;
        xwv0 xwv0Var3 = n1yVar.b;
        if ((xwv0Var3 == null || !xwv0Var3.o() || bannerLocation2 != BannerAdUiData.BannerLocation.TOP) && ((bannerLocation2 != BannerAdUiData.BannerLocation.TOP || xwv0Var3 == null || (view = xwv0Var3.getView()) == null || !view.i6()) && ((layoutType = bannerAdUiData.a) != BannerAdUiData.LayoutType.RESIZE || bannerAlign2 == BannerAdUiData.BannerAlign.UNSPECIFIED || orientation == BannerAdUiData.Orientation.VERTICAL))) {
            if (orientation == BannerAdUiData.Orientation.VERTICAL) {
                if (bannerAlign2 != BannerAdUiData.BannerAlign.CENTER && bannerAdUiData.e == BannerAdUiData.HeightType.UNSPECIFIED && layoutType != BannerAdUiData.LayoutType.OVERLAY) {
                    if (bannerAlign2 == BannerAdUiData.BannerAlign.UNSPECIFIED) {
                        BannerAdUiData.BannerAlign.Companion.getClass();
                        bannerAlign2 = BannerAdUiData.BannerAlign.RIGHT;
                    }
                    xwv0 xwv0Var4 = n1yVar.b;
                    if (xwv0Var4 != null) {
                        VkUiView view3 = xwv0Var4.getView();
                        if (view3 != null) {
                            VkUiView.BannerAd j02 = view3.j0();
                            if (j02 != null) {
                            }
                        }
                    }
                }
            }
            final BannerAdUiData bannerAdUiData2 = bannerAdUiData;
            qro0.c(new gzs() { // from class: xsna.i1y
                @Override // xsna.gzs
                public final Object invoke() {
                    n1y n1yVar2 = n1y.this;
                    ((n36) n1yVar2.p.getValue()).getClass();
                    BannerAdUiData bannerAdUiData3 = bannerAdUiData2;
                    BannerAdUiData.LayoutType layoutType3 = bannerAdUiData3.a;
                    BannerAdUiData.LayoutType layoutType4 = BannerAdUiData.LayoutType.OVERLAY;
                    if (layoutType3 == layoutType4) {
                        BannerAdUiData.BannerLocation bannerLocation3 = bannerAdUiData3.c;
                        BannerAdUiData.BannerLocation bannerLocation4 = BannerAdUiData.BannerLocation.TOP;
                        if (bannerLocation3 == bannerLocation4) {
                            if (bannerAdUiData3.d == BannerAdUiData.BannerAlign.UNSPECIFIED) {
                                layoutType4 = BannerAdUiData.LayoutType.RESIZE;
                            }
                            bannerAdUiData3 = BannerAdUiData.a(bannerAdUiData3, BannerAdUiData.LayoutType.RESIZE, layoutType4, bannerLocation4, null, 56);
                        }
                    }
                    BannerAdUiData bannerAdUiData4 = bannerAdUiData3;
                    if (bannerAdUiData4.f == BannerAdUiData.Orientation.VERTICAL && bannerAdUiData4.d == BannerAdUiData.BannerAlign.UNSPECIFIED) {
                        BannerAdUiData.BannerAlign.Companion.getClass();
                        bannerAdUiData4 = BannerAdUiData.a(bannerAdUiData4, null, null, null, BannerAdUiData.BannerAlign.RIGHT, 55);
                    }
                    BannerAdUiData bannerAdUiData5 = bannerAdUiData4;
                    xwv0 xwv0Var5 = n1yVar2.b;
                    Long valueOf3 = xwv0Var5 != null ? Long.valueOf(xwv0Var5.getAppId()) : null;
                    if (valueOf3 != null) {
                        n1yVar2.h().c(bannerAdUiData5, valueOf3.longValue(), context, c4);
                    } else {
                        n1yVar2.l().a(b, str);
                        wh0 d8 = n1yVar2.d();
                        d8.getClass();
                        AdRequestEvent.AdFormat adFormat6 = AdRequestEvent.AdFormat.BANNER;
                        AdRequestEvent.EventType eventType6 = AdRequestEvent.EventType.REQUEST;
                        AdRequestEvent.RequestType requestType6 = AdRequestEvent.RequestType.BRIDGE;
                        AdRequestEvent.RequestSubtype requestSubtype6 = AdRequestEvent.RequestSubtype.SHOW;
                        VkBridgeAnalytics vkBridgeAnalytics6 = (VkBridgeAnalytics) d8.a.invoke();
                        if (vkBridgeAnalytics6 != null) {
                            vkBridgeAnalytics6.b(new AdRequestEvent(adFormat6, null, eventType6, requestType6, requestSubtype6, 105, "Received app id is empty", null, null, null, null));
                        }
                    }
                    return s3q0.a;
                }
            });
            return;
        }
        com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null)), 1, null), str, null, 8);
        wh0 d8 = d();
        d8.getClass();
        AdRequestEvent.AdFormat adFormat6 = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.EventType eventType6 = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType6 = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype6 = AdRequestEvent.RequestSubtype.SHOW;
        VkBridgeAnalytics vkBridgeAnalytics6 = (VkBridgeAnalytics) d8.a.invoke();
        if (vkBridgeAnalytics6 != null) {
            vkBridgeAnalytics6.b(new AdRequestEvent(adFormat6, null, eventType6, requestType6, requestSubtype6, 505, "Invalid banner ad params combination", null, null, null, null));
        }
    }

    public final zvp l() {
        return (zvp) this.j.getValue();
    }

    public final void m(Activity activity, long j, List<? extends AdvertisementType> list, WebAdConfig webAdConfig) {
        List<? extends AdvertisementType> list2 = list;
        if (list2 == null || list2.isEmpty() || webAdConfig == null) {
            return;
        }
        h().f(activity, new k1y(j, activity, webAdConfig, list, this));
    }

    public final void n(Activity activity) {
        WebAdConfig H;
        int i;
        WebApiApplication v;
        xwv0 xwv0Var = this.b;
        if (xwv0Var == null || (v = xwv0Var.v()) == null || (H = v.V) == null) {
            xwv0 xwv0Var2 = this.b;
            H = xwv0Var2 != null ? xwv0Var2.H() : null;
        }
        if (H != null && H.c == 622 && !this.e.e.a.ia() && (i = this.o) < 3) {
            this.o = i + 1;
            qro0.c(new k4(9, this, activity));
        }
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.b = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.b = null;
        h().release();
        gnl gnlVar = e370.m;
        (gnlVar != null ? gnlVar : null).a().j();
    }

    @Override // xsna.d1y
    public final void w1(final p2y<HideBannerAd$Parameters> p2yVar) {
        VkUiView view;
        JsMethod jsMethod = new JsMethod("VKWebAppHideBannerAd");
        String b = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.c;
        bVar.k(jsMethod, b);
        final String str = p2yVar.b;
        if (p2yVar.a instanceof p2y.a) {
            zvp l = l();
            String b2 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l.a, new JsMethod("VKWebAppHideBannerAd"), new HideBannerAd$Error(null, new HideBannerAd$Error.Data(HideBannerAd$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b2, 1, null)), 1, null), str, null, 8);
            return;
        }
        Context context = ((r6y) this.d.c).l;
        xwv0 xwv0Var = this.b;
        VkUiView.BannerAd j0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.j0();
        final BannerParamsSnapshot g = h().g();
        if (context == null || j0 == null) {
            zvp l2 = l();
            String b3 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(l2.a, new JsMethod("VKWebAppHideBannerAd"), new HideBannerAd$Error(null, new HideBannerAd$Error.Data(HideBannerAd$Error.Data.Type.CLIENT_ERROR, b3, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b3, 1, null)), 1, null), str, null, 8);
            return;
        }
        if (j0.Oe()) {
            final VkUiView.BannerAd bannerAd = j0;
            qro0.c(new gzs() { // from class: xsna.l1y
                @Override // xsna.gzs
                public final Object invoke() {
                    n1y n1yVar = n1y.this;
                    n1yVar.h().m(true);
                    bannerAd.K2();
                    e2n0 e2n0Var = (e2n0) n1yVar.k.getValue();
                    String b4 = p2yVar.b();
                    com.vk.superapp.base.js.bridge.b bVar2 = e2n0Var.a;
                    JsMethod jsMethod2 = new JsMethod("VKWebAppHideBannerAd");
                    BannerParamsSnapshot bannerParamsSnapshot = g;
                    int i = bannerParamsSnapshot.b;
                    int i2 = bannerParamsSnapshot.c;
                    String a2 = e2n0.a(bannerParamsSnapshot.f);
                    if (a2 == null) {
                        a2 = "";
                    }
                    String a3 = e2n0.a(bannerParamsSnapshot.g);
                    String a4 = e2n0.a(bannerParamsSnapshot.e);
                    if (a4 == null) {
                        a4 = "";
                    }
                    com.vk.superapp.base.js.bridge.b.p(bVar2, jsMethod2, new HideBannerAd$Response(null, new HideBannerAd$Response.Data(true, i, i2, a2, a4, a3, e2n0.a(bannerParamsSnapshot.h), e2n0.a(bannerParamsSnapshot.i), b4), b4, 1, null), null, null, false, str, 28);
                    return s3q0.a;
                }
            });
            return;
        }
        if (h().j()) {
            h().m(false);
        }
        if (bVar.j(new JsMethod("VKWebAppShowBannerAd"))) {
            com.vk.superapp.base.js.bridge.b.o(l().a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, context.getString(R.string.vk_show_banner_ad_request_canceled_error), 1, null), null, null, 114686, null), null, 1, null), 2, null), 1, null), j().a(new JsMethod("VKWebAppShowBannerAd")), null, 8);
            wh0 d = d();
            d.getClass();
            AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) d.a.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(adFormat, null, eventType, requestType, requestSubtype, 1307, "Banner load was cancelled by VKWebAppHideBannerAd", null, null, null, null));
            }
            h().m(false);
        }
        zvp l3 = l();
        String b4 = p2yVar.b();
        com.vk.superapp.base.js.bridge.b.o(l3.a, new JsMethod("VKWebAppHideBannerAd"), new HideBannerAd$Error(null, new HideBannerAd$Error.Data(HideBannerAd$Error.Data.Type.CLIENT_ERROR, b4, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, context.getString(R.string.vk_hide_banner_ad_error), 1, null), null, null, 114686, null), b4, 1, null)), 1, null), str, null, 8);
    }
}
