package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes8.dex */
public interface NativeAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(NativeAd nativeAd);
}
