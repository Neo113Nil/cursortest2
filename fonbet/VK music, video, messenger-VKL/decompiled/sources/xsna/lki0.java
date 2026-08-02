package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class lki0 extends b7r {
    public final String a;

    public lki0(String str) {
        this.a = str.concat("_separator");
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lki0) && epx.f(this.a, ((lki0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("SeparatorField(id="), this.a, ", affectsPrice=false)");
    }
}
