package xsna;

/* compiled from: MarkupParams.kt */
/* loaded from: classes4.dex */
public final class nf10 implements g5p, bo00 {
    public final vlo a;

    public nf10(vlo vloVar) {
        this.a = vloVar;
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.a.a.isEmpty();
    }

    @Override // xsna.bo00
    public final vlo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf10) && epx.f(this.a, ((nf10) obj).a);
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return uf10.a;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "MarkupParams(drawingState=" + this.a + ")";
    }
}
