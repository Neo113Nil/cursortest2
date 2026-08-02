package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.u1;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i, zcl zclVar) {
        this(context, str, (i & 4) != 0 ? new AdConfig() : adConfig);
    }

    public final void setAlertBodyText(String str) {
        ((u1) getAdInternal$vungle_ads_release()).a(str);
    }

    public final void setAlertCloseButtonText(String str) {
        ((u1) getAdInternal$vungle_ads_release()).b(str);
    }

    public final void setAlertContinueButtonText(String str) {
        ((u1) getAdInternal$vungle_ads_release()).c(str);
    }

    public final void setAlertTitleText(String str) {
        ((u1) getAdInternal$vungle_ads_release()).d(str);
    }

    public final void setUserId(String str) {
        ((u1) getAdInternal$vungle_ads_release()).e(str);
    }

    public RewardedAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.BaseAd
    public u1 constructAdInternal$vungle_ads_release(Context context) {
        return new u1(context);
    }
}
