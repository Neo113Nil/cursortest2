package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fgr0 {
    public final float[] a;
    public final float b;

    public fgr0(float[] fArr, float f) {
        this.a = fArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgr0)) {
            return false;
        }
        fgr0 fgr0Var = (fgr0) obj;
        return this.b == fgr0Var.b && Arrays.equals(this.a, fgr0Var.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
