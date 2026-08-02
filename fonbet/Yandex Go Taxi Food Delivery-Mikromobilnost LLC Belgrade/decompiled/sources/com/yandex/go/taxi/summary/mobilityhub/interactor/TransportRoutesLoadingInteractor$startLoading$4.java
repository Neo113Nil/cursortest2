package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w811;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/mapkit/geometry/Point;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.TransportRoutesLoadingInteractor$startLoading$4", f = "TransportRoutesLoadingInteractor.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransportRoutesLoadingInteractor$startLoading$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ w811 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRoutesLoadingInteractor$startLoading$4(w811 w811Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w811Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportRoutesLoadingInteractor$startLoading$4 transportRoutesLoadingInteractor$startLoading$4 = new TransportRoutesLoadingInteractor$startLoading$4(this.this$0, continuation);
        transportRoutesLoadingInteractor$startLoading$4.L$0 = obj;
        return transportRoutesLoadingInteractor$startLoading$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRoutesLoadingInteractor$startLoading$4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Point point = (Point) pair.getFirst();
            Point point2 = (Point) pair.getSecond();
            com.yandex.go.taxi.summary.mobilityhub.repository.b bVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (bVar.b(point, point2, this) == coroutineSingletons) {
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
