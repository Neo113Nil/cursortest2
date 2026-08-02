package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.mainscreen.superapp.popup.data.state.FallbackAssistanceAppearReason;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import yads.ub1;

/* loaded from: classes11.dex */
public abstract class aka1 {
    public static final void a(nvi0 nvi0Var, CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, f530 f530Var, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-697163052);
        int i2 = i | (btsVar.k(nvi0Var) ? 4 : 2) | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(wp2Var) ? 256 : 128) | (btsVar.k(wp2Var2) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT | (btsVar.e(slsVar) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530Var2 = c530.a;
            d17.b(f530Var2, true, (gz6) f.n(new gz6(wp2Var, wp2Var2), btsVar).getValue(), null, ButtonSize.S.getSize(), Float.POSITIVE_INFINITY, false, slsVar, wwg.S(1655684837, true, new u5(15, nvi0Var, charSequence), btsVar), btsVar, 102435894 | ((i2 << 6) & 29360128));
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(nvi0Var, charSequence, wp2Var, wp2Var2, f530Var2, slsVar, i);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, List list, boolean z) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(544729559);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 o = an91.o(c530.a, 0.0f, 8.0f, 0.0f, z ? 8.0f : 12.0f, 5);
            l690 d = an91.d(12.0f, 0.0f, 16.0f, 0.0f, 10);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new ss(list, tlsVar, i3);
                btsVar.o0(Q);
            }
            adb1.b(o, null, d, i43Var, null, null, false, null, (tls) Q, btsVar, 24960, 490);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ts(list, tlsVar, z, i, 0);
        }
    }

    public static final void c(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(390016846);
        int i2 = i | 6;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            b.a(ljs0.e(ljs0.q(c530Var, 98.0f), 40.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 0, 252);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(u4y u4yVar, final m0j0 m0j0Var, Integer num, f530 f530Var, boolean z, f530 f530Var2, a aVar, fid fidVar, int i) {
        int i2;
        a aVar2;
        f530 f530Var3;
        boolean z2;
        f530 f530Var4;
        f530 a;
        f530 f530Var5;
        int i3;
        boolean z3;
        f530 f530Var6;
        f530 a2;
        boolean z4;
        boolean z5;
        f530 a3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1951141903);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u4yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(m0j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(num) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 = 93184 | i2;
        }
        if ((1572864 & i) == 0) {
            aVar2 = aVar;
            i4 |= btsVar.e(aVar2) ? 1048576 : 524288;
        } else {
            aVar2 = aVar;
        }
        if (btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
            btsVar.a0();
            int i5 = i & 1;
            c530 c530Var = c530.a;
            if (i5 == 0 || btsVar.C()) {
                a = u4y.a(u4yVar, c530Var, 7);
                f530Var5 = c530Var;
                i3 = i4 & (-458753);
                z3 = true;
            } else {
                btsVar.Y();
                f530Var5 = f530Var;
                a = f530Var2;
                i3 = i4 & (-458753);
                z3 = z;
            }
            btsVar.u();
            Orientation f = m0j0Var.f();
            qxi d = f.d(new agc0(25, num, m0j0Var));
            boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
            o430 o430Var = did.a;
            if (booleanValue) {
                btsVar.e0(-1618516952);
                f530 g = s1a1.g(c530Var, 1.0f);
                int i6 = k0j0.a[f.ordinal()];
                if (i6 == 1) {
                    btsVar.e0(-1853321650);
                    boolean z6 = (i3 & 112) == 32;
                    Object Q = btsVar.Q();
                    if (z6 || Q == o430Var) {
                        z5 = false;
                        final Object[] objArr = 0 == true ? 1 : 0;
                        Q = new tls() { // from class: j0j0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i7 = objArr;
                                zy11 zy11Var = zy11.a;
                                m0j0 m0j0Var2 = m0j0Var;
                                m2k0 m2k0Var = (m2k0) obj;
                                switch (i7) {
                                    case 0:
                                        m2k0Var.G(Float.intBitsToFloat((int) (m0j0Var2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    case 1:
                                        m2k0Var.D(Float.intBitsToFloat((int) (m0j0Var2.e() >> 32)));
                                        break;
                                    case 2:
                                        m2k0Var.G(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    default:
                                        m2k0Var.D(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a >> 32)));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q);
                    } else {
                        z5 = false;
                    }
                    a3 = d.a(c530Var, (tls) Q);
                    btsVar.t(z5);
                } else {
                    if (i6 != 2) {
                        throw unr0.y(-1853323658, btsVar, false);
                    }
                    btsVar.e0(-1853316914);
                    boolean z7 = (i3 & 112) == 32;
                    Object Q2 = btsVar.Q();
                    if (z7 || Q2 == o430Var) {
                        final int i7 = 1;
                        Q2 = new tls() { // from class: j0j0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i72 = i7;
                                zy11 zy11Var = zy11.a;
                                m0j0 m0j0Var2 = m0j0Var;
                                m2k0 m2k0Var = (m2k0) obj;
                                switch (i72) {
                                    case 0:
                                        m2k0Var.G(Float.intBitsToFloat((int) (m0j0Var2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    case 1:
                                        m2k0Var.D(Float.intBitsToFloat((int) (m0j0Var2.e() >> 32)));
                                        break;
                                    case 2:
                                        m2k0Var.G(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    default:
                                        m2k0Var.D(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a >> 32)));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q2);
                    }
                    a3 = d.a(c530Var, (tls) Q2);
                    z5 = false;
                    btsVar.t(false);
                }
                f530Var6 = g.k(a3);
                btsVar.t(z5);
            } else if (num.equals(m0j0Var.r.getValue())) {
                btsVar.e0(-1618076628);
                f530 g2 = s1a1.g(c530Var, 1.0f);
                int i8 = k0j0.a[f.ordinal()];
                if (i8 == 1) {
                    btsVar.e0(-1853307460);
                    boolean z8 = (i3 & 112) == 32;
                    Object Q3 = btsVar.Q();
                    if (z8 || Q3 == o430Var) {
                        final int i9 = 2;
                        Q3 = new tls() { // from class: j0j0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i72 = i9;
                                zy11 zy11Var = zy11.a;
                                m0j0 m0j0Var2 = m0j0Var;
                                m2k0 m2k0Var = (m2k0) obj;
                                switch (i72) {
                                    case 0:
                                        m2k0Var.G(Float.intBitsToFloat((int) (m0j0Var2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    case 1:
                                        m2k0Var.D(Float.intBitsToFloat((int) (m0j0Var2.e() >> 32)));
                                        break;
                                    case 2:
                                        m2k0Var.G(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    default:
                                        m2k0Var.D(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a >> 32)));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q3);
                    }
                    a2 = d.a(c530Var, (tls) Q3);
                    z4 = false;
                    btsVar.t(false);
                } else {
                    if (i8 != 2) {
                        throw unr0.y(-1853309454, btsVar, false);
                    }
                    btsVar.e0(-1853302276);
                    boolean z9 = (i3 & 112) == 32;
                    Object Q4 = btsVar.Q();
                    if (z9 || Q4 == o430Var) {
                        final int i10 = 3;
                        Q4 = new tls() { // from class: j0j0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i72 = i10;
                                zy11 zy11Var = zy11.a;
                                m0j0 m0j0Var2 = m0j0Var;
                                m2k0 m2k0Var = (m2k0) obj;
                                switch (i72) {
                                    case 0:
                                        m2k0Var.G(Float.intBitsToFloat((int) (m0j0Var2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    case 1:
                                        m2k0Var.D(Float.intBitsToFloat((int) (m0j0Var2.e() >> 32)));
                                        break;
                                    case 2:
                                        m2k0Var.G(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                        break;
                                    default:
                                        m2k0Var.D(Float.intBitsToFloat((int) (((wu60) m0j0Var2.s.e()).a >> 32)));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q4);
                    }
                    a2 = d.a(c530Var, (tls) Q4);
                    z4 = false;
                    btsVar.t(false);
                }
                f530Var6 = g2.k(a2);
                btsVar.t(z4);
            } else {
                btsVar.e0(-1617663088);
                btsVar.t(false);
                f530Var6 = a;
            }
            z2 = z3;
            ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.d.a(m0j0Var, num, f530Var5.k(f530Var6), z2, ((Boolean) d.getValue()).booleanValue(), aVar2, btsVar, (i3 >> 3) & 466046);
            f530Var3 = f530Var5;
            f530Var4 = a;
        } else {
            btsVar.Y();
            f530Var3 = f530Var;
            z2 = z;
            f530Var4 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(u4yVar, m0j0Var, num, f530Var3, z2, f530Var4, aVar, i, 6);
        }
    }

    public static int e(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        ny61.g(iha1.f("Out of range: %s", Long.valueOf(j)));
        return 0;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof ub1) {
            return Arrays.copyOfRange((int[]) null, 0, 0);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int g(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final FallbackAssistanceAppearReason h(l9p l9pVar) {
        if (l9pVar instanceof j9p) {
            return FallbackAssistanceAppearReason.LoadingTimeout;
        }
        if ((l9pVar instanceof i9p) || (l9pVar instanceof k9p)) {
            return FallbackAssistanceAppearReason.ProductsErrorResponse;
        }
        w511.b();
        return null;
    }
}
