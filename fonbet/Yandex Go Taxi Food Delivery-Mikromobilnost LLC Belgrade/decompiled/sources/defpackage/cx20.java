package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class cx20 {
    public static final w2o a;
    public static final zmo b;

    static {
        int i = 29;
        a = k.p(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
        b = k.u(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, rz20 rz20Var, gz20 gz20Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, zls zlsVar, a aVar, fid fidVar, int i, int i2) {
        int i3;
        rz20 rz20Var2;
        gz20 gz20Var2;
        v2o v2oVar2;
        int i4;
        ymo ymoVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        f530 f530Var2;
        boolean z4;
        rz20 rz20Var3;
        gz20 gz20Var3;
        v2o v2oVar3;
        ymo ymoVar3;
        boolean z5;
        zls zlsVar2;
        aii0 v;
        zls zlsVar3;
        boolean z6;
        v2o v2oVar4;
        ymo ymoVar4;
        boolean z7;
        f530 f530Var3;
        rz20 rz20Var4;
        f530 f530Var4;
        Object c;
        String e;
        boolean z8;
        int i9;
        int i10;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-339449422);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                rz20Var2 = rz20Var;
                if (btsVar.k(rz20Var2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                rz20Var2 = rz20Var;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            rz20Var2 = rz20Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                gz20Var2 = gz20Var;
                if (btsVar.k(gz20Var2)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                gz20Var2 = gz20Var;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            gz20Var2 = gz20Var;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            v2oVar2 = v2oVar;
            i3 |= btsVar.k(v2oVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                ymoVar2 = ymoVar;
                i3 |= btsVar.k(ymoVar2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    z3 = z;
                    i3 |= btsVar.a(z3) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= btsVar.a(z2) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i7;
                        i3 |= btsVar.e(zlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        if ((i & 100663296) == 0) {
                            i3 |= btsVar.e(aVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                        }
                        if (btsVar.V(i3 & 1, (i3 & 38347923) != 38347922)) {
                            btsVar.a0();
                            if ((i & 1) == 0 || btsVar.C()) {
                                f530 f530Var5 = i11 != 0 ? c530.a : f530Var;
                                if ((i2 & 2) != 0) {
                                    rz20Var2 = com.yandex.go.design.compose.modal.utils.a.a(false, null, btsVar, 0, 7);
                                    i3 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    gz20Var2 = tnb1.e(null, null, btsVar, 7);
                                    i3 &= -897;
                                }
                                if (i12 != 0) {
                                    v2oVar2 = a;
                                }
                                if (i4 != 0) {
                                    ymoVar2 = b;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                boolean z9 = i6 != 0 ? true : z2;
                                if (i8 != 0) {
                                    n8d.a.getClass();
                                    z6 = z9;
                                    zlsVar3 = n8d.b;
                                } else {
                                    zlsVar3 = zlsVar;
                                    z6 = z9;
                                }
                                v2oVar4 = v2oVar2;
                                ymoVar4 = ymoVar2;
                                z7 = z3;
                                f530Var3 = f530Var5;
                            } else {
                                btsVar.Y();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                f530Var3 = f530Var;
                                z6 = z2;
                                zlsVar3 = zlsVar;
                                v2oVar4 = v2oVar2;
                                ymoVar4 = ymoVar2;
                                z7 = z3;
                            }
                            btsVar.u();
                            zx01 O = bvf0.O(rz20Var2.a, "Modal View Appear Animation", btsVar, 48, 0);
                            if (gz20Var2 instanceof cz20) {
                                btsVar.e0(2110842822);
                                cz20 cz20Var = (cz20) gz20Var2;
                                long n = tje.n(cz20Var.a, btsVar);
                                nhs nhsVar = nhs.a;
                                gl11 gl11Var = gtq0.f;
                                boolean g = O.g();
                                o430 o430Var = did.a;
                                if (g) {
                                    rz20Var4 = rz20Var2;
                                    btsVar.e0(1666827533);
                                    btsVar.t(false);
                                    c = O.c();
                                } else {
                                    btsVar.e0(1666573488);
                                    boolean k = btsVar.k(O);
                                    rz20Var4 = rz20Var2;
                                    c = btsVar.Q();
                                    if (k || c == o430Var) {
                                        i2t0 D = tje.D();
                                        tls e2 = D != null ? D.e() : null;
                                        i2t0 O2 = tje.O(D);
                                        try {
                                            Object c2 = O.c();
                                            tje.W(D, O2, e2);
                                            btsVar.o0(c2);
                                            c = c2;
                                        } catch (Throwable th) {
                                            tje.W(D, O2, e2);
                                            throw th;
                                        }
                                    }
                                    btsVar.t(false);
                                }
                                boolean booleanValue = ((Boolean) c).booleanValue();
                                btsVar.e0(1753794890);
                                float f = booleanValue ? 1.0f : 0.0f;
                                btsVar.t(false);
                                Float valueOf = Float.valueOf(f);
                                boolean k2 = btsVar.k(O);
                                Object Q = btsVar.Q();
                                if (k2 || Q == o430Var) {
                                    Q = f.d(new fw0(O, 4));
                                    btsVar.o0(Q);
                                }
                                boolean booleanValue2 = ((Boolean) ((m3u0) Q).getValue()).booleanValue();
                                btsVar.e0(1753794890);
                                float f2 = booleanValue2 ? 1.0f : 0.0f;
                                btsVar.t(false);
                                Float valueOf2 = Float.valueOf(f2);
                                boolean k3 = btsVar.k(O);
                                Object Q2 = btsVar.Q();
                                if (k3 || Q2 == o430Var) {
                                    Q2 = f.d(new fw0(O, 5));
                                    btsVar.o0(Q2);
                                }
                                tx01 s = bvf0.s(O, valueOf, valueOf2, (qar) nhsVar.invoke(((m3u0) Q2).getValue(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                                Integer num = cz20Var.d;
                                if (num == null) {
                                    btsVar.e0(252750009);
                                    btsVar.t(false);
                                    e = null;
                                } else {
                                    btsVar.e0(252750010);
                                    e = ohb1.e(btsVar, num.intValue());
                                    btsVar.t(false);
                                }
                                k3r k3rVar = ljs0.c;
                                boolean d = btsVar.d(n) | btsVar.k(s);
                                Object Q3 = btsVar.Q();
                                if (d || Q3 == o430Var) {
                                    z8 = false;
                                    Q3 = new mhs(n, s, null == true ? 1 : 0);
                                    btsVar.o0(Q3);
                                } else {
                                    z8 = false;
                                }
                                f530 c3 = i470.c(bb1.g(k3rVar, (tls) Q3), cz20Var.b, e);
                                z910 d2 = pi6.d(x4c.b, z8);
                                int hashCode = Long.hashCode(btsVar.T);
                                r1b0 o = btsVar.o();
                                f530 d3 = b.d(btsVar, c3);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar);
                                } else {
                                    btsVar.r0();
                                }
                                qje.W(btsVar, d.f, d2);
                                qje.W(btsVar, d.e, o);
                                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar, d.h);
                                qje.W(btsVar, d.d, d3);
                                b(cj6.a.a(f530Var3, x4c.B), cz20Var.c, O, v2oVar4, ymoVar4, z7, z6, zlsVar3, aVar, btsVar, i3 & 268434432);
                                btsVar.t(true);
                                btsVar.t(false);
                                f530Var4 = f530Var3;
                                btsVar = btsVar;
                            } else {
                                rz20Var4 = rz20Var2;
                                if (!jl40.l(gz20Var2, dz20.a)) {
                                    throw unr0.y(206637979, btsVar, false);
                                }
                                btsVar.e0(2111349052);
                                f530Var4 = f530Var3;
                                b(f530Var4, false, O, v2oVar4, ymoVar4, z7, z6, zlsVar3, aVar, btsVar, (i3 & 14) | 48 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3));
                                btsVar = btsVar;
                                btsVar.t(false);
                            }
                            rz20Var3 = rz20Var4;
                            gz20Var3 = gz20Var2;
                            f530Var2 = f530Var4;
                            v2oVar3 = v2oVar4;
                            ymoVar3 = ymoVar4;
                            z5 = z7;
                            z4 = z6;
                            zlsVar2 = zlsVar3;
                        } else {
                            btsVar.Y();
                            f530Var2 = f530Var;
                            z4 = z2;
                            rz20Var3 = rz20Var2;
                            gz20Var3 = gz20Var2;
                            v2oVar3 = v2oVar2;
                            ymoVar3 = ymoVar2;
                            z5 = z3;
                            zlsVar2 = zlsVar;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new mc0(f530Var2, rz20Var3, gz20Var3, v2oVar3, ymoVar3, z5, z4, zlsVar2, aVar, i, i2);
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 100663296) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (i3 & 38347923) != 38347922)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 100663296) == 0) {
                }
                if (btsVar.V(i3 & 1, (i3 & 38347923) != 38347922)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            ymoVar2 = ymoVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 100663296) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        v2oVar2 = v2oVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        ymoVar2 = ymoVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 100663296) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(f530 f530Var, boolean z, zx01 zx01Var, v2o v2oVar, ymo ymoVar, boolean z2, boolean z3, zls zlsVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1422482977);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(zx01Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(v2oVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(ymoVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.a(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.a(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.e(zlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar2.e(aVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar2.V(i2 & 1, (38347923 & i2) != 38347922)) {
            ((nx2) btsVar2.m(uy2.c)).getClass();
            byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
            f530 f530Var2 = c530.a;
            f530 l = z2 ? ymb1.l(f530Var2, e) : f530Var2;
            if (z3) {
                f530Var2 = bzk0.c(f530Var2, AppColor$Palette.Background, e);
            }
            f530 f530Var3 = f530Var2;
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new qu(13);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            g.d(zx01Var, (tls) Q, f530Var, v2oVar, ymoVar, wwg.S(552560746, true, new tp5(z, zlsVar, f530Var3, l, aVar, 1), btsVar2), btsVar, ((i2 >> 6) & 14) | 196656 | ((i2 << 6) & 896) | (i2 & 7168) | (i2 & HProv.ALG_CLASS_ALL), 0);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq7(f530Var, z, zx01Var, v2oVar, ymoVar, z2, z3, zlsVar, aVar, i);
        }
    }
}
