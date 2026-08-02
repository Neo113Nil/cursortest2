package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class npw0 {
    public final int a;
    public final int b;

    public npw0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npw0)) {
            return false;
        }
        npw0 npw0Var = (npw0) obj;
        return this.a == npw0Var.a && this.b == npw0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "SurgeIconInfo(icon=", ", color=", Extension.C_BRAKE);
    }
}
