package xsna;

import xsna.g650;
import xsna.mck0;

/* compiled from: SnippetSectionViewHolder.kt */
/* loaded from: classes3.dex */
public final class vck0 implements mck0.a {
    public final /* synthetic */ xck0 a;

    public vck0(xck0 xck0Var) {
        this.a = xck0Var;
    }

    @Override // xsna.mck0.a
    public final void a(int i, boolean z) {
        xck0 xck0Var = this.a;
        pck0 pck0Var = xck0Var.o;
        if (pck0Var == null) {
            pck0Var = null;
        }
        nck0 nck0Var = pck0Var.b;
        if (!z) {
            xck0Var.l.performHapticFeedback(0);
        }
        xck0Var.m.invoke(new g650.d.c(nck0Var.a, nck0Var.g.get(i).b, false, 24));
    }

    @Override // xsna.mck0.a
    public final void b(int i) {
        xck0 xck0Var = this.a;
        tck0 tck0Var = xck0Var.l;
        pck0 pck0Var = xck0Var.o;
        if (pck0Var == null) {
            pck0Var = null;
        }
        tck0Var.u.setThumb(pck0Var.b.g.get(i).b.Jb());
        xck0Var.l.setCurrentTrackNum(i);
    }
}
