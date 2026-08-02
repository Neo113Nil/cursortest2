package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import defpackage.ln3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "idempotencyToken", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.domain.interactors.AuthorizationCodeConfirmationInteractor$requestOtp$2", f = "CodeConfirmationInteractor.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizationCodeConfirmationInteractor$requestOtp$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $deviceId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationCodeConfirmationInteractor$requestOtp$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deviceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthorizationCodeConfirmationInteractor$requestOtp$2 authorizationCodeConfirmationInteractor$requestOtp$2 = new AuthorizationCodeConfirmationInteractor$requestOtp$2(this.this$0, this.$deviceId, continuation);
        authorizationCodeConfirmationInteractor$requestOtp$2.L$0 = obj;
        return authorizationCodeConfirmationInteractor$requestOtp$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizationCodeConfirmationInteractor$requestOtp$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            a aVar = this.this$0;
            ln3 ln3Var = aVar.h;
            String trackId = aVar.a.getTrackId();
            String str2 = this.$deviceId;
            this.label = 1;
            a = ln3Var.a(trackId, str2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
