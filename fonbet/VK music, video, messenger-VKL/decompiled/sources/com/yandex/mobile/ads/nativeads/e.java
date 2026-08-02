package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import yads.f9;
import yads.g9;
import yads.hq2;
import yads.jq2;

/* loaded from: classes8.dex */
public final class e {
    public final jq2 a;
    public final f9 b;

    public e(jq2 jq2Var, f9 f9Var) {
        this.a = jq2Var;
        this.b = f9Var;
    }

    public final g9 a(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        hq2 hq2Var;
        AdTheme preferredTheme = nativeAdRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.a.getClass();
            hq2Var = jq2.a(preferredTheme);
        } else {
            hq2Var = null;
        }
        hq2 hq2Var2 = hq2Var;
        this.b.getClass();
        return new g9(nativeAdRequestConfiguration.getAdUnitId(), nativeAdRequestConfiguration.getAge(), nativeAdRequestConfiguration.getGender(), nativeAdRequestConfiguration.getContextQuery(), nativeAdRequestConfiguration.getContextTags(), nativeAdRequestConfiguration.getLocation(), nativeAdRequestConfiguration.getParameters(), nativeAdRequestConfiguration.getBiddingData(), null, hq2Var2, nativeAdRequestConfiguration.getShouldLoadImagesAutomatically(), null);
    }

    public /* synthetic */ e() {
        this(new jq2(), new f9());
    }
}
