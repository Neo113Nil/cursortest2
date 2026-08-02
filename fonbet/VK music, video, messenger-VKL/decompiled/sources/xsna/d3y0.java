package xsna;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class d3y0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ f3y0 b;

    public d3y0(f3y0 f3y0Var) {
        this.b = f3y0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        f3y0.V(this.b);
        return true;
    }
}
