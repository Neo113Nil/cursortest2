package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JO\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", Constants.KEY_MESSAGE, "", "merchant", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "agreements", "", "Lcom/ybsdk/feature/qr/payments/internal/network/common/AgreementDto;", "agreementsSheetTitle", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getMessage", "()Ljava/lang/String;", "getMerchant", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "getAgreements", "()Ljava/util/List;", "getAgreementsSheetTitle", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentInfoDto {
    private final List<AgreementDto> agreements;
    private final String agreementsSheetTitle;
    private final PageHeaderDto header;
    private final MerchantDto merchant;
    private final String message;
    private final Money money;

    public QrPaymentInfoDto(@Json(name = "money") Money money, @Json(name = "message") String str, @Json(name = "merchant") MerchantDto merchantDto, @Json(name = "agreements") List<AgreementDto> list, @Json(name = "agreements_sheet_title") String str2, @Json(name = "header") PageHeaderDto pageHeaderDto) {
        this.money = money;
        this.message = str;
        this.merchant = merchantDto;
        this.agreements = list;
        this.agreementsSheetTitle = str2;
        this.header = pageHeaderDto;
    }

    public static /* synthetic */ QrPaymentInfoDto copy$default(QrPaymentInfoDto qrPaymentInfoDto, Money money, String str, MerchantDto merchantDto, List list, String str2, PageHeaderDto pageHeaderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = qrPaymentInfoDto.money;
        }
        if ((i & 2) != 0) {
            str = qrPaymentInfoDto.message;
        }
        if ((i & 4) != 0) {
            merchantDto = qrPaymentInfoDto.merchant;
        }
        if ((i & 8) != 0) {
            list = qrPaymentInfoDto.agreements;
        }
        if ((i & 16) != 0) {
            str2 = qrPaymentInfoDto.agreementsSheetTitle;
        }
        if ((i & 32) != 0) {
            pageHeaderDto = qrPaymentInfoDto.header;
        }
        String str3 = str2;
        PageHeaderDto pageHeaderDto2 = pageHeaderDto;
        return qrPaymentInfoDto.copy(money, str, merchantDto, list, str3, pageHeaderDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    public final List<AgreementDto> component4() {
        return this.agreements;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final QrPaymentInfoDto copy(@Json(name = "money") Money money, @Json(name = "message") String message, @Json(name = "merchant") MerchantDto merchant, @Json(name = "agreements") List<AgreementDto> agreements, @Json(name = "agreements_sheet_title") String agreementsSheetTitle, @Json(name = "header") PageHeaderDto header) {
        return new QrPaymentInfoDto(money, message, merchant, agreements, agreementsSheetTitle, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentInfoDto)) {
            return false;
        }
        QrPaymentInfoDto qrPaymentInfoDto = (QrPaymentInfoDto) other;
        return jl40.l(this.money, qrPaymentInfoDto.money) && jl40.l(this.message, qrPaymentInfoDto.message) && jl40.l(this.merchant, qrPaymentInfoDto.merchant) && jl40.l(this.agreements, qrPaymentInfoDto.agreements) && jl40.l(this.agreementsSheetTitle, qrPaymentInfoDto.agreementsSheetTitle) && jl40.l(this.header, qrPaymentInfoDto.header);
    }

    public final List<AgreementDto> getAgreements() {
        return this.agreements;
    }

    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        Money money = this.money;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.message;
        return this.header.hashCode() + unr0.b(unr0.c((this.merchant.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.agreements), 31, this.agreementsSheetTitle);
    }

    public String toString() {
        return "QrPaymentInfoDto(money=" + this.money + ", message=" + this.message + ", merchant=" + this.merchant + ", agreements=" + this.agreements + ", agreementsSheetTitle=" + this.agreementsSheetTitle + ", header=" + this.header + Extension.C_BRAKE;
    }
}
