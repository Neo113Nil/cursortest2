package com.yandex.passport.internal.ui.bouncer.chooser;

import androidx.core.app.a1;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.R;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g131;
import defpackage.g43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.l3x;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.o430;
import defpackage.o7b1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.v2w;
import defpackage.vqy0;
import defpackage.w1c;
import defpackage.w511;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ys0;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        List list2;
        boolean z;
        String e;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2054229622);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (i & 6) == 0 ? (btsVar.e(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            list2 = list;
        } else {
            f530 k = an91.k(ljs0.c(f530Var, 1.0f), 16.0f);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            String e2 = ohb1.e(btsVar, R.string.passport_choose_master_title);
            a7u0 a7u0Var = eq11.a;
            ety0 ety0Var = ((bq11) btsVar.m(a7u0Var)).d;
            a7u0 a7u0Var2 = dgc.a;
            int i3 = i2;
            long j = ((agc) btsVar.m(a7u0Var2)).a;
            c530 c530Var = c530.a;
            c530 c530Var2 = c530Var;
            float f = 1.0f;
            vqy0.c(e2, an91.o(ljs0.c(c530Var, 1.0f), 24.0f, 24.0f, 24.0f, 0.0f, 8), j, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ety0Var, btsVar, 48, 0, 130040);
            int i4 = 3;
            vqy0.c(ohb1.e(btsVar, R.string.passport_choose_master_hint), an91.o(ljs0.c(c530Var2, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f, 8), ((agc) btsVar.m(a7u0Var2)).a, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ((bq11) btsVar.m(a7u0Var)).k, btsVar, 48, 0, 130040);
            btsVar = btsVar;
            Object[] objArr = new Object[0];
            btsVar.e0(954394060);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new a1(15);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            int i5 = 48;
            yx40 yx40Var = (yx40) cvw.V(objArr, (sls) Q, btsVar, 48);
            f530 u = pw91.u(an91.o(o7b1.d(c530Var2).k(new x2y(1.0f, false)), 24.0f, 32.0f, 24.0f, 0.0f, 8), pw91.o(btsVar), 14);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(464076722);
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    scc.m();
                    throw null;
                }
                z zVar = (z) obj;
                f530 e3 = ljs0.e(ljs0.c(c530Var2, f), 56.0f);
                final boolean z2 = yx40Var.getIntValue() == i6;
                final awk0 awk0Var = new awk0(i4);
                btsVar.e0(1620330445);
                boolean k2 = btsVar.k(yx40Var) | btsVar.c(i6);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new ys0(i6, yx40Var, 19);
                    btsVar.o0(Q2);
                }
                final sls slsVar2 = (sls) Q2;
                btsVar.t(false);
                f530 a3 = androidx.compose.ui.b.a(e3, androidx.compose.ui.platform.m.b ? new tls() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
                    final /* synthetic */ boolean $enabled$inlined = true;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        v2w v2wVar = (v2w) obj2;
                        v2wVar.getClass();
                        g131 g131Var = v2wVar.a;
                        g131Var.b("selected", Boolean.valueOf(z2));
                        g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(this.$enabled$inlined));
                        g131Var.b("role", awk0Var);
                        g131Var.b("onClick", slsVar2);
                        return zy11.a;
                    }
                } : androidx.compose.ui.platform.m.a(), new w1c(z2, awk0Var, slsVar2, 1));
                lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar, i5);
                int S3 = cma1.S(btsVar);
                r1b0 o3 = btsVar.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar, a3);
                ohd.G1.getClass();
                sls slsVar3 = androidx.compose.ui.node.d.b;
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, androidx.compose.ui.node.d.f, a4);
                qje.W(btsVar, androidx.compose.ui.node.d.e, o3);
                wls wlsVar5 = androidx.compose.ui.node.d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar5);
                }
                qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
                com.yandex.passport.internal.ui.common.component.b.a(yx40Var.getIntValue() == i6, null, btsVar, i5, 4);
                btsVar.e0(-489039243);
                if (zVar instanceof x) {
                    e = ((x) zVar).a.b;
                } else {
                    if (!(zVar instanceof y)) {
                        w511.b();
                        return;
                    }
                    e = ohb1.e(btsVar, R.string.passport_choose_master_option_another);
                }
                btsVar.t(false);
                c530 c530Var3 = c530Var2;
                bts btsVar2 = btsVar;
                c530Var2 = c530Var3;
                vqy0.c(e, an91.o(c530Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14), ((agc) btsVar.m(dgc.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).k, btsVar2, 48, 0, 131064);
                btsVar = btsVar2;
                btsVar.t(true);
                i6 = i7;
                o430Var = o430Var;
                i5 = i5;
                i4 = 3;
                f = 1.0f;
            }
            o430 o430Var2 = o430Var;
            btsVar.t(false);
            btsVar.t(true);
            String e4 = ohb1.e(btsVar, R.string.passport_choose_master_button_continue);
            boolean z3 = yx40Var.getIntValue() != -1;
            f530 k3 = an91.k(ljs0.c(c530Var2, 1.0f), 24.0f);
            btsVar.e0(954451563);
            list2 = list;
            boolean k4 = btsVar.k(yx40Var) | ((i3 & 112) == 32) | btsVar.e(list2);
            Object Q3 = btsVar.Q();
            if (k4 || Q3 == o430Var2) {
                tlsVar2 = tlsVar;
                z = false;
                Q3 = new d(0, tlsVar2, list2, yx40Var);
                btsVar.o0(Q3);
            } else {
                tlsVar2 = tlsVar;
                z = false;
            }
            btsVar.t(z);
            com.yandex.passport.internal.properties.u.g(384, 0, btsVar, (sls) Q3, k3, e4, z3);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l3x(list2, tlsVar2, f530Var, i);
        }
    }
}
