package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c3x {
    public final int a;
    public final int b;

    public c3x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3x)) {
            return false;
        }
        c3x c3xVar = (c3x) obj;
        return this.a == c3xVar.a && this.b == c3xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ItemSize(rows=", ", columns=", Extension.C_BRAKE);
    }
}
