package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bms;
import defpackage.dkg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "", "ordersCount", "Ldkg0;", "queue", "<anonymous>", "(Lcom/yandex/go/navigation/screen/api/Screen;ILdkg0;)Ldkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.interactor.QueueInteractor$queueFlow$1", f = "QueueInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInteractor$queueFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInteractor$queueFlow$1(l lVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        QueueInteractor$queueFlow$1 queueInteractor$queueFlow$1 = new QueueInteractor$queueFlow$1(this.this$0, (Continuation) obj4);
        queueInteractor$queueFlow$1.L$0 = (Screen) obj;
        queueInteractor$queueFlow$1.I$0 = intValue;
        queueInteractor$queueFlow$1.L$1 = (dkg0) obj3;
        return queueInteractor$queueFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Screen screen = (Screen) this.L$0;
        int i = this.I$0;
        dkg0 dkg0Var = (dkg0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.g.getClass();
        if (screen != Screen.ORDERS_LIST || i <= 1) {
            return dkg0Var;
        }
        return null;
    }
}
