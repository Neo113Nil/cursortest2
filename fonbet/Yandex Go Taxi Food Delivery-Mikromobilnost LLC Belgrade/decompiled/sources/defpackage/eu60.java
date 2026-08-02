package defpackage;

/* loaded from: classes2.dex */
public final class eu60 {
    public final String a;
    public final qkd b;

    public eu60(String str, qkd qkdVar) {
        this.a = str;
        this.b = qkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu60)) {
            return false;
        }
        eu60 eu60Var = (eu60) obj;
        return this.a.equals(eu60Var.a) && this.b.equals(eu60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Offer(__typename=" + this.a + ", compositeOffer=" + this.b + ')';
    }
}
