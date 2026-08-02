package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.lym0;

/* compiled from: LicenseInfoItemViewHolder.kt */
/* loaded from: classes6.dex */
public final class w3z extends vif0<lym0.c> {
    public final TextView n;
    public final TextView o;

    public w3z(ViewGroup viewGroup) {
        super(viewGroup, R.layout.license_subscription_info_item, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.can_cancel_text);
        this.o = (TextView) this.itemView.findViewById(R.id.text);
    }

    @Override // xsna.vif0
    public final void i6(lym0.c cVar) {
        lym0.c cVar2 = cVar;
        boolean z = cVar2.c;
        TextView textView = this.o;
        TextView textView2 = this.n;
        if (z) {
            at.d(this.itemView, R.string.vk_subscription_canceled, textView2);
            at.d(this.itemView, R.string.vk_subscription_canceled_license, textView);
        } else {
            textView2.setText(this.itemView.getContext().getString(R.string.vk_you_can_cancel_subscription, cVar2.b));
            at.d(this.itemView, R.string.vk_subscription_license, textView);
        }
    }
}
