package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kic {
    public static final kic c = new kic(new int[0], null);
    public final int[] a;
    public final float[] b;

    public kic(int[] iArr, float[] fArr) {
        this.a = iArr;
        this.b = fArr;
        if (iArr.length == (fArr != null ? fArr.length : iArr.length)) {
            return;
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kic.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kic kicVar = (kic) obj;
        return Arrays.equals(this.a, kicVar.a) && Arrays.equals(this.b, kicVar.b);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        float[] fArr = this.b;
        return hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }
}
