package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;

/* compiled from: MarketLinkedContentRouterImpl.kt */
/* loaded from: classes18.dex */
public final class a710 implements z610 {
    @Override // xsna.z610
    public final void a(Context context, long j, UserId userId, boolean z, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        MarketLinkedContentFragment.a aVar = new MarketLinkedContentFragment.a(MarketLinkedContentFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putLong("good_id", j);
        bundle.putParcelable("owner_id", userId);
        bundle.putParcelable("analytics_params", linkedContentAnalyticsParams);
        bundle.putBoolean("is_service", z);
        aVar.k(context);
    }
}
