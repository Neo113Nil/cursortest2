package defpackage;

/* loaded from: classes2.dex */
public final class dec {
    public final String a;
    public final cec b;

    public dec(String str, cec cecVar) {
        this.a = str;
        this.b = cecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dec)) {
            return false;
        }
        dec decVar = (dec) obj;
        return this.a.equals(decVar.a) && this.b.equals(decVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCheckoutDesignColor(name=" + this.a + ", fallback=" + this.b + ')';
    }
}
