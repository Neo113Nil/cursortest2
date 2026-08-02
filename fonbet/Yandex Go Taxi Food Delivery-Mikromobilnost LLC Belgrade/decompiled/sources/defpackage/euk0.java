package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class euk0 implements kuk0 {
    public final int a;
    public final int b;

    public euk0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euk0)) {
            return false;
        }
        euk0 euk0Var = (euk0) obj;
        return this.a == euk0Var.a && this.b == euk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "FocusRectChanged(top=", ", bottom=", Extension.C_BRAKE);
    }
}
