package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes8.dex */
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(InterstitialAd interstitialAd);
}
