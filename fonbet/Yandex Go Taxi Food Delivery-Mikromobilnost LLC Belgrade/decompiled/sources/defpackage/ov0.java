package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ov0 {
    public final pvi0 a;
    public final wp2 b;
    public final wp2 c;
    public final au2 d;

    public ov0(pvi0 pvi0Var, wp2 wp2Var, wp2 wp2Var2, au2 au2Var) {
        this.a = pvi0Var;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = au2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ov0) {
            ov0 ov0Var = (ov0) obj;
            return this.a.equals(ov0Var.a) && jl40.l(this.b, ov0Var.b) && jl40.l(this.c, ov0Var.c) && this.d == ov0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AddressImageUiState(image=" + this.a + ", imageTintColor=" + this.b + ", backgroundColor=" + this.c + ", fallbackImage=" + this.d + Extension.C_BRAKE;
    }
}
