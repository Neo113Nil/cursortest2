package xsna;

import android.content.Context;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Error;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Error;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoAds;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import xsna.j11;
import xsna.r31;
import xsna.y31;

/* compiled from: AdvertisementResultCallbackImpl.kt */
/* loaded from: classes6.dex */
public final class d41 implements y31.b {
    public final r31 a;
    public final gzs<Context> b;
    public final k19 c;
    public final l0q d;
    public final z0h e;

    public d41(r31 r31Var, tbg tbgVar, k19 k19Var, l0q l0qVar, z0h z0hVar) {
        this.a = r31Var;
        this.b = tbgVar;
        this.c = k19Var;
        this.d = l0qVar;
        this.e = z0hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // xsna.y31.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AdvertisementType advertisementType, int i, boolean z, boolean z2, String str) {
        k19 k19Var;
        gzs<Context> gzsVar;
        z0h z0hVar;
        String str2;
        zvp zvpVar = this.d.a;
        z0h z0hVar2 = this.e;
        k19 k19Var2 = this.c;
        gzs<Context> gzsVar2 = this.b;
        if (z) {
            Context invoke = gzsVar2.invoke();
            String a = k19Var2.a(new JsMethod("VKWebAppCheckNativeAds"));
            com.vk.superapp.base.js.bridge.b bVar = zvpVar.a;
            JsMethod jsMethod = new JsMethod("VKWebAppCheckNativeAds");
            CheckNativeAds$Error.Data.Type type = CheckNativeAds$Error.Data.Type.CLIENT_ERROR;
            String string = invoke != null ? invoke.getString(R.string.vk_invalid_slot_error) : null;
            if (string == null) {
                string = "";
            }
            com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new CheckNativeAds$Error(null, new CheckNativeAds$Error.Data(type, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, string, 1, null), null, null, 114686, null), null, 1, null)), 1, null), a, null, 8);
            AdRequestEvent.AdFormat a2 = in00.a(advertisementType);
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.CHECK;
            String a3 = lhg.a(i, "Incompatible slot: ");
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) z0hVar2.invoke();
            if (vkBridgeAnalytics != null) {
                z0hVar = z0hVar2;
                str2 = "Incompatible slot: ";
                k19Var = k19Var2;
                gzsVar = gzsVar2;
                vkBridgeAnalytics.b(new AdRequestEvent(a2, str, eventType, requestType, requestSubtype, 1310, a3, null, null, null, null));
                if (z2) {
                    return;
                }
                Context invoke2 = gzsVar.invoke();
                String a4 = k19Var.a(new JsMethod("VKWebAppShowNativeAds"));
                zvpVar.getClass();
                String string2 = invoke2 != null ? invoke2.getString(R.string.vk_invalid_slot_error) : null;
                if (string2 == null) {
                    string2 = "";
                }
                com.vk.superapp.base.js.bridge.b.o(zvpVar.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, string2, 1, null), null, null, 114686, null), null, 1, null), 2, null), 1, null), a4, null, 8);
                AdRequestEvent.AdFormat a5 = in00.a(advertisementType);
                AdRequestEvent.EventType eventType2 = AdRequestEvent.EventType.REQUEST;
                AdRequestEvent.RequestType requestType2 = AdRequestEvent.RequestType.BRIDGE;
                AdRequestEvent.RequestSubtype requestSubtype2 = AdRequestEvent.RequestSubtype.SHOW;
                String a6 = lhg.a(i, str2);
                VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) z0hVar.invoke();
                if (vkBridgeAnalytics2 != null) {
                    vkBridgeAnalytics2.b(new AdRequestEvent(a5, str, eventType2, requestType2, requestSubtype2, 1310, a6, null, null, null, null));
                    return;
                }
                return;
            }
            gzsVar = gzsVar2;
            z0hVar = z0hVar2;
            k19Var = k19Var2;
        } else {
            k19Var = k19Var2;
            gzsVar = gzsVar2;
            z0hVar = z0hVar2;
        }
        str2 = "Incompatible slot: ";
        if (z2) {
        }
    }

    @Override // xsna.y31.b
    public final void b(AdvertisementType advertisementType, j11 j11Var, String str) {
        r31 r31Var = this.a;
        z0h z0hVar = this.e;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) z0hVar.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.f("VKWebAppShowNativeAds", true, r31Var, VkBridgeAnalytics.NativeAdEventType.SHOW_AD_FAILED, str);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
        zvp zvpVar = this.d.a;
        String a = j11Var.a();
        com.vk.superapp.base.js.bridge.b.o(zvpVar.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, a, 1, null), null, null, 114686, null), null, 1, null), 2, null), 1, null), this.c.a(new JsMethod("VKWebAppShowNativeAds")), null, 8);
        AdRequestEvent.AdFormat a2 = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = j11Var.a;
        String str2 = j11Var.b;
        Integer valueOf = Integer.valueOf(i);
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) z0hVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a2, str, eventType, requestType, requestSubtype, valueOf, str2, null, null, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void c(AdvertisementType advertisementType, String str) {
        r31 r31Var = this.a;
        Integer num = r31Var.c;
        Integer num2 = r31Var.e;
        h(str, true);
        e2n0 e2n0Var = this.d.b;
        com.vk.superapp.base.js.bridge.b.p(e2n0Var.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Response(null, new ShowNativeAds$Response.Data(true, null), null, 1, null), null, null, false, this.c.a(new JsMethod("VKWebAppShowNativeAds")), 28);
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.e.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, null, null, num2, num, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void d(AdvertisementType advertisementType, boolean z, String str) {
        if (z) {
            this.d.b.b(this.c.a(new JsMethod("VKWebAppCheckNativeAds")), true);
            AdRequestEvent.AdFormat a = in00.a(advertisementType);
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.CHECK;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.e.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, null, null, null, null, null, null));
            }
        }
    }

    @Override // xsna.y31.b
    public final void e(AdvertisementType advertisementType, j11.b bVar, String str) {
        z0h z0hVar = this.e;
        r31 r31Var = this.a;
        Integer num = r31Var.c;
        Integer num2 = r31Var.e;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) z0hVar.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.f("VKWebAppShowNativeAds", true, r31Var, VkBridgeAnalytics.NativeAdEventType.HIDE_BY_USER, str);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
        zvp zvpVar = this.d.a;
        com.vk.superapp.base.js.bridge.b.o(zvpVar.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), null, 1, null), 2, null), 1, null), this.c.a(new JsMethod("VKWebAppShowNativeAds")), null, 8);
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = bVar.a;
        String str2 = bVar.b;
        Integer valueOf = Integer.valueOf(i);
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) z0hVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, valueOf, str2, num2, num, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void f(AdvertisementType advertisementType, boolean z, j11 j11Var, String str) {
        z0h z0hVar = this.e;
        k19 k19Var = this.c;
        l0q l0qVar = this.d;
        if (z) {
            gnl gnlVar = e370.m;
            (gnlVar != null ? gnlVar : null).a().d();
            l0qVar.b.b(k19Var.a(new JsMethod("VKWebAppCheckNativeAds")), false);
            AdRequestEvent.AdFormat a = in00.a(advertisementType);
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.CHECK;
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) z0hVar.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, null, null, null, null, null, null));
                return;
            }
            return;
        }
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        this.a.f = gnlVar2.a().d();
        h(str, false);
        com.vk.superapp.base.js.bridge.b.o(l0qVar.a.a, new JsMethod("VKWebAppShowNativeAds"), new ShowNativeAds$Error(null, new ShowNativeAds$Error.Data(ShowNativeAds$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_NO_ADS, j11Var.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonNoAds(0, null, 3, null), null, 98300, null), null, 1, null), 2, null), 1, null), k19Var.a(new JsMethod("VKWebAppShowNativeAds")), null, 8);
        AdRequestEvent.AdFormat a2 = in00.a(advertisementType);
        AdRequestEvent.EventType eventType2 = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType2 = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype2 = AdRequestEvent.RequestSubtype.SHOW;
        String str2 = j11Var.b;
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) z0hVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a2, str, eventType2, requestType2, requestSubtype2, 2001, str2, null, null, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void g(String str) {
        VkBridgeAnalytics vkBridgeAnalytics;
        r31 r31Var = this.a;
        try {
            r31.a aVar = r31Var.g;
            if (aVar != null && (vkBridgeAnalytics = (VkBridgeAnalytics) this.e.invoke()) != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.f("VKWebAppShowNativeAds", true, aVar, VkBridgeAnalytics.NativeAdEventType.CLICK_AD, str);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.g = null;
    }

    public final void h(String str, boolean z) {
        r31 r31Var = this.a;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.e.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.f("VKWebAppShowNativeAds", z, r31Var, VkBridgeAnalytics.NativeAdEventType.SHOW_AD, str);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
    }
}
