package com.yandex.go.taxi.order.details.v2.state.elements.promoblock;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rpf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lru/yandex/taxi/communications/model/CommunicationItem;", "communications", "Lzy11;", "<unused var>", "", "", "", "Lppf0;", "", "<anonymous>", "(Ljava/lang/Iterable;VLjava/util/Set;Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.promoblock.RideCardCommunicationsRepository$communications$1", f = "RideCardCommunicationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCommunicationsRepository$communications$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCommunicationsRepository$communications$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RideCardCommunicationsRepository$communications$1 rideCardCommunicationsRepository$communications$1 = new RideCardCommunicationsRepository$communications$1(this.this$0, (Continuation) obj5);
        rideCardCommunicationsRepository$communications$1.L$0 = (Iterable) obj;
        return rideCardCommunicationsRepository$communications$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterable iterable = (Iterable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((rpf0) this.this$0.a).a(iterable);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
