package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxkg0;", "<anonymous>", "(Ltse;)Lxkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$mapScreen$2$buttons$1$1", f = "QueueInfoToModelMapper.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$mapScreen$2$buttons$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ QueueScreen.QueueButton $button;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$mapScreen$2$buttons$1$1(a aVar, QueueScreen.QueueButton queueButton, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$button = queueButton;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueInfoToModelMapper$mapScreen$2$buttons$1$1(this.this$0, this.$button, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$mapScreen$2$buttons$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        QueueScreen.QueueButton queueButton = this.$button;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new QueueInfoToModelMapper$mapButton$2(aVar, queueButton, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
