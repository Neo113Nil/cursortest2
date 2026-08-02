package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class chr0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    public chr0(boolean z, boolean z2, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chr0)) {
            return false;
        }
        chr0 chr0Var = (chr0) obj;
        return this.a == chr0Var.a && this.b == chr0Var.b && this.c.equals(chr0Var.c) && this.d.equals(chr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(qv10.u("ShakeToggleState(isEnabled=", ", toggleState=", ", toggleTitle=", this.a, this.b), this.c, ", toggleSubtitle=", this.d, Extension.C_BRAKE);
    }
}
