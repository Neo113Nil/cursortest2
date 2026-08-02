package com.yandex.go.taxi.order.promo_plaques.data;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lru/yandex/taxi/communications/model/CommunicationItem;", "bottomSectionCommunications", "Lzy11;", "<unused var>", "", "", "<anonymous>", "(Ljava/util/List;VLjava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promo_plaques.data.DetailsCommunicationsRepository$allCommunications$1", f = "DetailsCommunicationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCommunicationsRepository$allCommunications$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DetailsCommunicationsRepository$allCommunications$1 detailsCommunicationsRepository$allCommunications$1 = new DetailsCommunicationsRepository$allCommunications$1(4, (Continuation) obj4);
        detailsCommunicationsRepository$allCommunications$1.L$0 = (List) obj;
        return detailsCommunicationsRepository$allCommunications$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return list;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
