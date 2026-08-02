package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class l690 implements j690 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public l690(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            gxv.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.j690
    public final float a() {
        return this.e;
    }

    @Override // defpackage.j690
    public final float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.b : this.d;
    }

    @Override // defpackage.j690
    public final float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.d : this.b;
    }

    @Override // defpackage.j690
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l690)) {
            return false;
        }
        l690 l690Var = (l690) obj;
        return y7m.b(this.b, l690Var.b) && y7m.b(this.c, l690Var.c) && y7m.b(this.d, l690Var.d) && y7m.b(this.e, l690Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, Float.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) y7m.c(this.b)) + ", top=" + ((Object) y7m.c(this.c)) + ", end=" + ((Object) y7m.c(this.d)) + ", bottom=" + ((Object) y7m.c(this.e)) + ')';
    }
}
