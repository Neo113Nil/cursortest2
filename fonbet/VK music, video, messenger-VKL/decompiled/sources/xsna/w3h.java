package xsna;

import android.view.View;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: CommunityHeaderSharedItemsFactory.kt */
/* loaded from: classes5.dex */
public final class w3h implements yzs<MarketProductTileConfig.f, Integer, View, s3q0> {
    public final /* synthetic */ d4h b;

    public w3h(d4h d4hVar) {
        this.b = d4hVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(MarketProductTileConfig.f fVar, Integer num, View view) {
        this.b.i.invoke(new CommunityProfileAction.n.e.c(view, fVar.a, num.intValue()));
        return s3q0.a;
    }
}
