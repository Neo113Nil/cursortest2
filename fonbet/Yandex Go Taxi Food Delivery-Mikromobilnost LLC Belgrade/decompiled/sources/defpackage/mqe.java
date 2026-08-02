package defpackage;

/* loaded from: classes.dex */
public final class mqe extends e530 implements gnq0 {
    public boolean a;
    public final boolean b;
    public tls c;

    public mqe(tls tlsVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = tlsVar;
    }

    @Override // defpackage.gnq0
    public final boolean T() {
        return this.a;
    }

    @Override // defpackage.gnq0
    public final boolean b0() {
        return this.b;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        this.c.invoke(mnq0Var);
    }
}
