package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentStatusRequest;", "", "requestId", "", "paymentFlow", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;)V", "getRequestId", "()Ljava/lang/String;", "getPaymentFlow", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentsTestPaymentStatusRequest {
    private final AutoPaymentsTestPaymentFlow paymentFlow;
    private final String requestId;

    public AutoPaymentsTestPaymentStatusRequest(@Json(name = "request_id") String str, @Json(name = "flow") AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow) {
        this.requestId = str;
        this.paymentFlow = autoPaymentsTestPaymentFlow;
    }

    public static /* synthetic */ AutoPaymentsTestPaymentStatusRequest copy$default(AutoPaymentsTestPaymentStatusRequest autoPaymentsTestPaymentStatusRequest, String str, AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoPaymentsTestPaymentStatusRequest.requestId;
        }
        if ((i & 2) != 0) {
            autoPaymentsTestPaymentFlow = autoPaymentsTestPaymentStatusRequest.paymentFlow;
        }
        return autoPaymentsTestPaymentStatusRequest.copy(str, autoPaymentsTestPaymentFlow);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoPaymentsTestPaymentFlow getPaymentFlow() {
        return this.paymentFlow;
    }

    public final AutoPaymentsTestPaymentStatusRequest copy(@Json(name = "request_id") String requestId, @Json(name = "flow") AutoPaymentsTestPaymentFlow paymentFlow) {
        return new AutoPaymentsTestPaymentStatusRequest(requestId, paymentFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentsTestPaymentStatusRequest)) {
            return false;
        }
        AutoPaymentsTestPaymentStatusRequest autoPaymentsTestPaymentStatusRequest = (AutoPaymentsTestPaymentStatusRequest) other;
        return jl40.l(this.requestId, autoPaymentsTestPaymentStatusRequest.requestId) && this.paymentFlow == autoPaymentsTestPaymentStatusRequest.paymentFlow;
    }

    public final AutoPaymentsTestPaymentFlow getPaymentFlow() {
        return this.paymentFlow;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.paymentFlow.hashCode() + (this.requestId.hashCode() * 31);
    }

    public String toString() {
        return "AutoPaymentsTestPaymentStatusRequest(requestId=" + this.requestId + ", paymentFlow=" + this.paymentFlow + Extension.C_BRAKE;
    }
}
