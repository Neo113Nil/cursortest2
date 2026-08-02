package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gbf0 {
    public final int[] a;
    public final float[] b;
    public final float c;
    public final float d;
    public final float e;

    public gbf0(int[] iArr, float[] fArr, float f, float f2, float f3) {
        this.a = iArr;
        this.b = fArr;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public static gbf0 a(gbf0 gbf0Var, float f, float f2, float f3) {
        int[] iArr = gbf0Var.a;
        float[] fArr = gbf0Var.b;
        gbf0Var.getClass();
        return new gbf0(iArr, fArr, f, f2, f3);
    }

    public final int b() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbf0)) {
            return false;
        }
        gbf0 gbf0Var = (gbf0) obj;
        return Arrays.equals(this.a, gbf0Var.a) && Arrays.equals(this.b, gbf0Var.b) && this.c == gbf0Var.c && this.d == gbf0Var.d && this.e == gbf0Var.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, (Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("LayerParams(colors=", Arrays.toString(this.a), ", positions=", Arrays.toString(this.b), ", centerXFraction=");
        vfc.x(v, this.c, ", centerYFraction=", this.d, ", radiusFraction=");
        return uw51.i(v, this.e, Extension.C_BRAKE);
    }
}
