package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import defpackage.cy61;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b implements cy61 {
    public MediatedInterstitialAdapter a;

    @Override // defpackage.cy61
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }

    @Override // defpackage.cy61
    public final void a(Object obj) {
        ((MediatedInterstitialAdapter) obj).onInvalidate();
    }
}
