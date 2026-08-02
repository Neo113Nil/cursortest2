package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JQ\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001e¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDto;", "", "header", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "merchant", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "purpose", "", "agreementsData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "buttons", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;", "isAmountEditable", "", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;Z)V", "getHeader", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "getMerchant", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getPurpose", "()Ljava/lang/String;", "getAgreementsData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getButtons", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInfoDto {
    private final DivDataDto agreementsData;
    private final Money amount;
    private final ScreenButtonsDto buttons;
    private final PageImageHeaderDto header;
    private final boolean isAmountEditable;
    private final MerchantDto merchant;
    private final String purpose;

    public PaymentInfoDto(@Json(name = "header") PageImageHeaderDto pageImageHeaderDto, @Json(name = "merchant") MerchantDto merchantDto, @Json(name = "amount") Money money, @Json(name = "purpose") String str, @Json(name = "agreements_data") DivDataDto divDataDto, @Json(name = "buttons") ScreenButtonsDto screenButtonsDto, @Json(name = "is_amount_editable") boolean z) {
        this.header = pageImageHeaderDto;
        this.merchant = merchantDto;
        this.amount = money;
        this.purpose = str;
        this.agreementsData = divDataDto;
        this.buttons = screenButtonsDto;
        this.isAmountEditable = z;
    }

    public static /* synthetic */ PaymentInfoDto copy$default(PaymentInfoDto paymentInfoDto, PageImageHeaderDto pageImageHeaderDto, MerchantDto merchantDto, Money money, String str, DivDataDto divDataDto, ScreenButtonsDto screenButtonsDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pageImageHeaderDto = paymentInfoDto.header;
        }
        if ((i & 2) != 0) {
            merchantDto = paymentInfoDto.merchant;
        }
        if ((i & 4) != 0) {
            money = paymentInfoDto.amount;
        }
        if ((i & 8) != 0) {
            str = paymentInfoDto.purpose;
        }
        if ((i & 16) != 0) {
            divDataDto = paymentInfoDto.agreementsData;
        }
        if ((i & 32) != 0) {
            screenButtonsDto = paymentInfoDto.buttons;
        }
        if ((i & 64) != 0) {
            z = paymentInfoDto.isAmountEditable;
        }
        ScreenButtonsDto screenButtonsDto2 = screenButtonsDto;
        boolean z2 = z;
        DivDataDto divDataDto2 = divDataDto;
        Money money2 = money;
        return paymentInfoDto.copy(pageImageHeaderDto, merchantDto, money2, str, divDataDto2, screenButtonsDto2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final PageImageHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* renamed from: component5, reason: from getter */
    public final DivDataDto getAgreementsData() {
        return this.agreementsData;
    }

    /* renamed from: component6, reason: from getter */
    public final ScreenButtonsDto getButtons() {
        return this.buttons;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAmountEditable() {
        return this.isAmountEditable;
    }

    public final PaymentInfoDto copy(@Json(name = "header") PageImageHeaderDto header, @Json(name = "merchant") MerchantDto merchant, @Json(name = "amount") Money amount, @Json(name = "purpose") String purpose, @Json(name = "agreements_data") DivDataDto agreementsData, @Json(name = "buttons") ScreenButtonsDto buttons, @Json(name = "is_amount_editable") boolean isAmountEditable) {
        return new PaymentInfoDto(header, merchant, amount, purpose, agreementsData, buttons, isAmountEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoDto)) {
            return false;
        }
        PaymentInfoDto paymentInfoDto = (PaymentInfoDto) other;
        return jl40.l(this.header, paymentInfoDto.header) && jl40.l(this.merchant, paymentInfoDto.merchant) && jl40.l(this.amount, paymentInfoDto.amount) && jl40.l(this.purpose, paymentInfoDto.purpose) && jl40.l(this.agreementsData, paymentInfoDto.agreementsData) && jl40.l(this.buttons, paymentInfoDto.buttons) && this.isAmountEditable == paymentInfoDto.isAmountEditable;
    }

    public final DivDataDto getAgreementsData() {
        return this.agreementsData;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final ScreenButtonsDto getButtons() {
        return this.buttons;
    }

    public final PageImageHeaderDto getHeader() {
        return this.header;
    }

    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        int c = tse0.c(this.amount, (this.merchant.hashCode() + (this.header.hashCode() * 31)) * 31, 31);
        String str = this.purpose;
        return Boolean.hashCode(this.isAmountEditable) + ((this.buttons.hashCode() + ((this.agreementsData.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final boolean isAmountEditable() {
        return this.isAmountEditable;
    }

    public String toString() {
        PageImageHeaderDto pageImageHeaderDto = this.header;
        MerchantDto merchantDto = this.merchant;
        Money money = this.amount;
        String str = this.purpose;
        DivDataDto divDataDto = this.agreementsData;
        ScreenButtonsDto screenButtonsDto = this.buttons;
        boolean z = this.isAmountEditable;
        StringBuilder sb = new StringBuilder("PaymentInfoDto(header=");
        sb.append(pageImageHeaderDto);
        sb.append(", merchant=");
        sb.append(merchantDto);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", purpose=");
        sb.append(str);
        sb.append(", agreementsData=");
        sb.append(divDataDto);
        sb.append(", buttons=");
        sb.append(screenButtonsDto);
        sb.append(", isAmountEditable=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }
}
