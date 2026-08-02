package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yjk0;
import defpackage.zjk0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lzjk0;", "uiStateMap", "<anonymous>", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing.RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1", f = "RideCardCollapsingContainerItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$CollapsingContainer $item;
    final /* synthetic */ Set<String> $payloadIdsSet;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1(Set set, RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer, Continuation continuation) {
        super(2, continuation);
        this.$payloadIdsSet = set;
        this.$item = rideCardItemDto$CollapsingContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1 rideCardCollapsingContainerItemDataSource$getCollapsingContainer$1 = new RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1(this.$payloadIdsSet, this.$item, continuation);
        rideCardCollapsingContainerItemDataSource$getCollapsingContainer$1.L$0 = obj;
        return rideCardCollapsingContainerItemDataSource$getCollapsingContainer$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set<String> set = this.$payloadIdsSet;
        RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer = this.$item;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (set.contains(str) || jl40.l(str, rideCardItemDto$CollapsingContainer.d)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!(((zjk0) entry2.getValue()) instanceof yjk0)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
