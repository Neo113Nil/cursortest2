package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.f1;
import yads.tp0;
import yads.xz;

/* loaded from: classes7.dex */
public final class jj81 {
    public final xz a;
    public final long b;
    public final f1 c;
    public final tp0 d;
    public final HashMap e;
    public final no61 f;

    public jj81(xz xzVar, long j, f1 f1Var, tp0 tp0Var, HashMap hashMap, no61 no61Var) {
        this.a = xzVar;
        this.b = j;
        this.c = f1Var;
        this.d = tp0Var;
        this.e = hashMap;
        this.f = no61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj81)) {
            return false;
        }
        jj81 jj81Var = (jj81) obj;
        return this.a == jj81Var.a && this.b == jj81Var.b && this.c == jj81Var.c && jl40.l(this.d, jj81Var.d) && this.e.equals(jj81Var.e) && jl40.l(this.f, jj81Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        tp0 tp0Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (tp0Var == null ? 0 : tp0Var.hashCode())) * 31)) * 31;
        no61 no61Var = this.f;
        return hashCode2 + (no61Var != null ? no61Var.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.a + ", startTime=" + this.b + ", activityInteractionType=" + this.c + ", falseClick=" + this.d + ", reportData=" + this.e + ", abExperiments=" + this.f + Extension.C_BRAKE;
    }
}
