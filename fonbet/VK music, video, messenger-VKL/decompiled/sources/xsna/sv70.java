package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: Offset.kt */
/* loaded from: classes11.dex */
final class sv70 extends d730<vv70> {
    public final float a;
    public final float b;
    public final boolean c;

    public sv70() {
        throw null;
    }

    public sv70(float f, float f2, tv70 tv70Var) {
        this.a = f;
        this.b = f2;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        sv70 sv70Var = obj instanceof sv70 ? (sv70) obj : null;
        return sv70Var != null && pco.b(this.a, sv70Var.a) && pco.b(this.b, sv70Var.b) && this.c == sv70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // xsna.d730
    public final vv70 r() {
        vv70 vv70Var = new vv70();
        vv70Var.p = this.a;
        vv70Var.q = this.b;
        vv70Var.r = this.c;
        return vv70Var;
    }

    @Override // xsna.d730
    public final void s(vv70 vv70Var) {
        vv70 vv70Var2 = vv70Var;
        float f = vv70Var2.p;
        float f2 = this.a;
        boolean b = pco.b(f, f2);
        float f3 = this.b;
        boolean z = this.c;
        if (!b || !pco.b(vv70Var2.q, f3) || vv70Var2.r != z) {
            LayoutNode f4 = itl.f(vv70Var2);
            LayoutNode.c cVar = LayoutNode.S;
            f4.e0(false);
        }
        vv70Var2.p = f2;
        vv70Var2.q = f3;
        vv70Var2.r = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        oq.f(this.a, ", y=", sb);
        oq.f(this.b, ", rtlAware=", sb);
        return defpackage.q0.a(sb, this.c, ')');
    }
}
