package com.yandex.plus.domain.auth.impl;

import defpackage.e1d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z0d0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.domain.auth.impl.AuthSessionImpl$getAuthorizationUrl$result$1", f = "AuthSessionImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSessionImpl$getAuthorizationUrl$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ z0d0 $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSessionImpl$getAuthorizationUrl$result$1(a aVar, z0d0 z0d0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = z0d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSessionImpl$getAuthorizationUrl$result$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSessionImpl$getAuthorizationUrl$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e1d0 e1d0Var = this.this$0.a;
            z0d0 z0d0Var = this.$params;
            this.label = 1;
            h = e1d0Var.h(z0d0Var, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
