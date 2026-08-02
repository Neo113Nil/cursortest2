package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import defpackage.b980;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb980;", "titles", "Lzy11;", "<anonymous>", "(Lb980;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.TaxiOnTheWayViewPresenter$observeHeaderSection$2", f = "TaxiOnTheWayViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOnTheWayViewPresenter$observeHeaderSection$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOnTheWayViewPresenter$observeHeaderSection$2(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOnTheWayViewPresenter$observeHeaderSection$2 taxiOnTheWayViewPresenter$observeHeaderSection$2 = new TaxiOnTheWayViewPresenter$observeHeaderSection$2(this.this$0, continuation);
        taxiOnTheWayViewPresenter$observeHeaderSection$2.L$0 = obj;
        return taxiOnTheWayViewPresenter$observeHeaderSection$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOnTheWayViewPresenter$observeHeaderSection$2 taxiOnTheWayViewPresenter$observeHeaderSection$2 = (TaxiOnTheWayViewPresenter$observeHeaderSection$2) create((b980) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOnTheWayViewPresenter$observeHeaderSection$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b980 b980Var = (b980) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (b980Var.e != null && b980Var.i == OrderTitles$Alignment.CENTER) {
            this.this$0.B.b("CopyMenu");
        }
        return zy11.a;
    }
}
