package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ValidateAccountRequestParams.kt */
/* loaded from: classes15.dex */
public final class oir0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<i2q> g;
    public final boolean h;
    public final boolean i;

    public oir0() {
        throw null;
    }

    public oir0(String str, boolean z, boolean z2, String str2, String str3, List list, List list2, boolean z3, boolean z4, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        list2 = (i & 64) != 0 ? EmptyList.b : list2;
        z3 = (i & 256) != 0 ? true : z3;
        z4 = (i & 512) != 0 ? true : z4;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oir0)) {
            return false;
        }
        oir0 oir0Var = (oir0) obj;
        return epx.f(this.a, oir0Var.a) && this.b == oir0Var.b && this.c == oir0Var.c && epx.f(this.d, oir0Var.d) && epx.f(this.e, oir0Var.e) && epx.f(this.f, oir0Var.f) && epx.f(this.g, oir0Var.g) && this.h == oir0Var.h && this.i == oir0Var.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.i) + qoy.b(fw3.a(fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 961, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidateAccountRequestParams(login=");
        sb.append(this.a);
        sb.append(", forcePassword=");
        sb.append(this.b);
        sb.append(", isLibverifySupported=");
        sb.append(this.c);
        sb.append(", superAppToken=");
        sb.append(this.d);
        sb.append(", trustedHash=");
        sb.append(this.e);
        sb.append(", trustedHashes=");
        sb.append(this.f);
        sb.append(", exchangeTokens=");
        sb.append(this.g);
        sb.append(", sid=null, maxMessengerVerificationAvailable=");
        sb.append(this.h);
        sb.append(", maxCodeVerificationAvailable=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
