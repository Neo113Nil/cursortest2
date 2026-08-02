package yads;

import xsna.epx;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class bs1 {
    public static final as1 Companion = new as1();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ bs1(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            xsna.sp.x(i, 7, zr1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs1)) {
            return false;
        }
        bs1 bs1Var = (bs1) obj;
        return epx.f(this.a, bs1Var.a) && epx.f(this.b, bs1Var.b) && this.c == bs1Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return xsna.n23.b(xe9.a("MediationAdapterData(format=", str, ", version=", str2, ", isIntegrated="), this.c, ")");
    }

    public bs1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
