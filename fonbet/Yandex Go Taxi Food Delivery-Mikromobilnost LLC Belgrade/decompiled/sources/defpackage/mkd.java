package defpackage;

/* loaded from: classes2.dex */
public final class mkd {
    public final String a;
    public final yay b;

    public mkd(String str, yay yayVar) {
        this.a = str;
        this.b = yayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkd)) {
            return false;
        }
        mkd mkdVar = (mkd) obj;
        return this.a.equals(mkdVar.a) && this.b.equals(mkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalInfo(__typename=" + this.a + ", legalInfo=" + this.b + ')';
    }
}
