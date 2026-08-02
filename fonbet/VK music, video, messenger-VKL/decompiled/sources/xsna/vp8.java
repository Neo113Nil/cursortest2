package xsna;

import android.view.View;
import android.widget.TextView;

/* compiled from: holders.kt */
/* loaded from: classes14.dex */
public final class vp8 extends sxt0 {
    public final TextView l;

    public vp8(View view, k1 k1Var) {
        super(view);
        view.setOnClickListener(k1Var);
        this.l = (TextView) view;
    }

    @Override // xsna.sxt0
    public final void V5(ftx ftxVar) {
        eq8 eq8Var = (eq8) ftxVar;
        int i = eq8Var.c;
        TextView textView = this.l;
        textView.setText(i);
        textView.setTag(Integer.valueOf(eq8Var.b));
    }
}
