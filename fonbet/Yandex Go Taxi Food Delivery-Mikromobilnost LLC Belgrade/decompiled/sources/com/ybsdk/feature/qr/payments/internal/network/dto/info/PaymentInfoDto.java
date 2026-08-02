package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDto;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", Constants.KEY_MESSAGE, "", "merchant", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "widgets", "", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "header", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;Ljava/util/List;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getMessage", "()Ljava/lang/String;", "getMerchant", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "getWidgets", "()Ljava/util/List;", "getHeader", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInfoDto {
    private final HeaderDto header;
    private final MerchantDto merchant;
    private final String message;
    private final Money money;
    private final List<WidgetDto> widgets;

    public PaymentInfoDto(@Json(name = "money") Money money, @Json(name = "message") String str, @Json(name = "merchant") MerchantDto merchantDto, @Json(name = "limit_widgets") List<WidgetDto> list, @Json(name = "header") HeaderDto headerDto) {
        this.money = money;
        this.message = str;
        this.merchant = merchantDto;
        this.widgets = list;
        this.header = headerDto;
    }

    public static /* synthetic */ PaymentInfoDto copy$default(PaymentInfoDto paymentInfoDto, Money money, String str, MerchantDto merchantDto, List list, HeaderDto headerDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = paymentInfoDto.money;
        }
        if ((i & 2) != 0) {
            str = paymentInfoDto.message;
        }
        if ((i & 4) != 0) {
            merchantDto = paymentInfoDto.merchant;
        }
        if ((i & 8) != 0) {
            list = paymentInfoDto.widgets;
        }
        if ((i & 16) != 0) {
            headerDto = paymentInfoDto.header;
        }
        HeaderDto headerDto2 = headerDto;
        MerchantDto merchantDto2 = merchantDto;
        return paymentInfoDto.copy(money, str, merchantDto2, list, headerDto2);
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

    public final List<WidgetDto> component4() {
        return this.widgets;
    }

    /* renamed from: component5, reason: from getter */
    public final HeaderDto getHeader() {
        return this.header;
    }

    public final PaymentInfoDto copy(@Json(name = "money") Money money, @Json(name = "message") String message, @Json(name = "merchant") MerchantDto merchant, @Json(name = "limit_widgets") List<WidgetDto> widgets, @Json(name = "header") HeaderDto header) {
        return new PaymentInfoDto(money, message, merchant, widgets, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoDto)) {
            return false;
        }
        PaymentInfoDto paymentInfoDto = (PaymentInfoDto) other;
        return jl40.l(this.money, paymentInfoDto.money) && jl40.l(this.message, paymentInfoDto.message) && jl40.l(this.merchant, paymentInfoDto.merchant) && jl40.l(this.widgets, paymentInfoDto.widgets) && jl40.l(this.header, paymentInfoDto.header);
    }

    public final HeaderDto getHeader() {
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

    public final List<WidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        Money money = this.money;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.message;
        return this.header.hashCode() + unr0.c((this.merchant.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.widgets);
    }

    public String toString() {
        return "PaymentInfoDto(money=" + this.money + ", message=" + this.message + ", merchant=" + this.merchant + ", widgets=" + this.widgets + ", header=" + this.header + Extension.C_BRAKE;
    }
}
