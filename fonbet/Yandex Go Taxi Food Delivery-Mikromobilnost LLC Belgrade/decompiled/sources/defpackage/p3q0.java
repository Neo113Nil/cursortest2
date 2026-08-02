package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p3q0 {
    public final int a;
    public final int b;

    public /* synthetic */ p3q0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3q0)) {
            return false;
        }
        p3q0 p3q0Var = (p3q0) obj;
        return this.a == p3q0Var.a && this.b == p3q0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Margins(top=", ", bottom=", Extension.C_BRAKE);
    }

    public p3q0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p3q0() {
        this(r0, r0, 3);
        int i = 0;
    }
}
