package xsna;

/* compiled from: CatalogBlockTaskId.kt */
/* loaded from: classes16.dex */
public final class cqz implements on50 {
    public final String a;
    public final String b;

    public cqz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqz)) {
            return false;
        }
        cqz cqzVar = (cqz) obj;
        return epx.f(this.a, cqzVar.a) && epx.f(this.b, cqzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadNextBlockTaskId(blockId=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.b, ')');
    }
}
