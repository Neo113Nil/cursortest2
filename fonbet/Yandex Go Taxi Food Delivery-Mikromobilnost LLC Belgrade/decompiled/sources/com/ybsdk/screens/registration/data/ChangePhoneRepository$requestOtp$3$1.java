package com.ybsdk.screens.registration.data;

import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeResponse;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tr80;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "it", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.data.ChangePhoneRepository$requestOtp$3$1", f = "ChangePhoneRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneRepository$requestOtp$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePhoneRepository$requestOtp$3$1 changePhoneRepository$requestOtp$3$1 = new ChangePhoneRepository$requestOtp$3$1(2, continuation);
        changePhoneRepository$requestOtp$3$1.L$0 = obj;
        return changePhoneRepository$requestOtp$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePhoneRepository$requestOtp$3$1) create((ChangePhoneSendCodeResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OtpResponseDataEntity.Status status;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ChangePhoneSendCodeResponse changePhoneSendCodeResponse = (ChangePhoneSendCodeResponse) this.L$0;
        int i = tr80.d[changePhoneSendCodeResponse.getStatus().ordinal()];
        if (i == 1) {
            status = OtpResponseDataEntity.Status.OK;
        } else {
            if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
            status = OtpResponseDataEntity.Status.FAILED;
        }
        OtpResponseDataEntity.Status status2 = status;
        Integer seconds = changePhoneSendCodeResponse.getSeconds();
        return new OtpResponseDataEntity(status2, null, null, null, seconds != null ? seconds.intValue() : 0, null, false, changePhoneSendCodeResponse.getMaskedPhone(), OtpResponseDataEntity.CodeFormat.DIGIT_4, 64, null);
    }
}
