package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pn40 {
    public final boolean a;
    public final boolean b;

    public pn40(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn40)) {
            return false;
        }
        pn40 pn40Var = (pn40) obj;
        return this.a == pn40Var.a && this.b == pn40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("CheckUiState(isChecked=", ", isEnabled=", Extension.C_BRAKE, this.a, this.b);
    }
}
