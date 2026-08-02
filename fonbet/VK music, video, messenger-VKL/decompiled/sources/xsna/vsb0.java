package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PollV3ActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class vsb0 extends vif0<esb0> {
    public final TextView n;

    public vsb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.poll_v3_popup_title, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.popup_title);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_subhead, this.l.getContext()));
        this.n = textView;
    }

    @Override // xsna.vif0
    public final void i6(esb0 esb0Var) {
        this.n.setText(esb0Var.b);
    }
}
