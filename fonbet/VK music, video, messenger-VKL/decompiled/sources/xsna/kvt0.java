package xsna;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kvt0 implements View.OnKeyListener {
    public final /* synthetic */ gzs b;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            this.b.invoke();
        }
        return true;
    }
}
