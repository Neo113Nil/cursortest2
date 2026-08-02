package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;", "", "receiverPhone", "", "receiverBankId", "receiverFullName", "debitMoney", "Lcom/ybsdk/core/common/data/network/dto/Money;", "creditMoney", "priorityMoneyType", "currencyRate", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderCurrencyRateParam;", "checkUserBankId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderCurrencyRateParam;Ljava/lang/String;)V", "getReceiverPhone", "()Ljava/lang/String;", "getReceiverBankId", "getReceiverFullName", "getDebitMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCreditMoney", "getPriorityMoneyType", "getCurrencyRate", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderCurrencyRateParam;", "getCheckUserBankId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderByPhonePrerequisiteParam {
    private final String checkUserBankId;
    private final Money creditMoney;
    private final CrossBorderCurrencyRateParam currencyRate;
    private final Money debitMoney;
    private final String priorityMoneyType;
    private final String receiverBankId;
    private final String receiverFullName;
    private final String receiverPhone;

    public CrossBorderByPhonePrerequisiteParam(@Json(name = "receiver_phone") String str, @Json(name = "receiver_bank_id") String str2, @Json(name = "receiver_full_name") String str3, @Json(name = "debit_money") Money money, @Json(name = "credit_money") Money money2, @Json(name = "priority_money_type") String str4, @Json(name = "currency_rate") CrossBorderCurrencyRateParam crossBorderCurrencyRateParam, @Json(name = "check_user_bank_id") String str5) {
        this.receiverPhone = str;
        this.receiverBankId = str2;
        this.receiverFullName = str3;
        this.debitMoney = money;
        this.creditMoney = money2;
        this.priorityMoneyType = str4;
        this.currencyRate = crossBorderCurrencyRateParam;
        this.checkUserBankId = str5;
    }

    public static /* synthetic */ CrossBorderByPhonePrerequisiteParam copy$default(CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam, String str, String str2, String str3, Money money, Money money2, String str4, CrossBorderCurrencyRateParam crossBorderCurrencyRateParam, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderByPhonePrerequisiteParam.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = crossBorderByPhonePrerequisiteParam.receiverBankId;
        }
        if ((i & 4) != 0) {
            str3 = crossBorderByPhonePrerequisiteParam.receiverFullName;
        }
        if ((i & 8) != 0) {
            money = crossBorderByPhonePrerequisiteParam.debitMoney;
        }
        if ((i & 16) != 0) {
            money2 = crossBorderByPhonePrerequisiteParam.creditMoney;
        }
        if ((i & 32) != 0) {
            str4 = crossBorderByPhonePrerequisiteParam.priorityMoneyType;
        }
        if ((i & 64) != 0) {
            crossBorderCurrencyRateParam = crossBorderByPhonePrerequisiteParam.currencyRate;
        }
        if ((i & 128) != 0) {
            str5 = crossBorderByPhonePrerequisiteParam.checkUserBankId;
        }
        CrossBorderCurrencyRateParam crossBorderCurrencyRateParam2 = crossBorderCurrencyRateParam;
        String str6 = str5;
        Money money3 = money2;
        String str7 = str4;
        return crossBorderByPhonePrerequisiteParam.copy(str, str2, str3, money, money3, str7, crossBorderCurrencyRateParam2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiverBankId() {
        return this.receiverBankId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getDebitMoney() {
        return this.debitMoney;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    /* renamed from: component7, reason: from getter */
    public final CrossBorderCurrencyRateParam getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    public final CrossBorderByPhonePrerequisiteParam copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "receiver_bank_id") String receiverBankId, @Json(name = "receiver_full_name") String receiverFullName, @Json(name = "debit_money") Money debitMoney, @Json(name = "credit_money") Money creditMoney, @Json(name = "priority_money_type") String priorityMoneyType, @Json(name = "currency_rate") CrossBorderCurrencyRateParam currencyRate, @Json(name = "check_user_bank_id") String checkUserBankId) {
        return new CrossBorderByPhonePrerequisiteParam(receiverPhone, receiverBankId, receiverFullName, debitMoney, creditMoney, priorityMoneyType, currencyRate, checkUserBankId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderByPhonePrerequisiteParam)) {
            return false;
        }
        CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam = (CrossBorderByPhonePrerequisiteParam) other;
        return jl40.l(this.receiverPhone, crossBorderByPhonePrerequisiteParam.receiverPhone) && jl40.l(this.receiverBankId, crossBorderByPhonePrerequisiteParam.receiverBankId) && jl40.l(this.receiverFullName, crossBorderByPhonePrerequisiteParam.receiverFullName) && jl40.l(this.debitMoney, crossBorderByPhonePrerequisiteParam.debitMoney) && jl40.l(this.creditMoney, crossBorderByPhonePrerequisiteParam.creditMoney) && jl40.l(this.priorityMoneyType, crossBorderByPhonePrerequisiteParam.priorityMoneyType) && jl40.l(this.currencyRate, crossBorderByPhonePrerequisiteParam.currencyRate) && jl40.l(this.checkUserBankId, crossBorderByPhonePrerequisiteParam.checkUserBankId);
    }

    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    public final Money getCreditMoney() {
        return this.creditMoney;
    }

    public final CrossBorderCurrencyRateParam getCurrencyRate() {
        return this.currencyRate;
    }

    public final Money getDebitMoney() {
        return this.debitMoney;
    }

    public final String getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    public final String getReceiverBankId() {
        return this.receiverBankId;
    }

    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public int hashCode() {
        int b = unr0.b(this.receiverPhone.hashCode() * 31, 31, this.receiverBankId);
        String str = this.receiverFullName;
        int hashCode = (this.currencyRate.hashCode() + unr0.b(tse0.c(this.creditMoney, tse0.c(this.debitMoney, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.priorityMoneyType)) * 31;
        String str2 = this.checkUserBankId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.receiverBankId;
        String str3 = this.receiverFullName;
        Money money = this.debitMoney;
        Money money2 = this.creditMoney;
        String str4 = this.priorityMoneyType;
        CrossBorderCurrencyRateParam crossBorderCurrencyRateParam = this.currencyRate;
        String str5 = this.checkUserBankId;
        StringBuilder v = b64.v("CrossBorderByPhonePrerequisiteParam(receiverPhone=", str, ", receiverBankId=", str2, ", receiverFullName=");
        v.append(str3);
        v.append(", debitMoney=");
        v.append(money);
        v.append(", creditMoney=");
        v.append(money2);
        v.append(", priorityMoneyType=");
        v.append(str4);
        v.append(", currencyRate=");
        v.append(crossBorderCurrencyRateParam);
        v.append(", checkUserBankId=");
        v.append(str5);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
