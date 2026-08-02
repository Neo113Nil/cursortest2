package defpackage;

/* loaded from: classes.dex */
public final class d74 {
    public final String a;
    public final String b;

    public d74(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            ny61.t("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d74)) {
            return false;
        }
        d74 d74Var = (d74) obj;
        return this.a.equals(d74Var.a) && this.b.equals(d74Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return oyr.t(sb, this.b, "}");
    }
}
