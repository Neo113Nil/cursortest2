package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Collections;

/* compiled from: MarketAllReviewsGoodReviewViewHolder.kt */
/* loaded from: classes18.dex */
public final class ps00 extends vfz<os00> {
    public final ds00<cs00> l;
    public final View m;
    public final ImageView n;
    public final VKImageView o;
    public final TextView p;
    public final VkStaticRatingBar q;
    public final RecyclerView r;
    public final ExpandableTextViewGroup s;
    public final TextView t;
    public os00 u;
    public final d3u0 v;

    /* JADX WARN: Multi-variable type inference failed */
    public ps00(ViewGroup viewGroup, RecyclerView.u uVar, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_good_review_view_holder, viewGroup);
        this.l = ds00Var;
        this.m = this.itemView.findViewById(R.id.container_view_holder);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.good_review_action_button);
        this.n = imageView;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.good_photo_iv);
        this.o = vKImageView;
        this.p = (TextView) this.itemView.findViewById(R.id.good_name_tv);
        this.q = (VkStaticRatingBar) this.itemView.findViewById(R.id.rating_bar);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.good_attache_images_rv);
        this.r = recyclerView;
        ExpandableTextViewGroup expandableTextViewGroup = (ExpandableTextViewGroup) this.itemView.findViewById(R.id.review_tv);
        this.s = expandableTextViewGroup;
        this.t = (TextView) this.itemView.findViewById(R.id.published_review_status_tv);
        Group group = (Group) this.itemView.findViewById(R.id.header_group_view);
        int i = 26;
        d3u0 d3u0Var = new d3u0(new l2k(this, i));
        this.v = d3u0Var;
        com.vk.movika.sdk.base.ui.j jVar = new com.vk.movika.sdk.base.ui.j(this, i);
        expandableTextViewGroup.setMaxLines(3);
        expandableTextViewGroup.setExpandText(this.itemView.getContext().getString(R.string.community_reviews_reviews_show_all));
        expandableTextViewGroup.setOnExpandClickListener(jVar);
        recyclerView.setAdapter(d3u0Var);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.addItemDecoration(new tfv(cn70.b(7)));
        vKImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        imageView.setOnClickListener(new dm7(this, 3));
        for (int i2 : group.getReferencedIds()) {
            this.itemView.findViewById(i2).setOnClickListener(new mo3(this, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(os00 os00Var) {
        os00 os00Var2 = os00Var;
        SpannableStringBuilder spannableStringBuilder = os00Var2.i;
        int i = os00Var2.f;
        ?? r2 = os00Var2.g;
        int i2 = os00Var2.p;
        View view = this.m;
        view.setBackgroundResource(i2);
        Context context = this.itemView.getContext();
        boolean z = os00Var2.r;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i3 = os00Var2.s;
        if (z) {
            bindingAdapterPosition--;
        }
        view.setContentDescription(context.getString(R.string.community_review_item_number_accessibility, Integer.valueOf(bindingAdapterPosition), Integer.valueOf(i3)));
        BaseImageDto baseImageDto = os00Var2.d;
        VKImageView vKImageView = this.o;
        if (baseImageDto != null) {
            bwt0.S(vKImageView, new cpo0(Collections.singletonList(baseImageDto), vKImageView));
        } else {
            vKImageView.W();
        }
        this.p.setText(os00Var2.e);
        boolean z2 = !((Collection) r2).isEmpty();
        RecyclerView recyclerView = this.r;
        bwt0.p0(recyclerView, z2);
        int size = r2.size();
        if (size == 1) {
            recyclerView.setContentDescription(this.itemView.getContext().getString(R.string.reviews_downloaded_photo_accessibility));
        } else {
            recyclerView.setContentDescription(size + " " + b6().getString(R.string.reviews_downloaded_photo_accessibility));
        }
        this.v.setItems(r2);
        float f = i;
        VkStaticRatingBar vkStaticRatingBar = this.q;
        vkStaticRatingBar.setRating(f);
        c4g0.j(vkStaticRatingBar, this.itemView.getContext(), f, an10.b(vkStaticRatingBar.getRating()));
        boolean z3 = os00Var2.q;
        ImageView imageView = this.n;
        bwt0.p0(imageView, z3);
        imageView.setContentDescription(b6().getString(R.string.market_item_review_menu_accessibility));
        boolean z4 = !drm0.N(spannableStringBuilder);
        ExpandableTextViewGroup expandableTextViewGroup = this.s;
        bwt0.p0(expandableTextViewGroup, z4);
        expandableTextViewGroup.setText(spannableStringBuilder);
        if (os00Var2.j) {
            expandableTextViewGroup.b();
        } else {
            expandableTextViewGroup.a();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            expandableTextViewGroup.requestLayout();
        }
        String str = os00Var2.m;
        TextView textView = this.t;
        textView.setText(str);
        textView.setContentDescription(os00Var2.n);
        textView.setTextColor(dhr0.t.c(os00Var2.o));
        this.u = os00Var2;
    }
}
