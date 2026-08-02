package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class yjr0 implements zpx0 {
    public final String a;
    public final wh50 b;

    public yjr0(s4x s4xVar, String str) {
        this.a = str;
        this.b = androidx.compose.runtime.k.b(s4xVar);
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

    public final s4x e() {
        return (s4x) ((zak0) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yjr0) {
            return epx.f(e(), ((yjr0) obj).e());
        }
        return false;
    }

    public final void f(s4x s4xVar) {
        ((zak0) this.b).setValue(s4xVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return vu5.b(sb, e().d, ')');
    }
}
