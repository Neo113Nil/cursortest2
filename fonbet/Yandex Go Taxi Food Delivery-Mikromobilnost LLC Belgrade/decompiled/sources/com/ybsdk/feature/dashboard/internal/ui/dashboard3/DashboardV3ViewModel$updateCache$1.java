package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardLoadedResult;
import defpackage.em3;
import defpackage.gao;
import defpackage.lmg;
import defpackage.mmg;
import defpackage.mvg;
import defpackage.nmg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.rmg;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zlg;
import defpackage.zva0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ViewModel$updateCache$1", f = "DashboardV3ViewModel.kt", l = {289, 287}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3ViewModel$updateCache$1 extends SuspendLambda implements wls {
    final /* synthetic */ zva0 $commonTrace;
    final /* synthetic */ zva0 $failureTrace;
    final /* synthetic */ mmg $payload;
    final /* synthetic */ zva0 $successTrace;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3ViewModel$updateCache$1(mmg mmgVar, zva0 zva0Var, zva0 zva0Var2, zva0 zva0Var3, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = mmgVar;
        this.this$0 = dVar;
        this.$commonTrace = zva0Var;
        this.$successTrace = zva0Var2;
        this.$failureTrace = zva0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3ViewModel$updateCache$1(this.$payload, this.$commonTrace, this.$successTrace, this.$failureTrace, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardV3ViewModel$updateCache$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar;
        String str;
        Object obj2;
        Throwable a;
        pzt0 pzt0Var;
        pz40 Y;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mmg mmgVar = this.$payload;
            if (mmgVar instanceof lmg) {
                aVar = this.this$0.D;
                str = ((lmg) mmgVar).a;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
            d dVar = this.this$0;
            zva0 zva0Var = this.$successTrace;
            if (!(obj2 instanceof Result.Failure)) {
                zlg zlgVar = dVar.C;
                em3 em3Var = zlgVar.b.s;
                mmg mmgVar2 = zlgVar.a;
                em3.b(em3Var, zlg.e(mmgVar2), zlg.f(mmgVar2), null, DashboardEvents$DashboardLoadedResult.OK, null, 20);
                zva0Var.a();
            }
            d dVar2 = this.this$0;
            zva0 zva0Var2 = this.$failureTrace;
            a = Result.a(obj2);
            if (a != null) {
                zlg zlgVar2 = dVar2.C;
                em3 em3Var2 = zlgVar2.b.s;
                mmg mmgVar3 = zlgVar2.a;
                em3.b(em3Var2, zlg.e(mmgVar3), zlg.f(mmgVar3), null, DashboardEvents$DashboardLoadedResult.ERROR, a.getMessage(), 4);
                zva0Var2.a();
                if (((nmg) dVar2.X()).d || (((nmg) dVar2.X()).b instanceof r8j0)) {
                    dVar2.Z(new rmg(gao.e(null, null, a, 3), true));
                } else {
                    pz40 Y2 = dVar2.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, nmg.a((nmg) value2, new s8j0(a), null, false, false, false, false, false, null, 8189)));
                }
            }
            this.$commonTrace.a();
            pzt0Var = this.this$0.O;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, false, false, false, false, null, 4087)));
            return zy11.a;
        }
        str = (String) this.L$1;
        aVar = (com.ybsdk.feature.dashboard.internal.domain.interactor.a) this.L$0;
        kotlin.b.b(obj);
        if (obj != null) {
            ny61.u();
            return null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object d = aVar.d(str, this);
        if (d == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj2 = d;
        d dVar3 = this.this$0;
        zva0 zva0Var3 = this.$successTrace;
        if (!(obj2 instanceof Result.Failure)) {
        }
        d dVar22 = this.this$0;
        zva0 zva0Var22 = this.$failureTrace;
        a = Result.a(obj2);
        if (a != null) {
        }
        this.$commonTrace.a();
        pzt0Var = this.this$0.O;
        if (pzt0Var != null) {
        }
        Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, false, false, false, false, null, 4087)));
        return zy11.a;
    }
}
