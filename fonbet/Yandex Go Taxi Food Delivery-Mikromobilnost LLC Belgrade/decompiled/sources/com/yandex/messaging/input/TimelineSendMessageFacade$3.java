package com.yandex.messaging.input;

import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/internal/auth/AuthorizationObservable$AuthState;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/internal/auth/AuthorizationObservable$AuthState;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.TimelineSendMessageFacade$3", f = "SendMessageFacade.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineSendMessageFacade$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSendMessageFacade$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineSendMessageFacade$3 timelineSendMessageFacade$3 = new TimelineSendMessageFacade$3(this.this$0, continuation);
        timelineSendMessageFacade$3.L$0 = obj;
        return timelineSendMessageFacade$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineSendMessageFacade$3 timelineSendMessageFacade$3 = (TimelineSendMessageFacade$3) create((AuthorizationObservable$AuthState) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineSendMessageFacade$3.invokeSuspend(zy11Var);
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
        AuthorizationObservable$AuthState authorizationObservable$AuthState = (AuthorizationObservable$AuthState) this.L$0;
        this.this$0.q = authorizationObservable$AuthState == AuthorizationObservable$AuthState.AuthorizedPassport || authorizationObservable$AuthState == AuthorizationObservable$AuthState.LimitedPassport;
        return zy11.a;
    }
}
