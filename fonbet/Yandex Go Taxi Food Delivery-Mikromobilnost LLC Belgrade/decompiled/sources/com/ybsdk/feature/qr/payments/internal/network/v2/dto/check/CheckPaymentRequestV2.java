package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.internal.network.common.ExternalBankPayloadDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentRequestV2;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "qrcLink", "qrcScanId", "repaymentPlanId", "boostStrategy", "qrSource", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "productType", "externalBankPayload", "Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getQrcLink", "getQrcScanId", "getRepaymentPlanId", "getBoostStrategy", "getQrSource", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "getProductType", "getExternalBankPayload", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckPaymentRequestV2 {
    private final String agreementId;
    private final String boostStrategy;
    private final ExternalBankPayloadDto externalBankPayload;
    private final Money money;
    private final String productType;
    private final QrSourceDto qrSource;
    private final String qrcLink;
    private final String qrcScanId;
    private final String repaymentPlanId;

    public CheckPaymentRequestV2(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "qrc_link") String str2, @Json(name = "qrc_scan_id") String str3, @Json(name = "repayment_plan_id") String str4, @Json(name = "boost_strategy") String str5, @Json(name = "qr_source") QrSourceDto qrSourceDto, @Json(name = "product_type") String str6, @Json(name = "JSON_FIELD_EXTERNAL_MEMBERS_PAYLOAD") ExternalBankPayloadDto externalBankPayloadDto) {
        this.agreementId = str;
        this.money = money;
        this.qrcLink = str2;
        this.qrcScanId = str3;
        this.repaymentPlanId = str4;
        this.boostStrategy = str5;
        this.qrSource = qrSourceDto;
        this.productType = str6;
        this.externalBankPayload = externalBankPayloadDto;
    }

    public static /* synthetic */ CheckPaymentRequestV2 copy$default(CheckPaymentRequestV2 checkPaymentRequestV2, String str, Money money, String str2, String str3, String str4, String str5, QrSourceDto qrSourceDto, String str6, ExternalBankPayloadDto externalBankPayloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkPaymentRequestV2.agreementId;
        }
        if ((i & 2) != 0) {
            money = checkPaymentRequestV2.money;
        }
        if ((i & 4) != 0) {
            str2 = checkPaymentRequestV2.qrcLink;
        }
        if ((i & 8) != 0) {
            str3 = checkPaymentRequestV2.qrcScanId;
        }
        if ((i & 16) != 0) {
            str4 = checkPaymentRequestV2.repaymentPlanId;
        }
        if ((i & 32) != 0) {
            str5 = checkPaymentRequestV2.boostStrategy;
        }
        if ((i & 64) != 0) {
            qrSourceDto = checkPaymentRequestV2.qrSource;
        }
        if ((i & 128) != 0) {
            str6 = checkPaymentRequestV2.productType;
        }
        if ((i & 256) != 0) {
            externalBankPayloadDto = checkPaymentRequestV2.externalBankPayload;
        }
        String str7 = str6;
        ExternalBankPayloadDto externalBankPayloadDto2 = externalBankPayloadDto;
        String str8 = str5;
        QrSourceDto qrSourceDto2 = qrSourceDto;
        String str9 = str4;
        String str10 = str2;
        return checkPaymentRequestV2.copy(str, money, str10, str3, str9, str8, qrSourceDto2, str7, externalBankPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRepaymentPlanId() {
        return this.repaymentPlanId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBoostStrategy() {
        return this.boostStrategy;
    }

    /* renamed from: component7, reason: from getter */
    public final QrSourceDto getQrSource() {
        return this.qrSource;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component9, reason: from getter */
    public final ExternalBankPayloadDto getExternalBankPayload() {
        return this.externalBankPayload;
    }

    public final CheckPaymentRequestV2 copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "qrc_link") String qrcLink, @Json(name = "qrc_scan_id") String qrcScanId, @Json(name = "repayment_plan_id") String repaymentPlanId, @Json(name = "boost_strategy") String boostStrategy, @Json(name = "qr_source") QrSourceDto qrSource, @Json(name = "product_type") String productType, @Json(name = "JSON_FIELD_EXTERNAL_MEMBERS_PAYLOAD") ExternalBankPayloadDto externalBankPayload) {
        return new CheckPaymentRequestV2(agreementId, money, qrcLink, qrcScanId, repaymentPlanId, boostStrategy, qrSource, productType, externalBankPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentRequestV2)) {
            return false;
        }
        CheckPaymentRequestV2 checkPaymentRequestV2 = (CheckPaymentRequestV2) other;
        return jl40.l(this.agreementId, checkPaymentRequestV2.agreementId) && jl40.l(this.money, checkPaymentRequestV2.money) && jl40.l(this.qrcLink, checkPaymentRequestV2.qrcLink) && jl40.l(this.qrcScanId, checkPaymentRequestV2.qrcScanId) && jl40.l(this.repaymentPlanId, checkPaymentRequestV2.repaymentPlanId) && jl40.l(this.boostStrategy, checkPaymentRequestV2.boostStrategy) && this.qrSource == checkPaymentRequestV2.qrSource && jl40.l(this.productType, checkPaymentRequestV2.productType) && jl40.l(this.externalBankPayload, checkPaymentRequestV2.externalBankPayload);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getBoostStrategy() {
        return this.boostStrategy;
    }

    public final ExternalBankPayloadDto getExternalBankPayload() {
        return this.externalBankPayload;
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
        int b = unr0.b(unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.qrcLink), 31, this.qrcScanId);
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
        String str = this.agreementId;
        Money money = this.money;
        String str2 = this.qrcLink;
        String str3 = this.qrcScanId;
        String str4 = this.repaymentPlanId;
        String str5 = this.boostStrategy;
        QrSourceDto qrSourceDto = this.qrSource;
        String str6 = this.productType;
        ExternalBankPayloadDto externalBankPayloadDto = this.externalBankPayload;
        StringBuilder sb = new StringBuilder("CheckPaymentRequestV2(agreementId=");
        sb.append(str);
        sb.append(", money=");
        sb.append(money);
        sb.append(", qrcLink=");
        g8e.D(sb, str2, ", qrcScanId=", str3, ", repaymentPlanId=");
        g8e.D(sb, str4, ", boostStrategy=", str5, ", qrSource=");
        sb.append(qrSourceDto);
        sb.append(", productType=");
        sb.append(str6);
        sb.append(", externalBankPayload=");
        sb.append(externalBankPayloadDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
