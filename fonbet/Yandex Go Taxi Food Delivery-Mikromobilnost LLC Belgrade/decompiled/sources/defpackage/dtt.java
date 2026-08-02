package defpackage;

/* loaded from: classes8.dex */
public final class dtt {
    public final String a;
    public final boolean b;

    public dtt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtt)) {
            return false;
        }
        dtt dttVar = (dtt) obj;
        return jl40.l(this.a, dttVar.a) && this.b == dttVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleBillingConfig(googleCountryCode=");
        sb.append(this.a);
        sb.append(", isNativePaymentAllowed=");
        return unr0.u(sb, this.b, ')');
    }
}
