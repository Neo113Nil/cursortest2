package com.yandex.go.messenger_native.interactors;

import defpackage.jb7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wl3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.messenger_native.interactors.MessengerAuthInteractorImpl$onAccountReset$2", f = "MessengerAuthInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class MessengerAuthInteractorImpl$onAccountReset$2 extends SuspendLambda implements wls {
    final /* synthetic */ wl3 $uid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerAuthInteractorImpl$onAccountReset$2(a aVar, wl3 wl3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uid = wl3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerAuthInteractorImpl$onAccountReset$2(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MessengerAuthInteractorImpl$onAccountReset$2 messengerAuthInteractorImpl$onAccountReset$2 = (MessengerAuthInteractorImpl$onAccountReset$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        messengerAuthInteractorImpl$onAccountReset$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        new jb7(this.this$0.b).r(this.$uid);
        return zy11.a;
    }
}
