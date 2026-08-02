package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;", "", "agreementId", "", "version", "", "debitMoney", "Lcom/ybsdk/core/common/data/network/dto/Money;", "creditMoney", "currencyRate", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateDto;", "receiverInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;", "priorityMoneyType", "inputSource", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getVersion", "()I", "getDebitMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCreditMoney", "getCurrencyRate", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateDto;", "getReceiverInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;", "getPriorityMoneyType", "getInputSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderByPhoneRequest {
    private final String agreementId;
    private final Money creditMoney;
    private final CurrencyRateDto currencyRate;
    private final Money debitMoney;
    private final String inputSource;
    private final String priorityMoneyType;
    private final CrossBorderReceiverInfoDto receiverInfo;
    private final int version;

    public /* synthetic */ CrossBorderByPhoneRequest(String str, int i, Money money, Money money2, CurrencyRateDto currencyRateDto, CrossBorderReceiverInfoDto crossBorderReceiverInfoDto, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, money, money2, currencyRateDto, crossBorderReceiverInfoDto, str2, (i2 & 128) != 0 ? null : str3);
    }

    public static /* synthetic */ CrossBorderByPhoneRequest copy$default(CrossBorderByPhoneRequest crossBorderByPhoneRequest, String str, int i, Money money, Money money2, CurrencyRateDto currencyRateDto, CrossBorderReceiverInfoDto crossBorderReceiverInfoDto, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = crossBorderByPhoneRequest.agreementId;
        }
        if ((i2 & 2) != 0) {
            i = crossBorderByPhoneRequest.version;
        }
        if ((i2 & 4) != 0) {
            money = crossBorderByPhoneRequest.debitMoney;
        }
        if ((i2 & 8) != 0) {
            money2 = crossBorderByPhoneRequest.creditMoney;
        }
        if ((i2 & 16) != 0) {
            currencyRateDto = crossBorderByPhoneRequest.currencyRate;
        }
        if ((i2 & 32) != 0) {
            crossBorderReceiverInfoDto = crossBorderByPhoneRequest.receiverInfo;
        }
        if ((i2 & 64) != 0) {
            str2 = crossBorderByPhoneRequest.priorityMoneyType;
        }
        if ((i2 & 128) != 0) {
            str3 = crossBorderByPhoneRequest.inputSource;
        }
        String str4 = str2;
        String str5 = str3;
        CurrencyRateDto currencyRateDto2 = currencyRateDto;
        CrossBorderReceiverInfoDto crossBorderReceiverInfoDto2 = crossBorderReceiverInfoDto;
        return crossBorderByPhoneRequest.copy(str, i, money, money2, currencyRateDto2, crossBorderReceiverInfoDto2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getDebitMoney() {
        return this.debitMoney;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrencyRateDto getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component6, reason: from getter */
    public final CrossBorderReceiverInfoDto getReceiverInfo() {
        return this.receiverInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInputSource() {
        return this.inputSource;
    }

    public final CrossBorderByPhoneRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "version") int version, @Json(name = "debit_money") Money debitMoney, @Json(name = "credit_money") Money creditMoney, @Json(name = "currency_rate") CurrencyRateDto currencyRate, @Json(name = "receiver_info") CrossBorderReceiverInfoDto receiverInfo, @Json(name = "priority_money_type") String priorityMoneyType, @Json(name = "input_source") String inputSource) {
        return new CrossBorderByPhoneRequest(agreementId, version, debitMoney, creditMoney, currencyRate, receiverInfo, priorityMoneyType, inputSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderByPhoneRequest)) {
            return false;
        }
        CrossBorderByPhoneRequest crossBorderByPhoneRequest = (CrossBorderByPhoneRequest) other;
        return jl40.l(this.agreementId, crossBorderByPhoneRequest.agreementId) && this.version == crossBorderByPhoneRequest.version && jl40.l(this.debitMoney, crossBorderByPhoneRequest.debitMoney) && jl40.l(this.creditMoney, crossBorderByPhoneRequest.creditMoney) && jl40.l(this.currencyRate, crossBorderByPhoneRequest.currencyRate) && jl40.l(this.receiverInfo, crossBorderByPhoneRequest.receiverInfo) && jl40.l(this.priorityMoneyType, crossBorderByPhoneRequest.priorityMoneyType) && jl40.l(this.inputSource, crossBorderByPhoneRequest.inputSource);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    public final CurrencyRateDto getCurrencyRate() {
        return this.currencyRate;
    }

    public final Money getDebitMoney() {
        return this.debitMoney;
    }

    public final String getInputSource() {
        return this.inputSource;
    }

    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    public final CrossBorderReceiverInfoDto getReceiverInfo() {
        return this.receiverInfo;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int b = unr0.b((this.receiverInfo.hashCode() + ((this.currencyRate.hashCode() + tse0.c(this.creditMoney, tse0.c(this.debitMoney, oyr.b(this.version, this.agreementId.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31, this.priorityMoneyType);
        String str = this.inputSource;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        int i = this.version;
        Money money = this.debitMoney;
        Money money2 = this.creditMoney;
        CurrencyRateDto currencyRateDto = this.currencyRate;
        CrossBorderReceiverInfoDto crossBorderReceiverInfoDto = this.receiverInfo;
        String str2 = this.priorityMoneyType;
        String str3 = this.inputSource;
        StringBuilder u = b64.u(i, "CrossBorderByPhoneRequest(agreementId=", str, ", version=", ", debitMoney=");
        u.append(money);
        u.append(", creditMoney=");
        u.append(money2);
        u.append(", currencyRate=");
        u.append(currencyRateDto);
        u.append(", receiverInfo=");
        u.append(crossBorderReceiverInfoDto);
        u.append(", priorityMoneyType=");
        return g8e.r(u, str2, ", inputSource=", str3, Extension.C_BRAKE);
    }

    public CrossBorderByPhoneRequest(@Json(name = "agreement_id") String str, @Json(name = "version") int i, @Json(name = "debit_money") Money money, @Json(name = "credit_money") Money money2, @Json(name = "currency_rate") CurrencyRateDto currencyRateDto, @Json(name = "receiver_info") CrossBorderReceiverInfoDto crossBorderReceiverInfoDto, @Json(name = "priority_money_type") String str2, @Json(name = "input_source") String str3) {
        this.agreementId = str;
        this.version = i;
        this.debitMoney = money;
        this.creditMoney = money2;
        this.currencyRate = currencyRateDto;
        this.receiverInfo = crossBorderReceiverInfoDto;
        this.priorityMoneyType = str2;
        this.inputSource = str3;
    }
}
