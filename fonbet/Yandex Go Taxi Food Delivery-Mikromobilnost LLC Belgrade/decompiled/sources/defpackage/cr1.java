package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class cr1 {
    public static final l690 a = new l690(24.0f, 24.0f, 24.0f, 24.0f);
    public static final l690 b;
    public static final l690 c;
    public static final qwd d;

    static {
        an91.d(0.0f, 0.0f, 0.0f, 16.0f, 7);
        b = an91.d(0.0f, 0.0f, 0.0f, 16.0f, 7);
        c = an91.d(0.0f, 0.0f, 0.0f, 24.0f, 7);
        d = new qwd(new ro1(3));
    }

    public static final void a(final a aVar, f530 f530Var, final wls wlsVar, final wls wlsVar2, final ehr0 ehr0Var, final long j, final long j2, final long j3, final long j4, final long j5, fid fidVar, final int i) {
        final f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1378716401);
        int i2 = i | 48 | (btsVar.e(null) ? 256 : 128) | (btsVar.e(wlsVar) ? 2048 : 1024) | (btsVar.e(wlsVar2) ? 16384 : 8192) | (btsVar.k(ehr0Var) ? 131072 : 65536) | (btsVar.d(j) ? 1048576 : 524288) | (btsVar.b(0.0f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.d(j2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.d(j3) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i2 & 1, ((306783379 & i2) == 306783378 && (((btsVar.d(j5) ? HexString.CHAR_SPACE : (char) 16) | (btsVar.d(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            a S = wwg.S(-652798794, true, new wls(wlsVar2, j3, j4, j5, j2, aVar) { // from class: zq1
                public final /* synthetic */ wls b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ a y;

                {
                    this.c = j4;
                    this.w = j5;
                    this.x = j2;
                    this.y = aVar;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
                    dmw0 dmw0Var = btsVar2.a;
                    if (V) {
                        f530 j6 = an91.j(c530.a, cr1.a);
                        sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                        int S2 = cma1.S(btsVar2);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, j6);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
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
                        wls wlsVar3 = d.f;
                        qje.W(btsVar2, wlsVar3, a2);
                        wls wlsVar4 = d.e;
                        qje.W(btsVar2, wlsVar4, o);
                        wls wlsVar5 = d.g;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                            b64.z(S2, btsVar2, S2, wlsVar5);
                        }
                        wls wlsVar6 = d.d;
                        qje.W(btsVar2, wlsVar6, d2);
                        btsVar2.e0(346092326);
                        btsVar2.t(false);
                        wls wlsVar7 = wls.this;
                        if (wlsVar7 == null) {
                            btsVar2.e0(346396529);
                        } else {
                            btsVar2.e0(346396530);
                            oaa1.b(this.c, eq11.a(efj.e, btsVar2), wwg.S(71284337, true, new cp1(wlsVar7, 1), btsVar2), btsVar2, 384);
                        }
                        btsVar2.t(false);
                        wls wlsVar8 = this.b;
                        if (wlsVar8 == null) {
                            btsVar2.e0(347174009);
                        } else {
                            btsVar2.e0(347174010);
                            oaa1.b(this.w, eq11.a(efj.g, btsVar2), wwg.S(705583346, true, new cp1(wlsVar8, 2), btsVar2), btsVar2, 384);
                        }
                        btsVar2.t(false);
                        ypu ypuVar = new ypu(x4c.I);
                        z910 d3 = pi6.d(x4c.b, false);
                        int S3 = cma1.S(btsVar2);
                        r1b0 o2 = btsVar2.o();
                        f530 d4 = b.d(btsVar2, ypuVar);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar3, d3);
                        qje.W(btsVar2, wlsVar4, o2);
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S3))) {
                            b64.z(S3, btsVar2, S3, wlsVar5);
                        }
                        qje.W(btsVar2, wlsVar6, d4);
                        oaa1.b(this.x, eq11.a(efj.b, btsVar2), this.y, btsVar2, 0);
                        btsVar2.t(true);
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & HProv.ALG_CLASS_ALL);
            c530 c530Var = c530.a;
            mnw0.a(c530Var, ehr0Var, j, 0L, 0.0f, 0.0f, S, btsVar, i4, 104);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f530Var2, wlsVar, wlsVar2, ehr0Var, j, j2, j3, j4, j5, i) { // from class: ar1
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ long C;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ wls c;
                public final /* synthetic */ wls w;
                public final /* synthetic */ ehr0 x;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(7);
                    cr1.a(a.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(float f, a aVar, fid fidVar, int i) {
        LayoutDirection layoutDirection;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-917637668);
        int i2 = (btsVar.b(f) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            a7u0 a7u0Var = j.n;
            LayoutDirection layoutDirection2 = (LayoutDirection) btsVar.m(a7u0Var);
            int i3 = br1.a[layoutDirection2.ordinal()];
            if (i3 == 1) {
                layoutDirection = LayoutDirection.Rtl;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                layoutDirection = LayoutDirection.Ltr;
            }
            sb2.b(a7u0Var.a(layoutDirection), wwg.S(-1986402020, true, new wq1(f, layoutDirection2, aVar), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xq1(f, aVar, i);
        }
    }

    public static final void c(final sls slsVar, final a aVar, final f530 f530Var, final wls wlsVar, final wls wlsVar2, final ehr0 ehr0Var, final long j, final long j2, final long j3, final long j4, final sej sejVar, fid fidVar, final int i, final int i2) {
        int i3;
        a aVar2;
        wls wlsVar3;
        wls wlsVar4;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-867616355);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aVar2 = aVar;
            i3 |= btsVar.e(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(null) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            wlsVar3 = wlsVar;
            i3 |= btsVar.e(wlsVar3) ? 131072 : 65536;
        } else {
            wlsVar3 = wlsVar;
        }
        if ((1572864 & i) == 0) {
            wlsVar4 = wlsVar2;
            i3 |= btsVar.e(wlsVar4) ? 1048576 : 524288;
        } else {
            wlsVar4 = wlsVar2;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar.k(ehr0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i5 = i3;
        if ((i & 100663296) == 0) {
            i5 |= btsVar.d(j) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i5 |= btsVar.d(j2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar.d(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.d(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= btsVar.b(0.0f) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.k(sejVar) ? 2048 : 1024;
        }
        int i7 = i4;
        if (btsVar.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            final a aVar3 = aVar2;
            final wls wlsVar5 = wlsVar3;
            final wls wlsVar6 = wlsVar4;
            d(slsVar, f530Var, sejVar, wwg.S(527420759, true, new wls() { // from class: vq1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        cr1.a(wwg.S(1367541877, true, new k2z0(aVar3, 1), btsVar2), null, wls.this, wlsVar6, ehr0Var, j, dgc.d(efj.a, btsVar2), j2, j3, j4, btsVar2, 6);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, (i6 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i6 >> 3) & 112) | ((i7 >> 3) & 896));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: yq1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    cr1.c(sls.this, aVar, f530Var, wlsVar, wlsVar2, ehr0Var, j, j2, j3, j4, sejVar, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void d(sls slsVar, f530 f530Var, sej sejVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(24925658);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(sejVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ((x6h) btsVar.m(d)).a(new m2v(slsVar, f530Var, sejVar, aVar), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(slsVar, f530Var, sejVar, aVar, i, 4);
        }
    }
}
