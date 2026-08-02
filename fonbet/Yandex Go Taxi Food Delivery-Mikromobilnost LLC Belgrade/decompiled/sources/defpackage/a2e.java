package defpackage;

/* loaded from: classes2.dex */
public final class a2e {
    public final String a;
    public final bfc b;

    public a2e(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2e)) {
            return false;
        }
        a2e a2eVar = (a2e) obj;
        return this.a.equals(a2eVar.a) && this.b.equals(a2eVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Colors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
