package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.gu1;

/* compiled from: HighlightsCountViewHolder.kt */
/* loaded from: classes3.dex */
public final class l6v extends vif0<gu1.c> {
    public final TextView n;

    public l6v(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_highlights_count, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.highlights_count);
    }

    @Override // xsna.vif0
    public final void i6(gu1.c cVar) {
        int i = cVar.b;
        this.n.setText(i == 0 ? y8g0.e(R.string.highlights_count_zero) : y8g0.c(R.plurals.highlights_count, i));
    }
}
