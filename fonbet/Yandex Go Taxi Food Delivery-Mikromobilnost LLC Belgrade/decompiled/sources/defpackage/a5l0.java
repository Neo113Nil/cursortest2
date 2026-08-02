package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.List;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a5l0 {
    public static final float a = (58.0f + 40.0f) + 4.0f;
    public static final Regex b = new Regex("(\\d+)");
    public static final Regex c = new Regex("(?i)(?<![A-Za-z])([ap])(m)(?![A-Za-z])");
    public static final Regex d = new Regex("(?i)\\s+([ap] [mM])(?![A-Za-z])");
    public static final Regex e = new Regex("(?<=\\s)(\\p{L}+)");

    public static final void a(h711 h711Var, f530 f530Var, sls slsVar, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, boolean z, boolean z2, fid fidVar, int i) {
        int i2;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1676008398);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(h711Var) : btsVar.e(h711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(tlsVar4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(tlsVar5) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i2 |= btsVar.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (!btsVar.V(i2 & 1, (306783379 & i2) != 306783378)) {
            btsVar.Y();
        } else if (h711Var instanceof h611) {
            btsVar.e0(31350015);
            h6u0.b((h611) h711Var, f530Var, z, btsVar, ((i2 >> 18) & 896) | (i2 & HProv.PP_DELETE_SAVED_PASSWD));
            btsVar.t(false);
        } else if (h711Var instanceof r611) {
            btsVar.e0(31355199);
            jh91.b((r611) h711Var, f530Var, z, btsVar, ((i2 >> 18) & 896) | (i2 & HProv.PP_DELETE_SAVED_PASSWD));
            btsVar.t(false);
        } else if (h711Var instanceof n611) {
            btsVar.e0(31360256);
            coa1.e((n611) h711Var, f530Var, z, btsVar, ((i2 >> 18) & 896) | (i2 & HProv.PP_DELETE_SAVED_PASSWD));
            btsVar.t(false);
        } else {
            boolean z4 = h711Var instanceof i611;
            o430 o430Var = did.a;
            if (z4) {
                btsVar.e0(31365615);
                int i3 = i2;
                i611 i611Var = (i611) h711Var;
                z3 = (29360128 & i3) == 8388608;
                Object Q = btsVar.Q();
                if (z3 || Q == o430Var) {
                    Q = new gv40(27, tlsVar5);
                    btsVar.o0(Q);
                }
                w5b1.a(i611Var, f530Var, z, (tls) Q, btsVar, ((i3 >> 18) & 896) | (i3 & HProv.PP_DELETE_SAVED_PASSWD));
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                int i4 = i2;
                if (h711Var instanceof g611) {
                    btsVar.e0(972543720);
                    if (z) {
                        btsVar.e0(972570442);
                        s5b1.a((g611) h711Var, f530Var, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(972672308);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else if (h711Var instanceof l611) {
                    btsVar.e0(31378360);
                    u7a1.a((l611) h711Var, f530Var, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
                    btsVar.t(false);
                } else if (h711Var instanceof j611) {
                    btsVar.e0(31382349);
                    yj5.a((j611) h711Var, f530Var, z, tlsVar4, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896) | ((i4 >> 9) & 7168));
                    btsVar = btsVar;
                    btsVar.t(false);
                } else if (h711Var instanceof k611) {
                    btsVar.e0(31389202);
                    k611 k611Var = (k611) h711Var;
                    z3 = (i4 & 29360128) == 8388608;
                    Object Q2 = btsVar.Q();
                    if (z3 || Q2 == o430Var) {
                        Q2 = new gv40(25, tlsVar5);
                        btsVar.o0(Q2);
                    }
                    z5b1.a(k611Var, f530Var, z, (tls) Q2, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896));
                    btsVar = btsVar;
                    btsVar.t(false);
                } else if (h711Var instanceof m611) {
                    btsVar.e0(31396033);
                    a8a1.a((m611) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof q611) {
                    btsVar.e0(31401381);
                    z8b1.b((q611) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof s611) {
                    btsVar.e0(31406762);
                    s611 s611Var = (s611) h711Var;
                    rgb1.a(s611Var, f530Var, z, (!z || z2 || s611Var.g) ? false : true, slsVar, btsVar, ((i4 << 6) & HProv.ALG_CLASS_ALL) | (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896));
                    btsVar.t(false);
                } else if (h711Var instanceof w611) {
                    btsVar.e0(973882548);
                    if (z) {
                        btsVar.e0(974061108);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(973910231);
                        sob1.b((w611) h711Var, f530Var, tlsVar, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 3) & 896));
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else if (h711Var instanceof b711) {
                    btsVar.e0(31423262);
                    int i5 = (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896);
                    int i6 = i4 >> 3;
                    ksb1.a((b711) h711Var, f530Var, z, tlsVar2, tlsVar3, btsVar, i5 | (i6 & 7168) | (i6 & HProv.ALG_CLASS_ALL));
                    btsVar.t(false);
                } else if (h711Var instanceof c711) {
                    btsVar.e0(31430395);
                    gtb1.a((c711) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof d711) {
                    btsVar.e0(31435418);
                    jtb1.a((d711) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof e711) {
                    btsVar.e0(31440443);
                    iub1.c((e711) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof f711) {
                    btsVar.e0(31445866);
                    z0s.a((f711) h711Var, f530Var, z, btsVar, ((i4 >> 18) & 896) | (i4 & HProv.PP_DELETE_SAVED_PASSWD));
                    btsVar.t(false);
                } else if (h711Var instanceof g711) {
                    btsVar.e0(974991883);
                    if (z) {
                        btsVar.e0(975117588);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(975019566);
                        nht.a((g711) h711Var, f530Var, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else if (h711Var instanceof d611) {
                    btsVar.e0(31457011);
                    jra1.a((d611) h711Var, f530Var, z, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896), 0);
                    btsVar = btsVar;
                    btsVar.t(false);
                } else if (h711Var instanceof e611) {
                    btsVar.e0(975321289);
                    if (z) {
                        btsVar.e0(975448916);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(975348972);
                        e4b1.a((e611) h711Var, f530Var, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else if (h711Var instanceof f611) {
                    btsVar.e0(31468236);
                    f611 f611Var = (f611) h711Var;
                    z3 = (i4 & 29360128) == 8388608;
                    Object Q3 = btsVar.Q();
                    if (z3 || Q3 == o430Var) {
                        Q3 = new gv40(26, tlsVar5);
                        btsVar.o0(Q3);
                    }
                    q5b1.c(f611Var, f530Var, z, tlsVar, (tls) Q3, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 18) & 896) | (i4 & 7168));
                    btsVar.t(false);
                } else {
                    if (!(h711Var instanceof v611)) {
                        throw unr0.y(31352357, btsVar, false);
                    }
                    btsVar.e0(975786165);
                    if (z) {
                        btsVar.e0(975994516);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(975813848);
                        wkb1.e((v611) h711Var, f530Var, 0.0f, z, tlsVar4, btsVar, (i4 & HProv.PP_DELETE_SAVED_PASSWD) | ((i4 >> 15) & 7168) | ((i4 >> 6) & HProv.ALG_CLASS_ALL));
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                }
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new x4l0(h711Var, f530Var, slsVar, tlsVar, tlsVar2, tlsVar3, tlsVar4, tlsVar5, z, z2, i);
        }
    }

    public static final void b(final h711 h711Var, final f530 f530Var, final sls slsVar, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, final tls tlsVar4, final tls tlsVar5, final boolean z, final boolean z2, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(125721371);
        int i2 = i | (btsVar.k(h711Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(tlsVar2) ? 16384 : 8192) | (btsVar.e(tlsVar3) ? 131072 : 65536) | (btsVar.e(tlsVar4) ? 1048576 : 524288) | (btsVar.e(tlsVar5) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.a(z2) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i2 & 1, (306783379 & i2) != 306783378)) {
            a(h711Var, f530Var, slsVar, tlsVar, tlsVar2, tlsVar4, tlsVar3, tlsVar5, z, z2, btsVar, (65534 & i2) | ((i2 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i2 << 3)) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f530Var, slsVar, tlsVar, tlsVar2, tlsVar3, tlsVar4, tlsVar5, z, z2, i) { // from class: z4l0
                public final /* synthetic */ tls A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;
                public final /* synthetic */ tls y;
                public final /* synthetic */ tls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    a5l0.b(h711.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.runtime.internal.a] */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.compose.runtime.internal.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.lang.Object, zls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, float f, float f2, jt1 jt1Var, float f3, ety0 ety0Var, y7m y7mVar, a aVar, zls zlsVar, a aVar2, fid fidVar, int i, int i2) {
        int i3;
        float f4;
        float f5;
        jt1 jt1Var2;
        int i4;
        int i5;
        y7m y7mVar2;
        int i6;
        float f6;
        float f7;
        a aVar3;
        aii0 v;
        float f8;
        int i7;
        float f9;
        float f10;
        float f11;
        int i8;
        int i9;
        a aVar4 = aVar2;
        uo5 uo5Var = x4c.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1388576834);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f4 = f;
                if (btsVar.b(f4)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                f4 = f;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            f4 = f;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f5 = f2;
                if (btsVar.b(f5)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                f5 = f2;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            f5 = f2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            jt1Var2 = jt1Var;
            i3 |= btsVar.k(jt1Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.b(f3) ? 16384 : 8192;
                if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    i3 |= btsVar.k(ety0Var) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    y7mVar2 = y7mVar;
                } else {
                    y7mVar2 = y7mVar;
                    if ((i & 1572864) == 0) {
                        i3 |= btsVar.k(y7mVar2) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    i3 |= btsVar.e(aVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                if ((i & 100663296) == 0) {
                    i3 |= btsVar.e(zlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                if ((i & 805306368) == 0) {
                    i3 |= btsVar.e(aVar4) ? 536870912 : SelfTester_JCP.IMITA;
                }
                i6 = i3;
                if (btsVar.V(i6 & 1, (i3 & 306783379) != 306783378)) {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        if ((i2 & 2) != 0) {
                            f8 = SlotSize.L.getSize();
                            i7 = i6 & (-113);
                        } else {
                            f8 = f4;
                            i7 = i6;
                        }
                        if ((i2 & 4) != 0) {
                            f5 = SlotSize.L.getSize();
                            i7 &= -897;
                        }
                        if (i10 != 0) {
                            jt1Var2 = uo5Var;
                        }
                        f9 = i4 != 0 ? 4.0f : f3;
                        if (i5 != 0) {
                            y7mVar2 = null;
                        }
                    } else {
                        btsVar.Y();
                        int i11 = (i2 & 2) != 0 ? i6 & (-113) : i6;
                        if ((i2 & 4) != 0) {
                            i11 &= -897;
                        }
                        float f12 = f4;
                        i7 = i11;
                        f8 = f12;
                        f9 = f3;
                    }
                    btsVar.u();
                    float f13 = f(xya1.e(btsVar).h.a, f8, btsVar, 0);
                    if (y7mVar2 != null) {
                        f10 = y7mVar2.a;
                    } else if (ety0Var != null) {
                        btsVar.e0(2033177064);
                        f10 = f(ety0Var, 0.0f, btsVar, 2);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(2033241110);
                        btsVar.t(false);
                        f10 = 0.0f;
                    }
                    float f14 = f10;
                    f530 b2 = ljs0.b(ljs0.c(f530Var, 1.0f), 0.0f, f8, 1);
                    lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 48);
                    y7m y7mVar3 = y7mVar2;
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, b2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, a2);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d2);
                    int i12 = i7;
                    c530 c530Var = c530.a;
                    jt1 jt1Var3 = jt1Var2;
                    f530 o2 = an91.o(ljs0.b(ljs0.q(c530Var, 58.0f), 0.0f, f8, 1), 16.0f, f13, 0.0f, 0.0f, 12);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        f11 = f8;
                        Q = new z0l0(4);
                        btsVar.o0(Q);
                    } else {
                        f11 = f8;
                    }
                    f530 a3 = fnq0.a(o2, (tls) Q);
                    int i13 = ((i12 >> 12) & 7168) | 48;
                    z910 d3 = pi6.d(uo5Var, false);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o3 = btsVar.o();
                    f530 d4 = b.d(btsVar, a3);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d3);
                    qje.W(btsVar, wlsVar2, o3);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d4);
                    Integer valueOf2 = Integer.valueOf(((i13 >> 6) & 112) | 6);
                    cj6 cj6Var = cj6.a;
                    aVar.invoke(cj6Var, btsVar, valueOf2);
                    btsVar.t(true);
                    f530 n = ljs0.n(c530Var, 40.0f, f5);
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new z0l0(4);
                        btsVar.o0(Q2);
                    }
                    f530 a4 = fnq0.a(n, (tls) Q2);
                    int i14 = ((i12 >> 15) & 7168) | 48;
                    z910 d5 = pi6.d(x4c.y, false);
                    int hashCode3 = Long.hashCode(btsVar.T);
                    r1b0 o4 = btsVar.o();
                    f530 d6 = b.d(btsVar, a4);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d5);
                    qje.W(btsVar, wlsVar2, o4);
                    vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d6);
                    zlsVar.invoke(cj6Var, btsVar, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    btsVar.t(true);
                    f7 = f11;
                    f530 o5 = an91.o(ljs0.b(new x2y(1.0f, true), 0.0f, f7, 1), f9, f14, 16.0f, 0.0f, 8);
                    jt1Var2 = jt1Var3;
                    z910 d7 = pi6.d(jt1Var2, false);
                    int hashCode4 = Long.hashCode(btsVar.T);
                    r1b0 o6 = btsVar.o();
                    f530 d8 = b.d(btsVar, o5);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d7);
                    qje.W(btsVar, wlsVar2, o6);
                    vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d8);
                    ?? r10 = aVar2;
                    r10.invoke(btsVar, Integer.valueOf((i12 >> 27) & 14));
                    btsVar.t(true);
                    btsVar.t(true);
                    y7mVar2 = y7mVar3;
                    f6 = f9;
                    aVar3 = r10;
                } else {
                    btsVar.Y();
                    f6 = f3;
                    f7 = f4;
                    aVar3 = aVar4;
                }
                jt1 jt1Var4 = jt1Var2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new y4l0(f530Var, f7, f5, jt1Var4, f6, ety0Var, y7mVar2, (a) aVar, (zls) zlsVar, aVar3, i, i2);
                    return;
                }
                return;
            }
            if ((i & ImageMetadata.EDGE_MODE) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i6 = i3;
            if (btsVar.V(i6 & 1, (i3 & 306783379) != 306783378)) {
            }
            jt1 jt1Var42 = jt1Var2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        jt1Var2 = jt1Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i6 = i3;
        if (btsVar.V(i6 & 1, (i3 & 306783379) != 306783378)) {
        }
        jt1 jt1Var422 = jt1Var2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, f530 f530Var, float f, float f2, jt1 jt1Var, float f3, ety0 ety0Var, y7m y7mVar, zls zlsVar, a aVar, fid fidVar, int i, int i2) {
        int i3;
        jt1 jt1Var2;
        int i4;
        float f4;
        int i5;
        ety0 ety0Var2;
        int i6;
        int i7;
        y7m y7mVar2;
        int i8;
        int i9;
        bts btsVar;
        float f5;
        float f6;
        jt1 jt1Var3;
        float f7;
        ety0 ety0Var3;
        y7m y7mVar3;
        aii0 v;
        float f8;
        float f9;
        float f10;
        jt1 jt1Var4;
        float f11;
        ety0 ety0Var4;
        y7m y7mVar4;
        float f12;
        int i10;
        int i11;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1491088707);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && btsVar2.b(f)) {
                i11 = 256;
                i3 |= i11;
            }
            i11 = 128;
            i3 |= i11;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            if ((i2 & 8) == 0 && btsVar2.b(f2)) {
                i10 = 2048;
                i3 |= i10;
            }
            i10 = 1024;
            i3 |= i10;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            jt1Var2 = jt1Var;
            i3 |= btsVar2.k(jt1Var2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                f4 = f3;
                i3 |= btsVar2.b(f4) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    ety0Var2 = ety0Var;
                    i3 |= btsVar2.k(ety0Var2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = 12582912;
                        y7mVar2 = y7mVar;
                    } else {
                        i7 = 12582912;
                        y7mVar2 = y7mVar;
                        if ((i & 12582912) == 0) {
                            i3 |= btsVar2.k(y7mVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                    }
                    if ((i & 100663296) != 0) {
                        i8 = i3 | (btsVar2.e(zlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
                    } else {
                        i8 = i3;
                    }
                    if ((i & 805306368) == 0) {
                        i8 |= btsVar2.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                    i9 = i8;
                    if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        f5 = f;
                        f6 = f2;
                        jt1Var3 = jt1Var2;
                        f7 = f4;
                        ety0Var3 = ety0Var2;
                        y7mVar3 = y7mVar2;
                    } else {
                        btsVar2.a0();
                        if ((i & 1) == 0 || btsVar2.C()) {
                            if ((i2 & 4) != 0) {
                                f8 = SlotSize.L.getSize();
                                i9 &= -897;
                            } else {
                                f8 = f;
                            }
                            if ((i2 & 8) != 0) {
                                f9 = SlotSize.L.getSize();
                                i9 &= -7169;
                            } else {
                                f9 = f2;
                            }
                            if (i12 != 0) {
                                jt1Var2 = x4c.b;
                            }
                            float f13 = i4 != 0 ? 4.0f : f4;
                            if (i5 != 0) {
                                ety0Var2 = null;
                            }
                            if (i6 != 0) {
                                f10 = f8;
                                f12 = f9;
                                jt1Var4 = jt1Var2;
                                f11 = f13;
                                y7mVar4 = null;
                                ety0Var4 = ety0Var2;
                            } else {
                                f10 = f8;
                                jt1Var4 = jt1Var2;
                                f11 = f13;
                                ety0Var4 = ety0Var2;
                                y7mVar4 = y7mVar2;
                                f12 = f9;
                            }
                        } else {
                            btsVar2.Y();
                            if ((i2 & 4) != 0) {
                                i9 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i9 &= -7169;
                            }
                            f10 = f;
                            jt1Var4 = jt1Var2;
                            f11 = f4;
                            ety0Var4 = ety0Var2;
                            y7mVar4 = y7mVar2;
                            f12 = f2;
                        }
                        btsVar2.u();
                        int i13 = i9 >> 3;
                        btsVar = btsVar2;
                        c(f530Var, f10, f12, jt1Var4, f11, ety0Var4, y7mVar4, wwg.S(-778579832, true, new y740(19, str, xya1.e(btsVar2).h.a), btsVar2), zlsVar, aVar, btsVar, (i13 & 3670016) | (i13 & 14) | i7 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (234881024 & i9) | (i9 & 1879048192), 0);
                        f5 = f10;
                        f6 = f12;
                        jt1Var3 = jt1Var4;
                        f7 = f11;
                        ety0Var3 = ety0Var4;
                        y7mVar3 = y7mVar4;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new y4l0(str, f530Var, f5, f6, jt1Var3, f7, ety0Var3, y7mVar3, zlsVar, aVar, i, i2);
                        return;
                    }
                    return;
                }
                ety0Var2 = ety0Var;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i9 = i8;
                if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            f4 = f3;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            ety0Var2 = ety0Var;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i9 = i8;
            if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        jt1Var2 = jt1Var;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f4 = f3;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        ety0Var2 = ety0Var;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i9 = i8;
        if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final kk2 e(String str, bts btsVar) {
        int h;
        bmt0 bmt0Var = xya1.e(btsVar).h.a.a;
        boolean k = btsVar.k(str) | btsVar.k(bmt0Var);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            String i = e.i(d.i(c.i(str, new z0l0(5)), new z0l0(6)), new z0l0(7));
            hk2 hk2Var = new hk2(0);
            Regex regex = b;
            List l = regex.l(0, i);
            List s = kotlin.sequences.b.s(new yw01(Regex.c(regex, i), new z0l0(3)));
            int i2 = 0;
            int i3 = 0;
            for (Object obj : l) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                String str2 = (String) obj;
                if (str2.length() > 0) {
                    h = hk2Var.h(bmt0Var);
                    try {
                        hk2Var.d(str2);
                        hk2Var.g(h);
                        if (evu0.y(str2, ":", false)) {
                            hk2Var.d("\u00ad");
                        }
                    } finally {
                    }
                }
                if (i3 < s.size() && i2 < l.size()) {
                    h = hk2Var.h(bmt0Var);
                    try {
                        hk2Var.d((String) s.get(i3));
                        hk2Var.g(h);
                        i3++;
                    } finally {
                    }
                }
                i2 = i4;
            }
            Q = hk2Var.i();
            btsVar.o0(Q);
        }
        return (kk2) Q;
    }

    public static final float f(ety0 ety0Var, float f, fid fidVar, int i) {
        if ((i & 2) != 0) {
            f = SlotSize.L.getSize();
        }
        return ((y7m) y6i0.a(new y7m((f - ((fwi) ((bts) fidVar).m(j.h)).i(ety0Var.b.c)) / 2.0f), new y7m(0.0f))).a;
    }
}
