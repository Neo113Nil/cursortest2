package com.yandex.plus.pay.internal.model;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffersReason;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "DATA_LOADING_ERROR", "PAYMENT_TIMEOUT", "BLACKLISTED", "EXPIRED_CARD", "USER_CANCELLED", "RESTRICTED_CARD", "FAIL_3DS", "NOT_ENOUGH_FUNDS", "INVALID_XRF_TOKEN", "OPERATION_CANCELLED", "AUTHORIZATION_REJECT", "TIMEOUT_NO_SUCCESS", "TRANSACTION_NOT_PERMITTED", "LIMIT_EXCEEDED", "INTERNAL_ERROR", "UNKNOWN_PAYMENT_ERROR", "UNAUTHORIZED_USER", "GOOGLE_PLAY_ERROR", "UNABLE_TO_PAY_BY_SAVED_CARD", "UNEXPECTED", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayCounterOffersReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayCounterOffersReason[] $VALUES;
    private final String code;
    public static final PlusPayCounterOffersReason DATA_LOADING_ERROR = new PlusPayCounterOffersReason("DATA_LOADING_ERROR", 0, "data-loading-error");
    public static final PlusPayCounterOffersReason PAYMENT_TIMEOUT = new PlusPayCounterOffersReason("PAYMENT_TIMEOUT", 1, "payment-timeout");
    public static final PlusPayCounterOffersReason BLACKLISTED = new PlusPayCounterOffersReason("BLACKLISTED", 2, "blacklisted");
    public static final PlusPayCounterOffersReason EXPIRED_CARD = new PlusPayCounterOffersReason("EXPIRED_CARD", 3, "expired-card");
    public static final PlusPayCounterOffersReason USER_CANCELLED = new PlusPayCounterOffersReason("USER_CANCELLED", 4, "user-canceled");
    public static final PlusPayCounterOffersReason RESTRICTED_CARD = new PlusPayCounterOffersReason("RESTRICTED_CARD", 5, "restricted-card");
    public static final PlusPayCounterOffersReason FAIL_3DS = new PlusPayCounterOffersReason("FAIL_3DS", 6, "fail-3ds");
    public static final PlusPayCounterOffersReason NOT_ENOUGH_FUNDS = new PlusPayCounterOffersReason("NOT_ENOUGH_FUNDS", 7, "not-enough-funds");
    public static final PlusPayCounterOffersReason INVALID_XRF_TOKEN = new PlusPayCounterOffersReason("INVALID_XRF_TOKEN", 8, "invalid-xrf-token");
    public static final PlusPayCounterOffersReason OPERATION_CANCELLED = new PlusPayCounterOffersReason("OPERATION_CANCELLED", 9, "operation-cancelled");
    public static final PlusPayCounterOffersReason AUTHORIZATION_REJECT = new PlusPayCounterOffersReason("AUTHORIZATION_REJECT", 10, "authorization-reject");
    public static final PlusPayCounterOffersReason TIMEOUT_NO_SUCCESS = new PlusPayCounterOffersReason("TIMEOUT_NO_SUCCESS", 11, "timeout-no-success");
    public static final PlusPayCounterOffersReason TRANSACTION_NOT_PERMITTED = new PlusPayCounterOffersReason("TRANSACTION_NOT_PERMITTED", 12, "transaction-no-permitted");
    public static final PlusPayCounterOffersReason LIMIT_EXCEEDED = new PlusPayCounterOffersReason("LIMIT_EXCEEDED", 13, "limit-exceeded");
    public static final PlusPayCounterOffersReason INTERNAL_ERROR = new PlusPayCounterOffersReason("INTERNAL_ERROR", 14, "internal-error");
    public static final PlusPayCounterOffersReason UNKNOWN_PAYMENT_ERROR = new PlusPayCounterOffersReason("UNKNOWN_PAYMENT_ERROR", 15, "unknown-payment-error");
    public static final PlusPayCounterOffersReason UNAUTHORIZED_USER = new PlusPayCounterOffersReason("UNAUTHORIZED_USER", 16, "unauthorized-user");
    public static final PlusPayCounterOffersReason GOOGLE_PLAY_ERROR = new PlusPayCounterOffersReason("GOOGLE_PLAY_ERROR", 17, "google-play-error");
    public static final PlusPayCounterOffersReason UNABLE_TO_PAY_BY_SAVED_CARD = new PlusPayCounterOffersReason("UNABLE_TO_PAY_BY_SAVED_CARD", 18, "unable-to-pay-by-saved-card");
    public static final PlusPayCounterOffersReason UNEXPECTED = new PlusPayCounterOffersReason("UNEXPECTED", 19, "?");

    private static final /* synthetic */ PlusPayCounterOffersReason[] $values() {
        return new PlusPayCounterOffersReason[]{DATA_LOADING_ERROR, PAYMENT_TIMEOUT, BLACKLISTED, EXPIRED_CARD, USER_CANCELLED, RESTRICTED_CARD, FAIL_3DS, NOT_ENOUGH_FUNDS, INVALID_XRF_TOKEN, OPERATION_CANCELLED, AUTHORIZATION_REJECT, TIMEOUT_NO_SUCCESS, TRANSACTION_NOT_PERMITTED, LIMIT_EXCEEDED, INTERNAL_ERROR, UNKNOWN_PAYMENT_ERROR, UNAUTHORIZED_USER, GOOGLE_PLAY_ERROR, UNABLE_TO_PAY_BY_SAVED_CARD, UNEXPECTED};
    }

    static {
        PlusPayCounterOffersReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlusPayCounterOffersReason(String str, int i, String str2) {
        this.code = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PlusPayCounterOffersReason valueOf(String str) {
        return (PlusPayCounterOffersReason) Enum.valueOf(PlusPayCounterOffersReason.class, str);
    }

    public static PlusPayCounterOffersReason[] values() {
        return (PlusPayCounterOffersReason[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
