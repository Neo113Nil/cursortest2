package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gub1 {
    public static au2 a;

    public static final void a(f530 f530Var, sa01 sa01Var, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        ldc ldcVar;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-347247595);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(sa01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            kdc kdcVar = sa01Var.b;
            if (kdcVar == null) {
                btsVar.e0(1723281998);
                btsVar.t(false);
                ldcVar = null;
            } else {
                btsVar.e0(1723281999);
                long d = rzo.d(s8o.m(kdcVar, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)));
                btsVar.t(false);
                ldcVar = new ldc(d);
            }
            if (ldcVar == null) {
                btsVar.e0(1302519132);
                j = tje.n(AppColor$Palette.BgFloating, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(1302515257);
                btsVar.t(false);
                j = ldcVar.a;
            }
            gz6 gz6Var = new gz6(new up2(j), AppColor$Palette.Text);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            slsVar2 = slsVar;
            d17.b(fnq0.a(f530Var, (tls) Q), true, gz6Var, null, sa01Var.c, Float.POSITIVE_INFINITY, false, slsVar2, wwg.S(-1457329370, true, new wg30(21, sa01Var), btsVar), btsVar, ((i2 << 15) & 29360128) | 102435888);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(f530Var, sa01Var, slsVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final List list, f530 f530Var, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, wls wlsVar, tls tlsVar5, b bVar, boolean z, final boolean z2, tls tlsVar6, boolean z3, fid fidVar, final int i, final int i2, final int i3) {
        f530 f530Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        tls tlsVar7;
        int i9;
        int i10;
        int i11;
        int i12;
        wls wlsVar2;
        int i13;
        int i14;
        tls tlsVar8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        bts btsVar;
        final tls tlsVar9;
        final tls tlsVar10;
        final tls tlsVar11;
        final boolean z4;
        final tls tlsVar12;
        final tls tlsVar13;
        final f530 f530Var3;
        final b bVar2;
        final tls tlsVar14;
        final wls wlsVar3;
        final boolean z5;
        aii0 v;
        tls tlsVar15;
        tls tlsVar16;
        tls tlsVar17;
        tls tlsVar18;
        b bVar3;
        int i23;
        tls tlsVar19;
        tls tlsVar20;
        tls tlsVar21;
        int i24;
        f530 f530Var4;
        final tls tlsVar22;
        final wls wlsVar4;
        boolean z6;
        b bVar4;
        tls tlsVar23;
        boolean z7;
        int i25;
        tls tlsVar24;
        tls tlsVar25;
        boolean z8;
        f530 b;
        Object obj;
        final boolean z9;
        final tls tlsVar26;
        final tls tlsVar27;
        boolean z10;
        bts btsVar2;
        final tls tlsVar28;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1703599930);
        int i26 = i | (btsVar3.k(list) ? 4 : 2);
        int i27 = i3 & 2;
        if (i27 != 0) {
            i26 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i26 |= btsVar3.k(f530Var2) ? 32 : 16;
            i4 = i3 & 4;
            if (i4 == 0) {
                i5 = i26 | 384;
            } else {
                i5 = i26 | (btsVar3.e(tlsVar) ? 256 : 128);
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i7 = i5 | HProv.ALG_TYPE_SECURECHANNEL;
            } else {
                i7 = i5 | (btsVar3.e(tlsVar2) ? 2048 : 1024);
            }
            i8 = i3 & 16;
            if (i8 == 0) {
                i9 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
                tlsVar7 = tlsVar3;
            } else {
                tlsVar7 = tlsVar3;
                i9 = i7 | (btsVar3.e(tlsVar7) ? 16384 : 8192);
            }
            i10 = i3 & 32;
            if (i10 == 0) {
                i11 = i9 | ImageMetadata.EDGE_MODE;
            } else {
                i11 = i9 | (btsVar3.e(tlsVar4) ? 131072 : 65536);
            }
            i12 = i3 & 64;
            if (i12 == 0) {
                i13 = i11 | 1572864;
                wlsVar2 = wlsVar;
            } else {
                wlsVar2 = wlsVar;
                i13 = i11 | (btsVar3.e(wlsVar2) ? 1048576 : 524288);
            }
            i14 = i3 & 128;
            if (i14 == 0) {
                i15 = i13 | 12582912;
                tlsVar8 = tlsVar5;
            } else {
                tlsVar8 = tlsVar5;
                i15 = i13 | (btsVar3.e(tlsVar8) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
            }
            int i28 = i15 | (((i3 & 256) == 0 || !btsVar3.k(bVar)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
            i16 = i3 & 512;
            if (i16 == 0) {
                i28 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i28 |= btsVar3.a(z) ? 536870912 : SelfTester_JCP.IMITA;
            }
            if ((i2 & 6) != 0) {
                i17 = i2 | (btsVar3.a(z2) ? 4 : 2);
            } else {
                i17 = i2;
            }
            i18 = i3 & 2048;
            if (i18 == 0) {
                i17 |= 48;
                i19 = i18;
            } else if ((i2 & 48) == 0) {
                i19 = i18;
                i17 |= btsVar3.e(tlsVar6) ? 32 : 16;
            } else {
                i19 = i18;
            }
            int i29 = i17;
            i20 = i28;
            i21 = i3 & 4096;
            if (i21 == 0) {
                i22 = i29 | 384;
            } else {
                i22 = i29 | (btsVar3.a(z3) ? 256 : 128);
            }
            if (btsVar3.V(i20 & 1, (i20 & 306783379) == 306783378 || (i22 & 147) != 146)) {
                btsVar = btsVar3;
                btsVar.Y();
                tlsVar9 = tlsVar;
                tlsVar10 = tlsVar2;
                tlsVar11 = tlsVar4;
                z4 = z;
                tlsVar12 = tlsVar6;
                tlsVar13 = tlsVar7;
                f530Var3 = f530Var2;
                bVar2 = bVar;
                tlsVar14 = tlsVar8;
                wlsVar3 = wlsVar2;
                z5 = z3;
            } else {
                btsVar3.a0();
                int i30 = i & 1;
                c530 c530Var = c530.a;
                Object obj2 = did.a;
                if (i30 == 0 || btsVar3.C()) {
                    if (i27 != 0) {
                        f530Var2 = c530Var;
                    }
                    if (i4 != 0) {
                        Object Q = btsVar3.Q();
                        if (Q == obj2) {
                            Q = new zp01(19);
                            btsVar3.o0(Q);
                        }
                        tlsVar15 = (tls) Q;
                    } else {
                        tlsVar15 = tlsVar;
                    }
                    if (i6 != 0) {
                        Object Q2 = btsVar3.Q();
                        if (Q2 == obj2) {
                            Q2 = new zp01(20);
                            btsVar3.o0(Q2);
                        }
                        tlsVar16 = (tls) Q2;
                    } else {
                        tlsVar16 = tlsVar2;
                    }
                    if (i8 != 0) {
                        Object Q3 = btsVar3.Q();
                        if (Q3 == obj2) {
                            Q3 = new zp01(21);
                            btsVar3.o0(Q3);
                        }
                        tlsVar7 = (tls) Q3;
                    }
                    if (i10 != 0) {
                        Object Q4 = btsVar3.Q();
                        if (Q4 == obj2) {
                            Q4 = new zp01(22);
                            btsVar3.o0(Q4);
                        }
                        tlsVar17 = (tls) Q4;
                    } else {
                        tlsVar17 = tlsVar4;
                    }
                    if (i12 != 0) {
                        Object Q5 = btsVar3.Q();
                        if (Q5 == obj2) {
                            Q5 = new jiz0(16);
                            btsVar3.o0(Q5);
                        }
                        wlsVar2 = (wls) Q5;
                    }
                    if (i14 != 0) {
                        Object Q6 = btsVar3.Q();
                        if (Q6 == obj2) {
                            Q6 = new zp01(23);
                            btsVar3.o0(Q6);
                        }
                        tlsVar18 = (tls) Q6;
                    } else {
                        tlsVar18 = tlsVar8;
                    }
                    if ((i3 & 256) != 0) {
                        bVar3 = a7y.a(0, 3, btsVar3);
                        i23 = i20 & (-234881025);
                    } else {
                        bVar3 = bVar;
                        i23 = i20;
                    }
                    boolean z11 = i16 != 0 ? true : z;
                    if (i19 != 0) {
                        Object Q7 = btsVar3.Q();
                        if (Q7 == obj2) {
                            tlsVar19 = tlsVar15;
                            Q7 = new zp01(24);
                            btsVar3.o0(Q7);
                        } else {
                            tlsVar19 = tlsVar15;
                        }
                        tlsVar20 = (tls) Q7;
                    } else {
                        tlsVar19 = tlsVar15;
                        tlsVar20 = tlsVar6;
                    }
                    int i31 = i23;
                    tlsVar21 = tlsVar20;
                    i24 = i31;
                    wls wlsVar5 = wlsVar2;
                    f530Var4 = f530Var2;
                    tlsVar22 = tlsVar17;
                    wlsVar4 = wlsVar5;
                    if (i21 != 0) {
                        bVar4 = bVar3;
                        tlsVar23 = tlsVar7;
                        z7 = z11;
                        i25 = 32;
                        z6 = true;
                    } else {
                        z6 = z3;
                        bVar4 = bVar3;
                        tlsVar23 = tlsVar7;
                        z7 = z11;
                        i25 = 32;
                    }
                    tlsVar24 = tlsVar18;
                    tlsVar25 = tlsVar19;
                } else {
                    btsVar3.Y();
                    if ((i3 & 256) != 0) {
                        i24 = i20 & (-234881025);
                        tls tlsVar29 = tlsVar7;
                        tlsVar24 = tlsVar8;
                        tlsVar23 = tlsVar29;
                        tlsVar25 = tlsVar;
                        tlsVar16 = tlsVar2;
                        bVar4 = bVar;
                        z7 = z;
                        tlsVar21 = tlsVar6;
                        z6 = z3;
                    } else {
                        tls tlsVar30 = tlsVar7;
                        tlsVar24 = tlsVar8;
                        tlsVar23 = tlsVar30;
                        tlsVar25 = tlsVar;
                        tlsVar16 = tlsVar2;
                        bVar4 = bVar;
                        z7 = z;
                        tlsVar21 = tlsVar6;
                        z6 = z3;
                        i24 = i20;
                    }
                    wlsVar4 = wlsVar2;
                    i25 = 32;
                    f530Var4 = f530Var2;
                    tlsVar22 = tlsVar4;
                }
                btsVar3.u();
                boolean z12 = z7;
                Object Q8 = btsVar3.Q();
                if (Q8 == obj2) {
                    Q8 = zpn.j(EmptyCoroutineContext.a, btsVar3);
                    btsVar3.o0(Q8);
                }
                Object obj3 = (tse) Q8;
                tls tlsVar31 = tlsVar25;
                z910 d = pi6.d(x4c.b, false);
                tls tlsVar32 = tlsVar16;
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar3, f530Var4);
                ohd.G1.getClass();
                tls tlsVar33 = tlsVar23;
                sls slsVar = d.b;
                tls tlsVar34 = tlsVar24;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, d);
                qje.W(btsVar3, d.e, o);
                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar3, d.h);
                qje.W(btsVar3, d.d, d2);
                int i32 = i24 & 14;
                int i33 = (i24 >> 21) & 112;
                dub1.a(list, bVar4, cj6.a.b(c530Var), z2, btsVar3, i32 | i33 | ((i22 << 9) & 7168));
                f530 f530Var5 = f530Var4;
                b bVar5 = bVar4;
                if (z2) {
                    btsVar3.e0(408319234);
                    btsVar3.t(false);
                    b = ljs0.c(c530Var, 1.0f);
                    z8 = false;
                } else {
                    btsVar3.e0(408382691);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean e = btsVar3.e(obj3) | ((((234881024 & i24) ^ 100663296) > 67108864 && btsVar3.k(bVar5)) || (i24 & 100663296) == 67108864);
                    Object Q9 = btsVar3.Q();
                    if (e || Q9 == obj2) {
                        Q9 = new dl01(12, obj3, bVar5);
                        btsVar3.o0(Q9);
                    }
                    z8 = false;
                    b = fnq0.b(c, false, (tls) Q9);
                    btsVar3.t(false);
                }
                f530 f530Var6 = b;
                final tls tlsVar35 = tlsVar21;
                i43 i43Var = new i43(4.0f, true, new quz(11));
                boolean z13 = ((i22 & 14) == 4 ? true : z8) | (i32 != 4 ? z8 : true) | ((1879048192 & i24) == 536870912 ? true : z8) | ((i24 & 896) == 256 ? true : z8) | ((i24 & 7168) == 2048 ? true : z8) | ((57344 & i24) == 16384 ? true : z8) | ((i24 & 29360128) == 8388608 ? true : z8) | ((458752 & i24) == 131072 ? true : z8) | ((i24 & 3670016) == 1048576 ? true : z8);
                if ((i22 & 112) == i25) {
                    z8 = true;
                }
                boolean z14 = z13 | z8;
                Object Q10 = btsVar3.Q();
                if (z14 || Q10 == obj2) {
                    z9 = z12;
                    tlsVar26 = tlsVar31;
                    tlsVar27 = tlsVar32;
                    tlsVar14 = tlsVar34;
                    z10 = true;
                    btsVar2 = btsVar3;
                    tlsVar28 = tlsVar33;
                    obj = new tls() { // from class: l711
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            jiz0 jiz0Var = new jiz0(15);
                            List list2 = list;
                            m6y m6yVar = (m6y) ((u6y) obj4);
                            m6yVar.f(list2.size(), new qmy0(2, jiz0Var, list2), new pcx0(list2, 6), new a(2039820996, new n711(list2, z9, list2, z2, tlsVar26, tlsVar27, tlsVar28, tlsVar14, tlsVar22, wlsVar4), true));
                            tlsVar35.invoke(m6yVar);
                            return zy11.a;
                        }
                    };
                    btsVar2.o0(obj);
                } else {
                    tlsVar26 = tlsVar31;
                    tlsVar27 = tlsVar32;
                    tlsVar14 = tlsVar34;
                    btsVar2 = btsVar3;
                    obj = Q10;
                    z10 = true;
                    z9 = z12;
                    tlsVar28 = tlsVar33;
                }
                bts btsVar4 = btsVar2;
                adb1.a(f530Var6, bVar5, null, i43Var, null, null, z6, null, (tls) obj, btsVar4, i33 | 100687872 | ((i22 << 15) & 29360128), 108);
                btsVar = btsVar4;
                btsVar.t(z10);
                wls wlsVar6 = wlsVar4;
                z4 = z9;
                tlsVar9 = tlsVar26;
                tlsVar13 = tlsVar28;
                wlsVar3 = wlsVar6;
                tlsVar12 = tlsVar35;
                tlsVar10 = tlsVar27;
                tlsVar11 = tlsVar22;
                bVar2 = bVar5;
                z5 = z6;
                f530Var3 = f530Var5;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: m711
                    @Override // defpackage.wls
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        int O = vng.O(i | 1);
                        int O2 = vng.O(i2);
                        gub1.b(list, f530Var3, tlsVar9, tlsVar10, tlsVar13, tlsVar11, wlsVar3, tlsVar14, bVar2, z4, z2, tlsVar12, z5, (fid) obj4, O, O2, i3);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        i10 = i3 & 32;
        if (i10 == 0) {
        }
        i12 = i3 & 64;
        if (i12 == 0) {
        }
        i14 = i3 & 128;
        if (i14 == 0) {
        }
        int i282 = i15 | (((i3 & 256) == 0 || !btsVar3.k(bVar)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
        i16 = i3 & 512;
        if (i16 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i18 = i3 & 2048;
        if (i18 == 0) {
        }
        int i292 = i17;
        i20 = i282;
        i21 = i3 & 4096;
        if (i21 == 0) {
        }
        if (btsVar3.V(i20 & 1, (i20 & 306783379) == 306783378 || (i22 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
