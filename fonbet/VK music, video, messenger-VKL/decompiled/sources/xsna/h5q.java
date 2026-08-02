package xsna;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ExoAnalyticsPlayerListenerWrapper.kt */
/* loaded from: classes3.dex */
public final class h5q implements by1 {
    public final CopyOnWriteArrayList<ks4> b = new CopyOnWriteArrayList<>();

    @Override // xsna.by1
    public final void F(bpz bpzVar, pr10 pr10Var) {
        Iterator<ks4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }
    }

    @Override // xsna.by1
    public final void L(bpz bpzVar, pr10 pr10Var, IOException iOException) {
        Iterator<ks4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a), iOException);
        }
    }

    @Override // xsna.by1
    public final void W(bpz bpzVar, pr10 pr10Var) {
        Iterator<ks4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().f(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }
    }

    @Override // xsna.by1
    public final void g0(bpz bpzVar, pr10 pr10Var) {
        Iterator<ks4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().h(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }
    }
}
