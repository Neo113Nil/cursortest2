package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/yandex/mapkit/GeoObject;", "onRoute", "nearby"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.repositories.GasStationsRepository$foundGasStationsFlow$1", f = "GasStationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsRepository$foundGasStationsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GasStationsRepository$foundGasStationsFlow$1 gasStationsRepository$foundGasStationsFlow$1 = new GasStationsRepository$foundGasStationsFlow$1(3, (Continuation) obj3);
        gasStationsRepository$foundGasStationsFlow$1.L$0 = (List) obj;
        gasStationsRepository$foundGasStationsFlow$1.L$1 = (List) obj2;
        return gasStationsRepository$foundGasStationsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return kotlin.collections.a.m0(list2, list);
    }
}
