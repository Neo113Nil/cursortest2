package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdBindingResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAd;", "", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "viewBinder", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "bindNativeAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)Lcom/yandex/mobile/ads/common/AdBindingResult;", "Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "getAdAssets", "()Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "adAssets", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NativeAd {
    AdBindingResult bindNativeAd(NativeAdViewBinder viewBinder);

    NativeAdAssets getAdAssets();
}
