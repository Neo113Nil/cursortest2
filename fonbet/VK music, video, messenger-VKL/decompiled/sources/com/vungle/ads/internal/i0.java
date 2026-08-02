package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;

/* loaded from: classes7.dex */
public final class i0 extends BaseAd {
    public final VungleAdSize s;
    public final j0 t;

    public i0(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.s = vungleAdSize;
        this.t = ((k0) getAdInternal$vungle_ads_release()).a(new h0(this));
    }

    public final j0 a() {
        return this.t;
    }

    @Override // com.vungle.ads.BaseAd
    public final s constructAdInternal$vungle_ads_release(Context context) {
        return new k0(context, this.s);
    }

    public final VungleAdSize getAdViewSize() {
        VungleAdSize m = ((k0) getAdInternal$vungle_ads_release()).m();
        return m == null ? this.s : m;
    }
}
