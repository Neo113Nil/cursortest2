package defpackage;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifySourceScreen;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import java.util.Arrays;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public abstract class ooa1 {
    public static bfr a(ef90 ef90Var) {
        ef90Var.L(1);
        int B = ef90Var.B();
        long j = ef90Var.b + B;
        int i = B / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long s = ef90Var.s();
            if (s == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = s;
            jArr2[i2] = ef90Var.s();
            ef90Var.L(2);
            i2++;
        }
        ef90Var.L((int) (j - ef90Var.b));
        return new bfr(jArr, jArr2);
    }

    public static final AddressMapPickerPointType b(i11 i11Var) {
        if (jl40.l(i11Var, h11.a) || jl40.l(i11Var, d11.a) || jl40.l(i11Var, g11.a)) {
            return AddressMapPickerPointType.Source;
        }
        if (jl40.l(i11Var, f11.a)) {
            return AddressMapPickerPointType.Destination;
        }
        if (i11Var instanceof e11) {
            return ((e11) i11Var).a;
        }
        w511.b();
        return null;
    }

    public static final ClarifyAnalytics$ClarifySourceScreen c(AddressMapPickerSourceScreen addressMapPickerSourceScreen) {
        switch (a21.b[addressMapPickerSourceScreen.ordinal()]) {
            case 1:
                return ClarifyAnalytics$ClarifySourceScreen.Superapp;
            case 2:
                return ClarifyAnalytics$ClarifySourceScreen.SuperappSearch;
            case 3:
                return ClarifyAnalytics$ClarifySourceScreen.TaxiMain;
            case 4:
                return ClarifyAnalytics$ClarifySourceScreen.Summary;
            case 5:
                return ClarifyAnalytics$ClarifySourceScreen.Order;
            case 6:
                return ClarifyAnalytics$ClarifySourceScreen.Intercity;
            default:
                w511.b();
                return null;
        }
    }

    public static final lfr0 d(tyj0 tyj0Var) {
        if (tyj0Var.c()) {
            return zmx.d(tyj0Var.a());
        }
        YSError ySError = tyj0Var.b;
        c.b(ySError);
        return zmx.c(ySError);
    }

    public static final RoutePointType e(AddressMapPickerPointType addressMapPickerPointType) {
        int i = a21.a[addressMapPickerPointType.ordinal()];
        if (i == 1) {
            return RoutePointType.POINT_A;
        }
        if (i == 2) {
            return RoutePointType.POINT_B;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        i(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int c = toa1.c(obj);
        int i2 = c & i;
        int g = g(i2, obj3);
        if (g != 0) {
            int i3 = ~i;
            int i4 = c & i3;
            int i5 = -1;
            while (true) {
                int i6 = g - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !hua1.i(obj, objArr[i6]) || (objArr2 != null && !hua1.i(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    g = i8;
                }
            }
        }
        return -1;
    }

    public static int g(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object h(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ny61.g(oyr.i(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void i(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
