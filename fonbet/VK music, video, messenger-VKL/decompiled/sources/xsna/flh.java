package xsna;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileContentShowAllViewHolder.kt */
/* loaded from: classes5.dex */
public final class flh extends vif0<s3q0> {
    public final gzs<s3q0> n;

    public flh(ViewGroup viewGroup, gzs<s3q0> gzsVar, Integer num) {
        super(viewGroup, R.layout.community_item_content_show_all_item, 0);
        this.n = gzsVar;
        jjc.g(this.itemView, new wpg(this, 3));
        bwt0.d(this.itemView, iah0.b(8.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        if (num != null) {
            bwt0.c0(iah0.a(num.intValue()), this.itemView);
        }
        VkText vkText = (VkText) this.itemView.findViewById(R.id.show_all_button);
        this.itemView.getContext();
        vkText.setTextColor(krv0.m(R.attr.vk_ui_text_accent_themed, vkText.getContext()));
        vkText.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.vk_icon_chevron_right_circle_28, 0, 0);
        vkText.setCompoundDrawablePadding(iah0.a(10));
        vkText.setCompoundDrawableTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, this.itemView.getContext())));
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(s3q0 s3q0Var) {
    }
}
