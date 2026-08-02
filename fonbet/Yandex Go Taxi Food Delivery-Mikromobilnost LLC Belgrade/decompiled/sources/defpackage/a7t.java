package defpackage;

/* loaded from: classes15.dex */
public final class a7t {
    public final String a;

    public a7t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7t) && jl40.l(this.a, ((a7t) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("Params(userId=", this.a, ", withCurrentOrganizationName=false)");
    }
}
