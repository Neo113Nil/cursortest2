package com.yandex.mobile.ads.rewarded;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes8.dex */
public interface RewardedAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(RewardedAd rewardedAd);
}
