package com.yandex.passport.internal.ui.common.screen;

import com.google.ar.core.ImageMetadata;
import com.yandex.passport.R;
import com.yandex.passport.internal.flags.presentation.k;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b3z0;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.egb;
import defpackage.eq11;
import defpackage.ew0;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mt71;
import defpackage.npb;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.p4v;
import defpackage.pa90;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.uic;
import defpackage.vi91;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(String str, String str2, String str3, Throwable th, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        Throwable th2;
        int i3;
        String str4;
        c530 c530Var;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-155821276);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(str3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            th2 = th;
            i2 |= btsVar2.e(th2) ? 2048 : 1024;
        } else {
            th2 = th;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(f530Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            f530 s = ljs0.s(an91.n(m4m0.b(f530Var, cma1.R(btsVar2).I, cyk0.c(16.0f)), 16.0f, 8.0f, 16.0f, 16.0f), 0.0f, 360.0f, 1);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, s);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar2, S, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar2, wlsVar4, d);
            String str5 = "Error(" + th2.getMessage() + ')';
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int S2 = cma1.S(btsVar2);
            r1b0 o2 = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, c);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar2, S2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d2);
            vqy0.c(ohb1.e(btsVar2, R.string.passport_error_slab_hint_text), null, cma1.R(btsVar2).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(btsVar2).l, btsVar2, 0, 0, 131066);
            btsVar2.e0(-1736365293);
            int i4 = i2 & 14;
            boolean k = ((i2 & 896) == 256) | ((458752 & i2) == 131072) | (i4 == 4) | btsVar2.k(str5) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                i3 = i2;
                npb npbVar = new npb(tlsVar, str3, str, str5, str2, 13);
                str4 = str5;
                btsVar2.o0(npbVar);
                Q = npbVar;
            } else {
                i3 = i2;
                str4 = str5;
            }
            btsVar2.t(false);
            b.a.getClass();
            vi91.a((sls) Q, null, false, null, null, null, b.b, btsVar2, 1572864, 62);
            btsVar2.t(true);
            vqy0.c(str3, null, cma1.R(btsVar2).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(btsVar2).l, btsVar2, (i3 >> 6) & 14, 0, 131066);
            bts btsVar3 = btsVar2;
            char c2 = 0;
            oeb1.c(btsVar3, ljs0.m(c530Var2, 4.0f));
            btsVar3.e0(-1255041942);
            if (str != null) {
                vqy0.c(str, null, cma1.R(btsVar3).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(btsVar3).l, btsVar3, i4, 0, 131066);
                btsVar3 = btsVar3;
                c530Var = c530Var2;
                c2 = 0;
                oeb1.c(btsVar3, ljs0.m(c530Var, 4.0f));
            } else {
                c530Var = c530Var2;
            }
            btsVar3.t(false);
            bts btsVar4 = btsVar3;
            vqy0.c(str4, null, cma1.R(btsVar3).a, 0L, null, 0L, null, 0L, 0, false, 3, 0, cma1.X(btsVar3).l, btsVar4, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114682);
            oeb1.c(btsVar4, ljs0.m(c530Var, 4.0f));
            vqy0.c(str2, null, cma1.R(btsVar4).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(btsVar4).l, btsVar4, (i3 >> 3) & 14, 0, 131066);
            btsVar = btsVar4;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(str, str2, str3, th, f530Var, tlsVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        if ((r36 & 16) != 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, sls slsVar, f530 f530Var, String str, String str2, fid fidVar, int i, int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-726448797);
        if ((i & 6) == 0) {
            i3 = i | (btsVar.a(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        int i7 = i3 | (btsVar.k(f530Var) ? 256 : 128);
        if ((i2 & 8) == 0) {
            str3 = str;
            if (btsVar.k(str3)) {
                i4 = 2048;
                int i8 = i7 | i4;
                if ((i2 & 16) != 0) {
                    str4 = str2;
                    if (btsVar.k(str4)) {
                        i5 = 16384;
                        i6 = i8 | i5;
                        if ((i6 & 9363) == 9362 || !btsVar.E()) {
                            btsVar.a0();
                            if ((i & 1) != 0 || btsVar.C()) {
                                if ((i2 & 8) != 0) {
                                    str3 = ohb1.e(btsVar, R.string.passport_webview_unexpected_error_text);
                                    i6 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    str4 = ohb1.e(btsVar, R.string.passport_webview_cancel_button_text);
                                    i6 &= -57345;
                                }
                                int i9 = i6;
                                String str5 = str3;
                                String str6 = str4;
                                btsVar.u();
                                sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                                int S = cma1.S(btsVar);
                                r1b0 o = btsVar.o();
                                f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
                                ohd.G1.getClass();
                                sls slsVar2 = androidx.compose.ui.node.d.b;
                                if (btsVar.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar2);
                                } else {
                                    btsVar.r0();
                                }
                                qje.W(btsVar, androidx.compose.ui.node.d.f, a);
                                qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                                wls wlsVar = androidx.compose.ui.node.d.g;
                                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                                    b64.z(S, btsVar, S, wlsVar);
                                }
                                qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                                pa90 m = mt71.m(R.drawable.passport_domik_webam_unexpected_error, 0, btsVar);
                                a7u0 a7u0Var = dgc.a;
                                p4v.b(m, null, an91.o(c530.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((agc) btsVar.m(a7u0Var)).a, btsVar, 432, 0);
                                vqy0.c(str5, null, ((agc) btsVar.m(a7u0Var)).a, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).k, btsVar, (i9 >> 9) & 14, 0, 130042);
                                btsVar = btsVar;
                                btsVar.e0(1409316295);
                                if (z) {
                                    btsVar.e0(1409317888);
                                    boolean z2 = (i9 & 112) == 32;
                                    Object Q = btsVar.Q();
                                    if (z2 || Q == did.a) {
                                        Q = new k(11, slsVar);
                                        btsVar.o0(Q);
                                    }
                                    btsVar.t(false);
                                    androidx.compose.material3.a.f((sls) Q, null, false, null, null, null, wwg.S(1984252081, true, new com.yandex.passport.internal.ui.common.component.a(str6, 2), btsVar), btsVar, 805306368, 510);
                                    btsVar = btsVar;
                                }
                                btsVar.t(false);
                                btsVar.t(true);
                                str3 = str5;
                                str4 = str6;
                            } else {
                                btsVar.Y();
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                }
                            }
                        } else {
                            btsVar.Y();
                        }
                        aii0 v = btsVar.v();
                        if (v != null) {
                            v.d = new egb(z, slsVar, f530Var, str3, str4, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    str4 = str2;
                }
                i5 = 8192;
                i6 = i8 | i5;
                if ((i6 & 9363) == 9362) {
                }
                btsVar.a0();
                if ((i & 1) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                int i92 = i6;
                String str52 = str3;
                String str62 = str4;
                btsVar.u();
                sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
                ohd.G1.getClass();
                sls slsVar22 = androidx.compose.ui.node.d.b;
                if (btsVar.a == null) {
                }
            }
        } else {
            str3 = str;
        }
        i4 = 1024;
        int i82 = i7 | i4;
        if ((i2 & 16) != 0) {
        }
        i5 = 8192;
        i6 = i82 | i5;
        if ((i6 & 9363) == 9362) {
        }
        btsVar.a0();
        if ((i & 1) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        int i922 = i6;
        String str522 = str3;
        String str622 = str4;
        btsVar.u();
        sic a22 = qic.a(lr20.c, x4c.H, btsVar, 48);
        int S22 = cma1.S(btsVar);
        r1b0 o22 = btsVar.o();
        f530 d22 = androidx.compose.ui.b.d(btsVar, f530Var);
        ohd.G1.getClass();
        sls slsVar222 = androidx.compose.ui.node.d.b;
        if (btsVar.a == null) {
        }
    }

    public static final void c(d dVar, sls slsVar, tls tlsVar, fid fidVar, int i) {
        sls slsVar2;
        tls tlsVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-256182684);
        int i2 = (btsVar2.e(dVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar2.e(slsVar2) ? 32 : 16;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i2 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            f530 k = an91.k(i9a1.g(m4m0.b(ljs0.c, ((agc) btsVar2.m(dgc.a)).n, qke.q)), 16.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, k);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar2, S, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            uic uicVar = uic.a;
            oeb1.c(btsVar2, uicVar.b(c, 1.0f, true));
            boolean z = dVar.e;
            so5 so5Var = x4c.H;
            int i3 = i2;
            b(z, slsVar2, uicVar.a(so5Var, c530Var), null, null, btsVar2, i2 & 112, 24);
            oeb1.c(btsVar2, uicVar.b(ljs0.c(c530Var, 1.0f), 1.0f, true));
            String str = dVar.c;
            String str2 = dVar.d;
            String str3 = dVar.b;
            if (!dVar.f) {
                str3 = null;
            }
            a(str3, str, str2, dVar.a, uicVar.a(so5Var, c530Var), tlsVar2, btsVar2, (i3 << 9) & ImageMetadata.JPEG_GPS_COORDINATES);
            btsVar = btsVar2;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(dVar, slsVar, tlsVar, i, 20);
        }
    }
}
