package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dh31 {
    public final yz40 a;
    public final yz40 b;
    public final yz40 c;
    public final List d;

    public dh31(yz40 yz40Var, yz40 yz40Var2, yz40 yz40Var3, List list) {
        this.a = yz40Var;
        this.b = yz40Var2;
        this.c = yz40Var3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh31)) {
            return false;
        }
        dh31 dh31Var = (dh31) obj;
        return this.a.equals(dh31Var.a) && this.b.equals(dh31Var.b) && this.c.equals(dh31Var.c) && this.d.equals(dh31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VerticalSummaryAnchors(smallAnchor=" + this.a + ", defaultAnchor=" + this.b + ", expandedAnchor=" + this.c + ", anchorsList=" + this.d + Extension.C_BRAKE;
    }
}
