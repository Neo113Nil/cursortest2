package com.yandex.messaging.internal.auth;

import defpackage.hn3;
import defpackage.in3;
import defpackage.jn3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.auth.AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1", f = "AuthorizationObservable.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jn3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1(Continuation continuation, jn3 jn3Var) {
        super(2, continuation);
        this.this$0 = jn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1 authorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1 = new AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1(continuation, this.this$0);
        authorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return authorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            hn3 hn3Var = new hn3(this.this$0.d(new in3(0, y6f0Var)), 0);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, hn3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
