package xsna;

/* compiled from: ReactionPickerContent.kt */
/* loaded from: classes2.dex */
public final class aia0 {
    public final float a;
    public final float b;
    public final float c;
    public final pco d;
    public final boolean e;
    public final float f;

    public aia0(float f, float f2, float f3, pco pcoVar, boolean z, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = pcoVar;
        this.e = z;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aia0)) {
            return false;
        }
        aia0 aia0Var = (aia0) obj;
        return pco.b(this.a, aia0Var.a) && pco.b(this.b, aia0Var.b) && pco.b(this.c, aia0Var.c) && epx.f(this.d, aia0Var.d) && this.e == aia0Var.e && pco.b(this.f, aia0Var.f);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        pco pcoVar = this.d;
        return Float.hashCode(this.f) + qoy.b((a + (pcoVar == null ? 0 : Float.hashCode(pcoVar.b))) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerLayoutParams(itemSizeDp=");
        oq.f(this.a, ", itemGapDp=", sb);
        oq.f(this.b, ", containerPaddingDp=", sb);
        oq.f(this.c, ", collapsedHeightDp=", sb);
        sb.append(this.d);
        sb.append(", forceCache=");
        sb.append(this.e);
        sb.append(", imagePaddingDp=");
        return ir.f(')', this.f, sb);
    }
}
