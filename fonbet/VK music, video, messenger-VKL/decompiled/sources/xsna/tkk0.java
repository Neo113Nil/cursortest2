package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import xsna.j11;
import xsna.r31;
import xsna.y31;

/* compiled from: SplashAdResultCallbackImpl.kt */
/* loaded from: classes6.dex */
public final class tkk0 implements y31.b {
    public final r31 a;
    public final ncg b;

    public tkk0(r31 r31Var, ncg ncgVar) {
        this.a = r31Var;
        this.b = ncgVar;
    }

    @Override // xsna.y31.b
    public final void a(AdvertisementType advertisementType, int i, boolean z, boolean z2, String str) {
        if (z2) {
            AdRequestEvent.AdFormat a = in00.a(advertisementType);
            AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
            AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
            AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
            String a2 = lhg.a(i, "Incompatible slot: ");
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.b.invoke();
            if (vkBridgeAnalytics != null) {
                vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, 1310, a2, null, null, null, null));
            }
        }
    }

    @Override // xsna.y31.b
    public final void b(AdvertisementType advertisementType, j11 j11Var, String str) {
        ncg ncgVar = this.b;
        r31 r31Var = this.a;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) ncgVar.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.e(true, r31Var, VkBridgeAnalytics.NativeAdEventType.SHOW_AD_FAILED);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = j11Var.a;
        String str2 = j11Var.b;
        Integer valueOf = Integer.valueOf(i);
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) ncgVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, valueOf, str2, null, null, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void c(AdvertisementType advertisementType, String str) {
        r31 r31Var = this.a;
        Integer num = r31Var.c;
        Integer num2 = r31Var.e;
        h(true);
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.b.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, null, null, num2, num, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void e(AdvertisementType advertisementType, j11.b bVar, String str) {
        ncg ncgVar = this.b;
        r31 r31Var = this.a;
        Integer num = r31Var.c;
        Integer num2 = r31Var.e;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) ncgVar.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.e(true, r31Var, VkBridgeAnalytics.NativeAdEventType.HIDE_BY_USER);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = bVar.a;
        String str2 = bVar.b;
        Integer valueOf = Integer.valueOf(i);
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) ncgVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, valueOf, str2, num2, num, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void f(AdvertisementType advertisementType, boolean z, j11 j11Var, String str) {
        h(false);
        AdRequestEvent.AdFormat a = in00.a(advertisementType);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = j11Var.a;
        String str2 = j11Var.b;
        Integer valueOf = Integer.valueOf(i);
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.b.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(a, str, eventType, requestType, requestSubtype, valueOf, str2, null, null, null, null));
        }
    }

    @Override // xsna.y31.b
    public final void g(String str) {
        VkBridgeAnalytics vkBridgeAnalytics;
        r31 r31Var = this.a;
        try {
            r31.a aVar = r31Var.g;
            if (aVar != null && (vkBridgeAnalytics = (VkBridgeAnalytics) this.b.invoke()) != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.e(true, aVar, VkBridgeAnalytics.NativeAdEventType.CLICK_AD);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.g = null;
    }

    public final void h(boolean z) {
        r31 r31Var = this.a;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.b.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.e(z, r31Var, VkBridgeAnalytics.NativeAdEventType.SHOW_AD);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
    }

    @Override // xsna.y31.b
    public final void d(AdvertisementType advertisementType, boolean z, String str) {
    }
}
