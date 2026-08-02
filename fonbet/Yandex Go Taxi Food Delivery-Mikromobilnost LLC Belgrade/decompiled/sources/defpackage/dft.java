package defpackage;

/* loaded from: classes15.dex */
public final class dft {
    public final String a;

    public dft(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dft) && jl40.l(this.a, ((dft) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + unr0.e(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return oyr.p("Params(userId=", this.a, ", ignoreYourself=false, withOrganizationName=true)");
    }
}
