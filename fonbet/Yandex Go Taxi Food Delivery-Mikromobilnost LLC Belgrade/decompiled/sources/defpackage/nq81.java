package defpackage;

import android.view.View;
import android.widget.TextView;
import yads.tv;

/* loaded from: classes7.dex */
public final class nq81 extends ia71 {
    @Override // defpackage.ia71
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        TextView textView = (TextView) view;
        zj81 zj81Var = (zj81) obj;
        if (tv.b == zj81Var.a) {
            return jl40.l(textView.getText().toString(), zj81Var.b);
        }
        return true;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        TextView textView = (TextView) view;
        zj81 zj81Var = (zj81) obj;
        if (tv.b == zj81Var.a) {
            textView.setText(zj81Var.b);
        }
    }
}
