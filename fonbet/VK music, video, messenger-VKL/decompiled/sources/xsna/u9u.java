package xsna;

import android.widget.ImageView;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vkontakte.android.R;

/* compiled from: GooglePayButtonViewHolder.kt */
/* loaded from: classes6.dex */
public final class u9u extends zb<t9u> {
    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(this.itemView.getContext(), R.drawable.vk_icon_google_pay_logo);
        int f = e3m.f(R.attr.vk_legacy_button_primary_foreground, this.itemView.getContext());
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "google_pay_letter_p", f);
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "google_pay_letter_a", f);
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "google_pay_letter_y", f);
        ((ImageView) this.itemView.findViewById(R.id.vk_pay_checkout_image)).setImageDrawable(enhancedVectorDrawable);
    }
}
