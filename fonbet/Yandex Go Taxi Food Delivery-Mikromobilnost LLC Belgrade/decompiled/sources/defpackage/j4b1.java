package defpackage;

import android.graphics.PointF;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class j4b1 {
    public static final void a(wxo0 wxo0Var, tls tlsVar, fid fidVar, int i) {
        boolean z;
        o430 o430Var;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-142169467);
        int i2 = 2;
        int i3 = i | (btsVar.k(wxo0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 k = an91.k(i9a1.d(ljs0.c(c530Var2, 1.0f)), 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            vxo0 vxo0Var = wxo0Var.d;
            o430 o430Var2 = did.a;
            if (vxo0Var == null) {
                btsVar.e0(-1029111950);
                btsVar.t(false);
                c530Var = c530Var2;
                z = false;
                o430Var = o430Var2;
            } else {
                btsVar.e0(-1029111949);
                boolean z2 = (i3 & 112) == 32;
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var2) {
                    Q = new lao0(6, tlsVar);
                    btsVar.o0(Q);
                }
                z = false;
                o430Var = o430Var2;
                c530Var = c530Var2;
                xlb1.a((sls) Q, ljs0.c(c530Var2, 1.0f), false, null, null, wwg.S(406247149, true, new w7o0(i2, vxo0Var), btsVar), null, null, null, btsVar, 196656, 988);
                ly3.B(c530Var, 4.0f, btsVar, false);
            }
            boolean z3 = (i3 & 112) == 32 ? true : z;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new lao0(7, tlsVar);
                btsVar.o0(Q2);
            }
            phb1.b((sls) Q2, ljs0.c(c530Var, 1.0f), false, null, null, wwg.S(1288279482, true, new w7o0(3, wxo0Var), btsVar), null, null, null, btsVar, 196656, 988);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(wxo0Var, tlsVar, i, 28);
        }
    }

    public static final void b(wxo0 wxo0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1404070283);
        int i2 = i | (btsVar.k(wxo0Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 16.0f, 12.0f, 16.0f, 0.0f, 8);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(wxo0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (wxo0Var.b.length() > 0) {
                tse0.s(btsVar, 1117427087, c530Var, 8.0f, btsVar);
                qgy.b(wxo0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(1117609677);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(wxo0Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final n8v n8vVar, f530 f530Var, String str, kfv kfvVar, jt1 jt1Var, nhe nheVar, float f, int i, fid fidVar, final int i2, final int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        String str2;
        int i6;
        int i7;
        jt1 jt1Var2;
        int i8;
        nhe nheVar2;
        int i9;
        int i10;
        bts btsVar;
        final kfv kfvVar2;
        final int i11;
        final f530 f530Var3;
        final String str3;
        final jt1 jt1Var3;
        final nhe nheVar3;
        final float f2;
        aii0 v;
        kfv kfvVar3;
        int i12;
        jt1 jt1Var4;
        String str4;
        nhe nheVar4;
        int i13;
        float f3;
        kfv kfvVar4;
        wp2 wp2Var;
        ldc ldcVar;
        int i14;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-561769244);
        if ((i2 & 6) == 0) {
            i4 = (btsVar2.k(n8vVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar2.k(f530Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                str2 = str;
                i4 |= btsVar2.k(str2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i4 |= (i2 & 4096) == 0 ? btsVar2.k(kfvVar) : btsVar2.e(kfvVar) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    jt1Var2 = jt1Var;
                    i4 |= btsVar2.k(jt1Var2) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i2) == 0) {
                        nheVar2 = nheVar;
                        i4 |= btsVar2.k(nheVar2) ? 131072 : 65536;
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= btsVar2.b(f) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0 && btsVar2.c(i)) {
                                i14 = SelfTester_JCP.ENCRYPT_CNT;
                                i4 |= i14;
                            }
                            i14 = SelfTester_JCP.ENCRYPT_CBC;
                            i4 |= i14;
                        }
                        i10 = i4;
                        boolean z = false;
                        if (btsVar2.V(i10 & 1, (i4 & 4793491) != 4793490)) {
                            btsVar2.a0();
                            if ((i2 & 1) == 0 || btsVar2.C()) {
                                if (i15 != 0) {
                                    f530Var2 = c530.a;
                                }
                                if (i5 != 0) {
                                    str2 = null;
                                }
                                kfvVar3 = i6 != 0 ? null : kfvVar;
                                jt1 jt1Var5 = i7 != 0 ? x4c.y : jt1Var2;
                                nhe nheVar5 = i8 != 0 ? mhe.b : nheVar2;
                                float f4 = i9 != 0 ? 1.0f : f;
                                if ((i3 & 128) != 0) {
                                    jt1Var4 = jt1Var5;
                                    nheVar4 = nheVar5;
                                    i13 = i10 & (-29360129);
                                    i12 = 1;
                                    str4 = str2;
                                    f3 = f4;
                                } else {
                                    i12 = i;
                                    jt1Var4 = jt1Var5;
                                    str4 = str2;
                                    nheVar4 = nheVar5;
                                    i13 = i10;
                                    f3 = f4;
                                }
                            } else {
                                btsVar2.Y();
                                if ((i3 & 128) != 0) {
                                    i12 = i;
                                    i13 = i10 & (-29360129);
                                    nheVar4 = nheVar2;
                                    kfvVar3 = kfvVar;
                                } else {
                                    kfvVar3 = kfvVar;
                                    i12 = i;
                                    i13 = i10;
                                    nheVar4 = nheVar2;
                                }
                                jt1Var4 = jt1Var2;
                                str4 = str2;
                                f3 = f;
                            }
                            btsVar2.u();
                            if (kfvVar3 == null) {
                                kfvVar4 = n8vVar.e;
                                if (kfvVar4 == null) {
                                    kfv.a.getClass();
                                    kfvVar4 = ifv.b;
                                }
                            } else {
                                kfvVar4 = kfvVar3;
                            }
                            if (kfvVar4 instanceof hfv) {
                                wp2Var = n8vVar.c ? ((hfv) kfvVar4).b : null;
                            } else {
                                if (!(kfvVar4 instanceof jfv)) {
                                    w511.b();
                                    return;
                                }
                                wp2Var = ((jfv) kfvVar4).b;
                            }
                            if (wp2Var == null) {
                                btsVar2.e0(1820574134);
                                btsVar2.t(false);
                                ldcVar = null;
                            } else {
                                btsVar2.e0(1305654187);
                                long n = tje.n(wp2Var, btsVar2);
                                btsVar2.t(false);
                                ldcVar = new ldc(n);
                            }
                            c36 c36Var = ldcVar != null ? new c36(ldcVar.a, 5) : null;
                            if (n8vVar.d) {
                                btsVar2.e0(1305656663);
                                boolean z2 = btsVar2.m(j.n) == LayoutDirection.Rtl;
                                btsVar2.t(false);
                                z = z2;
                            } else {
                                btsVar2.e0(1820652126);
                                btsVar2.t(false);
                            }
                            btsVar = btsVar2;
                            o4b1.c(n8vVar.b, str4, gza1.b(f530Var2, z ? -1.0f : 1.0f, 1.0f), jt1Var4, nheVar4, f3, c36Var, i12, btsVar, ((i13 >> 3) & 523376) | (29360128 & i13), 0);
                            kfvVar2 = kfvVar3;
                            f530Var3 = f530Var2;
                            str3 = str4;
                            jt1Var3 = jt1Var4;
                            nheVar3 = nheVar4;
                            f2 = f3;
                            i11 = i12;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            kfvVar2 = kfvVar;
                            i11 = i;
                            f530Var3 = f530Var2;
                            str3 = str2;
                            jt1Var3 = jt1Var2;
                            nheVar3 = nheVar2;
                            f2 = f;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: s9v
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j4b1.c(n8v.this, f530Var3, str3, kfvVar2, jt1Var3, nheVar3, f2, i11, (fid) obj, vng.O(i2 | 1), i3);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    nheVar2 = nheVar;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i4;
                    boolean z3 = false;
                    if (btsVar2.V(i10 & 1, (i4 & 4793491) != 4793490)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                jt1Var2 = jt1Var;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                nheVar2 = nheVar;
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i4;
                boolean z32 = false;
                if (btsVar2.V(i10 & 1, (i4 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            str2 = str;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            jt1Var2 = jt1Var;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            nheVar2 = nheVar;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i4;
            boolean z322 = false;
            if (btsVar2.V(i10 & 1, (i4 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        jt1Var2 = jt1Var;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        nheVar2 = nheVar;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i4;
        boolean z3222 = false;
        if (btsVar2.V(i10 & 1, (i4 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void d(wxo0 wxo0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-531056731);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wxo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(tlsVar, 8, wxo0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(wxo0Var, tlsVar, i, 9);
        }
    }

    public static final PointF e(float f, PointF pointF) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    public static final PointF f(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static final PointF g(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        return new PointF(pointF.x / sqrt, pointF.y / sqrt);
    }

    public static final PointF h(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static final PointF i(float f, PointF pointF) {
        return new PointF(pointF.x * f, pointF.y * f);
    }
}
