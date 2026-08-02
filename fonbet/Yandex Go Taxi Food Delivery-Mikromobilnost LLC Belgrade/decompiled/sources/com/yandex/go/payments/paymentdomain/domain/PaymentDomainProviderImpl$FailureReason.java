package com.yandex.go.payments.paymentdomain.domain;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/payments/paymentdomain/domain/PaymentDomainProviderImpl$FailureReason", "", "Lcom/yandex/go/payments/paymentdomain/domain/PaymentDomainProviderImpl$FailureReason;", "", ErrorResponseData.JSON_ERROR_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DomainNotConfigured", "Client", "MalformedResponse", "Verification", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PaymentDomainProviderImpl$FailureReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentDomainProviderImpl$FailureReason[] $VALUES;
    public static final PaymentDomainProviderImpl$FailureReason Client;
    public static final PaymentDomainProviderImpl$FailureReason DomainNotConfigured;
    public static final PaymentDomainProviderImpl$FailureReason MalformedResponse;
    public static final PaymentDomainProviderImpl$FailureReason Verification;
    private final String errorCode;

    static {
        PaymentDomainProviderImpl$FailureReason paymentDomainProviderImpl$FailureReason = new PaymentDomainProviderImpl$FailureReason("DomainNotConfigured", 0, "domain_not_configured");
        DomainNotConfigured = paymentDomainProviderImpl$FailureReason;
        PaymentDomainProviderImpl$FailureReason paymentDomainProviderImpl$FailureReason2 = new PaymentDomainProviderImpl$FailureReason("Client", 1, "client_error");
        Client = paymentDomainProviderImpl$FailureReason2;
        PaymentDomainProviderImpl$FailureReason paymentDomainProviderImpl$FailureReason3 = new PaymentDomainProviderImpl$FailureReason("MalformedResponse", 2, "malformed_response");
        MalformedResponse = paymentDomainProviderImpl$FailureReason3;
        PaymentDomainProviderImpl$FailureReason paymentDomainProviderImpl$FailureReason4 = new PaymentDomainProviderImpl$FailureReason("Verification", 3, "verification_error");
        Verification = paymentDomainProviderImpl$FailureReason4;
        PaymentDomainProviderImpl$FailureReason[] paymentDomainProviderImpl$FailureReasonArr = {paymentDomainProviderImpl$FailureReason, paymentDomainProviderImpl$FailureReason2, paymentDomainProviderImpl$FailureReason3, paymentDomainProviderImpl$FailureReason4};
        $VALUES = paymentDomainProviderImpl$FailureReasonArr;
        $ENTRIES = kotlin.enums.a.a(paymentDomainProviderImpl$FailureReasonArr);
    }

    public PaymentDomainProviderImpl$FailureReason(String str, int i, String str2) {
        this.errorCode = str2;
    }

    public static PaymentDomainProviderImpl$FailureReason valueOf(String str) {
        return (PaymentDomainProviderImpl$FailureReason) Enum.valueOf(PaymentDomainProviderImpl$FailureReason.class, str);
    }

    public static PaymentDomainProviderImpl$FailureReason[] values() {
        return (PaymentDomainProviderImpl$FailureReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }
}
