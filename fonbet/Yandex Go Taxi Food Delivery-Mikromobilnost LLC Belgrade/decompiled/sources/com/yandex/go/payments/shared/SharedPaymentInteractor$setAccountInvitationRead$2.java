package com.yandex.go.payments.shared;

import defpackage.cne0;
import defpackage.fga0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentInteractor$setAccountInvitationRead$2", f = "SharedPaymentInteractor.kt", l = {192}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentInteractor$setAccountInvitationRead$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $sharedAccountId;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentInteractor$setAccountInvitationRead$2(v vVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$sharedAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentInteractor$setAccountInvitationRead$2(this.this$0, this.$sharedAccountId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentInteractor$setAccountInvitationRead$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fga0 fga0Var = this.this$0.b;
            String str = this.$sharedAccountId;
            cne0 cne0Var = fga0Var.a;
            String str2 = fga0Var.x;
            Set M0 = kotlin.collections.a.M0(cne0Var.n(str2));
            M0.add(str);
            fga0Var.a.t(str2, M0);
            v vVar = this.this$0;
            String str3 = this.$sharedAccountId;
            this.label = 1;
            if (vVar.q(str3, this) == coroutineSingletons) {
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
