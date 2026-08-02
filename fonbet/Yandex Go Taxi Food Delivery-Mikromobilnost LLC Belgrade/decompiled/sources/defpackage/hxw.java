package defpackage;

/* loaded from: classes2.dex */
public final class hxw {
    public final String a;
    public final ayw b;

    public hxw(String str, ayw aywVar) {
        this.a = str;
        this.b = aywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxw)) {
            return false;
        }
        hxw hxwVar = (hxw) obj;
        return this.a.equals(hxwVar.a) && this.b.equals(hxwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TotalAmount(__typename=" + this.a + ", invoicePrice=" + this.b + ')';
    }
}
