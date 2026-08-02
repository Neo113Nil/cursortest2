package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.feedback.data.x;
import defpackage.hwa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ly0a;", "<anonymous>", "(Ltse;)Ly0a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1", f = "ChargersFeedbackScreenInteractor.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x $it;
    final /* synthetic */ hwa $surgeModal;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1(a aVar, x xVar, hwa hwaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = xVar;
        this.$surgeModal = hwaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1(this.this$0, this.$it, this.$surgeModal, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        x xVar = this.$it;
        hwa hwaVar = this.$surgeModal;
        this.label = 1;
        Object a = a.a(aVar, xVar, hwaVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
