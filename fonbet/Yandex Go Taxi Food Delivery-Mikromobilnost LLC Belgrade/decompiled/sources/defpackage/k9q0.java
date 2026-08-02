package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k9q0 {
    public final List a;
    public final int b;
    public final x2s c;
    public final o9q0 d;

    public k9q0(List list, int i, x2s x2sVar, o9q0 o9q0Var) {
        this.a = list;
        this.b = i;
        this.c = x2sVar;
        this.d = o9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9q0)) {
            return false;
        }
        k9q0 k9q0Var = (k9q0) obj;
        return jl40.l(this.a, k9q0Var.a) && this.b == k9q0Var.b && this.c.equals(k9q0Var.c) && this.d.equals(k9q0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tse0.a(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SegmentedComponentState(elements=" + this.a + ", selectedIndex=" + this.b + ", onShownAnalyticsData=" + this.c + ", widthMode=" + this.d + Extension.C_BRAKE;
    }
}
