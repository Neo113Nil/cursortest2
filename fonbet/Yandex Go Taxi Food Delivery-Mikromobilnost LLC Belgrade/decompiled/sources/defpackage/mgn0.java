package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mgn0 {
    public final kfn0 a;
    public final boolean b;

    public mgn0(kfn0 kfn0Var, boolean z) {
        this.a = kfn0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgn0)) {
            return false;
        }
        mgn0 mgn0Var = (mgn0) obj;
        return jl40.l(this.a, mgn0Var.a) && this.b == mgn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScootersDetailedOrderProgressableAction(action=" + this.a + ", inProgress=" + this.b + Extension.C_BRAKE;
    }
}
