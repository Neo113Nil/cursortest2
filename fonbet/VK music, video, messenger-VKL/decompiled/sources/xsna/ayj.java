package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CounterViewHolder.kt */
/* loaded from: classes4.dex */
public final class ayj extends vif0<rxj> {
    public final TextView n;

    public ayj(View view) {
        super(view);
        this.n = (TextView) view.findViewById(R.id.tv_count);
    }

    @Override // xsna.vif0
    public final void i6(rxj rxjVar) {
        this.n.setText(this.itemView.getContext().getString(R.string.photos_count_text, Integer.valueOf(rxjVar.a)));
    }
}
