package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ewl0 {
    public final int a;
    public final int b;

    public ewl0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewl0)) {
            return false;
        }
        ewl0 ewl0Var = (ewl0) obj;
        return this.a == ewl0Var.a && this.b == ewl0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Logo(lightThemeRes=", ", darkThemeRes=", Extension.C_BRAKE);
    }
}
