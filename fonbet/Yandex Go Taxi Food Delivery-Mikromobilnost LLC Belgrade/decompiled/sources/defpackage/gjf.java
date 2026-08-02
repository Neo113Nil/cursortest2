package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.image.CustomDivImageLoader;
import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.MobileAdsNativeBannerView;

/* loaded from: classes10.dex */
public final /* synthetic */ class gjf implements hxy {
    public final /* synthetic */ int a;

    public /* synthetic */ gjf(int i) {
        this.a = i;
    }

    private final void a() {
    }

    @Override // defpackage.hxy
    public final void cancel() {
        switch (this.a) {
            case 0:
                CustomDivImageLoader.loadImage$lambda$3();
                break;
            case 1:
                CustomDivImageLoader.loadImage$lambda$1();
                break;
            case 2:
                break;
            case 3:
                ivk ivkVar = pxk.a;
                break;
            default:
                MobileAdsNativeBannerView.configure$lambda$0$0();
                break;
        }
    }
}
