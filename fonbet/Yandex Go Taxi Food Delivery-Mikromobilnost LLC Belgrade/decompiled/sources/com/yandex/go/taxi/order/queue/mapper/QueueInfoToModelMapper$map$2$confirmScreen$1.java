package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.evu0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojg0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkkg0;", "<anonymous>", "(Ltse;)Lkkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$map$2$confirmScreen$1", f = "QueueInfoToModelMapper.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$map$2$confirmScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ SearchInfoResponse$QueueSearch.QueueInfo $info;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$map$2$confirmScreen$1(a aVar, SearchInfoResponse$QueueSearch.QueueInfo queueInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$info = queueInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueInfoToModelMapper$map$2$confirmScreen$1(this.this$0, this.$info, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$map$2$confirmScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        QueueScreen queueScreen = this.$info.b;
        aVar.getClass();
        ojg0 ojg0Var = new ojg0(evu0.J(queueScreen.e) ? null : ((m7x0) aVar.b).a(queueScreen.e));
        this.label = 1;
        Object a = a.a(aVar, queueScreen, ojg0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
