package yads;

import xsna.epx;
import xsna.i5s;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ji2 {
    public static final ii2 Companion = new ii2();
    public final String a;
    public final ri2 b;
    public final hj2 c;
    public final bj2 d;
    public final String e;

    public /* synthetic */ ji2(int i, String str, ri2 ri2Var, hj2 hj2Var, bj2 bj2Var, String str2) {
        if (31 != (i & 31)) {
            xsna.sp.x(i, 31, hi2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ri2Var;
        this.c = hj2Var;
        this.d = bj2Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return epx.f(this.a, ji2Var.a) && epx.f(this.b, ji2Var.b) && epx.f(this.c, ji2Var.c) && epx.f(this.d, ji2Var.d) && epx.f(this.e, ji2Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ri2 ri2Var = this.b;
        int hashCode2 = (hashCode + (ri2Var == null ? 0 : ri2Var.hashCode())) * 31;
        hj2 hj2Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (hj2Var == null ? 0 : hj2Var.hashCode())) * 31)) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        ri2 ri2Var = this.b;
        hj2 hj2Var = this.c;
        bj2 bj2Var = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder("PrefetchedMediationInfo(adapter=");
        sb.append(str);
        sb.append(", networkWinner=");
        sb.append(ri2Var);
        sb.append(", revenue=");
        sb.append(hj2Var);
        sb.append(", result=");
        sb.append(bj2Var);
        sb.append(", networkAdInfo=");
        return i5s.a(sb, str2, ")");
    }

    public ji2(String str, ri2 ri2Var, hj2 hj2Var, bj2 bj2Var, String str2) {
        this.a = str;
        this.b = ri2Var;
        this.c = hj2Var;
        this.d = bj2Var;
        this.e = str2;
    }
}
