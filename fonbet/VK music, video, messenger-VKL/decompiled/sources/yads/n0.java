package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import xsna.izs;
import xsna.q4m;

/* loaded from: classes10.dex */
public final class n0 extends ea0 {
    public final izs a;
    public final TextView b;

    public n0(tl3 tl3Var, View view) {
        super(view);
        this.a = tl3Var;
        this.b = (TextView) view.findViewById(R$id.item_button);
    }

    @Override // yads.ea0
    public final void a(u90 u90Var) {
        TextView textView = this.b;
        u90Var.getClass();
        textView.setText("Enable Test mode");
        this.b.setOnClickListener(new q4m(3, this, u90Var));
    }

    public static final void a(n0 n0Var, u90 u90Var, View view) {
        izs izsVar = n0Var.a;
        u90Var.getClass();
        izsVar.invoke(t90.b);
    }
}
