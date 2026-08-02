package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uvh implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uvh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                qt3 qt3Var = ((vvh) this.c).m.q;
                if (qt3Var != null) {
                    qt3Var.b();
                    break;
                }
                break;
            default:
                s2j0 s2j0Var = (s2j0) this.c;
                if (!s2j0Var.r) {
                    int i9 = i4 - i2;
                    int i10 = i8 - i6;
                    if (i3 - i != i7 - i5 || i9 != i10) {
                        s2j0Var.o.post(new te9(6, s2j0Var, view));
                    }
                    s2j0Var.r = true;
                    break;
                }
                break;
        }
    }
}
