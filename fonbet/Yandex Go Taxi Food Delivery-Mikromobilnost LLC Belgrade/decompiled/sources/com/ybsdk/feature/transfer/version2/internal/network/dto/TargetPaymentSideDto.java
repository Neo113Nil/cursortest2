package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;", "", "type", "", "transferType", "creditMoney", "Lcom/ybsdk/core/common/data/network/dto/Money;", "debitMoney", "currencyRate", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateV3Dto;", "receiver", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverDto;", "publicAgreementId", "priorityMoneyType", "inputSource", "checkUserBankId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateV3Dto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTransferType", "getCreditMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getDebitMoney", "getCurrencyRate", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateV3Dto;", "getReceiver", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverDto;", "getPublicAgreementId", "getPriorityMoneyType", "getInputSource", "getCheckUserBankId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TargetPaymentSideDto {
    private final String checkUserBankId;
    private final Money creditMoney;
    private final CurrencyRateV3Dto currencyRate;
    private final Money debitMoney;
    private final String inputSource;
    private final String priorityMoneyType;
    private final String publicAgreementId;
    private final CrossBorderReceiverDto receiver;
    private final String transferType;
    private final String type;

    public /* synthetic */ TargetPaymentSideDto(String str, String str2, Money money, Money money2, CurrencyRateV3Dto currencyRateV3Dto, CrossBorderReceiverDto crossBorderReceiverDto, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? null : currencyRateV3Dto, (i & 32) != 0 ? null : crossBorderReceiverDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    public static /* synthetic */ TargetPaymentSideDto copy$default(TargetPaymentSideDto targetPaymentSideDto, String str, String str2, Money money, Money money2, CurrencyRateV3Dto currencyRateV3Dto, CrossBorderReceiverDto crossBorderReceiverDto, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = targetPaymentSideDto.type;
        }
        if ((i & 2) != 0) {
            str2 = targetPaymentSideDto.transferType;
        }
        if ((i & 4) != 0) {
            money = targetPaymentSideDto.creditMoney;
        }
        if ((i & 8) != 0) {
            money2 = targetPaymentSideDto.debitMoney;
        }
        if ((i & 16) != 0) {
            currencyRateV3Dto = targetPaymentSideDto.currencyRate;
        }
        if ((i & 32) != 0) {
            crossBorderReceiverDto = targetPaymentSideDto.receiver;
        }
        if ((i & 64) != 0) {
            str3 = targetPaymentSideDto.publicAgreementId;
        }
        if ((i & 128) != 0) {
            str4 = targetPaymentSideDto.priorityMoneyType;
        }
        if ((i & 256) != 0) {
            str5 = targetPaymentSideDto.inputSource;
        }
        if ((i & 512) != 0) {
            str6 = targetPaymentSideDto.checkUserBankId;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        CurrencyRateV3Dto currencyRateV3Dto2 = currencyRateV3Dto;
        CrossBorderReceiverDto crossBorderReceiverDto2 = crossBorderReceiverDto;
        return targetPaymentSideDto.copy(str, str2, money, money2, currencyRateV3Dto2, crossBorderReceiverDto2, str9, str10, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getDebitMoney() {
        return this.debitMoney;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrencyRateV3Dto getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component6, reason: from getter */
    public final CrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPublicAgreementId() {
        return this.publicAgreementId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInputSource() {
        return this.inputSource;
    }

    public final TargetPaymentSideDto copy(@Json(name = "type") String type, @Json(name = "transfer_type") String transferType, @Json(name = "credit_money") Money creditMoney, @Json(name = "debit_money") Money debitMoney, @Json(name = "currency_rate") CurrencyRateV3Dto currencyRate, @Json(name = "receiver") CrossBorderReceiverDto receiver, @Json(name = "public_agreement_id") String publicAgreementId, @Json(name = "priority_money_type") String priorityMoneyType, @Json(name = "input_source") String inputSource, @Json(name = "check_user_bank_id") String checkUserBankId) {
        return new TargetPaymentSideDto(type, transferType, creditMoney, debitMoney, currencyRate, receiver, publicAgreementId, priorityMoneyType, inputSource, checkUserBankId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetPaymentSideDto)) {
            return false;
        }
        TargetPaymentSideDto targetPaymentSideDto = (TargetPaymentSideDto) other;
        return jl40.l(this.type, targetPaymentSideDto.type) && jl40.l(this.transferType, targetPaymentSideDto.transferType) && jl40.l(this.creditMoney, targetPaymentSideDto.creditMoney) && jl40.l(this.debitMoney, targetPaymentSideDto.debitMoney) && jl40.l(this.currencyRate, targetPaymentSideDto.currencyRate) && jl40.l(this.receiver, targetPaymentSideDto.receiver) && jl40.l(this.publicAgreementId, targetPaymentSideDto.publicAgreementId) && jl40.l(this.priorityMoneyType, targetPaymentSideDto.priorityMoneyType) && jl40.l(this.inputSource, targetPaymentSideDto.inputSource) && jl40.l(this.checkUserBankId, targetPaymentSideDto.checkUserBankId);
    }

    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    public final CurrencyRateV3Dto getCurrencyRate() {
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

    public final String getPublicAgreementId() {
        return this.publicAgreementId;
    }

    public final CrossBorderReceiverDto getReceiver() {
        return this.receiver;
    }

    public final String getTransferType() {
        return this.transferType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.transferType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.creditMoney;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.debitMoney;
        int hashCode4 = (hashCode3 + (money2 == null ? 0 : money2.hashCode())) * 31;
        CurrencyRateV3Dto currencyRateV3Dto = this.currencyRate;
        int hashCode5 = (hashCode4 + (currencyRateV3Dto == null ? 0 : currencyRateV3Dto.hashCode())) * 31;
        CrossBorderReceiverDto crossBorderReceiverDto = this.receiver;
        int hashCode6 = (hashCode5 + (crossBorderReceiverDto == null ? 0 : crossBorderReceiverDto.hashCode())) * 31;
        String str2 = this.publicAgreementId;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priorityMoneyType;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inputSource;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.checkUserBankId;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.transferType;
        Money money = this.creditMoney;
        Money money2 = this.debitMoney;
        CurrencyRateV3Dto currencyRateV3Dto = this.currencyRate;
        CrossBorderReceiverDto crossBorderReceiverDto = this.receiver;
        String str3 = this.publicAgreementId;
        String str4 = this.priorityMoneyType;
        String str5 = this.inputSource;
        String str6 = this.checkUserBankId;
        StringBuilder v = b64.v("TargetPaymentSideDto(type=", str, ", transferType=", str2, ", creditMoney=");
        v.append(money);
        v.append(", debitMoney=");
        v.append(money2);
        v.append(", currencyRate=");
        v.append(currencyRateV3Dto);
        v.append(", receiver=");
        v.append(crossBorderReceiverDto);
        v.append(", publicAgreementId=");
        g8e.D(v, str3, ", priorityMoneyType=", str4, ", inputSource=");
        return g8e.r(v, str5, ", checkUserBankId=", str6, Extension.C_BRAKE);
    }

    public TargetPaymentSideDto(@Json(name = "type") String str, @Json(name = "transfer_type") String str2, @Json(name = "credit_money") Money money, @Json(name = "debit_money") Money money2, @Json(name = "currency_rate") CurrencyRateV3Dto currencyRateV3Dto, @Json(name = "receiver") CrossBorderReceiverDto crossBorderReceiverDto, @Json(name = "public_agreement_id") String str3, @Json(name = "priority_money_type") String str4, @Json(name = "input_source") String str5, @Json(name = "check_user_bank_id") String str6) {
        this.type = str;
        this.transferType = str2;
        this.creditMoney = money;
        this.debitMoney = money2;
        this.currencyRate = currencyRateV3Dto;
        this.receiver = crossBorderReceiverDto;
        this.publicAgreementId = str3;
        this.priorityMoneyType = str4;
        this.inputSource = str5;
        this.checkUserBankId = str6;
    }
}
