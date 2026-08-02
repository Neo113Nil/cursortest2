package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class dp {
    public final e00 a;
    public final e13 b;
    public final Map c;

    public dp(e00 e00Var, e13 e13Var, Map map) {
        this.a = e00Var;
        this.b = e13Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.a == dpVar.a && epx.f(this.b, dpVar.b) && epx.f(this.c, dpVar.c);
    }

    public final int hashCode() {
        e00 e00Var = this.a;
        int hashCode = (e00Var == null ? 0 : e00Var.hashCode()) * 31;
        e13 e13Var = this.b;
        return this.c.hashCode() + ((hashCode + (e13Var != null ? e13Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.a + ", sizeInfo=" + this.b + ", parameters=" + this.c + ")";
    }
}
