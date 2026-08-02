package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class r4x implements s890 {
    public final zpx0 a;
    public final azl b;

    public r4x(zpx0 zpx0Var, azl azlVar) {
        this.a = zpx0Var;
        this.b = azlVar;
    }

    @Override // xsna.s890
    public final float a(LayoutDirection layoutDirection) {
        zpx0 zpx0Var = this.a;
        azl azlVar = this.b;
        return azlVar.j1(zpx0Var.b(azlVar, layoutDirection));
    }

    @Override // xsna.s890
    public final float b() {
        zpx0 zpx0Var = this.a;
        azl azlVar = this.b;
        return azlVar.j1(zpx0Var.a(azlVar));
    }

    @Override // xsna.s890
    public final float c(LayoutDirection layoutDirection) {
        zpx0 zpx0Var = this.a;
        azl azlVar = this.b;
        return azlVar.j1(zpx0Var.d(azlVar, layoutDirection));
    }

    @Override // xsna.s890
    public final float d() {
        zpx0 zpx0Var = this.a;
        azl azlVar = this.b;
        return azlVar.j1(zpx0Var.c(azlVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4x)) {
            return false;
        }
        r4x r4xVar = (r4x) obj;
        return epx.f(this.a, r4xVar.a) && epx.f(this.b, r4xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
