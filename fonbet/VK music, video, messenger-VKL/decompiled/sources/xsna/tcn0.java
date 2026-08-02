package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidetSectionButtonV2Holder.kt */
/* loaded from: classes6.dex */
public final class tcn0 extends hf6<hdn0> {
    public final u7n0 m;
    public final TextView n;

    public tcn0(View view, u7n0 u7n0Var) {
        super(view);
        this.m = u7n0Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.n = textView;
        textView.setOnClickListener(new gi8(this, 13));
    }

    @Override // xsna.hf6
    public final void W5(hdn0 hdn0Var) {
        this.n.setText(hdn0Var.c.a);
    }
}
