package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jz0 implements kz0 {
    public final uqb0 a;

    public jz0(uqb0 uqb0Var) {
        this.a = uqb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz0) && this.a == ((jz0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowBlockedZoneAlert(params=" + this.a + Extension.C_BRAKE;
    }
}
