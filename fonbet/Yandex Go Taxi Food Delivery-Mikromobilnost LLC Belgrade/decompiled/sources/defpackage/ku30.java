package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ku30 {
    public final String a;
    public final ArrayList b;

    public ku30(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku30)) {
            return false;
        }
        ku30 ku30Var = (ku30) obj;
        return this.a.equals(ku30Var.a) && this.b.equals(ku30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("MtPurchaseOptionsUiState(title=", this.a, ", options=", Extension.C_BRAKE, this.b);
    }
}
