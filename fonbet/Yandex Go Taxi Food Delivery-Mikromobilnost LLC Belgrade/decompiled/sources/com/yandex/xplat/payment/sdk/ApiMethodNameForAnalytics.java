package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ApiMethodNameForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PAY", "CARD_BIND_WITHOUT_VERIFY", "CARD_BIND", "BIND_SBP_TOKEN", "CARD_ADDITIONAL_VERIFY", "VERIFY_CARD", "SELECT", "SELECT_AND_PAY", "BIND_GOOGLE_PAY", "BIND_GOOGLE_TOKEN", "BIND_APPLE_PAY", "APPLE_PAY", "FINISH_PAYMENT", "FAILED_PAYMENT", "CONTINUE_PAYMENT", "UPDATE_SELECT_BUTTON", "UPDATE_SELECT_OPTIONS", "DISMISS", "APPLY_CVV_AND_PAY", "IPAYMENT", "TRANSPORT_CARDS", "RTP", "DISPATCH_REMOTE_ACTION", "UNKNOWN_METHOD", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiMethodNameForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApiMethodNameForAnalytics[] $VALUES;
    public static final ApiMethodNameForAnalytics APPLE_PAY;
    public static final ApiMethodNameForAnalytics APPLY_CVV_AND_PAY;
    public static final ApiMethodNameForAnalytics BIND_APPLE_PAY;
    public static final ApiMethodNameForAnalytics BIND_GOOGLE_PAY;
    public static final ApiMethodNameForAnalytics BIND_GOOGLE_TOKEN;
    public static final ApiMethodNameForAnalytics BIND_SBP_TOKEN;
    public static final ApiMethodNameForAnalytics CARD_ADDITIONAL_VERIFY;
    public static final ApiMethodNameForAnalytics CARD_BIND;
    public static final ApiMethodNameForAnalytics CARD_BIND_WITHOUT_VERIFY;
    public static final ApiMethodNameForAnalytics CONTINUE_PAYMENT;
    public static final ApiMethodNameForAnalytics DISMISS;
    public static final ApiMethodNameForAnalytics DISPATCH_REMOTE_ACTION;
    public static final ApiMethodNameForAnalytics FAILED_PAYMENT;
    public static final ApiMethodNameForAnalytics FINISH_PAYMENT;
    public static final ApiMethodNameForAnalytics IPAYMENT;
    public static final ApiMethodNameForAnalytics PAY;
    public static final ApiMethodNameForAnalytics RTP;
    public static final ApiMethodNameForAnalytics SELECT;
    public static final ApiMethodNameForAnalytics SELECT_AND_PAY;
    public static final ApiMethodNameForAnalytics TRANSPORT_CARDS;
    public static final ApiMethodNameForAnalytics UNKNOWN_METHOD;
    public static final ApiMethodNameForAnalytics UPDATE_SELECT_BUTTON;
    public static final ApiMethodNameForAnalytics UPDATE_SELECT_OPTIONS;
    public static final ApiMethodNameForAnalytics VERIFY_CARD;
    private final String value;

    static {
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = new ApiMethodNameForAnalytics("PAY", 0, "pay");
        PAY = apiMethodNameForAnalytics;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics2 = new ApiMethodNameForAnalytics("CARD_BIND_WITHOUT_VERIFY", 1, "card_bind_without_verify");
        CARD_BIND_WITHOUT_VERIFY = apiMethodNameForAnalytics2;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics3 = new ApiMethodNameForAnalytics("CARD_BIND", 2, "card_bind");
        CARD_BIND = apiMethodNameForAnalytics3;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics4 = new ApiMethodNameForAnalytics("BIND_SBP_TOKEN", 3, "bind_sbp_token");
        BIND_SBP_TOKEN = apiMethodNameForAnalytics4;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics5 = new ApiMethodNameForAnalytics("CARD_ADDITIONAL_VERIFY", 4, "card_additional_verify");
        CARD_ADDITIONAL_VERIFY = apiMethodNameForAnalytics5;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics6 = new ApiMethodNameForAnalytics("VERIFY_CARD", 5, "verify_card");
        VERIFY_CARD = apiMethodNameForAnalytics6;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics7 = new ApiMethodNameForAnalytics("SELECT", 6, "select");
        SELECT = apiMethodNameForAnalytics7;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics8 = new ApiMethodNameForAnalytics("SELECT_AND_PAY", 7, "select_and_pay");
        SELECT_AND_PAY = apiMethodNameForAnalytics8;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics9 = new ApiMethodNameForAnalytics("BIND_GOOGLE_PAY", 8, "bind_google_pay");
        BIND_GOOGLE_PAY = apiMethodNameForAnalytics9;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics10 = new ApiMethodNameForAnalytics("BIND_GOOGLE_TOKEN", 9, "bind_google_token");
        BIND_GOOGLE_TOKEN = apiMethodNameForAnalytics10;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics11 = new ApiMethodNameForAnalytics("BIND_APPLE_PAY", 10, "bind_apple_pay");
        BIND_APPLE_PAY = apiMethodNameForAnalytics11;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics12 = new ApiMethodNameForAnalytics("APPLE_PAY", 11, "apple_pay");
        APPLE_PAY = apiMethodNameForAnalytics12;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics13 = new ApiMethodNameForAnalytics("FINISH_PAYMENT", 12, "finish_payment");
        FINISH_PAYMENT = apiMethodNameForAnalytics13;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics14 = new ApiMethodNameForAnalytics("FAILED_PAYMENT", 13, "failed_payment");
        FAILED_PAYMENT = apiMethodNameForAnalytics14;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics15 = new ApiMethodNameForAnalytics("CONTINUE_PAYMENT", 14, "continue_payment");
        CONTINUE_PAYMENT = apiMethodNameForAnalytics15;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics16 = new ApiMethodNameForAnalytics("UPDATE_SELECT_BUTTON", 15, "update_select_button");
        UPDATE_SELECT_BUTTON = apiMethodNameForAnalytics16;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics17 = new ApiMethodNameForAnalytics("UPDATE_SELECT_OPTIONS", 16, "update_select_options");
        UPDATE_SELECT_OPTIONS = apiMethodNameForAnalytics17;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics18 = new ApiMethodNameForAnalytics("DISMISS", 17, "dismiss");
        DISMISS = apiMethodNameForAnalytics18;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics19 = new ApiMethodNameForAnalytics("APPLY_CVV_AND_PAY", 18, "apply_cvv_and_pay");
        APPLY_CVV_AND_PAY = apiMethodNameForAnalytics19;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics20 = new ApiMethodNameForAnalytics("IPAYMENT", 19, "iPayment");
        IPAYMENT = apiMethodNameForAnalytics20;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics21 = new ApiMethodNameForAnalytics("TRANSPORT_CARDS", 20, "transport_cards");
        TRANSPORT_CARDS = apiMethodNameForAnalytics21;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics22 = new ApiMethodNameForAnalytics("RTP", 21, "rtp");
        RTP = apiMethodNameForAnalytics22;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics23 = new ApiMethodNameForAnalytics("DISPATCH_REMOTE_ACTION", 22, "dispatch_remote_action");
        DISPATCH_REMOTE_ACTION = apiMethodNameForAnalytics23;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics24 = new ApiMethodNameForAnalytics("UNKNOWN_METHOD", 23, "unknown_method");
        UNKNOWN_METHOD = apiMethodNameForAnalytics24;
        ApiMethodNameForAnalytics[] apiMethodNameForAnalyticsArr = {apiMethodNameForAnalytics, apiMethodNameForAnalytics2, apiMethodNameForAnalytics3, apiMethodNameForAnalytics4, apiMethodNameForAnalytics5, apiMethodNameForAnalytics6, apiMethodNameForAnalytics7, apiMethodNameForAnalytics8, apiMethodNameForAnalytics9, apiMethodNameForAnalytics10, apiMethodNameForAnalytics11, apiMethodNameForAnalytics12, apiMethodNameForAnalytics13, apiMethodNameForAnalytics14, apiMethodNameForAnalytics15, apiMethodNameForAnalytics16, apiMethodNameForAnalytics17, apiMethodNameForAnalytics18, apiMethodNameForAnalytics19, apiMethodNameForAnalytics20, apiMethodNameForAnalytics21, apiMethodNameForAnalytics22, apiMethodNameForAnalytics23, apiMethodNameForAnalytics24};
        $VALUES = apiMethodNameForAnalyticsArr;
        $ENTRIES = a.a(apiMethodNameForAnalyticsArr);
    }

    public ApiMethodNameForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static ApiMethodNameForAnalytics valueOf(String str) {
        return (ApiMethodNameForAnalytics) Enum.valueOf(ApiMethodNameForAnalytics.class, str);
    }

    public static ApiMethodNameForAnalytics[] values() {
        return (ApiMethodNameForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
