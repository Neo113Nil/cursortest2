package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ppm0 {
    public final kpm0 a;
    public final opm0 b;

    public ppm0(kpm0 kpm0Var, opm0 opm0Var) {
        this.a = kpm0Var;
        this.b = opm0Var;
    }

    public final boolean a() {
        return jl40.l(this.b, lpm0.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppm0)) {
            return false;
        }
        ppm0 ppm0Var = (ppm0) obj;
        return jl40.l(this.a, ppm0Var.a) && jl40.l(this.b, ppm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScooterPhotoWithStatus(scooterPhoto=" + this.a + ", uploadStatus=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ ppm0(kpm0 kpm0Var) {
        this(kpm0Var, xpb1.P);
    }
}
