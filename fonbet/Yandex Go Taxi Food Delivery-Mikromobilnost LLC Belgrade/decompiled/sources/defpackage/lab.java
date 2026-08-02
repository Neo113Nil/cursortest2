package defpackage;

/* loaded from: classes15.dex */
public final class lab extends jab {
    public final e1k w;
    public final tls x;

    public lab(oab oabVar, bbb bbbVar, tls tlsVar) {
        super(oabVar);
        this.w = bbbVar;
        this.x = tlsVar;
    }

    @Override // defpackage.jab
    public final void c(iaz0 iaz0Var) {
        this.x.invoke(iaz0Var);
    }

    @Override // defpackage.jab, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        e1k e1kVar = this.w;
        if (e1kVar != null) {
            e1kVar.close();
        }
    }
}
