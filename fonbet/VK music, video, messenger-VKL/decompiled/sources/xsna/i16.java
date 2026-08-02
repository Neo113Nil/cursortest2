package xsna;

import android.content.Context;
import android.view.View;
import com.vk.superapp.ads.js.bridge.api.events.BannerAdClosedByUser$Response;
import com.vk.superapp.ads.js.bridge.api.events.BannerAdUpdated$Response;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Error;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Response;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoAds;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.in00;
import xsna.r31;
import xsna.y31;

/* compiled from: BannerAdvertisementResultCallbackImpl.kt */
/* loaded from: classes6.dex */
public final class i16 implements y31.c {
    public final com.vk.superapp.base.js.bridge.b a;
    public final r31 b;
    public final drg c;
    public final wqf d;
    public final k19 e;
    public final l0q f;
    public final gzs<Context> g;

    public i16(com.vk.superapp.base.js.bridge.b bVar, r31 r31Var, drg drgVar, wqf wqfVar, k19 k19Var, l0q l0qVar, tbg tbgVar) {
        this.a = bVar;
        this.b = r31Var;
        this.c = drgVar;
        this.d = wqfVar;
        this.e = k19Var;
        this.f = l0qVar;
        this.g = tbgVar;
    }

    @Override // xsna.y31.c
    public final void a(View view, BannerAdUiData bannerAdUiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        VkUiView.BannerAd j0;
        VkUiView.BannerAd.UiData.LayoutType layoutType;
        VkUiView.BannerAd.UiData.LayoutType layoutType2;
        VkUiView.BannerAd.UiData.BannerLocation bannerLocation;
        VkUiView.BannerAd.UiData.HeightType heightType;
        VkUiView.BannerAd.UiData.Orientation orientation;
        VkUiView vkUiView = (VkUiView) this.d.invoke();
        if (vkUiView == null || (j0 = vkUiView.j0()) == null) {
            return;
        }
        BannerAdUiData.LayoutType layoutType3 = bannerAdUiData.a;
        int[] iArr = in00.a.$EnumSwitchMapping$0;
        int i = iArr[layoutType3.ordinal()];
        if (i == 1) {
            layoutType = VkUiView.BannerAd.UiData.LayoutType.RESIZE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutType = VkUiView.BannerAd.UiData.LayoutType.OVERLAY;
        }
        int i2 = iArr[bannerAdUiData.b.ordinal()];
        if (i2 == 1) {
            layoutType2 = VkUiView.BannerAd.UiData.LayoutType.RESIZE;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutType2 = VkUiView.BannerAd.UiData.LayoutType.OVERLAY;
        }
        int i3 = in00.a.$EnumSwitchMapping$1[bannerAdUiData.c.ordinal()];
        if (i3 == 1) {
            bannerLocation = VkUiView.BannerAd.UiData.BannerLocation.TOP;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bannerLocation = VkUiView.BannerAd.UiData.BannerLocation.BOTTOM;
        }
        VkUiView.BannerAd.UiData.BannerAlign b = in00.b(bannerAdUiData.d);
        int i4 = in00.a.$EnumSwitchMapping$2[bannerAdUiData.e.ordinal()];
        if (i4 == 1 || i4 == 2) {
            heightType = VkUiView.BannerAd.UiData.HeightType.REGULAR;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            heightType = VkUiView.BannerAd.UiData.HeightType.COMPACT;
        }
        int i5 = in00.a.$EnumSwitchMapping$3[bannerAdUiData.f.ordinal()];
        if (i5 == 1) {
            orientation = VkUiView.BannerAd.UiData.Orientation.VERTICAL;
        } else if (i5 == 2) {
            orientation = VkUiView.BannerAd.UiData.Orientation.HORIZONTAL;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            orientation = VkUiView.BannerAd.UiData.Orientation.UNSPECIFIED;
        }
        j0.Q4(view, new VkUiView.BannerAd.UiData(layoutType, layoutType2, bannerLocation, b, heightType, orientation), wzsVar);
    }

    @Override // xsna.y31.c
    public final void b(Integer num) {
        zvp zvpVar = this.f.a;
        Context invoke = this.g.invoke();
        String a = this.e.a(new JsMethod("VKWebAppShowBannerAd"));
        com.vk.superapp.base.js.bridge.b bVar = zvpVar.a;
        JsMethod jsMethod = new JsMethod("VKWebAppShowBannerAd");
        ShowBannerAd$Error.Data.Type type = ShowBannerAd$Error.Data.Type.CLIENT_ERROR;
        String string = invoke != null ? invoke.getString(R.string.vk_invalid_ad_config_error) : null;
        if (string == null) {
            string = "";
        }
        com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(type, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, string, 1, null), null, null, 114686, null), null, 1, null), 2, null), 1, null), a, null, 8);
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        String d = gq.d(num, "Failed to get slots within config with given id: ");
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.c.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(adFormat, null, eventType, requestType, requestSubtype, 1304, d, null, null, null, null));
        }
    }

    @Override // xsna.y31.c
    public final boolean c() {
        VkUiView vkUiView = (VkUiView) this.d.invoke();
        return vkUiView != null && vkUiView.bh();
    }

    @Override // xsna.y31.c
    public final void d(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        VkUiView.BannerAd j0;
        k(true, VkBridgeAnalytics.BannerAdEvent.HIDE_BY_USER, bannerParamsSnapshot, str);
        VkUiView vkUiView = (VkUiView) this.d.invoke();
        if (vkUiView != null && (j0 = vkUiView.j0()) != null) {
            j0.K2();
        }
        com.vk.superapp.base.js.bridge.b bVar = this.f.b.a;
        JsMethod jsMethod = new JsMethod("VKWebAppBannerAdClosedByUser");
        int i = bannerParamsSnapshot.b;
        int i2 = bannerParamsSnapshot.c;
        String a = e2n0.a(bannerParamsSnapshot.f);
        String str2 = a == null ? "" : a;
        String a2 = e2n0.a(bannerParamsSnapshot.g);
        String a3 = e2n0.a(bannerParamsSnapshot.e);
        com.vk.superapp.base.js.bridge.b.p(bVar, jsMethod, new BannerAdClosedByUser$Response(null, new BannerAdClosedByUser$Response.Data(i, i2, str2, a3 == null ? "" : a3, a2, e2n0.a(bannerParamsSnapshot.h), e2n0.a(bannerParamsSnapshot.i), null), null, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.y31.c
    public final void e(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        k(true, VkBridgeAnalytics.BannerAdEvent.HIDE_BY_BRIDGE, bannerParamsSnapshot, str);
    }

    @Override // xsna.y31.c
    public final void f(BannerParamsSnapshot bannerParamsSnapshot, j11 j11Var, String str) {
        e2n0 e2n0Var = this.f.b;
        BannerParamsSnapshot.Orientation orientation = bannerParamsSnapshot.i;
        BannerParamsSnapshot.HeightType heightType = bannerParamsSnapshot.h;
        BannerParamsSnapshot.LayoutType layoutType = bannerParamsSnapshot.e;
        BannerParamsSnapshot.BannerAlign bannerAlign = bannerParamsSnapshot.g;
        BannerParamsSnapshot.BannerLocation bannerLocation = bannerParamsSnapshot.f;
        if (j11Var == null) {
            com.vk.superapp.base.js.bridge.b bVar = e2n0Var.a;
            JsMethod jsMethod = new JsMethod("VKWebAppBannerAdUpdated");
            int i = bannerParamsSnapshot.b;
            int i2 = bannerParamsSnapshot.c;
            String a = e2n0.a(bannerLocation);
            String str2 = a == null ? "" : a;
            String a2 = e2n0.a(bannerAlign);
            String a3 = e2n0.a(layoutType);
            com.vk.superapp.base.js.bridge.b.p(bVar, jsMethod, new BannerAdUpdated$Response(null, new BannerAdUpdated$Response.Data(true, i, i2, str2, a3 == null ? "" : a3, a2, e2n0.a(heightType), e2n0.a(orientation), null, null, null, Tensorflow.FRAME_HEIGHT, null), null, 1, null), null, null, false, null, 60);
            k(true, VkBridgeAnalytics.BannerAdEvent.SHOW_AUTO_UPDATE, bannerParamsSnapshot, str);
            return;
        }
        Responses$ReasonNoAds responses$ReasonNoAds = new Responses$ReasonNoAds(0, null, 3, null);
        int a4 = responses$ReasonNoAds.a();
        String b = responses$ReasonNoAds.b();
        String a5 = j11Var.a();
        com.vk.superapp.base.js.bridge.b bVar2 = e2n0Var.a;
        JsMethod jsMethod2 = new JsMethod("VKWebAppBannerAdUpdated");
        int i3 = bannerParamsSnapshot.b;
        int i4 = bannerParamsSnapshot.c;
        String a6 = e2n0.a(bannerLocation);
        String str3 = a6 == null ? "" : a6;
        String a7 = e2n0.a(layoutType);
        com.vk.superapp.base.js.bridge.b.p(bVar2, jsMethod2, new BannerAdUpdated$Response(null, new BannerAdUpdated$Response.Data(false, i3, i4, str3, a7 == null ? "" : a7, e2n0.a(bannerAlign), e2n0.a(heightType), e2n0.a(orientation), BannerAdUpdated$Response.Data.ErrorType.CLIENT_ERROR, new BannerAdUpdated$Response.Data.ErrorData(a4, b, a5), null), null, 1, null), null, null, false, null, 60);
        k(false, VkBridgeAnalytics.BannerAdEvent.SHOW_AUTO_UPDATE, bannerParamsSnapshot, str);
    }

    @Override // xsna.y31.c
    public final boolean g() {
        return defpackage.j0.b("VKWebAppShowBannerAd", this.a) == null;
    }

    @Override // xsna.y31.c
    public final void h(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        VkUiView.BannerAd j0;
        r31 r31Var = this.b;
        Integer num = r31Var.h;
        Integer num2 = r31Var.i;
        k(true, VkBridgeAnalytics.BannerAdEvent.SHOW_BY_BRIDGE, bannerParamsSnapshot, str);
        VkUiView vkUiView = (VkUiView) this.d.invoke();
        boolean Oe = (vkUiView == null || (j0 = vkUiView.j0()) == null) ? false : j0.Oe();
        e2n0 e2n0Var = this.f.b;
        String a = this.e.a(new JsMethod("VKWebAppShowBannerAd"));
        com.vk.superapp.base.js.bridge.b bVar = e2n0Var.a;
        JsMethod jsMethod = new JsMethod("VKWebAppShowBannerAd");
        int i = bannerParamsSnapshot.b;
        int i2 = bannerParamsSnapshot.c;
        String a2 = e2n0.a(bannerParamsSnapshot.f);
        String str2 = a2 == null ? "" : a2;
        String a3 = e2n0.a(bannerParamsSnapshot.g);
        String a4 = e2n0.a(bannerParamsSnapshot.e);
        com.vk.superapp.base.js.bridge.b.p(bVar, jsMethod, new ShowBannerAd$Response(null, new ShowBannerAd$Response.Data(Oe, i, i2, str2, a4 == null ? "" : a4, a3, e2n0.a(bannerParamsSnapshot.h), e2n0.a(bannerParamsSnapshot.i), null), null, 1, null), null, null, false, a, 28);
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.c.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(adFormat, str, eventType, requestType, requestSubtype, null, null, num2, num, null, null));
        }
    }

    @Override // xsna.y31.c
    public final void i(j11 j11Var, String str) {
        r31 r31Var = this.b;
        Integer num = r31Var.h;
        Integer num2 = r31Var.i;
        k(false, VkBridgeAnalytics.BannerAdEvent.SHOW_BY_BRIDGE, null, str);
        zvp zvpVar = this.f.a;
        String a = j11Var.a();
        com.vk.superapp.base.js.bridge.b.o(zvpVar.a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_NO_ADS, a, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonNoAds(0, null, 3, null), null, 98300, null), null, 1, null), 2, null), 1, null), this.e.a(new JsMethod("VKWebAppShowBannerAd")), null, 8);
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.BRIDGE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        String str2 = j11Var.b;
        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) this.c.invoke();
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.b(new AdRequestEvent(adFormat, str, eventType, requestType, requestSubtype, 2001, str2, num2, num, null, null));
        }
    }

    @Override // xsna.y31.c
    public final void j(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        k(true, VkBridgeAnalytics.BannerAdEvent.TAPPED_BY_USER, bannerParamsSnapshot, str);
    }

    public final void k(boolean z, VkBridgeAnalytics.BannerAdEvent bannerAdEvent, BannerParamsSnapshot bannerParamsSnapshot, String str) {
        r31 r31Var;
        VkBridgeAnalytics vkBridgeAnalytics;
        BannerParamsSnapshot d = bannerParamsSnapshot != null ? bannerParamsSnapshot.d() : null;
        VkBridgeAnalytics.BannerAdEvent bannerAdEvent2 = VkBridgeAnalytics.BannerAdEvent.TAPPED_BY_USER;
        drg drgVar = this.c;
        r31 r31Var2 = this.b;
        if (bannerAdEvent == bannerAdEvent2) {
            r31.b bVar = r31Var2.j;
            if (bVar == null || bVar.d) {
                return;
            }
            try {
                VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) drgVar.invoke();
                if (vkBridgeAnalytics2 != null) {
                    vkBridgeAnalytics2.a(bannerAdEvent2, z, bVar, d, str);
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable unused) {
            }
            bVar.d = true;
            return;
        }
        if (bannerAdEvent == VkBridgeAnalytics.BannerAdEvent.HIDE_BY_BRIDGE || bannerAdEvent == VkBridgeAnalytics.BannerAdEvent.HIDE_BY_USER) {
            r31.b bVar2 = r31Var2.j;
            if (bVar2 != null) {
                try {
                    VkBridgeAnalytics vkBridgeAnalytics3 = (VkBridgeAnalytics) drgVar.invoke();
                    if (vkBridgeAnalytics3 != null) {
                        vkBridgeAnalytics3.a(bannerAdEvent, z, bVar2, d, str);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } catch (Throwable unused2) {
                }
                r31Var2.j = null;
                return;
            }
            return;
        }
        try {
            vkBridgeAnalytics = (VkBridgeAnalytics) drgVar.invoke();
        } catch (Throwable unused3) {
        }
        if (vkBridgeAnalytics != null) {
            vkBridgeAnalytics.a(bannerAdEvent, z, r31Var2, d, str);
            r31Var = r31Var2;
            try {
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable unused4) {
            }
            r31Var.i = null;
            r31Var.k = null;
        }
        r31Var = r31Var2;
        r31Var.i = null;
        r31Var.k = null;
    }
}
