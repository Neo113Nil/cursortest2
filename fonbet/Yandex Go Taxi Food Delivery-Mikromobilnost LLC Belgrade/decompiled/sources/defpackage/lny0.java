package defpackage;

import androidx.compose.material.TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class lny0 {
    public static final void a(int i, int i2, int i3, int i4, fid fidVar, tls tlsVar, final wls wlsVar, final wls wlsVar2, final wls wlsVar3, xjx xjxVar, lkx lkxVar, f530 f530Var, zx40 zx40Var, final ehr0 ehr0Var, jmy0 jmy0Var, final hoy0 hoy0Var, ety0 ety0Var, final gy31 gy31Var, final boolean z, final boolean z2, final boolean z3) {
        int i5;
        int i6;
        int i7;
        bts btsVar;
        int i8;
        jmy0 jmy0Var2;
        int i9;
        zx40 zx40Var2;
        int i10;
        long j;
        zx40 zx40Var3;
        tls a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1470183117);
        if ((i3 & 6) == 0) {
            i5 = (btsVar2.k(hoy0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar2.a(false) ? 16384 : 8192;
        }
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            i5 |= btsVar2.k(ety0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= btsVar2.e(wlsVar) ? 1048576 : 524288;
        }
        int i11 = i3 & 12582912;
        int i12 = SelfTester_JCP.ENCRYPT_CBC;
        if (i11 == 0) {
            i5 |= btsVar2.e(wlsVar2) ? 8388608 : 4194304;
        }
        int i13 = i3 & 100663296;
        int i14 = SelfTester_JCP.DECRYPT_CFB;
        if (i13 == 0) {
            i6 = 1572864;
            i5 |= btsVar2.e(null) ? 67108864 : 33554432;
        } else {
            i6 = 1572864;
        }
        int i15 = i3 & 805306368;
        int i16 = SelfTester_JCP.IMITA;
        if (i15 == 0) {
            i5 |= btsVar2.e(wlsVar3) ? 536870912 : 268435456;
        }
        int i17 = i5;
        if ((i4 & 6) == 0) {
            i7 = i4 | (btsVar2.a(z2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= btsVar2.k(gy31Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= btsVar2.k(lkxVar) ? 256 : 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i7 |= btsVar2.k(xjxVar) ? 2048 : 1024;
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i7 |= btsVar2.a(z3) ? 16384 : 8192;
        }
        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
            i7 |= btsVar2.c(i) ? 131072 : 65536;
        }
        int i18 = i7 | i6;
        if ((i4 & 12582912) == 0) {
            if (btsVar2.k(zx40Var)) {
                i12 = 8388608;
            }
            i18 |= i12;
        }
        if ((i4 & 100663296) == 0) {
            if (btsVar2.k(ehr0Var)) {
                i14 = 67108864;
            }
            i18 |= i14;
        }
        if ((i4 & 805306368) == 0) {
            if (btsVar2.k(jmy0Var)) {
                i16 = 536870912;
            }
            i18 |= i16;
        }
        int i19 = i18;
        if (btsVar2.V(i17 & 1, ((i17 & 306783379) == 306783378 && (i19 & 306783379) == 306783378) ? false : true)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                i9 = 1;
            } else {
                btsVar2.Y();
                i9 = i2;
            }
            btsVar2.u();
            if (zx40Var == null) {
                btsVar2.e0(1852274984);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar2);
                }
                btsVar2.t(false);
                zx40Var2 = (zx40) Q;
            } else {
                btsVar2.e0(198297487);
                btsVar2.t(false);
                zx40Var2 = zx40Var;
            }
            btsVar2.e0(198303233);
            long b = ety0Var.b();
            if (b != 16) {
                i10 = i9;
                j = b;
            } else {
                i10 = i9;
                j = ((ldc) ((dmh) jmy0Var).b(z, btsVar2).getValue()).a;
            }
            btsVar2.t(false);
            ety0 d = ety0Var.d(new ety0(j, 0L, null, null, null, null, 0L, 0, 0L, null, null, 16777214));
            float f = 2.0f;
            float f2 = 1.0f;
            if (m.b) {
                zx40Var3 = zx40Var2;
                a = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z2, zx40Var3, jmy0Var, 2.0f, 1.0f);
            } else {
                zx40Var3 = zx40Var2;
                a = m.a();
            }
            f530 a2 = b.a(f530Var, a, new lmy0(z, z2, zx40Var3, jmy0Var, f, f2));
            String b2 = whb1.b(btsVar2);
            if (z2) {
                a2 = fnq0.b(a2, false, new g8r0(b2, 19));
            }
            final dmh dmhVar = (dmh) jmy0Var;
            btsVar = btsVar2;
            final zx40 zx40Var4 = zx40Var3;
            int i20 = i19 << 12;
            int i21 = i10;
            ne5.a(hoy0Var, tlsVar, ljs0.a(a2, 280.0f, 56.0f), z, false, d, lkxVar, xjxVar, z3, i, i21, gy31Var, null, zx40Var3, new a6t0(((ldc) dmhVar.a(z2, btsVar2).getValue()).a), wwg.S(1565379926, true, new zls() { // from class: fny0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wls wlsVar4 = (wls) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= fidVar2.e(wlsVar4) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                        omy0.a.d(hoy0.this.a.b, wlsVar4, z, z3, gy31Var, zx40Var4, z2, wlsVar, wlsVar2, null, wlsVar3, ehr0Var, dmhVar, null, btsVar3, (intValue << 3) & 112, 8192);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, (i17 & 64638) | (3670016 & i20) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i19 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i19 & 112), 4096);
            jmy0Var2 = dmhVar;
            i8 = i21;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i8 = i2;
            jmy0Var2 = jmy0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new eny0(hoy0Var, tlsVar, f530Var, z, ety0Var, wlsVar, wlsVar2, wlsVar3, z2, gy31Var, lkxVar, xjxVar, z3, i, i8, zx40Var, ehr0Var, jmy0Var2, i3, i4);
        }
    }

    public static final void b(final String str, final tls tlsVar, final f530 f530Var, final boolean z, final boolean z2, final ety0 ety0Var, final wls wlsVar, final wls wlsVar2, final boolean z3, final gy31 gy31Var, final lkx lkxVar, final xjx xjxVar, final boolean z4, final int i, int i2, final zx40 zx40Var, final ehr0 ehr0Var, final dmh dmhVar, fid fidVar, final int i3, final int i4) {
        int i5;
        int i6;
        bts btsVar;
        final int i7;
        int i8;
        zx40 zx40Var2;
        int i9;
        long j;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(179130848);
        if ((i3 & 6) == 0) {
            i5 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar2.a(z2) ? 16384 : 8192;
        }
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            i5 |= btsVar2.k(ety0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= btsVar2.e(wlsVar) ? 1048576 : 524288;
        }
        int i10 = i3 & 12582912;
        int i11 = SelfTester_JCP.ENCRYPT_CBC;
        if (i10 == 0) {
            i5 |= btsVar2.e(wlsVar2) ? 8388608 : 4194304;
        }
        int i12 = i3 & 100663296;
        int i13 = SelfTester_JCP.DECRYPT_CFB;
        if (i12 == 0) {
            i5 |= btsVar2.e(null) ? 67108864 : 33554432;
        }
        int i14 = i3 & 805306368;
        int i15 = SelfTester_JCP.IMITA;
        if (i14 == 0) {
            i5 |= btsVar2.e(null) ? 536870912 : 268435456;
        }
        int i16 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (btsVar2.a(z3) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= btsVar2.k(gy31Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= btsVar2.k(lkxVar) ? 256 : 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar2.k(xjxVar) ? 2048 : 1024;
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i6 |= btsVar2.a(z4) ? 16384 : 8192;
        }
        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
            i6 |= btsVar2.c(i) ? 131072 : 65536;
        }
        int i17 = i6 | 1572864;
        if ((i4 & 12582912) == 0) {
            if (btsVar2.k(zx40Var)) {
                i11 = 8388608;
            }
            i17 |= i11;
        }
        if ((i4 & 100663296) == 0) {
            if (btsVar2.k(ehr0Var)) {
                i13 = 67108864;
            }
            i17 |= i13;
        }
        if ((i4 & 805306368) == 0) {
            if (btsVar2.k(dmhVar)) {
                i15 = 536870912;
            }
            i17 |= i15;
        }
        int i18 = i17;
        if (btsVar2.V(i16 & 1, ((i16 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) ? false : true)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                i8 = 1;
            } else {
                btsVar2.Y();
                i8 = i2;
            }
            btsVar2.u();
            if (zx40Var == null) {
                btsVar2.e0(2138724187);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar2);
                }
                btsVar2.t(false);
                zx40Var2 = (zx40) Q;
            } else {
                btsVar2.e0(346085116);
                btsVar2.t(false);
                zx40Var2 = zx40Var;
            }
            btsVar2.e0(346090862);
            long b = ety0Var.b();
            if (b != 16) {
                i9 = i8;
                j = b;
            } else {
                i9 = i8;
                j = ((ldc) dmhVar.b(z, btsVar2).getValue()).a;
            }
            btsVar2.t(false);
            ety0 d = ety0Var.d(new ety0(j, 0L, null, null, null, null, 0L, 0, 0L, null, null, 16777214));
            zx40 zx40Var3 = zx40Var2;
            f530 a = b.a(f530Var, m.b ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z3, zx40Var3, dmhVar, 2.0f, 1.0f) : m.a(), new lmy0(z, z3, zx40Var3, dmhVar, 2.0f, 1.0f));
            String b2 = whb1.b(btsVar2);
            if (z3) {
                a = fnq0.b(a, false, new g8r0(b2, 19));
            }
            btsVar = btsVar2;
            int i19 = i18 << 12;
            int i20 = i9;
            ne5.b(str, tlsVar, ljs0.a(a, 280.0f, 56.0f), z, z2, d, lkxVar, xjxVar, z4, i, i20, gy31Var, null, zx40Var3, new a6t0(((ldc) dmhVar.a(z3, btsVar2).getValue()).a), wwg.S(-83351293, true, new gny0(str, z, z4, gy31Var, zx40Var3, z3, wlsVar, wlsVar2, ehr0Var, dmhVar), btsVar), btsVar, (i16 & 64638) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), ((i18 >> 18) & 14) | ImageMetadata.EDGE_MODE | (i18 & 112), 4096);
            i7 = i20;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i7 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: jny0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i3 | 1);
                    int O2 = vng.O(i4);
                    lny0.b(str, tlsVar, f530Var, z, z2, ety0Var, wlsVar, wlsVar2, z3, gy31Var, lkxVar, xjxVar, z4, i, i7, zx40Var, ehr0Var, dmhVar, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(final f530 f530Var, wls wlsVar, wls wlsVar2, zls zlsVar, final wls wlsVar3, final wls wlsVar4, final boolean z, final float f, j690 j690Var, fid fidVar, final int i) {
        int i2;
        wls wlsVar5;
        zls zlsVar2;
        uo5 uo5Var;
        boolean z2;
        boolean z3;
        uo5 uo5Var2;
        boolean z4;
        final wls wlsVar6 = wlsVar;
        final j690 j690Var2 = j690Var;
        uo5 uo5Var3 = x4c.b;
        uo5 uo5Var4 = x4c.y;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1595074580);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(zlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(wlsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(wlsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.a(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i2 |= btsVar.k(j690Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z5 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object Q = btsVar.Q();
            if (z5 || Q == did.a) {
                Q = new rny0(z, f, j690Var2);
                btsVar.o0(Q);
            }
            rny0 rny0Var = (rny0) Q;
            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            int i3 = i2;
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar7 = d.f;
            qje.W(btsVar, wlsVar7, rny0Var);
            wls wlsVar8 = d.e;
            qje.W(btsVar, wlsVar8, o);
            wls wlsVar9 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar9);
            }
            wls wlsVar10 = d.d;
            qje.W(btsVar, wlsVar10, d);
            c530 c530Var = c530.a;
            if (wlsVar3 != null) {
                btsVar.e0(-1444611617);
                f530 h = pj91.h(c530Var, "Leading");
                a7u0 a7u0Var = j8w.a;
                f530 k = h.k(ni20.a);
                uo5Var = uo5Var3;
                z910 d2 = pi6.d(uo5Var4, false);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar7, d2);
                qje.W(btsVar, wlsVar8, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar, S2, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d3);
                z2 = false;
                qv10.A((i3 >> 12) & 14, wlsVar3, btsVar, true, false);
            } else {
                uo5Var = uo5Var3;
                z2 = false;
                btsVar.e0(-1444365601);
                btsVar.t(false);
            }
            if (wlsVar4 != null) {
                btsVar.e0(-1444322883);
                f530 h2 = pj91.h(c530Var, "Trailing");
                a7u0 a7u0Var2 = j8w.a;
                f530 k2 = h2.k(ni20.a);
                z910 d4 = pi6.d(uo5Var4, z2);
                int S3 = cma1.S(btsVar);
                r1b0 o3 = btsVar.o();
                f530 d5 = b.d(btsVar, k2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar7, d4);
                qje.W(btsVar, wlsVar8, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d5);
                qv10.A((i3 >> 15) & 14, wlsVar4, btsVar, true, false);
            } else {
                btsVar.e0(-1444074945);
                btsVar.t(z2);
            }
            j690Var2 = j690Var;
            float f2 = an91.f(j690Var2, layoutDirection);
            float e = an91.e(j690Var2, layoutDirection);
            if (wlsVar3 != null) {
                f2 -= 12.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
            }
            float f3 = f2;
            if (wlsVar4 != null) {
                e -= 12.0f;
                if (e < 0.0f) {
                    e = 0.0f;
                }
            }
            f530 o4 = an91.o(c530Var, f3, 0.0f, e, 0.0f, 10);
            if (zlsVar != null) {
                btsVar.e0(-1443222972);
                zlsVar2 = zlsVar;
                zlsVar2.invoke(pj91.h(c530Var, "Hint").k(o4), btsVar, Integer.valueOf((i3 >> 6) & 112));
                z3 = false;
                btsVar.t(false);
            } else {
                zlsVar2 = zlsVar;
                z3 = false;
                btsVar.e0(-1443135521);
                btsVar.t(false);
            }
            if (wlsVar2 != null) {
                btsVar.e0(-1443101018);
                f530 k3 = pj91.h(c530Var, "Label").k(o4);
                uo5Var2 = uo5Var;
                z910 d6 = pi6.d(uo5Var2, z3);
                int S4 = cma1.S(btsVar);
                r1b0 o5 = btsVar.o();
                f530 d7 = b.d(btsVar, k3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar7, d6);
                qje.W(btsVar, wlsVar8, o5);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S4))) {
                    b64.z(S4, btsVar, S4, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d7);
                wlsVar5 = wlsVar2;
                z4 = true;
                qv10.A((i3 >> 6) & 14, wlsVar5, btsVar, true, false);
            } else {
                wlsVar5 = wlsVar2;
                uo5Var2 = uo5Var;
                z4 = true;
                btsVar.e0(-1443015489);
                btsVar.t(z3);
            }
            f530 k4 = pj91.h(c530Var, "TextField").k(o4);
            z910 d8 = pi6.d(uo5Var2, z4);
            int S5 = cma1.S(btsVar);
            r1b0 o6 = btsVar.o();
            f530 d9 = b.d(btsVar, k4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar7, d8);
            qje.W(btsVar, wlsVar8, o6);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S5))) {
                b64.z(S5, btsVar, S5, wlsVar9);
            }
            qje.W(btsVar, wlsVar10, d9);
            wlsVar6 = wlsVar;
            qv10.A((i3 >> 3) & 14, wlsVar6, btsVar, true, true);
        } else {
            wlsVar5 = wlsVar2;
            zlsVar2 = zlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final wls wlsVar11 = wlsVar5;
            final zls zlsVar3 = zlsVar2;
            v.d = new wls() { // from class: kny0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    lny0.c(f530.this, wlsVar6, wlsVar11, zlsVar3, wlsVar3, wlsVar4, z, f, j690Var2, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final int d(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, j690 j690Var) {
        float f2 = 2.0f * f;
        float d = j690Var.d() * f;
        float a = j690Var.a() * f;
        int max = Math.max(i, i5);
        return p8e.f(Math.max(m810.b(z ? i2 + f2 + max + a : d + max + a), Math.max(i3, i4)), j);
    }
}
