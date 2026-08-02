package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class la2 {
    public final boolean a;
    public final e3n b;
    public final e3n c;
    public final ka2 d;

    public la2(boolean z, e3n e3nVar, e3n e3nVar2, ka2 ka2Var) {
        this.a = z;
        this.b = e3nVar;
        this.c = e3nVar2;
        this.d = ka2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la2)) {
            return false;
        }
        la2 la2Var = (la2) obj;
        return this.a == la2Var.a && jl40.l(this.b, la2Var.b) && jl40.l(this.c, la2Var.c) && jl40.l(this.d, la2Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        e3n e3nVar = this.b;
        int hashCode2 = (hashCode + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31;
        e3n e3nVar2 = this.c;
        int hashCode3 = (hashCode2 + (e3nVar2 == null ? 0 : Long.hashCode(e3nVar2.a))) * 31;
        ka2 ka2Var = this.d;
        return hashCode3 + (ka2Var != null ? ka2Var.hashCode() : 0);
    }

    public final String toString() {
        return "DiscardConfig(allowMock=" + this.a + ", maxRealtimeAge=" + this.b + ", maxRealtimeAheadOfTime=" + this.c + ", logParams=" + this.d + Extension.C_BRAKE;
    }
}
