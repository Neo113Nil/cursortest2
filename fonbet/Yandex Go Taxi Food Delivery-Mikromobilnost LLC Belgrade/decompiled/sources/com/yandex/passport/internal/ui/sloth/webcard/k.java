package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.R;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.ny61;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q7u;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r1b0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vng;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class k {
    public static final void a(h0 h0Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1219993065);
        dmw0 dmw0Var = btsVar.a;
        if ((((btsVar.k(h0Var) ? 4 : 2) | i) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 l = an91.l(ljs0.c, h0Var.b, h0Var.c);
            boolean equals = h0Var.equals(new h0(0));
            f530 f530Var = c530.a;
            f530 k = l.k(!equals ? i9a1.g(f530Var) : f530Var);
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 c = ljs0.c(f530Var, 1.0f);
            int i2 = h0Var.d;
            f530 k2 = c.k(i2 > 0 ? ljs0.e(f530Var, i2) : ljs0.b);
            int i3 = h0Var.a;
            if (i3 > 0) {
                f530Var = ymb1.l(f530Var, cyk0.c(i3));
            }
            f530 k3 = k2.k(f530Var);
            int i4 = j.a[h0Var.e.ordinal()];
            uo5 uo5Var2 = i4 != 1 ? i4 != 2 ? x4c.y : x4c.B : x4c.c;
            cj6 cj6Var = cj6.a;
            f530 a = cj6Var.a(k3, uo5Var2);
            z910 d3 = pi6.d(uo5Var, false);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d4);
            aVar.invoke(cj6Var, btsVar, 54);
            btsVar.t(true);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(h0Var, aVar, i, 16);
        }
    }

    public static final void b(final e eVar, final sls slsVar, final tls tlsVar, final tls tlsVar2, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1293114600);
        int i2 = i | (btsVar.k(eVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            a0 viewModelFactory = eVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            g0 g0Var = (g0) ooc.G(qoi0.a(g0.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            oz40 b = androidx.compose.runtime.f.b(g0Var.c, btsVar);
            h0 h0Var = new h0(20, 16, 16, 278, WebCardMode.Bottom);
            btsVar.e0(1470260203);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = androidx.compose.runtime.f.j(h0Var);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            btsVar.t(false);
            q0 q0Var = ((b0) b.getValue()).a;
            btsVar.e0(1470262368);
            if (q0Var != null) {
                q0 q0Var2 = ((b0) b.getValue()).a;
                btsVar.e0(-870489788);
                boolean e = ((i2 & 896) == 256) | btsVar.e(q0Var);
                Object Q2 = btsVar.Q();
                if (e || Q2 == obj) {
                    Q2 = new WebCardComposeScreenKt$WebCardComposeScreen$1$1$1(tlsVar, q0Var, null);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q2, q0Var2);
            }
            btsVar.t(false);
            kotlinx.coroutines.flow.b bVar = g0Var.w;
            btsVar.e0(1470266986);
            boolean z = (i2 & 7168) == 2048;
            Object Q3 = btsVar.Q();
            if (z || Q3 == obj) {
                Q3 = new WebCardComposeScreenKt$WebCardComposeScreen$2$1(tlsVar2, oz40Var, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar, (wls) Q3, btsVar, 0);
            Throwable th = ((b0) b.getValue()).c;
            btsVar.e0(1470276121);
            if (th != null) {
                btsVar.e0(-870473912);
                boolean z2 = (i2 & 112) == 32;
                Object Q4 = btsVar.Q();
                if (z2 || Q4 == obj) {
                    Q4 = new com.yandex.passport.internal.flags.presentation.k(13, slsVar);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                com.yandex.passport.internal.ui.common.screen.f.a(th, true, false, (sls) Q4, btsVar, 48, 4);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    v.d = new wls(eVar, slsVar, tlsVar, tlsVar2, i, i3) { // from class: com.yandex.passport.internal.ui.sloth.webcard.g
                        public final /* synthetic */ int a;
                        public final /* synthetic */ e b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int O = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O);
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int O2 = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int O3 = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O3);
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
            SlothParams slothParams = ((b0) b.getValue()).b;
            btsVar.e0(1470284132);
            if (slothParams != null) {
                k3r k3rVar = ljs0.c;
                z910 d = pi6.d(x4c.b, false);
                int S = cma1.S(btsVar);
                r1b0 o = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, k3rVar);
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
                qje.W(btsVar, androidx.compose.ui.node.d.f, d);
                qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                wls wlsVar = androidx.compose.ui.node.d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar, S, wlsVar);
                }
                qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
                o4b1.b(mt71.m(R.drawable.passport_background_main, 0, btsVar), null, k3rVar, null, mhe.a, 0.0f, null, btsVar, 25008, 104);
                a((h0) oz40Var.getValue(), wwg.S(371945178, true, new i(slothParams, eVar, g0Var, oz40Var), btsVar), btsVar, 48);
                btsVar.t(true);
                btsVar.t(false);
                aii0 v2 = btsVar.v();
                if (v2 != null) {
                    final int i4 = 1;
                    v2.d = new wls(eVar, slsVar, tlsVar, tlsVar2, i, i4) { // from class: com.yandex.passport.internal.ui.sloth.webcard.g
                        public final /* synthetic */ int a;
                        public final /* synthetic */ e b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i42 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i42) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int O = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O);
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int O2 = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int O3 = vng.O(1);
                                    k.b(this.b, this.c, this.w, this.x, (fid) obj2, O3);
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
            com.yandex.passport.common.ui.progress.g progressProperties = eVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.common.ui.progress.p.d(null, progressProperties, false, btsVar, 0, 5);
            btsVar = btsVar;
        }
        aii0 v3 = btsVar.v();
        if (v3 != null) {
            final int i5 = 2;
            v3.d = new wls(eVar, slsVar, tlsVar, tlsVar2, i, i5) { // from class: com.yandex.passport.internal.ui.sloth.webcard.g
                public final /* synthetic */ int a;
                public final /* synthetic */ e b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;

                {
                    this.a = i5;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int O = vng.O(1);
                            k.b(this.b, this.c, this.w, this.x, (fid) obj2, O);
                            break;
                        case 1:
                            ((Integer) obj3).getClass();
                            int O2 = vng.O(1);
                            k.b(this.b, this.c, this.w, this.x, (fid) obj2, O2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int O3 = vng.O(1);
                            k.b(this.b, this.c, this.w, this.x, (fid) obj2, O3);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
