package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fek0 {
    public final boolean a;
    public final qnk0 b;
    public final mpk0 c;

    public fek0(boolean z, qnk0 qnk0Var, mpk0 mpk0Var) {
        this.a = z;
        this.b = qnk0Var;
        this.c = mpk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fek0)) {
            return false;
        }
        fek0 fek0Var = (fek0) obj;
        return this.a == fek0Var.a && jl40.l(this.b, fek0Var.b) && jl40.l(this.c, fek0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        mpk0 mpk0Var = this.c;
        return hashCode + (mpk0Var == null ? 0 : mpk0Var.a.hashCode());
    }

    public final String toString() {
        return "RideCardCompactUiState(shouldMeasureFirstItemHeight=" + this.a + ", rideCardState=" + this.b + ", topDecoration=" + this.c + Extension.C_BRAKE;
    }
}
