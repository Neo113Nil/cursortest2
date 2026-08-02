package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldv60;", "Lj530;", "Llv60;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class dv60 extends j530 {
    public final float a;
    public final float b;
    public final boolean c = true;

    public dv60(float f, float f2, gv60 gv60Var) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        lv60 lv60Var = new lv60();
        lv60Var.a = this.a;
        lv60Var.b = this.b;
        lv60Var.c = this.c;
        return lv60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        dv60 dv60Var = obj instanceof dv60 ? (dv60) obj : null;
        return dv60Var != null && y7m.b(this.a, dv60Var.a) && y7m.b(this.b, dv60Var.b) && this.c == dv60Var.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        lv60 lv60Var = (lv60) e530Var;
        float f = lv60Var.a;
        float f2 = this.a;
        boolean b = y7m.b(f, f2);
        float f3 = this.b;
        boolean z = this.c;
        if (!b || !y7m.b(lv60Var.b, f3) || lv60Var.c != z) {
            LayoutNode P = qje.P(lv60Var);
            z0y z0yVar = LayoutNode.m0;
            P.S(false);
        }
        lv60Var.a = f2;
        lv60Var.b = f3;
        lv60Var.c = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) y7m.c(this.a));
        sb.append(", y=");
        sb.append((Object) y7m.c(this.b));
        sb.append(", rtlAware=");
        return unr0.u(sb, this.c, ')');
    }
}
