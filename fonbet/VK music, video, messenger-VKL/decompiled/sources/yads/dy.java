package yads;

/* loaded from: classes10.dex */
public abstract class dy {
    public static int a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = q01.a(obj == null ? 0 : obj.hashCode());
        int i4 = a & i;
        int a2 = a(i4, obj3);
        if (a2 == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = a & i5;
        int i7 = -1;
        while (true) {
            i2 = a2 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !ma2.a(obj, objArr[i2]) || (objArr2 != null && !ma2.a(obj2, objArr2[i2]))) {
                int i8 = i3 & i;
                if (i8 == 0) {
                    return -1;
                }
                i7 = i2;
                a2 = i8;
            }
        }
        int i9 = i3 & i;
        if (i7 == -1) {
            a(i4, i9, obj3);
            return i2;
        }
        iArr[i7] = (i9 & i) | (iArr[i7] & i5);
        return i2;
    }

    public static int a(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void a(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
