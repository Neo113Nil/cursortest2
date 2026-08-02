package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class olg {
    public final String a;
    public final boolean b;
    public final List c;
    public final int d;

    public olg(String str, List list, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olg)) {
            return false;
        }
        olg olgVar = (olg) obj;
        return jl40.l(this.a, olgVar.a) && this.b == olgVar.b && jl40.l(this.c, olgVar.c) && this.d == olgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DashboardSkinSelectionConfig(action=", this.a, ", enabled=", ", products=", this.b);
        l.append(this.c);
        l.append(", visitsBetweenOnboarding=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
