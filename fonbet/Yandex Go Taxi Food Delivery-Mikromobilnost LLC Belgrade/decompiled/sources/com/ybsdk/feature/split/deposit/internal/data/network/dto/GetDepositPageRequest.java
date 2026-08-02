package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageRequest;", "", "scenario", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "previousPaymentIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScenario", "()Ljava/lang/String;", "getOrderId", "getPreviousPaymentIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetDepositPageRequest {
    private final String orderId;
    private final String previousPaymentIndex;
    private final String scenario;

    public GetDepositPageRequest(@Json(name = "scenario") String str, @Json(name = "order_id") String str2, @Json(name = "previous_payment_index") String str3) {
        this.scenario = str;
        this.orderId = str2;
        this.previousPaymentIndex = str3;
    }

    public static /* synthetic */ GetDepositPageRequest copy$default(GetDepositPageRequest getDepositPageRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDepositPageRequest.scenario;
        }
        if ((i & 2) != 0) {
            str2 = getDepositPageRequest.orderId;
        }
        if ((i & 4) != 0) {
            str3 = getDepositPageRequest.previousPaymentIndex;
        }
        return getDepositPageRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    public final GetDepositPageRequest copy(@Json(name = "scenario") String scenario, @Json(name = "order_id") String orderId, @Json(name = "previous_payment_index") String previousPaymentIndex) {
        return new GetDepositPageRequest(scenario, orderId, previousPaymentIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDepositPageRequest)) {
            return false;
        }
        GetDepositPageRequest getDepositPageRequest = (GetDepositPageRequest) other;
        return jl40.l(this.scenario, getDepositPageRequest.scenario) && jl40.l(this.orderId, getDepositPageRequest.orderId) && jl40.l(this.previousPaymentIndex, getDepositPageRequest.previousPaymentIndex);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        String str = this.scenario;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.orderId);
        String str2 = this.previousPaymentIndex;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.scenario;
        String str2 = this.orderId;
        return oyr.t(b64.v("GetDepositPageRequest(scenario=", str, ", orderId=", str2, ", previousPaymentIndex="), this.previousPaymentIndex, Extension.C_BRAKE);
    }
}
