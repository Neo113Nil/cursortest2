package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.android.kt */
/* loaded from: classes11.dex */
public final class te2 implements zpx0 {
    public final int a;
    public final String b;
    public final wh50 c = androidx.compose.runtime.k.b(h4x.e);
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.TRUE);

    public te2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        return e().d;
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        return e().c;
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        return e().b;
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        return e().a;
    }

    public final h4x e() {
        return (h4x) ((zak0) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof te2) {
            return this.a == ((te2) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        ((zak0) this.d).setValue(Boolean.valueOf(z));
    }

    public final void g(bqx0 bqx0Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            ((zak0) this.c).setValue(bqx0Var.a.i(i2));
            f(bqx0Var.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return vu5.b(sb, e().d, ')');
    }
}
