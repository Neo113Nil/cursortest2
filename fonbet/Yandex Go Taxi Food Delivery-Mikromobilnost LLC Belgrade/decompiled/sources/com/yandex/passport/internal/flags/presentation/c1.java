package com.yandex.passport.internal.flags.presentation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.a7u0;
import defpackage.a7y;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b3b1;
import defpackage.b64;
import defpackage.b9a1;
import defpackage.bq11;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.did;
import defpackage.dkm0;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.et0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.g8e;
import defpackage.gji0;
import defpackage.gk11;
import defpackage.imy0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.kx91;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.o7b1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pfy;
import defpackage.pi6;
import defpackage.q2z0;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rh10;
import defpackage.rlb1;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tj91;
import defpackage.tls;
import defpackage.uic;
import defpackage.v8b1;
import defpackage.vi91;
import defpackage.vng;
import defpackage.vqy0;
import defpackage.vuz;
import defpackage.wls;
import defpackage.wta0;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.z910;
import defpackage.za2;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public abstract class c1 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (defpackage.jl40.l(r12.Q(), java.lang.Integer.valueOf(r9)) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, f530 f530Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        oz40 oz40Var;
        sls slsVar5;
        sls slsVar6;
        sls slsVar7;
        boolean z;
        androidx.compose.runtime.internal.a aVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1616450099);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.e(slsVar) ? 4 : 2) | (btsVar.e(slsVar2) ? 32 : 16) | (btsVar.e(slsVar3) ? 256 : 128) | (btsVar.e(slsVar4) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((74899 & i3) == 74898 && btsVar.E()) {
            btsVar.Y();
            aVar2 = aVar;
            slsVar6 = slsVar3;
            slsVar7 = slsVar4;
            f530Var2 = f530Var;
            slsVar5 = slsVar2;
        } else {
            btsVar.e0(803096471);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            btsVar.t(false);
            a7u0 a7u0Var = dgc.a;
            long j = ((agc) btsVar.m(a7u0Var)).F;
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(m4m0.b(c530Var, j, gji0Var), 1.0f);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            f530 e = b9a1.e(c, new pfy(vuz.o(btsVar).g, 15 | 16));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar8 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar8);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S) {
                i2 = i3;
            } else {
                i2 = i3;
            }
            b64.z(S, btsVar, S, wlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 e2 = ljs0.e(c530Var, 56.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, e2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar8);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(-589401281);
            boolean z2 = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new k(3, slsVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            g.a.getClass();
            int i4 = i2;
            vi91.a((sls) Q2, null, false, null, null, null, g.b, btsVar, 1572864, 62);
            c530 c530Var2 = c530Var;
            vqy0.c("Experiments", null, ((agc) btsVar.m(a7u0Var)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).e, btsVar, 6, 0, 131066);
            btsVar = btsVar;
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            z910 d3 = pi6.d(x4c.b, false);
            int S3 = cma1.S(btsVar);
            r1b0 o3 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar8);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                b64.z(S3, btsVar, S3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d4);
            btsVar.e0(402804470);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                oz40Var = oz40Var2;
                Q3 = new p0(0, oz40Var);
                btsVar.o0(Q3);
            } else {
                oz40Var = oz40Var2;
            }
            btsVar.t(false);
            vi91.a((sls) Q3, cj6.a.a(c530Var2, x4c.z), false, null, null, null, g.c, btsVar, 1572870, 60);
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            btsVar.e0(402821801);
            boolean z3 = ((i4 & 896) == 256) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                slsVar5 = slsVar2;
                slsVar6 = slsVar3;
                slsVar7 = slsVar4;
                Q4 = new q0(slsVar5, slsVar6, slsVar7, oz40Var);
                btsVar.o0(Q4);
            } else {
                slsVar5 = slsVar2;
                slsVar6 = slsVar3;
                slsVar7 = slsVar4;
            }
            tls tlsVar = (tls) Q4;
            Object k = g8e.k(402835756, btsVar, false);
            if (k == o430Var) {
                z = true;
                k = new p0(1, oz40Var);
                btsVar.o0(k);
            } else {
                z = true;
            }
            btsVar.t(false);
            g(booleanValue, tlsVar, (sls) k, btsVar, 384);
            btsVar.t(z);
            btsVar.t(z);
            aVar2 = aVar;
            aVar2.invoke(uic.a, btsVar, 54);
            ly3.B(c530Var2, 8.0f, btsVar, z);
            f530Var2 = c530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            sls slsVar9 = slsVar5;
            v.d = new r0(slsVar, slsVar9, slsVar6, slsVar7, f530Var2, aVar2, i);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-674978997);
        if ((((btsVar.k(str) ? 4 : 2) | i | 384) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530Var = c530.a;
            f530 d = o7b1.d(f530Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            btsVar.e0(-821921465);
            for (String str2 : scc.g("true", "false")) {
                boolean l = jl40.l(str, str2);
                btsVar.e0(1891322464);
                boolean k = btsVar.k(str2);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new l(0, tlsVar, str2);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                i(0, btsVar, (sls) Q, null, str2, l);
            }
            btsVar.t(false);
            btsVar.t(true);
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m(str, tlsVar, f530Var2, i, 0);
        }
    }

    public static final void c(com.yandex.passport.internal.flags.b bVar, String str, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(892334077);
        if (((i | (btsVar.e(bVar) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | HProv.ALG_TYPE_SECURECHANNEL) & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            tlsVar2 = tlsVar;
            f530Var2 = f530Var;
        } else {
            f530Var2 = c530.a;
            f530 d = o7b1.d(f530Var2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            btsVar.e0(238969119);
            for (Enum r5 : bVar.c) {
                boolean l = jl40.l(str, r5.name());
                String name = r5.name();
                btsVar.e0(346447342);
                boolean e = btsVar.e(r5);
                Object Q = btsVar.Q();
                if (e || Q == did.a) {
                    Q = new l(1, tlsVar, r5);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                i(0, btsVar, (sls) Q, null, name, l);
            }
            tlsVar2 = tlsVar;
            btsVar.t(false);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.ui.challenge.logout.l(bVar, str, tlsVar2, f530Var2, i);
        }
    }

    public static final void d(v vVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1242331352);
        if (((i | (btsVar.e(vVar) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            i2 = 1;
        } else {
            f530 l = an91.l(ljs0.c(f530Var, 1.0f), 8.0f, 10.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            String str = vVar.a.a;
            a7u0 a7u0Var = eq11.a;
            ety0 ety0Var = ((bq11) btsVar.m(a7u0Var)).k;
            a7u0 a7u0Var2 = dgc.a;
            vqy0.c(str, null, ((agc) btsVar.m(a7u0Var2)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ety0Var, btsVar, 0, 0, 131066);
            vqy0.c(vVar.b, null, ((agc) btsVar.m(a7u0Var2)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(a7u0Var)).l, btsVar, 0, 0, 131066);
            btsVar = btsVar;
            i2 = 1;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, f530Var, i, i2);
        }
    }

    public static final void e(u uVar, sls slsVar, sls slsVar2, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-37417803);
        int i2 = (btsVar2.e(uVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar2.e0(507670235);
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new k(0, slsVar2);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            androidx.compose.ui.window.c.a((sls) Q, null, wwg.S(1434606796, true, new s(uVar, slsVar2, slsVar, tlsVar, 0), btsVar2), btsVar, 384, 2);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(uVar, slsVar, slsVar2, tlsVar, i, 29);
        }
    }

    public static final void f(w wVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(295565758);
        if ((((btsVar.k(wVar) ? 4 : 2) | i | 48) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            c530 c530Var = c530.a;
            f530 l = an91.l(ljs0.c(c530Var, 1.0f), 8.0f, 10.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            vqy0.c(wVar.a, null, ((agc) btsVar.m(dgc.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).g, btsVar, 0, 0, 131066);
            btsVar = btsVar;
            tj91.a(2.0f, 54, 4, 0L, btsVar, an91.o(c530Var, 0.0f, 2.0f, 0.0f, 0.0f, 13));
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(wVar, f530Var2, i, 2);
        }
    }

    public static final void g(boolean z, tls tlsVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1923437595);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            za2.a(z, slsVar, null, 0L, null, null, null, 0L, 0.0f, wwg.S(-1730939104, true, new y(0, tlsVar), btsVar), btsVar, (i2 & 14) | 48);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q2z0(z, tlsVar, slsVar, i);
        }
    }

    public static final void h(List list, androidx.compose.material3.y yVar, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(342283605);
        if (((i | (btsVar2.e(list) ? 4 : 2) | (btsVar2.e(tlsVar) ? 256 : 128) | (btsVar2.e(slsVar) ? 2048 : 1024) | (btsVar2.e(slsVar2) ? 16384 : 8192) | (btsVar2.e(slsVar3) ? 131072 : 65536)) & 599187) == 599186 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            List<y0> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (y0 y0Var : list2) {
                String str = null;
                v vVar = y0Var instanceof v ? (v) y0Var : null;
                if (vVar != null) {
                    str = vVar.a.a;
                }
                arrayList.add(str);
            }
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar2);
            btsVar2.e0(-810358545);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = androidx.compose.runtime.f.g(-1);
                btsVar2.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            btsVar2.t(false);
            btsVar = btsVar2;
            dkm0.a(null, wwg.S(1567681817, true, new u0(slsVar, slsVar2, slsVar3, slsVar4, arrayList, a, yx40Var), btsVar2), null, wwg.S(292758171, true, new t(1, yVar), btsVar2), null, 0, 0L, 0L, null, wwg.S(-1456232412, true, new r(a, list, tlsVar, yx40Var), btsVar2), btsVar, 805309488, RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(list, yVar, tlsVar, slsVar, slsVar2, slsVar3, slsVar4, i, 10);
        }
    }

    public static final void i(int i, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1557850598);
        int i2 = i | (btsVar2.a(z) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            f530Var2 = f530Var;
            btsVar = btsVar2;
        } else {
            btsVar2.e0(716541204);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            btsVar2.t(false);
            awk0 awk0Var = new awk0(3);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(kx91.i(c530Var, z, (zx40) Q, null, true, awk0Var, slsVar), 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
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
            com.yandex.passport.internal.ui.common.component.b.a(z, ljs0.m(c530Var, 48.0f), btsVar2, (i2 & 14) | 432, 0);
            vqy0.c(str, an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((agc) btsVar2.m(dgc.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(eq11.a)).k, btsVar2, ((i2 >> 3) & 14) | 48, 0, 131064);
            btsVar = btsVar2;
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z0(z, str, slsVar, f530Var2, i);
        }
    }

    public static final void j(final d0 d0Var, final tls tlsVar, final sls slsVar, fid fidVar, final int i) {
        int i2;
        sls slsVar2;
        Object experimentsScreenKt$ExperimentsScreen$1$1$1;
        int i3;
        tls tlsVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1447207644);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(d0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar2.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar2.e0(-455501030);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new androidx.compose.material3.y();
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            androidx.compose.material3.y yVar = (androidx.compose.material3.y) Q;
            c0 c0Var = d0Var.d;
            btsVar2.e0(-455496925);
            if (c0Var == null) {
                tlsVar2 = tlsVar;
                i3 = 1;
            } else {
                btsVar2.e0(904780811);
                boolean e = ((i4 & 896) == 256) | btsVar2.e(c0Var) | btsVar2.e(context) | ((i4 & 112) == 32);
                Object Q2 = btsVar2.Q();
                if (e || Q2 == o430Var) {
                    i3 = 1;
                    experimentsScreenKt$ExperimentsScreen$1$1$1 = new ExperimentsScreenKt$ExperimentsScreen$1$1$1(c0Var, slsVar2, yVar, context, tlsVar, null);
                    tlsVar2 = tlsVar;
                    yVar = yVar;
                    btsVar2.o0(experimentsScreenKt$ExperimentsScreen$1$1$1);
                } else {
                    tlsVar2 = tlsVar;
                    experimentsScreenKt$ExperimentsScreen$1$1$1 = Q2;
                    i3 = 1;
                }
                btsVar2.t(false);
                zpn.e(btsVar2, (wls) experimentsScreenKt$ExperimentsScreen$1$1$1, c0Var);
            }
            btsVar2.t(false);
            btsVar2.e0(-455463303);
            int i5 = i4 & 112;
            int i6 = i5 == 32 ? i3 : 0;
            Object Q3 = btsVar2.Q();
            if (i6 != 0 || Q3 == o430Var) {
                Q3 = new x(3, tlsVar2);
                btsVar2.o0(Q3);
            }
            btsVar2.t(false);
            b3b1.a(false, (sls) Q3, btsVar2, 0, i3);
            btsVar2.e0(-455461964);
            if (d0Var.e) {
                com.yandex.passport.common.ui.progress.p.d(m4m0.b(c530.a, ((agc) btsVar2.m(dgc.a)).n, qke.q), null, false, btsVar2, 0, 6);
                btsVar2.t(false);
                aii0 v = btsVar2.v();
                if (v != null) {
                    final int i7 = 2;
                    final tls tlsVar3 = tlsVar2;
                    v.d = new wls() { // from class: com.yandex.passport.internal.flags.presentation.a1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            zy11 zy11Var = zy11.a;
                            int i9 = i;
                            sls slsVar3 = slsVar;
                            tls tlsVar4 = tlsVar3;
                            d0 d0Var2 = d0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i8) {
                                case 0:
                                    c1.j(d0Var2, tlsVar4, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                case 1:
                                    c1.j(d0Var2, tlsVar4, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                case 2:
                                    c1.j(d0Var2, tlsVar4, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                default:
                                    c1.j(d0Var2, tlsVar4, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar = btsVar2;
            final tls tlsVar4 = tlsVar2;
            btsVar.t(false);
            btsVar.e0(-455455785);
            Throwable th = d0Var.c;
            if (th != null) {
                btsVar.e0(-455450195);
                if (i5 != 32) {
                    i3 = 0;
                }
                Object Q4 = btsVar.Q();
                if (i3 != 0 || Q4 == o430Var) {
                    Q4 = new x(8, tlsVar4);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                com.yandex.passport.internal.ui.common.screen.f.a(th, true, false, (sls) Q4, btsVar, 432, 0);
                btsVar.t(false);
                aii0 v2 = btsVar.v();
                if (v2 != null) {
                    final int i8 = 3;
                    v2.d = new wls() { // from class: com.yandex.passport.internal.flags.presentation.a1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i82 = i8;
                            zy11 zy11Var = zy11.a;
                            int i9 = i;
                            sls slsVar3 = slsVar;
                            tls tlsVar42 = tlsVar4;
                            d0 d0Var2 = d0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i82) {
                                case 0:
                                    c1.j(d0Var2, tlsVar42, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                case 1:
                                    c1.j(d0Var2, tlsVar42, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                case 2:
                                    c1.j(d0Var2, tlsVar42, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                                default:
                                    c1.j(d0Var2, tlsVar42, slsVar3, fidVar2, vng.O(i9 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar.t(false);
            btsVar.e0(-455448267);
            u uVar = d0Var.b;
            if (uVar != null) {
                btsVar.e0(-455443984);
                int i9 = (i5 == 32 ? i3 : 0) | (btsVar.e(d0Var) ? 1 : 0);
                Object Q5 = btsVar.Q();
                if (i9 != 0 || Q5 == o430Var) {
                    Q5 = new l(3, tlsVar4, d0Var);
                    btsVar.o0(Q5);
                }
                sls slsVar3 = (sls) Q5;
                btsVar.t(false);
                btsVar.e0(-455440205);
                int i10 = i5 == 32 ? i3 : 0;
                Object Q6 = btsVar.Q();
                if (i10 != 0 || Q6 == o430Var) {
                    Q6 = new x(4, tlsVar4);
                    btsVar.o0(Q6);
                }
                sls slsVar4 = (sls) Q6;
                btsVar.t(false);
                btsVar.e0(-455437340);
                int i11 = (i5 == 32 ? i3 : 0) | (btsVar.e(d0Var) ? 1 : 0);
                Object Q7 = btsVar.Q();
                if (i11 != 0 || Q7 == o430Var) {
                    Q7 = new s0(i3, tlsVar4, d0Var);
                    btsVar.o0(Q7);
                }
                btsVar.t(false);
                e(uVar, slsVar3, slsVar4, (tls) Q7, btsVar, 0);
            }
            Object k = g8e.k(-455432356, btsVar, false);
            if (k == o430Var) {
                k = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(k);
            }
            oz40 oz40Var = (oz40) k;
            btsVar.t(false);
            btsVar.e0(-455430876);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(-455428036);
                Object Q8 = btsVar.Q();
                if (Q8 == o430Var) {
                    Q8 = new p0(3, oz40Var);
                    btsVar.o0(Q8);
                }
                sls slsVar5 = (sls) Q8;
                btsVar.t(false);
                btsVar.e0(-455426087);
                int i12 = i5 == 32 ? i3 : 0;
                Object Q9 = btsVar.Q();
                if (i12 != 0 || Q9 == o430Var) {
                    Q9 = new n(i3, tlsVar4);
                    btsVar.o0(Q9);
                }
                btsVar.t(false);
                n(6, btsVar, slsVar5, (tls) Q9);
            }
            btsVar.t(false);
            List list = d0Var.a;
            if (list != null) {
                btsVar.e0(-455416992);
                int i13 = i5 == 32 ? i3 : 0;
                Object Q10 = btsVar.Q();
                if (i13 != 0 || Q10 == o430Var) {
                    Q10 = new n(2, tlsVar4);
                    btsVar.o0(Q10);
                }
                tls tlsVar5 = (tls) Q10;
                btsVar.t(false);
                btsVar.e0(-455415059);
                int i14 = i5 == 32 ? i3 : 0;
                Object Q11 = btsVar.Q();
                if (i14 != 0 || Q11 == o430Var) {
                    Q11 = new x(5, tlsVar4);
                    btsVar.o0(Q11);
                }
                sls slsVar6 = (sls) Q11;
                btsVar.t(false);
                btsVar.e0(-455413284);
                int i15 = i5 == 32 ? i3 : 0;
                Object Q12 = btsVar.Q();
                if (i15 != 0 || Q12 == o430Var) {
                    Q12 = new x(6, tlsVar4);
                    btsVar.o0(Q12);
                }
                sls slsVar7 = (sls) Q12;
                btsVar.t(false);
                btsVar.e0(-455411143);
                boolean z = i5 == 32;
                Object Q13 = btsVar.Q();
                if (z || Q13 == o430Var) {
                    Q13 = new x(7, tlsVar4);
                    btsVar.o0(Q13);
                }
                sls slsVar8 = (sls) Q13;
                Object k2 = g8e.k(-455408965, btsVar, false);
                if (k2 == o430Var) {
                    k2 = new p0(4, oz40Var);
                    btsVar.o0(k2);
                }
                btsVar.t(false);
                h(list, yVar, tlsVar5, slsVar6, slsVar7, slsVar8, (sls) k2, btsVar, 1572912);
                aii0 v3 = btsVar.v();
                if (v3 != null) {
                    final int i16 = 0;
                    v3.d = new wls() { // from class: com.yandex.passport.internal.flags.presentation.a1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i82 = i16;
                            zy11 zy11Var = zy11.a;
                            int i92 = i;
                            sls slsVar32 = slsVar;
                            tls tlsVar42 = tlsVar;
                            d0 d0Var2 = d0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i82) {
                                case 0:
                                    c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                                    break;
                                case 1:
                                    c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                                    break;
                                case 2:
                                    c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                                    break;
                                default:
                                    c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
        }
        aii0 v4 = btsVar.v();
        if (v4 != null) {
            final int i17 = 1;
            v4.d = new wls() { // from class: com.yandex.passport.internal.flags.presentation.a1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i17;
                    zy11 zy11Var = zy11.a;
                    int i92 = i;
                    sls slsVar32 = slsVar;
                    tls tlsVar42 = tlsVar;
                    d0 d0Var2 = d0Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i82) {
                        case 0:
                            c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                            break;
                        case 1:
                            c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                            break;
                        case 2:
                            c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                            break;
                        default:
                            c1.j(d0Var2, tlsVar42, slsVar32, fidVar2, vng.O(i92 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(tls tlsVar, sls slsVar, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        Object Q;
        o430 o430Var;
        boolean z;
        Object Q2;
        bts btsVar;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1842934912);
        int i4 = 2;
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(tlsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            if ((i3 & 147) == 146 || !btsVar2.E()) {
                if (i5 != 0) {
                    f530Var2 = c530.a;
                }
                btsVar2.e0(609252636);
                Q = btsVar2.Q();
                o430Var = did.a;
                if (Q == o430Var) {
                    Q = androidx.compose.runtime.f.j("");
                    btsVar2.o0(Q);
                }
                oz40 oz40Var = (oz40) Q;
                btsVar2.t(false);
                a7u0 a7u0Var = dgc.a;
                long j = ((agc) btsVar2.m(a7u0Var)).D;
                String str = (String) oz40Var.getValue();
                wta0 a = ffx.a(50);
                byk0 byk0Var = cyk0.a;
                byk0 byk0Var2 = new byk0(a, a, a, a);
                long j2 = ldc.l;
                long j3 = ldc.m;
                imy0 a2 = androidx.compose.material3.t.g((agc) btsVar2.m(a7u0Var), btsVar2).a(j3, j3, j3, j3, j, j, j, j3, j3, j3, null, j2, j2, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3, j3);
                btsVar2.e0(609257980);
                z = (i3 & 14) != 4;
                Q2 = btsVar2.Q();
                if (!z || Q2 == o430Var) {
                    Q2 = new s0(2, tlsVar, oz40Var);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                i.a.getClass();
                btsVar = btsVar2;
                rh10.a(str, (tls) Q2, f530Var2, false, null, i.b, wwg.S(-949967817, true, new t(i4, slsVar), btsVar2), null, null, null, true, 0, 0, byk0Var2, a2, btsVar, (i3 & 896) | 817889280);
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
            }
            f530 f530Var3 = f530Var2;
            v = btsVar.v();
            if (v == null) {
                v.d = new gk11(tlsVar, slsVar, f530Var3, i, i2, 2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i3 & 147) == 146) {
        }
        if (i5 != 0) {
        }
        btsVar2.e0(609252636);
        Q = btsVar2.Q();
        o430Var = did.a;
        if (Q == o430Var) {
        }
        oz40 oz40Var2 = (oz40) Q;
        btsVar2.t(false);
        a7u0 a7u0Var2 = dgc.a;
        long j4 = ((agc) btsVar2.m(a7u0Var2)).D;
        String str2 = (String) oz40Var2.getValue();
        wta0 a3 = ffx.a(50);
        byk0 byk0Var3 = cyk0.a;
        byk0 byk0Var22 = new byk0(a3, a3, a3, a3);
        long j22 = ldc.l;
        long j32 = ldc.m;
        imy0 a22 = androidx.compose.material3.t.g((agc) btsVar2.m(a7u0Var2), btsVar2).a(j32, j32, j32, j32, j4, j4, j4, j32, j32, j32, null, j22, j22, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32, j32);
        btsVar2.e0(609257980);
        if ((i3 & 14) != 4) {
        }
        Q2 = btsVar2.Q();
        if (!z) {
        }
        Q2 = new s0(2, tlsVar, oz40Var2);
        btsVar2.o0(Q2);
        btsVar2.t(false);
        i.a.getClass();
        btsVar = btsVar2;
        rh10.a(str2, (tls) Q2, f530Var2, false, null, i.b, wwg.S(-949967817, true, new t(i4, slsVar), btsVar2), null, null, null, true, 0, 0, byk0Var22, a22, btsVar, (i3 & 896) | 817889280);
        f530 f530Var32 = f530Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void l(int i, fid fidVar, f530 f530Var, String str, String str2) {
        f530 f530Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1492388445);
        if (((i | (btsVar2.k(str2) ? 32 : 16) | 384) & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            f530Var2 = f530Var;
            btsVar = btsVar2;
        } else {
            int i2 = 0;
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar2, c530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
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
            f530Var2 = c530Var;
            vqy0.c(str, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), ((agc) btsVar2.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(eq11.a)).h, btsVar2, 54, 0, 131064);
            btsVar = btsVar2;
            v8b1.b(null, wwg.S(538339812, true, new t(i2, str2), btsVar), btsVar, 48, 1);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o(str, str2, f530Var2, i, 0);
        }
    }

    public static final void m(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        tls tlsVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(880815292);
        if (((i | (btsVar.k(str) ? 4 : 2) | 384) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            tlsVar2 = tlsVar;
            f530Var2 = f530Var;
        } else {
            String str2 = str == null ? "" : str;
            btsVar.e0(-13713231);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                tlsVar2 = tlsVar;
                Q = new n(0, tlsVar2);
                btsVar.o0(Q);
            } else {
                tlsVar2 = tlsVar;
            }
            btsVar.t(false);
            rlb1.a(str2, (tls) Q, false, null, null, null, null, 0, 0, null, null, btsVar, 384);
            f530Var2 = c530.a;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m(str, tlsVar2, f530Var2, i, 1);
        }
    }

    public static final void n(int i, fid fidVar, sls slsVar, tls tlsVar) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1513743843);
        if ((i & 48) == 0) {
            i2 = (btsVar.e(tlsVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1290569155);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new k(5, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            androidx.compose.ui.window.c.a((sls) Q, null, wwg.S(-181915418, true, new f1(i3, slsVar, tlsVar), btsVar), btsVar, 384, 2);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d1(slsVar, tlsVar, i, 0);
        }
    }
}
