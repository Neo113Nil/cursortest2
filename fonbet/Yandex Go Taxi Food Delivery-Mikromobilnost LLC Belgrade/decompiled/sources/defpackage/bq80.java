package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bq80 {
    public final CharSequence a;
    public final ArrayList b;

    public bq80(CharSequence charSequence, ArrayList arrayList) {
        this.a = charSequence;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq80)) {
            return false;
        }
        bq80 bq80Var = (bq80) obj;
        return jl40.l(this.a, bq80Var.a) && this.b.equals(bq80Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "OrganizationsSortingUiState(title=" + ((Object) this.a) + ", items=" + this.b + Extension.C_BRAKE;
    }
}
