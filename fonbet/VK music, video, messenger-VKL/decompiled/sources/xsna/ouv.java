package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ouv implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ouv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                ((quv) this.c).t();
                break;
            default:
                qt3 qt3Var = ((mxq0) this.c).n.q;
                if (qt3Var != null) {
                    qt3Var.b();
                    break;
                }
                break;
        }
    }
}
