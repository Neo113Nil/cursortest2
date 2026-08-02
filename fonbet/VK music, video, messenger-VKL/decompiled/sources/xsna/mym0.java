package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.lym0;

/* compiled from: SubscriptionsInfoItemViewHolder.kt */
/* loaded from: classes6.dex */
public final class mym0 extends vif0<lym0.b> {
    public final TextView n;
    public final TextView o;

    public mym0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.subscription_info_item, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.value);
    }

    @Override // xsna.vif0
    public final void i6(lym0.b bVar) {
        lym0.b bVar2 = bVar;
        this.n.setText(bVar2.b);
        this.o.setText(bVar2.c);
    }
}
