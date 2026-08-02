package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class anr implements zpx0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public anr(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        return this.d;
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        return this.c;
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        return this.b;
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anr)) {
            return false;
        }
        anr anrVar = (anr) obj;
        return this.a == anrVar.a && this.b == anrVar.b && this.c == anrVar.c && this.d == anrVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vu5.b(sb, this.d, ')');
    }
}
