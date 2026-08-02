package com.yandex.go.chargers.order.completion.pre_finish.domain;

import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishResponse;", "response", "Lt1a;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishResponse;)Lt1a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$listenPreFinishState$3", f = "ChargersFinishUiStateInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$listenPreFinishState$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishUiStateInteractor$listenPreFinishState$3(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersFinishUiStateInteractor$listenPreFinishState$3 chargersFinishUiStateInteractor$listenPreFinishState$3 = new ChargersFinishUiStateInteractor$listenPreFinishState$3(this.this$0, (Continuation) obj3);
        chargersFinishUiStateInteractor$listenPreFinishState$3.L$0 = (ChargersPreFinishResponse) obj2;
        return chargersFinishUiStateInteractor$listenPreFinishState$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersPreFinishResponse chargersPreFinishResponse = (ChargersPreFinishResponse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.chargers.order.completion.pre_finish.data.a aVar = this.this$0.f;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(chargersPreFinishResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
