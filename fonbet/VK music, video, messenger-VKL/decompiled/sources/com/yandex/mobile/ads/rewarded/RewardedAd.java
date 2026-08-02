package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;

/* loaded from: classes8.dex */
public interface RewardedAd {
    AdInfo getInfo();

    void setAdEventListener(RewardedAdEventListener rewardedAdEventListener);

    void show(Activity activity);
}
