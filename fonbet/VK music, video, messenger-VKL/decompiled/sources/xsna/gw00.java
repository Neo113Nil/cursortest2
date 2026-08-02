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
import kotlin.Lazy;

/* compiled from: MarketCommonItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class gw00 implements f530 {
    public final FrameLayout b;
    public final MarketProductTileView c;
    public final u4a d;
    public final dw00 e;
    public final bw00 f;
    public UIBlock g;
    public Good h;
    public UIBlockMarketItemStyle i;
    public Integer j;

    public gw00(FrameLayout frameLayout, MarketProductTileView marketProductTileView, u4a u4aVar, boolean z) {
        this.b = frameLayout;
        this.c = marketProductTileView;
        this.d = u4aVar;
        Context context = frameLayout.getContext();
        Lazy<isd0> lazy = u4aVar.b.M;
        this.e = new dw00(z, context, lazy != null ? lazy.getValue() : null);
        this.f = new bw00(u4aVar, frameLayout.getContext());
    }

    public final void a(final UIBlock uIBlock, final Good good, boolean z) {
        final cw00 a = dw00.a(this.e, good, z, this.i);
        MarketProductTileConfig marketProductTileConfig = a.a;
        MarketProductTileView marketProductTileView = this.c;
        marketProductTileView.P4(marketProductTileConfig);
        marketProductTileView.U4(new uw5(1, uIBlock, good, a, this));
        marketProductTileView.I = new b1a(21, this, good);
        if (z) {
            marketProductTileView.Z4(null);
            marketProductTileView.Q4(null);
            return;
        }
        marketProductTileView.Z4(new gzs() { // from class: xsna.ew00
            @Override // xsna.gzs
            public final Object invoke() {
                cw00 cw00Var = cw00.this;
                if (!cw00Var.c && !cw00Var.b) {
                    gw00 gw00Var = this;
                    gw00Var.f.b.b.d.j(new tu00(uIBlock, good, gw00Var.j));
                }
                return s3q0.a;
            }
        });
        marketProductTileView.Q4(new fw00(this, good, uIBlock, 0));
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
        Good good = this.h;
        UIBlock uIBlock = this.g;
        if (good == null || uIBlock == null) {
            return;
        }
        a(uIBlock, good, false);
    }
}
