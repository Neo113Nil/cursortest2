package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fzr implements dzr {
    public final float[] a;
    public final float[] b;

    public fzr(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            ny61.g("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.dzr
    public final float a(float f) {
        return o430.n(f, this.b, this.a);
    }

    @Override // defpackage.dzr
    public final float b(float f) {
        return o430.n(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fzr)) {
            return false;
        }
        fzr fzrVar = (fzr) obj;
        return Arrays.equals(this.a, fzrVar.a) && Arrays.equals(this.b, fzrVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.a) + ", toDpValues=" + Arrays.toString(this.b) + '}';
    }
}
