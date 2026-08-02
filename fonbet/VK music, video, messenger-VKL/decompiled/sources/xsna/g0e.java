package xsna;

import android.view.View;
import androidx.camera.view.PreviewView;
import xsna.wn2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g0e implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                h0e h0eVar = (h0e) obj;
                bpn0 bpn0Var = h0eVar.h;
                if (i2 != i6 || i4 != i8) {
                    wn2.a.a(h0eVar.c, (View) bpn0Var.getValue(), (View) h0eVar.i.getValue(), new wn2.b(true, true), null, 24);
                    ((View) bpn0Var.getValue()).removeOnLayoutChangeListener(h0eVar.j);
                    break;
                }
            default:
                PreviewView previewView = (PreviewView) obj;
                PreviewView.ImplementationMode implementationMode = PreviewView.j;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.a();
                    previewView.getDisplay();
                    previewView.getViewPort();
                    break;
                }
                break;
        }
    }
}
