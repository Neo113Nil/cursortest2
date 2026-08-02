package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bq71 {
    public final e971 a;
    public final fe81 b;
    public final v981 c;
    public final j181 d;

    public bq71(e971 e971Var, fe81 fe81Var, v981 v981Var, j181 j181Var) {
        this.a = e971Var;
        this.b = fe81Var;
        this.c = v981Var;
        this.d = j181Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bq71) {
            bq71 bq71Var = (bq71) obj;
            return this.a == bq71Var.a && jl40.l(this.b, bq71Var.b) && jl40.l(this.c, bq71Var.c) && this.d == bq71Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdLoadingModule(adLoadingPhasesManager=" + this.a + ", adConfiguration=" + this.b + ", sdkEnvironmentModule=" + this.c + ", adQualityVerifierController=" + this.d + Extension.C_BRAKE;
    }
}
