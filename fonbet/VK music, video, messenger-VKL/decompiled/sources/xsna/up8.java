package xsna;

import android.view.View;
import android.widget.TextView;

/* compiled from: ButtonHolder.kt */
/* loaded from: classes3.dex */
public final class up8 extends xr6 {
    public final TextView l;

    public up8(View view, d27 d27Var) {
        super(view);
        this.l = view instanceof TextView ? (TextView) view : null;
        view.setOnClickListener(d27Var);
    }

    @Override // xsna.xr6
    public final void V5(htx htxVar) {
        String str = ((dq8) htxVar).b;
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(str);
        }
        if (textView != null) {
            textView.setTag(str);
        }
    }
}
