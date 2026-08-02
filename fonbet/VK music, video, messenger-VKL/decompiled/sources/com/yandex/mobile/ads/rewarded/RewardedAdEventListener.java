package com.yandex.mobile.ads.rewarded;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes8.dex */
public interface RewardedAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();

    void onRewarded(Reward reward);
}
