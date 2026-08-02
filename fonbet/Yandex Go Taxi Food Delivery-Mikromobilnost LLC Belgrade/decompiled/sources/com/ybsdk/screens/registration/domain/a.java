package com.ybsdk.screens.registration.domain;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.dto.SendAuthorizationCodeResponse;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.tr80;
import defpackage.unr0;
import defpackage.w511;

/* loaded from: classes2.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OtpResponseDataEntity a(SendAuthorizationCodeResponse sendAuthorizationCodeResponse) {
        Text.Resource h;
        Text.Resource resource;
        String resultCode;
        Text.Resource h2;
        Text.Resource resource2;
        int i;
        OtpResponseDataEntity.Status status;
        SendAuthorizationCodeResponse.FailData failData = sendAuthorizationCodeResponse.getFailData();
        String resultCode2 = failData != null ? failData.getResultCode() : null;
        if (jl40.l(resultCode2, "NO_ATTEMPTS_LEFT")) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_request_sms_no_attempts_left);
        } else {
            if (resultCode2 == null) {
                resource = null;
                SendAuthorizationCodeResponse.FailData failData2 = sendAuthorizationCodeResponse.getFailData();
                resultCode = failData2 == null ? failData2.getResultCode() : null;
                if (!jl40.l(resultCode, "NO_ATTEMPTS_LEFT")) {
                    h2 = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_request_sms_no_attempts_left);
                } else {
                    if (resultCode == null) {
                        resource2 = null;
                        i = tr80.c[sendAuthorizationCodeResponse.getStatus().ordinal()];
                        if (i == 1) {
                            status = OtpResponseDataEntity.Status.OK;
                        } else {
                            if (i != 2) {
                                w511.b();
                                return null;
                            }
                            status = OtpResponseDataEntity.Status.FAILED;
                        }
                        OtpResponseDataEntity.Status status2 = status;
                        OtpResponseDataEntity.Action action = resource2 == null ? OtpResponseDataEntity.Action.RETRY : OtpResponseDataEntity.Action.SUPPORT;
                        int retryInterval = sendAuthorizationCodeResponse.getRetryInterval();
                        SendAuthorizationCodeResponse.FailData failData3 = sendAuthorizationCodeResponse.getFailData();
                        String supportUrl = failData3 != null ? failData3.getSupportUrl() : null;
                        SendAuthorizationCodeResponse.FailData failData4 = sendAuthorizationCodeResponse.getFailData();
                        return new OtpResponseDataEntity(status2, resource2, resource, action, retryInterval, supportUrl, jl40.l(failData4 != null ? failData4.getResultCode() : null, "NO_ATTEMPTS_LEFT"), sendAuthorizationCodeResponse.getPhone(), sendAuthorizationCodeResponse.getCodeFormat());
                    }
                    h2 = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
                }
                resource2 = h2;
                i = tr80.c[sendAuthorizationCodeResponse.getStatus().ordinal()];
                if (i == 1) {
                }
                OtpResponseDataEntity.Status status22 = status;
                OtpResponseDataEntity.Action action2 = resource2 == null ? OtpResponseDataEntity.Action.RETRY : OtpResponseDataEntity.Action.SUPPORT;
                int retryInterval2 = sendAuthorizationCodeResponse.getRetryInterval();
                SendAuthorizationCodeResponse.FailData failData32 = sendAuthorizationCodeResponse.getFailData();
                if (failData32 != null) {
                }
                SendAuthorizationCodeResponse.FailData failData42 = sendAuthorizationCodeResponse.getFailData();
                return new OtpResponseDataEntity(status22, resource2, resource, action2, retryInterval2, supportUrl, jl40.l(failData42 != null ? failData42.getResultCode() : null, "NO_ATTEMPTS_LEFT"), sendAuthorizationCodeResponse.getPhone(), sendAuthorizationCodeResponse.getCodeFormat());
            }
            h = unr0.h(Text.Companion, dzh0.ybsdk_common_default_error);
        }
        resource = h;
        SendAuthorizationCodeResponse.FailData failData22 = sendAuthorizationCodeResponse.getFailData();
        if (failData22 == null) {
        }
        if (!jl40.l(resultCode, "NO_ATTEMPTS_LEFT")) {
        }
        resource2 = h2;
        i = tr80.c[sendAuthorizationCodeResponse.getStatus().ordinal()];
        if (i == 1) {
        }
        OtpResponseDataEntity.Status status222 = status;
        OtpResponseDataEntity.Action action22 = resource2 == null ? OtpResponseDataEntity.Action.RETRY : OtpResponseDataEntity.Action.SUPPORT;
        int retryInterval22 = sendAuthorizationCodeResponse.getRetryInterval();
        SendAuthorizationCodeResponse.FailData failData322 = sendAuthorizationCodeResponse.getFailData();
        if (failData322 != null) {
        }
        SendAuthorizationCodeResponse.FailData failData422 = sendAuthorizationCodeResponse.getFailData();
        return new OtpResponseDataEntity(status222, resource2, resource, action22, retryInterval22, supportUrl, jl40.l(failData422 != null ? failData422.getResultCode() : null, "NO_ATTEMPTS_LEFT"), sendAuthorizationCodeResponse.getPhone(), sendAuthorizationCodeResponse.getCodeFormat());
    }
}
