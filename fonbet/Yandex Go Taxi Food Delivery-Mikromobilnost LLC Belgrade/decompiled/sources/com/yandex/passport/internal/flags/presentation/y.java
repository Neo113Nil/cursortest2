package com.yandex.passport.internal.flags.presentation;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.agc;
import defpackage.b64;
import defpackage.b9a1;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.gfj;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.o751;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.p751;
import defpackage.pfy;
import defpackage.pi6;
import defpackage.q751;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.va90;
import defpackage.vqy0;
import defpackage.vuz;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.za2;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public final class y implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                tls tlsVar = (tls) obj4;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                d.a.getClass();
                androidx.compose.runtime.internal.a aVar = d.b;
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1112195986);
                boolean k = btsVar2.k(tlsVar);
                Object Q = btsVar2.Q();
                if (k || Q == o430Var) {
                    z = false;
                    Q = new x(0, tlsVar);
                    btsVar2.o0(Q);
                } else {
                    z = false;
                }
                btsVar2.t(z);
                za2.b(aVar, (sls) Q, null, false, null, null, btsVar2, 6);
                androidx.compose.runtime.internal.a aVar2 = d.c;
                btsVar2.e0(1112201237);
                boolean k2 = btsVar2.k(tlsVar);
                Object Q2 = btsVar2.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new x(1, tlsVar);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                za2.b(aVar2, (sls) Q2, null, false, null, null, btsVar2, 6);
                androidx.compose.runtime.internal.a aVar3 = d.d;
                btsVar2.e0(1112206646);
                boolean k3 = btsVar2.k(tlsVar);
                Object Q3 = btsVar2.Q();
                if (k3 || Q3 == o430Var) {
                    Q3 = new x(2, tlsVar);
                    btsVar2.o0(Q3);
                }
                btsVar2.t(false);
                za2.b(aVar3, (sls) Q3, null, false, null, null, btsVar2, 6);
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                }
                c530 c530Var = c530.a;
                f530 c = ljs0.c(c530Var, 1.0f);
                androidx.compose.runtime.internal.a aVar4 = (androidx.compose.runtime.internal.a) obj4;
                sic a = qic.a(lr20.c, x4c.G, fidVar2, 0);
                int S = cma1.S(fidVar2);
                bts btsVar4 = (bts) fidVar2;
                dmw0 dmw0Var = btsVar4.a;
                r1b0 o = btsVar4.o();
                f530 d = androidx.compose.ui.b.d(fidVar2, c);
                ohd.G1.getClass();
                sls slsVar = androidx.compose.ui.node.d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar);
                } else {
                    btsVar4.r0();
                }
                wls wlsVar = androidx.compose.ui.node.d.f;
                qje.W(fidVar2, wlsVar, a);
                wls wlsVar2 = androidx.compose.ui.node.d.e;
                qje.W(fidVar2, wlsVar2, o);
                wls wlsVar3 = androidx.compose.ui.node.d.g;
                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar4, S, wlsVar3);
                }
                wls wlsVar4 = androidx.compose.ui.node.d.d;
                qje.W(fidVar2, wlsVar4, d);
                oeb1.c(fidVar2, ljs0.e(c530Var, 8.0f));
                f530 b = m4m0.b(c530Var, ((agc) btsVar4.m(dgc.a)).n, cyk0.e(32.0f, 32.0f, 0.0f, 0.0f, 12));
                WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                f530 e = b9a1.e(b, new pfy(vuz.o(fidVar2).g, 32));
                z910 d2 = pi6.d(x4c.b, false);
                int S2 = cma1.S(fidVar2);
                r1b0 o2 = btsVar4.o();
                f530 d3 = androidx.compose.ui.b.d(fidVar2, e);
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar);
                } else {
                    btsVar4.r0();
                }
                qje.W(fidVar2, wlsVar, d2);
                qje.W(fidVar2, wlsVar2, o2);
                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar4, S2, wlsVar3);
                }
                qje.W(fidVar2, wlsVar4, d3);
                final View view = (View) btsVar4.m(AndroidCompositionLocals_androidKt.f);
                final boolean z2 = ((com.yandex.passport.common.ui.compose.theme.b) btsVar4.m(com.yandex.passport.common.ui.compose.theme.e.d)).a;
                btsVar4.e0(-1494826749);
                boolean e2 = fidVar2.e(view) | fidVar2.a(z2);
                Object Q4 = btsVar4.Q();
                if (e2 || Q4 == o430Var) {
                    Q4 = new sls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s1
                        @Override // defpackage.sls
                        public final Object invoke() {
                            ViewParent parent = view.getParent();
                            gfj gfjVar = parent instanceof gfj ? (gfj) parent : null;
                            Window window = gfjVar != null ? gfjVar.getWindow() : null;
                            if (window != null) {
                                jl40.L(window, false);
                                window.setNavigationBarContrastEnforced(false);
                                va90 va90Var = new va90(window.getDecorView());
                                int i2 = Build.VERSION.SDK_INT;
                                (i2 >= 35 ? new q751(window, va90Var) : i2 >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).T(!z2);
                            }
                            return zy11.a;
                        }
                    };
                    btsVar4.o0(Q4);
                }
                btsVar4.t(false);
                zpn.i((sls) Q4, fidVar2);
                aVar4.invoke(fidVar2, 0);
                btsVar4.t(true);
                btsVar4.t(true);
                return zy11Var;
            default:
                fid fidVar3 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar5 = (bts) fidVar3;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var;
                    }
                }
                vqy0.c(ohb1.e(fidVar3, ((Integer) obj4).intValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) ((bts) fidVar3).m(eq11.a)).o, fidVar3, 0, 0, 131070);
                return zy11Var;
        }
    }
}
