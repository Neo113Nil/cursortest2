package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dbv0 {
    public final String a;
    public final ArrayList b;

    public dbv0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbv0)) {
            return false;
        }
        dbv0 dbv0Var = (dbv0) obj;
        return jl40.l(this.a, dbv0Var.a) && this.b.equals(dbv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("SuggestedPromoEntity(title=", this.a, ", promos=", Extension.C_BRAKE, this.b);
    }
}
