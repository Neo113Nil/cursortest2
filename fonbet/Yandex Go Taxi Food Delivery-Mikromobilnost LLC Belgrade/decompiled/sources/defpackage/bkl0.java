package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bkl0 implements fkl0 {
    public final boolean a;

    public bkl0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkl0) && this.a == ((bkl0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("D2dRedirectRuleModel(dismissOnNegativeAction=", Extension.C_BRAKE, this.a);
    }
}
