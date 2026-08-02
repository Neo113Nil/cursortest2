package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class h7z implements zpx0 {
    public final zpx0 a;
    public final int b;

    public h7z(zpx0 zpx0Var, int i) {
        this.a = zpx0Var;
        this.b = i;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        if ((this.b & 32) != 0) {
            return this.a.a(azlVar);
        }
        return 0;
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.b) != 0) {
            return this.a.b(azlVar, layoutDirection);
        }
        return 0;
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        if ((this.b & 16) != 0) {
            return this.a.c(azlVar);
        }
        return 0;
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.b) != 0) {
            return this.a.d(azlVar, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7z)) {
            return false;
        }
        h7z h7zVar = (h7z) obj;
        return epx.f(this.a, h7zVar.a) && this.b == h7zVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = crx0.b;
        int i2 = this.b;
        if ((i2 & i) == i) {
            crx0.F("Start", sb3);
        }
        int i3 = crx0.d;
        if ((i2 & i3) == i3) {
            crx0.F("Left", sb3);
        }
        if ((i2 & 16) == 16) {
            crx0.F("Top", sb3);
        }
        int i4 = crx0.c;
        if ((i2 & i4) == i4) {
            crx0.F("End", sb3);
        }
        int i5 = crx0.e;
        if ((i2 & i5) == i5) {
            crx0.F("Right", sb3);
        }
        if ((i2 & 32) == 32) {
            crx0.F("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
