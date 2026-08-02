package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ncx0 {
    public final ArrayList a;
    public final ArrayList b;

    public ncx0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncx0)) {
            return false;
        }
        ncx0 ncx0Var = (ncx0) obj;
        return this.a.equals(ncx0Var.a) && this.b.equals(ncx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffCardItemGroupsWithForceTopItemsUiState(tariffCardItemGroupsUiState=" + this.a + ", forceTopTariffCardItems=" + this.b + Extension.C_BRAKE;
    }
}
