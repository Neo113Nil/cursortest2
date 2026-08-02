package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnv60;", "Lj530;", "Lov60;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class nv60 extends j530 {
    public final tls a;
    public final boolean b = true;

    public nv60(tls tlsVar, gv40 gv40Var) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        ov60 ov60Var = new ov60();
        ov60Var.a = this.a;
        ov60Var.b = this.b;
        return ov60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nv60 nv60Var = obj instanceof nv60 ? (nv60) obj : null;
        return nv60Var != null && this.a == nv60Var.a && this.b == nv60Var.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ov60 ov60Var = (ov60) e530Var;
        tls tlsVar = ov60Var.a;
        tls tlsVar2 = this.a;
        boolean z = this.b;
        if (tlsVar != tlsVar2 || ov60Var.b != z) {
            LayoutNode P = qje.P(ov60Var);
            z0y z0yVar = LayoutNode.m0;
            P.S(false);
        }
        ov60Var.a = tlsVar2;
        ov60Var.b = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.a);
        sb.append(", rtlAware=");
        return unr0.u(sb, this.b, ')');
    }
}
