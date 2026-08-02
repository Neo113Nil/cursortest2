package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.domain.interactors.ChangePhoneCodeConfirmationInteractor$requestOtp$2", f = "CodeConfirmationInteractor.kt", l = {315}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneCodeConfirmationInteractor$requestOtp$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePhoneCodeConfirmationInteractor$requestOtp$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePhoneCodeConfirmationInteractor$requestOtp$2 changePhoneCodeConfirmationInteractor$requestOtp$2 = new ChangePhoneCodeConfirmationInteractor$requestOtp$2(this.this$0, continuation);
        changePhoneCodeConfirmationInteractor$requestOtp$2.L$0 = obj;
        return changePhoneCodeConfirmationInteractor$requestOtp$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePhoneCodeConfirmationInteractor$requestOtp$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            b bVar = this.this$0;
            com.ybsdk.screens.registration.data.a aVar = bVar.b;
            String applicationId = bVar.a.getApplicationId();
            this.label = 1;
            a = aVar.a(applicationId, str, this);
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
