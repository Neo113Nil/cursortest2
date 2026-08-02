package com.yandex.go.taxi.tariffs.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lza31;", "verticalDescriptions", "", "<anonymous>", "(Ljava/util/List;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.AwaitTariffsInteractorImpl$awaitTariffs$2", f = "AwaitTariffsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AwaitTariffsInteractorImpl$awaitTariffs$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public AwaitTariffsInteractorImpl$awaitTariffs$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AwaitTariffsInteractorImpl$awaitTariffs$2 awaitTariffsInteractorImpl$awaitTariffs$2 = new AwaitTariffsInteractorImpl$awaitTariffs$2(2, continuation);
        awaitTariffsInteractorImpl$awaitTariffs$2.L$0 = obj;
        return awaitTariffsInteractorImpl$awaitTariffs$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AwaitTariffsInteractorImpl$awaitTariffs$2) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!list.isEmpty());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
