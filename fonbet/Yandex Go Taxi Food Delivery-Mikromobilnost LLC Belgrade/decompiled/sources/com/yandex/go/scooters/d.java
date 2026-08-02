package com.yandex.go.scooters;

import android.content.Context;
import android.net.Uri;
import defpackage.ado0;
import defpackage.ah00;
import defpackage.ajn0;
import defpackage.blo0;
import defpackage.bxo0;
import defpackage.c0g;
import defpackage.c6o0;
import defpackage.cfo0;
import defpackage.clo0;
import defpackage.cyn0;
import defpackage.cyx;
import defpackage.czf0;
import defpackage.dlo0;
import defpackage.dpb;
import defpackage.dyx;
import defpackage.e6o0;
import defpackage.ewn0;
import defpackage.flo0;
import defpackage.fn6;
import defpackage.frl0;
import defpackage.fva0;
import defpackage.g6o0;
import defpackage.gnn0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.h6o0;
import defpackage.hio0;
import defpackage.i6r;
import defpackage.ieo0;
import defpackage.jko0;
import defpackage.jpn0;
import defpackage.jvn0;
import defpackage.kf00;
import defpackage.kjn0;
import defpackage.kqe0;
import defpackage.ky2;
import defpackage.len0;
import defpackage.ljn0;
import defpackage.luo0;
import defpackage.lv90;
import defpackage.lx4;
import defpackage.m0o0;
import defpackage.m6a0;
import defpackage.muo0;
import defpackage.mxm0;
import defpackage.nuo0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.odn0;
import defpackage.on2;
import defpackage.ouo0;
import defpackage.p4o0;
import defpackage.p7g;
import defpackage.ph70;
import defpackage.pho;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.pxm0;
import defpackage.q5z;
import defpackage.qgn0;
import defpackage.qu;
import defpackage.r7p0;
import defpackage.rqo;
import defpackage.rx4;
import defpackage.rxn0;
import defpackage.s2b1;
import defpackage.s6k0;
import defpackage.sin0;
import defpackage.sls;
import defpackage.sqm0;
import defpackage.svn0;
import defpackage.tje;
import defpackage.tlo0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u6o0;
import defpackage.uh6;
import defpackage.v1b1;
import defpackage.v5o0;
import defpackage.vko0;
import defpackage.vlo0;
import defpackage.vvn0;
import defpackage.vxm0;
import defpackage.w511;
import defpackage.wko0;
import defpackage.wnt;
import defpackage.wvn0;
import defpackage.xko0;
import defpackage.xun0;
import defpackage.xv8;
import defpackage.xvf0;
import defpackage.yko0;
import defpackage.yoo0;
import defpackage.yvf0;
import defpackage.z970;
import defpackage.zk2;
import defpackage.zko0;
import defpackage.zmm0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzf;
import defpackage.zzs;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.p;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class d extends h55 implements xun0 {
    public final i6r D;
    public final fva0 E;
    public final ru.yandex.taxi.location.user.c F;
    public final h3y G;
    public final vxm0 H;
    public final h3y I;
    public final m0o0 J;
    public final yvf0 K;
    public final h6o0 L;
    public final ouo0 M;
    public final h3y N;
    public final h3y O;
    public final sin0 P;
    public final g Q;
    public final sin0 R;
    public p7g S;

    public d(i6r i6rVar, fva0 fva0Var, ru.yandex.taxi.location.user.c cVar, h3y h3yVar, vxm0 vxm0Var, h3y h3yVar2, m0o0 m0o0Var, yvf0 yvf0Var, h6o0 h6o0Var, ouo0 ouo0Var, h3y h3yVar3, h3y h3yVar4, sin0 sin0Var, g gVar, sin0 sin0Var2) {
        super(null);
        this.D = i6rVar;
        this.E = fva0Var;
        this.F = cVar;
        this.G = h3yVar;
        this.H = vxm0Var;
        this.I = h3yVar2;
        this.J = m0o0Var;
        this.K = yvf0Var;
        this.L = h6o0Var;
        this.M = ouo0Var;
        this.N = h3yVar3;
        this.O = h3yVar4;
        this.P = sin0Var;
        this.Q = gVar;
        this.R = sin0Var2;
    }

    public static void W(d dVar, g6o0 g6o0Var, String str, kqe0 kqe0Var, int i) {
        d dVar2;
        sls slsVar;
        String str2 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            dVar2 = dVar;
            slsVar = new ScootersRouterImpl$realDetailedOrderLaunch$1(0, dVar2, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0);
        } else {
            dVar2 = dVar;
            slsVar = kqe0Var;
        }
        p7g Q = dVar2.Q();
        if (str2 != null) {
            ((u) Q.z4.get()).b.l(str2);
        }
        dVar2.P.a.b(sin0.b(g6o0Var));
        fva0 F2 = ((c0g) Q.a).F2();
        q5z.h(F2);
        dVar2.A(new ru.yandex.taxi.scooters.a(F2, Q.c0, Q.Z4, Q.f5, new sin0(Q.n()), Q.i5, (v5o0) Q.j5.get(), new gnn0(Q.n()), new qgn0(0, Q.n()), Q.k5), g6o0Var, new nuo0(dVar2, slsVar));
    }

    public static void X(d dVar, wvn0 wvn0Var, z970 z970Var, zzs zzsVar, int i) {
        if ((i & 2) != 0) {
            z970Var = null;
        }
        int i2 = 0;
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            zzsVar = null;
        }
        luo0 luo0Var = new luo0(dVar, i2);
        dVar.getClass();
        dVar.V(new zko0(wvn0Var.a, z, zzsVar, z970Var), luo0Var);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersRouterImpl$onAttach$1(this, (wvn0) obj, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        ((ewn0) this.O.get()).b();
        ((ewn0) this.N.get()).b();
        this.S = null;
    }

    public final void P() {
        this.H.a.getClass();
        r(new qu(9));
    }

    public final p7g Q() {
        p7g p7gVar = this.S;
        if (p7gVar != null) {
            return p7gVar;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
        fva0.f(this.E, "ScootersComponent", performanceAnalytics$Type, 0L, 4);
        i6r i6rVar = this.D;
        i6rVar.getClass();
        p7g p7gVar2 = new p7g(new jko0(), new cfo0(), new flo0(), new bxo0(), new ajn0(), new ieo0(), new hio0(), new dlo0(), i6rVar);
        fva0.b(this.E, "ScootersComponent", performanceAnalytics$Type, null, 4);
        this.S = p7gVar2;
        return p7gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0081, code lost:
    
        if (r6.a(r2, r4) == r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(jvn0 jvn0Var, ContinuationImpl continuationImpl) {
        ScootersRouterImpl$handleDeeplinkLaunch$1 scootersRouterImpl$handleDeeplinkLaunch$1;
        Object obj;
        Object obj2;
        int i;
        Uri uri;
        jvn0 jvn0Var2;
        q qVar;
        odn0 odn0Var;
        jvn0 jvn0Var3 = jvn0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersRouterImpl$handleDeeplinkLaunch$1) {
            scootersRouterImpl$handleDeeplinkLaunch$1 = (ScootersRouterImpl$handleDeeplinkLaunch$1) continuationImpl;
            int i2 = scootersRouterImpl$handleDeeplinkLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouterImpl$handleDeeplinkLaunch$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersRouterImpl$handleDeeplinkLaunch$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouterImpl$handleDeeplinkLaunch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uri = jvn0Var3.b;
                    ru.yandex.taxi.scooters.presentation.analytics.a aVar = (ru.yandex.taxi.scooters.presentation.analytics.a) this.G.get();
                    scootersRouterImpl$handleDeeplinkLaunch$1.L$0 = jvn0Var3;
                    scootersRouterImpl$handleDeeplinkLaunch$1.L$1 = uri;
                    scootersRouterImpl$handleDeeplinkLaunch$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        qVar = (q) scootersRouterImpl$handleDeeplinkLaunch$1.L$2;
                        jvn0Var2 = (jvn0) scootersRouterImpl$handleDeeplinkLaunch$1.L$0;
                        kotlin.b.b(obj);
                        odn0Var = (odn0) obj;
                        if (odn0Var != null) {
                            return zy11Var;
                        }
                        qVar.getClass();
                        c6o0 i3 = frl0.m.i(odn0Var.a);
                        if (i3 == null) {
                            scootersRouterImpl$handleDeeplinkLaunch$1.L$0 = null;
                            scootersRouterImpl$handleDeeplinkLaunch$1.L$1 = null;
                            scootersRouterImpl$handleDeeplinkLaunch$1.L$2 = null;
                            scootersRouterImpl$handleDeeplinkLaunch$1.L$3 = null;
                            scootersRouterImpl$handleDeeplinkLaunch$1.label = 3;
                            Object S = S(jvn0Var2, qVar, odn0Var, scootersRouterImpl$handleDeeplinkLaunch$1);
                            return S == obj2 ? obj2 : S;
                        }
                        String str = i3.b;
                        sqm0 a = this.Q.a();
                        zuo0 N = str != null ? uh6.N(a, str) : uh6.z(a) ? (zuo0) kotlin.collections.a.R(uh6.C(a)) : null;
                        if (N == null) {
                            X(this, jvn0Var2, null, null, 30);
                            return zy11Var;
                        }
                        cyn0 b = s2b1.b(i3.f, i3.g, i3.c, i3.d, i3.i, i3.h);
                        if (b != null) {
                            nyn0 m = Q().m();
                            String sessionId = N.getSessionId();
                            if (sessionId != null) {
                                b = cyn0.a(b, sessionId);
                            }
                            p pVar = m.b;
                            pVar.c = true;
                            pVar.b.l(b);
                        }
                        zzs k = N.k();
                        if (k == null) {
                            k = null;
                        }
                        W(this, new e6o0(k != null ? new len0(k) : null), N.getSessionId(), null, 4);
                        return zy11Var;
                    }
                    Uri uri2 = (Uri) scootersRouterImpl$handleDeeplinkLaunch$1.L$1;
                    jvn0 jvn0Var4 = (jvn0) scootersRouterImpl$handleDeeplinkLaunch$1.L$0;
                    kotlin.b.b(obj);
                    uri = uri2;
                    jvn0Var3 = jvn0Var4;
                }
                q qVar2 = (q) this.I.get();
                scootersRouterImpl$handleDeeplinkLaunch$1.L$0 = jvn0Var3;
                scootersRouterImpl$handleDeeplinkLaunch$1.L$1 = null;
                scootersRouterImpl$handleDeeplinkLaunch$1.L$2 = qVar2;
                scootersRouterImpl$handleDeeplinkLaunch$1.label = 2;
                obj = qVar2.p(uri, scootersRouterImpl$handleDeeplinkLaunch$1);
                if (obj != obj2) {
                    jvn0Var2 = jvn0Var3;
                    qVar = qVar2;
                    odn0Var = (odn0) obj;
                    if (odn0Var != null) {
                    }
                }
            }
        }
        scootersRouterImpl$handleDeeplinkLaunch$1 = new ScootersRouterImpl$handleDeeplinkLaunch$1(this, continuationImpl);
        obj = scootersRouterImpl$handleDeeplinkLaunch$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouterImpl$handleDeeplinkLaunch$1.label;
        if (i != 0) {
        }
        q qVar22 = (q) this.I.get();
        scootersRouterImpl$handleDeeplinkLaunch$1.L$0 = jvn0Var3;
        scootersRouterImpl$handleDeeplinkLaunch$1.L$1 = null;
        scootersRouterImpl$handleDeeplinkLaunch$1.L$2 = qVar22;
        scootersRouterImpl$handleDeeplinkLaunch$1.label = 2;
        obj = qVar22.p(uri, scootersRouterImpl$handleDeeplinkLaunch$1);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(jvn0 jvn0Var, q qVar, odn0 odn0Var, ContinuationImpl continuationImpl) {
        ScootersRouterImpl$handlePreorderDeeplink$1 scootersRouterImpl$handlePreorderDeeplink$1;
        int i;
        r7p0 b;
        zzs zzsVar;
        clo0 xko0Var;
        yoo0 o;
        cyn0 b2;
        q qVar2;
        clo0 clo0Var;
        clo0 clo0Var2;
        Double d;
        boolean z;
        jvn0 jvn0Var2 = jvn0Var;
        odn0 odn0Var2 = odn0Var;
        if (continuationImpl instanceof ScootersRouterImpl$handlePreorderDeeplink$1) {
            scootersRouterImpl$handlePreorderDeeplink$1 = (ScootersRouterImpl$handlePreorderDeeplink$1) continuationImpl;
            int i2 = scootersRouterImpl$handlePreorderDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouterImpl$handlePreorderDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouterImpl$handlePreorderDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouterImpl$handlePreorderDeeplink$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qVar.getClass();
                    b = q.b(odn0Var2);
                    Double d2 = odn0Var2.d;
                    Pair pair = (d2 == null || (d = odn0Var2.e) == null) ? null : new Pair(d2, d);
                    zzsVar = pair != null ? new zzs(((Number) pair.getFirst()).doubleValue(), ((Number) pair.getSecond()).doubleValue(), 0, null, null, 28) : null;
                    pxm0 pxm0Var = jvn0Var2.a;
                    ado0 j = frl0.n.j(odn0Var2.a);
                    if (j != null) {
                        int i3 = vko0.a[j.a.ordinal()];
                        if (i3 == 1) {
                            xko0Var = new xko0(pxm0Var, j.b, null);
                        } else if (i3 == 2) {
                            xko0Var = new wko0(pxm0Var, null);
                        } else if (i3 != 3 && i3 != 4) {
                            w511.b();
                            return null;
                        }
                        o = frl0.s.o(odn0Var2.a);
                        if (o != null || (b2 = s2b1.b(o.d, o.e, o.b, o.c, o.g, o.f)) == null) {
                            b2 = s2b1.b(odn0Var2.f, odn0Var2.h, odn0Var2.d, odn0Var2.e, odn0Var2.j, odn0Var2.i);
                        }
                        if (b2 != null) {
                            clo0 clo0Var3 = xko0Var;
                            qVar2 = qVar;
                            clo0Var = clo0Var3;
                            z = jvn0Var2.c;
                            pxm0 pxm0Var2 = jvn0Var2.a;
                            if (!z) {
                                this.H.a.getClass();
                                if (b2 == null) {
                                    z2 = false;
                                }
                            }
                            if (o != null) {
                                V(new blo0(pxm0Var2), new ScootersRouterImpl$handlePreorderDeeplink$2(0, this, d.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
                            } else if (b != null) {
                                qVar2.getClass();
                                V(new yko0(pxm0Var2, odn0Var2.f.contains("qr_superapp") ? new vlo0(zzsVar, b) : new tlo0(zzsVar, b), z2), new ScootersRouterImpl$handlePreorderDeeplink$3(0, this, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                            } else if (zzsVar != null) {
                                X(this, jvn0Var2, null, zzsVar, 18);
                            } else {
                                qVar2.getClass();
                                if (frl0.i.e(odn0Var2.a) != null) {
                                    X(this, jvn0Var2, null, null, 26);
                                } else if (!odn0Var2.f.contains("chargers") || clo0Var == null) {
                                    X(this, jvn0Var2, v1b1.e(qVar2, odn0Var2), null, 28);
                                } else {
                                    V(clo0Var, new ScootersRouterImpl$handlePreorderDeeplink$4(0, this, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                                }
                            }
                            return zy11.a;
                        }
                        p pVar = Q().m().b;
                        pVar.c = true;
                        pVar.b.l(b2);
                        scootersRouterImpl$handlePreorderDeeplink$1.L$0 = jvn0Var2;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$1 = qVar;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$2 = odn0Var2;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$3 = b;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$4 = zzsVar;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$5 = xko0Var;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$6 = o;
                        scootersRouterImpl$handlePreorderDeeplink$1.L$7 = b2;
                        scootersRouterImpl$handlePreorderDeeplink$1.label = 1;
                        if (Y(scootersRouterImpl$handlePreorderDeeplink$1) == obj2) {
                            return obj2;
                        }
                        clo0Var2 = xko0Var;
                        qVar2 = qVar;
                    }
                    xko0Var = null;
                    o = frl0.s.o(odn0Var2.a);
                    if (o != null) {
                    }
                    b2 = s2b1.b(odn0Var2.f, odn0Var2.h, odn0Var2.d, odn0Var2.e, odn0Var2.j, odn0Var2.i);
                    if (b2 != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cyn0 cyn0Var = (cyn0) scootersRouterImpl$handlePreorderDeeplink$1.L$7;
                    yoo0 yoo0Var = (yoo0) scootersRouterImpl$handlePreorderDeeplink$1.L$6;
                    clo0Var2 = (clo0) scootersRouterImpl$handlePreorderDeeplink$1.L$5;
                    zzsVar = (zzs) scootersRouterImpl$handlePreorderDeeplink$1.L$4;
                    b = (r7p0) scootersRouterImpl$handlePreorderDeeplink$1.L$3;
                    odn0 odn0Var3 = (odn0) scootersRouterImpl$handlePreorderDeeplink$1.L$2;
                    qVar2 = (q) scootersRouterImpl$handlePreorderDeeplink$1.L$1;
                    jvn0 jvn0Var3 = (jvn0) scootersRouterImpl$handlePreorderDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    b2 = cyn0Var;
                    o = yoo0Var;
                    jvn0Var2 = jvn0Var3;
                    odn0Var2 = odn0Var3;
                }
                clo0Var = clo0Var2;
                z = jvn0Var2.c;
                pxm0 pxm0Var22 = jvn0Var2.a;
                if (!z) {
                }
                if (o != null) {
                }
                return zy11.a;
            }
        }
        scootersRouterImpl$handlePreorderDeeplink$1 = new ScootersRouterImpl$handlePreorderDeeplink$1(this, continuationImpl);
        Object obj3 = scootersRouterImpl$handlePreorderDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouterImpl$handlePreorderDeeplink$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        clo0Var = clo0Var2;
        z = jvn0Var2.c;
        pxm0 pxm0Var222 = jvn0Var2.a;
        if (!z) {
        }
        if (o != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(svn0 svn0Var, ContinuationImpl continuationImpl) {
        ScootersRouterImpl$handlePromoLaunch$1 scootersRouterImpl$handlePromoLaunch$1;
        int i;
        if (continuationImpl instanceof ScootersRouterImpl$handlePromoLaunch$1) {
            scootersRouterImpl$handlePromoLaunch$1 = (ScootersRouterImpl$handlePromoLaunch$1) continuationImpl;
            int i2 = scootersRouterImpl$handlePromoLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouterImpl$handlePromoLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouterImpl$handlePromoLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouterImpl$handlePromoLaunch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.scooters.presentation.analytics.a aVar = (ru.yandex.taxi.scooters.presentation.analytics.a) this.G.get();
                    Uri uri = svn0Var.b;
                    scootersRouterImpl$handlePromoLaunch$1.L$0 = svn0Var;
                    scootersRouterImpl$handlePromoLaunch$1.label = 1;
                    if (aVar.a(uri, scootersRouterImpl$handlePromoLaunch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    svn0Var = (svn0) scootersRouterImpl$handlePromoLaunch$1.L$0;
                    kotlin.b.b(obj);
                }
                pxm0 pxm0Var = svn0Var.a;
                tlo0 tlo0Var = new tlo0(svn0Var.d, svn0Var.c);
                V(new yko0(pxm0Var, tlo0Var, false), new ScootersRouterImpl$handlePromoLaunch$2(0, this, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                return zy11.a;
            }
        }
        scootersRouterImpl$handlePromoLaunch$1 = new ScootersRouterImpl$handlePromoLaunch$1(this, continuationImpl);
        Object obj2 = scootersRouterImpl$handlePromoLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouterImpl$handlePromoLaunch$1.label;
        if (i != 0) {
        }
        pxm0 pxm0Var2 = svn0Var.a;
        tlo0 tlo0Var2 = new tlo0(svn0Var.d, svn0Var.c);
        V(new yko0(pxm0Var2, tlo0Var2, false), new ScootersRouterImpl$handlePromoLaunch$2(0, this, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(ContinuationImpl continuationImpl) {
        ScootersRouterImpl$handleScootersAppLaunch$1 scootersRouterImpl$handleScootersAppLaunch$1;
        int i;
        sqm0 a;
        String sessionId;
        zuo0 zuo0Var;
        if (continuationImpl instanceof ScootersRouterImpl$handleScootersAppLaunch$1) {
            scootersRouterImpl$handleScootersAppLaunch$1 = (ScootersRouterImpl$handleScootersAppLaunch$1) continuationImpl;
            int i2 = scootersRouterImpl$handleScootersAppLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouterImpl$handleScootersAppLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouterImpl$handleScootersAppLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouterImpl$handleScootersAppLaunch$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = this.Q.a();
                    if (!uh6.z(a)) {
                        ScootersRouterImpl$handleScootersAppLaunch$activeOrdersState$1 scootersRouterImpl$handleScootersAppLaunch$activeOrdersState$1 = new ScootersRouterImpl$handleScootersAppLaunch$activeOrdersState$1(this, null);
                        scootersRouterImpl$handleScootersAppLaunch$1.L$0 = null;
                        scootersRouterImpl$handleScootersAppLaunch$1.label = 1;
                        obj = kotlinx.coroutines.a.w(750L, scootersRouterImpl$handleScootersAppLaunch$activeOrdersState$1, scootersRouterImpl$handleScootersAppLaunch$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    sessionId = (a != null || (zuo0Var = (zuo0) kotlin.collections.a.R(uh6.C(a))) == null) ? null : zuo0Var.getSessionId();
                    if (sessionId != null) {
                        W(this, new e6o0(null), sessionId, null, 4);
                    } else {
                        V(new zko0(vvn0.b.a, false, null, null), new luo0(this, i3));
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = (sqm0) obj;
                if (a != null) {
                }
                if (sessionId != null) {
                }
                return zy11.a;
            }
        }
        scootersRouterImpl$handleScootersAppLaunch$1 = new ScootersRouterImpl$handleScootersAppLaunch$1(this, continuationImpl);
        Object obj2 = scootersRouterImpl$handleScootersAppLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouterImpl$handleScootersAppLaunch$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        a = (sqm0) obj2;
        if (a != null) {
        }
        if (sessionId != null) {
        }
        return zy11.a;
    }

    public final void V(clo0 clo0Var, sls slsVar) {
        p7g Q = Q();
        this.R.a.b(sin0.c(clo0Var));
        c0g c0gVar = (c0g) Q.a;
        wnt v2 = c0gVar.v2();
        q5z.h(v2);
        ah00 z2 = c0gVar.z2();
        q5z.h(z2);
        fva0 F2 = c0gVar.F2();
        q5z.h(F2);
        ewn0 ewn0Var = (ewn0) Q.E.get();
        xv8 xv8Var = Q.H0;
        u6o0 u6o0Var = Q.K0;
        cyx x2 = c0gVar.x2();
        q5z.h(x2);
        zk2 zk2Var = Q.H2;
        zmm0 zmm0Var = Q.p3;
        xvf0 xvf0Var = Q.v3;
        rx4 rx4Var = Q.y3;
        jpn0 jpn0Var = Q.p4;
        pho k2 = c0gVar.k2();
        q5z.h(k2);
        kjn0 kjn0Var = new kjn0(new kf00(k2));
        Context context = (Context) c0gVar.U.get();
        zzf zzfVar = c0gVar.z;
        com.yandex.go.eboks.objects.a aVar = new com.yandex.go.eboks.objects.a(new fn6(context, (on2) zzfVar.w0.get(), (ah00) c0gVar.Vb.get(), (tt2) zzfVar.n.get(), (ky2) zzfVar.b0.get(), (e) c0gVar.J9.get(), new czf0(), (lx4) zzfVar.Y.get(), (pwy0) zzfVar.U.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get(), (po21) zzfVar.Y1.get(), (rqo) zzfVar.C.get()));
        ru.yandex.taxi.layers.presentation.walkroute.simple.b bVar = (ru.yandex.taxi.layers.presentation.walkroute.simple.b) c0gVar.Ee.get();
        q5z.h(bVar);
        rxn0 rxn0Var = (rxn0) c0gVar.Uh.get();
        q5z.h(rxn0Var);
        s6k0 s6k0Var = new s6k0(kjn0Var, aVar, new com.yandex.go.scooters.domain.q(bVar, rxn0Var));
        dyx dyxVar = (dyx) zzfVar.Wl.get();
        q5z.h(dyxVar);
        p4o0 p4o0Var = new p4o0(dyxVar);
        ljn0 ljn0Var = (ljn0) Q.t3.get();
        ph70 ph70Var = Q.u4;
        rxn0 rxn0Var2 = (rxn0) c0gVar.Uh.get();
        q5z.h(rxn0Var2);
        A(new b(v2, z2, F2, ewn0Var, xv8Var, u6o0Var, x2, zk2Var, zmm0Var, xvf0Var, rx4Var, jpn0Var, s6k0Var, p4o0Var, ljn0Var, ph70Var, rxn0Var2, new sin0(Q.n()), (mxm0) Q.o4.get(), new sin0(Q.n()), Q.x4), clo0Var, new muo0(this, clo0Var, slsVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(ContinuationImpl continuationImpl) {
        ScootersRouterImpl$syncSelectedPaymentToScooters$1 scootersRouterImpl$syncSelectedPaymentToScooters$1;
        int i;
        PaymentMethod$Type paymentMethod$Type;
        if (continuationImpl instanceof ScootersRouterImpl$syncSelectedPaymentToScooters$1) {
            scootersRouterImpl$syncSelectedPaymentToScooters$1 = (ScootersRouterImpl$syncSelectedPaymentToScooters$1) continuationImpl;
            int i2 = scootersRouterImpl$syncSelectedPaymentToScooters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouterImpl$syncSelectedPaymentToScooters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouterImpl$syncSelectedPaymentToScooters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouterImpl$syncSelectedPaymentToScooters$1.label;
                i6r i6rVar = this.D;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr b = ((com.yandex.go.payments.data.p) ((c0g) i6rVar).z.rj.get()).b();
                    scootersRouterImpl$syncSelectedPaymentToScooters$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(b, scootersRouterImpl$syncSelectedPaymentToScooters$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                lv90 lv90Var = (lv90) obj;
                paymentMethod$Type = lv90Var.a;
                zy11 zy11Var = zy11.a;
                if (paymentMethod$Type != null) {
                    return zy11Var;
                }
                ((com.yandex.go.scooters.payments.domain.a) ((c0g) i6rVar).r6.get()).b(new m6a0(paymentMethod$Type, lv90Var.b, null));
                return zy11Var;
            }
        }
        scootersRouterImpl$syncSelectedPaymentToScooters$1 = new ScootersRouterImpl$syncSelectedPaymentToScooters$1(this, continuationImpl);
        Object obj2 = scootersRouterImpl$syncSelectedPaymentToScooters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouterImpl$syncSelectedPaymentToScooters$1.label;
        i6r i6rVar2 = this.D;
        if (i != 0) {
        }
        lv90 lv90Var2 = (lv90) obj2;
        paymentMethod$Type = lv90Var2.a;
        zy11 zy11Var2 = zy11.a;
        if (paymentMethod$Type != null) {
        }
    }
}
