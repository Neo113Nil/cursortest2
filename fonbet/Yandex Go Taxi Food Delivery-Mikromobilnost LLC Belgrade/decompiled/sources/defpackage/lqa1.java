package defpackage;

import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class lqa1 {
    public static final void a(vn1 vn1Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(685668693);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vn1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            jy6 jy6Var = new jy6(5.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new j0(21, tlsVar, vn1Var);
                btsVar.o0(Q);
            }
            a.d((sls) Q, ljs0.m(c530.a, 64.0f), cyk0.a, ((el51) btsVar.m(gl51.a)).a(), 0L, jy6Var, null, false, null, wwg.S(480786158, true, new bj0(11, vn1Var), btsVar), btsVar, 48, 4016);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(vn1Var, tlsVar, i, 13);
        }
    }

    public static final void b(utk0 utk0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(439566402);
        int i2 = (btsVar.k(utk0Var) ? 4 : 2) | i | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            int i4 = 6;
            f530 b = ofb1.b(an91.n(c530Var, 8.0f, 4.0f, 8.0f, 8.0f), utk0Var.d, null, 6);
            ButtonSize buttonSize = ButtonSize.L;
            ButtonStyle buttonStyle = ButtonStyle.Main;
            boolean z = utk0Var.c;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new v6k0(tlsVar, i4, utk0Var);
                btsVar.o0(Q);
            }
            d17.c(b, z, buttonSize, buttonStyle, null, (sls) Q, wwg.S(1822152998, true, new ttk0(utk0Var, i3), btsVar), btsVar, 1576320, 16);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) utk0Var, (Object) f530Var2, tlsVar, i, 9);
        }
    }

    public static final boolean c(int i) {
        return i == 1 || i == 2;
    }

    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int k = qqa1.k(obj);
        int i4 = k & i;
        int e = e(i4, obj3);
        if (e != 0) {
            int i5 = ~i;
            int i6 = k & i5;
            int i7 = -1;
            while (true) {
                i2 = e - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !cza1.c(obj, objArr[i2]) || (objArr2 != null && !cza1.c(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    e = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                g(i4, i9, obj3);
                return i2;
            }
            iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            return i2;
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object f(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ny61.g(oyr.i(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void g(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
