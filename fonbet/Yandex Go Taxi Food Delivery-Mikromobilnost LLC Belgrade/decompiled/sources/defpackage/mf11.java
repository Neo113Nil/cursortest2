package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mf11 {
    public final afp0 a;
    public final boolean b;

    public mf11(afp0 afp0Var, boolean z) {
        this.a = afp0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf11) {
            mf11 mf11Var = (mf11) obj;
            if (this.a == mf11Var.a && this.b == mf11Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TripUpdateResult(state=" + this.a + ", isPartialUpdate=" + this.b + Extension.C_BRAKE;
    }
}
