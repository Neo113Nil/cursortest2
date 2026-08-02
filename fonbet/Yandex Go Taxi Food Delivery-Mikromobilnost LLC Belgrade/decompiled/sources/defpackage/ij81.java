package defpackage;

import java.util.Map;
import yads.xz;

/* loaded from: classes7.dex */
public final class ij81 {
    public final xz a;
    public final a271 b;
    public final Map c;

    public ij81(xz xzVar, a271 a271Var, Map map) {
        this.a = xzVar;
        this.b = a271Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij81)) {
            return false;
        }
        ij81 ij81Var = (ij81) obj;
        return this.a == ij81Var.a && jl40.l(this.b, ij81Var.b) && jl40.l(this.c, ij81Var.c);
    }

    public final int hashCode() {
        xz xzVar = this.a;
        int hashCode = (xzVar == null ? 0 : xzVar.hashCode()) * 31;
        a271 a271Var = this.b;
        return unr0.d((hashCode + (a271Var != null ? a271Var.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidderTokenRequestData(adType=");
        sb.append(this.a);
        sb.append(", sizeInfo=");
        sb.append(this.b);
        sb.append(", parameters=");
        return b64.r(sb, this.c, ", adapterIdentity=null)");
    }
}
