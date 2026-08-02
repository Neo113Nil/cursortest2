package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ExternalErrorKind;", "", "unknown", "internal_error", "authorization", "authorization_expired_token", "network", "fail_3ds", "expired_card", "invalid_processing_request", "limit_exceeded", "not_enough_funds", "payment_authorization_reject", "payment_cancelled", "payment_gateway_technical_error", "payment_timeout", "promocode_already_used", "restricted_card", "transaction_not_permitted", "user_cancelled", "card_validation_invalid_argument", "apple_pay", "google_pay", "too_many_cards", "no_email", "passport_account_not_authorized", "failed_challenge_no_tries_left", "failed_challenge_unknown", "need_to_unbind_sbp_token", "sbp_token_duplicate", "undefined_challenge", "warning", "payment_failed_but_new_attempt_allowed", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalErrorKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExternalErrorKind[] $VALUES;
    public static final ExternalErrorKind apple_pay;
    public static final ExternalErrorKind authorization;
    public static final ExternalErrorKind authorization_expired_token;
    public static final ExternalErrorKind card_validation_invalid_argument;
    public static final ExternalErrorKind expired_card;
    public static final ExternalErrorKind fail_3ds;
    public static final ExternalErrorKind failed_challenge_no_tries_left;
    public static final ExternalErrorKind failed_challenge_unknown;
    public static final ExternalErrorKind google_pay;
    public static final ExternalErrorKind internal_error;
    public static final ExternalErrorKind invalid_processing_request;
    public static final ExternalErrorKind limit_exceeded;
    public static final ExternalErrorKind need_to_unbind_sbp_token;
    public static final ExternalErrorKind network;
    public static final ExternalErrorKind no_email;
    public static final ExternalErrorKind not_enough_funds;
    public static final ExternalErrorKind passport_account_not_authorized;
    public static final ExternalErrorKind payment_authorization_reject;
    public static final ExternalErrorKind payment_cancelled;
    public static final ExternalErrorKind payment_failed_but_new_attempt_allowed;
    public static final ExternalErrorKind payment_gateway_technical_error;
    public static final ExternalErrorKind payment_timeout;
    public static final ExternalErrorKind promocode_already_used;
    public static final ExternalErrorKind restricted_card;
    public static final ExternalErrorKind sbp_token_duplicate;
    public static final ExternalErrorKind too_many_cards;
    public static final ExternalErrorKind transaction_not_permitted;
    public static final ExternalErrorKind undefined_challenge;
    public static final ExternalErrorKind unknown;
    public static final ExternalErrorKind user_cancelled;
    public static final ExternalErrorKind warning;

    static {
        ExternalErrorKind externalErrorKind = new ExternalErrorKind("unknown", 0);
        unknown = externalErrorKind;
        ExternalErrorKind externalErrorKind2 = new ExternalErrorKind("internal_error", 1);
        internal_error = externalErrorKind2;
        ExternalErrorKind externalErrorKind3 = new ExternalErrorKind("authorization", 2);
        authorization = externalErrorKind3;
        ExternalErrorKind externalErrorKind4 = new ExternalErrorKind("authorization_expired_token", 3);
        authorization_expired_token = externalErrorKind4;
        ExternalErrorKind externalErrorKind5 = new ExternalErrorKind("network", 4);
        network = externalErrorKind5;
        ExternalErrorKind externalErrorKind6 = new ExternalErrorKind("fail_3ds", 5);
        fail_3ds = externalErrorKind6;
        ExternalErrorKind externalErrorKind7 = new ExternalErrorKind("expired_card", 6);
        expired_card = externalErrorKind7;
        ExternalErrorKind externalErrorKind8 = new ExternalErrorKind("invalid_processing_request", 7);
        invalid_processing_request = externalErrorKind8;
        ExternalErrorKind externalErrorKind9 = new ExternalErrorKind("limit_exceeded", 8);
        limit_exceeded = externalErrorKind9;
        ExternalErrorKind externalErrorKind10 = new ExternalErrorKind("not_enough_funds", 9);
        not_enough_funds = externalErrorKind10;
        ExternalErrorKind externalErrorKind11 = new ExternalErrorKind("payment_authorization_reject", 10);
        payment_authorization_reject = externalErrorKind11;
        ExternalErrorKind externalErrorKind12 = new ExternalErrorKind("payment_cancelled", 11);
        payment_cancelled = externalErrorKind12;
        ExternalErrorKind externalErrorKind13 = new ExternalErrorKind("payment_gateway_technical_error", 12);
        payment_gateway_technical_error = externalErrorKind13;
        ExternalErrorKind externalErrorKind14 = new ExternalErrorKind("payment_timeout", 13);
        payment_timeout = externalErrorKind14;
        ExternalErrorKind externalErrorKind15 = new ExternalErrorKind("promocode_already_used", 14);
        promocode_already_used = externalErrorKind15;
        ExternalErrorKind externalErrorKind16 = new ExternalErrorKind("restricted_card", 15);
        restricted_card = externalErrorKind16;
        ExternalErrorKind externalErrorKind17 = new ExternalErrorKind("transaction_not_permitted", 16);
        transaction_not_permitted = externalErrorKind17;
        ExternalErrorKind externalErrorKind18 = new ExternalErrorKind("user_cancelled", 17);
        user_cancelled = externalErrorKind18;
        ExternalErrorKind externalErrorKind19 = new ExternalErrorKind("card_validation_invalid_argument", 18);
        card_validation_invalid_argument = externalErrorKind19;
        ExternalErrorKind externalErrorKind20 = new ExternalErrorKind("apple_pay", 19);
        apple_pay = externalErrorKind20;
        ExternalErrorKind externalErrorKind21 = new ExternalErrorKind("google_pay", 20);
        google_pay = externalErrorKind21;
        ExternalErrorKind externalErrorKind22 = new ExternalErrorKind("too_many_cards", 21);
        too_many_cards = externalErrorKind22;
        ExternalErrorKind externalErrorKind23 = new ExternalErrorKind("no_email", 22);
        no_email = externalErrorKind23;
        ExternalErrorKind externalErrorKind24 = new ExternalErrorKind("passport_account_not_authorized", 23);
        passport_account_not_authorized = externalErrorKind24;
        ExternalErrorKind externalErrorKind25 = new ExternalErrorKind("failed_challenge_no_tries_left", 24);
        failed_challenge_no_tries_left = externalErrorKind25;
        ExternalErrorKind externalErrorKind26 = new ExternalErrorKind("failed_challenge_unknown", 25);
        failed_challenge_unknown = externalErrorKind26;
        ExternalErrorKind externalErrorKind27 = new ExternalErrorKind("need_to_unbind_sbp_token", 26);
        need_to_unbind_sbp_token = externalErrorKind27;
        ExternalErrorKind externalErrorKind28 = new ExternalErrorKind("sbp_token_duplicate", 27);
        sbp_token_duplicate = externalErrorKind28;
        ExternalErrorKind externalErrorKind29 = new ExternalErrorKind("undefined_challenge", 28);
        undefined_challenge = externalErrorKind29;
        ExternalErrorKind externalErrorKind30 = new ExternalErrorKind("warning", 29);
        warning = externalErrorKind30;
        ExternalErrorKind externalErrorKind31 = new ExternalErrorKind("payment_failed_but_new_attempt_allowed", 30);
        payment_failed_but_new_attempt_allowed = externalErrorKind31;
        ExternalErrorKind[] externalErrorKindArr = {externalErrorKind, externalErrorKind2, externalErrorKind3, externalErrorKind4, externalErrorKind5, externalErrorKind6, externalErrorKind7, externalErrorKind8, externalErrorKind9, externalErrorKind10, externalErrorKind11, externalErrorKind12, externalErrorKind13, externalErrorKind14, externalErrorKind15, externalErrorKind16, externalErrorKind17, externalErrorKind18, externalErrorKind19, externalErrorKind20, externalErrorKind21, externalErrorKind22, externalErrorKind23, externalErrorKind24, externalErrorKind25, externalErrorKind26, externalErrorKind27, externalErrorKind28, externalErrorKind29, externalErrorKind30, externalErrorKind31};
        $VALUES = externalErrorKindArr;
        $ENTRIES = a.a(externalErrorKindArr);
    }

    public static ExternalErrorKind valueOf(String str) {
        return (ExternalErrorKind) Enum.valueOf(ExternalErrorKind.class, str);
    }

    public static ExternalErrorKind[] values() {
        return (ExternalErrorKind[]) $VALUES.clone();
    }
}
