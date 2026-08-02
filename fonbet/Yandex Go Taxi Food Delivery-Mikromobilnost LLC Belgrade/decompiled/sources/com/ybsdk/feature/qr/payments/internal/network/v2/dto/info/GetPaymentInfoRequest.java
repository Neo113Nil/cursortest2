package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoRequest;", "", "qrcLink", "", "qrcScanId", "agreementId", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "autopaymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getQrcLink", "()Ljava/lang/String;", "getQrcScanId", "getAgreementId", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAutopaymentId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPaymentInfoRequest {
    private final String agreementId;
    private final Money amount;
    private final String autopaymentId;
    private final String qrcLink;
    private final String qrcScanId;

    public GetPaymentInfoRequest(@Json(name = "qrc_link") String str, @Json(name = "qrc_scan_id") String str2, @Json(name = "agreement_id") String str3, @Json(name = "amount") Money money, @Json(name = "autopayment_id") String str4) {
        this.qrcLink = str;
        this.qrcScanId = str2;
        this.agreementId = str3;
        this.amount = money;
        this.autopaymentId = str4;
    }

    public static /* synthetic */ GetPaymentInfoRequest copy$default(GetPaymentInfoRequest getPaymentInfoRequest, String str, String str2, String str3, Money money, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPaymentInfoRequest.qrcLink;
        }
        if ((i & 2) != 0) {
            str2 = getPaymentInfoRequest.qrcScanId;
        }
        if ((i & 4) != 0) {
            str3 = getPaymentInfoRequest.agreementId;
        }
        if ((i & 8) != 0) {
            money = getPaymentInfoRequest.amount;
        }
        if ((i & 16) != 0) {
            str4 = getPaymentInfoRequest.autopaymentId;
        }
        String str5 = str4;
        String str6 = str3;
        return getPaymentInfoRequest.copy(str, str2, str6, money, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final GetPaymentInfoRequest copy(@Json(name = "qrc_link") String qrcLink, @Json(name = "qrc_scan_id") String qrcScanId, @Json(name = "agreement_id") String agreementId, @Json(name = "amount") Money amount, @Json(name = "autopayment_id") String autopaymentId) {
        return new GetPaymentInfoRequest(qrcLink, qrcScanId, agreementId, amount, autopaymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentInfoRequest)) {
            return false;
        }
        GetPaymentInfoRequest getPaymentInfoRequest = (GetPaymentInfoRequest) other;
        return jl40.l(this.qrcLink, getPaymentInfoRequest.qrcLink) && jl40.l(this.qrcScanId, getPaymentInfoRequest.qrcScanId) && jl40.l(this.agreementId, getPaymentInfoRequest.agreementId) && jl40.l(this.amount, getPaymentInfoRequest.amount) && jl40.l(this.autopaymentId, getPaymentInfoRequest.autopaymentId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public int hashCode() {
        int b = unr0.b(this.qrcLink.hashCode() * 31, 31, this.qrcScanId);
        String str = this.agreementId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.autopaymentId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.qrcLink;
        String str2 = this.qrcScanId;
        String str3 = this.agreementId;
        Money money = this.amount;
        String str4 = this.autopaymentId;
        StringBuilder v = b64.v("GetPaymentInfoRequest(qrcLink=", str, ", qrcScanId=", str2, ", agreementId=");
        v.append(str3);
        v.append(", amount=");
        v.append(money);
        v.append(", autopaymentId=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
