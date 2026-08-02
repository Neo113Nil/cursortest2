package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/InitSetDefaultCreditPaymentMethodResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodSetStatus;", "paymentId", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodSetStatus;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodSetStatus;", "getPaymentId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitSetDefaultCreditPaymentMethodResponse {
    private final String paymentId;
    private final CreditPaymentMethodSetStatus status;

    public /* synthetic */ InitSetDefaultCreditPaymentMethodResponse(CreditPaymentMethodSetStatus creditPaymentMethodSetStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(creditPaymentMethodSetStatus, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ InitSetDefaultCreditPaymentMethodResponse copy$default(InitSetDefaultCreditPaymentMethodResponse initSetDefaultCreditPaymentMethodResponse, CreditPaymentMethodSetStatus creditPaymentMethodSetStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            creditPaymentMethodSetStatus = initSetDefaultCreditPaymentMethodResponse.status;
        }
        if ((i & 2) != 0) {
            str = initSetDefaultCreditPaymentMethodResponse.paymentId;
        }
        return initSetDefaultCreditPaymentMethodResponse.copy(creditPaymentMethodSetStatus, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditPaymentMethodSetStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public final InitSetDefaultCreditPaymentMethodResponse copy(@Json(name = "status") CreditPaymentMethodSetStatus status, @Json(name = "payment_id") String paymentId) {
        return new InitSetDefaultCreditPaymentMethodResponse(status, paymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitSetDefaultCreditPaymentMethodResponse)) {
            return false;
        }
        InitSetDefaultCreditPaymentMethodResponse initSetDefaultCreditPaymentMethodResponse = (InitSetDefaultCreditPaymentMethodResponse) other;
        return this.status == initSetDefaultCreditPaymentMethodResponse.status && jl40.l(this.paymentId, initSetDefaultCreditPaymentMethodResponse.paymentId);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final CreditPaymentMethodSetStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.paymentId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitSetDefaultCreditPaymentMethodResponse(status=" + this.status + ", paymentId=" + this.paymentId + Extension.C_BRAKE;
    }

    public InitSetDefaultCreditPaymentMethodResponse(@Json(name = "status") CreditPaymentMethodSetStatus creditPaymentMethodSetStatus, @Json(name = "payment_id") String str) {
        this.status = creditPaymentMethodSetStatus;
        this.paymentId = str;
    }
}
