package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fa01 implements ja01 {
    public final ra90 a;
    public final u531 b;

    public fa01(ra90 ra90Var, u531 u531Var) {
        this.a = ra90Var;
        this.b = u531Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa01)) {
            return false;
        }
        fa01 fa01Var = (fa01) obj;
        return this.a.equals(fa01Var.a) && this.b.equals(fa01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarWithCustomIcon(icon=" + this.a + ", vehicleInfo=" + this.b + Extension.C_BRAKE;
    }
}
