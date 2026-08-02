package com.yandex.go.walking.navigation.impl.order;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.k4u;
import defpackage.mvg;
import defpackage.n541;
import defpackage.ny61;
import defpackage.u341;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.order.WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3", f = "WalkNavLocalOrderTrackingInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3 walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3 = new WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3(3, (Continuation) obj3);
        walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Long l = (Long) obj5;
            k4u k4uVar = (k4u) obj4;
            Route route = (Route) obj3;
            n541 n541Var = (n541) obj2;
            u341 u341Var = new u341(n541Var, route, k4uVar, l, (Long) objArr[4], ((Number) objArr[5]).doubleValue());
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(u341Var, this) == coroutineSingletons) {
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
