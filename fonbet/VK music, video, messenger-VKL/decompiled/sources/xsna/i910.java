package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.dto.common.Good;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.Lazy;

/* compiled from: MarketMusicItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class i910 implements f530 {
    public final FrameLayout b;
    public final MarketProductTileView c;
    public final u4a d;
    public final CommonMarketStat$TypeRefSource e;
    public final dw00 f;
    public final ot00 g;
    public UIBlock h;
    public Good i;
    public UIBlockMarketItemStyle j;
    public Integer k;

    public i910(FrameLayout frameLayout, MarketProductTileView marketProductTileView, u4a u4aVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, fy00 fy00Var, sz00 sz00Var, lt00 lt00Var, smq smqVar, boolean z) {
        this.b = frameLayout;
        this.c = marketProductTileView;
        this.d = u4aVar;
        this.e = commonMarketStat$TypeRefSource;
        Context context = frameLayout.getContext();
        Lazy<isd0> lazy = u4aVar.b.M;
        this.f = new dw00(z, context, lazy != null ? lazy.getValue() : null);
        this.g = new ot00(u4aVar, frameLayout.getContext(), fy00Var, sz00Var, lt00Var, smqVar);
    }

    public final void a(final UIBlock uIBlock, final Good good, boolean z, final CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        final cw00 a = dw00.a(this.f, good, z, this.j);
        MarketProductTileConfig marketProductTileConfig = a.a;
        MarketProductTileView marketProductTileView = this.c;
        marketProductTileView.P4(marketProductTileConfig);
        marketProductTileView.U4(new qc3(uIBlock, good, commonMarketStat$TypeRefSource, a, this));
        marketProductTileView.I = new oh3(19, this, good);
        if (z) {
            marketProductTileView.Z4(null);
            marketProductTileView.Q4(null);
            return;
        }
        marketProductTileView.Z4(new gzs() { // from class: xsna.h910
            @Override // xsna.gzs
            public final Object invoke() {
                cw00 cw00Var = a;
                if (!cw00Var.c && !cw00Var.b) {
                    i910 i910Var = this;
                    ot00 ot00Var = i910Var.g;
                    Integer num = i910Var.k;
                    m3a m3aVar = ot00Var.a.b.d;
                    UIBlock uIBlock2 = uIBlock;
                    Good good2 = good;
                    m3aVar.j(new tu00(uIBlock2, good2, num));
                    ot00Var.d.d(ot00Var.b, new qz00(good2.b, good2.c, commonMarketStat$TypeRefSource, null, null, null, null, null, null, null, null, null, null, 1048568));
                }
                return s3q0.a;
            }
        });
        marketProductTileView.Q4(new yy0(this, good, uIBlock, 6));
        FrameLayout frameLayout = this.b;
        frameLayout.setOnClickListener(null);
        frameLayout.setClickable(false);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return new p530(this.b, (VKImageView) null, (TextView) null, (TextView) null, (TextView) null, 60);
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good = this.i;
        UIBlock uIBlock = this.h;
        if (good == null || uIBlock == null) {
            return;
        }
        a(uIBlock, good, false, this.e);
    }
}
