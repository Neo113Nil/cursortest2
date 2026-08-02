package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ocb1 {
    /* JADX WARN: Removed duplicated region for block: B:103:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, boolean z, qor qorVar, boolean z2, boolean z3, zls zlsVar, float f, int i, wls wlsVar, fid fidVar, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        qor qorVar2;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final wls wlsVar2;
        final float f2;
        final boolean z7;
        final qor qorVar3;
        final zls zlsVar2;
        final int i13;
        final f530 f530Var2;
        final wls wlsVar3;
        final boolean z8;
        final boolean z9;
        aii0 v;
        final zls zlsVar3;
        int i14;
        final int i15;
        final float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1448710616);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z4 = z;
            i4 |= btsVar.a(z4) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                qorVar2 = qorVar;
                i4 |= btsVar.k(qorVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    z5 = z2;
                    i4 |= btsVar.a(z5) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        z6 = z3;
                        i4 |= btsVar.a(z6) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ImageMetadata.EDGE_MODE;
                        } else if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                            i4 |= btsVar.e(zlsVar) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i4 |= 524288;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i4 |= btsVar.c(i) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                            i11 = i4 | 100663296;
                            i12 = i3 & 512;
                            if (i12 == 0) {
                                i11 = i4 | 905969664;
                            } else if ((805306368 & i2) == 0) {
                                wlsVar2 = wlsVar;
                                i11 |= btsVar.e(wlsVar2) ? 536870912 : SelfTester_JCP.IMITA;
                                if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
                                    btsVar.a0();
                                    if ((i2 & 1) == 0 || btsVar.C()) {
                                        f530Var2 = i16 != 0 ? c530.a : f530Var;
                                        if (i17 != 0) {
                                            z4 = true;
                                        }
                                        if (i5 != 0) {
                                            qorVar2 = null;
                                        }
                                        if (i6 != 0) {
                                            z5 = true;
                                        }
                                        if (i7 != 0) {
                                            z6 = true;
                                        }
                                        if (i8 != 0) {
                                            s3d.a.getClass();
                                            zlsVar3 = s3d.b;
                                        } else {
                                            zlsVar3 = zlsVar;
                                        }
                                        i14 = i11 & (-3670017);
                                        i15 = i10 != 0 ? 2 : i;
                                        f3 = 4.0f;
                                        if (i12 != 0) {
                                            wlsVar2 = null;
                                        }
                                    } else {
                                        btsVar.Y();
                                        zlsVar3 = zlsVar;
                                        f3 = f;
                                        i15 = i;
                                        i14 = i11 & (-3670017);
                                        f530Var2 = f530Var;
                                    }
                                    btsVar.u();
                                    dta1.a(f530Var2, z4, qorVar2, z5, z6, wwg.S(921176748, true, new zls() { // from class: xz6
                                        @Override // defpackage.zls
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            boolean z10;
                                            fid fidVar2 = (fid) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            bts btsVar2 = (bts) fidVar2;
                                            boolean V = btsVar2.V(intValue & 1, (intValue & 17) != 16);
                                            dmw0 dmw0Var = btsVar2.a;
                                            if (V) {
                                                c530 c530Var = c530.a;
                                                f530 c = ljs0.c(c530Var, 1.0f);
                                                sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                                int hashCode = Long.hashCode(btsVar2.T);
                                                r1b0 o = btsVar2.o();
                                                f530 d = b.d(btsVar2, c);
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
                                                wls wlsVar4 = d.f;
                                                qje.W(btsVar2, wlsVar4, a);
                                                wls wlsVar5 = d.e;
                                                qje.W(btsVar2, wlsVar5, o);
                                                Integer valueOf = Integer.valueOf(hashCode);
                                                wls wlsVar6 = d.g;
                                                qje.W(btsVar2, wlsVar6, valueOf);
                                                tls tlsVar = d.h;
                                                qje.M(btsVar2, tlsVar);
                                                wls wlsVar7 = d.d;
                                                qje.W(btsVar2, wlsVar7, d);
                                                zls.this.invoke(uic.a, btsVar2, 6);
                                                wls wlsVar8 = wlsVar2;
                                                if (wlsVar8 != null) {
                                                    btsVar2.e0(-953325658);
                                                    f530 o2 = an91.o(c530Var, 8.0f, 4.0f, 8.0f, 0.0f, 8);
                                                    float f4 = f3;
                                                    boolean b = btsVar2.b(f4);
                                                    int i18 = i15;
                                                    boolean c2 = b | btsVar2.c(i18) | btsVar2.a(false);
                                                    Object Q = btsVar2.Q();
                                                    if (c2 || Q == did.a) {
                                                        Q = new n57(f4, i18);
                                                        btsVar2.o0(Q);
                                                    }
                                                    z910 z910Var = (z910) Q;
                                                    int hashCode2 = Long.hashCode(btsVar2.T);
                                                    r1b0 o3 = btsVar2.o();
                                                    f530 d2 = b.d(btsVar2, o2);
                                                    btsVar2.i0();
                                                    if (btsVar2.S) {
                                                        btsVar2.n(slsVar);
                                                    } else {
                                                        btsVar2.r0();
                                                    }
                                                    qje.W(btsVar2, wlsVar4, z910Var);
                                                    qje.W(btsVar2, wlsVar5, o3);
                                                    vfc.v(hashCode2, btsVar2, wlsVar6, btsVar2, tlsVar);
                                                    qje.W(btsVar2, wlsVar7, d2);
                                                    z10 = true;
                                                    qv10.A(0, wlsVar8, btsVar2, true, false);
                                                } else {
                                                    z10 = true;
                                                    btsVar2.e0(-952950868);
                                                    btsVar2.t(false);
                                                }
                                                btsVar2.t(z10);
                                            } else {
                                                btsVar2.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar), btsVar, (i14 & HProv.ALG_CLASS_ALL) | (i14 & 14) | ImageMetadata.EDGE_MODE | (i14 & 112) | (i14 & 896) | (i14 & 7168), 0);
                                    z7 = z4;
                                    zlsVar2 = zlsVar3;
                                    qorVar3 = qorVar2;
                                    i13 = i15;
                                    f2 = f3;
                                    z9 = z6;
                                    wlsVar3 = wlsVar2;
                                    z8 = z5;
                                } else {
                                    btsVar.Y();
                                    f2 = f;
                                    z7 = z4;
                                    qorVar3 = qorVar2;
                                    zlsVar2 = zlsVar;
                                    i13 = i;
                                    f530Var2 = f530Var;
                                    wlsVar3 = wlsVar2;
                                    z8 = z5;
                                    z9 = z6;
                                }
                                v = btsVar.v();
                                if (v != null) {
                                    v.d = new wls() { // from class: yz6
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            ocb1.a(f530.this, z7, qorVar3, z8, z9, zlsVar2, f2, i13, wlsVar3, (fid) obj, vng.O(i2 | 1), i3);
                                            return zy11.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            wlsVar2 = wlsVar;
                            if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
                            }
                            v = btsVar.v();
                            if (v != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i4 | 100663296;
                        i12 = i3 & 512;
                        if (i12 == 0) {
                        }
                        wlsVar2 = wlsVar;
                        if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    z6 = z3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i4 | 100663296;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    wlsVar2 = wlsVar;
                    if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                z6 = z3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i4 | 100663296;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                wlsVar2 = wlsVar;
                if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            qorVar2 = qorVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            z6 = z3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4 | 100663296;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            wlsVar2 = wlsVar;
            if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z4 = z;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qorVar2 = qorVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z6 = z3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4 | 100663296;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        wlsVar2 = wlsVar;
        if (btsVar.V(i11 & 1, (i11 & 306783379) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, float f, long j, long j2, ehr0 ehr0Var, int i, rbn rbnVar, fid fidVar, int i2, int i3) {
        int i4;
        float f2;
        int i5;
        ehr0 ehr0Var2;
        int i6;
        int i7;
        rbn rbnVar2;
        float f3;
        ehr0 ehr0Var3;
        aii0 v;
        int i8;
        float f4;
        ehr0 ehr0Var4;
        rbn rbnVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(977018454);
        if ((i2 & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f2 = f;
            i4 |= btsVar.b(f2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= btsVar.d(j) ? 256 : 128;
            }
            if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i4 |= btsVar.d(j2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                ehr0Var2 = ehr0Var;
                i4 |= btsVar.k(ehr0Var2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ImageMetadata.EDGE_MODE;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                        i4 |= btsVar.c(i7) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    i4 |= 524288;
                }
                if (btsVar.V(i4 & 1, (i4 & 599187) != 599186)) {
                    btsVar.a0();
                    if ((i2 & 1) == 0 || btsVar.C()) {
                        if (i9 != 0) {
                            f2 = 150.0f;
                        }
                        if (i5 != 0) {
                            ehr0Var2 = qke.q;
                        }
                        if (i6 != 0) {
                            i7 = 1500;
                        }
                        i8 = i4 & (-3670017);
                        f4 = f2;
                        ehr0Var4 = ehr0Var2;
                        rbnVar3 = ubn.a;
                    } else {
                        btsVar.Y();
                        i8 = i4 & (-3670017);
                        f4 = f2;
                        ehr0Var4 = ehr0Var2;
                        rbnVar3 = rbnVar;
                    }
                    int i10 = i8;
                    btsVar.u();
                    osv d = d(i7, rbnVar3, btsVar);
                    float w0 = ((fwi) btsVar.m(j.h)).w0(f4);
                    boolean b = ((((i10 & 896) ^ 384) > 256 && btsVar.d(j)) || (i10 & 384) == 256) | btsVar.b(w0) | ((((i10 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j2)) || (i10 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | btsVar.k(d) | ((57344 & i10) == 16384);
                    Object Q = btsVar.Q();
                    if (b || Q == did.a) {
                        Q = new evr0(w0, j, j2, ehr0Var4, d, 0);
                        btsVar.o0(Q);
                    }
                    qeb1.a(i10 & 14, btsVar, (tls) Q, f530Var);
                    ehr0Var3 = ehr0Var4;
                    f3 = f4;
                    rbnVar2 = rbnVar3;
                } else {
                    btsVar.Y();
                    rbnVar2 = rbnVar;
                    f3 = f2;
                    ehr0Var3 = ehr0Var2;
                }
                int i11 = i7;
                v = btsVar.v();
                if (v != null) {
                    v.d = new fvr0(f530Var, f3, j, j2, ehr0Var3, i11, rbnVar2, i2, i3, 0);
                    return;
                }
                return;
            }
            ehr0Var2 = ehr0Var;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (btsVar.V(i4 & 1, (i4 & 599187) != 599186)) {
            }
            int i112 = i7;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f2 = f;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        ehr0Var2 = ehr0Var;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (btsVar.V(i4 & 1, (i4 & 599187) != 599186)) {
        }
        int i1122 = i7;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void c(f530 f530Var, float f, long j, long j2, ehr0 ehr0Var, int i, rbn rbnVar, fid fidVar, int i2, int i3) {
        int i4;
        long j3;
        ehr0 ehr0Var2;
        int i5;
        float f2;
        long j4;
        long j5;
        int i6;
        rbn rbnVar2;
        rbn rbnVar3;
        int i7;
        float f3;
        int i8;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1774914037);
        if ((i2 & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        long j6 = j;
        int i9 = i4 | 48 | (((i3 & 4) == 0 && btsVar.d(j6)) ? 256 : 128);
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            j3 = j2;
            i9 |= ((i3 & 8) == 0 && btsVar.d(j3)) ? 2048 : 1024;
        } else {
            j3 = j2;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | HProv.ALG_CLASS_DATA_ENCRYPT;
            ehr0Var2 = ehr0Var;
        } else {
            ehr0Var2 = ehr0Var;
            i5 = i9 | (btsVar.k(ehr0Var2) ? 16384 : 8192);
        }
        int i11 = i5 | 720896;
        if (btsVar.V(i11 & 1, (599187 & i11) != 599186)) {
            btsVar.a0();
            if ((i2 & 1) == 0 || btsVar.C()) {
                if ((i3 & 4) != 0) {
                    j6 = ((Boolean) btsVar.m(qti.e)).booleanValue() ? dl51.j : dl51.c;
                    i11 &= -897;
                }
                if ((i3 & 8) != 0) {
                    j3 = ((Boolean) btsVar.m(qti.e)).booleanValue() ? dl51.k : dl51.f;
                    i11 &= -7169;
                }
                if (i10 != 0) {
                    ehr0Var2 = qke.q;
                }
                rbnVar3 = ubn.a;
                i7 = i11 & (-3670017);
                f3 = 150.0f;
                i8 = 1500;
            } else {
                btsVar.Y();
                if ((i3 & 4) != 0) {
                    i11 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i11 &= -7169;
                }
                i7 = i11 & (-3670017);
                f3 = f;
                i8 = i;
                rbnVar3 = rbnVar;
            }
            btsVar.u();
            osv d = d(i8, rbnVar3, btsVar);
            float w0 = ((fwi) btsVar.m(j.h)).w0(f3);
            rbn rbnVar4 = rbnVar3;
            boolean b = ((((i7 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j3)) || (i7 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | btsVar.b(w0) | ((((i7 & 896) ^ 384) > 256 && btsVar.d(j6)) || (i7 & 384) == 256) | btsVar.k(d) | ((57344 & i7) == 16384);
            Object Q = btsVar.Q();
            if (b || Q == did.a) {
                Q = new evr0(w0, j6, j3, ehr0Var2, d, 1);
                btsVar.o0(Q);
            }
            qeb1.a(i7 & 14, btsVar, (tls) Q, f530Var);
            j4 = j6;
            j5 = j3;
            f2 = f3;
            i6 = i8;
            rbnVar2 = rbnVar4;
        } else {
            btsVar.Y();
            f2 = f;
            j4 = j6;
            j5 = j3;
            i6 = i;
            rbnVar2 = rbnVar;
        }
        ehr0 ehr0Var3 = ehr0Var2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fvr0(f530Var, f2, j4, j5, ehr0Var3, i6, rbnVar2, i2, i3, 1);
        }
    }

    public static final osv d(int i, rbn rbnVar, fid fidVar) {
        return z5b1.d(z5b1.g("transition", fidVar, 0), 0.0f, 1.0f, sb2.w(sb2.K(i, 0, rbnVar, 2), null, 0L, 6), "position", fidVar, 29112, 0);
    }

    public static String e(int i) {
        switch (i) {
            case 1:
                return "if";
            case 2:
                return "else";
            case 3:
                return "while";
            case 4:
                return "continue";
            case 5:
                return "break";
            case 6:
                return "throw";
            case 7:
                return "assert";
            case 8:
                return "return";
            case 9:
                return "true";
            case 10:
                return "false";
            case 11:
                return "breakpoint";
            default:
                return StringUtils.UNDEFINED;
        }
    }

    public static final f530 f(f530 f530Var, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(805767181);
        gji0 gji0Var = qke.q;
        long c = ((el51) btsVar.m(gl51.a)).c();
        long j = ldc.l;
        tbn tbnVar = ubn.d;
        if (!z) {
            btsVar.t(false);
            return f530Var;
        }
        osv d = d(800, tbnVar, btsVar);
        float w0 = ((fwi) btsVar.m(j.h)).w0(150.0f);
        boolean z2 = true;
        boolean b = btsVar.b(w0) | ((((57344 & i) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.d(c)) || (i & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | ((((458752 & i) ^ ImageMetadata.EDGE_MODE) > 131072 && btsVar.d(j)) || (i & ImageMetadata.EDGE_MODE) == 131072) | btsVar.k(d);
        if ((((i & 896) ^ 384) <= 256 || !btsVar.k(gji0Var)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean z3 = b | z2;
        Object Q = btsVar.Q();
        if (z3 || Q == did.a) {
            ajf0 ajf0Var = new ajf0(w0, c, j, d);
            btsVar.o0(ajf0Var);
            Q = ajf0Var;
        }
        f530 i2 = bb1.i(f530Var, (tls) Q);
        btsVar.t(false);
        return i2;
    }

    public static final qiy g(long j, long j2, float f, float f2, float f3) {
        float f4 = (f2 * 2.0f) + f;
        float f5 = f + f2;
        float f6 = f3 * (f5 / f4);
        return zoy0.B(new Pair[]{new Pair(Float.valueOf(f6), new ldc(j2)), new Pair(Float.valueOf(((f2 / 2.0f) / f4) + f6), new ldc(j)), new Pair(Float.valueOf(f6 + (f2 / f4)), new ldc(j2))}, -f2, f5, 8);
    }
}
