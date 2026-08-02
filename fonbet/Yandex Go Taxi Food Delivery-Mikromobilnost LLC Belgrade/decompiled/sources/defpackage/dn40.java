package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dn40 {
    public final cdc a;
    public final cdc b;

    public dn40(cdc cdcVar, cdc cdcVar2) {
        this.a = cdcVar;
        this.b = cdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn40)) {
            return false;
        }
        dn40 dn40Var = (dn40) obj;
        return this.a.equals(dn40Var.a) && this.b.equals(dn40Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "CheckedCheckboxColors(iconColor=" + this.a + ", bgColor=" + this.b + Extension.C_BRAKE;
    }
}
