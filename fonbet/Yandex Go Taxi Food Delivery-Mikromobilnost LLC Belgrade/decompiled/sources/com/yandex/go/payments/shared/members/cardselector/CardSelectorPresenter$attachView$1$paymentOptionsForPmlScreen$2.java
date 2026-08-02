package com.yandex.go.payments.shared.members.cardselector;

import defpackage.ha2;
import defpackage.jw90;
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
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljfa0;", "<anonymous>", "(Ltse;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.cardselector.CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2", f = "CardSelectorPresenter.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2 extends SuspendLambda implements wls {
    final /* synthetic */ jw90 $availabilityChecker;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2(a aVar, jw90 jw90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$availabilityChecker = jw90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2(this.this$0, this.$availabilityChecker, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ha2 c = this.this$0.B.c(this.$availabilityChecker);
        this.label = 1;
        Object y = e.y(c, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
