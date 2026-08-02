package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.c;

/* loaded from: classes6.dex */
public abstract class jha1 implements ihg0 {
    public static int a(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static int b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = w4a1.a(obj == null ? 0 : obj.hashCode());
        int i4 = a & i;
        int a2 = a(i4, obj3);
        if (a2 != 0) {
            int i5 = ~i;
            int i6 = a & i5;
            int i7 = -1;
            while (true) {
                i2 = a2 - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !tja1.a(obj, objArr[i2]) || (objArr2 != null && !tja1.a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    a2 = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                c(i4, i9, obj3);
                return i2;
            }
            iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            return i2;
        }
        return -1;
    }

    public static void c(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final lum d(y4 y4Var) {
        return new lum(new zbd(2), k6.a, new y4(3, y4Var), l6.a);
    }

    public static final c e(wiq0 wiq0Var) {
        return new c(((k) wiq0Var).j.b());
    }
}
