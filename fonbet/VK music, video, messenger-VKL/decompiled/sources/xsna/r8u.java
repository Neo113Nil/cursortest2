package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketItemRating;
import com.vk.ecomm.design.view.tile.MarketItemRatingSnippetView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: GoodsAdapter.kt */
/* loaded from: classes16.dex */
public final class r8u extends RecyclerView.Adapter<o8u> implements w8i {
    public final q530 d;
    public final CommonMarketStat$TypeRefSource e;
    public final k87 f;
    public final int c = R.layout.catalog_market_group_large_good_item;
    public final lt00 g = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7();
    public final ArrayList<Good> h = new ArrayList<>();

    public r8u(q530 q530Var, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, k87 k87Var) {
        this.d = q530Var;
        this.e = commonMarketStat$TypeRefSource;
        this.f = k87Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(o8u o8uVar, int i) {
        o8u o8uVar2 = o8uVar;
        Good good = this.h.get(i);
        o8uVar2.w = good;
        lt00.h(o8uVar2.p, Long.valueOf(good.b), Long.valueOf(good.c.b), Integer.valueOf(o8uVar2.getAbsoluteAdapterPosition()), o8uVar2.m, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
        MarketItemRatingSnippetView marketItemRatingSnippetView = o8uVar2.u;
        MarketItemRating marketItemRating = good.t;
        boolean z = marketItemRating != null;
        Float f = marketItemRating != null ? marketItemRating.b : null;
        String str = marketItemRating != null ? marketItemRating.d : null;
        int i2 = MarketItemRatingSnippetView.f;
        marketItemRatingSnippetView.a(z, f, str, new ywo(null, null, null));
        q530 q530Var = o8uVar2.n;
        if (q530Var != null) {
            q530Var.c(e530.b(good, null), o8uVar2, new z410(3));
        } else {
            o8uVar2.o1(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final o8u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = o8u.x;
        return new o8u(bwt0.I(this.c, viewGroup, false), this.e, this.d, this.f, this.g);
    }
}
