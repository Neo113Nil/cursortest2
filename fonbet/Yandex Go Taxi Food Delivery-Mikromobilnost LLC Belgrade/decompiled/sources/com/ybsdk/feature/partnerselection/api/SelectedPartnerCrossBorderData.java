package com.ybsdk.feature.partnerselection.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00017BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010 Jd\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b6\u0010 ¨\u00068"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "debitMoney", "creditMoney", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;", "currencyRate", "Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;", "priorityMoneyType", "", "transferId", "fee", "convertationTemplate", "<init>", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component2", "component3", "()Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;", "component4", "()Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getDebitMoney", "getCreditMoney", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;", "getCurrencyRate", "Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;", "getPriorityMoneyType", "Ljava/lang/String;", "getTransferId", "getFee", "getConvertationTemplate", "CurrencyRate", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectedPartnerCrossBorderData implements Parcelable {
    public static final Parcelable.Creator<SelectedPartnerCrossBorderData> CREATOR = new Creator();
    private final String convertationTemplate;
    private final MoneyEntity creditMoney;
    private final CurrencyRate currencyRate;
    private final MoneyEntity debitMoney;
    private final String fee;
    private final CrossBorderCheckResult$PriorityMoneyType priorityMoneyType;
    private final String transferId;

    public /* synthetic */ SelectedPartnerCrossBorderData(MoneyEntity moneyEntity, MoneyEntity moneyEntity2, CurrencyRate currencyRate, CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(moneyEntity, moneyEntity2, currencyRate, (i & 8) != 0 ? null : crossBorderCheckResult$PriorityMoneyType, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ SelectedPartnerCrossBorderData copy$default(SelectedPartnerCrossBorderData selectedPartnerCrossBorderData, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, CurrencyRate currencyRate, CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyEntity = selectedPartnerCrossBorderData.debitMoney;
        }
        if ((i & 2) != 0) {
            moneyEntity2 = selectedPartnerCrossBorderData.creditMoney;
        }
        if ((i & 4) != 0) {
            currencyRate = selectedPartnerCrossBorderData.currencyRate;
        }
        if ((i & 8) != 0) {
            crossBorderCheckResult$PriorityMoneyType = selectedPartnerCrossBorderData.priorityMoneyType;
        }
        if ((i & 16) != 0) {
            str = selectedPartnerCrossBorderData.transferId;
        }
        if ((i & 32) != 0) {
            str2 = selectedPartnerCrossBorderData.fee;
        }
        if ((i & 64) != 0) {
            str3 = selectedPartnerCrossBorderData.convertationTemplate;
        }
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        CurrencyRate currencyRate2 = currencyRate;
        return selectedPartnerCrossBorderData.copy(moneyEntity, moneyEntity2, currencyRate2, crossBorderCheckResult$PriorityMoneyType, str6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyEntity getDebitMoney() {
        return this.debitMoney;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyEntity getCreditMoney() {
        return this.creditMoney;
    }

    /* renamed from: component3, reason: from getter */
    public final CurrencyRate getCurrencyRate() {
        return this.currencyRate;
    }

    /* renamed from: component4, reason: from getter */
    public final CrossBorderCheckResult$PriorityMoneyType getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    /* renamed from: component7, reason: from getter */
    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final SelectedPartnerCrossBorderData copy(MoneyEntity debitMoney, MoneyEntity creditMoney, CurrencyRate currencyRate, CrossBorderCheckResult$PriorityMoneyType priorityMoneyType, String transferId, String fee, String convertationTemplate) {
        return new SelectedPartnerCrossBorderData(debitMoney, creditMoney, currencyRate, priorityMoneyType, transferId, fee, convertationTemplate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedPartnerCrossBorderData)) {
            return false;
        }
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData = (SelectedPartnerCrossBorderData) other;
        return jl40.l(this.debitMoney, selectedPartnerCrossBorderData.debitMoney) && jl40.l(this.creditMoney, selectedPartnerCrossBorderData.creditMoney) && jl40.l(this.currencyRate, selectedPartnerCrossBorderData.currencyRate) && this.priorityMoneyType == selectedPartnerCrossBorderData.priorityMoneyType && jl40.l(this.transferId, selectedPartnerCrossBorderData.transferId) && jl40.l(this.fee, selectedPartnerCrossBorderData.fee) && jl40.l(this.convertationTemplate, selectedPartnerCrossBorderData.convertationTemplate);
    }

    public final String getConvertationTemplate() {
        return this.convertationTemplate;
    }

    public final MoneyEntity getCreditMoney() {
        return this.creditMoney;
    }

    public final CurrencyRate getCurrencyRate() {
        return this.currencyRate;
    }

    public final MoneyEntity getDebitMoney() {
        return this.debitMoney;
    }

    public final String getFee() {
        return this.fee;
    }

    public final CrossBorderCheckResult$PriorityMoneyType getPriorityMoneyType() {
        return this.priorityMoneyType;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        MoneyEntity moneyEntity = this.debitMoney;
        int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
        MoneyEntity moneyEntity2 = this.creditMoney;
        int hashCode2 = (hashCode + (moneyEntity2 == null ? 0 : moneyEntity2.hashCode())) * 31;
        CurrencyRate currencyRate = this.currencyRate;
        int hashCode3 = (hashCode2 + (currencyRate == null ? 0 : currencyRate.hashCode())) * 31;
        CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType = this.priorityMoneyType;
        int hashCode4 = (hashCode3 + (crossBorderCheckResult$PriorityMoneyType == null ? 0 : crossBorderCheckResult$PriorityMoneyType.hashCode())) * 31;
        String str = this.transferId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fee;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.convertationTemplate;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        MoneyEntity moneyEntity = this.debitMoney;
        MoneyEntity moneyEntity2 = this.creditMoney;
        CurrencyRate currencyRate = this.currencyRate;
        CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType = this.priorityMoneyType;
        String str = this.transferId;
        String str2 = this.fee;
        String str3 = this.convertationTemplate;
        StringBuilder sb = new StringBuilder("SelectedPartnerCrossBorderData(debitMoney=");
        sb.append(moneyEntity);
        sb.append(", creditMoney=");
        sb.append(moneyEntity2);
        sb.append(", currencyRate=");
        sb.append(currencyRate);
        sb.append(", priorityMoneyType=");
        sb.append(crossBorderCheckResult$PriorityMoneyType);
        sb.append(", transferId=");
        g8e.D(sb, str, ", fee=", str2, ", convertationTemplate=");
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.debitMoney, flags);
        dest.writeParcelable(this.creditMoney, flags);
        CurrencyRate currencyRate = this.currencyRate;
        if (currencyRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currencyRate.writeToParcel(dest, flags);
        }
        CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType = this.priorityMoneyType;
        if (crossBorderCheckResult$PriorityMoneyType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(crossBorderCheckResult$PriorityMoneyType.name());
        }
        dest.writeString(this.transferId);
        dest.writeString(this.fee);
        dest.writeString(this.convertationTemplate);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;", "Landroid/os/Parcelable;", "", "rate", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData$CurrencyRate;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRate", "getCurrency", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CurrencyRate implements Parcelable {
        public static final Parcelable.Creator<CurrencyRate> CREATOR = new Creator();
        private final String currency;
        private final String rate;

        public CurrencyRate(String str, String str2) {
            this.rate = str;
            this.currency = str2;
        }

        public static /* synthetic */ CurrencyRate copy$default(CurrencyRate currencyRate, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyRate.rate;
            }
            if ((i & 2) != 0) {
                str2 = currencyRate.currency;
            }
            return currencyRate.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final CurrencyRate copy(String rate, String currency) {
            return new CurrencyRate(rate, currency);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrencyRate)) {
                return false;
            }
            CurrencyRate currencyRate = (CurrencyRate) other;
            return jl40.l(this.rate, currencyRate.rate) && jl40.l(this.currency, currencyRate.currency);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getRate() {
            return this.rate;
        }

        public int hashCode() {
            return this.currency.hashCode() + (this.rate.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("CurrencyRate(rate=", this.rate, ", currency=", this.currency, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.rate);
            dest.writeString(this.currency);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CurrencyRate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyRate createFromParcel(Parcel parcel) {
                return new CurrencyRate(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyRate[] newArray(int i) {
                return new CurrencyRate[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedPartnerCrossBorderData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPartnerCrossBorderData createFromParcel(Parcel parcel) {
            return new SelectedPartnerCrossBorderData((MoneyEntity) parcel.readParcelable(SelectedPartnerCrossBorderData.class.getClassLoader()), (MoneyEntity) parcel.readParcelable(SelectedPartnerCrossBorderData.class.getClassLoader()), parcel.readInt() == 0 ? null : CurrencyRate.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CrossBorderCheckResult$PriorityMoneyType.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPartnerCrossBorderData[] newArray(int i) {
            return new SelectedPartnerCrossBorderData[i];
        }
    }

    public SelectedPartnerCrossBorderData(MoneyEntity moneyEntity, MoneyEntity moneyEntity2, CurrencyRate currencyRate, CrossBorderCheckResult$PriorityMoneyType crossBorderCheckResult$PriorityMoneyType, String str, String str2, String str3) {
        this.debitMoney = moneyEntity;
        this.creditMoney = moneyEntity2;
        this.currencyRate = currencyRate;
        this.priorityMoneyType = crossBorderCheckResult$PriorityMoneyType;
        this.transferId = str;
        this.fee = str2;
        this.convertationTemplate = str3;
    }
}
