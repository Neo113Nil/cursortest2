package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class emq0 implements kmq0 {
    public final ej31 a;

    public emq0(ej31 ej31Var) {
        this.a = ej31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emq0) && this.a.equals(((emq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TariffCellClicked(verticalTariffUiState=" + this.a + Extension.C_BRAKE;
    }
}
