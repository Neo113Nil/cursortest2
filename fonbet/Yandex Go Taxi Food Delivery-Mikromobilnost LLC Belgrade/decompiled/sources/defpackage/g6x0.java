package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g6x0 {
    public final List a;
    public final int b;
    public final x2s c;

    public g6x0(List list, int i, x2s x2sVar) {
        this.a = list;
        this.b = i;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6x0)) {
            return false;
        }
        g6x0 g6x0Var = (g6x0) obj;
        return jl40.l(this.a, g6x0Var.a) && this.b == g6x0Var.b && this.c.equals(g6x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TabsState(elements=" + this.a + ", selectedIndex=" + this.b + ", onShownAnalyticsData=" + this.c + Extension.C_BRAKE;
    }
}
