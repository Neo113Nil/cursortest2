package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.g6f0;

/* compiled from: HeaderHolder.kt */
/* loaded from: classes5.dex */
public final class zwu extends vif0<g6f0.a> {
    public final TextView n;
    public final TextView o;
    public final TextView p;

    public zwu(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_reactions_header, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.item_reactions_header_title);
        this.o = (TextView) this.itemView.findViewById(R.id.item_reactions_header_count);
        this.p = (TextView) this.itemView.findViewById(R.id.item_reactions_header_show_all);
    }

    @Override // xsna.vif0
    public final void i6(g6f0.a aVar) {
        this.n.setText(0);
        String valueOf = String.valueOf(0);
        TextView textView = this.o;
        textView.setText(valueOf);
        textView.setVisibility(8);
        this.p.setVisibility(4);
    }
}
