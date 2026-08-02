package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MarketAllReviewsCommunityReviewViewHolder.kt */
/* loaded from: classes18.dex */
public final class zr00 extends vfz<xr00> {
    public final ds00<cs00> l;
    public final View m;
    public final ImageView n;
    public final VKCircleImageView o;
    public final TextView p;
    public final VkStaticRatingBar q;
    public final ExpandableTextViewGroup r;
    public final RecyclerView s;
    public final TextView t;
    public final VkButton u;
    public xr00 v;
    public final d3u0 w;

    /* JADX WARN: Multi-variable type inference failed */
    public zr00(ViewGroup viewGroup, RecyclerView.u uVar, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_community_review_view_holder, viewGroup);
        this.l = ds00Var;
        this.m = this.itemView.findViewById(R.id.container_view_holder);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.review_action_button);
        this.n = imageView;
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.community_photo_iv);
        this.o = vKCircleImageView;
        this.p = (TextView) this.itemView.findViewById(R.id.community_name_tv);
        this.q = (VkStaticRatingBar) this.itemView.findViewById(R.id.rating_bar);
        ExpandableTextViewGroup expandableTextViewGroup = (ExpandableTextViewGroup) this.itemView.findViewById(R.id.review_tv);
        this.r = expandableTextViewGroup;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.community_attache_images_rv);
        this.s = recyclerView;
        this.t = (TextView) this.itemView.findViewById(R.id.published_review_status_tv);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.edit_review_action);
        this.u = vkButton;
        Group group = (Group) this.itemView.findViewById(R.id.header_group);
        d3u0 d3u0Var = new d3u0(new yr00(this, 0));
        this.w = d3u0Var;
        o7 o7Var = new o7(this, 20);
        recyclerView.setAdapter(d3u0Var);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.addItemDecoration(new tfv(cn70.b(7)));
        expandableTextViewGroup.setMaxLines(3);
        expandableTextViewGroup.setExpandText(this.itemView.getContext().getString(R.string.community_reviews_reviews_show_all));
        expandableTextViewGroup.setOnExpandClickListener(o7Var);
        imageView.setOnClickListener(new sg0(this, 11));
        vkButton.setOnClickListener(new cnw(this, 1));
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        for (int i : group.getReferencedIds()) {
            this.itemView.findViewById(i).setOnClickListener(new q3(this, 6));
        }
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(xr00 xr00Var) {
        xr00 xr00Var2 = xr00Var;
        String str = xr00Var2.h;
        this.v = xr00Var2;
        int i = xr00Var2.n;
        View view = this.m;
        view.setBackgroundResource(i);
        Context context = this.itemView.getContext();
        boolean z = xr00Var2.q;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i2 = xr00Var2.r;
        if (z) {
            bindingAdapterPosition--;
        }
        view.setContentDescription(context.getString(R.string.community_review_item_number_accessibility, Integer.valueOf(bindingAdapterPosition), Integer.valueOf(i2)));
        List<BaseImageDto> list = xr00Var2.d;
        VKCircleImageView vKCircleImageView = this.o;
        bwt0.S(vKCircleImageView, new cpo0(list, vKCircleImageView));
        this.p.setText(xr00Var2.e);
        float f = xr00Var2.f;
        VkStaticRatingBar vkStaticRatingBar = this.q;
        vkStaticRatingBar.setRating(f);
        c4g0.j(vkStaticRatingBar, this.itemView.getContext(), f, (int) vkStaticRatingBar.getRating());
        List<y2u0> list2 = xr00Var2.g;
        boolean isEmpty = list2.isEmpty();
        RecyclerView recyclerView = this.s;
        if (!isEmpty) {
            this.w.setItems(list2);
            int size = list2.size();
            if (size == 1) {
                recyclerView.setContentDescription(this.itemView.getContext().getString(R.string.community_reviews_photo_accessibility));
            } else {
                recyclerView.setContentDescription(size + " " + b6().getString(R.string.community_reviews_photo_accessibility));
            }
        }
        bwt0.p0(recyclerView, !r2.isEmpty());
        boolean z2 = xr00Var2.o;
        ImageView imageView = this.n;
        bwt0.p0(imageView, z2);
        imageView.setContentDescription(b6().getString(R.string.market_item_review_menu_accessibility));
        boolean z3 = str == null || str.length() == 0;
        ExpandableTextViewGroup expandableTextViewGroup = this.r;
        bwt0.p0(expandableTextViewGroup, !z3);
        expandableTextViewGroup.setText(str);
        expandableTextViewGroup.setContentDescription(str);
        if (xr00Var2.i) {
            expandableTextViewGroup.b();
        } else {
            expandableTextViewGroup.a();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            expandableTextViewGroup.requestLayout();
        }
        String str2 = xr00Var2.l;
        TextView textView = this.t;
        textView.setText(str2);
        textView.setContentDescription("");
        textView.setTextColor(dhr0.t.c(xr00Var2.m));
        bwt0.p0(this.u, xr00Var2.p);
    }
}
