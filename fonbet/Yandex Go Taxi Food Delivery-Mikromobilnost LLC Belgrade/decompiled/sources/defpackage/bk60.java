package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bk60 implements hk60 {
    public final int a;
    public final int b;

    public bk60(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk60)) {
            return false;
        }
        bk60 bk60Var = (bk60) obj;
        return this.a == bk60Var.a && this.b == bk60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "CircleProgress(current=", ", total=", Extension.C_BRAKE);
    }
}
