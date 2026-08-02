package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: MutableWindowInsets.kt */
/* loaded from: classes11.dex */
public final class ii50 implements zpx0 {
    public final wh50 a;

    public ii50(zpx0 zpx0Var) {
        this.a = androidx.compose.runtime.k.b(zpx0Var);
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        return ((zpx0) ((zak0) this.a).getValue()).a(azlVar);
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        return ((zpx0) ((zak0) this.a).getValue()).b(azlVar, layoutDirection);
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        return ((zpx0) ((zak0) this.a).getValue()).c(azlVar);
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        return ((zpx0) ((zak0) this.a).getValue()).d(azlVar, layoutDirection);
    }

    public ii50() {
        this(new anr(0, 0, 0, 0));
    }
}
