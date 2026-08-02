package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a;
import defpackage.a6t0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b930;
import defpackage.bts;
import defpackage.c530;
import defpackage.ci91;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d930;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fgb;
import defpackage.fid;
import defpackage.gi91;
import defpackage.gvu0;
import defpackage.hoy0;
import defpackage.jeb1;
import defpackage.kau;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.n;
import defpackage.ne5;
import defpackage.nnm;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.tje;
import defpackage.tls;
import defpackage.u5t0;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wo1;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.xz3;
import defpackage.ymb1;
import defpackage.yur;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zx40;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(f530 f530Var, Character ch, boolean z, boolean z2, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        c530 c530Var;
        boolean z3;
        long n;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-356995139);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(ch) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.a(z2) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var2 = c530.a;
            f530 n2 = ljs0.n(an91.m(c530Var2, 3.0f, 0.0f, 2), 24.0f, 32.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, n2);
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
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d2);
            if (ch != null) {
                btsVar2.e0(-1440842604);
                f530 f = sm91.f(c530Var2, 0.0f, -2.0f, 1);
                z910 d3 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d4 = b.d(btsVar2, f);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, d3);
                qje.W(btsVar2, wlsVar2, o2);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
                qje.W(btsVar2, wlsVar4, d4);
                c530Var = c530Var2;
                z3 = true;
                jeb1.f(String.valueOf(ch.charValue()), null, z2 ? AppColor$Palette.Error : AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar2).c.a, btsVar2, 0, 48, 14330);
                btsVar = btsVar2;
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                c530Var = c530Var2;
                z3 = true;
                btsVar.e0(-1440538587);
                if (z) {
                    btsVar.e0(-1440509695);
                    n = tje.n(AppColor$Palette.Text, btsVar);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1440473301);
                    n = tje.n(AppColor$Palette.TextMinor, btsVar);
                    btsVar.t(false);
                }
                pi6.a(m4m0.b(ymb1.l(ljs0.c(ljs0.e(cj6.a.a(c530Var, x4c.B), 2.0f), 1.0f), cyk0.c(1.0f)), n, qke.q), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(z3);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fgb(f530Var2, ch, z, z2, i);
        }
    }

    public static final void b(String str, f530 f530Var, boolean z, fid fidVar, int i, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1358196940);
        int i3 = i2 | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.c(i) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            int i4 = i / 2;
            int length = str.length();
            btsVar.e0(-274931415);
            int i5 = 0;
            while (i5 < i) {
                Character w0 = gvu0.w0(i5, str);
                a(null, w0, w0 == null && i5 == length, z, btsVar, i3 & 7168);
                if (i5 == i4 - 1) {
                    btsVar.e0(1694193963);
                    nnm.s(c530.a, 12.0f, btsVar, false);
                } else {
                    btsVar.e0(1694239130);
                    btsVar.t(false);
                }
                i5++;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d930(f530Var, str, i, z, i2);
        }
    }

    public static final void c(String str, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1304439236);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            jeb1.f(str, an91.o(c530Var, 32.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Error, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar).h.a, btsVar, (i2 & 14) | 432, 48, 14328);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 6.0f));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kau(str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, Integer num, boolean z, String str2, tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        String str3;
        bts btsVar;
        int i2;
        Object Q;
        Object obj;
        yur yurVar;
        u5t0 u5t0Var;
        Object Q2;
        Object Q3;
        oz40 oz40Var;
        Object Q4;
        boolean z2;
        boolean z3;
        Object Q5;
        Boolean valueOf;
        boolean z4;
        int i3;
        boolean k;
        Object mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1;
        u5t0 u5t0Var2;
        int i4;
        Boolean bool;
        int i5;
        final boolean z5;
        boolean z6;
        Throwable th;
        oz40 oz40Var2;
        Boolean valueOf2;
        boolean k2;
        Object Q6;
        u5t0 u5t0Var3;
        yur yurVar2;
        Boolean bool2;
        final boolean z7;
        a6t0 a6t0Var;
        final int i6;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1082449101);
        int i7 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(num) ? 32 : 16) | (btsVar2.a(z) ? 2048 : 1024) | (btsVar2.k(str2) ? 16384 : 8192) | (btsVar2.e(tlsVar) ? 131072 : 65536) | (btsVar2.e(tlsVar2) ? 1048576 : 524288);
        if (btsVar2.V(i7 & 1, (4793491 & i7) != 4793490)) {
            if (num != null) {
                Integer num2 = num.intValue() > 0 ? num : null;
                if (num2 != null) {
                    i2 = num2.intValue();
                    Q = btsVar2.Q();
                    obj = did.a;
                    if (Q == obj) {
                        Q = vfc.g(btsVar2);
                    }
                    yurVar = (yur) Q;
                    u5t0Var = (u5t0) btsVar2.m(j.q);
                    Q2 = btsVar2.Q();
                    if (Q2 == obj) {
                        Q2 = ly3.i(btsVar2);
                    }
                    zx40 zx40Var = (zx40) Q2;
                    boolean z8 = str2 == null && str2.length() != 0;
                    Q3 = btsVar2.Q();
                    if (Q3 == obj) {
                        Q3 = f.j(new hoy0(str, 0L, 6));
                        btsVar2.o0(Q3);
                    }
                    oz40Var = (oz40) Q3;
                    Q4 = btsVar2.Q();
                    if (Q4 != obj) {
                        z2 = z;
                        Q4 = n.f(z2, btsVar2);
                    } else {
                        z2 = z;
                    }
                    oz40 oz40Var3 = (oz40) Q4;
                    int i8 = i7 & 14;
                    oz40 n = f.n(str, btsVar2);
                    z3 = i8 != 4;
                    Q5 = btsVar2.Q();
                    if (!z3 || Q5 == obj) {
                        Q5 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$1$1(oz40Var, str, null);
                        btsVar2.o0(Q5);
                    }
                    zpn.e(btsVar2, (wls) Q5, str);
                    valueOf = Boolean.valueOf(z2);
                    z4 = z8;
                    i3 = i7 & 7168;
                    k = (i3 != 2048) | btsVar2.k(n);
                    Object Q7 = btsVar2.Q();
                    if (!k || Q7 == obj) {
                        u5t0Var2 = u5t0Var;
                        i4 = i3;
                        bool = valueOf;
                        i5 = i7;
                        z5 = z4;
                        z6 = true;
                        th = null;
                        mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1(z2, oz40Var3, n, oz40Var, null);
                        oz40Var2 = oz40Var;
                        btsVar2.o0(mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1);
                    } else {
                        mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 = Q7;
                        bool = valueOf;
                        i4 = i3;
                        oz40Var2 = oz40Var;
                        i5 = i7;
                        z5 = z4;
                        z6 = true;
                        th = null;
                        u5t0Var2 = u5t0Var;
                    }
                    zpn.e(btsVar2, (wls) mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1, bool);
                    Boolean bool3 = Boolean.TRUE;
                    valueOf2 = Boolean.valueOf(z);
                    k2 = btsVar2.k(u5t0Var2) | (i4 != 2048 ? z6 : false);
                    Q6 = btsVar2.Q();
                    if (!k2 || Q6 == obj) {
                        u5t0Var3 = u5t0Var2;
                        yurVar2 = yurVar;
                        bool2 = valueOf2;
                        MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1 mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1(true, z, yurVar2, u5t0Var3, null);
                        z7 = z;
                        btsVar2.o0(mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1);
                        Q6 = mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1;
                    } else {
                        z7 = z;
                        u5t0Var3 = u5t0Var2;
                        yurVar2 = yurVar;
                        bool2 = valueOf2;
                    }
                    zpn.g(bool3, bool2, str2, (wls) Q6, btsVar2);
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a != null) {
                        cma1.b0();
                        throw th;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    hoy0 hoy0Var = (hoy0) oz40Var2.getValue();
                    f530Var2 = f530Var;
                    f530 b = gi91.b(ljs0.c(f530Var2, 1.0f), yurVar2);
                    boolean k3 = (i4 == 2048 ? z6 : false) | btsVar2.k(u5t0Var3);
                    Object Q8 = btsVar2.Q();
                    if (k3 || Q8 == obj) {
                        Q8 = new xz3(z7, u5t0Var3, 10);
                        btsVar2.o0(Q8);
                    }
                    f530 f = ci91.f(b, (tls) Q8);
                    int i9 = 0;
                    lkx lkxVar = new lkx(i9, 3, i9, HProv.PP_PASSWD_TERM);
                    ety0 ety0Var = xya1.e(btsVar2).c.c;
                    long j = ldc.l;
                    ety0 a2 = ety0.a(ety0Var, j, 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446);
                    a6t0 a6t0Var2 = new a6t0(j);
                    boolean c = btsVar2.c(i2) | (i4 == 2048 ? z6 : false) | ((i5 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 ? z6 : false) | ((i5 & 3670016) == 1048576 ? z6 : false);
                    Object Q9 = btsVar2.Q();
                    if (c || Q9 == obj) {
                        a6t0Var = a6t0Var2;
                        i6 = i2;
                        b930 b930Var = new b930(z7, i6, tlsVar, tlsVar2, oz40Var2);
                        btsVar2.o0(b930Var);
                        Q9 = b930Var;
                    } else {
                        a6t0Var = a6t0Var2;
                        i6 = i2;
                    }
                    boolean z9 = z5;
                    boolean z10 = z6;
                    int i10 = i5;
                    ne5.a(hoy0Var, (tls) Q9, f, false, z, a2, lkxVar, null, true, 0, 0, null, null, zx40Var, a6t0Var, wwg.S(420097722, z6, new zls() { // from class: c930
                        @Override // defpackage.zls
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            long n2;
                            wls wlsVar = (wls) obj2;
                            fid fidVar2 = (fid) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= fidVar2.e(wlsVar) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            boolean V = btsVar3.V(intValue & 1, (intValue & 19) != 18);
                            dmw0 dmw0Var = btsVar3.a;
                            if (V) {
                                c530 c530Var = c530.a;
                                f530 b2 = m4m0.b(ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f), tje.n(AppColor$Palette.Background, btsVar3), cyk0.c(16.0f));
                                boolean z11 = z5;
                                if (z11) {
                                    btsVar3.e0(-403117767);
                                    n2 = tje.n(AppColor$Palette.Error, btsVar3);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-403065222);
                                    n2 = tje.n(AppColor$Palette.Text, btsVar3);
                                    btsVar3.t(false);
                                }
                                f530 a3 = aab1.a(2.0f, n2, b2, cyk0.c(16.0f));
                                uo5 uo5Var = x4c.y;
                                z910 d2 = pi6.d(uo5Var, false);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o2 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, a3);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
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
                                wls wlsVar2 = d.f;
                                qje.W(btsVar3, wlsVar2, d2);
                                wls wlsVar3 = d.e;
                                qje.W(btsVar3, wlsVar3, o2);
                                Integer valueOf3 = Integer.valueOf(hashCode2);
                                wls wlsVar4 = d.g;
                                qje.W(btsVar3, wlsVar4, valueOf3);
                                tls tlsVar3 = d.h;
                                qje.M(btsVar3, tlsVar3);
                                wls wlsVar5 = d.d;
                                qje.W(btsVar3, wlsVar5, d3);
                                a.b(str, z7 ? ofb1.b(c530Var, false, null, 15) : c530Var, z11, btsVar3, i6, 0);
                                Object Q10 = btsVar3.Q();
                                if (Q10 == did.a) {
                                    long j2 = ldc.l;
                                    Q10 = new osy0(j2, j2);
                                    btsVar3.o0(Q10);
                                }
                                osy0 osy0Var = (osy0) Q10;
                                f530 b3 = cj6.a.b(c530Var);
                                z910 d4 = pi6.d(uo5Var, false);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d5 = b.d(btsVar3, b3);
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, wlsVar2, d4);
                                qje.W(btsVar3, wlsVar3, o3);
                                vfc.v(hashCode3, btsVar3, wlsVar4, btsVar3, tlsVar3);
                                qje.W(btsVar3, wlsVar5, d5);
                                sb2.b(psy0.a.a(osy0Var), wwg.S(1892884462, true, new cp1(wlsVar, 7), btsVar3), btsVar3, 56);
                                btsVar3.t(true);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, ((i5 << 3) & HProv.ALG_CLASS_ALL) | 102236160, 224256, 7816);
                    btsVar = btsVar2;
                    if (!z9 || str2 == null || str2.length() == 0) {
                        str3 = str2;
                        btsVar.e0(1684994027);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1684960392);
                        str3 = str2;
                        c(str3, btsVar, (i10 >> 12) & 14);
                        btsVar.t(false);
                    }
                    btsVar.t(z10);
                }
            }
            i2 = 6;
            Q = btsVar2.Q();
            obj = did.a;
            if (Q == obj) {
            }
            yurVar = (yur) Q;
            u5t0Var = (u5t0) btsVar2.m(j.q);
            Q2 = btsVar2.Q();
            if (Q2 == obj) {
            }
            zx40 zx40Var2 = (zx40) Q2;
            if (str2 == null) {
            }
            Q3 = btsVar2.Q();
            if (Q3 == obj) {
            }
            oz40Var = (oz40) Q3;
            Q4 = btsVar2.Q();
            if (Q4 != obj) {
            }
            oz40 oz40Var32 = (oz40) Q4;
            int i82 = i7 & 14;
            oz40 n2 = f.n(str, btsVar2);
            if (i82 != 4) {
            }
            Q5 = btsVar2.Q();
            if (!z3) {
            }
            Q5 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$1$1(oz40Var, str, null);
            btsVar2.o0(Q5);
            zpn.e(btsVar2, (wls) Q5, str);
            valueOf = Boolean.valueOf(z2);
            z4 = z8;
            i3 = i7 & 7168;
            k = (i3 != 2048) | btsVar2.k(n2);
            Object Q72 = btsVar2.Q();
            if (k) {
            }
            u5t0Var2 = u5t0Var;
            i4 = i3;
            bool = valueOf;
            i5 = i7;
            z5 = z4;
            z6 = true;
            th = null;
            mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1(z2, oz40Var32, n2, oz40Var, null);
            oz40Var2 = oz40Var;
            btsVar2.o0(mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1);
            zpn.e(btsVar2, (wls) mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1, bool);
            Boolean bool32 = Boolean.TRUE;
            valueOf2 = Boolean.valueOf(z);
            k2 = btsVar2.k(u5t0Var2) | (i4 != 2048 ? z6 : false);
            Q6 = btsVar2.Q();
            if (k2) {
            }
            u5t0Var3 = u5t0Var2;
            yurVar2 = yurVar;
            bool2 = valueOf2;
            MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1 mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$12 = new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1(true, z, yurVar2, u5t0Var3, null);
            z7 = z;
            btsVar2.o0(mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$12);
            Q6 = mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$12;
            zpn.g(bool32, bool2, str2, (wls) Q6, btsVar2);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, c530.a);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar2.a != null) {
            }
        } else {
            f530Var2 = f530Var;
            str3 = str2;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wo1(str, num, z, str3, tlsVar, tlsVar2, f530Var2, i);
        }
    }
}
