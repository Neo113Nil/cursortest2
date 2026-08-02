package xsna;

import xsna.o4q0;

/* compiled from: VerifyBidProfileModalData.kt */
/* loaded from: classes18.dex */
public final class ynr0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final o4q0.b e;

    public ynr0(String str, String str2, boolean z, String str3, o4q0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynr0)) {
            return false;
        }
        ynr0 ynr0Var = (ynr0) obj;
        return epx.f(this.a, ynr0Var.a) && epx.f(this.b, ynr0Var.b) && this.c == ynr0Var.c && epx.f(this.d, ynr0Var.d) && epx.f(this.e, ynr0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        o4q0.b bVar = this.e;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "VerifyBidProfileModalData(title=" + this.a + ", description=" + this.b + ", isVerified=" + this.c + ", logoAbbreviation=" + this.d + ", confirmVkBidButton=" + this.e + ')';
    }
}
