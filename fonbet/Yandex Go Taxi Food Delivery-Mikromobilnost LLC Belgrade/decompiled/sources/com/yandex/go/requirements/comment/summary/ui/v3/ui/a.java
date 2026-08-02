package com.yandex.go.requirements.comment.summary.ui.v3.ui;

import androidx.compose.animation.g;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.requirements.comment.summary.ui.v3.ui.model.ButtonUiState$LoadingState;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b0;
import defpackage.bts;
import defpackage.c0;
import defpackage.c47;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d0;
import defpackage.did;
import defpackage.e0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g0;
import defpackage.heb1;
import defpackage.hoy0;
import defpackage.i0;
import defpackage.i43;
import defpackage.i6b1;
import defpackage.jeb1;
import defpackage.k0;
import defpackage.l0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m0;
import defpackage.m3u0;
import defpackage.nx2;
import defpackage.o430;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.p0;
import defpackage.p5v0;
import defpackage.pw91;
import defpackage.q0;
import defpackage.q5v0;
import defpackage.qic;
import defpackage.qje;
import defpackage.qor;
import defpackage.quz;
import defpackage.r0;
import defpackage.r1b0;
import defpackage.r5v0;
import defpackage.s0;
import defpackage.sic;
import defpackage.sls;
import defpackage.t0;
import defpackage.tls;
import defpackage.u1d;
import defpackage.u5;
import defpackage.uic;
import defpackage.unr0;
import defpackage.uy2;
import defpackage.vqr;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xw91;
import defpackage.xya1;
import defpackage.y7m;
import defpackage.z0;
import defpackage.zbd;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(z0 z0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2103346183);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c.a(null, com.yandex.go.requirements.comment.summary.ui.v3.ui.utils.c.a(btsVar), null, false, false, null, null, null, null, null, null, wwg.S(1162768551, true, new l0(i4, z0Var, tlsVar), btsVar), btsVar, 0, 48, 2045);
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new AIRequirementsCommentScreenKt$AIRequirementsCommentScreen$2$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(z0Var, tlsVar, i, 0);
        }
    }

    public static final void b(f530 f530Var, c47 c47Var, String str, String str2, qor qorVar, sls slsVar, fid fidVar, int i) {
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1139833269);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(c47Var) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.k(str2) ? 2048 : 1024) | (btsVar.k(qorVar) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 74899) != 74898)) {
            ButtonUiState$LoadingState buttonUiState$LoadingState = c47Var.a;
            boolean z3 = buttonUiState$LoadingState == ButtonUiState$LoadingState.ENABLED;
            boolean z4 = buttonUiState$LoadingState == ButtonUiState$LoadingState.LOADING;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (str.length() > 0) {
                z = z3;
                z2 = true;
            } else {
                z = z3;
                z2 = false;
            }
            g.b(uic.a, z2, null, null, null, null, wwg.S(1006513923, true, new r0(qorVar, i3), btsVar), btsVar, 1572870, 30);
            ocb1.a(c530.a, true, qorVar, false, false, wwg.S(2104246970, true, new i0(str, str2, 1), btsVar), 0.0f, 0, wwg.S(-1165548242, true, new s0(z, slsVar, z4, c47Var), btsVar), btsVar, ((i2 >> 6) & 896) | 805530678, 448);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(f530Var, c47Var, str, str2, qorVar, slsVar, i, 0);
        }
    }

    public static final void c(String str, String str2, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1047225408);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        int i3 = 0;
        int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new hoy0(str == null ? "" : str, 0L, 6));
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new AIRequirementsCommentScreenKt$Input$1$1(oz40Var, str, null);
                btsVar2.o0(Q2);
            }
            zpn.e(btsVar2, (wls) Q2, str);
            int i5 = i2 & 896;
            boolean z2 = i5 == 256;
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new c0(oz40Var, tlsVar);
                btsVar2.o0(Q3);
            }
            sls slsVar = (sls) Q3;
            boolean z3 = i5 == 256;
            Object Q4 = btsVar2.Q();
            if (z3 || Q4 == o430Var) {
                Q4 = new d0(oz40Var, tlsVar, i3);
                btsVar2.o0(Q4);
            }
            btsVar = btsVar2;
            heb1.a((hoy0) oz40Var.getValue(), (tls) Q4, i6b1.b(c530.a), false, null, null, null, null, str2, null, null, null, null, null, null, false, null, 0.0f, null, null, null, null, true, 0, 0, null, null, null, null, null, wwg.S(-1009984522, true, new l0(i4, oz40Var, slsVar), btsVar2), btsVar, ((i2 << 24) & 1879048192) | 384, 0, HProv.ALG_TYPE_SECURECHANNEL, 2139094520);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e0(str, str2, tlsVar, i, 0);
        }
    }

    public static final void d(float f, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1373249119);
        int i2 = 0;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            f530 n = ljs0.n(c530.a, f, 40.0f);
            xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
            com.yandex.go.design.compose.loading.b.a(n, cyk0.c(13.0f), false, null, null, null, false, btsVar, 12582912, HProv.PP_SAME_MEDIA);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k0(f, i, i2);
        }
    }

    public static final void e(f530 f530Var, oip0 oip0Var, r5v0 r5v0Var, m3u0 m3u0Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2056135078);
        int i2 = i | 6 | (btsVar.k(oip0Var) ? 32 : 16) | (btsVar.k(r5v0Var) ? 256 : 128) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            if (r5v0Var.equals(q5v0.a)) {
                btsVar.e0(503712841);
                g(btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(r5v0Var instanceof p5v0)) {
                    throw unr0.y(-260847228, btsVar, false);
                }
                btsVar.e0(503786683);
                f(oip0Var, (p5v0) r5v0Var, m3u0Var, tlsVar, btsVar, i2 & 65534);
                btsVar.t(false);
            }
            f530Var2 = c530.a;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) f530Var2, (Object) oip0Var, (Object) r5v0Var, (Object) m3u0Var, (Object) tlsVar, i, 0);
        }
    }

    public static final void f(oip0 oip0Var, p5v0 p5v0Var, m3u0 m3u0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2008108915);
        int i3 = i & 6;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 = (btsVar.k(c530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(oip0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(p5v0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(m3u0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            vqr.c(an91.n(pw91.u(c530Var, oip0Var, 14), 12.0f, 8.0f, 12.0f, ((y7m) m3u0Var.getValue()).a + 8.0f), new i43(4.0f, true, new quz(11)), new i43(4.0f, true, new quz(11)), null, 0, 0, wwg.S(22361176, true, new u5(13, p5v0Var, tlsVar), btsVar), btsVar, 1573296, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(oip0Var, p5v0Var, m3u0Var, tlsVar, i);
        }
    }

    public static final void g(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(702245860);
        if (btsVar.V(i & 1, i != 0)) {
            f530 o = an91.o(c530.a, 12.0f, 8.0f, 12.0f, 0.0f, 8);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            i43 i43Var2 = new i43(4.0f, true, new quz(11));
            u1d.a.getClass();
            vqr.c(o, i43Var, i43Var2, null, 0, 0, u1d.b, btsVar, 1573296, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 1);
        }
    }

    public static final void h(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1006911074);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            f530 n = an91.n(c530.a, 16.0f, 20.0f, 20.0f, 12.0f);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new p0(i3);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(str, fnq0.b(n, false, (tls) Q), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar, i2 & 14, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 0);
        }
    }
}
