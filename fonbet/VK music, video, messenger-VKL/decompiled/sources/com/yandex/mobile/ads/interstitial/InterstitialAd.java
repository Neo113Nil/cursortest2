package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;

/* loaded from: classes8.dex */
public interface InterstitialAd {
    AdInfo getInfo();

    void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener);

    void show(Activity activity);
}
