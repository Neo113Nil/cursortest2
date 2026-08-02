package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e210 {
    public final b210 a;
    public final a210 b;

    public e210(b210 b210Var, a210 a210Var) {
        this.a = b210Var;
        this.b = a210Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e210)) {
            return false;
        }
        e210 e210Var = (e210) obj;
        return this.a.equals(e210Var.a) && this.b.equals(e210Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MasstransitBleScanningScreenSettingsConfig(headerSection=" + this.a + ", bleSection=" + this.b + Extension.C_BRAKE;
    }
}
