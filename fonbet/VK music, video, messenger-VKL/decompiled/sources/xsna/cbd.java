package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vkontakte.android.R;

/* compiled from: ClipProductAttachesTileAdapter.kt */
/* loaded from: classes18.dex */
public final class cbd extends vfz<qad> {
    public final izs<MarketProductTileConfig, s3q0> l;
    public final izs<MarketProductTileConfig, s3q0> m;
    public final izs<Integer, s3q0> n;
    public final MarketProductTileView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cbd(ViewGroup viewGroup, izs<? super MarketProductTileConfig, s3q0> izsVar, izs<? super MarketProductTileConfig, s3q0> izsVar2, izs<? super Integer, s3q0> izsVar3) {
        super(r0);
        MarketProductTileView marketProductTileView = new MarketProductTileView(viewGroup.getContext(), null);
        marketProductTileView.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(170), -2));
        this.l = izsVar;
        this.m = izsVar2;
        this.n = izsVar3;
        getContext();
        View view = this.itemView;
        this.o = (MarketProductTileView) view;
        f4m.y(iah0.a(2), view);
        f4m.v(iah0.a(6), this.itemView);
        View view2 = this.itemView;
        int f = l8g.f(0.7f, krv0.l(R.attr.vk_ui_background_contrast_inverse));
        int a = iah0.a(14);
        GradientDrawable a2 = ful0.a(0);
        a2.setCornerRadius(a);
        a2.setColor(f);
        view2.setBackground(a2);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(qad qadVar) {
        qad qadVar2 = qadVar;
        MarketProductTileConfig marketProductTileConfig = qadVar2.b;
        MarketProductTileView marketProductTileView = this.o;
        marketProductTileView.P4(marketProductTileConfig);
        marketProductTileView.Z4(new ig1(6, this, qadVar2));
        marketProductTileView.Q4(new p5(7, this, qadVar2));
        marketProductTileView.U4(new com.vk.movika.sdk.base.presenter.c(7, this, qadVar2));
        izs<Integer, s3q0> izsVar = this.n;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(getBindingAdapterPosition()));
        }
    }
}
