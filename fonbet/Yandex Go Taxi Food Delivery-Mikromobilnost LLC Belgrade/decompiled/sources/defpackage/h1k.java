package defpackage;

/* loaded from: classes.dex */
public final class h1k implements dui0 {
    public final tls a;
    public i1k b;

    public h1k(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.dui0
    public final void b() {
        this.b = (i1k) this.a.invoke(zpn.a);
    }

    @Override // defpackage.dui0
    public final void d() {
    }

    @Override // defpackage.dui0
    public final void e() {
        i1k i1kVar = this.b;
        if (i1kVar != null) {
            i1kVar.dispose();
        }
        this.b = null;
    }
}
