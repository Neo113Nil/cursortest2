package com.ybsdk.feature.qr.payments.internal.network.dto.confirm;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.internal.network.common.ExternalBankPayloadDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.QrSourceDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmVersion3Request;", "", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "checkId", "", "qrcLink", "agreementId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "qrcScanId", "repaymentPlanId", "boostStrategy", "qrSource", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "productType", "externalBankPayload", "Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/HmacDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;)V", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "getCheckId", "()Ljava/lang/String;", "getQrcLink", "getAgreementId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getQrcScanId", "getRepaymentPlanId", "getBoostStrategy", "getQrSource", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "getProductType", "getExternalBankPayload", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentConfirmVersion3Request {
    private final String agreementId;
    private final String boostStrategy;
    private final String checkId;
    private final ExternalBankPayloadDto externalBankPayload;
    private final HmacDto hmac;
    private final Money money;
    private final String productType;
    private final QrSourceDto qrSource;
    private final String qrcLink;
    private final String qrcScanId;
    private final String repaymentPlanId;

    public QrPaymentConfirmVersion3Request(@Json(name = "hmac") HmacDto hmacDto, @Json(name = "check_id") String str, @Json(name = "qrc_link") String str2, @Json(name = "agreement_id") String str3, @Json(name = "money") Money money, @Json(name = "qrc_scan_id") String str4, @Json(name = "repayment_plan_id") String str5, @Json(name = "boost_strategy") String str6, @Json(name = "qr_source") QrSourceDto qrSourceDto, @Json(name = "product_type") String str7, @Json(name = "JSON_FIELD_EXTERNAL_MEMBERS_PAYLOAD") ExternalBankPayloadDto externalBankPayloadDto) {
        this.hmac = hmacDto;
        this.checkId = str;
        this.qrcLink = str2;
        this.agreementId = str3;
        this.money = money;
        this.qrcScanId = str4;
        this.repaymentPlanId = str5;
        this.boostStrategy = str6;
        this.qrSource = qrSourceDto;
        this.productType = str7;
        this.externalBankPayload = externalBankPayloadDto;
    }

    public static /* synthetic */ QrPaymentConfirmVersion3Request copy$default(QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request, HmacDto hmacDto, String str, String str2, String str3, Money money, String str4, String str5, String str6, QrSourceDto qrSourceDto, String str7, ExternalBankPayloadDto externalBankPayloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            hmacDto = qrPaymentConfirmVersion3Request.hmac;
        }
        if ((i & 2) != 0) {
            str = qrPaymentConfirmVersion3Request.checkId;
        }
        if ((i & 4) != 0) {
            str2 = qrPaymentConfirmVersion3Request.qrcLink;
        }
        if ((i & 8) != 0) {
            str3 = qrPaymentConfirmVersion3Request.agreementId;
        }
        if ((i & 16) != 0) {
            money = qrPaymentConfirmVersion3Request.money;
        }
        if ((i & 32) != 0) {
            str4 = qrPaymentConfirmVersion3Request.qrcScanId;
        }
        if ((i & 64) != 0) {
            str5 = qrPaymentConfirmVersion3Request.repaymentPlanId;
        }
        if ((i & 128) != 0) {
            str6 = qrPaymentConfirmVersion3Request.boostStrategy;
        }
        if ((i & 256) != 0) {
            qrSourceDto = qrPaymentConfirmVersion3Request.qrSource;
        }
        if ((i & 512) != 0) {
            str7 = qrPaymentConfirmVersion3Request.productType;
        }
        if ((i & 1024) != 0) {
            externalBankPayloadDto = qrPaymentConfirmVersion3Request.externalBankPayload;
        }
        String str8 = str7;
        ExternalBankPayloadDto externalBankPayloadDto2 = externalBankPayloadDto;
        String str9 = str6;
        QrSourceDto qrSourceDto2 = qrSourceDto;
        String str10 = str4;
        String str11 = str5;
        Money money2 = money;
        String str12 = str2;
        return qrPaymentConfirmVersion3Request.copy(hmacDto, str, str12, str3, money2, str10, str11, str9, qrSourceDto2, str8, externalBankPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    /* renamed from: component10, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component11, reason: from getter */
    public final ExternalBankPayloadDto getExternalBankPayload() {
        return this.externalBankPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component6, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRepaymentPlanId() {
        return this.repaymentPlanId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBoostStrategy() {
        return this.boostStrategy;
    }

    /* renamed from: component9, reason: from getter */
    public final QrSourceDto getQrSource() {
        return this.qrSource;
    }

    public final QrPaymentConfirmVersion3Request copy(@Json(name = "hmac") HmacDto hmac, @Json(name = "check_id") String checkId, @Json(name = "qrc_link") String qrcLink, @Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "qrc_scan_id") String qrcScanId, @Json(name = "repayment_plan_id") String repaymentPlanId, @Json(name = "boost_strategy") String boostStrategy, @Json(name = "qr_source") QrSourceDto qrSource, @Json(name = "product_type") String productType, @Json(name = "JSON_FIELD_EXTERNAL_MEMBERS_PAYLOAD") ExternalBankPayloadDto externalBankPayload) {
        return new QrPaymentConfirmVersion3Request(hmac, checkId, qrcLink, agreementId, money, qrcScanId, repaymentPlanId, boostStrategy, qrSource, productType, externalBankPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentConfirmVersion3Request)) {
            return false;
        }
        QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request = (QrPaymentConfirmVersion3Request) other;
        return jl40.l(this.hmac, qrPaymentConfirmVersion3Request.hmac) && jl40.l(this.checkId, qrPaymentConfirmVersion3Request.checkId) && jl40.l(this.qrcLink, qrPaymentConfirmVersion3Request.qrcLink) && jl40.l(this.agreementId, qrPaymentConfirmVersion3Request.agreementId) && jl40.l(this.money, qrPaymentConfirmVersion3Request.money) && jl40.l(this.qrcScanId, qrPaymentConfirmVersion3Request.qrcScanId) && jl40.l(this.repaymentPlanId, qrPaymentConfirmVersion3Request.repaymentPlanId) && jl40.l(this.boostStrategy, qrPaymentConfirmVersion3Request.boostStrategy) && this.qrSource == qrPaymentConfirmVersion3Request.qrSource && jl40.l(this.productType, qrPaymentConfirmVersion3Request.productType) && jl40.l(this.externalBankPayload, qrPaymentConfirmVersion3Request.externalBankPayload);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getBoostStrategy() {
        return this.boostStrategy;
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final ExternalBankPayloadDto getExternalBankPayload() {
        return this.externalBankPayload;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final QrSourceDto getQrSource() {
        return this.qrSource;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final String getRepaymentPlanId() {
        return this.repaymentPlanId;
    }

    public int hashCode() {
        int b = unr0.b(tse0.c(this.money, unr0.b(unr0.b(unr0.b(this.hmac.hashCode() * 31, 31, this.checkId), 31, this.qrcLink), 31, this.agreementId), 31), 31, this.qrcScanId);
        String str = this.repaymentPlanId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.boostStrategy;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        QrSourceDto qrSourceDto = this.qrSource;
        int hashCode3 = (hashCode2 + (qrSourceDto == null ? 0 : qrSourceDto.hashCode())) * 31;
        String str3 = this.productType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExternalBankPayloadDto externalBankPayloadDto = this.externalBankPayload;
        return hashCode4 + (externalBankPayloadDto != null ? externalBankPayloadDto.hashCode() : 0);
    }

    public String toString() {
        HmacDto hmacDto = this.hmac;
        String str = this.checkId;
        String str2 = this.qrcLink;
        String str3 = this.agreementId;
        Money money = this.money;
        String str4 = this.qrcScanId;
        String str5 = this.repaymentPlanId;
        String str6 = this.boostStrategy;
        QrSourceDto qrSourceDto = this.qrSource;
        String str7 = this.productType;
        ExternalBankPayloadDto externalBankPayloadDto = this.externalBankPayload;
        StringBuilder sb = new StringBuilder("QrPaymentConfirmVersion3Request(hmac=");
        sb.append(hmacDto);
        sb.append(", checkId=");
        sb.append(str);
        sb.append(", qrcLink=");
        g8e.D(sb, str2, ", agreementId=", str3, ", money=");
        sb.append(money);
        sb.append(", qrcScanId=");
        sb.append(str4);
        sb.append(", repaymentPlanId=");
        g8e.D(sb, str5, ", boostStrategy=", str6, ", qrSource=");
        sb.append(qrSourceDto);
        sb.append(", productType=");
        sb.append(str7);
        sb.append(", externalBankPayload=");
        sb.append(externalBankPayloadDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
