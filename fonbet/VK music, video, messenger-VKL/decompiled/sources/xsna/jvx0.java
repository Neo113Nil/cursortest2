package xsna;

import xsna.ts80;

/* compiled from: WorkEnqueueObserver.kt */
/* loaded from: classes.dex */
public final class jvx0 implements fr70<ts80.a> {
    public final uhe0 b;
    public final vhe0 c;

    public jvx0(uhe0 uhe0Var, vhe0 vhe0Var) {
        this.b = uhe0Var;
        this.c = vhe0Var;
    }

    @Override // xsna.fr70
    public final void a(ts80.a aVar) {
        ts80.a aVar2 = aVar;
        boolean z = aVar2 instanceof ts80.a.c;
        uhe0 uhe0Var = this.b;
        if (z) {
            this.c.invoke();
            uhe0Var.invoke(this);
        } else if (aVar2 instanceof ts80.a.C3764a) {
            uhe0Var.invoke(this);
        }
    }
}
