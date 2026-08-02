package yads;

import android.view.View;
import android.widget.TextView;
import xsna.epx;

/* loaded from: classes10.dex */
public final class iw extends ll3 {
    public iw(TextView textView) {
        super(textView);
    }

    @Override // yads.ll3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.b == gwVar.a) {
            textView.setText(gwVar.b);
        }
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.b == gwVar.a) {
            return epx.f(textView.getText().toString(), gwVar.b);
        }
        return true;
    }
}
