package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: Offset.kt */
/* loaded from: classes11.dex */
final class xv70 extends d730<yv70> {
    public final izs<azl, h9x> a;
    public final boolean b = true;

    public xv70(izs izsVar, uzo uzoVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xv70 xv70Var = obj instanceof xv70 ? (xv70) obj : null;
        return xv70Var != null && this.a == xv70Var.a && this.b == xv70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final yv70 r() {
        yv70 yv70Var = new yv70();
        yv70Var.p = this.a;
        yv70Var.q = this.b;
        return yv70Var;
    }

    @Override // xsna.d730
    public final void s(yv70 yv70Var) {
        yv70 yv70Var2 = yv70Var;
        izs<? super azl, h9x> izsVar = yv70Var2.p;
        izs<azl, h9x> izsVar2 = this.a;
        boolean z = this.b;
        if (izsVar != izsVar2 || yv70Var2.q != z) {
            LayoutNode f = itl.f(yv70Var2);
            LayoutNode.c cVar = LayoutNode.S;
            f.e0(false);
        }
        yv70Var2.p = izsVar2;
        yv70Var2.q = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.a);
        sb.append(", rtlAware=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
