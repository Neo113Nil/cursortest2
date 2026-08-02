package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: ReviewsFAQItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class gig0 extends vfz<fig0> {
    public final eyh l;

    public gig0(ViewGroup viewGroup, eyh eyhVar, boolean z, int i) {
        super(e0n.a(R.layout.reviews_faq_item, viewGroup, z));
        this.l = eyhVar;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.show_faq_review_button);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        jjc.g(vkButton, new rj60(this, 16));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fig0 fig0Var) {
        e0n.b(this.itemView, fig0Var.b);
    }
}
