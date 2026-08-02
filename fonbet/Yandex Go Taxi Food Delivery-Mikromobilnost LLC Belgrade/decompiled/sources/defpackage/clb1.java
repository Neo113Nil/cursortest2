package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.messaging.MessengerEnvironment;
import java.math.BigDecimal;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public abstract class clb1 {
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, final boolean z, boolean z2, wfz wfzVar, iib iibVar, long j, long j2, long j3, final tls tlsVar, pa90 pa90Var, int i, fid fidVar, final int i2, final int i3) {
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        iib iibVar2;
        long j4;
        int i7;
        char c;
        bts btsVar;
        final wfz wfzVar2;
        final f530 f530Var3;
        final iib iibVar3;
        final boolean z4;
        final long j5;
        final long j6;
        final long j7;
        final pa90 pa90Var2;
        final int i8;
        aii0 v;
        wfz wfzVar3;
        long f;
        long g;
        int i9;
        long j8;
        pa90 pa90Var3;
        int i10;
        int i11;
        pa90 pa90Var4;
        long b;
        boolean z5;
        long j9;
        int i12;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-12710325);
        dmw0 dmw0Var = btsVar2.a;
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
            f530Var2 = f530Var;
        } else if ((i2 & 6) == 0) {
            f530Var2 = f530Var;
            i4 = (btsVar2.k(f530Var2) ? 4 : 2) | i2;
        } else {
            f530Var2 = f530Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.a(z) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            z3 = z2;
            i4 |= btsVar2.a(z3) ? 256 : 128;
            i5 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            i6 = i3 & 16;
            if (i6 == 0) {
                i5 = i4 | 27648;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                iibVar2 = iibVar;
                i5 |= btsVar2.k(iibVar2) ? 16384 : 8192;
                if ((196608 & i2) == 0) {
                    i5 |= 65536;
                }
                if ((1572864 & i2) == 0) {
                    i5 |= 524288;
                }
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        j4 = j3;
                        if (btsVar2.d(j4)) {
                            i12 = SelfTester_JCP.ENCRYPT_CNT;
                            i5 |= i12;
                        }
                    } else {
                        j4 = j3;
                    }
                    i12 = SelfTester_JCP.ENCRYPT_CBC;
                    i5 |= i12;
                } else {
                    j4 = j3;
                }
                if ((i2 & 100663296) == 0) {
                    i5 |= btsVar2.e(tlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= btsVar2.e(pa90Var) ? 536870912 : SelfTester_JCP.IMITA;
                }
                if ((i3 & 1024) != 0 && btsVar2.c(i)) {
                    c = 4;
                    if (btsVar2.V(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
                        btsVar2.a0();
                        int i15 = i2 & 1;
                        c530 c530Var = c530.a;
                        pa90 pa90Var5 = null;
                        if (i15 == 0 || btsVar2.C()) {
                            if (i13 != 0) {
                                f530Var2 = c530Var;
                            }
                            if (i14 != 0) {
                                z3 = true;
                            }
                            wfzVar3 = wfz.A;
                            if (i6 != 0) {
                                iibVar2 = iib.c;
                            }
                            a7u0 a7u0Var = gl51.a;
                            f = ((el51) btsVar2.m(a7u0Var)).f();
                            g = ((el51) btsVar2.m(a7u0Var)).g();
                            int i16 = i5 & (-4128769);
                            if ((i3 & 128) != 0) {
                                j8 = ((el51) btsVar2.m(a7u0Var)).p();
                                i9 = i5 & (-33488897);
                            } else {
                                i9 = i16;
                                j8 = j4;
                            }
                            pa90Var3 = i7 != 0 ? null : pa90Var;
                            if ((i3 & 1024) != 0) {
                                i10 = i9;
                                i11 = 1;
                            } else {
                                i10 = i9;
                                i11 = i;
                            }
                        } else {
                            btsVar2.Y();
                            int i17 = i5 & (-4128769);
                            if ((i3 & 128) != 0) {
                                i17 = i5 & (-33488897);
                            }
                            f = j;
                            g = j2;
                            pa90Var3 = pa90Var;
                            i11 = i;
                            i10 = i17;
                            j8 = j4;
                            wfzVar3 = wfzVar;
                        }
                        btsVar2.u();
                        float f2 = z3 ? 1.0f : 0.5f;
                        if (z) {
                            pa90Var4 = pa90Var3;
                            b = f;
                        } else {
                            pa90Var4 = pa90Var3;
                            b = ldc.b(ldc.b, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                        }
                        f530 g2 = bb1.g(c530Var, new kib(g, ((el51) btsVar2.m(gl51.a)).m(), iibVar2.a));
                        f530 b2 = tra1.b(f530Var2, f2);
                        wfz wfzVar4 = wfzVar3;
                        z910 d = pi6.d(x4c.b, false);
                        int i18 = i10;
                        boolean z6 = z3;
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, b2);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        f530 f530Var4 = f530Var2;
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar2, wlsVar, d);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar2, wlsVar2, o);
                        wls wlsVar3 = d.g;
                        long j10 = j8;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                        }
                        wls wlsVar4 = d.d;
                        qje.W(btsVar2, wlsVar4, d2);
                        f530 b3 = m4m0.b(ymb1.l(c530Var, (ehr0) ((wls) iibVar2.b).invoke(btsVar2, 0)), b, qke.q);
                        boolean z7 = !z;
                        boolean k = btsVar2.k(g2);
                        Object Q = btsVar2.Q();
                        if (k || Q == did.a) {
                            Q = new od9(22, g2);
                            btsVar2.o0(Q);
                        }
                        f530 w = r5a1.w(rx21.c(b3, z7, (tls) Q), z, z6, new awk0(i11), tlsVar, 8);
                        wfzVar4.getClass();
                        f530 m = ljs0.m(w, 32.0f);
                        z910 d3 = pi6.d(x4c.y, false);
                        int hashCode2 = Long.hashCode(btsVar2.T);
                        r1b0 o2 = btsVar2.o();
                        f530 d4 = b.d(btsVar2, m);
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, d3);
                        qje.W(btsVar2, wlsVar2, o2);
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                            b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
                        }
                        qje.W(btsVar2, wlsVar4, d4);
                        if (z) {
                            btsVar2.e0(-1153676636);
                            z5 = false;
                            pa90Var5 = mt71.m(wzg0.ic_checkmark, 0, btsVar2);
                            btsVar2.t(false);
                        } else {
                            z5 = false;
                            if (z6) {
                                btsVar2.e0(-1404125530);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(-1153674298);
                                btsVar2.t(false);
                                pa90Var5 = pa90Var4;
                            }
                        }
                        if (pa90Var5 == null) {
                            btsVar2.e0(-1404072303);
                            btsVar2.t(z5);
                            j9 = j10;
                            btsVar = btsVar2;
                        } else {
                            btsVar2.e0(-1404072302);
                            q4v.b(pa90Var5, null, ljs0.m(c530Var, 24.0f), j10, btsVar2, ((i18 >> 12) & 7168) | 48, 0);
                            j9 = j10;
                            btsVar = btsVar2;
                            btsVar.t(false);
                        }
                        btsVar.t(true);
                        btsVar.t(true);
                        i8 = i11;
                        iibVar3 = iibVar2;
                        z4 = z6;
                        j5 = j9;
                        f530Var3 = f530Var4;
                        j6 = f;
                        j7 = g;
                        pa90Var2 = pa90Var4;
                        wfzVar2 = wfzVar4;
                    } else {
                        btsVar = btsVar2;
                        btsVar.Y();
                        wfzVar2 = wfzVar;
                        f530Var3 = f530Var2;
                        iibVar3 = iibVar2;
                        z4 = z3;
                        j5 = j4;
                        j6 = j;
                        j7 = j2;
                        pa90Var2 = pa90Var;
                        i8 = i;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new wls() { // from class: jib
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i2 | 1);
                                clb1.a(f530.this, z, z4, wfzVar2, iibVar3, j6, j7, j5, tlsVar, pa90Var2, i8, (fid) obj, O, i3);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                c = 2;
                if (btsVar2.V(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            iibVar2 = iibVar;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            if ((i3 & 1024) != 0) {
                c = 4;
                if (btsVar2.V(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            c = 2;
            if (btsVar2.V(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z3 = z2;
        i5 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        iibVar2 = iibVar;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        c = 2;
        if (btsVar2.V(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static may0 b(Calendar calendar, zzs zzsVar) {
        double d = zzsVar.a;
        double d2 = zzsVar.b;
        c9v c9vVar = new c9v((byte) 0, 14);
        c9vVar.b = new BigDecimal(d);
        c9vVar.c = new BigDecimal(d2);
        hhs0 hhs0Var = new hhs0(3, c9vVar, calendar.getTimeZone());
        fc61 fc61Var = fc61.b;
        Calendar r = hhs0.r(hhs0Var.k(fc61Var, calendar, true), calendar);
        Calendar r2 = hhs0.r(hhs0Var.k(fc61Var, calendar, false), calendar);
        return (r == null || r2 == null) ? new may0(ThemeType.LIGHT, c(calendar).getTime()) : r.before(r2) ? (r.before(calendar) && calendar.before(r2)) ? new may0(ThemeType.LIGHT, r2.getTime()) : calendar.before(r) ? new may0(ThemeType.DARK, r.getTime()) : new may0(ThemeType.DARK, c(calendar).getTime()) : (r2.before(calendar) && calendar.before(r)) ? new may0(ThemeType.DARK, r.getTime()) : calendar.before(r2) ? new may0(ThemeType.LIGHT, r2.getTime()) : new may0(ThemeType.LIGHT, c(calendar).getTime());
    }

    public static Calendar c(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(5, 1);
        return calendar2;
    }

    public static final boolean d(MessengerEnvironment messengerEnvironment) {
        switch (n120.a[messengerEnvironment.ordinal()]) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            default:
                w511.b();
                break;
        }
        return false;
    }
}
