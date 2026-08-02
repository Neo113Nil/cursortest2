package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Good;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: MarketItemFaveHolder.kt */
/* loaded from: classes4.dex */
public final class r110 extends qi6<FaveEntry> implements f530, View.OnClickListener {
    public final q530 C;
    public final dhc D;
    public final lt00 E;
    public Good F;
    public final VKImageView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final baf0 K;
    public final baf0 L;
    public final p530 M;
    public final j08 N;

    public r110(ViewGroup viewGroup, q530 q530Var, dhc dhcVar, lt00 lt00Var) {
        super(R.layout.product_preview_holder, viewGroup);
        this.C = q530Var;
        this.D = dhcVar;
        this.E = lt00Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_product_image);
        this.G = vKImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_product_title);
        this.H = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_product_price);
        this.I = textView2;
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.tv_product_price_old);
        this.J = textView3;
        this.K = dhr0.x(R.drawable.ic_market_outline_56_placeholder, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, viewGroup.getContext());
        this.L = dhr0.x(R.drawable.ic_services_outline_56_placeholder, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, viewGroup.getContext());
        this.M = new p530(this.itemView, vKImageView, textView, textView2, textView3, 32);
        this.N = new j08();
        vKImageView.setAspectRatio(2.35f);
        textView3.setPaintFlags(textView3.getPaintFlags() | 17);
    }

    @Override // xsna.qi6
    public final void E6(FaveEntry faveEntry) {
        gmq gmqVar = faveEntry.i.f;
        if (!(gmqVar instanceof FaveMarketItem)) {
            StringBuilder sb = new StringBuilder("Can't setup product for ");
            Good good = this.F;
            sb.append(good != null ? good : null);
            L.l(sb.toString());
            return;
        }
        Good good2 = ((FaveMarketItem) gmqVar).b;
        this.F = good2;
        q530 q530Var = this.C;
        if (q530Var == null) {
            o1(null);
            return;
        }
        if (good2 == null) {
            good2 = null;
        }
        q530Var.c(e530.b(good2, null), this, new z410(3));
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.N.getClass();
        j08.a(u1c0Var);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.M;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good = this.F;
        if (good == null) {
            good = null;
        }
        baf0 baf0Var = good.V ? this.L : this.K;
        VKImageView vKImageView = this.G;
        vKImageView.setPlaceholderImage(baf0Var);
        bwt0.S(vKImageView, new dxh(this, 23));
        Good good2 = this.F;
        if (good2 == null) {
            good2 = null;
        }
        this.H.setText(good2.e);
        Good good3 = this.F;
        if (good3 == null) {
            good3 = null;
        }
        String str = good3.h.e;
        TextView textView = this.I;
        textView.setText(str);
        Good good4 = this.F;
        if (good4 == null) {
            good4 = null;
        }
        String str2 = good4.h.f;
        TextView textView2 = this.J;
        if (str2 == null || str2.length() == 0) {
            textView2.setVisibility(8);
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_subhead));
            com.vk.typography.b.k(textView, FontFamily.REGULAR, null, 6);
        } else {
            textView2.setText(str2);
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, null, 6);
            textView2.setVisibility(0);
        }
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var = this.y;
        if (s980Var != null) {
            NewsEntry t6 = t6();
            u1c0 J0 = J0();
            s980Var.U5(t6, true, J0 != null ? J0.k : -1);
        }
    }
}
