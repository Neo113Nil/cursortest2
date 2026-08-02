package com.yandex.payment.sdk.core.data;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import defpackage.oyr;
import defpackage.q4g;
import defpackage.w511;
import defpackage.z2a0;

/* loaded from: classes2.dex */
public final class a {
    public static PaymentKitError a(String str) {
        PaymentKitError.Kind kind = PaymentKitError.Kind.unknown;
        PaymentKitError.Trigger trigger = PaymentKitError.Trigger.external;
        if (str == null) {
            str = "";
        }
        return new PaymentKitError(kind, trigger, null, null, str, null);
    }

    public static PaymentKitError b(YSError ySError) {
        q4g q4gVar;
        PaymentKitError.Kind kind;
        PaymentKitError.Trigger trigger;
        if (ySError instanceof ExternalConvertibleError) {
            q4gVar = ((ExternalConvertibleError) ySError).a();
        } else {
            q4gVar = new q4g(ExternalErrorKind.unknown, ExternalErrorTrigger.internal_sdk, (Object) null, (Object) null, ySError.getMessage(), 18);
        }
        ExternalErrorKind externalErrorKind = (ExternalErrorKind) q4gVar.b;
        int[] iArr = z2a0.b;
        PaymentKitError.Kind6_6_0 kind6_6_0 = null;
        switch (iArr[externalErrorKind.ordinal()]) {
            case 1:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 2:
                kind = PaymentKitError.Kind.internalError;
                break;
            case 3:
                kind = PaymentKitError.Kind.authorization;
                break;
            case 4:
                kind = PaymentKitError.Kind.network;
                break;
            case 5:
                kind = PaymentKitError.Kind.bindingInvalidArgument;
                break;
            case 6:
                kind = PaymentKitError.Kind.fail3DS;
                break;
            case 7:
                kind = PaymentKitError.Kind.expiredCard;
                break;
            case 8:
                kind = PaymentKitError.Kind.invalidProcessingRequest;
                break;
            case 9:
                kind = PaymentKitError.Kind.limitExceeded;
                break;
            case 10:
                kind = PaymentKitError.Kind.notEnoughFunds;
                break;
            case 11:
                kind = PaymentKitError.Kind.paymentAuthorizationReject;
                break;
            case 12:
                kind = PaymentKitError.Kind.paymentCancelled;
                break;
            case 13:
                kind = PaymentKitError.Kind.paymentGatewayTechnicalError;
                break;
            case 14:
                kind = PaymentKitError.Kind.paymentTimeout;
                break;
            case 15:
                kind = PaymentKitError.Kind.promocodeAlreadyUsed;
                break;
            case 16:
                kind = PaymentKitError.Kind.restrictedCard;
                break;
            case 17:
                kind = PaymentKitError.Kind.transactionNotPermitted;
                break;
            case 18:
                kind = PaymentKitError.Kind.userCancelled;
                break;
            case 19:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 20:
                kind = PaymentKitError.Kind.googlePay;
                break;
            case 21:
                kind = PaymentKitError.Kind.tooManyCards;
                break;
            case 22:
                kind = PaymentKitError.Kind.noEmail;
                break;
            case 23:
                kind = PaymentKitError.Kind.passportAccountNotAuthorized;
                break;
            case 24:
                kind = PaymentKitError.Kind.authorization;
                break;
            case 25:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 26:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 27:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 28:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 29:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 30:
                kind = PaymentKitError.Kind.unknown;
                break;
            case 31:
                kind = PaymentKitError.Kind.unknown;
                break;
            default:
                w511.b();
                return null;
        }
        int i = z2a0.a[((ExternalErrorTrigger) q4gVar.c).ordinal()];
        if (i == 1) {
            trigger = PaymentKitError.Trigger.internal;
        } else if (i == 2) {
            trigger = PaymentKitError.Trigger.mobileBackend;
        } else if (i == 3) {
            trigger = PaymentKitError.Trigger.diehard;
        } else if (i == 4) {
            trigger = PaymentKitError.Trigger.nspk;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            trigger = PaymentKitError.Trigger.passport;
        }
        Integer num = (Integer) q4gVar.w;
        String str = (String) q4gVar.x;
        String str2 = (String) q4gVar.y;
        switch (iArr[externalErrorKind.ordinal()]) {
            case 25:
                kind6_6_0 = PaymentKitError.Kind6_6_0.failedChallengeNoTriesLeft;
                break;
            case 26:
                kind6_6_0 = PaymentKitError.Kind6_6_0.failedChallengeUnknown;
                break;
            case 27:
                kind6_6_0 = PaymentKitError.Kind6_6_0.needToUnbingSbpToken;
                break;
            case 28:
                kind6_6_0 = PaymentKitError.Kind6_6_0.sbpTokenBindingDuplicate;
                break;
            case 30:
                kind6_6_0 = PaymentKitError.Kind6_6_0.warning;
                break;
            case 31:
                kind6_6_0 = PaymentKitError.Kind6_6_0.payment_failed_but_new_attempt_allowed;
                break;
        }
        return new PaymentKitError(kind, trigger, num, str, str2, kind6_6_0);
    }

    public static ExternalConvertibleError c() {
        return new ExternalConvertibleError(ExternalErrorKind.google_pay, ExternalErrorTrigger.internal_sdk, null, "unavailable", "GooglePay is unavailable");
    }

    public static PaymentKitError d(String str) {
        return new PaymentKitError(PaymentKitError.Kind.unknown, PaymentKitError.Trigger.internal, null, null, oyr.p("Internal error, can be used ONLY inside SDK. Reason: \"", str, "\""), null);
    }

    public static PaymentKitError e(String str) {
        return new PaymentKitError(PaymentKitError.Kind.paymentMethodNotFound, PaymentKitError.Trigger.internal, null, null, "Failed to show payment method. Couldn't find preferred method ".concat(str), null);
    }
}
