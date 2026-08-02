package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class pe81 {
    public final int a;
    public final boolean b;

    public pe81(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe81)) {
            return false;
        }
        pe81 pe81Var = (pe81) obj;
        return this.a == pe81Var.a && this.b == pe81Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.a + ", disabled=" + this.b + Extension.C_BRAKE;
    }
}
