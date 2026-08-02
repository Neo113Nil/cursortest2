package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p600 {
    public final boolean a;
    public final boolean b;

    public p600(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p600)) {
            return false;
        }
        p600 p600Var = (p600) obj;
        return this.a == p600Var.a && this.b == p600Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("AppearanceCriteria(isAuthorized=", ", isExperimentEnabled=", Extension.C_BRAKE, this.a, this.b);
    }
}
