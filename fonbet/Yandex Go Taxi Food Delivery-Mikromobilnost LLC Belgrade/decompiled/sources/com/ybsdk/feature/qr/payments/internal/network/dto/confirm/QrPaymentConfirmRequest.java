package com.ybsdk.feature.qr.payments.internal.network.dto.confirm;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmRequest;", "", "qrcLink", "", "agreementId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "operationId", "qrcScanId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;)V", "getQrcLink", "()Ljava/lang/String;", "getAgreementId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getOperationId", "getQrcScanId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentConfirmRequest {
    private final String agreementId;
    private final Money money;
    private final String operationId;
    private final String qrcLink;
    private final String qrcScanId;

    public QrPaymentConfirmRequest(@Json(name = "qrc_link") String str, @Json(name = "agreement_id") String str2, @Json(name = "money") Money money, @Json(name = "operation_id") String str3, @Json(name = "qrc_scan_id") String str4) {
        this.qrcLink = str;
        this.agreementId = str2;
        this.money = money;
        this.operationId = str3;
        this.qrcScanId = str4;
    }

    public static /* synthetic */ QrPaymentConfirmRequest copy$default(QrPaymentConfirmRequest qrPaymentConfirmRequest, String str, String str2, Money money, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPaymentConfirmRequest.qrcLink;
        }
        if ((i & 2) != 0) {
            str2 = qrPaymentConfirmRequest.agreementId;
        }
        if ((i & 4) != 0) {
            money = qrPaymentConfirmRequest.money;
        }
        if ((i & 8) != 0) {
            str3 = qrPaymentConfirmRequest.operationId;
        }
        if ((i & 16) != 0) {
            str4 = qrPaymentConfirmRequest.qrcScanId;
        }
        String str5 = str4;
        Money money2 = money;
        return qrPaymentConfirmRequest.copy(str, str2, money2, str3, str5);
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
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final QrPaymentConfirmRequest copy(@Json(name = "qrc_link") String qrcLink, @Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "operation_id") String operationId, @Json(name = "qrc_scan_id") String qrcScanId) {
        return new QrPaymentConfirmRequest(qrcLink, agreementId, money, operationId, qrcScanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentConfirmRequest)) {
            return false;
        }
        QrPaymentConfirmRequest qrPaymentConfirmRequest = (QrPaymentConfirmRequest) other;
        return jl40.l(this.qrcLink, qrPaymentConfirmRequest.qrcLink) && jl40.l(this.agreementId, qrPaymentConfirmRequest.agreementId) && jl40.l(this.money, qrPaymentConfirmRequest.money) && jl40.l(this.operationId, qrPaymentConfirmRequest.operationId) && jl40.l(this.qrcScanId, qrPaymentConfirmRequest.qrcScanId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getMoney() {
        return this.money;
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
        return this.qrcScanId.hashCode() + unr0.b(tse0.c(this.money, unr0.b(this.qrcLink.hashCode() * 31, 31, this.agreementId), 31), 31, this.operationId);
    }

    public String toString() {
        String str = this.qrcLink;
        String str2 = this.agreementId;
        Money money = this.money;
        String str3 = this.operationId;
        String str4 = this.qrcScanId;
        StringBuilder v = b64.v("QrPaymentConfirmRequest(qrcLink=", str, ", agreementId=", str2, ", money=");
        v.append(money);
        v.append(", operationId=");
        v.append(str3);
        v.append(", qrcScanId=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
