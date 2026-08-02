package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class MobileAdsNativeBannerView$configure$divConfiguration$4 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int resolveShimmeringColor;
        resolveShimmeringColor = ((MobileAdsNativeBannerView) this.receiver).resolveShimmeringColor((ThemeType) obj);
        return Integer.valueOf(resolveShimmeringColor);
    }
}
