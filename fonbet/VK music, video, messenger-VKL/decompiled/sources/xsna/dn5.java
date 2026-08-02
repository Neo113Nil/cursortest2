package xsna;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes.dex */
public final class dn5 extends s2z {
    public final String a;
    public final String b;

    public dn5(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // xsna.s2z
    public final String a() {
        return this.a;
    }

    @Override // xsna.s2z
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s2z)) {
            return false;
        }
        s2z s2zVar = (s2z) obj;
        return this.a.equals(s2zVar.a()) && this.b.equals(s2zVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return i5s.a(sb, this.b, "}");
    }
}
