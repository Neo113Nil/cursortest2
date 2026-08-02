package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class r2q implements zpx0 {
    public final zpx0 a;
    public final zpx0 b;

    public r2q(zpx0 zpx0Var, zpx0 zpx0Var2) {
        this.a = zpx0Var;
        this.b = zpx0Var2;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        int a = this.a.a(azlVar) - this.b.a(azlVar);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        int b = this.a.b(azlVar, layoutDirection) - this.b.b(azlVar, layoutDirection);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        int c = this.a.c(azlVar) - this.b.c(azlVar);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        int d = this.a.d(azlVar, layoutDirection) - this.b.d(azlVar, layoutDirection);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2q)) {
            return false;
        }
        r2q r2qVar = (r2q) obj;
        return epx.f(r2qVar.a, this.a) && epx.f(r2qVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
