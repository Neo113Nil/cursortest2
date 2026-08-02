package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.nestedscroll.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.ajf0;
import defpackage.an91;
import defpackage.ay41;
import defpackage.bb1;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.dj6;
import defpackage.f530;
import defpackage.fid;
import defpackage.l690;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.m3u0;
import defpackage.pdb1;
import defpackage.scc;
import defpackage.tls;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class ay41 {
    public static final float a = 48.0f * 3.0f;

    public static final void a(String str, sls slsVar, long j, int i, boolean z, String str2, fid fidVar, int i2) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1394772784);
        int i3 = i2 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.d(j) ? 256 : 128) | (btsVar2.c(i) ? 2048 : 1024) | (btsVar2.a(z) ? 16384 : 8192) | (btsVar2.k(str2) ? 131072 : 65536);
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            f530 u = ljs0.u(ljs0.c(ljs0.e(c530.a, 48.0f), 1.0f), x4c.E, 2);
            boolean z2 = ((i3 & 14) == 4) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new rx3(z, str, str2, 23);
                btsVar2.o0(Q);
            }
            f530 b = fnq0.b(u, false, (tls) Q);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q2;
            awk0 awk0Var = new awk0(0);
            boolean z3 = (i3 & 112) == 32;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new n7l0(25, slsVar);
                btsVar2.o0(Q3);
            }
            btsVar = btsVar2;
            ymb1.e(str, q791.b(b, zx40Var, null, false, null, awk0Var, (sls) Q3, 12), j, null, null, null, 0L, 0L, 0L, new sjy0(i), 0, false, 0, null, null, btsVar, i3 & 910, (i3 >> 9) & 14, 64504);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b6x0(str, slsVar, j, i, z, str2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final f530 f530Var, final List list, int i, final tls tlsVar, final int i2, long j, long j2, long j3, long j4, String str, fid fidVar, final int i3, final int i4) {
        int i5;
        List list2;
        int i6;
        tls tlsVar2;
        int i7;
        int i8;
        String str2;
        final long j5;
        final long j6;
        final int i9;
        final String str3;
        final long j7;
        final long j8;
        aii0 v;
        final String str4;
        final long j9;
        final long j10;
        final long j11;
        final int i10;
        long j12;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-140483731);
        if ((i3 & 6) == 0) {
            i5 = (btsVar.k(f530Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            list2 = list;
            i5 |= btsVar.e(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        int i11 = i4 & 4;
        if (i11 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 = i;
            i5 |= btsVar.c(i6) ? 256 : 128;
            if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                tlsVar2 = tlsVar;
                i5 |= btsVar.e(tlsVar2) ? 2048 : 1024;
            } else {
                tlsVar2 = tlsVar;
            }
            if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                i7 = i2;
                i5 |= btsVar.c(i7) ? 16384 : 8192;
            } else {
                i7 = i2;
            }
            if ((196608 & i3) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i3) == 0) {
                i5 |= 524288;
            }
            if ((12582912 & i3) == 0) {
                i5 |= SelfTester_JCP.ENCRYPT_CBC;
            }
            if ((100663296 & i3) == 0) {
                i5 |= SelfTester_JCP.DECRYPT_CFB;
            }
            i8 = i4 & 512;
            if (i8 == 0) {
                i5 |= 805306368;
            } else if ((805306368 & i3) == 0) {
                str2 = str;
                i5 |= btsVar.k(str2) ? 536870912 : SelfTester_JCP.IMITA;
                if (btsVar.V(i5 & 1, (306783379 & i5) != 306783378)) {
                    btsVar.a0();
                    if ((i3 & 1) == 0 || btsVar.C()) {
                        if (i11 != 0) {
                            i6 = 0;
                        }
                        a7u0 a7u0Var = gl51.a;
                        long n = ((el51) btsVar.m(a7u0Var)).n();
                        long o = ((el51) btsVar.m(a7u0Var)).o();
                        long c = ((el51) btsVar.m(a7u0Var)).c();
                        long l = ((el51) btsVar.m(a7u0Var)).l();
                        str4 = i8 != 0 ? null : str2;
                        j9 = n;
                        j10 = o;
                        j11 = l;
                        i10 = i6;
                        j12 = c;
                    } else {
                        btsVar.Y();
                        j9 = j;
                        j10 = j2;
                        j11 = j4;
                        i10 = i6;
                        str4 = str2;
                        j12 = j3;
                    }
                    btsVar.u();
                    final boolean isEnabled = ((AccessibilityManager) ((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility")).isEnabled();
                    final List list3 = list2;
                    final long j13 = j12;
                    final tls tlsVar3 = tlsVar2;
                    final int i12 = i7;
                    xab1.a(b.a(m4m0.b(f530Var, j12, qke.q), zrb1.f(btsVar), null), x4c.y, wwg.S(1210994499, true, new zls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.control.f
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            dj6 dj6Var = (dj6) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                final androidx.compose.foundation.lazy.b a2 = a7y.a(i10, 2, btsVar2);
                                androidx.compose.foundation.gestures.snapping.a c2 = pdb1.c(a2, btsVar2);
                                Object Q = btsVar2.Q();
                                Object obj4 = did.a;
                                if (Q == obj4) {
                                    Q = androidx.compose.runtime.f.d(new vs9(a2, 24));
                                    btsVar2.o0(Q);
                                }
                                m3u0 m3u0Var = (m3u0) Q;
                                Object Q2 = btsVar2.Q();
                                if (Q2 == obj4) {
                                    Q2 = androidx.compose.runtime.f.d(new vs9(a2, 25));
                                    btsVar2.o0(Q2);
                                }
                                final m3u0 m3u0Var2 = (m3u0) Q2;
                                long j14 = j13;
                                boolean d = btsVar2.d(j14);
                                Object Q3 = btsVar2.Q();
                                if (d || Q3 == obj4) {
                                    Q3 = scc.g(new ldc(j14), new ldc(ldc.m));
                                    btsVar2.o0(Q3);
                                }
                                List list4 = (List) Q3;
                                Object Q4 = btsVar2.Q();
                                if (Q4 == obj4) {
                                    Q4 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                                    btsVar2.o0(Q4);
                                }
                                final tse tseVar = (tse) Q4;
                                Boolean bool = (Boolean) m3u0Var.getValue();
                                bool.getClass();
                                final List list5 = list3;
                                boolean e = btsVar2.e(list5);
                                tls tlsVar4 = tlsVar3;
                                boolean k = e | btsVar2.k(tlsVar4);
                                Object Q5 = btsVar2.Q();
                                if (k || Q5 == obj4) {
                                    Q5 = new WheelPickerKt$WheelPicker$2$1$1(list5, tlsVar4, m3u0Var, m3u0Var2, null);
                                    btsVar2.o0(Q5);
                                }
                                zpn.f(list5, bool, (wls) Q5, btsVar2);
                                f530 e2 = ljs0.e(ljs0.w(c530.a, 3), ay41.a);
                                float d2 = dj6Var.d();
                                final long j15 = j9;
                                f530 i13 = bb1.i(e2, new ajf0(list4, d2, j15, j11));
                                l690 b = an91.b(0.0f, 48.0f, 1);
                                boolean z = !isEnabled;
                                boolean e3 = btsVar2.e(list5) | btsVar2.d(j15);
                                final long j16 = j10;
                                boolean d3 = e3 | btsVar2.d(j16) | btsVar2.e(tseVar) | btsVar2.k(a2);
                                final int i14 = i12;
                                boolean c3 = d3 | btsVar2.c(i14);
                                final String str5 = str4;
                                boolean k2 = c3 | btsVar2.k(str5);
                                Object Q6 = btsVar2.Q();
                                if (k2 || Q6 == obj4) {
                                    Object obj5 = new tls() { // from class: yx41
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj6) {
                                            List list6 = list5;
                                            ((m6y) ((u6y) obj6)).f(list6.size(), null, new pcx0(list6, 12), new a(2039820996, new zx41(list6, j15, j16, tseVar, a2, i14, str5, m3u0Var2), true));
                                            return zy11.a;
                                        }
                                    };
                                    btsVar2.o0(obj5);
                                    Q6 = obj5;
                                }
                                adb1.a(i13, a2, b, null, null, c2, z, null, (tls) Q6, btsVar2, 384, 312);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 3120, 4);
                    i9 = i10;
                    j8 = j13;
                    j7 = j9;
                    j6 = j11;
                    j5 = j10;
                    str3 = str4;
                } else {
                    btsVar.Y();
                    j5 = j2;
                    j6 = j4;
                    i9 = i6;
                    str3 = str2;
                    j7 = j;
                    j8 = j3;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: xx41
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int O = vng.O(i3 | 1);
                            ay41.b(f530.this, list, i9, tlsVar, i2, j7, j5, j8, j6, str3, (fid) obj, O, i4);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            str2 = str;
            if (btsVar.V(i5 & 1, (306783379 & i5) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i6 = i;
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if ((196608 & i3) == 0) {
        }
        if ((1572864 & i3) == 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        if ((100663296 & i3) == 0) {
        }
        i8 = i4 & 512;
        if (i8 == 0) {
        }
        str2 = str;
        if (btsVar.V(i5 & 1, (306783379 & i5) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}
