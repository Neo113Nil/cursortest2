package xsna;

import android.view.View;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import xsna.gwf;
import xsna.r31;
import xsna.y31;

/* compiled from: ClosingBannerAdResultCallbackImpl.kt */
/* loaded from: classes6.dex */
public final class fwf implements y31.c {
    public final r31 a;
    public final wu0 b;
    public final gzs<Boolean> c;
    public final gwf.a d;

    public fwf(r31 r31Var, yu0 yu0Var, gzs gzsVar, gwf.a aVar) {
        this.a = r31Var;
        this.b = yu0Var;
        this.c = gzsVar;
        this.d = aVar;
    }

    @Override // xsna.y31.c
    public final void a(View view, BannerAdUiData bannerAdUiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.d.a(view, wzsVar);
    }

    @Override // xsna.y31.c
    public final void b(Integer num) {
        this.b.b(new AdRequestEvent(AdRequestEvent.AdFormat.BANNER, null, AdRequestEvent.EventType.REQUEST, AdRequestEvent.RequestType.CLOSE, AdRequestEvent.RequestSubtype.SHOW, 1304, gq.d(num, "Failed to get slots within config with given id: "), null, null, null, null));
    }

    @Override // xsna.y31.c
    public final boolean c() {
        return this.c.invoke().booleanValue();
    }

    @Override // xsna.y31.c
    public final void d(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        k(true, VkBridgeAnalytics.BannerAdEvent.HIDE_BY_USER, bannerParamsSnapshot, str);
        this.d.K2();
    }

    @Override // xsna.y31.c
    public final void e(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        k(true, VkBridgeAnalytics.BannerAdEvent.HIDE_BY_BRIDGE, bannerParamsSnapshot, str);
    }

    @Override // xsna.y31.c
    public final boolean g() {
        return false;
    }

    @Override // xsna.y31.c
    public final void h(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        r31 r31Var = this.a;
        Integer num = r31Var.h;
        Integer num2 = r31Var.i;
        k(true, VkBridgeAnalytics.BannerAdEvent.SHOW_BY_BRIDGE, bannerParamsSnapshot, str);
        this.b.b(new AdRequestEvent(AdRequestEvent.AdFormat.BANNER, str, AdRequestEvent.EventType.REQUEST, AdRequestEvent.RequestType.CLOSE, AdRequestEvent.RequestSubtype.SHOW, null, null, num2, num, null, null));
    }

    @Override // xsna.y31.c
    public final void i(j11 j11Var, String str) {
        r31 r31Var = this.a;
        Integer num = r31Var.h;
        Integer num2 = r31Var.i;
        k(false, VkBridgeAnalytics.BannerAdEvent.SHOW_BY_BRIDGE, null, str);
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.CLOSE;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        int i = j11Var.a;
        this.b.b(new AdRequestEvent(adFormat, str, eventType, requestType, requestSubtype, Integer.valueOf(i), j11Var.b, num2, num, null, null));
    }

    @Override // xsna.y31.c
    public final void j(BannerParamsSnapshot bannerParamsSnapshot, String str) {
        k(true, VkBridgeAnalytics.BannerAdEvent.TAPPED_BY_USER, bannerParamsSnapshot, str);
    }

    public final void k(boolean z, VkBridgeAnalytics.BannerAdEvent bannerAdEvent, BannerParamsSnapshot bannerParamsSnapshot, String str) {
        r31 r31Var;
        BannerParamsSnapshot d = bannerParamsSnapshot != null ? bannerParamsSnapshot.d() : null;
        VkBridgeAnalytics.BannerAdEvent bannerAdEvent2 = VkBridgeAnalytics.BannerAdEvent.TAPPED_BY_USER;
        r31 r31Var2 = this.a;
        if (bannerAdEvent == bannerAdEvent2) {
            r31.b bVar = r31Var2.j;
            if (bVar == null || bVar.d) {
                return;
            }
            try {
                this.b.a(bannerAdEvent2, z, bVar, d, str);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            bVar.d = true;
            return;
        }
        if (bannerAdEvent == VkBridgeAnalytics.BannerAdEvent.HIDE_BY_BRIDGE || bannerAdEvent == VkBridgeAnalytics.BannerAdEvent.HIDE_BY_USER) {
            r31.b bVar2 = r31Var2.j;
            if (bVar2 != null) {
                try {
                    this.b.a(bannerAdEvent, z, bVar2, d, str);
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable unused2) {
                }
                r31Var2.j = null;
                return;
            }
            return;
        }
        try {
            this.b.a(bannerAdEvent, z, r31Var2, d, str);
            r31Var = r31Var2;
            try {
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            r31Var = r31Var2;
        }
        r31Var.i = null;
        r31Var.k = null;
    }

    @Override // xsna.y31.c
    public final void f(BannerParamsSnapshot bannerParamsSnapshot, j11 j11Var, String str) {
    }
}
