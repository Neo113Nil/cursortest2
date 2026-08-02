package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e91 implements k91 {
    public final uqb0 a;

    public e91(uqb0 uqb0Var) {
        this.a = uqb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e91) && this.a == ((e91) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockedZoneAlert(params=" + this.a + Extension.C_BRAKE;
    }
}
