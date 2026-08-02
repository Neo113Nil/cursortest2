package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class umr implements zpx0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public umr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // xsna.zpx0
    public final int a(azl azlVar) {
        return azlVar.r0(this.d);
    }

    @Override // xsna.zpx0
    public final int b(azl azlVar, LayoutDirection layoutDirection) {
        return azlVar.r0(this.c);
    }

    @Override // xsna.zpx0
    public final int c(azl azlVar) {
        return azlVar.r0(this.b);
    }

    @Override // xsna.zpx0
    public final int d(azl azlVar, LayoutDirection layoutDirection) {
        return azlVar.r0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umr)) {
            return false;
        }
        umr umrVar = (umr) obj;
        return pco.b(this.a, umrVar.a) && pco.b(this.b, umrVar.b) && pco.b(this.c, umrVar.c) && pco.b(this.d, umrVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        oq.f(this.a, ", top=", sb);
        oq.f(this.b, ", right=", sb);
        oq.f(this.c, ", bottom=", sb);
        return ir.f(')', this.d, sb);
    }
}
