package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MarketCategoryViewHolder.kt */
/* loaded from: classes18.dex */
public final class wv00 extends nfz<vv00> {
    public static final int q = cn70.b(16);
    public static final int r = cn70.b(16);
    public final ViewGroup m;
    public final TextView n;
    public final VKImageView o;
    public final ImageView p;

    public wv00(ViewGroup viewGroup) {
        super(R.layout.market_filter_category_holder, viewGroup);
        this.m = (ViewGroup) this.itemView.findViewById(R.id.market_category_root);
        this.n = (TextView) this.itemView.findViewById(R.id.category_name);
        this.o = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.p = (ImageView) this.itemView.findViewById(R.id.category_pick);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        vv00 vv00Var = (vv00) hfzVar;
        this.l = vv00Var;
        int i = vv00Var.e;
        f4m.x(q + (i > 1 ? (i - 1) * r : 0), this.m);
        this.n.setText(vv00Var.c);
        Image image = vv00Var.d;
        VKImageView vKImageView = this.o;
        if (image != null) {
            bwt0.L(vKImageView, image);
        } else {
            vKImageView.clear();
        }
        bwt0.p0(this.p, vv00Var.f);
        izs<vv00, s3q0> izsVar = vv00Var.g;
        this.itemView.setOnClickListener(izsVar != null ? new vec(2, izsVar, vv00Var) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Model: ");
        Object obj = this.l;
        if (obj == null) {
            obj = null;
        }
        sb.append(obj);
        return sb.toString();
    }
}
