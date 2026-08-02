package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import yads.dr3;
import yads.lv3;
import yads.mv3;
import yads.r10;

/* loaded from: classes8.dex */
public final class RewardedAdLoader {
    private final r10 a;
    private final dr3 b = new dr3();

    public RewardedAdLoader(Context context) {
        this.a = new r10(context, new mv3(context));
    }

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        this.a.a.a(this.b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(RewardedAdLoadListener rewardedAdLoadListener) {
        this.a.a.a(rewardedAdLoadListener != null ? new lv3(rewardedAdLoadListener) : null);
    }
}
