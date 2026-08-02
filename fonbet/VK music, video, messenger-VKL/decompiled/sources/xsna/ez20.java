package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: ModalDialogCallbackDefaultFactory.kt */
/* loaded from: classes3.dex */
public final class ez20 implements dz20 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ fz20 c;

    public ez20(Activity activity, fz20 fz20Var) {
        this.b = activity;
        this.c = fz20Var;
    }

    @Override // xsna.dz20
    public final void Ff(String str) {
        ww50<?> Y;
        ComponentCallbacks2 componentCallbacks2 = this.b;
        ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.S(this.c);
    }

    @Override // xsna.dz20
    public final void Qc(String str) {
        ww50<?> Y;
        ComponentCallbacks2 componentCallbacks2 = this.b;
        ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this.c);
    }
}
