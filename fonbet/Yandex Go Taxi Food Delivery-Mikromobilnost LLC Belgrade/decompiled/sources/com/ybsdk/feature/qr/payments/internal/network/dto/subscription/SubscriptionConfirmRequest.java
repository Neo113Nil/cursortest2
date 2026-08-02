package com.ybsdk.feature.qr.payments.internal.network.dto.subscription;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/subscription/SubscriptionConfirmRequest;", "", "qrcLink", "", "agreementId", "operationId", "qrcScanId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQrcLink", "()Ljava/lang/String;", "getAgreementId", "getOperationId", "getQrcScanId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionConfirmRequest {
    private final String agreementId;
    private final String operationId;
    private final String qrcLink;
    private final String qrcScanId;

    public SubscriptionConfirmRequest(@Json(name = "qrc_link") String str, @Json(name = "agreement_id") String str2, @Json(name = "operation_id") String str3, @Json(name = "qrc_scan_id") String str4) {
        this.qrcLink = str;
        this.agreementId = str2;
        this.operationId = str3;
        this.qrcScanId = str4;
    }

    public static /* synthetic */ SubscriptionConfirmRequest copy$default(SubscriptionConfirmRequest subscriptionConfirmRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionConfirmRequest.qrcLink;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionConfirmRequest.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionConfirmRequest.operationId;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionConfirmRequest.qrcScanId;
        }
        return subscriptionConfirmRequest.copy(str, str2, str3, str4);
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
    public final String getOperationId() {
        return this.operationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final SubscriptionConfirmRequest copy(@Json(name = "qrc_link") String qrcLink, @Json(name = "agreement_id") String agreementId, @Json(name = "operation_id") String operationId, @Json(name = "qrc_scan_id") String qrcScanId) {
        return new SubscriptionConfirmRequest(qrcLink, agreementId, operationId, qrcScanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionConfirmRequest)) {
            return false;
        }
        SubscriptionConfirmRequest subscriptionConfirmRequest = (SubscriptionConfirmRequest) other;
        return jl40.l(this.qrcLink, subscriptionConfirmRequest.qrcLink) && jl40.l(this.agreementId, subscriptionConfirmRequest.agreementId) && jl40.l(this.operationId, subscriptionConfirmRequest.operationId) && jl40.l(this.qrcScanId, subscriptionConfirmRequest.qrcScanId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public int hashCode() {
        return this.qrcScanId.hashCode() + unr0.b(unr0.b(this.qrcLink.hashCode() * 31, 31, this.agreementId), 31, this.operationId);
    }

    public String toString() {
        String str = this.qrcLink;
        String str2 = this.agreementId;
        return g8e.r(b64.v("SubscriptionConfirmRequest(qrcLink=", str, ", agreementId=", str2, ", operationId="), this.operationId, ", qrcScanId=", this.qrcScanId, Extension.C_BRAKE);
    }
}
