package defpackage;

/* loaded from: classes10.dex */
public final class ce90 extends e530 implements dd11, gnq0 {
    public tls a;
    public boolean b;
    public final xpb1 c = xpb1.M;

    public ce90(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.gnq0
    public final boolean T() {
        return true;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.c;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        if (this.b) {
            return;
        }
        this.a.invoke(mnq0Var);
    }
}
