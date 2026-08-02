package xsna;

/* compiled from: WindowInsetsPadding.kt */
/* loaded from: classes11.dex */
final class e7j extends d730<f7j> {
    public final izs<zpx0, s3q0> a;
    public final izs<z5x, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public e7j(izs<? super zpx0, s3q0> izsVar, izs<? super z5x, s3q0> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7j) && ((e7j) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final f7j r() {
        f7j f7jVar = new f7j();
        f7jVar.r = this.a;
        return f7jVar;
    }

    @Override // xsna.d730
    public final void s(f7j f7jVar) {
        f7j f7jVar2 = f7jVar;
        izs<? super zpx0, s3q0> izsVar = f7jVar2.r;
        izs<zpx0, s3q0> izsVar2 = this.a;
        if (izsVar2 != izsVar) {
            f7jVar2.r = izsVar2;
        }
    }
}
