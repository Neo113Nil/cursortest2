package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import defpackage.cy61;
import java.util.Map;

/* loaded from: classes7.dex */
public final class c implements cy61 {
    public MediatedAppOpenAdAdapter a;

    @Override // defpackage.cy61
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedAppOpenAdAdapter mediatedAppOpenAdAdapter = (MediatedAppOpenAdAdapter) aVar;
        this.a = mediatedAppOpenAdAdapter;
        mediatedAppOpenAdAdapter.loadAppOpenAd(context, (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj, map, map2);
    }

    @Override // defpackage.cy61
    public final void a(Object obj) {
        ((MediatedAppOpenAdAdapter) obj).onInvalidate();
    }
}
