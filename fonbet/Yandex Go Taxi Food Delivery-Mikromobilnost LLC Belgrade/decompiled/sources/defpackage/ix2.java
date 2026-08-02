package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ix2 implements jx2 {
    public final u8r0 a;
    public final boolean b;

    public ix2(u8r0 u8r0Var, boolean z) {
        this.a = u8r0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix2)) {
            return false;
        }
        ix2 ix2Var = (ix2) obj;
        return jl40.l(this.a, ix2Var.a) && this.b == ix2Var.b;
    }

    @Override // defpackage.jx2
    public final v8r0 getItem() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Toggle(item=" + this.a + ", checked=" + this.b + Extension.C_BRAKE;
    }
}
