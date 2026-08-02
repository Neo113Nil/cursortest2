package xsna;

import android.widget.TextView;
import android.widget.ViewFlipper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o0s implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                p0s p0sVar = (p0s) this.c;
                if (p0sVar.d.c.get().length == 0) {
                    p0sVar.g.e();
                    break;
                }
                break;
            case 1:
                ViewFlipper viewFlipper = ((aiu) this.c).g;
                if (viewFlipper == null) {
                    viewFlipper = null;
                }
                sp.g(viewFlipper, 0);
                break;
            case 2:
                ((w920) this.c).q.compareAndSet(true, false);
                break;
            case 3:
                TextView textView = ((e860) this.c).k1;
                if (textView == null) {
                    textView = null;
                }
                textView.setEnabled(true);
                break;
            default:
                ((bqu0) this.c).dismiss();
                break;
        }
    }
}
