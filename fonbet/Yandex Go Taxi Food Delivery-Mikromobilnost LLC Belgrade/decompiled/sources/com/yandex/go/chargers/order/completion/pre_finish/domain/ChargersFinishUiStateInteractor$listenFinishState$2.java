package com.yandex.go.chargers.order.completion.pre_finish.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1a;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lp1a;", ClidProvider.STATE, "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lp1a;)Lp1a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$listenFinishState$2", f = "ChargersFinishUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$listenFinishState$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersFinishUiStateInteractor$listenFinishState$2 chargersFinishUiStateInteractor$listenFinishState$2 = new ChargersFinishUiStateInteractor$listenFinishState$2(3, (Continuation) obj3);
        chargersFinishUiStateInteractor$listenFinishState$2.L$0 = (p1a) obj2;
        return chargersFinishUiStateInteractor$listenFinishState$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p1a p1aVar = (p1a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return p1aVar;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
