package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: CommunityHeaderSharedItemsFactory.kt */
/* loaded from: classes5.dex */
public final class y3h implements wzs<MarketProductTileConfig.f, Integer, s3q0> {
    public final /* synthetic */ d4h b;

    public y3h(d4h d4hVar) {
        this.b = d4hVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(MarketProductTileConfig.f fVar, Integer num) {
        this.b.i.invoke(new CommunityProfileAction.n.e.C1591e(fVar.a, num.intValue()));
        return s3q0.a;
    }
}
