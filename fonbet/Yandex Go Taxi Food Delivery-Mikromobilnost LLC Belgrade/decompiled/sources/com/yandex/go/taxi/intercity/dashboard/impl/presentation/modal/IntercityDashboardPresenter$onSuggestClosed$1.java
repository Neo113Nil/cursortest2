package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import defpackage.a0z;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qow;
import defpackage.tse;
import defpackage.ugw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$onSuggestClosed$1", f = "IntercityDashboardPresenter.kt", l = {509, 406}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$onSuggestClosed$1 extends SuspendLambda implements wls {
    final /* synthetic */ ugw $dashboardPoints;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$onSuggestClosed$1(g gVar, ugw ugwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$dashboardPoints = ugwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$onSuggestClosed$1(this.this$0, this.$dashboardPoints, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$onSuggestClosed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(6:(1:(1:(5:5|6|7|8|9)(2:15|16))(1:17))(3:32|(1:34)|24)|20|21|22|(3:25|8|9)|24)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        ugw ugwVar;
        g gVar;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((qow) this.this$0.L).d(a0z.e);
                g gVar2 = this.this$0;
                aVar = gVar2.S;
                ugwVar = this.$dashboardPoints;
                this.L$0 = aVar;
                this.L$1 = gVar2;
                this.L$2 = ugwVar;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    gVar = gVar2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th) {
                    th = th;
                    g050Var.d(null);
                    throw th;
                }
            }
            ugw ugwVar2 = (ugw) this.L$2;
            gVar = (g) this.L$1;
            ?? r5 = (g050) this.L$0;
            kotlin.b.b(obj);
            ugwVar = ugwVar2;
            aVar = r5;
            ((qow) gVar.L).c(a0z.e);
            com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = gVar.z;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (fVar.a(ugwVar, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
    }
}
