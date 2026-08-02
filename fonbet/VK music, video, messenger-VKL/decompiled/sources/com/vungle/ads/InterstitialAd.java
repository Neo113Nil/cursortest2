package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.g1;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class InterstitialAd extends BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(Context context, String str, AdConfig adConfig, int i, zcl zclVar) {
        this(context, str, (i & 4) != 0 ? new AdConfig() : adConfig);
    }

    public InterstitialAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.BaseAd
    public g1 constructAdInternal$vungle_ads_release(Context context) {
        return new g1(context);
    }
}
