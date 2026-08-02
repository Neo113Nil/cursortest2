package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lik0 {
    public final zuc0 a;
    public final long b;
    public final ibk0 c;

    public lik0(zuc0 zuc0Var, long j, ibk0 ibk0Var) {
        this.a = zuc0Var;
        this.b = j;
        this.c = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lik0)) {
            return false;
        }
        lik0 lik0Var = (lik0) obj;
        return jl40.l(this.a, lik0Var.a) && this.b == lik0Var.b && jl40.l(this.c, lik0Var.c);
    }

    public final int hashCode() {
        zuc0 zuc0Var = this.a;
        return this.c.hashCode() + qv10.c((zuc0Var == null ? 0 : zuc0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "CarPlateUiState(plateState=" + this.a + ", animationDuration=" + this.b + ", clickAction=" + this.c + Extension.C_BRAKE;
    }
}
