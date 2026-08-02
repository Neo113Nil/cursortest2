package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.HomeScreenEvents$HomeScreenLoadedResult;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import defpackage.ang;
import defpackage.bng;
import defpackage.bwz0;
import defpackage.ds31;
import defpackage.e5z0;
import defpackage.em3;
import defpackage.hrp0;
import defpackage.i5z0;
import defpackage.lfp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pig;
import defpackage.plg;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x5t;
import defpackage.zmg;
import defpackage.zva0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardViewModel$requestData$1", f = "DashboardViewModel.kt", l = {195, 206}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardViewModel$requestData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $atDashboardOpening;
    final /* synthetic */ zva0 $commonTrace;
    final /* synthetic */ zva0 $failTrace;
    final /* synthetic */ zva0 $successTrace;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardViewModel$requestData$1$1", f = "DashboardViewModel.kt", l = {192}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardViewModel$requestData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                this.label = 1;
                if (b.b0(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$requestData$1(b bVar, zva0 zva0Var, zva0 zva0Var2, boolean z, zva0 zva0Var3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$commonTrace = zva0Var;
        this.$successTrace = zva0Var2;
        this.$atDashboardOpening = z;
        this.$failTrace = zva0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardViewModel$requestData$1 dashboardViewModel$requestData$1 = new DashboardViewModel$requestData$1(this.this$0, this.$commonTrace, this.$successTrace, this.$atDashboardOpening, this.$failTrace, continuation);
        dashboardViewModel$requestData$1.L$0 = obj;
        return dashboardViewModel$requestData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardViewModel$requestData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x007c, code lost:
    
        if (r9 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x015a  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        plg plgVar;
        b bVar;
        Object b;
        String name;
        r0 r0Var2;
        Object value2;
        Object a;
        b bVar2;
        String name2;
        Throwable a2;
        r0 r0Var3;
        Object value3;
        qis qisVar;
        pig pigVar;
        EmptyList emptyList;
        Iterator it;
        boolean z;
        x5t x5tVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EmptyList emptyList2 = EmptyList.a;
        EmptyList emptyList3 = null;
        emptyList3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N((tse) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                plgVar = (plg) value;
            } while (!r0Var.k(value, plg.a(plgVar, plgVar.d.c(), null, null, null, 2039)));
            bVar = this.this$0;
            com.ybsdk.feature.dashboard.internal.domain.interactors.b bVar3 = bVar.B;
            DashboardScreenParams dashboardScreenParams = bVar.G;
            this.L$0 = bVar;
            this.label = 1;
            b = bVar3.b(dashboardScreenParams, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = (b) this.L$1;
                Object obj2 = this.L$0;
                kotlin.b.b(obj);
                b = obj2;
                a = obj;
                qisVar = (qis) a;
                if (qisVar == null) {
                    bVar2.Z(new bng(qisVar));
                } else {
                    qisVar = null;
                }
                if (qisVar == null && bVar2.J.a.a.getBoolean("need_show_auto_topup_tooltip", false)) {
                    pigVar = (pig) ((plg) bVar2.X()).d.a();
                    if (pigVar != null && (x5tVar = pigVar.d) != null) {
                        emptyList3 = x5tVar.f;
                    }
                    if (emptyList3 != null) {
                        emptyList2 = emptyList3;
                    }
                    emptyList = emptyList2;
                    if ((emptyList instanceof Collection) || !emptyList.isEmpty()) {
                        it = emptyList.iterator();
                        while (it.hasNext()) {
                            if (((bwz0) it.next()).c == TopButtonTag.PROFILE) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    bVar2.Z(new ang(((plg) bVar2.X()).f, ((plg) bVar2.X()).h == null, z));
                }
                zva0 zva0Var = this.$failTrace;
                b bVar4 = this.this$0;
                a2 = Result.a(b);
                if (a2 != null) {
                    zva0Var.a();
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("DashboardViewModel");
                    e5z0Var.b(a2);
                    bVar4.D.D.f("load", HomeScreenEvents$HomeScreenLoadedResult.ERROR, a2.getMessage());
                    pz40 Y2 = bVar4.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, plg.a((plg) value3, new s8j0(a2), null, null, null, 2039)));
                }
                this.$commonTrace.a();
                this.this$0.Z(zmg.a);
                return zy11.a;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        AppAnalyticsReporter appAnalyticsReporter = bVar.D;
        boolean z2 = b instanceof Result.Failure;
        if (!z2) {
            em3 em3Var = appAnalyticsReporter.s;
            ProductId productId = ((plg) bVar.X()).a;
            if (productId != null && (name2 = productId.name()) != null) {
                em3.b(em3Var, null, name2, ((plg) bVar.X()).b, DashboardEvents$DashboardLoadedResult.OK, null, 17);
            }
            zva0 zva0Var2 = this.$successTrace;
            b bVar5 = this.this$0;
            boolean z3 = this.$atDashboardOpening;
            if (!z2) {
                pig pigVar2 = (pig) b;
                zva0Var2.a();
                bVar5.D.D.f("load", HomeScreenEvents$HomeScreenLoadedResult.OK, null);
                if (z3) {
                    trp0 trp0Var = trp0.a;
                    trp0.f(hrp0.c);
                }
                pz40 Y3 = bVar5.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, plg.a((plg) value2, new r8j0(pigVar2, null, 14), null, null, null, 2039)));
                bVar5.F0();
                pzt0 pzt0Var = bVar5.Q;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar5.Q = tje.N(ds31.a(bVar5), null, null, new DashboardViewModel$subscribeToCardStatus$1(bVar5, null), 3);
                List list = pigVar2.a;
                if (list == null) {
                    list = emptyList2;
                }
                this.L$0 = b;
                this.L$1 = bVar5;
                this.label = 2;
                a = bVar5.I.a(list, lfp0.b);
                if (a != coroutineSingletons) {
                    bVar2 = bVar5;
                    qisVar = (qis) a;
                    if (qisVar == null) {
                    }
                    if (qisVar == null) {
                        pigVar = (pig) ((plg) bVar2.X()).d.a();
                        if (pigVar != null) {
                            emptyList3 = x5tVar.f;
                        }
                        if (emptyList3 != null) {
                        }
                        emptyList = emptyList2;
                        if (emptyList instanceof Collection) {
                        }
                        it = emptyList.iterator();
                        while (it.hasNext()) {
                        }
                        z = false;
                        bVar2.Z(new ang(((plg) bVar2.X()).f, ((plg) bVar2.X()).h == null, z));
                    }
                }
                return coroutineSingletons;
            }
            zva0 zva0Var3 = this.$failTrace;
            b bVar42 = this.this$0;
            a2 = Result.a(b);
            if (a2 != null) {
            }
            this.$commonTrace.a();
            this.this$0.Z(zmg.a);
            return zy11.a;
        }
        Throwable a3 = Result.a(b);
        if (a3 != null) {
            em3 em3Var2 = appAnalyticsReporter.s;
            ProductId productId2 = ((plg) bVar.X()).a;
            if (productId2 != null && (name = productId2.name()) != null) {
                em3.b(em3Var2, null, name, ((plg) bVar.X()).b, DashboardEvents$DashboardLoadedResult.ERROR, a3.getMessage(), 1);
            }
        }
        zva0 zva0Var22 = this.$successTrace;
        b bVar52 = this.this$0;
        boolean z32 = this.$atDashboardOpening;
        if (!z2) {
        }
        zva0 zva0Var32 = this.$failTrace;
        b bVar422 = this.this$0;
        a2 = Result.a(b);
        if (a2 != null) {
        }
        this.$commonTrace.a();
        this.this$0.Z(zmg.a);
        return zy11.a;
    }
}
