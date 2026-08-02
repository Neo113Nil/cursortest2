package defpackage;

/* loaded from: classes2.dex */
public final class h7c implements j7c {
    public final i6c a;

    public h7c(i6c i6cVar) {
        this.a = i6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7c) && jl40.l(this.a, ((h7c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClosingOffer(closingOfferContent=" + this.a + ')';
    }
}
