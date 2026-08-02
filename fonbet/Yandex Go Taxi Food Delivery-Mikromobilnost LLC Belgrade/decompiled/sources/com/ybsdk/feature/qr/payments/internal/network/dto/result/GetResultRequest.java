package com.ybsdk.feature.qr.payments.internal.network.dto.result;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultRequest;", "", "paymentId", "", "qrcLink", "qrcScanId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentId", "()Ljava/lang/String;", "getQrcLink", "getQrcScanId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetResultRequest {
    private final String paymentId;
    private final String qrcLink;
    private final String qrcScanId;

    public GetResultRequest(@Json(name = "payment_id") String str, @Json(name = "qrc_link") String str2, @Json(name = "qrc_scan_id") String str3) {
        this.paymentId = str;
        this.qrcLink = str2;
        this.qrcScanId = str3;
    }

    public static /* synthetic */ GetResultRequest copy$default(GetResultRequest getResultRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getResultRequest.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = getResultRequest.qrcLink;
        }
        if ((i & 4) != 0) {
            str3 = getResultRequest.qrcScanId;
        }
        return getResultRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final GetResultRequest copy(@Json(name = "payment_id") String paymentId, @Json(name = "qrc_link") String qrcLink, @Json(name = "qrc_scan_id") String qrcScanId) {
        return new GetResultRequest(paymentId, qrcLink, qrcScanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetResultRequest)) {
            return false;
        }
        GetResultRequest getResultRequest = (GetResultRequest) other;
        return jl40.l(this.paymentId, getResultRequest.paymentId) && jl40.l(this.qrcLink, getResultRequest.qrcLink) && jl40.l(this.qrcScanId, getResultRequest.qrcScanId);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public int hashCode() {
        return this.qrcScanId.hashCode() + unr0.b(this.paymentId.hashCode() * 31, 31, this.qrcLink);
    }

    public String toString() {
        String str = this.paymentId;
        String str2 = this.qrcLink;
        return oyr.t(b64.v("GetResultRequest(paymentId=", str, ", qrcLink=", str2, ", qrcScanId="), this.qrcScanId, Extension.C_BRAKE);
    }
}
