package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Good;
import com.vk.dto.common.Price;
import com.vk.ecomm.design.view.tile.MarketItemRatingSnippetView;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;

/* compiled from: GoodsAdapter.kt */
/* loaded from: classes16.dex */
public final class o8u extends RecyclerView.e0 implements f530 {
    public static final /* synthetic */ int x = 0;
    public final View l;
    public final CommonMarketStat$TypeRefSource m;
    public final q530 n;
    public final wzs<Good, Integer, s3q0> o;
    public final lt00 p;
    public final VKImageView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final MarketItemRatingSnippetView u;
    public final p530 v;
    public Good w;

    public o8u(View view, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, q530 q530Var, k87 k87Var, lt00 lt00Var) {
        super(view);
        this.l = view;
        this.m = commonMarketStat$TypeRefSource;
        this.n = q530Var;
        this.o = k87Var;
        this.p = lt00Var;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.image);
        this.q = vKImageView;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.r = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.price);
        this.s = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.old_price);
        textView3.setPaintFlags(textView3.getPaintFlags() | 17);
        this.t = textView3;
        this.u = (MarketItemRatingSnippetView) this.itemView.findViewById(R.id.market_item_rating_view);
        this.v = new p530(this.itemView, vKImageView, textView, textView2, textView3, 32);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.v;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good = this.w;
        if (good == null) {
            return;
        }
        Price price = good.h;
        bwt0.L(this.q, good.n);
        this.r.setText(good.d);
        this.s.setText(price.e);
        this.t.setText(price.f);
        bwt0.g0(this.l, new k8(17, this, good));
    }
}
