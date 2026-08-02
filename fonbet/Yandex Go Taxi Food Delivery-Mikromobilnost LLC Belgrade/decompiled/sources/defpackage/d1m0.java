package defpackage;

/* loaded from: classes.dex */
public final class d1m0 implements c1m0 {
    public ywl a;
    public tls b;

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof hzl) {
            this.a = ((hzl) neoVar).a.a;
        }
    }

    @Override // defpackage.jff
    public final ywl c() {
        return this.a;
    }

    @Override // defpackage.c1m0
    public final void d(tls tlsVar) {
        this.b = tlsVar;
    }

    @Override // defpackage.szl
    public final void dispose() {
        tls tlsVar = this.b;
        if (tlsVar != null) {
            tlsVar.invoke(this.a);
        }
        this.a = null;
    }
}
