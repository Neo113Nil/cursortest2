package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dfc implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dfc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                ((ffc) this.c).a();
                break;
            default:
                fpj fpjVar = (fpj) this.c;
                int i9 = fpjVar.a.getContext().getResources().getConfiguration().orientation;
                if (fpjVar.d && fpjVar.g != i9) {
                    fpjVar.dismiss();
                    break;
                }
                break;
        }
    }
}
