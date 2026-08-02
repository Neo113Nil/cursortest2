package com.vungle.ads;

import com.vungle.ads.internal.util.s;

/* loaded from: classes7.dex */
public final class VungleMediationLoggerKt {
    public static final s access$getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof BaseAd) {
            return ((BaseAd) vungleAdType).getLogEntry$vungle_ads_release();
        }
        if (vungleAdType instanceof VungleBannerView) {
            return ((VungleBannerView) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
