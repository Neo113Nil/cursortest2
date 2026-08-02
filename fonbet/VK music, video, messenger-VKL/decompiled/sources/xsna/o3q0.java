package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class o3q0 implements zpx0 {
    public final zpx0 a;
    public final zpx0 b;

    public o3q0(zpx0 zpx0Var, zpx0 zpx0Var2) {
        this.a = zpx0Var;
        this.b = zpx0Var2;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        return Math.max(this.a.a(azlVar), this.b.a(azlVar));
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        return Math.max(this.a.b(azlVar, layoutDirection), this.b.b(azlVar, layoutDirection));
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        return Math.max(this.a.c(azlVar), this.b.c(azlVar));
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        return Math.max(this.a.d(azlVar, layoutDirection), this.b.d(azlVar, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3q0)) {
            return false;
        }
        o3q0 o3q0Var = (o3q0) obj;
        return epx.f(o3q0Var.a, this.a) && epx.f(o3q0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
