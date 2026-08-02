package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ata implements cta {
    public final eed0 a;

    public ata(eed0 eed0Var) {
        this.a = eed0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ata) && this.a.equals(((ata) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPlusPay(plusPayParams=" + this.a + Extension.C_BRAKE;
    }
}
