package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MarketItemHolder.kt */
/* loaded from: classes18.dex */
public final class v110 extends vfz<a210> implements f530 {
    public final boolean l;
    public final fhb0 m;
    public final q530 n;
    public final isq o;
    public a210 p;
    public final MarketProductTileView q;
    public final p530 r;

    public v110(ViewGroup viewGroup, boolean z, fhb0 fhb0Var, q530 q530Var, isq isqVar) {
        super(R.layout.community_market_good_item, viewGroup);
        this.l = z;
        this.m = fhb0Var;
        this.n = q530Var;
        this.o = isqVar;
        this.q = (MarketProductTileView) this.itemView.findViewById(R.id.market_product_tile);
        this.r = new p530(this.itemView, (VKImageView) null, (TextView) null, (TextView) null, (TextView) null, 60);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(a210 a210Var) {
        a210 a210Var2 = a210Var;
        this.p = a210Var2;
        long j = a210Var2.b;
        UserId userId = a210Var2.c;
        this.m.a(new qo00(userId, j, getAbsoluteAdapterPosition()));
        Long valueOf = Long.valueOf(j);
        Photo photo = a210Var2.h;
        this.n.c(new c530(a210Var2.j, a210Var2.i, false, null, new d530(userId, valueOf, null, photo != null ? photo.y : null)), this, new com.vk.movika.sdk.base.logic.processor.d(20, this, a210Var2));
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.r;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Context context = this.itemView.getContext();
        a210 a210Var = this.p;
        if (a210Var == null) {
            a210Var = null;
        }
        MarketProductTileConfig a = c510.a(context, a210Var, false);
        MarketProductTileView marketProductTileView = this.q;
        marketProductTileView.P4(a);
        marketProductTileView.Z4(new qk(12, this, num));
        this.itemView.setOnClickListener(null);
        this.itemView.setClickable(false);
        marketProductTileView.U4(new u110(this, 0));
    }
}
