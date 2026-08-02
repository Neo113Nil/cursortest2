package com.ybsdk.screens.registration.data;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationSendCodeRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.data.RegistrationRepository$requestOtp$2", f = "RegistrationRepository.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationRepository$requestOtp$2 extends SuspendLambda implements tls {
    final /* synthetic */ ApplicationSendCodeRequest $request;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationRepository$requestOtp$2(c cVar, ApplicationSendCodeRequest applicationSendCodeRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$request = applicationSendCodeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RegistrationRepository$requestOtp$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RegistrationRepository$requestOtp$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object x;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.a;
            ApplicationSendCodeRequest applicationSendCodeRequest = this.$request;
            this.label = 1;
            x = api.x(applicationSendCodeRequest, this);
            if (x == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            x = ((Result) obj).getValue();
        }
        return new Result(x);
    }
}
