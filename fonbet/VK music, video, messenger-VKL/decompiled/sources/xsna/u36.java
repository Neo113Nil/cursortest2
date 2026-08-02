package xsna;

import android.content.Context;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;

/* compiled from: BannerViewFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class u36 implements t36 {
    @Override // xsna.t36
    public final s36 c(Context context, BannerAdUiData bannerAdUiData, boolean z) {
        return z ? (bannerAdUiData.e == BannerAdUiData.HeightType.COMPACT && bannerAdUiData.d == BannerAdUiData.BannerAlign.UNSPECIFIED) ? new s5i(context) : bannerAdUiData.b == BannerAdUiData.LayoutType.OVERLAY ? new oly(context) : bannerAdUiData.f == BannerAdUiData.Orientation.VERTICAL ? new lor0(context) : new prf0(context) : new prf0(context);
    }
}
