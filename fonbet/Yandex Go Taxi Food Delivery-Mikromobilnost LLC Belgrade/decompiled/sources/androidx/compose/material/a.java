package androidx.compose.material;

import androidx.compose.material.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.ar.core.ImageMetadata;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.ajr0;
import defpackage.any0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cq11;
import defpackage.did;
import defpackage.ehr0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fq11;
import defpackage.g8w;
import defpackage.gtq0;
import defpackage.gy31;
import defpackage.h7h;
import defpackage.h8w;
import defpackage.i7h;
import defpackage.j690;
import defpackage.jmy0;
import defpackage.jxe0;
import defpackage.k0y;
import defpackage.kj2;
import defpackage.kk2;
import defpackage.kmy0;
import defpackage.l690;
import defpackage.ldc;
import defpackage.ltu;
import defpackage.ly3;
import defpackage.oz40;
import defpackage.s07;
import defpackage.sls;
import defpackage.sz6;
import defpackage.tls;
import defpackage.tmy0;
import defpackage.vw01;
import defpackage.wk6;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wwg;
import defpackage.x910;
import defpackage.xir0;
import defpackage.xx8;
import defpackage.y7m;
import defpackage.yib1;
import defpackage.zls;
import defpackage.zpn;
import defpackage.ztr;
import defpackage.zx40;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, f530 f530Var, boolean z, i7h i7hVar, ehr0 ehr0Var, h7h h7hVar, j690 j690Var, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        i7h i7hVar2;
        ehr0 ehr0Var2;
        h7h h7hVar2;
        int i4;
        bts btsVar;
        boolean z2;
        f530 f530Var3;
        i7h i7hVar3;
        ehr0 ehr0Var3;
        h7h h7hVar3;
        j690 j690Var2;
        aii0 v;
        j690 j690Var3;
        ehr0 ehr0Var4;
        int i5;
        boolean z3;
        h7h h7hVar4;
        long j;
        zx40 zx40Var;
        ehr0 ehr0Var5;
        f530 f530Var4;
        boolean z4;
        i7h i7hVar4;
        kj2 kj2Var;
        int i6;
        int i7;
        int i8;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1084573925);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            int i10 = i3 | 3456;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    i7hVar2 = i7hVar;
                    if (btsVar2.k(i7hVar2)) {
                        i8 = 16384;
                        i10 |= i8;
                    }
                } else {
                    i7hVar2 = i7hVar;
                }
                i8 = 8192;
                i10 |= i8;
            } else {
                i7hVar2 = i7hVar;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    ehr0Var2 = ehr0Var;
                    if (btsVar2.k(ehr0Var2)) {
                        i7 = 131072;
                        i10 |= i7;
                    }
                } else {
                    ehr0Var2 = ehr0Var;
                }
                i7 = 65536;
                i10 |= i7;
            } else {
                ehr0Var2 = ehr0Var;
            }
            int i11 = i10 | 1572864;
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    h7hVar2 = h7hVar;
                    if (btsVar2.k(h7hVar2)) {
                        i6 = SelfTester_JCP.ENCRYPT_CNT;
                        i11 |= i6;
                    }
                } else {
                    h7hVar2 = h7hVar;
                }
                i6 = SelfTester_JCP.ENCRYPT_CBC;
                i11 |= i6;
            } else {
                h7hVar2 = h7hVar;
            }
            i4 = i11 | 100663296;
            if ((i & 805306368) == 0) {
                i4 |= btsVar2.e(zlsVar) ? 536870912 : SelfTester_JCP.IMITA;
            }
            if (btsVar2.V(i4 & 1, (306783379 & i4) == 306783378)) {
                btsVar = btsVar2;
                btsVar.Y();
                z2 = z;
                f530Var3 = f530Var2;
                i7hVar3 = i7hVar2;
                ehr0Var3 = ehr0Var2;
                h7hVar3 = h7hVar2;
                j690Var2 = j690Var;
            } else {
                btsVar2.a0();
                int i12 = i & 1;
                Object obj = did.a;
                if (i12 == 0 || btsVar2.C()) {
                    f530 f530Var5 = i9 != 0 ? c530.a : f530Var2;
                    if ((i2 & 16) != 0) {
                        l690 l690Var = sz6.a;
                        boolean b = btsVar2.b(2.0f) | btsVar2.b(8.0f) | btsVar2.b(0.0f) | btsVar2.b(4.0f) | btsVar2.b(4.0f);
                        Object Q = btsVar2.Q();
                        if (b || Q == obj) {
                            Q = new i7h();
                            btsVar2.o0(Q);
                        }
                        i4 &= -57345;
                        i7hVar2 = (i7h) Q;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        ehr0Var2 = ((xir0) btsVar2.m(ajr0.a)).a;
                    }
                    f530 f530Var6 = f530Var5;
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        h7hVar2 = sz6.a(HProv.ALG_CLASS_DATA_ENCRYPT, 15, 0L, btsVar2);
                    }
                    j690Var3 = sz6.a;
                    ehr0Var4 = ehr0Var2;
                    f530Var2 = f530Var6;
                    i5 = i4;
                    z3 = true;
                } else {
                    btsVar2.Y();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    ehr0Var4 = ehr0Var2;
                    j690Var3 = j690Var;
                    i5 = i4;
                    z3 = z;
                }
                btsVar2.u();
                btsVar2.e0(497721888);
                Object Q2 = btsVar2.Q();
                if (Q2 == obj) {
                    Q2 = ly3.i(btsVar2);
                }
                zx40 zx40Var2 = (zx40) Q2;
                btsVar2.t(false);
                int i13 = i5 >> 6;
                h7hVar2.getClass();
                btsVar2.e0(-2133647540);
                oz40 n = androidx.compose.runtime.f.n(new ldc(z3 ? h7hVar2.b : h7hVar2.d), btsVar2);
                btsVar2.t(false);
                Object Q3 = btsVar2.Q();
                if (Q3 == obj) {
                    Q3 = new wk6(8);
                    btsVar2.o0(Q3);
                }
                f530 b2 = fnq0.b(f530Var2, false, (tls) Q3);
                btsVar2.e0(-655254499);
                f530 f530Var7 = f530Var2;
                oz40 n2 = androidx.compose.runtime.f.n(new ldc(z3 ? h7hVar2.a : h7hVar2.c), btsVar2);
                btsVar2.t(false);
                long j2 = ((ldc) n2.getValue()).a;
                long b3 = ldc.b(((ldc) n.getValue()).a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                if (i7hVar2 == null) {
                    btsVar2.e0(498128545);
                    btsVar2.t(false);
                    z4 = z3;
                    i7hVar4 = i7hVar2;
                    zx40Var = zx40Var2;
                    h7hVar4 = h7hVar2;
                    j = b3;
                    ehr0Var5 = ehr0Var4;
                    f530Var4 = b2;
                    kj2Var = null;
                } else {
                    btsVar2.e0(1401541984);
                    btsVar2.e0(-1588756907);
                    Object Q4 = btsVar2.Q();
                    if (Q4 == obj) {
                        Q4 = new SnapshotStateList();
                        btsVar2.o0(Q4);
                    }
                    SnapshotStateList snapshotStateList = (SnapshotStateList) Q4;
                    boolean k = btsVar2.k(zx40Var2);
                    h7hVar4 = h7hVar2;
                    Object Q5 = btsVar2.Q();
                    if (k || Q5 == obj) {
                        j = b3;
                        Q5 = new DefaultButtonElevation$elevation$1$1(zx40Var2, snapshotStateList, null);
                        btsVar2.o0(Q5);
                    } else {
                        j = b3;
                    }
                    zpn.e(btsVar2, (wls) Q5, zx40Var2);
                    g8w g8wVar = (g8w) kotlin.collections.a.b0(snapshotStateList);
                    float f = !z3 ? 0.0f : g8wVar instanceof jxe0 ? 8.0f : ((g8wVar instanceof ltu) || (g8wVar instanceof ztr)) ? 4.0f : 2.0f;
                    Object Q6 = btsVar2.Q();
                    if (Q6 == obj) {
                        zx40Var = zx40Var2;
                        ehr0Var5 = ehr0Var4;
                        f530Var4 = b2;
                        Q6 = new androidx.compose.animation.core.a(new y7m(f), gtq0.h, (Object) null, 12);
                        btsVar2.o0(Q6);
                    } else {
                        zx40Var = zx40Var2;
                        ehr0Var5 = ehr0Var4;
                        f530Var4 = b2;
                    }
                    androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q6;
                    y7m y7mVar = new y7m(f);
                    boolean e = btsVar2.e(aVar) | btsVar2.b(f) | (((i13 & 14) ^ 6) > 4 && btsVar2.a(z3)) | ((((i13 & 896) ^ 384) > 256 && btsVar2.k(i7hVar2)) || (i13 & 384) == 256) | btsVar2.e(g8wVar);
                    Object Q7 = btsVar2.Q();
                    if (e || Q7 == obj) {
                        z4 = z3;
                        i7hVar4 = i7hVar2;
                        Q7 = new DefaultButtonElevation$elevation$2$1(aVar, f, z4, i7hVar4, g8wVar, null);
                        btsVar2.o0(Q7);
                    } else {
                        z4 = z3;
                        i7hVar4 = i7hVar2;
                    }
                    zpn.e(btsVar2, (wls) Q7, y7mVar);
                    kj2Var = aVar.d;
                    btsVar2.t(false);
                    btsVar2.t(false);
                }
                btsVar = btsVar2;
                ehr0 ehr0Var6 = ehr0Var5;
                yib1.d(slsVar, f530Var4, z4, ehr0Var6, j2, j, kj2Var != null ? ((y7m) kj2Var.b.getValue()).a : 0.0f, zx40Var, wwg.S(-20345758, true, new xx8(18, n, j690Var3, zlsVar), btsVar2), btsVar, (i5 & 14) | 805306368 | (i5 & 896) | (i13 & 7168) | (i5 & 3670016));
                h7hVar3 = h7hVar4;
                j690Var2 = j690Var3;
                ehr0Var3 = ehr0Var6;
                z2 = z4;
                i7hVar3 = i7hVar4;
                f530Var3 = f530Var7;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new s07(slsVar, f530Var3, z2, i7hVar3, ehr0Var3, h7hVar3, j690Var2, zlsVar, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        int i102 = i3 | 3456;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        int i112 = i102 | 1572864;
        if ((12582912 & i) != 0) {
        }
        i4 = i112 | 100663296;
        if ((i & 805306368) == 0) {
        }
        if (btsVar2.V(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(TextFieldType textFieldType, String str, wls wlsVar, gy31 gy31Var, wls wlsVar2, wls wlsVar3, wls wlsVar4, wls wlsVar5, boolean z, boolean z2, boolean z3, h8w h8wVar, j690 j690Var, ehr0 ehr0Var, jmy0 jmy0Var, fid fidVar, int i, int i2) {
        int i3;
        wls wlsVar6;
        int i4;
        wls wlsVar7;
        int i5;
        bts btsVar;
        long j;
        boolean z4;
        boolean z5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(418608794);
        if ((i & 6) == 0) {
            i3 = (btsVar2.c(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            wlsVar6 = wlsVar;
            i3 |= btsVar2.e(wlsVar6) ? 256 : 128;
        } else {
            wlsVar6 = wlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(gy31Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(wlsVar2) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i4 = 196608;
            wlsVar7 = wlsVar3;
            i3 |= btsVar2.e(wlsVar7) ? 131072 : 65536;
        } else {
            i4 = 196608;
            wlsVar7 = wlsVar3;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.e(wlsVar4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.e(wlsVar5) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (btsVar2.a(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= btsVar2.k(h8wVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= btsVar2.k(j690Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar2.k(ehr0Var) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar2.k(jmy0Var) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= btsVar2.e(null) ? 131072 : 65536;
        }
        if (btsVar2.V(i3 & 1, ((306783379 & i3) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z6 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object Q = btsVar2.Q();
            if (z6 || Q == did.a) {
                Q = gy31Var.b(new kk2(str));
                btsVar2.o0(Q);
            }
            String str2 = ((vw01) Q).a.b;
            InputPhase inputPhase = ((Boolean) androidx.compose.foundation.interaction.a.b(h8wVar, btsVar2, (i5 >> 3) & 14).getValue()).booleanValue() ? InputPhase.Focused : str2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            f fVar = new f(jmy0Var, z2, z3, h8wVar);
            a7u0 a7u0Var = fq11.b;
            cq11 cq11Var = (cq11) btsVar2.m(a7u0Var);
            ety0 ety0Var = cq11Var.g;
            ety0 ety0Var2 = cq11Var.l;
            long b = ety0Var.b();
            long j2 = ldc.m;
            boolean z7 = (ldc.c(b, j2) && !ldc.c(ety0Var2.b(), j2)) || (!ldc.c(ety0Var.b(), j2) && ldc.c(ety0Var2.b(), j2));
            btsVar2.e0(-1443813555);
            long b2 = ((cq11) btsVar2.m(a7u0Var)).l.b();
            if (z7) {
                btsVar2.e0(-887928539);
                if (b2 == 16) {
                    b2 = ((ldc) fVar.invoke(inputPhase, btsVar2, 0)).a;
                }
                z4 = false;
                btsVar2.t(false);
                j = 16;
            } else {
                j = 16;
                z4 = false;
                btsVar2.e0(1218284988);
                btsVar2.t(false);
            }
            long j3 = b2;
            btsVar2.t(z4);
            btsVar2.e0(-1443806289);
            long b3 = ((cq11) btsVar2.m(a7u0Var)).g.b();
            if (z7) {
                btsVar2.e0(-1026713946);
                if (b3 == j) {
                    b3 = ((ldc) fVar.invoke(inputPhase, btsVar2, 0)).a;
                }
                z5 = false;
                btsVar2.t(false);
            } else {
                z5 = false;
                btsVar2.e0(798166043);
                btsVar2.t(false);
            }
            btsVar2.t(z5);
            if (wlsVar2 != null) {
                z5 = true;
            }
            InputPhase inputPhase2 = inputPhase;
            btsVar = btsVar2;
            j.a.a(inputPhase2, j3, b3, fVar, z5, wwg.S(33336375, true, new any0(wlsVar2, wlsVar7, str2, jmy0Var, z2, z3, h8wVar, wlsVar4, wlsVar5, ehr0Var, textFieldType, wlsVar6, z, j690Var, z7), btsVar), btsVar, 1769472);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kmy0(textFieldType, str, wlsVar, gy31Var, wlsVar2, wlsVar3, wlsVar4, wlsVar5, z, z2, z3, h8wVar, j690Var, ehr0Var, jmy0Var, i, i2);
        }
    }

    public static final void c(final long j, ety0 ety0Var, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2064632657);
        int i4 = (btsVar.d(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (btsVar.k(ety0Var) ? 32 : 16);
        }
        Float f = null;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(null) ? 256 : 128;
        }
        int i6 = i3 | (btsVar.e(wlsVar) ? 2048 : 1024);
        if (btsVar.V(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                ety0Var = null;
            }
            androidx.compose.runtime.internal.a S = wwg.S(-650790565, true, new tmy0(j, f, wlsVar), btsVar);
            if (ety0Var != null) {
                btsVar.e0(-162880673);
                wqy0.a(ety0Var, S, btsVar, ((i6 >> 3) & 14) | 48);
            } else {
                btsVar.e0(-162879037);
                S.invoke(btsVar, 6);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        final ety0 ety0Var2 = ety0Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: umy0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.c(j, ety0Var2, wlsVar, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final Object d(x910 x910Var) {
        Object a = x910Var.a();
        k0y k0yVar = a instanceof k0y ? (k0y) a : null;
        if (k0yVar != null) {
            return k0yVar.a;
        }
        return null;
    }
}
