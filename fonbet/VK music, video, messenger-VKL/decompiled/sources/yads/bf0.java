package yads;

import android.os.Bundle;
import java.util.Arrays;
import xsna.rjk0;

/* loaded from: classes10.dex */
public final class bf0 implements xq {
    public static final wq e = new rjk0(12);
    public final int b;
    public final int[] c;
    public final int d;

    public bf0(int i, int i2, int[] iArr) {
        this.b = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.c = copyOf;
        this.d = i2;
        Arrays.sort(copyOf);
    }

    public static bf0 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new bf0(i, i2, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf0.class == obj.getClass()) {
            bf0 bf0Var = (bf0) obj;
            if (this.b == bf0Var.b && Arrays.equals(this.c, bf0Var.c) && this.d == bf0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return xsna.dq.d(this.b * 31, 31, this.c) + this.d;
    }
}
