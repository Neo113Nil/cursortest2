package defpackage;

/* loaded from: classes2.dex */
public final class h1e {
    public final String a;
    public final bfc b;

    public h1e(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1e)) {
            return false;
        }
        h1e h1eVar = (h1e) obj;
        return this.a.equals(h1eVar.a) && this.b.equals(h1eVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextColors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
