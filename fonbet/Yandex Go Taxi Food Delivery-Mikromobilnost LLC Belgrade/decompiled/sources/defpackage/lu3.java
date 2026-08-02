package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lu3 implements su3 {
    public final ou3 a;

    public lu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu3) && this.a.equals(((lu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoFundEdit(limit=" + this.a + Extension.C_BRAKE;
    }
}
