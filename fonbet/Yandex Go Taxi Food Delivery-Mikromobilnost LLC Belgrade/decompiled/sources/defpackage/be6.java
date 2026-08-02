package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class be6 {
    public final ArrayList a;
    public final rnf0 b;
    public final kr c;

    public be6(ArrayList arrayList, rnf0 rnf0Var, kr krVar) {
        this.a = arrayList;
        this.b = rnf0Var;
        this.c = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be6)) {
            return false;
        }
        be6 be6Var = (be6) obj;
        return this.a.equals(be6Var.a) && jl40.l(this.b, be6Var.b) && jl40.l(this.c, be6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rnf0 rnf0Var = this.b;
        int hashCode2 = (hashCode + (rnf0Var == null ? 0 : rnf0Var.hashCode())) * 31;
        kr krVar = this.c;
        return hashCode2 + (krVar != null ? krVar.hashCode() : 0);
    }

    public final String toString() {
        return "BottomPanelContent(buttons=" + this.a + ", promoInfo=" + this.b + ", promoDetailsAction=" + this.c + Extension.C_BRAKE;
    }
}
