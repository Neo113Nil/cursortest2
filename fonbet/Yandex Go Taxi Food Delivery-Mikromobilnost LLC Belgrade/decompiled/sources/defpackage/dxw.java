package defpackage;

/* loaded from: classes2.dex */
public final class dxw {
    public final String a;
    public final ayw b;

    public dxw(String str, ayw aywVar) {
        this.a = str;
        this.b = aywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxw)) {
            return false;
        }
        dxw dxwVar = (dxw) obj;
        return this.a.equals(dxwVar.a) && this.b.equals(dxwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaidAmount(__typename=" + this.a + ", invoicePrice=" + this.b + ')';
    }
}
