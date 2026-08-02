package com.yandex.go.taxi.order.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y570;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.overlay.OrderBubblesPresenter$onResume$1", f = "OrderBubblesPresenter.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesPresenter$onResume$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesPresenter$onResume$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderBubblesPresenter$onResume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderBubblesPresenter$onResume$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        g gVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar3 = this.this$0;
                try {
                    ru.yandex.taxi.translations.interactor.a aVar = gVar3.C;
                    this.L$0 = gVar3;
                    this.L$1 = gVar3;
                    this.label = 1;
                    Object b = aVar.b("order_chain", this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gVar = gVar3;
                    obj = b;
                    gVar2 = gVar;
                } catch (Throwable th) {
                    th = th;
                    gVar = gVar3;
                    gVar.H.b("onResume", th, new y570(27));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = (g) this.L$1;
                gVar2 = (g) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    gVar.H.b("onResume", th, new y570(27));
                    return zy11.a;
                }
            }
            gVar2.N = kotlin.collections.b.t((Map) obj);
            gVar2.Ng();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
