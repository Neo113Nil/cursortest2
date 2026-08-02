package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class q0y {
    public final int a;
    public final int b;

    public q0y(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0y)) {
            return false;
        }
        q0y q0yVar = (q0y) obj;
        return this.a == q0yVar.a && this.b == q0yVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "FirstLaidOutAnchor(row=", ", topInViewport=", Extension.C_BRAKE);
    }
}
