package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kxz {
    public final String a;
    public final List b;
    public final dxz c;

    public kxz(String str, List list, dxz dxzVar) {
        this.a = str;
        this.b = list;
        this.c = dxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxz)) {
            return false;
        }
        kxz kxzVar = (kxz) obj;
        return jl40.l(this.a, kxzVar.a) && jl40.l(this.b, kxzVar.b) && this.c.equals(kxzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = xvz.r("LoyaltySelectorUiState(title=", this.a, ", loyaltyProgramList=", this.b, ", doneButtonState=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
