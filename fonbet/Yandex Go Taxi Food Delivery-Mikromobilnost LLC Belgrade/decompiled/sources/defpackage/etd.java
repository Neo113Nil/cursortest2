package defpackage;

/* loaded from: classes2.dex */
public final class etd {
    public final String a;
    public final qkd b;

    public etd(String str, qkd qkdVar) {
        this.a = str;
        this.b = qkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etd)) {
            return false;
        }
        etd etdVar = (etd) obj;
        return this.a.equals(etdVar.a) && this.b.equals(etdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Offer(__typename=" + this.a + ", compositeOffer=" + this.b + ')';
    }
}
