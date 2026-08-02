package com.ybsdk.screens.registration.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.dto.changephone.ChangePhoneSubmitCodeResponse;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import defpackage.dzh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.ur80;
import defpackage.vr80;
import defpackage.w511;
import defpackage.wls;
import defpackage.xr80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse;", "it", "Lwr80;", "<anonymous>", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse;)Lwr80;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.ChangePhoneRepository$validateOtp$3$1", f = "ChangePhoneRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneRepository$validateOtp$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePhoneRepository$validateOtp$3$1 changePhoneRepository$validateOtp$3$1 = new ChangePhoneRepository$validateOtp$3$1(2, continuation);
        changePhoneRepository$validateOtp$3$1.L$0 = obj;
        return changePhoneRepository$validateOtp$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePhoneRepository$validateOtp$3$1) create((ChangePhoneSubmitCodeResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Text.Resource resource;
        int i;
        Text.Resource h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ChangePhoneSubmitCodeResponse changePhoneSubmitCodeResponse = (ChangePhoneSubmitCodeResponse) this.L$0;
        Integer attemptsLeft = changePhoneSubmitCodeResponse.getAttemptsLeft();
        int intValue = attemptsLeft != null ? attemptsLeft.intValue() : 0;
        ChangePhoneSubmitCodeResponse.SubmitStatus status = changePhoneSubmitCodeResponse.getStatus();
        int[] iArr = xr80.c;
        int i2 = iArr[status.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
                h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
            } else if (intValue == 0) {
                h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_try_another_time_sms);
            }
            resource = h;
            i = iArr[changePhoneSubmitCodeResponse.getStatus().ordinal()];
            if (i != 1) {
                return new vr80(null);
            }
            if (i == 2 || i == 3 || i == 4) {
                return new ur80(resource, resource, null, (changePhoneSubmitCodeResponse.getStatus() != ChangePhoneSubmitCodeResponse.SubmitStatus.CODE_MISMATCH || intValue <= 0) ? OtpValidationResultEntity$Error$Type.DEFAULT : OtpValidationResultEntity$Error$Type.CODE_MISMATCH, intValue == 0);
            }
            w511.b();
            return null;
        }
        resource = null;
        i = iArr[changePhoneSubmitCodeResponse.getStatus().ordinal()];
        if (i != 1) {
        }
    }
}
