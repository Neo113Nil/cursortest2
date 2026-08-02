package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class j28 {
    public fwi a;
    public LayoutDirection b;
    public i28 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j28)) {
            return false;
        }
        j28 j28Var = (j28) obj;
        return jl40.l(this.a, j28Var.a) && this.b == j28Var.b && jl40.l(this.c, j28Var.c) && cjs0.a(this.d, j28Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) cjs0.f(this.d)) + ')';
    }
}
