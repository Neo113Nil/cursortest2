package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import defpackage.cy61;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b implements cy61 {
    @Override // defpackage.cy61
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedBannerAdapter) aVar).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }

    @Override // defpackage.cy61
    public final void a(Object obj) {
        ((MediatedBannerAdapter) obj).onInvalidate();
    }
}
