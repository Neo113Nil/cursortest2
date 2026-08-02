package defpackage;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class fvc {
    public static final Object c = new Object();
    public final Object[] a;
    public Object b = c;

    public fvc(Object[] objArr) {
        this.a = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fvc) {
            Object[] objArr = ((fvc) obj).a;
            int length = objArr.length;
            Object[] objArr2 = this.a;
            if (length == objArr2.length) {
                int length2 = objArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (jl40.l(objArr[i2], objArr2[i])) {
                        i++;
                        i2 = i3;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b.equals(c)) {
            this.b = Integer.valueOf(Arrays.hashCode(this.a));
        }
        return ((Integer) this.b).intValue();
    }
}
