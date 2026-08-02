package com.yandex.delivery.utils.auth.impl.user;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.x2u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lcom/yandex/delivery/utils/auth/impl/user/StartupResponse;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.auth.impl.user.StartupRequestInteractor$request$2", f = "StartupRequestInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class StartupRequestInteractor$request$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $authorization;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ x2u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupRequestInteractor$request$2(x2u0 x2u0Var, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = x2u0Var;
        this.$authorization = str;
        this.$userId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StartupRequestInteractor$request$2(this.this$0, this.$authorization, this.$userId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((StartupRequestInteractor$request$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((StartupApi) this.this$0.i.get()).a(this.$authorization, this.$userId);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
