package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class p52 implements um10 {
    public final so5 a;
    public final so5 b;
    public final int c;

    public p52(so5 so5Var, so5 so5Var2, int i) {
        this.a = so5Var;
        this.b = so5Var2;
        this.c = i;
    }

    @Override // defpackage.um10
    public final int a(f6w f6wVar, long j, int i, LayoutDirection layoutDirection) {
        int a = this.b.a(0, f6wVar.d(), layoutDirection);
        int i2 = -this.a.a(0, i, layoutDirection);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i3 = this.c;
        if (layoutDirection != layoutDirection2) {
            i3 = -i3;
        }
        return x4e.D(f6wVar.a, a, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p52)) {
            return false;
        }
        p52 p52Var = (p52) obj;
        return this.a.equals(p52Var.a) && this.b.equals(p52Var.b) && this.c == p52Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + g8e.c(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return oyr.s(sb, this.c, ')');
    }
}
