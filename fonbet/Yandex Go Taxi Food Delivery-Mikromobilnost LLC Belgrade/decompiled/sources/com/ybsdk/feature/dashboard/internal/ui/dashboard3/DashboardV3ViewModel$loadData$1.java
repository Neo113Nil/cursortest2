package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardLoadedResult;
import defpackage.aso;
import defpackage.ds31;
import defpackage.em3;
import defpackage.ez8;
import defpackage.gao;
import defpackage.mmg;
import defpackage.mvg;
import defpackage.nmg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qmg;
import defpackage.r8j0;
import defpackage.rmg;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tw8;
import defpackage.wls;
import defpackage.zlg;
import defpackage.zva0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ViewModel$loadData$1", f = "DashboardV3ViewModel.kt", l = {226, 227, 242}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3ViewModel$loadData$1 extends SuspendLambda implements wls {
    final /* synthetic */ zva0 $commonTrace;
    final /* synthetic */ zva0 $failureTrace;
    final /* synthetic */ mmg $payload;
    final /* synthetic */ zva0 $successTrace;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3ViewModel$loadData$1(mmg mmgVar, zva0 zva0Var, zva0 zva0Var2, zva0 zva0Var3, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = mmgVar;
        this.$commonTrace = zva0Var;
        this.$successTrace = zva0Var2;
        this.$failureTrace = zva0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3ViewModel$loadData$1(this.$payload, this.$commonTrace, this.$successTrace, this.$failureTrace, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardV3ViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0073, code lost:
    
        if (r3 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0152  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Object c0;
        r0 r0Var;
        Object value;
        Object obj2;
        d dVar2;
        Throwable a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.C.d();
            d dVar3 = this.this$0;
            dVar3.getClass();
            tje.N(ds31.a(dVar3), null, null, new DashboardV3ViewModel$updateSupportMessagesState$1(dVar3, null), 3);
            this.this$0.getClass();
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = (d) this.L$1;
                    obj2 = this.L$0;
                    kotlin.b.b(obj);
                    dVar2.Z(qmg.a);
                    c0 = obj2;
                    zva0 zva0Var = this.$failureTrace;
                    d dVar4 = this.this$0;
                    a = Result.a(c0);
                    if (a != null) {
                        zva0Var.a();
                        if (((nmg) dVar4.X()).d) {
                            dVar4.Z(new rmg(gao.e(null, null, a, 3), true));
                            pz40 Y = dVar4.Y();
                            do {
                                r0Var3 = (r0) Y;
                                value3 = r0Var3.getValue();
                            } while (!r0Var3.k(value3, nmg.a((nmg) value3, null, null, false, false, false, false, false, null, 8183)));
                        } else {
                            pz40 Y2 = dVar4.Y();
                            do {
                                r0Var2 = (r0) Y2;
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, nmg.a((nmg) value2, new s8j0(a), null, false, false, false, false, false, null, 8189)));
                        }
                    }
                    this.$commonTrace.a();
                    return zy11.a;
                }
                dVar = (d) this.L$1;
                if (this.L$0 != null) {
                    ny61.u();
                    return null;
                }
                kotlin.b.b(obj);
                c0 = ((Result) obj).getValue();
                zlg zlgVar = dVar.C;
                boolean z = c0 instanceof Result.Failure;
                if (!z) {
                    em3 em3Var = zlgVar.b.s;
                    mmg mmgVar = zlgVar.a;
                    em3.b(em3Var, zlg.e(mmgVar), zlg.f(mmgVar), null, DashboardEvents$DashboardLoadedResult.OK, null, 20);
                    tw8 tw8Var = ((ez8) c0).b.c;
                    if (tw8Var != null) {
                        dVar.i0(tw8Var.g);
                    }
                }
                Throwable a2 = Result.a(c0);
                if (a2 != null) {
                    em3 em3Var2 = zlgVar.b.s;
                    mmg mmgVar2 = zlgVar.a;
                    em3.b(em3Var2, zlg.e(mmgVar2), zlg.f(mmgVar2), null, DashboardEvents$DashboardLoadedResult.ERROR, a2.getMessage(), 4);
                }
                zva0 zva0Var2 = this.$successTrace;
                d dVar5 = this.this$0;
                if (!z) {
                    ez8 ez8Var = (ez8) c0;
                    r8j0 r8j0Var = new r8j0(ez8Var, null, 14);
                    zva0Var2.a();
                    d.d0(dVar5, r8j0Var);
                    pz40 Y3 = dVar5.Y();
                    do {
                        r0Var = (r0) Y3;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, nmg.a((nmg) value, r8j0Var, null, false, false, ((nmg) dVar5.X()).b instanceof t8j0, false, false, d.b0(dVar5, ez8Var), 5813)));
                    aso asoVar = ez8Var.e;
                    List list = asoVar != null ? (List) asoVar.a(false) : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    aso asoVar2 = ez8Var.g;
                    List list2 = asoVar2 != null ? (List) asoVar2.a(false) : null;
                    this.L$0 = c0;
                    this.L$1 = dVar5;
                    this.label = 3;
                    if (d.e0(dVar5, list, list2, this) != coroutineSingletons) {
                        obj2 = c0;
                        dVar2 = dVar5;
                        dVar2.Z(qmg.a);
                        c0 = obj2;
                    }
                    return coroutineSingletons;
                }
                zva0 zva0Var3 = this.$failureTrace;
                d dVar42 = this.this$0;
                a = Result.a(c0);
                if (a != null) {
                }
                this.$commonTrace.a();
                return zy11.a;
            }
            kotlin.b.b(obj);
            if (obj != null) {
                ny61.u();
                return null;
            }
        }
        dVar = this.this$0;
        mmg mmgVar3 = this.$payload;
        this.L$0 = null;
        this.L$1 = dVar;
        this.label = 2;
        c0 = d.c0(dVar, mmgVar3, this);
    }
}
