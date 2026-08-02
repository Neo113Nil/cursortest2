package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardParams;
import defpackage.b3z;
import defpackage.c1e0;
import defpackage.ccm0;
import defpackage.cfj0;
import defpackage.ds31;
import defpackage.dsg;
import defpackage.edm0;
import defpackage.fbm0;
import defpackage.fcj0;
import defpackage.fdm0;
import defpackage.ftr0;
import defpackage.g5;
import defpackage.g7g;
import defpackage.gbm0;
import defpackage.gdm0;
import defpackage.h73;
import defpackage.i1m0;
import defpackage.j6m0;
import defpackage.jam0;
import defpackage.jqp0;
import defpackage.jzi0;
import defpackage.kam0;
import defpackage.lam0;
import defpackage.lrp0;
import defpackage.mdm0;
import defpackage.mqp0;
import defpackage.nbm0;
import defpackage.nbp0;
import defpackage.ndm0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.obm0;
import defpackage.pbm0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q150;
import defpackage.q1e0;
import defpackage.qbm0;
import defpackage.qv3;
import defpackage.rbm0;
import defpackage.rt1;
import defpackage.rv3;
import defpackage.rx3;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.trp0;
import defpackage.uc5;
import defpackage.ut51;
import defpackage.v41;
import defpackage.v4m0;
import defpackage.vcm0;
import defpackage.w511;
import defpackage.yw01;
import defpackage.z0e0;
import defpackage.zam0;
import defpackage.zj;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 implements ftr0, zj {
    public final SavingsDashboardParams B;
    public final mdm0 C;
    public final tfl0 D;
    public final edm0 E;
    public final fdm0 F;
    public final g5 G;
    public final o8g0 H;
    public pzt0 I;
    public pzt0 J;
    public pzt0 K;
    public qbm0 L;
    public qbm0 M;
    public final com.ybsdk.feature.savings.internal.interactors.v4.b N;

    public c(SavingsDashboardParams savingsDashboardParams, mdm0 mdm0Var, tfl0 tfl0Var, edm0 edm0Var, fdm0 fdm0Var, g5 g5Var, o8g0 o8g0Var, ccm0 ccm0Var, zam0 zam0Var, ut51 ut51Var) {
        super(new v4m0(2), ccm0Var);
        this.B = savingsDashboardParams;
        this.C = mdm0Var;
        this.D = tfl0Var;
        this.E = edm0Var;
        this.F = fdm0Var;
        this.G = g5Var;
        this.H = o8g0Var;
        fcj0 fcj0Var = zam0Var.a;
        this.N = new com.ybsdk.feature.savings.internal.interactors.v4.b((nbp0) ((g7g) fcj0Var.a).get(), (com.ybsdk.utils.poller.b) ((g7g) fcj0Var.b).get(), (AppAnalyticsReporter) ((g7g) fcj0Var.c).get(), (gbm0) ((jzi0) fcj0Var.d).get(), (com.ybsdk.feature.savings.internal.data.b) ((q150) fcj0Var.e).get(), this);
        j6m0 j6m0Var = new j6m0(5, this);
        b3z b3zVar = ((vcm0) edm0Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, j6m0Var, 3));
        b3zVar.a(new qv3(deeplinkHandleResult$DeeplinkType, new SavingsDashboardViewModelV4$3(1, this, c.class, "removeItem", "removeItem(Ljava/lang/String;)V", 0), 1));
        d0(true);
        com.ybsdk.core.utils.ext.c.a(ut51Var.a, ds31.a(this), new cfj0(22, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(c cVar, SavingsDashboardPollStatus savingsDashboardPollStatus, ContinuationImpl continuationImpl) {
        SavingsDashboardViewModelV4$startPolling$1 savingsDashboardViewModelV4$startPolling$1;
        int i;
        q1e0 q1e0Var;
        cVar.getClass();
        if (continuationImpl instanceof SavingsDashboardViewModelV4$startPolling$1) {
            savingsDashboardViewModelV4$startPolling$1 = (SavingsDashboardViewModelV4$startPolling$1) continuationImpl;
            int i2 = savingsDashboardViewModelV4$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardViewModelV4$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardViewModelV4$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardViewModelV4$startPolling$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = savingsDashboardPollStatus == null ? -1 : rbm0.a[savingsDashboardPollStatus.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            q1e0Var = c1e0.b;
                        } else if (i3 == 2) {
                            q1e0Var = z0e0.b;
                        } else if (i3 != 3 && i3 != 4) {
                            w511.b();
                            return null;
                        }
                        ((AppAnalyticsReporter) cVar.H.a).f0.a.a("savings.dashboard.polling.started", null);
                        com.ybsdk.feature.savings.internal.interactors.v4.b bVar = cVar.N;
                        Map<String, String> additionalData = cVar.B.getAdditionalData();
                        savingsDashboardViewModelV4$startPolling$1.label = 1;
                        obj = bVar.b(q1e0Var, additionalData, savingsDashboardViewModelV4$startPolling$1);
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                v41 v41Var = new v41(21, cVar);
                savingsDashboardViewModelV4$startPolling$1.label = 2;
                return ((tpr) obj).collect(v41Var, savingsDashboardViewModelV4$startPolling$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        savingsDashboardViewModelV4$startPolling$1 = new SavingsDashboardViewModelV4$startPolling$1(cVar, continuationImpl);
        Object obj2 = savingsDashboardViewModelV4$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardViewModelV4$startPolling$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        v41 v41Var2 = new v41(21, cVar);
        savingsDashboardViewModelV4$startPolling$1.label = 2;
        if (((tpr) obj2).collect(v41Var2, savingsDashboardViewModelV4$startPolling$1) != coroutineSingletons2) {
        }
    }

    public static void k0(Object obj, String str, Throwable th) {
        String X;
        List singletonList = Collections.singletonList(lrp0.B);
        boolean isEmpty = singletonList.isEmpty();
        if (isEmpty) {
            X = null;
        } else {
            if (isEmpty) {
                w511.b();
                return;
            }
            X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
        }
        if (th == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0(str, X, obj));
        } else {
            trp0 trp0Var2 = trp0.a;
            trp0.e(new jqp0(th, str, obj, X));
        }
    }

    public static /* synthetic */ void l0(c cVar, String str, Object obj) {
        cVar.getClass();
        k0(obj, str, null);
    }

    public final void c0(lam0 lam0Var) {
        List list;
        lam0 lam0Var2 = ((fbm0) X()).d;
        boolean z = (lam0Var2 == null || (list = lam0Var2.e) == null || !(list.isEmpty() ^ true)) ? false : true;
        boolean isEmpty = lam0Var.e.isEmpty();
        if (z && isEmpty) {
            Z(pbm0.a);
        }
        a0(new rx3(lam0Var, this, lam0Var.a.c.getAmount().compareTo(BigDecimal.valueOf((long) ((ndm0) this.C).a())) >= 0, 12));
    }

    public final void d0(boolean z) {
        pzt0 pzt0Var;
        pzt0 pzt0Var2;
        r0 r0Var;
        Object value;
        pzt0 pzt0Var3 = this.J;
        if ((pzt0Var3 != null && pzt0Var3.isActive()) || ((pzt0Var = this.I) != null && pzt0Var.isActive())) {
            Z(obm0.a);
            return;
        }
        if (z) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, fbm0.a((fbm0) value, SavingsDashboardStateV4$Status.Loading, null, null, 30)));
        }
        pzt0 pzt0Var4 = this.K;
        if (pzt0Var4 != null && pzt0Var4.isActive() && (pzt0Var2 = this.I) != null) {
            pzt0Var2.a(null);
        }
        this.I = tje.N(ds31.a(this), null, null, new SavingsDashboardViewModelV4$loadDashboard$2(this, z, null), 3);
    }

    public final void e0() {
        ((AppAnalyticsReporter) this.H.a).f0.a.a("savings.dashboard.return.click", null);
        this.D.e();
    }

    public final void f0() {
        BigDecimal bigDecimal;
        jam0 jam0Var;
        MoneyEntity moneyEntity;
        lam0 lam0Var = ((fbm0) X()).d;
        if (lam0Var == null || (jam0Var = lam0Var.a) == null || (moneyEntity = jam0Var.c) == null || (bigDecimal = moneyEntity.getAmount()) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        ndm0 ndm0Var = (ndm0) this.C;
        BigDecimal valueOf = BigDecimal.valueOf(ndm0Var.a());
        if (!ndm0Var.c() || bigDecimal.compareTo(valueOf) < 0) {
            return;
        }
        Z(nbm0.a);
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, fbm0.a((fbm0) value, null, null, null, 29)));
    }

    public final void h0(String str) {
        kam0 b;
        r0 r0Var;
        Object value;
        fbm0 fbm0Var;
        lam0 lam0Var;
        lam0 lam0Var2 = ((fbm0) X()).d;
        if (lam0Var2 == null || (b = lam0Var2.b(str)) == null) {
            k0(str, "shelf is null, but was clicked", null);
            return;
        }
        int i = 1;
        boolean z = !b.i;
        com.ybsdk.feature.savings.internal.interactors.v4.b bVar = this.N;
        rt1 rt1Var = bVar.c.f0;
        Boolean valueOf = Boolean.valueOf(z);
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("to_open_status", valueOf);
        rt1Var.a.a("savings.dashboard.section.click", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            fbm0Var = (fbm0) value;
            lam0Var = fbm0Var.d;
        } while (!r0Var.k(value, fbm0.a(fbm0Var, null, lam0Var != null ? lam0Var.c(kam0.a(b, null, z, 255)) : null, null, 23)));
        lam0 lam0Var3 = ((fbm0) X()).d;
        if (lam0Var3 != null) {
            bVar.d.b(kotlin.sequences.b.u(new yw01(kotlin.sequences.b.g(new h73(i, lam0Var3.e), new i1m0(18)), new i1m0(19))));
        }
    }

    public final void i0() {
        pzt0 pzt0Var = this.I;
        if (pzt0Var == null || !pzt0Var.k0()) {
            return;
        }
        d0(false);
    }

    public final void j0() {
        jam0 jam0Var;
        ((AppAnalyticsReporter) this.H.a).f0.a.a("savings.dashboard.support.click", null);
        lam0 lam0Var = ((fbm0) X()).d;
        if (((vcm0) this.E).a((lam0Var == null || (jam0Var = lam0Var.a) == null) ? null : jam0Var.e)) {
            return;
        }
        ((gdm0) this.F).a(null);
    }
}
