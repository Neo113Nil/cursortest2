package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.dzh0;
import defpackage.s8j0;
import defpackage.u8j0;
import defpackage.unr0;

/* loaded from: classes2.dex */
public abstract class b {
    public static final Text.Resource a(a aVar) {
        u8j0 u8j0Var = aVar.d;
        u8j0 u8j0Var2 = aVar.h;
        if ((u8j0Var2 == null || !(u8j0Var2 instanceof s8j0)) && !(u8j0Var instanceof s8j0)) {
            OtpResponseDataEntity otpResponseDataEntity = (OtpResponseDataEntity) u8j0Var.a();
            if ((otpResponseDataEntity != null ? otpResponseDataEntity.getStatus() : null) == OtpResponseDataEntity.Status.FAILED) {
                OtpResponseDataEntity otpResponseDataEntity2 = (OtpResponseDataEntity) u8j0Var.a();
                Text hint = otpResponseDataEntity2 != null ? otpResponseDataEntity2.getHint() : null;
                if ((hint instanceof Text.Resource) && ((Text.Resource) hint).getStringResId() == dzh0.ybsdk_sms_code_confirmation_default_error) {
                    return unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
                }
            }
            return null;
        }
        return unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
    }
}
