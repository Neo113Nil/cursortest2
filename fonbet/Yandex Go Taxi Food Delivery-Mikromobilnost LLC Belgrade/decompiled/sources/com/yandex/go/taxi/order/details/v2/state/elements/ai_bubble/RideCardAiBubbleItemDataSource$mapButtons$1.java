package com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble;

import defpackage.jf3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yck0;
import defpackage.zjk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lzjk0;", "uiStateMap", "", "Lyck0;", "<anonymous>", "(Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble.RideCardAiBubbleItemDataSource$mapButtons$1", f = "RideCardAiBubbleItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAiBubbleItemDataSource$mapButtons$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $buttonsIds;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAiBubbleItemDataSource$mapButtons$1(List list, Continuation continuation) {
        super(2, continuation);
        this.$buttonsIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAiBubbleItemDataSource$mapButtons$1 rideCardAiBubbleItemDataSource$mapButtons$1 = new RideCardAiBubbleItemDataSource$mapButtons$1(this.$buttonsIds, continuation);
        rideCardAiBubbleItemDataSource$mapButtons$1.L$0 = obj;
        return rideCardAiBubbleItemDataSource$mapButtons$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAiBubbleItemDataSource$mapButtons$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        List<String> list = this.$buttonsIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (list.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<zjk0> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (zjk0 zjk0Var : values) {
            yck0 yck0Var = zjk0Var instanceof yck0 ? (yck0) zjk0Var : null;
            if (yck0Var != null) {
                arrayList.add(yck0Var);
            }
        }
        return kotlin.collections.a.x0(arrayList, new jf3(this.$buttonsIds, 1));
    }
}
