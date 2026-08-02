package xsna;

import com.vk.im.ui.fragments.ImDialogsSelectionFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mtb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mtb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((otb) this.c).g.compareAndSet(true, false);
                break;
            case 1:
                ((mxo) this.c).U();
                break;
            case 2:
                bzb0 bzb0Var = ((ImDialogsSelectionFragment) this.c).m0;
                if (bzb0Var == null) {
                    bzb0Var = null;
                }
                bzb0Var.a();
                break;
            case 3:
                y3a0 y3a0Var = (y3a0) ((x3a0) this.c).a;
                if (y3a0Var != null) {
                    y3a0Var.S(false);
                    break;
                }
                break;
            case 4:
                ((rcl0) this.c).b.oo(false);
                break;
            default:
                g7q0 g7q0Var = (g7q0) this.c;
                g7q0Var.b.y(false);
                g7q0Var.u2();
                break;
        }
    }
}
