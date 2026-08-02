package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class v1i0 extends n3a {
    public final String a;
    public final String b;

    public v1i0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1i0)) {
            return false;
        }
        v1i0 v1i0Var = (v1i0) obj;
        return epx.f(this.a, v1i0Var.a) && epx.f(this.b, v1i0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionClearCmd(sectionId=");
        sb.append(this.a);
        sb.append(", syncEvent=");
        return ho8.a(sb, this.b, ')');
    }
}
