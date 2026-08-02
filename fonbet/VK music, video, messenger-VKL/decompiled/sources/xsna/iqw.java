package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ImportContactsHolder.kt */
/* loaded from: classes4.dex */
public final class iqw extends vif0<Boolean> implements View.OnClickListener {
    public final TextView n;
    public final LinearLayout o;
    public jzd0 p;

    public iqw(ViewGroup viewGroup) {
        super(viewGroup, R.layout.friends_recomm_sync_contact_item, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.n = textView;
        this.o = (LinearLayout) this.itemView.findViewById(R.id.done);
        textView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        bwt0.p0(this.n, !booleanValue);
        bwt0.p0(this.o, booleanValue);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jzd0 jzd0Var;
        if (jjc.b() || !epx.f(view, this.n) || (jzd0Var = this.p) == null) {
            return;
        }
        jzd0Var.c(getLayoutPosition(), this.itemView.getContext());
    }
}
