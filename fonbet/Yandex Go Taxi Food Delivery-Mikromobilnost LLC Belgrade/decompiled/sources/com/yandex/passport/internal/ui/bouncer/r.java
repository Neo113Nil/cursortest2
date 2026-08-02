package com.yandex.passport.internal.ui.bouncer;

import androidx.core.app.a1;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.flags.presentation.d1;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.ui.w;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yvf0;
import defpackage.z910;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class r {
    public static final void a(v vVar, t1 t1Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(541811724);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(vVar) : btsVar.e(vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(t1Var) : btsVar.e(t1Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            Object[] objArr = new Object[0];
            btsVar.e0(1224567788);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new a1(14);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            String str = (String) cvw.V(objArr, (sls) Q, btsVar, 48);
            t wishSource = vVar.getWishSource();
            com.yandex.passport.internal.ui.challenge.v vVar2 = t1Var.a;
            com.yandex.passport.common.ui.progress.g progressProperties = vVar.getProgressProperties();
            btsVar.e0(1224576283);
            boolean e = ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(t1Var))) | btsVar.e(wishSource);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new s0(8, wishSource, t1Var);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.properties.u.a(vVar2, progressProperties, str, (tls) Q2, btsVar, 0, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d1(vVar, t1Var, i, 1);
        }
    }

    public static final void b(v vVar, u1 u1Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-81446156);
        if ((((btsVar.k(vVar) ? 4 : 2) | i | (btsVar.e(u1Var) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            com.yandex.passport.internal.ui.bouncer.chooser.a aVar = (com.yandex.passport.internal.ui.bouncer.chooser.a) vVar.getBouncerMasterChooserComponentBuilderProvider().get();
            t wishSource = vVar.getWishSource();
            btsVar.e0(459493618);
            boolean k = btsVar.k(u1Var) | btsVar.k(aVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = aVar.setMasters(u1Var.b).setCreateMasterEnterPhoneNumberOption(u1Var.a).build();
                btsVar.o0(Q);
            }
            com.yandex.passport.internal.ui.bouncer.chooser.b bVar = (com.yandex.passport.internal.ui.bouncer.chooser.b) Q;
            btsVar.t(false);
            Object[] objArr = new Object[0];
            btsVar.e0(459502842);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new a1(13);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            String str = (String) cvw.V(objArr, (sls) Q2, btsVar, 48);
            btsVar.e0(459507600);
            boolean e = btsVar.e(wishSource);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new q(wishSource, 1);
                btsVar.o0(Q3);
            }
            sls slsVar = (sls) Q3;
            btsVar.t(false);
            btsVar.e0(459509821);
            boolean e2 = btsVar.e(wishSource);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var) {
                Q4 = new a0(8, wishSource);
                btsVar.o0(Q4);
            }
            btsVar.t(false);
            com.yandex.passport.internal.ui.bouncer.chooser.j.a(bVar, slsVar, (tls) Q4, str, btsVar, 0, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, u1Var, i, 6);
        }
    }

    public static final void c(v vVar, c2 c2Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1647176310);
        int i2 = (btsVar.k(vVar) ? 4 : 2) | i | (btsVar.k(c2Var) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else if (c2Var instanceof v1) {
            btsVar.e0(1086053753);
            e(vVar, (v1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof x1) {
            btsVar.e0(1086159742);
            f(vVar, (x1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof y1) {
            btsVar.e0(1086263778);
            com.yandex.passport.internal.ui.bouncer.roundabout.n.a(vVar, (y1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof z1) {
            btsVar.e0(1086359072);
            d(vVar, (z1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof w1) {
            btsVar.e0(1086459140);
            com.yandex.passport.internal.ui.bouncer.fallback.a.a(vVar, (w1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof t1) {
            btsVar.e0(1086556604);
            a(vVar, (t1) c2Var, btsVar, (i2 & 14) | (Uid.$stable << 3));
            btsVar.t(false);
        } else if (c2Var instanceof b2) {
            btsVar.e0(1086664391);
            com.yandex.passport.internal.ui.bouncer.error.o.a(vVar, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof a2) {
            btsVar.e0(1086763870);
            com.yandex.passport.internal.ui.bouncer.loading.h.a(vVar, (a2) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (c2Var instanceof u1) {
            btsVar.e0(1086870200);
            b(vVar, (u1) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else {
            if (!(c2Var instanceof BouncerUiState$SocialAction)) {
                throw unr0.y(1143412035, btsVar, false);
            }
            btsVar.e0(1086982079);
            com.yandex.passport.internal.ui.bouncer.social.b.a(vVar, (BouncerUiState$SocialAction) c2Var, btsVar, i2 & 14);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, c2Var, i, 3);
        }
    }

    public static final void d(v vVar, z1 z1Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1003962924);
        if ((((btsVar.k(vVar) ? 4 : 2) | i | (btsVar.e(z1Var) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            yvf0 bouncerSlothComposeComponentBuilderProvider = vVar.getBouncerSlothComposeComponentBuilderProvider();
            btsVar.e0(1898619341);
            boolean k = btsVar.k(z1Var) | btsVar.k(bouncerSlothComposeComponentBuilderProvider);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = ((com.yandex.passport.internal.ui.bouncer.sloth.b) bouncerSlothComposeComponentBuilderProvider.get()).slothUiInteractor(z1Var.b).build();
                btsVar.o0(Q);
            }
            com.yandex.passport.internal.ui.bouncer.sloth.c cVar = (com.yandex.passport.internal.ui.bouncer.sloth.c) Q;
            btsVar.t(false);
            Object[] objArr = new Object[0];
            btsVar.e0(1898628602);
            boolean e = btsVar.e(z1Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new com.yandex.passport.internal.flags.experiments.h(8, z1Var);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) Q2, btsVar, 0);
            if (!jl40.l(((b1) z1Var.b).a.getMode().getValue(), ((RendererKeyData) oz40Var.getValue()).getStringMode())) {
                oz40Var.setValue(new RendererKeyData(((b1) z1Var.b).a.getMode().getValue(), UUID.randomUUID().toString()));
            }
            String asKey = ((RendererKeyData) oz40Var.getValue()).asKey();
            btsVar.c0(1898642024, asKey);
            w.b(cVar, asKey, btsVar, 0, 0);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, z1Var, i, 7);
        }
    }

    public static final void e(v vVar, v1 v1Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-645172060);
        if ((((btsVar.k(vVar) ? 4 : 2) | i | (btsVar.e(v1Var) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            t wishSource = vVar.getWishSource();
            StringBuilder sb = new StringBuilder("Error(");
            sb.append(v1Var.a);
            sb.append(Extension.FIX_SPACE);
            Exception exc = new Exception(b64.p(sb, v1Var.b, ')'));
            boolean z = !vVar.isWhiteLabel();
            btsVar.e0(-528673883);
            boolean e = btsVar.e(wishSource);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new q(wishSource, 0);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            com.yandex.passport.internal.ui.common.screen.f.a(exc, true, z, (sls) Q, btsVar, 48, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, v1Var, i, 4);
        }
    }

    public static final void f(v vVar, x1 x1Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(795806597);
        if ((((btsVar2.k(vVar) ? 4 : 2) | i | (btsVar2.k(x1Var) ? 32 : 16)) & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            k3r k3rVar = ljs0.c;
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, k3rVar);
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar2, S, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            btsVar2.e0(2046064906);
            if (x1Var.b) {
                btsVar = btsVar2;
                o4b1.b(mt71.m(R.drawable.passport_background_main, 0, btsVar2), null, k3rVar, null, mhe.g, 0.0f, null, btsVar, 25008, 104);
            } else {
                btsVar = btsVar2;
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.progress.g progressProperties = vVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.common.ui.progress.p.d(null, progressProperties, false, btsVar, 384, 1);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, x1Var, i, 5);
        }
    }
}
