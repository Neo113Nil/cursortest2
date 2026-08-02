package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoV3Request;", "", "qrcLink", "", "agreementId", "qrcScanId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQrcLink", "()Ljava/lang/String;", "getAgreementId", "getQrcScanId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPaymentInfoV3Request {
    private final String agreementId;
    private final String qrcLink;
    private final String qrcScanId;

    public GetPaymentInfoV3Request(@Json(name = "qrc_link") String str, @Json(name = "agreement_id") String str2, @Json(name = "qrc_scan_id") String str3) {
        this.qrcLink = str;
        this.agreementId = str2;
        this.qrcScanId = str3;
    }

    public static /* synthetic */ GetPaymentInfoV3Request copy$default(GetPaymentInfoV3Request getPaymentInfoV3Request, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPaymentInfoV3Request.qrcLink;
        }
        if ((i & 2) != 0) {
            str2 = getPaymentInfoV3Request.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = getPaymentInfoV3Request.qrcScanId;
        }
        return getPaymentInfoV3Request.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final GetPaymentInfoV3Request copy(@Json(name = "qrc_link") String qrcLink, @Json(name = "agreement_id") String agreementId, @Json(name = "qrc_scan_id") String qrcScanId) {
        return new GetPaymentInfoV3Request(qrcLink, agreementId, qrcScanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentInfoV3Request)) {
            return false;
        }
        GetPaymentInfoV3Request getPaymentInfoV3Request = (GetPaymentInfoV3Request) other;
        return jl40.l(this.qrcLink, getPaymentInfoV3Request.qrcLink) && jl40.l(this.agreementId, getPaymentInfoV3Request.agreementId) && jl40.l(this.qrcScanId, getPaymentInfoV3Request.qrcScanId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public int hashCode() {
        int hashCode = this.qrcLink.hashCode() * 31;
        String str = this.agreementId;
        return this.qrcScanId.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.qrcLink;
        String str2 = this.agreementId;
        return oyr.t(b64.v("GetPaymentInfoV3Request(qrcLink=", str, ", agreementId=", str2, ", qrcScanId="), this.qrcScanId, Extension.C_BRAKE);
    }
}
