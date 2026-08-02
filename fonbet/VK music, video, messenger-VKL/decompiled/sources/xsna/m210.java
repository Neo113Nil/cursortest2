package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.ui.reviewbody.ReviewBodyView;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;

/* compiled from: MarketItemReviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class m210 extends vfz<h210> {
    public final h780 l;
    public final ConstraintLayout m;
    public final ReviewHeaderView n;
    public final ReviewBodyView o;
    public final VKCircleImageView p;
    public h210 q;

    public m210(ViewGroup viewGroup, h780 h780Var, RecyclerView.u uVar) {
        super(e0n.a(R.layout.market_item_review_item_view_holder, viewGroup, true));
        this.l = h780Var;
        this.m = (ConstraintLayout) this.itemView.findViewById(R.id.review_cl);
        ReviewHeaderView reviewHeaderView = (ReviewHeaderView) this.itemView.findViewById(R.id.review_header);
        this.n = reviewHeaderView;
        ReviewBodyView reviewBodyView = (ReviewBodyView) this.itemView.findViewById(R.id.review_body);
        this.o = reviewBodyView;
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.photo);
        this.p = vKCircleImageView;
        l210 l210Var = new l210(this);
        bwt0.i0(this.itemView, new o3w(this, 7));
        bwt0.i0(vKCircleImageView, new j4x(this, 5));
        reviewHeaderView.j = l210Var;
        ReviewBodyView.a(reviewBodyView, l210Var, uVar);
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
    }

    @Override // xsna.vfz
    public final void W5(h210 h210Var) {
        String str;
        h210 h210Var2 = h210Var;
        this.q = h210Var2;
        e0n.b(this.itemView, h210Var2.l);
        this.n.setData(h210Var2.f);
        ugg0 ugg0Var = h210Var2.g;
        int size = ugg0Var.a.size();
        if (size == 1) {
            str = b6().getString(R.string.reviews_downloaded_photo_accessibility);
        } else {
            str = size + " " + b6().getString(R.string.reviews_downloaded_photo_accessibility);
        }
        this.o.b(ugg0Var, str);
        this.p.o0(h210Var2.e, null);
        this.m.setContentDescription(b6().getString(R.string.community_review_item_number_accessibility, Integer.valueOf(getBindingAdapterPosition() - 1), Integer.valueOf(h210Var2.k)) + " " + ugg0Var.b.a);
    }
}
