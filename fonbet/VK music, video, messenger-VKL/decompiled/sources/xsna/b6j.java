package xsna;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class b6j implements doy {
    public final s5j b;
    public final izs<q5j, s3q0> c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public b6j(s5j s5jVar, izs<? super q5j, s3q0> izsVar) {
        this.b = s5jVar;
        this.c = izsVar;
        this.d = s5jVar.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b6j)) {
            return false;
        }
        b6j b6jVar = (b6j) obj;
        return epx.f(this.b.b, b6jVar.b.b) && this.c == b6jVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.b.hashCode() * 31);
    }

    @Override // xsna.doy
    public final Object p() {
        return this.d;
    }
}
