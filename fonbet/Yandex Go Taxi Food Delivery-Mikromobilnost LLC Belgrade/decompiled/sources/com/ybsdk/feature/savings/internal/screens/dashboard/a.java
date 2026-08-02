package com.ybsdk.feature.savings.internal.screens.dashboard;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.di.modules.features.q;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import com.ybsdk.feature.savings.internal.interactors.f;
import com.ybsdk.rconfig.configs.SavingsAccountBalanceAnimation;
import com.ybsdk.widgets.common.shimmer.b;
import defpackage.abm0;
import defpackage.acm0;
import defpackage.b1e0;
import defpackage.cam0;
import defpackage.cc2;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.ebm0;
import defpackage.edm0;
import defpackage.fdm0;
import defpackage.g5;
import defpackage.g7g;
import defpackage.gc5;
import defpackage.gdm0;
import defpackage.hbm0;
import defpackage.iam0;
import defpackage.j6m0;
import defpackage.jbm0;
import defpackage.jl40;
import defpackage.kbm0;
import defpackage.kdd0;
import defpackage.lbm0;
import defpackage.mdm0;
import defpackage.n4m0;
import defpackage.ndm0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.oo31;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q150;
import defpackage.q1e0;
import defpackage.rbv;
import defpackage.rv3;
import defpackage.scc;
import defpackage.scm0;
import defpackage.ssa1;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.ut51;
import defpackage.vcm0;
import defpackage.vo6;
import defpackage.w511;
import defpackage.x4c;
import defpackage.y0e0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final SavingsDashboardParams B;
    public final mdm0 C;
    public final edm0 D;
    public final fdm0 E;
    public final tfl0 F;
    public final b G;
    public final g5 H;
    public final o8g0 I;
    public pzt0 J;
    public pzt0 K;
    public pzt0 L;
    public final f M;
    public boolean N;
    public boolean O;
    public Integer P;
    public Integer Q;

    public a(SavingsDashboardParams savingsDashboardParams, mdm0 mdm0Var, edm0 edm0Var, fdm0 fdm0Var, tfl0 tfl0Var, b bVar, g5 g5Var, o8g0 o8g0Var, acm0 acm0Var, abm0 abm0Var, ut51 ut51Var) {
        super(new vo6(bVar, 2), acm0Var);
        this.B = savingsDashboardParams;
        this.C = mdm0Var;
        this.D = edm0Var;
        this.E = fdm0Var;
        this.F = tfl0Var;
        this.G = bVar;
        this.H = g5Var;
        this.I = o8g0Var;
        kdd0 kdd0Var = abm0Var.a;
        this.M = new f((com.ybsdk.feature.savings.internal.data.b) ((q150) kdd0Var.a).get(), (q) ((g7g) kdd0Var.b).get(), (AppAnalyticsReporter) ((g7g) kdd0Var.c).get(), (com.ybsdk.utils.poller.b) ((g7g) kdd0Var.d).get(), this);
        this.O = true;
        ((vcm0) edm0Var).a.a(new rv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new j6m0(4, this), 3));
        e0(true);
        c.a(ut51Var.a, ds31.a(this), new hbm0(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (((defpackage.tpr) r14).collect(r13, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, SavingsDashboardPollStatus savingsDashboardPollStatus, ContinuationImpl continuationImpl) {
        SavingsDashboardViewModel$startPolling$1 savingsDashboardViewModel$startPolling$1;
        int i;
        q1e0 q1e0Var;
        r0 r0Var;
        Object value;
        aVar.getClass();
        if (continuationImpl instanceof SavingsDashboardViewModel$startPolling$1) {
            savingsDashboardViewModel$startPolling$1 = (SavingsDashboardViewModel$startPolling$1) continuationImpl;
            int i2 = savingsDashboardViewModel$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardViewModel$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardViewModel$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardViewModel$startPolling$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i4 = savingsDashboardPollStatus == null ? -1 : lbm0.a[savingsDashboardPollStatus.ordinal()];
                    if (i4 != -1) {
                        if (i4 == 1) {
                            q1e0Var = b1e0.b;
                        } else if (i4 == 2) {
                            q1e0Var = y0e0.b;
                        } else if (i4 != 3 && i4 != 4) {
                            w511.b();
                            return null;
                        }
                        ((AppAnalyticsReporter) aVar.I.a).f0.a.a("savings.dashboard.polling.started", null);
                        pzt0 pzt0Var = aVar.L;
                        if (pzt0Var != null && pzt0Var.isActive()) {
                            pzt0 pzt0Var2 = aVar.J;
                            if (pzt0Var2 != null) {
                                pzt0Var2.a(null);
                            }
                            aVar.N = true;
                        }
                        f fVar = aVar.M;
                        Map<String, String> additionalData = aVar.B.getAdditionalData();
                        savingsDashboardViewModel$startPolling$1.label = 1;
                        obj = fVar.b(q1e0Var, additionalData, savingsDashboardViewModel$startPolling$1);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, ebm0.a((ebm0) value, null, false, null, false, null, null, 0, false, false, null, 1015)));
                    return zy11.a;
                }
                kotlin.b.b(obj);
                hbm0 hbm0Var = new hbm0(aVar, i3);
                savingsDashboardViewModel$startPolling$1.label = 2;
            }
        }
        savingsDashboardViewModel$startPolling$1 = new SavingsDashboardViewModel$startPolling$1(aVar, continuationImpl);
        Object obj2 = savingsDashboardViewModel$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardViewModel$startPolling$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        hbm0 hbm0Var2 = new hbm0(aVar, i32);
        savingsDashboardViewModel$startPolling$1.label = 2;
    }

    public static final void c0(a aVar, Object obj, rbv rbvVar) {
        MoneyEntity moneyEntity;
        BigDecimal amount;
        mdm0 mdm0Var = aVar.C;
        aVar.Z(kbm0.a);
        boolean z = obj instanceof Result.Failure;
        iam0 iam0Var = (iam0) (z ? null : obj);
        ndm0 ndm0Var = (ndm0) mdm0Var;
        boolean z2 = false;
        aVar.a0(new cc2(obj, aVar, rbvVar, ((SavingsAccountBalanceAnimation) ndm0Var.a.d(n4m0.c).getData()).isEnabled() && ((((iam0Var == null || (moneyEntity = iam0Var.c) == null || (amount = moneyEntity.getAmount()) == null) ? 0L : amount.longValue()) > ((long) ndm0Var.a()) ? 1 : (((iam0Var == null || (moneyEntity = iam0Var.c) == null || (amount = moneyEntity.getAmount()) == null) ? 0L : amount.longValue()) == ((long) ndm0Var.a()) ? 0 : -1)) >= 0) && aVar.I.b(), 6));
        if (aVar.O && z) {
            z2 = true;
        }
        aVar.O = z2;
    }

    public static String d0(gc5 gc5Var) {
        String str;
        cam0 cam0Var = gc5Var instanceof cam0 ? (cam0) gc5Var : null;
        if (cam0Var != null && (str = cam0Var.k) != null) {
            return str;
        }
        scm0 scm0Var = gc5Var instanceof scm0 ? (scm0) gc5Var : null;
        if (scm0Var != null) {
            return scm0Var.e;
        }
        return null;
    }

    public static SavingsDivEntity$ProductType o0(gc5 gc5Var) {
        scm0 scm0Var = gc5Var instanceof scm0 ? (scm0) gc5Var : null;
        if (scm0Var != null) {
            return scm0Var.j;
        }
        return null;
    }

    public final void e0(boolean z) {
        pzt0 pzt0Var;
        pzt0 pzt0Var2 = this.K;
        if ((pzt0Var2 != null && pzt0Var2.isActive()) || ((pzt0Var = this.J) != null && pzt0Var.isActive())) {
            Z(kbm0.a);
            return;
        }
        if (z) {
            tje.N(ds31.a(this), null, null, new SavingsDashboardViewModel$initShimmerFlow$1(this, null), 3);
        }
        pzt0 pzt0Var3 = this.L;
        if (pzt0Var3 != null && pzt0Var3.isActive()) {
            pzt0 pzt0Var4 = this.J;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            this.N = true;
        }
        this.J = tje.N(ds31.a(this), null, null, new SavingsDashboardViewModel$loadData$1(this, z, null), 3);
    }

    public final void f0() {
        ((AppAnalyticsReporter) this.I.a).f0.a.a("savings.dashboard.return.click", null);
        this.F.e();
    }

    public final void g0() {
        MoneyEntity moneyEntity;
        BigDecimal amount;
        iam0 iam0Var = ((ebm0) X()).f;
        long longValue = (iam0Var == null || (moneyEntity = iam0Var.c) == null || (amount = moneyEntity.getAmount()) == null) ? 0L : amount.longValue();
        ndm0 ndm0Var = (ndm0) this.C;
        boolean z = longValue >= ((long) ndm0Var.a());
        if (ndm0Var.c() && z) {
            Z(jbm0.a);
        }
    }

    public final void h0(int i, int i2) {
        List list;
        r0 r0Var;
        Object value;
        ebm0 ebm0Var;
        iam0 iam0Var;
        List list2;
        if (i == i2) {
            return;
        }
        iam0 iam0Var2 = ((ebm0) X()).f;
        int size = (iam0Var2 == null || (list2 = iam0Var2.h) == null) ? 0 : list2.size();
        int i3 = i - size;
        int i4 = i2 - size;
        this.Q = Integer.valueOf(i4);
        iam0 iam0Var3 = ((ebm0) X()).f;
        if (iam0Var3 == null || (list = iam0Var3.f) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(i4, (gc5) arrayList.remove(i3));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            ebm0Var = (ebm0) value;
            iam0Var = ebm0Var.f;
        } while (!r0Var.k(value, ebm0.a(ebm0Var, null, false, null, false, null, iam0Var != null ? new iam0(iam0Var.a, iam0Var.b, iam0Var.c, iam0Var.d, iam0Var.e, arrayList, iam0Var.g, iam0Var.h, iam0Var.i) : null, 0, false, false, null, 991)));
    }

    public final void i0(int i) {
        List list;
        iam0 iam0Var = ((ebm0) X()).f;
        int size = i - ((iam0Var == null || (list = iam0Var.h) == null) ? 0 : list.size());
        this.P = Integer.valueOf(size);
        iam0 iam0Var2 = ((ebm0) X()).f;
        gc5 gc5Var = null;
        List list2 = iam0Var2 != null ? iam0Var2.f : null;
        if (list2 != null) {
            Integer num = this.P;
            if (num == null) {
                return;
            } else {
                gc5Var = (gc5) kotlin.collections.a.S(num.intValue(), list2);
            }
        }
        SavingsDivEntity$ProductType o0 = o0(gc5Var);
        String d0 = d0(gc5Var);
        this.I.n(size, d0 != null ? ssa1.b(d0) : "", o0);
    }

    public final boolean j0(Uri uri) {
        return ((vcm0) this.D).a(uri.toString());
    }

    public final void k0() {
        oo31.n(this.M.a.b.a.a, "savings_drag_and_drop_should_show_onboarding", false);
    }

    public final void l0() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var == null || !pzt0Var.k0()) {
            return;
        }
        e0(false);
    }

    public final void m0() {
        r0 r0Var;
        Object value;
        List list;
        Integer num = null;
        ((AppAnalyticsReporter) this.I.a).f0.a.a("savings.dashboard.income.click", null);
        iam0 iam0Var = ((ebm0) X()).f;
        if (iam0Var != null && (list = iam0Var.e) != null) {
            num = Integer.valueOf(scc.f(list));
        }
        int i = (num != null && ((ebm0) X()).g == num.intValue()) ? 0 : ((ebm0) X()).g + 1;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ebm0.a((ebm0) value, null, false, null, false, null, null, i, false, false, null, 959)));
    }

    public final void n0() {
        String str;
        ((AppAnalyticsReporter) this.I.a).f0.a.a("savings.dashboard.support.click", null);
        iam0 iam0Var = ((ebm0) X()).f;
        if (iam0Var == null || (str = iam0Var.d) == null || ((vcm0) this.D).a(str)) {
            return;
        }
        x4c.g("Savings Account Dashboard can't handle deeplink", null, str, null, 10);
        ((gdm0) this.E).a(null);
    }

    public final void p0() {
        ((AppAnalyticsReporter) this.I.a).f0.a.a("savings.dashboard.pulled_to_refresh", null);
        e0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        gc5 gc5Var;
        pzt0 pzt0Var;
        iam0 iam0Var;
        List list;
        pzt0 pzt0Var2;
        ?? r2;
        List list2;
        List list3;
        List list4;
        if (jl40.l(this.Q, this.P)) {
            return;
        }
        pzt0 pzt0Var3 = this.L;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        iam0 iam0Var2 = ((ebm0) X()).f;
        if (iam0Var2 != null && (list4 = iam0Var2.f) != null) {
            Integer num = this.Q;
            if (num != null) {
                gc5Var = (gc5) kotlin.collections.a.S(num.intValue(), list4);
            }
            pzt0Var = this.J;
            if (pzt0Var != null && pzt0Var.isActive()) {
                pzt0Var2 = this.J;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                this.N = true;
            }
            iam0Var = ((ebm0) X()).f;
            if (iam0Var != null || (list = iam0Var.f) == null) {
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String d0 = d0((gc5) it.next());
                if (d0 != null) {
                    arrayList.add(d0);
                }
            }
            this.L = tje.N(ds31.a(this), null, null, new SavingsDashboardViewModel$setFinalCellsOrder$1(this, arrayList, unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_drag_and_drop_snackbar_error_title), new Text.Resource(dzh0.ybsdk_savings_savings_drag_and_drop_snackbar_error_description), null), 3);
            return;
        }
        gc5Var = null;
        String d02 = d0(gc5Var);
        String b = d02 != null ? ssa1.b(d02) : "";
        SavingsDivEntity$ProductType o0 = o0(gc5Var);
        iam0 iam0Var3 = ((ebm0) X()).f;
        if (iam0Var3 == null || (list3 = iam0Var3.f) == null) {
            r2 = EmptyList.a;
        } else {
            r2 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                String d03 = d0((gc5) it2.next());
                String b2 = d03 != null ? ssa1.b(d03) : null;
                if (b2 != null) {
                    r2.add(b2);
                }
            }
        }
        List list5 = r2;
        Integer num2 = this.P;
        int i = -1;
        int intValue = num2 != null ? num2.intValue() : -1;
        Integer num3 = this.Q;
        int intValue2 = num3 != null ? num3.intValue() : -1;
        iam0 iam0Var4 = ((ebm0) X()).f;
        if (iam0Var4 != null && (list2 = iam0Var4.f) != null) {
            i = list2.size();
        }
        this.I.m(b, list5, intValue, intValue2, o0, i);
        this.P = null;
        this.Q = null;
        pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var2 = this.J;
            if (pzt0Var2 != null) {
            }
            this.N = true;
        }
        iam0Var = ((ebm0) X()).f;
        if (iam0Var != null) {
        }
    }
}
