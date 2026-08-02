package com.yandex.go.agreement.router;

import defpackage.bd;
import defpackage.mvg;
import defpackage.nk1;
import defpackage.ny61;
import defpackage.tk1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.router.AgreementRouterImpl$showAgreement$3$1", f = "AgreementRouterImpl.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AgreementRouterImpl$showAgreement$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tk1 $agreementPayload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementRouterImpl$showAgreement$3$1(d dVar, tk1 tk1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$agreementPayload = tk1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AgreementRouterImpl$showAgreement$3$1(this.this$0, this.$agreementPayload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AgreementRouterImpl$showAgreement$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            bd bdVar = ((nk1) this.$agreementPayload).a;
            this.label = 1;
            if (d.Q(dVar, bdVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
