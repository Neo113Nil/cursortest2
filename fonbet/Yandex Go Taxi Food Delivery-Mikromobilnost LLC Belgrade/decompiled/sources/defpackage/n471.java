package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;

/* loaded from: classes7.dex */
public final class n471 implements cy61 {
    @Override // defpackage.cy61
    public final void a(Context context, a aVar, Object obj, Map map, Map map2) {
        ((MediatedRewardedAdapter) aVar).loadRewardedAd(context, (MediatedRewardedAdapterListener) obj, map, map2);
    }

    @Override // defpackage.cy61
    public final void a(Object obj) {
        ((MediatedRewardedAdapter) obj).onInvalidate();
    }
}
