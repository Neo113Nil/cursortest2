package com.ybsdk.screens.registration.data.auth;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.data.auth.MkkCashoutSendCodeResponse;
import com.ybsdk.screens.registration.data.auth.MkkCashoutVerifyCodeResponse;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.ln3;
import defpackage.ny61;
import defpackage.tr80;
import defpackage.unr0;
import defpackage.ur80;
import defpackage.vr80;
import defpackage.w511;
import defpackage.xr80;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements ln3 {
    public final MkkCashout2faApi a;

    public b(MkkCashout2faApi mkkCashout2faApi) {
        this.a = mkkCashout2faApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        MkkCashoutAuthorizationRepository$requestOtp$1 mkkCashoutAuthorizationRepository$requestOtp$1;
        int i;
        Object c;
        Text.Resource h;
        Text.Resource resource;
        int i2;
        OtpResponseDataEntity.CodeFormat codeFormat;
        int i3;
        OtpResponseDataEntity.Status status;
        if (continuationImpl instanceof MkkCashoutAuthorizationRepository$requestOtp$1) {
            mkkCashoutAuthorizationRepository$requestOtp$1 = (MkkCashoutAuthorizationRepository$requestOtp$1) continuationImpl;
            int i4 = mkkCashoutAuthorizationRepository$requestOtp$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mkkCashoutAuthorizationRepository$requestOtp$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mkkCashoutAuthorizationRepository$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mkkCashoutAuthorizationRepository$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MkkCashoutAuthorizationRepository$requestOtp$2 mkkCashoutAuthorizationRepository$requestOtp$2 = new MkkCashoutAuthorizationRepository$requestOtp$2(this, str3, new MkkCashoutSendCodeRequest(str), null);
                    mkkCashoutAuthorizationRepository$requestOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(mkkCashoutAuthorizationRepository$requestOtp$2, mkkCashoutAuthorizationRepository$requestOtp$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                MkkCashoutSendCodeResponse mkkCashoutSendCodeResponse = (MkkCashoutSendCodeResponse) c;
                MkkCashoutSendCodeResponse.SendFailData failData = mkkCashoutSendCodeResponse.getFailData();
                String resultCode = failData != null ? failData.getResultCode() : null;
                if (jl40.l(resultCode, "NO_ATTEMPTS_LEFT")) {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_request_sms_no_attempts_left);
                } else {
                    if (resultCode == null) {
                        resource = null;
                        MkkCashoutSendCodeResponse.CodeFormat codeFormat2 = mkkCashoutSendCodeResponse.getCodeFormat();
                        i2 = codeFormat2 != null ? -1 : tr80.e[codeFormat2.ordinal()];
                        if (i2 != -1) {
                            codeFormat = OtpResponseDataEntity.CodeFormat.DIGIT_6;
                        } else if (i2 == 1) {
                            codeFormat = OtpResponseDataEntity.CodeFormat.DIGIT_4;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            codeFormat = OtpResponseDataEntity.CodeFormat.DIGIT_6;
                        }
                        OtpResponseDataEntity.CodeFormat codeFormat3 = codeFormat;
                        i3 = tr80.f[mkkCashoutSendCodeResponse.getStatus().ordinal()];
                        if (i3 != 1) {
                            status = OtpResponseDataEntity.Status.OK;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            status = OtpResponseDataEntity.Status.FAILED;
                        }
                        OtpResponseDataEntity.Status status2 = status;
                        OtpResponseDataEntity.Action action = resource != null ? OtpResponseDataEntity.Action.RETRY : OtpResponseDataEntity.Action.SUPPORT;
                        int retryInterval = mkkCashoutSendCodeResponse.getRetryInterval();
                        MkkCashoutSendCodeResponse.SendFailData failData2 = mkkCashoutSendCodeResponse.getFailData();
                        String supportUrl = failData2 == null ? failData2.getSupportUrl() : null;
                        MkkCashoutSendCodeResponse.SendFailData failData3 = mkkCashoutSendCodeResponse.getFailData();
                        return new OtpResponseDataEntity(status2, resource, resource, action, retryInterval, supportUrl, jl40.l(failData3 != null ? failData3.getResultCode() : null, "NO_ATTEMPTS_LEFT"), mkkCashoutSendCodeResponse.getPhone(), codeFormat3);
                    }
                    h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
                }
                resource = h;
                MkkCashoutSendCodeResponse.CodeFormat codeFormat22 = mkkCashoutSendCodeResponse.getCodeFormat();
                if (codeFormat22 != null) {
                }
                if (i2 != -1) {
                }
                OtpResponseDataEntity.CodeFormat codeFormat32 = codeFormat;
                i3 = tr80.f[mkkCashoutSendCodeResponse.getStatus().ordinal()];
                if (i3 != 1) {
                }
                OtpResponseDataEntity.Status status22 = status;
                OtpResponseDataEntity.Action action2 = resource != null ? OtpResponseDataEntity.Action.RETRY : OtpResponseDataEntity.Action.SUPPORT;
                int retryInterval2 = mkkCashoutSendCodeResponse.getRetryInterval();
                MkkCashoutSendCodeResponse.SendFailData failData22 = mkkCashoutSendCodeResponse.getFailData();
                if (failData22 == null) {
                }
                MkkCashoutSendCodeResponse.SendFailData failData32 = mkkCashoutSendCodeResponse.getFailData();
                return new OtpResponseDataEntity(status22, resource, resource, action2, retryInterval2, supportUrl, jl40.l(failData32 != null ? failData32.getResultCode() : null, "NO_ATTEMPTS_LEFT"), mkkCashoutSendCodeResponse.getPhone(), codeFormat32);
            }
        }
        mkkCashoutAuthorizationRepository$requestOtp$1 = new MkkCashoutAuthorizationRepository$requestOtp$1(this, continuationImpl);
        Object obj2 = mkkCashoutAuthorizationRepository$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mkkCashoutAuthorizationRepository$requestOtp$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        MkkCashoutAuthorizationRepository$validateOtp$1 mkkCashoutAuthorizationRepository$validateOtp$1;
        int i;
        Object c;
        String str3;
        String verificationToken;
        Text.Resource resource;
        Text.Resource h;
        if (continuationImpl instanceof MkkCashoutAuthorizationRepository$validateOtp$1) {
            mkkCashoutAuthorizationRepository$validateOtp$1 = (MkkCashoutAuthorizationRepository$validateOtp$1) continuationImpl;
            int i2 = mkkCashoutAuthorizationRepository$validateOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mkkCashoutAuthorizationRepository$validateOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mkkCashoutAuthorizationRepository$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mkkCashoutAuthorizationRepository$validateOtp$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MkkCashoutAuthorizationRepository$validateOtp$2 mkkCashoutAuthorizationRepository$validateOtp$2 = new MkkCashoutAuthorizationRepository$validateOtp$2(this, new MkkCashoutVerifyCodeRequest(str, str2), null);
                    mkkCashoutAuthorizationRepository$validateOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(mkkCashoutAuthorizationRepository$validateOtp$2, mkkCashoutAuthorizationRepository$validateOtp$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                MkkCashoutVerifyCodeResponse mkkCashoutVerifyCodeResponse = (MkkCashoutVerifyCodeResponse) c;
                int i3 = xr80.d[mkkCashoutVerifyCodeResponse.getVerificationResult().ordinal()];
                if (i3 == 1) {
                    MkkCashoutVerifyCodeResponse.OkData okData = mkkCashoutVerifyCodeResponse.getOkData();
                    if (okData != null && (verificationToken = okData.getVerificationToken()) != null) {
                        str3 = evu0.J(verificationToken) ? null : verificationToken;
                    }
                    str3 = "MKK_NO_TOKEN_REQUIRED";
                    return new vr80(str3);
                }
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                MkkCashoutVerifyCodeResponse.VerifyFailData failData = mkkCashoutVerifyCodeResponse.getFailData();
                if (failData == null || failData.getAttemptsLeft() != 0) {
                    MkkCashoutVerifyCodeResponse.VerifyFailData failData2 = mkkCashoutVerifyCodeResponse.getFailData();
                    if (!jl40.l(failData2 != null ? failData2.getResultCode() : null, "NO_ATTEMPTS_LEFT")) {
                        z = false;
                    }
                }
                boolean z2 = z;
                if (z2) {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_try_another_time_sms);
                } else {
                    MkkCashoutVerifyCodeResponse.VerifyFailData failData3 = mkkCashoutVerifyCodeResponse.getFailData();
                    String resultCode = failData3 != null ? failData3.getResultCode() : null;
                    if (jl40.l(resultCode, "CODE_MISMATCH") || resultCode == null) {
                        resource = null;
                        MkkCashoutVerifyCodeResponse.VerifyFailData failData4 = mkkCashoutVerifyCodeResponse.getFailData();
                        return new ur80(resource, resource, null, (jl40.l(failData4 != null ? failData4.getResultCode() : null, "CODE_MISMATCH") || mkkCashoutVerifyCodeResponse.getFailData().getAttemptsLeft() <= 0) ? OtpValidationResultEntity$Error$Type.DEFAULT : OtpValidationResultEntity$Error$Type.CODE_MISMATCH, z2);
                    }
                    h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
                }
                resource = h;
                MkkCashoutVerifyCodeResponse.VerifyFailData failData42 = mkkCashoutVerifyCodeResponse.getFailData();
                return new ur80(resource, resource, null, (jl40.l(failData42 != null ? failData42.getResultCode() : null, "CODE_MISMATCH") || mkkCashoutVerifyCodeResponse.getFailData().getAttemptsLeft() <= 0) ? OtpValidationResultEntity$Error$Type.DEFAULT : OtpValidationResultEntity$Error$Type.CODE_MISMATCH, z2);
            }
        }
        mkkCashoutAuthorizationRepository$validateOtp$1 = new MkkCashoutAuthorizationRepository$validateOtp$1(this, continuationImpl);
        Object obj2 = mkkCashoutAuthorizationRepository$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mkkCashoutAuthorizationRepository$validateOtp$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
