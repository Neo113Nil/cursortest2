package xsna;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xih implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xih(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((wih.a) this.d).y.A0(this.c, true);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                View view = (View) sideSheetBehavior.q.get();
                if (view != null) {
                    sideSheetBehavior.G(view, this.c, false);
                    break;
                }
                break;
            default:
                baz0 baz0Var = (baz0) this.d;
                int i = this.c;
                if (i == -2 || i == -1) {
                    baz0Var.e();
                    gu8.c(null, "DoubleInterstitialCardPresenter: Audiofocus loss, pausing");
                    break;
                }
                break;
        }
    }
}
