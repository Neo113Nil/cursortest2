package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fi40 {
    public final wf40 a;
    public final di40 b;
    public final wh40 c;

    public fi40(wf40 wf40Var, di40 di40Var, wh40 wh40Var) {
        this.a = wf40Var;
        this.b = di40Var;
        this.c = wh40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi40)) {
            return false;
        }
        fi40 fi40Var = (fi40) obj;
        return jl40.l(this.a, fi40Var.a) && jl40.l(this.b, fi40Var.b) && jl40.l(this.c, fi40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MtTrainTicketsState(mtTrainRouteState=" + this.a + ", mtTrainTicketsActivePeriodState=" + this.b + ", mtTrainTariff=" + this.c + Extension.C_BRAKE;
    }
}
