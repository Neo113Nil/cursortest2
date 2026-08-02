package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lxz {
    public final wwz a;
    public final avz b;
    public final ArrayList c;

    public lxz(wwz wwzVar, avz avzVar, ArrayList arrayList) {
        this.a = wwzVar;
        this.b = avzVar;
        this.c = arrayList;
    }

    public final List a() {
        return this.c;
    }

    public final wwz b() {
        return this.a;
    }

    public final avz c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxz)) {
            return false;
        }
        lxz lxzVar = (lxz) obj;
        return this.a.equals(lxzVar.a) && this.b.equals(lxzVar.b) && this.c.equals(lxzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyState(loyaltySelectorState=");
        sb.append(this.a);
        sb.append(", paymentMethodsMenu=");
        sb.append(this.b);
        sb.append(", balance=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
