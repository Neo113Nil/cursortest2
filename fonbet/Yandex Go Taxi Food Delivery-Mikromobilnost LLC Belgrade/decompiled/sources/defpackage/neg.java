package defpackage;

/* loaded from: classes2.dex */
public final class neg {
    public final String a;
    public final bfc b;

    public neg(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof neg)) {
            return false;
        }
        neg negVar = (neg) obj;
        return this.a.equals(negVar.a) && this.b.equals(negVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Colors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
