package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pg50 {
    public final int a;
    public final int b;

    public pg50(int i, int i2) {
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
        if (!(obj instanceof pg50)) {
            return false;
        }
        pg50 pg50Var = (pg50) obj;
        return this.a == pg50Var.a && this.b == pg50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Logo(default=", ", focus=", Extension.C_BRAKE);
    }
}
