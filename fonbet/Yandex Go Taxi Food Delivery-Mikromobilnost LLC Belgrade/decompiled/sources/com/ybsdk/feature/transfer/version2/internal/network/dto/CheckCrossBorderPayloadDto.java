package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;", "", "creditMoney", "Lcom/ybsdk/core/common/data/network/dto/Money;", "currencyRate", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderCurrencyRateDto;", "receiver", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;", "priorityMoneyType", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderCurrencyRateDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;Ljava/lang/String;)V", "getCreditMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCurrencyRate", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderCurrencyRateDto;", "getReceiver", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;", "getPriorityMoneyType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckCrossBorderPayloadDto {
    private final Money creditMoney;
    private final CheckCrossBorderCurrencyRateDto currencyRate;
    private final String priorityMoneyType;
    private final CheckCrossBorderReceiverDto receiver;

    public CheckCrossBorderPayloadDto(@Json(name = "credit_money") Money money, @Json(name = "currency_rate") CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto, @Json(name = "receiver") CheckCrossBorderReceiverDto checkCrossBorderReceiverDto, @Json(name = "priority_money_type") String str) {
        this.creditMoney = money;
        this.currencyRate = checkCrossBorderCurrencyRateDto;
        this.receiver = checkCrossBorderReceiverDto;
        this.priorityMoneyType = str;
    }

    public static /* synthetic */ CheckCrossBorderPayloadDto copy$default(CheckCrossBorderPayloadDto checkCrossBorderPayloadDto, Money money, CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto, CheckCrossBorderReceiverDto checkCrossBorderReceiverDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            money = checkCrossBorderPayloadDto.creditMoney;
        }
        if ((i & 2) != 0) {
            checkCrossBorderCurrencyRateDto = checkCrossBorderPayloadDto.currencyRate;
        }
        if ((i & 4) != 0) {
            checkCrossBorderReceiverDto = checkCrossBorderPayloadDto.receiver;
        }
        if ((i & 8) != 0) {
            str = checkCrossBorderPayloadDto.priorityMoneyType;
        }
        return checkCrossBorderPayloadDto.copy(money, checkCrossBorderCurrencyRateDto, checkCrossBorderReceiverDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    /* renamed from: component2, reason: from getter */
    public final CheckCrossBorderCurrencyRateDto getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component3, reason: from getter */
    public final CheckCrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    public final CheckCrossBorderPayloadDto copy(@Json(name = "credit_money") Money creditMoney, @Json(name = "currency_rate") CheckCrossBorderCurrencyRateDto currencyRate, @Json(name = "receiver") CheckCrossBorderReceiverDto receiver, @Json(name = "priority_money_type") String priorityMoneyType) {
        return new CheckCrossBorderPayloadDto(creditMoney, currencyRate, receiver, priorityMoneyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckCrossBorderPayloadDto)) {
            return false;
        }
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto = (CheckCrossBorderPayloadDto) other;
        return jl40.l(this.creditMoney, checkCrossBorderPayloadDto.creditMoney) && jl40.l(this.currencyRate, checkCrossBorderPayloadDto.currencyRate) && jl40.l(this.receiver, checkCrossBorderPayloadDto.receiver) && jl40.l(this.priorityMoneyType, checkCrossBorderPayloadDto.priorityMoneyType);
    }

    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    public final CheckCrossBorderCurrencyRateDto getCurrencyRate() {
        return this.currencyRate;
    }

    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    public final CheckCrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    public int hashCode() {
        Money money = this.creditMoney;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto = this.currencyRate;
        int hashCode2 = (hashCode + (checkCrossBorderCurrencyRateDto == null ? 0 : checkCrossBorderCurrencyRateDto.hashCode())) * 31;
        CheckCrossBorderReceiverDto checkCrossBorderReceiverDto = this.receiver;
        int hashCode3 = (hashCode2 + (checkCrossBorderReceiverDto == null ? 0 : checkCrossBorderReceiverDto.hashCode())) * 31;
        String str = this.priorityMoneyType;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CheckCrossBorderPayloadDto(creditMoney=" + this.creditMoney + ", currencyRate=" + this.currencyRate + ", receiver=" + this.receiver + ", priorityMoneyType=" + this.priorityMoneyType + Extension.C_BRAKE;
    }
}
