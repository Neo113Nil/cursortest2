package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mhj0 {
    public final String a;
    public final tls b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public mhj0(String str, tls tlsVar, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = tlsVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhj0)) {
            return false;
        }
        mhj0 mhj0Var = (mhj0) obj;
        return jl40.l(this.a, mhj0Var.a) && this.b.equals(mhj0Var.b) && jl40.l(this.c, mhj0Var.c) && jl40.l(this.d, mhj0Var.d) && jl40.l(this.e, mhj0Var.e) && this.f == mhj0Var.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(ly3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequirementCommentModel(requirementName=");
        sb.append(this.a);
        sb.append(", saveForNextTripsClicked=");
        sb.append(this.b);
        sb.append(", placeholder=");
        g8e.D(sb, this.c, ", saveText=", this.d, ", valueText=");
        return nnm.i(this.e, ", saveForNextTrips=", Extension.C_BRAKE, sb, this.f);
    }
}
