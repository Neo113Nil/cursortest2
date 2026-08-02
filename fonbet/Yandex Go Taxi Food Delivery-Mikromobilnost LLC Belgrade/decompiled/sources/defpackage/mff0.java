package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mff0 {
    public final boolean a;
    public final boolean b;

    public mff0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mff0)) {
            return false;
        }
        mff0 mff0Var = (mff0) obj;
        return this.a == mff0Var.a && this.b == mff0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("ProfilePayload(isFromDeeplink=", ", isFromStatisticsDeeplink=", Extension.C_BRAKE, this.a, this.b);
    }
}
