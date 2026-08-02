package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.content.SharedPreferences;
import android.net.Uri;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.di.modules.features.f;
import com.ybsdk.di.modules.features.g;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.rconfig.configs.ResponseCacheConfigExperiment;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import defpackage.ajg;
import defpackage.awa0;
import defpackage.bvf0;
import defpackage.cjg;
import defpackage.clg;
import defpackage.dlg;
import defpackage.ds31;
import defpackage.e5z0;
import defpackage.ejg;
import defpackage.em3;
import defpackage.ez8;
import defpackage.g8e;
import defpackage.h791;
import defpackage.i5z0;
import defpackage.j0g;
import defpackage.j3h;
import defpackage.kmg;
import defpackage.kpn;
import defpackage.l7;
import defpackage.l8x;
import defpackage.lfp0;
import defpackage.lmg;
import defpackage.mbv;
import defpackage.mkg;
import defpackage.mmg;
import defpackage.mv3;
import defpackage.nmg;
import defpackage.ny61;
import defpackage.omg;
import defpackage.pmg;
import defpackage.psp0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.r8j0;
import defpackage.rkg;
import defpackage.s8j0;
import defpackage.sb0;
import defpackage.sms0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tmg;
import defpackage.tpr;
import defpackage.tvj0;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.vvj0;
import defpackage.w511;
import defpackage.xmg;
import defpackage.ybf;
import defpackage.yig;
import defpackage.z2z;
import defpackage.zlg;
import defpackage.zva0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d extends uc5 {
    public final DashboardV3Params B;
    public final zlg C;
    public final com.ybsdk.feature.dashboard.internal.domain.interactor.a D;
    public final j3h E;
    public final rkg F;
    public final g G;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a H;
    public final f I;
    public final dlg J;
    public final mkg K;
    public final psp0 L;
    public pzt0 M;
    public pzt0 N;
    public pzt0 O;
    public Long P;
    public int Q;

    public d(DashboardV3Params dashboardV3Params, zlg zlgVar, com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar, j3h j3hVar, rkg rkgVar, g gVar, com.ybsdk.feature.banners.impl.domain.interactors.a aVar2, f fVar, dlg dlgVar, mkg mkgVar, psp0 psp0Var, clg clgVar, tpr tprVar, xmg xmgVar) {
        super(new sb0(23, dashboardV3Params, dlgVar, aVar), xmgVar);
        Object putIfAbsent;
        this.B = dashboardV3Params;
        this.C = zlgVar;
        this.D = aVar;
        this.E = j3hVar;
        this.F = rkgVar;
        this.G = gVar;
        this.H = aVar2;
        this.I = fVar;
        this.J = dlgVar;
        this.K = mkgVar;
        this.L = psp0Var;
        this.Q = 1;
        ((cjg) mkgVar).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new ybf(10, this), 13));
        ajg ajgVar = (ajg) clgVar;
        ajgVar.a();
        com.ybsdk.core.utils.ext.c.a(ajgVar.c.a, ds31.a(this), new omg(this, 0));
        tje.N(ds31.a(this), null, null, new DashboardV3ViewModel$4(tprVar, this, null), 3);
        if (((j0g) dlgVar).e(((nmg) X()).a.getProductId())) {
            String productId = ((nmg) X()).a.getProductId();
            com.ybsdk.core.common.data.cache.b bVar = aVar.b.b;
            vvj0 a = com.ybsdk.feature.dashboard.internal.data.c.a(productId);
            ConcurrentHashMap concurrentHashMap = bVar.l;
            ConcurrentHashMap concurrentHashMap2 = bVar.k;
            String str = a.b;
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("ResponseCache");
            e5z0Var.a("Observe cached value", new Object[0]);
            if (!((ResponseCacheConfigExperiment) bVar.b.a.d(tvj0.a).getData()).getEnabled()) {
                bVar.j.remove(str);
                concurrentHashMap2.remove(str);
                l8x l8xVar = (l8x) concurrentHashMap.get(str);
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                concurrentHashMap.remove(str);
            }
            Object obj = concurrentHashMap2.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(str, (obj = bvf0.c(new t8j0())))) != null) {
                obj = putIfAbsent;
            }
            com.ybsdk.core.utils.ext.c.a(e.p(new m0(new l7(18, (tpr) obj, bVar, a), Y(), new DashboardV3ViewModel$observeCache$1(3, null)), 30L), ds31.a(this), new c(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sms0 b0(d dVar, ez8 ez8Var) {
        boolean z;
        yig yigVar;
        int i;
        com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar = dVar.D;
        dlg dlgVar = dVar.J;
        YBSdkVisualParams yBSdkVisualParams = ((ejg) dVar.L).b;
        boolean z2 = false;
        mbv mbvVar = (yBSdkVisualParams.getSkinSelectionImageDark() == null || yBSdkVisualParams.getSkinSelectionImageLight() == null) ? null : new mbv(yBSdkVisualParams.getSkinSelectionImageDark().intValue(), yBSdkVisualParams.getSkinSelectionImageLight().intValue(), -1, false);
        mbv mbvVar2 = mbvVar != null ? new mbv(mbvVar.a, mbvVar.b, 0, mbvVar.d) : null;
        if (mbvVar2 != null) {
            j0g j0gVar = (j0g) dlgVar;
            if (j0gVar.n().b && j0gVar.n().c.contains(ez8Var.a)) {
                z = true;
                yig yigVar2 = aVar.a;
                yigVar = aVar.a;
                i = yigVar2.a.a.getInt("dashboard_skin_onboarding_skip_count", 0);
                int i2 = ((j0g) dlgVar).n().d;
                if (i > 0 || i2 - i <= 0) {
                    SharedPreferences.Editor edit = yigVar.a.a.edit();
                    edit.putInt("dashboard_skin_onboarding_skip_count", 1);
                    edit.apply();
                    z2 = true;
                } else {
                    SharedPreferences.Editor edit2 = yigVar.a.a.edit();
                    edit2.putInt("dashboard_skin_onboarding_skip_count", i + 1);
                    edit2.apply();
                }
                if (z) {
                    return null;
                }
                return new sms0(mbvVar2, z2);
            }
        }
        z = false;
        yig yigVar22 = aVar.a;
        yigVar = aVar.a;
        i = yigVar22.a.a.getInt("dashboard_skin_onboarding_skip_count", 0);
        int i22 = ((j0g) dlgVar).n().d;
        if (i > 0) {
        }
        SharedPreferences.Editor edit3 = yigVar.a.a.edit();
        edit3.putInt("dashboard_skin_onboarding_skip_count", 1);
        edit3.apply();
        z2 = true;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(d dVar, mmg mmgVar, ContinuationImpl continuationImpl) {
        DashboardV3ViewModel$loadCarouselData$1 dashboardV3ViewModel$loadCarouselData$1;
        int i;
        com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar = dVar.D;
        if (continuationImpl instanceof DashboardV3ViewModel$loadCarouselData$1) {
            dashboardV3ViewModel$loadCarouselData$1 = (DashboardV3ViewModel$loadCarouselData$1) continuationImpl;
            int i2 = dashboardV3ViewModel$loadCarouselData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardV3ViewModel$loadCarouselData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardV3ViewModel$loadCarouselData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3ViewModel$loadCarouselData$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (mmgVar instanceof lmg) {
                    String str = ((lmg) mmgVar).a;
                    dashboardV3ViewModel$loadCarouselData$1.label = 1;
                    Object c = aVar.c(str, dashboardV3ViewModel$loadCarouselData$1);
                    if (c != coroutineSingletons) {
                        return c;
                    }
                } else {
                    if (!(mmgVar instanceof kmg)) {
                        w511.b();
                        return null;
                    }
                    String str2 = ((kmg) mmgVar).a;
                    dashboardV3ViewModel$loadCarouselData$1.label = 2;
                    Object b = aVar.b(str2, dashboardV3ViewModel$loadCarouselData$1);
                    if (b != coroutineSingletons) {
                        return b;
                    }
                }
                return coroutineSingletons;
            }
        }
        dashboardV3ViewModel$loadCarouselData$1 = new DashboardV3ViewModel$loadCarouselData$1(dVar, continuationImpl);
        Object obj2 = dashboardV3ViewModel$loadCarouselData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3ViewModel$loadCarouselData$1.label;
        if (i == 0) {
        }
    }

    public static final void d0(d dVar, u8j0 u8j0Var) {
        Long l = dVar.P;
        if (l != null) {
            u8j0Var.getClass();
            if (u8j0Var instanceof r8j0) {
                zlg zlgVar = dVar.C;
                long longValue = l.longValue();
                mmg mmgVar = zlgVar.a;
                boolean z = zlgVar.d;
                String p = g8e.p(z ? "Hot" : "Cold", Extension.DOT_CHAR, zlgVar.f);
                long currentTimeMillis = System.currentTimeMillis() - longValue;
                zlgVar.c.a(currentTimeMillis, zlg.b(mmgVar, "Insta.DashboardV3", p));
                em3 em3Var = zlgVar.b.s;
                LinkedHashMap w = g8e.w(3, "product_id", mmgVar.getProductId());
                w.put("duration_ms", Integer.valueOf((int) currentTimeMillis));
                w.put("is_cached", Boolean.valueOf(z));
                em3Var.a.a("dashboard.content_ready_to_display", w);
                dVar.P = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
    
        if (r3.a(r2.b) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(d dVar, List list, List list2, ContinuationImpl continuationImpl) {
        DashboardV3ViewModel$showInfoContent$1 dashboardV3ViewModel$showInfoContent$1;
        int i;
        kpn kpnVar;
        boolean e;
        kpn kpnVar2;
        qis qisVar;
        boolean z;
        boolean z2;
        pz40 Y;
        r0 r0Var;
        Object value;
        com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar = dVar.D;
        com.ybsdk.feature.banners.impl.domain.interactors.a aVar2 = dVar.H;
        dlg dlgVar = dVar.J;
        if (continuationImpl instanceof DashboardV3ViewModel$showInfoContent$1) {
            dashboardV3ViewModel$showInfoContent$1 = (DashboardV3ViewModel$showInfoContent$1) continuationImpl;
            int i2 = dashboardV3ViewModel$showInfoContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardV3ViewModel$showInfoContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardV3ViewModel$showInfoContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3ViewModel$showInfoContent$1.label;
                qis qisVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j0g j0gVar = (j0g) dlgVar;
                    if (!j0gVar.e(((nmg) dVar.X()).a.getProductId())) {
                        if (list2 != null) {
                            kpnVar = (kpn) kotlin.collections.a.R(list2);
                            e = j0gVar.e(((nmg) dVar.X()).a.getProductId());
                            lfp0 lfp0Var = lfp0.b;
                            if (e) {
                            }
                            return coroutineSingletons;
                        }
                        kpnVar = null;
                        e = j0gVar.e(((nmg) dVar.X()).a.getProductId());
                        lfp0 lfp0Var2 = lfp0.b;
                        if (e) {
                        }
                        return coroutineSingletons;
                    }
                    if (list2 != null) {
                        kpnVar = (kpn) kotlin.collections.a.R(list2);
                        if (kpnVar != null) {
                        }
                    }
                    kpnVar = null;
                    e = j0gVar.e(((nmg) dVar.X()).a.getProductId());
                    lfp0 lfp0Var22 = lfp0.b;
                    if (e) {
                        dashboardV3ViewModel$showInfoContent$1.L$0 = kpnVar;
                        dashboardV3ViewModel$showInfoContent$1.label = 1;
                        qis a = aVar2.a(list, lfp0Var22);
                        if (a != coroutineSingletons) {
                            kpn kpnVar3 = kpnVar;
                            obj = a;
                            kpnVar2 = kpnVar3;
                            qisVar = (qis) obj;
                            if (qisVar != null) {
                            }
                            qisVar = null;
                        }
                    } else {
                        dashboardV3ViewModel$showInfoContent$1.L$0 = kpnVar;
                        dashboardV3ViewModel$showInfoContent$1.label = 2;
                        qis a2 = aVar2.a(list, lfp0Var22);
                        if (a2 != coroutineSingletons) {
                            kpn kpnVar4 = kpnVar;
                            obj = a2;
                            kpnVar2 = kpnVar4;
                            qisVar = (qis) obj;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kpnVar2 = (kpn) dashboardV3ViewModel$showInfoContent$1.L$0;
                    kotlin.b.b(obj);
                    qisVar = (qis) obj;
                    if (qisVar != null || aVar.a(qisVar.c)) {
                        qisVar = null;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kpnVar2 = (kpn) dashboardV3ViewModel$showInfoContent$1.L$0;
                    kotlin.b.b(obj);
                    qisVar = (qis) obj;
                }
                if (qisVar != null) {
                    dVar.Z(new pmg(qisVar));
                    qisVar2 = qisVar;
                }
                z = qisVar2 == null;
                z2 = z && kpnVar2 != null;
                Y = dVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, z2, false, false, z, null, 7039)));
                return zy11.a;
            }
        }
        dashboardV3ViewModel$showInfoContent$1 = new DashboardV3ViewModel$showInfoContent$1(dVar, continuationImpl);
        Object obj2 = dashboardV3ViewModel$showInfoContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3ViewModel$showInfoContent$1.label;
        qis qisVar22 = null;
        if (i != 0) {
        }
        if (qisVar != null) {
        }
        if (qisVar22 == null) {
        }
        if (z) {
        }
        Y = dVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, z2, false, false, z, null, 7039)));
        return zy11.a;
    }

    public static void g0(d dVar) {
        mmg mmgVar = ((nmg) dVar.X()).a;
        zlg zlgVar = dVar.C;
        if (((j0g) dVar.J).e(((nmg) dVar.X()).a.getProductId())) {
            dVar.t0(mmgVar);
            return;
        }
        awa0 awa0Var = zlgVar.c;
        awa0 awa0Var2 = zlgVar.c;
        mmg mmgVar2 = zlgVar.a;
        zva0 b = awa0Var.b(zlg.b(mmgVar2, "DashboardV3.Data", null));
        zva0 b2 = awa0Var2.b(zlg.b(mmgVar2, "DashboardV3.Data", "Fail"));
        zva0 b3 = awa0Var2.b(zlg.b(mmgVar2, "DashboardV3.Data", "Success"));
        pzt0 pzt0Var = dVar.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.M = tje.N(ds31.a(dVar), null, null, new DashboardV3ViewModel$loadData$1(mmgVar, b, b3, b2, dVar, null), 3);
    }

    public final OrientationAwareRecyclerView.a f0() {
        j0g j0gVar = (j0g) this.J;
        return new OrientationAwareRecyclerView.a(((com.ybsdk.rconfig.b) j0gVar.a).g().isEnabled(), ((com.ybsdk.rconfig.b) j0gVar.a).g().getScrollAngle());
    }

    public final void h0() {
        zlg zlgVar = this.C;
        em3 em3Var = zlgVar.b.s;
        mmg mmgVar = zlgVar.a;
        String f = zlg.f(mmgVar);
        String e = zlg.e(mmgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (e != null) {
            linkedHashMap.put("member_id", e);
        }
        linkedHashMap.put("product_id", f);
        em3Var.a.a("dashboard.exit.click", linkedHashMap);
    }

    public final void i0(String str) {
        zlg zlgVar = this.C;
        em3 em3Var = zlgVar.b.s;
        mmg mmgVar = zlgVar.a;
        String f = zlg.f(mmgVar);
        String e = zlg.e(mmgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (str != null) {
            linkedHashMap.put("id", str);
        }
        if (e != null) {
            linkedHashMap.put("member_id", e);
        }
        linkedHashMap.put("product_id", f);
        em3Var.a.a("dashboard.merchant_promo.shown", linkedHashMap);
    }

    public final void j0() {
        g0(this);
    }

    public final boolean k0(Uri uri) {
        z2z c = ((cjg) this.K).a.c(uri.toString());
        return c.b || (c.a instanceof v0h);
    }

    public final void l0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, false, false, false, false, null, 8063)));
    }

    public final void m0() {
        String supportUrl;
        u8j0 u8j0Var = ((nmg) X()).b;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        com.ybsdk.di.modules.features.e eVar = (com.ybsdk.di.modules.features.e) this.F;
        h791.f(eVar.a, supportUrl, com.ybsdk.feature.webview.api.a.b(eVar.b, supportUrl, null, null, 6));
    }

    public final void n0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nmg.a((nmg) value, null, null, true, false, false, false, false, null, 8183)));
        g0(this);
    }

    public final void o0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nmg.a((nmg) value, new t8j0(), null, false, false, false, false, false, null, 8189)));
        g0(this);
    }

    public final void p0(TopButtonTag topButtonTag, String str) {
        int i = tmg.a[topButtonTag.ordinal()];
        zlg zlgVar = this.C;
        if (i == 1) {
            em3 em3Var = zlgVar.b.s;
            mmg mmgVar = zlgVar.a;
            String f = zlg.f(mmgVar);
            String e = zlg.e(mmgVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            if (e != null) {
                linkedHashMap.put("member_id", e);
            }
            linkedHashMap.put("product_id", f);
            em3Var.a.a("dashboard.support.click", linkedHashMap);
        } else if (i == 2) {
            em3 em3Var2 = zlgVar.b.s;
            mmg mmgVar2 = zlgVar.a;
            String f2 = zlg.f(mmgVar2);
            String e2 = zlg.e(mmgVar2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(3);
            if (e2 != null) {
                linkedHashMap2.put("member_id", e2);
            }
            linkedHashMap2.put("product_id", f2);
            em3Var2.a.a("dashboard.profile.click", linkedHashMap2);
        } else if (i != 3) {
            w511.b();
            return;
        }
        h791.e(this.E, str, false, null, 14);
    }

    public final void q0() {
        if (this.P == null) {
            this.P = Long.valueOf(System.currentTimeMillis());
        }
        zlg zlgVar = this.C;
        em3 em3Var = zlgVar.b.s;
        mmg mmgVar = zlgVar.a;
        String f = zlg.f(mmgVar);
        String e = zlg.e(mmgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (e != null) {
            linkedHashMap.put("member_id", e);
        }
        linkedHashMap.put("product_id", f);
        em3Var.a.a("dashboard.open", linkedHashMap);
        g0(this);
        this.N = tje.N(ds31.a(this), null, null, new DashboardV3ViewModel$onViewCreated$1(this, null), 3);
    }

    public final void r0() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
    }

    public final void s0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new DashboardV3ViewModel$showFullscreen$1(this, qisVar, null), 3);
    }

    public final void t0(mmg mmgVar) {
        zlg zlgVar = this.C;
        awa0 awa0Var = zlgVar.c;
        mmg mmgVar2 = zlgVar.a;
        zva0 b = awa0Var.b(zlg.b(mmgVar2, "DashboardV3.Data", null));
        awa0 awa0Var2 = zlgVar.c;
        zva0 b2 = awa0Var2.b(zlg.b(mmgVar2, "DashboardV3.Data", "Fail"));
        zva0 b3 = awa0Var2.b(zlg.b(mmgVar2, "DashboardV3.Data", "Success"));
        zlgVar.d();
        String b4 = zlg.b(mmgVar, "Insta.DashboardV3", "Update." + zlgVar.f);
        awa0Var2.getClass();
        zlgVar.e = new zva0(awa0Var2, b4);
        long j = ((j0g) this.J).s().c;
        if (this.O == null || j <= 0) {
            this.O = tje.N(ds31.a(this), null, null, new DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1(j, this, null), 3);
        }
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new DashboardV3ViewModel$updateCache$1(mmgVar, b, b3, b2, this, null), 3);
    }
}
