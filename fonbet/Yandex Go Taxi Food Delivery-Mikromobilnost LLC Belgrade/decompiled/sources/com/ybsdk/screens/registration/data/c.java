package com.ybsdk.screens.registration.data;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationSendCodeRequest;
import com.ybsdk.network.dto.ApplicationSendCodeResponse;
import com.ybsdk.network.dto.ApplicationSubmitCodeRequest;
import com.ybsdk.network.dto.ApplicationSubmitCodeResponse;
import com.ybsdk.screens.registration.domain.ApplicationFormField;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.a03;
import defpackage.a3h;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.k03;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.tr80;
import defpackage.unr0;
import defpackage.ur80;
import defpackage.vr80;
import defpackage.w511;
import defpackage.xr80;
import defpackage.yqi0;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c {
    public final Api a;
    public final k03 b;
    public final a3h c;
    public final AppAnalyticsReporter d;
    public final com.ybsdk.utils.poller.b e;

    public c(Api api, k03 k03Var, a3h a3hVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.utils.poller.b bVar) {
        this.a = api;
        this.b = k03Var;
        this.c = a3hVar;
        this.d = appAnalyticsReporter;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, RegistrationPhone registrationPhone, ContinuationImpl continuationImpl) {
        RegistrationRepository$requestOtp$1 registrationRepository$requestOtp$1;
        int i;
        Object c;
        Text text;
        OtpResponseDataEntity.Status status;
        OtpResponseDataEntity.Action action;
        OtpResponseDataEntity.Action action2;
        if (continuationImpl instanceof RegistrationRepository$requestOtp$1) {
            registrationRepository$requestOtp$1 = (RegistrationRepository$requestOtp$1) continuationImpl;
            int i2 = registrationRepository$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationRepository$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationRepository$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationRepository$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RegistrationRepository$requestOtp$2 registrationRepository$requestOtp$2 = new RegistrationRepository$requestOtp$2(this, new ApplicationSendCodeRequest(str, registrationPhone.getPhone(), registrationPhone.getPhoneId()), null);
                    registrationRepository$requestOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(registrationRepository$requestOtp$2, registrationRepository$requestOtp$1);
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
                ApplicationSendCodeResponse applicationSendCodeResponse = (ApplicationSendCodeResponse) c;
                if (applicationSendCodeResponse.getAction() == ApplicationSendCodeResponse.Action.SUPPORT) {
                    String hint = applicationSendCodeResponse.getHint();
                    text = hint != null ? g8e.i(Text.Companion, hint) : unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_support_chat_suggestion_title);
                } else {
                    text = null;
                }
                int i3 = tr80.a[applicationSendCodeResponse.getStatus().ordinal()];
                if (i3 == 1) {
                    status = OtpResponseDataEntity.Status.OK;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    status = OtpResponseDataEntity.Status.FAILED;
                }
                OtpResponseDataEntity.Status status2 = status;
                ApplicationSendCodeResponse.Action action3 = applicationSendCodeResponse.getAction();
                int i4 = action3 == null ? -1 : tr80.b[action3.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        action2 = OtpResponseDataEntity.Action.RETRY;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        action2 = OtpResponseDataEntity.Action.SUPPORT;
                    }
                    action = action2;
                } else {
                    action = null;
                }
                int seconds = applicationSendCodeResponse.getSeconds();
                String supportUrl = applicationSendCodeResponse.getSupportUrl();
                OtpResponseDataEntity.CodeFormat codeFormat = OtpResponseDataEntity.CodeFormat.DIGIT_6;
                String hint2 = applicationSendCodeResponse.getHint();
                return new OtpResponseDataEntity(status2, text, hint2 != null ? g8e.i(Text.Companion, hint2) : null, action, seconds, supportUrl, false, null, codeFormat, 64, null);
            }
        }
        registrationRepository$requestOtp$1 = new RegistrationRepository$requestOtp$1(this, continuationImpl);
        Object obj2 = registrationRepository$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationRepository$requestOtp$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    public final Object b(String str, q1e0 q1e0Var, ContinuationImpl continuationImpl) {
        return com.ybsdk.core.utils.poller.a.a(this.e, q1e0Var, new RegistrationRepository$startPolling$2(this, str, null), new RegistrationRepository$startPolling$3(this, str, null)).d(null, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(YBProduct yBProduct, Map map, ContinuationImpl continuationImpl) {
        RegistrationRepository$startRegistration$1 registrationRepository$startRegistration$1;
        int i;
        Object c;
        if (continuationImpl instanceof RegistrationRepository$startRegistration$1) {
            registrationRepository$startRegistration$1 = (RegistrationRepository$startRegistration$1) continuationImpl;
            int i2 = registrationRepository$startRegistration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationRepository$startRegistration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationRepository$startRegistration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationRepository$startRegistration$1.label;
                RegistrationPhone registrationPhone = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    registrationRepository$startRegistration$1.label = 1;
                    c = ((com.ybsdk.common.repositiories.applications.b) this.b).c(yBProduct, map, registrationRepository$startRegistration$1);
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
                a03 a03Var = (a03) c;
                Map map2 = a03Var.d;
                Object obj2 = map2.get(ApplicationFormField.PHONE_ID.getFiledName());
                String obj3 = obj2 != null ? obj2.toString() : null;
                Object obj4 = map2.get(ApplicationFormField.MASKED_PHONE.getFiledName());
                String obj5 = obj4 != null ? obj4.toString() : null;
                Object obj6 = map2.get(ApplicationFormField.PHONE.getFiledName());
                String obj7 = obj6 != null ? obj6.toString() : null;
                String str = a03Var.a;
                if (obj7 != null) {
                    registrationPhone = new RegistrationPhone.UserCustomPhoneEntity(obj7);
                } else if (obj3 != null && obj5 != null) {
                    registrationPhone = new RegistrationPhone.PredefinedPhoneEntity(obj3, obj5);
                }
                return new yqi0(str, registrationPhone, a03Var.c);
            }
        }
        registrationRepository$startRegistration$1 = new RegistrationRepository$startRegistration$1(this, continuationImpl);
        Object obj8 = registrationRepository$startRegistration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationRepository$startRegistration$1.label;
        RegistrationPhone registrationPhone2 = null;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RegistrationRepository$validateOtp$1 registrationRepository$validateOtp$1;
        int i;
        Object c;
        if (continuationImpl instanceof RegistrationRepository$validateOtp$1) {
            registrationRepository$validateOtp$1 = (RegistrationRepository$validateOtp$1) continuationImpl;
            int i2 = registrationRepository$validateOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationRepository$validateOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationRepository$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationRepository$validateOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RegistrationRepository$validateOtp$2 registrationRepository$validateOtp$2 = new RegistrationRepository$validateOtp$2(this, new ApplicationSubmitCodeRequest(str, str2), str3, null);
                    registrationRepository$validateOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(registrationRepository$validateOtp$2, registrationRepository$validateOtp$1);
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
                ApplicationSubmitCodeResponse applicationSubmitCodeResponse = (ApplicationSubmitCodeResponse) c;
                int i3 = xr80.a[applicationSubmitCodeResponse.getStatus().ordinal()];
                if (i3 == 1) {
                    return new vr80(null);
                }
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                String hint = applicationSubmitCodeResponse.getHint();
                Text.Constant i4 = hint != null ? g8e.i(Text.Companion, hint) : null;
                String hint2 = applicationSubmitCodeResponse.getHint();
                return new ur80(i4, hint2 != null ? g8e.i(Text.Companion, hint2) : null, applicationSubmitCodeResponse.getSupportUrl(), OtpValidationResultEntity$Error$Type.CODE_MISMATCH, false);
            }
        }
        registrationRepository$validateOtp$1 = new RegistrationRepository$validateOtp$1(this, continuationImpl);
        Object obj2 = registrationRepository$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationRepository$validateOtp$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
