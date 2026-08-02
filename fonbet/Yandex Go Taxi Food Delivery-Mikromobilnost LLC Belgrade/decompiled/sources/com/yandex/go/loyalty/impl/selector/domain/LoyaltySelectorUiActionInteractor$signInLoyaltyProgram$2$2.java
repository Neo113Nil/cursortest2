package com.yandex.go.loyalty.impl.selector.domain;

import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rwz;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.selector.domain.LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2", f = "LoyaltySelectorUiActionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2(d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2 loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2 = (LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rwz rwzVar = (rwz) this.this$0.k.get();
        LocalNotificationItemComponent a = rwzVar.a("sign_in_error", rwzVar.a.getString(kyh0.unknown_error_description));
        a.startExpiresTimer(5000L);
        rwzVar.b.e(a);
        return zy11.a;
    }
}
