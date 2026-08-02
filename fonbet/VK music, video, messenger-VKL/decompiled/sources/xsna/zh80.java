package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CheckoutOnboardingContentAdapter.kt */
/* loaded from: classes6.dex */
public final class zh80 extends vfz {
    public final /* synthetic */ int l;
    public final TextView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh80(ViewGroup viewGroup, int i) {
        super(R.layout.vk_pay_checkout_onboarding_subtitle_item, viewGroup);
        this.l = i;
        switch (i) {
            case 1:
                super(R.layout.voip_past_broadcasts_date_item, viewGroup);
                this.m = (TextView) this.itemView.findViewById(R.id.voip_past_broadcasts_date);
                break;
            default:
                this.m = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_subtitle_text);
                break;
        }
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        switch (this.l) {
            case 0:
                yh80 yh80Var = (yh80) hfzVar;
                String str = yh80Var.b;
                TextView textView = this.m;
                textView.setText(str);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(yh80Var.c, 0, 0, 0);
                break;
            default:
                this.m.setText(((fo90) hfzVar).b);
                break;
        }
    }
}
