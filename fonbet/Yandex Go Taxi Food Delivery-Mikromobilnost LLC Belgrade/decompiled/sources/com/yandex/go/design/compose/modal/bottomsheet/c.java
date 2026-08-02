package com.yandex.go.design.compose.modal.bottomsheet;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.gestures.n;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a050;
import defpackage.a12;
import defpackage.aii0;
import defpackage.b9a1;
import defpackage.bb1;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bz40;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cr5;
import defpackage.cyk0;
import defpackage.dbb1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dr31;
import defpackage.dtr0;
import defpackage.eja1;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gn50;
import defpackage.gp5;
import defpackage.hbb1;
import defpackage.j5y;
import defpackage.jh6;
import defpackage.jj2;
import defpackage.jx20;
import defpackage.kx20;
import defpackage.lg6;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.nah;
import defpackage.nx2;
import defpackage.o430;
import defpackage.o8d;
import defpackage.of6;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p651;
import defpackage.p6y;
import defpackage.pi6;
import defpackage.pzt0;
import defpackage.qab1;
import defpackage.qje;
import defpackage.qxi;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.uo5;
import defpackage.uy2;
import defpackage.vfc;
import defpackage.vmz;
import defpackage.vuz;
import defpackage.w5;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.ymb1;
import defpackage.yx40;
import defpackage.z8e;
import defpackage.z910;
import defpackage.zls;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:167:0x050b, code lost:
    
        if (r14 == r6) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, wg6 wg6Var, lg6 lg6Var, boolean z, boolean z2, jh6 jh6Var, p651 p651Var, zls zlsVar, zls zlsVar2, zls zlsVar3, zls zlsVar4, androidx.compose.runtime.internal.a aVar, fid fidVar, int i, int i2, int i3) {
        f530 f530Var2;
        int i4;
        wg6 wg6Var2;
        lg6 lg6Var2;
        boolean z3;
        int i5;
        boolean z4;
        p651 p651Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        lg6 lg6Var3;
        boolean z5;
        jh6 jh6Var2;
        p651 p651Var3;
        zls zlsVar5;
        zls zlsVar6;
        zls zlsVar7;
        f530 f530Var3;
        wg6 wg6Var3;
        bts btsVar;
        boolean z6;
        zls zlsVar8;
        aii0 v;
        bts btsVar2;
        int i15;
        c530 c530Var;
        dmw0 dmw0Var;
        ?? r12;
        wg6 wg6Var4;
        lg6 lg6Var4;
        boolean z7;
        int i16;
        p651 p651Var4;
        zls zlsVar9;
        zls zlsVar10;
        jh6 jh6Var3;
        zls zlsVar11;
        int i17;
        zls zlsVar12;
        bts btsVar3;
        zls zlsVar13;
        boolean z8;
        Object obj;
        zls zlsVar14;
        c530 c530Var2;
        f530 a;
        zls zlsVar15;
        boolean z9;
        c530 c530Var3;
        boolean z10;
        bz40 bz40Var;
        boolean k;
        boolean z11;
        boolean d;
        boolean k2;
        lg6 lg6Var5;
        boolean z12;
        o430 o430Var;
        Object obj2;
        int i18;
        int i19;
        int i20;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(106118400);
        dmw0 dmw0Var2 = btsVar4.a;
        int i21 = i3 & 1;
        if (i21 != 0) {
            i4 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i4 = (btsVar4.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                wg6Var2 = wg6Var;
                if (btsVar4.k(wg6Var2)) {
                    i20 = 32;
                    i4 |= i20;
                }
            } else {
                wg6Var2 = wg6Var;
            }
            i20 = 16;
            i4 |= i20;
        } else {
            wg6Var2 = wg6Var;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                lg6Var2 = lg6Var;
                if (btsVar4.k(lg6Var2)) {
                    i19 = 256;
                    i4 |= i19;
                }
            } else {
                lg6Var2 = lg6Var;
            }
            i19 = 128;
            i4 |= i19;
        } else {
            lg6Var2 = lg6Var;
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z3 = z;
            i4 |= btsVar4.a(z3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z4 = z2;
                i4 |= btsVar4.a(z4) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i4 |= 65536;
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        p651Var2 = p651Var;
                        if (btsVar4.k(p651Var2)) {
                            i18 = 1048576;
                            i4 |= i18;
                        }
                    } else {
                        p651Var2 = p651Var;
                    }
                    i18 = 524288;
                    i4 |= i18;
                } else {
                    p651Var2 = p651Var;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i7 = i21;
                    i4 |= btsVar4.e(zlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= btsVar4.e(zlsVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i4 | 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i11 = i10;
                                i4 |= btsVar4.e(zlsVar3) ? 536870912 : SelfTester_JCP.IMITA;
                            } else {
                                i11 = i10;
                            }
                            i12 = i4;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = 54;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (btsVar4.e(zlsVar4) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        if (btsVar4.V(i12 & 1, (i12 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                            btsVar4.a0();
                            int i23 = i & 1;
                            c530 c530Var4 = c530.a;
                            if (i23 == 0 || btsVar4.C()) {
                                f530 f530Var4 = i7 != 0 ? c530Var4 : f530Var2;
                                if ((i3 & 2) != 0) {
                                    bts btsVar5 = btsVar4;
                                    i15 = i13;
                                    dmw0Var = dmw0Var2;
                                    r12 = 1;
                                    c530Var = c530Var4;
                                    wg6Var4 = b.a(false, 0.0f, null, false, null, null, null, null, btsVar5, 0, 0, 8191);
                                    i12 &= -113;
                                    btsVar2 = btsVar5;
                                } else {
                                    btsVar2 = btsVar4;
                                    i15 = i13;
                                    c530Var = c530Var4;
                                    dmw0Var = dmw0Var2;
                                    r12 = 1;
                                    wg6Var4 = wg6Var2;
                                }
                                int i24 = i12;
                                if ((i3 & 4) != 0) {
                                    lg6Var4 = qab1.c(wg6Var4, null, null, btsVar2, (i24 >> 3) & 14, 6);
                                    i24 &= -897;
                                } else {
                                    lg6Var4 = lg6Var;
                                }
                                boolean z13 = i22 != 0 ? r12 : z;
                                z7 = i5 != 0 ? r12 : z2;
                                int i25 = i24 & (-458753);
                                if ((i3 & 64) != 0) {
                                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                                    p651Var4 = vuz.o(btsVar2).g;
                                    i16 = i24 & (-4128769);
                                } else {
                                    i16 = i25;
                                    p651Var4 = p651Var;
                                }
                                if (i6 != 0) {
                                    o8d.a.getClass();
                                    zlsVar9 = o8d.b;
                                } else {
                                    zlsVar9 = zlsVar;
                                }
                                if (i9 != 0) {
                                    o8d.a.getClass();
                                    zlsVar10 = o8d.c;
                                } else {
                                    zlsVar10 = zlsVar2;
                                }
                                zls S = i11 != 0 ? wwg.S(1199136226, r12, new cr5(wg6Var4, r12), btsVar2) : zlsVar3;
                                jh6Var3 = dr31.a;
                                if (i15 != 0) {
                                    o8d.a.getClass();
                                    zlsVar11 = o8d.d;
                                } else {
                                    zlsVar11 = zlsVar4;
                                }
                                i17 = i16;
                                zlsVar12 = S;
                                z3 = z13;
                                f530Var2 = f530Var4;
                                btsVar3 = btsVar2;
                            } else {
                                btsVar4.Y();
                                if ((i3 & 2) != 0) {
                                    i12 &= -113;
                                }
                                int i26 = i12;
                                if ((i3 & 4) != 0) {
                                    i26 &= -897;
                                }
                                int i27 = i26 & (-458753);
                                if ((i3 & 64) != 0) {
                                    i27 = i26 & (-4128769);
                                }
                                btsVar3 = btsVar4;
                                i17 = i27;
                                c530Var = c530Var4;
                                lg6Var4 = lg6Var2;
                                z7 = z4;
                                p651Var4 = p651Var2;
                                dmw0Var = dmw0Var2;
                                jh6Var3 = jh6Var;
                                zlsVar9 = zlsVar;
                                zlsVar10 = zlsVar2;
                                zlsVar11 = zlsVar4;
                                wg6Var4 = wg6Var2;
                                zlsVar12 = zlsVar3;
                            }
                            btsVar3.u();
                            long n = tje.n(lg6Var4.a, btsVar3);
                            boolean z14 = z7;
                            Object Q = btsVar3.Q();
                            boolean z15 = z3;
                            o430 o430Var2 = did.a;
                            Object obj3 = Q;
                            if (Q == o430Var2) {
                                qxi d2 = f.d(new gp5(wg6Var4, 8));
                                btsVar3.o0(d2);
                                obj3 = d2;
                            }
                            m3u0 m3u0Var = (m3u0) obj3;
                            sls slsVar = lg6Var4.c;
                            if (slsVar == null || !((Boolean) m3u0Var.getValue()).booleanValue()) {
                                slsVar = null;
                            }
                            if (slsVar == null) {
                                btsVar3.e0(278337873);
                                btsVar3.t(false);
                                zlsVar14 = zlsVar12;
                                zlsVar13 = zlsVar11;
                                c530Var2 = c530Var;
                                a = null;
                            } else {
                                btsVar3.e0(278337874);
                                boolean k3 = btsVar3.k(slsVar);
                                Object Q2 = btsVar3.Q();
                                if (k3 || Q2 == o430Var2) {
                                    zlsVar13 = zlsVar11;
                                    z8 = false;
                                    kx20 kx20Var = new kx20(false ? 1 : 0, slsVar);
                                    btsVar3.o0(kx20Var);
                                    obj = kx20Var;
                                } else {
                                    zlsVar13 = zlsVar11;
                                    z8 = false;
                                    obj = Q2;
                                }
                                zlsVar14 = zlsVar12;
                                c530Var2 = c530Var;
                                a = exw0.a(c530Var2, slsVar, (PointerInputEventHandler) obj);
                                btsVar3.t(z8);
                            }
                            if (a == null) {
                                a = c530Var2;
                            }
                            ((nx2) btsVar3.m(uy2.c)).getClass();
                            zls zlsVar16 = zlsVar10;
                            byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
                            f530 l = z15 ? ymb1.l(c530Var2, e) : c530Var2;
                            f530 c = z14 ? bzk0.c(c530Var2, AppColor$Palette.Background, e) : c530Var2;
                            fwi fwiVar = (fwi) btsVar3.m(j.h);
                            f530 f530Var5 = l;
                            int i28 = (i17 & 3670016) ^ 1572864;
                            f530 f530Var6 = c;
                            if (i28 <= 1048576 || !btsVar3.k(p651Var4)) {
                                zlsVar15 = zlsVar9;
                                if ((i17 & 1572864) != 1048576) {
                                    z9 = false;
                                    Object Q3 = btsVar3.Q();
                                    Object obj4 = Q3;
                                    if (!z9 || Q3 == o430Var2) {
                                        a050 a050Var = new a050(p651Var4);
                                        btsVar3.o0(a050Var);
                                        obj4 = a050Var;
                                    }
                                    a050 a050Var2 = (a050) obj4;
                                    if (i28 > 1048576 || !btsVar3.k(p651Var4)) {
                                        c530Var3 = c530Var2;
                                        if ((i17 & 1572864) != 1048576) {
                                            z10 = false;
                                            Object Q4 = btsVar3.Q();
                                            Object obj5 = Q4;
                                            if (!z10 || Q4 == o430Var2) {
                                                bz40 bz40Var2 = new bz40(a050Var2, fwiVar);
                                                btsVar3.o0(bz40Var2);
                                                obj5 = bz40Var2;
                                            }
                                            bz40Var = (bz40) obj5;
                                            k = btsVar3.k(a050Var2) | ((i28 <= 1048576 && btsVar3.k(p651Var4)) || (i17 & 1572864) == 1048576);
                                            Object Q5 = btsVar3.Q();
                                            Object obj6 = Q5;
                                            if (!k || Q5 == o430Var2) {
                                                vmz vmzVar = new vmz(26, a050Var2, p651Var4);
                                                btsVar3.o0(vmzVar);
                                                obj6 = vmzVar;
                                            }
                                            f530 c2 = b9a1.c(f530Var2, (tls) obj6);
                                            int i29 = (i17 & 112) ^ 48;
                                            z11 = (i29 <= 32 && btsVar3.k(wg6Var4)) || (i17 & 48) == 32;
                                            Object Q6 = btsVar3.Q();
                                            Object obj7 = Q6;
                                            if (!z11 || Q6 == o430Var2) {
                                                of6 of6Var = new of6(wg6Var4, 7);
                                                btsVar3.o0(of6Var);
                                                obj7 = of6Var;
                                            }
                                            f530 a2 = d.a(c2, (tls) obj7);
                                            f530 f530Var7 = f530Var2;
                                            d = ((((i17 & 896) ^ 384) <= 256 && btsVar3.k(lg6Var4)) || (i17 & 384) == 256) | btsVar3.d(n);
                                            Object Q7 = btsVar3.Q();
                                            Object obj8 = Q7;
                                            if (!d || Q7 == o430Var2) {
                                                j5y j5yVar = new j5y(n, lg6Var4, 1);
                                                btsVar3.o0(j5yVar);
                                                obj8 = j5yVar;
                                            }
                                            f530 k4 = bb1.g(a2, (tls) obj8).k(a);
                                            k2 = btsVar3.k(bz40Var) | ((i29 <= 32 && btsVar3.k(wg6Var4)) || (i17 & 48) == 32) | btsVar3.k(jh6Var3);
                                            Object Q8 = btsVar3.Q();
                                            Object obj9 = Q8;
                                            if (!k2 || Q8 == o430Var2) {
                                                jx20 jx20Var = new jx20(bz40Var, wg6Var4, jh6Var3);
                                                btsVar3.o0(jx20Var);
                                                obj9 = jx20Var;
                                            }
                                            z910 z910Var = (z910) obj9;
                                            int hashCode = Long.hashCode(btsVar3.T);
                                            r1b0 o = btsVar3.o();
                                            f530 d3 = androidx.compose.ui.b.d(btsVar3, k4);
                                            ohd.G1.getClass();
                                            sls slsVar2 = androidx.compose.ui.node.d.b;
                                            if (dmw0Var == null) {
                                                cma1.b0();
                                                throw null;
                                            }
                                            btsVar3.i0();
                                            if (btsVar3.S) {
                                                btsVar3.n(slsVar2);
                                            } else {
                                                btsVar3.r0();
                                            }
                                            wls wlsVar = androidx.compose.ui.node.d.f;
                                            qje.W(btsVar3, wlsVar, z910Var);
                                            wls wlsVar2 = androidx.compose.ui.node.d.e;
                                            qje.W(btsVar3, wlsVar2, o);
                                            Integer valueOf = Integer.valueOf(hashCode);
                                            wls wlsVar3 = androidx.compose.ui.node.d.g;
                                            qje.W(btsVar3, wlsVar3, valueOf);
                                            tls tlsVar = androidx.compose.ui.node.d.h;
                                            qje.M(btsVar3, tlsVar);
                                            wls wlsVar4 = androidx.compose.ui.node.d.d;
                                            qje.W(btsVar3, wlsVar4, d3);
                                            if (i29 <= 32 || !btsVar3.k(wg6Var4)) {
                                                lg6Var5 = lg6Var4;
                                                if ((i17 & 48) != 32) {
                                                    z12 = false;
                                                    Object Q9 = btsVar3.Q();
                                                    Object obj10 = Q9;
                                                    if (!z12 || Q9 == o430Var2) {
                                                        of6 of6Var2 = new of6(wg6Var4, 8);
                                                        btsVar3.o0(of6Var2);
                                                        obj10 = of6Var2;
                                                    }
                                                    c530 c530Var5 = c530Var3;
                                                    f530 a3 = d.a(c530Var5, (tls) obj10);
                                                    p651 p651Var5 = p651Var4;
                                                    int i30 = (i17 >> 12) & 7168;
                                                    uo5 uo5Var = x4c.b;
                                                    jh6 jh6Var4 = jh6Var3;
                                                    int i31 = i17;
                                                    z910 d4 = pi6.d(uo5Var, false);
                                                    int hashCode2 = Long.hashCode(btsVar3.T);
                                                    r1b0 o2 = btsVar3.o();
                                                    f530 d5 = androidx.compose.ui.b.d(btsVar3, a3);
                                                    if (dmw0Var != null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar3.i0();
                                                    if (btsVar3.S) {
                                                        btsVar3.n(slsVar2);
                                                    } else {
                                                        btsVar3.r0();
                                                    }
                                                    qje.W(btsVar3, wlsVar, d4);
                                                    qje.W(btsVar3, wlsVar2, o2);
                                                    vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
                                                    qje.W(btsVar3, wlsVar4, d5);
                                                    int i32 = 6;
                                                    cj6 cj6Var = cj6.a;
                                                    zls zlsVar17 = zlsVar15;
                                                    ly3.x(((i30 >> 6) & 112) | 6, zlsVar17, cj6Var, btsVar3, true);
                                                    boolean z16 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q10 = btsVar3.Q();
                                                    int i33 = 9;
                                                    if (z16) {
                                                        o430Var = o430Var2;
                                                    } else {
                                                        o430Var = o430Var2;
                                                        obj2 = Q10;
                                                    }
                                                    of6 of6Var3 = new of6(wg6Var4, i33);
                                                    btsVar3.o0(of6Var3);
                                                    obj2 = of6Var3;
                                                    f530 a4 = d.a(c530Var5, (tls) obj2);
                                                    int i34 = (i31 >> 15) & 7168;
                                                    z910 d6 = pi6.d(uo5Var, false);
                                                    int hashCode3 = Long.hashCode(btsVar3.T);
                                                    r1b0 o3 = btsVar3.o();
                                                    f530 d7 = androidx.compose.ui.b.d(btsVar3, a4);
                                                    if (dmw0Var == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar3.i0();
                                                    if (btsVar3.S) {
                                                        btsVar3.n(slsVar2);
                                                    } else {
                                                        btsVar3.r0();
                                                    }
                                                    qje.W(btsVar3, wlsVar, d6);
                                                    qje.W(btsVar3, wlsVar2, o3);
                                                    vfc.v(hashCode3, btsVar3, wlsVar3, btsVar3, tlsVar);
                                                    qje.W(btsVar3, wlsVar4, d7);
                                                    ly3.x(((i34 >> 6) & 112) | 6, zlsVar16, cj6Var, btsVar3, true);
                                                    boolean z17 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q11 = btsVar3.Q();
                                                    Object obj11 = Q11;
                                                    if (z17 || Q11 == o430Var) {
                                                        of6 of6Var4 = new of6(wg6Var4, 2);
                                                        btsVar3.o0(of6Var4);
                                                        obj11 = of6Var4;
                                                    }
                                                    f530 a5 = d.a(c530Var5, (tls) obj11);
                                                    boolean z18 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q12 = btsVar3.Q();
                                                    Object obj12 = Q12;
                                                    if (z18 || Q12 == o430Var) {
                                                        z8e z8eVar = new z8e(wg6Var4);
                                                        btsVar3.o0(z8eVar);
                                                        obj12 = z8eVar;
                                                    }
                                                    f530 a6 = androidx.compose.ui.input.nestedscroll.b.a(a5, (gn50) obj12, null);
                                                    boolean z19 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q13 = btsVar3.Q();
                                                    Object obj13 = Q13;
                                                    if (z19 || Q13 == o430Var) {
                                                        of6 of6Var5 = new of6(wg6Var4, 4);
                                                        btsVar3.o0(of6Var5);
                                                        obj13 = of6Var5;
                                                    }
                                                    zls zlsVar18 = l.a;
                                                    oz40 n2 = f.n((tls) obj13, btsVar3);
                                                    Object Q14 = btsVar3.Q();
                                                    if (Q14 == o430Var) {
                                                        nah nahVar = new nah(new w5(24, n2));
                                                        btsVar3.o0(nahVar);
                                                        Q14 = nahVar;
                                                    }
                                                    n nVar = (n) Q14;
                                                    Orientation orientation = Orientation.Vertical;
                                                    boolean z20 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q15 = btsVar3.Q();
                                                    Object obj14 = Q15;
                                                    if (z20 || Q15 == o430Var) {
                                                        ModalBottomSheetKt$ModalBottomSheet$6$6$1 modalBottomSheetKt$ModalBottomSheet$6$6$1 = new ModalBottomSheetKt$ModalBottomSheet$6$6$1(wg6Var4, null);
                                                        btsVar3.o0(modalBottomSheetKt$ModalBottomSheet$6$6$1);
                                                        obj14 = modalBottomSheetKt$ModalBottomSheet$6$6$1;
                                                    }
                                                    zls zlsVar19 = (zls) obj14;
                                                    boolean z21 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q16 = btsVar3.Q();
                                                    Object obj15 = Q16;
                                                    if (z21 || Q16 == o430Var) {
                                                        ModalBottomSheetKt$ModalBottomSheet$6$7$1 modalBottomSheetKt$ModalBottomSheet$6$7$1 = new ModalBottomSheetKt$ModalBottomSheet$6$7$1(wg6Var4, null);
                                                        btsVar3.o0(modalBottomSheetKt$ModalBottomSheet$6$7$1);
                                                        obj15 = modalBottomSheetKt$ModalBottomSheet$6$7$1;
                                                    }
                                                    f530 a7 = l.a(a6, nVar, orientation, true, null, false, zlsVar19, (zls) obj15, false, HProv.PP_LCD_QUERY);
                                                    boolean z22 = (i29 > 32 && btsVar3.k(wg6Var4)) || (i31 & 48) == 32;
                                                    Object Q17 = btsVar3.Q();
                                                    Object obj16 = Q17;
                                                    if (z22 || Q17 == o430Var) {
                                                        of6 of6Var6 = new of6(wg6Var4, 5);
                                                        btsVar3.o0(of6Var6);
                                                        obj16 = of6Var6;
                                                    }
                                                    f530 k5 = hbb1.c(eja1.y(a7, (tls) obj16), dbb1.b(btsVar3), false, 24.0f, null, 10).k(f530Var6).k(f530Var5);
                                                    Object Q18 = btsVar3.Q();
                                                    Object obj17 = Q18;
                                                    if (Q18 == o430Var) {
                                                        a12 a12Var = a12.i;
                                                        btsVar3.o0(a12Var);
                                                        obj17 = a12Var;
                                                    }
                                                    f530 a8 = exw0.a(k5, zy11.a, (PointerInputEventHandler) obj17);
                                                    z910 d8 = pi6.d(uo5Var, false);
                                                    wg6 wg6Var5 = wg6Var4;
                                                    int hashCode4 = Long.hashCode(btsVar3.T);
                                                    r1b0 o4 = btsVar3.o();
                                                    f530 d9 = androidx.compose.ui.b.d(btsVar3, a8);
                                                    if (dmw0Var == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar3.i0();
                                                    if (btsVar3.S) {
                                                        btsVar3.n(slsVar2);
                                                    } else {
                                                        btsVar3.r0();
                                                    }
                                                    qje.W(btsVar3, wlsVar, d8);
                                                    qje.W(btsVar3, wlsVar2, o4);
                                                    vfc.v(hashCode4, btsVar3, wlsVar3, btsVar3, tlsVar);
                                                    qje.W(btsVar3, wlsVar4, d9);
                                                    aVar.invoke(cj6Var, bz40Var, btsVar3, 390);
                                                    btsVar3.t(true);
                                                    boolean z23 = (i29 > 32 && btsVar3.k(wg6Var5)) || (i31 & 48) == 32;
                                                    Object Q19 = btsVar3.Q();
                                                    Object obj18 = Q19;
                                                    if (z23 || Q19 == o430Var) {
                                                        of6 of6Var7 = new of6(wg6Var5, 3);
                                                        btsVar3.o0(of6Var7);
                                                        obj18 = of6Var7;
                                                    }
                                                    f530 a9 = d.a(c530Var5, (tls) obj18);
                                                    int i35 = (i31 >> 18) & 7168;
                                                    z910 d10 = pi6.d(uo5Var, false);
                                                    int hashCode5 = Long.hashCode(btsVar3.T);
                                                    r1b0 o5 = btsVar3.o();
                                                    f530 d11 = androidx.compose.ui.b.d(btsVar3, a9);
                                                    if (dmw0Var == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar3.i0();
                                                    if (btsVar3.S) {
                                                        btsVar3.n(slsVar2);
                                                    } else {
                                                        btsVar3.r0();
                                                    }
                                                    qje.W(btsVar3, wlsVar, d10);
                                                    qje.W(btsVar3, wlsVar2, o5);
                                                    vfc.v(hashCode5, btsVar3, wlsVar3, btsVar3, tlsVar);
                                                    qje.W(btsVar3, wlsVar4, d11);
                                                    zls zlsVar20 = zlsVar14;
                                                    ly3.x(((i35 >> 6) & 112) | 6, zlsVar20, cj6Var, btsVar3, true);
                                                    boolean z24 = (i29 > 32 && btsVar3.k(wg6Var5)) || (i31 & 48) == 32;
                                                    Object Q20 = btsVar3.Q();
                                                    Object obj19 = Q20;
                                                    if (z24 || Q20 == o430Var) {
                                                        of6 of6Var8 = new of6(wg6Var5, i32);
                                                        btsVar3.o0(of6Var8);
                                                        obj19 = of6Var8;
                                                    }
                                                    f530 a10 = d.a(c530Var5, (tls) obj19);
                                                    int i36 = (i14 << 9) & 7168;
                                                    z910 d12 = pi6.d(uo5Var, false);
                                                    int hashCode6 = Long.hashCode(btsVar3.T);
                                                    r1b0 o6 = btsVar3.o();
                                                    f530 d13 = androidx.compose.ui.b.d(btsVar3, a10);
                                                    if (dmw0Var == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar3.i0();
                                                    if (btsVar3.S) {
                                                        btsVar3.n(slsVar2);
                                                    } else {
                                                        btsVar3.r0();
                                                    }
                                                    qje.W(btsVar3, wlsVar, d12);
                                                    qje.W(btsVar3, wlsVar2, o6);
                                                    vfc.v(hashCode6, btsVar3, wlsVar3, btsVar3, tlsVar);
                                                    qje.W(btsVar3, wlsVar4, d13);
                                                    zlsVar7 = zlsVar13;
                                                    ly3.x(((i36 >> 6) & 112) | 6, zlsVar7, cj6Var, btsVar3, true);
                                                    btsVar3.t(true);
                                                    z6 = z14;
                                                    z5 = z15;
                                                    zlsVar6 = zlsVar20;
                                                    btsVar = btsVar3;
                                                    wg6Var3 = wg6Var5;
                                                    f530Var3 = f530Var7;
                                                    lg6Var3 = lg6Var5;
                                                    zlsVar5 = zlsVar16;
                                                    p651Var3 = p651Var5;
                                                    jh6Var2 = jh6Var4;
                                                    zlsVar8 = zlsVar17;
                                                }
                                            } else {
                                                lg6Var5 = lg6Var4;
                                            }
                                            z12 = true;
                                            Object Q92 = btsVar3.Q();
                                            Object obj102 = Q92;
                                            if (!z12) {
                                            }
                                            of6 of6Var22 = new of6(wg6Var4, 8);
                                            btsVar3.o0(of6Var22);
                                            obj102 = of6Var22;
                                            c530 c530Var52 = c530Var3;
                                            f530 a32 = d.a(c530Var52, (tls) obj102);
                                            p651 p651Var52 = p651Var4;
                                            int i302 = (i17 >> 12) & 7168;
                                            uo5 uo5Var2 = x4c.b;
                                            jh6 jh6Var42 = jh6Var3;
                                            int i312 = i17;
                                            z910 d42 = pi6.d(uo5Var2, false);
                                            int hashCode22 = Long.hashCode(btsVar3.T);
                                            r1b0 o22 = btsVar3.o();
                                            f530 d52 = androidx.compose.ui.b.d(btsVar3, a32);
                                            if (dmw0Var != null) {
                                            }
                                        }
                                    } else {
                                        c530Var3 = c530Var2;
                                    }
                                    z10 = true;
                                    Object Q42 = btsVar3.Q();
                                    Object obj52 = Q42;
                                    if (!z10) {
                                    }
                                    bz40 bz40Var22 = new bz40(a050Var2, fwiVar);
                                    btsVar3.o0(bz40Var22);
                                    obj52 = bz40Var22;
                                    bz40Var = (bz40) obj52;
                                    k = btsVar3.k(a050Var2) | ((i28 <= 1048576 && btsVar3.k(p651Var4)) || (i17 & 1572864) == 1048576);
                                    Object Q52 = btsVar3.Q();
                                    Object obj62 = Q52;
                                    if (!k) {
                                    }
                                    vmz vmzVar2 = new vmz(26, a050Var2, p651Var4);
                                    btsVar3.o0(vmzVar2);
                                    obj62 = vmzVar2;
                                    f530 c22 = b9a1.c(f530Var2, (tls) obj62);
                                    int i292 = (i17 & 112) ^ 48;
                                    if (i292 <= 32) {
                                    }
                                    Object Q62 = btsVar3.Q();
                                    Object obj72 = Q62;
                                    if (!z11) {
                                    }
                                    of6 of6Var9 = new of6(wg6Var4, 7);
                                    btsVar3.o0(of6Var9);
                                    obj72 = of6Var9;
                                    f530 a22 = d.a(c22, (tls) obj72);
                                    f530 f530Var72 = f530Var2;
                                    d = ((((i17 & 896) ^ 384) <= 256 && btsVar3.k(lg6Var4)) || (i17 & 384) == 256) | btsVar3.d(n);
                                    Object Q72 = btsVar3.Q();
                                    Object obj82 = Q72;
                                    if (!d) {
                                    }
                                    j5y j5yVar2 = new j5y(n, lg6Var4, 1);
                                    btsVar3.o0(j5yVar2);
                                    obj82 = j5yVar2;
                                    f530 k42 = bb1.g(a22, (tls) obj82).k(a);
                                    k2 = btsVar3.k(bz40Var) | ((i292 <= 32 && btsVar3.k(wg6Var4)) || (i17 & 48) == 32) | btsVar3.k(jh6Var3);
                                    Object Q82 = btsVar3.Q();
                                    Object obj92 = Q82;
                                    if (!k2) {
                                    }
                                    jx20 jx20Var2 = new jx20(bz40Var, wg6Var4, jh6Var3);
                                    btsVar3.o0(jx20Var2);
                                    obj92 = jx20Var2;
                                    z910 z910Var2 = (z910) obj92;
                                    int hashCode7 = Long.hashCode(btsVar3.T);
                                    r1b0 o7 = btsVar3.o();
                                    f530 d32 = androidx.compose.ui.b.d(btsVar3, k42);
                                    ohd.G1.getClass();
                                    sls slsVar22 = androidx.compose.ui.node.d.b;
                                    if (dmw0Var == null) {
                                    }
                                }
                            } else {
                                zlsVar15 = zlsVar9;
                            }
                            z9 = true;
                            Object Q32 = btsVar3.Q();
                            Object obj42 = Q32;
                            if (!z9) {
                            }
                            a050 a050Var3 = new a050(p651Var4);
                            btsVar3.o0(a050Var3);
                            obj42 = a050Var3;
                            a050 a050Var22 = (a050) obj42;
                            if (i28 > 1048576) {
                            }
                            c530Var3 = c530Var2;
                            if ((i17 & 1572864) != 1048576) {
                            }
                            z10 = true;
                            Object Q422 = btsVar3.Q();
                            Object obj522 = Q422;
                            if (!z10) {
                            }
                            bz40 bz40Var222 = new bz40(a050Var22, fwiVar);
                            btsVar3.o0(bz40Var222);
                            obj522 = bz40Var222;
                            bz40Var = (bz40) obj522;
                            k = btsVar3.k(a050Var22) | ((i28 <= 1048576 && btsVar3.k(p651Var4)) || (i17 & 1572864) == 1048576);
                            Object Q522 = btsVar3.Q();
                            Object obj622 = Q522;
                            if (!k) {
                            }
                            vmz vmzVar22 = new vmz(26, a050Var22, p651Var4);
                            btsVar3.o0(vmzVar22);
                            obj622 = vmzVar22;
                            f530 c222 = b9a1.c(f530Var2, (tls) obj622);
                            int i2922 = (i17 & 112) ^ 48;
                            if (i2922 <= 32) {
                            }
                            Object Q622 = btsVar3.Q();
                            Object obj722 = Q622;
                            if (!z11) {
                            }
                            of6 of6Var92 = new of6(wg6Var4, 7);
                            btsVar3.o0(of6Var92);
                            obj722 = of6Var92;
                            f530 a222 = d.a(c222, (tls) obj722);
                            f530 f530Var722 = f530Var2;
                            d = ((((i17 & 896) ^ 384) <= 256 && btsVar3.k(lg6Var4)) || (i17 & 384) == 256) | btsVar3.d(n);
                            Object Q722 = btsVar3.Q();
                            Object obj822 = Q722;
                            if (!d) {
                            }
                            j5y j5yVar22 = new j5y(n, lg6Var4, 1);
                            btsVar3.o0(j5yVar22);
                            obj822 = j5yVar22;
                            f530 k422 = bb1.g(a222, (tls) obj822).k(a);
                            k2 = btsVar3.k(bz40Var) | ((i2922 <= 32 && btsVar3.k(wg6Var4)) || (i17 & 48) == 32) | btsVar3.k(jh6Var3);
                            Object Q822 = btsVar3.Q();
                            Object obj922 = Q822;
                            if (!k2) {
                            }
                            jx20 jx20Var22 = new jx20(bz40Var, wg6Var4, jh6Var3);
                            btsVar3.o0(jx20Var22);
                            obj922 = jx20Var22;
                            z910 z910Var22 = (z910) obj922;
                            int hashCode72 = Long.hashCode(btsVar3.T);
                            r1b0 o72 = btsVar3.o();
                            f530 d322 = androidx.compose.ui.b.d(btsVar3, k422);
                            ohd.G1.getClass();
                            sls slsVar222 = androidx.compose.ui.node.d.b;
                            if (dmw0Var == null) {
                            }
                        } else {
                            btsVar4.Y();
                            lg6Var3 = lg6Var;
                            z5 = z;
                            jh6Var2 = jh6Var;
                            p651Var3 = p651Var;
                            zlsVar5 = zlsVar2;
                            zlsVar6 = zlsVar3;
                            zlsVar7 = zlsVar4;
                            f530Var3 = f530Var2;
                            wg6Var3 = wg6Var2;
                            btsVar = btsVar4;
                            z6 = z2;
                            zlsVar8 = zlsVar;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new p6y(f530Var3, wg6Var3, lg6Var3, z5, z6, jh6Var2, p651Var3, zlsVar8, zlsVar5, zlsVar6, zlsVar7, aVar, i, i2, i3);
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    if (btsVar4.V(i12 & 1, (i12 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                i7 = i21;
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                if (btsVar4.V(i12 & 1, (i12 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            z4 = z2;
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i21;
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            if (btsVar4.V(i12 & 1, (i12 & 306783379) == 306783378 || (i14 & 19) != 18)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i21;
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        if (btsVar4.V(i12 & 1, (i12 & 306783379) == 306783378 || (i14 & 19) != 18)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(wg6 wg6Var, int i) {
        oz40 oz40Var = wg6Var.g;
        if (((dtr0) oz40Var.getValue()).a == i) {
            return;
        }
        oz40Var.setValue(new dtr0(i));
        pzt0 pzt0Var = wg6Var.r;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        wg6Var.h.setFloatValue(wg6Var.f(((dtr0) oz40Var.getValue()).a));
    }

    public static void c(wg6 wg6Var, float f, int i) {
        sls slsVar;
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        pzt0 pzt0Var = wg6Var.r;
        oz40 oz40Var = wg6Var.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        jj2 jj2Var = wg6Var.p;
        float floatValue = wg6Var.h.getFloatValue();
        float f3 = wg6Var.f(((dtr0) oz40Var.getValue()).a);
        float abs = Math.abs(f3 - floatValue);
        int i2 = wg6Var.s;
        int i3 = ((dtr0) oz40Var.getValue()).a;
        wg6Var.s = i3;
        if (abs < 0.001f) {
            return;
        }
        if (i2 != i3 && i3 == -1 && (slsVar = wg6Var.t) != null) {
            slsVar.invoke();
        }
        wg6Var.r = tje.N(wg6Var.a, null, null, new SettlingKt$runSettleToTargetState$1(floatValue, f3, f2, abs, jj2Var, wg6Var, null), 3);
    }

    public static final Object d(wg6 wg6Var, int i, Continuation continuation) {
        wg6Var.g.setValue(new dtr0(i));
        c(wg6Var, 0.0f, 1);
        pzt0 pzt0Var = wg6Var.r;
        return pzt0Var != null ? pzt0Var.u0(continuation) : zy11.a;
    }

    public static final void e(wg6 wg6Var, float f) {
        int i;
        boolean z = wg6Var.k;
        oz40 oz40Var = wg6Var.g;
        yx40 yx40Var = wg6Var.v;
        if (z || wg6Var.l || yx40Var.getIntValue() != 2) {
            wg6Var.i.setValue(Boolean.FALSE);
            float[] fArr = wg6Var.u;
            float floatValue = wg6Var.h.getFloatValue();
            int intValue = wg6Var.k ? yx40Var.getIntValue() - 1 : yx40Var.getIntValue() - 2;
            float f2 = Float.MAX_VALUE;
            if (intValue >= 0) {
                i = 0;
                int i2 = -1;
                while (true) {
                    float abs = Math.abs(fArr[i] - floatValue);
                    if (abs >= f2) {
                        i = i2;
                        break;
                    } else if (i == intValue) {
                        f2 = abs;
                        break;
                    } else {
                        i2 = i;
                        i++;
                        f2 = abs;
                    }
                }
            } else {
                i = -1;
            }
            if (Math.abs(f) >= wg6Var.o) {
                int i3 = floatValue < fArr[i] ? 1 : 0;
                int signum = (int) Math.signum(f);
                if (i3 != 0) {
                    if (signum <= 0) {
                        i++;
                    }
                } else if (signum >= 0) {
                    i--;
                }
            } else if (f2 >= wg6Var.n) {
                int i4 = ((dtr0) oz40Var.getValue()).a;
                if ((i4 != -1 ? i4 == -2 ? yx40Var.getIntValue() - 1 : wg6Var.y.d(i4) : 0) == i) {
                    i -= (int) Math.signum(floatValue - fArr[i]);
                }
            }
            int d = y6i0.d(i, !wg6Var.l ? 1 : 0, intValue);
            oz40Var.setValue(new dtr0(d != 0 ? d == yx40Var.getIntValue() - 1 ? -2 : wg6Var.z[d - 1].a : -1));
            c(wg6Var, f, 2);
        }
    }
}
