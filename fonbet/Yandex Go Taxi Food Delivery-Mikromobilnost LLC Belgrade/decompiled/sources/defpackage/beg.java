package defpackage;

/* loaded from: classes2.dex */
public final class beg {
    public final String a;
    public final bfc b;

    public beg(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beg)) {
            return false;
        }
        beg begVar = (beg) obj;
        return this.a.equals(begVar.a) && this.b.equals(begVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextColors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
