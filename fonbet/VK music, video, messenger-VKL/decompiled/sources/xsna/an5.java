package xsna;

/* compiled from: AutoValue_InstrumentationLibraryInfo.java */
@Deprecated
/* loaded from: classes8.dex */
public final class an5 extends p8x {
    public final String b;
    public final String c;
    public final String d;

    public an5(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // xsna.p8x
    public final String a() {
        return this.b;
    }

    @Override // xsna.p8x
    public final String b() {
        return this.d;
    }

    @Override // xsna.p8x
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p8x)) {
            return false;
        }
        p8x p8xVar = (p8x) obj;
        if (!this.b.equals(p8xVar.a())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (p8xVar.c() != null) {
                return false;
            }
        } else if (!str.equals(p8xVar.c())) {
            return false;
        }
        String str2 = this.d;
        return str2 == null ? p8xVar.b() == null : str2.equals(p8xVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentationLibraryInfo{name=");
        sb.append(this.b);
        sb.append(", version=");
        sb.append(this.c);
        sb.append(", schemaUrl=");
        return i5s.a(sb, this.d, "}");
    }
}
