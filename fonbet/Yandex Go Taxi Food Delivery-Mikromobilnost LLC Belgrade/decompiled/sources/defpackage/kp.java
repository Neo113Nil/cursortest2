package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kp implements fr {
    public final String a;
    public final String b;

    public kp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return jl40.l(this.a, kpVar.a) && jl40.l(this.b, kpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeleteUserReviewAction(orgId=", this.a, ", reviewId=", this.b, Extension.C_BRAKE);
    }
}
