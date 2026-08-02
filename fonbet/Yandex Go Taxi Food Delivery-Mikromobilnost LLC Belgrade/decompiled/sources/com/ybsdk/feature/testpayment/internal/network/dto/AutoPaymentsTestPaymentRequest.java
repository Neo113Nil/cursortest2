package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentRequest;", "", "agreementId", "", "memberId", "paymentFlow", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;)V", "getAgreementId", "()Ljava/lang/String;", "getMemberId", "getPaymentFlow", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentsTestPaymentRequest {
    private final String agreementId;
    private final String memberId;
    private final AutoPaymentsTestPaymentFlow paymentFlow;

    public AutoPaymentsTestPaymentRequest(@Json(name = "agreement_id") String str, @Json(name = "member_id") String str2, @Json(name = "flow") AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow) {
        this.agreementId = str;
        this.memberId = str2;
        this.paymentFlow = autoPaymentsTestPaymentFlow;
    }

    public static /* synthetic */ AutoPaymentsTestPaymentRequest copy$default(AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest, String str, String str2, AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoPaymentsTestPaymentRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = autoPaymentsTestPaymentRequest.memberId;
        }
        if ((i & 4) != 0) {
            autoPaymentsTestPaymentFlow = autoPaymentsTestPaymentRequest.paymentFlow;
        }
        return autoPaymentsTestPaymentRequest.copy(str, str2, autoPaymentsTestPaymentFlow);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoPaymentsTestPaymentFlow getPaymentFlow() {
        return this.paymentFlow;
    }

    public final AutoPaymentsTestPaymentRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "member_id") String memberId, @Json(name = "flow") AutoPaymentsTestPaymentFlow paymentFlow) {
        return new AutoPaymentsTestPaymentRequest(agreementId, memberId, paymentFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentsTestPaymentRequest)) {
            return false;
        }
        AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest = (AutoPaymentsTestPaymentRequest) other;
        return jl40.l(this.agreementId, autoPaymentsTestPaymentRequest.agreementId) && jl40.l(this.memberId, autoPaymentsTestPaymentRequest.memberId) && this.paymentFlow == autoPaymentsTestPaymentRequest.paymentFlow;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final AutoPaymentsTestPaymentFlow getPaymentFlow() {
        return this.paymentFlow;
    }

    public int hashCode() {
        String str = this.agreementId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        return this.paymentFlow.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.memberId;
        AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow = this.paymentFlow;
        StringBuilder v = b64.v("AutoPaymentsTestPaymentRequest(agreementId=", str, ", memberId=", str2, ", paymentFlow=");
        v.append(autoPaymentsTestPaymentFlow);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
