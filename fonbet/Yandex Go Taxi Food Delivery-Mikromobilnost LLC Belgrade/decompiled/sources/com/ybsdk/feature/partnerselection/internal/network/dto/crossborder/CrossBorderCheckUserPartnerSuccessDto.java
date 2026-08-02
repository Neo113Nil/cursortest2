package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;", "", "receiver", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderReceiverDto;", "currencyRate", "Lcom/ybsdk/core/common/data/network/dto/Money;", "currency", "", "checkUserPartnerId", "fee", "convertationTemplate", "<init>", "(Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderReceiverDto;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReceiver", "()Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderReceiverDto;", "getCurrencyRate", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCurrency", "()Ljava/lang/String;", "getCheckUserPartnerId", "getFee", "getConvertationTemplate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderCheckUserPartnerSuccessDto {
    private final String checkUserPartnerId;
    private final String convertationTemplate;
    private final String currency;
    private final Money currencyRate;
    private final String fee;
    private final CrossBorderReceiverDto receiver;

    public CrossBorderCheckUserPartnerSuccessDto(@Json(name = "receiver") CrossBorderReceiverDto crossBorderReceiverDto, @Json(name = "currency_rate") Money money, @Json(name = "currency") String str, @Json(name = "JSON_FIELD_CHECK_USER_PARTNER_ID") String str2, @Json(name = "fee") String str3, @Json(name = "convertation_template") String str4) {
        this.receiver = crossBorderReceiverDto;
        this.currencyRate = money;
        this.currency = str;
        this.checkUserPartnerId = str2;
        this.fee = str3;
        this.convertationTemplate = str4;
    }

    public static /* synthetic */ CrossBorderCheckUserPartnerSuccessDto copy$default(CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto, CrossBorderReceiverDto crossBorderReceiverDto, Money money, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            crossBorderReceiverDto = crossBorderCheckUserPartnerSuccessDto.receiver;
        }
        if ((i & 2) != 0) {
            money = crossBorderCheckUserPartnerSuccessDto.currencyRate;
        }
        if ((i & 4) != 0) {
            str = crossBorderCheckUserPartnerSuccessDto.currency;
        }
        if ((i & 8) != 0) {
            str2 = crossBorderCheckUserPartnerSuccessDto.checkUserPartnerId;
        }
        if ((i & 16) != 0) {
            str3 = crossBorderCheckUserPartnerSuccessDto.fee;
        }
        if ((i & 32) != 0) {
            str4 = crossBorderCheckUserPartnerSuccessDto.convertationTemplate;
        }
        String str5 = str3;
        String str6 = str4;
        return crossBorderCheckUserPartnerSuccessDto.copy(crossBorderReceiverDto, money, str, str2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final CrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCheckUserPartnerId() {
        return this.checkUserPartnerId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final CrossBorderCheckUserPartnerSuccessDto copy(@Json(name = "receiver") CrossBorderReceiverDto receiver, @Json(name = "currency_rate") Money currencyRate, @Json(name = "currency") String currency, @Json(name = "JSON_FIELD_CHECK_USER_PARTNER_ID") String checkUserPartnerId, @Json(name = "fee") String fee, @Json(name = "convertation_template") String convertationTemplate) {
        return new CrossBorderCheckUserPartnerSuccessDto(receiver, currencyRate, currency, checkUserPartnerId, fee, convertationTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderCheckUserPartnerSuccessDto)) {
            return false;
        }
        CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto = (CrossBorderCheckUserPartnerSuccessDto) other;
        return jl40.l(this.receiver, crossBorderCheckUserPartnerSuccessDto.receiver) && jl40.l(this.currencyRate, crossBorderCheckUserPartnerSuccessDto.currencyRate) && jl40.l(this.currency, crossBorderCheckUserPartnerSuccessDto.currency) && jl40.l(this.checkUserPartnerId, crossBorderCheckUserPartnerSuccessDto.checkUserPartnerId) && jl40.l(this.fee, crossBorderCheckUserPartnerSuccessDto.fee) && jl40.l(this.convertationTemplate, crossBorderCheckUserPartnerSuccessDto.convertationTemplate);
    }

    public final String getCheckUserPartnerId() {
        return this.checkUserPartnerId;
    }

    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Money getCurrencyRate() {
        return this.currencyRate;
    }

    public final String getFee() {
        return this.fee;
    }

    public final CrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(tse0.c(this.currencyRate, this.receiver.hashCode() * 31, 31), 31, this.currency), 31, this.checkUserPartnerId);
        String str = this.fee;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.convertationTemplate;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        CrossBorderReceiverDto crossBorderReceiverDto = this.receiver;
        Money money = this.currencyRate;
        String str = this.currency;
        String str2 = this.checkUserPartnerId;
        String str3 = this.fee;
        String str4 = this.convertationTemplate;
        StringBuilder sb = new StringBuilder("CrossBorderCheckUserPartnerSuccessDto(receiver=");
        sb.append(crossBorderReceiverDto);
        sb.append(", currencyRate=");
        sb.append(money);
        sb.append(", currency=");
        g8e.D(sb, str, ", checkUserPartnerId=", str2, ", fee=");
        return g8e.r(sb, str3, ", convertationTemplate=", str4, Extension.C_BRAKE);
    }

    public /* synthetic */ CrossBorderCheckUserPartnerSuccessDto(CrossBorderReceiverDto crossBorderReceiverDto, Money money, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(crossBorderReceiverDto, money, str, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
