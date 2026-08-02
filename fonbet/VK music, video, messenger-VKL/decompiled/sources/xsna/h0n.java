package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: DisabledCommentsHolder.kt */
/* loaded from: classes4.dex */
public final class h0n extends aa {
    public h0n(ViewGroup viewGroup, String str) {
        super(viewGroup, R.layout.disabled_comments, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.disabled_comments_container);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(iag iagVar) {
    }

    @Override // xsna.aa
    public final void s6() {
    }
}
