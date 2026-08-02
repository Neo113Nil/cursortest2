package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.lym0;

/* compiled from: ButtonInfoItemViewHolder.kt */
/* loaded from: classes6.dex */
public final class aq8 extends vif0<lym0.a> {
    public final gzs<s3q0> n;

    public aq8(ViewGroup viewGroup, iml0 iml0Var) {
        super(viewGroup, R.layout.button_subscription_info_item, 0);
        this.n = iml0Var;
        bwt0.i0(this.itemView, new l5(this, 13));
    }

    @Override // xsna.vif0
    public final void i6(lym0.a aVar) {
        if (aVar.b) {
            View view = this.itemView;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                textView.setText(R.string.vk_subscription_retry);
            }
        }
    }
}
