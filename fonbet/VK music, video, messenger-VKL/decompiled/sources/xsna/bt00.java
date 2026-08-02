package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;

/* compiled from: MarketAllReviewsRestoreCommunityViewHolder.kt */
/* loaded from: classes18.dex */
public final class bt00 extends vfz<at00> {
    public final ds00<cs00> l;
    public final View m;
    public final TextView n;
    public final View o;
    public at00 p;

    /* JADX WARN: Multi-variable type inference failed */
    public bt00(ViewGroup viewGroup, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_community_restore_view_holder_item, viewGroup);
        this.l = ds00Var;
        this.m = this.itemView.findViewById(R.id.container_view_holder);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.community_photo_iv);
        this.n = (TextView) this.itemView.findViewById(R.id.community_name_tv);
        View findViewById = this.itemView.findViewById(R.id.restore_review_iv);
        this.o = findViewById;
        Group group = (Group) this.itemView.findViewById(R.id.header_group);
        bwt0.i0(findViewById, new dkg(this, 25));
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        int[] referencedIds = group.getReferencedIds();
        for (int i : referencedIds) {
            this.itemView.findViewById(i).setOnClickListener(new naj(this, 3));
        }
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(at00 at00Var) {
        at00 at00Var2 = at00Var;
        this.p = at00Var2;
        this.m.setBackgroundResource(at00Var2.e);
        this.n.setText(at00Var2.d);
    }
}
