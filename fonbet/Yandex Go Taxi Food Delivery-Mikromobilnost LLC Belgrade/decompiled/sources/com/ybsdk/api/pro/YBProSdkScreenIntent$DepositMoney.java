package com.ybsdk.api.pro;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.pro.entities.YBProSdkAgreement;
import defpackage.jl40;
import defpackage.tt91;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006'"}, d2 = {"com/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney", "Ltt91;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;", "agreement", "Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;", "amount", "<init>", "(Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;", "component2", "()Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;", "Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney;", "copy", "(Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;)Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;", "getAgreement", "Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;", "getAmount", "DepositAmount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBProSdkScreenIntent$DepositMoney extends tt91 implements Parcelable {
    public static final Parcelable.Creator<YBProSdkScreenIntent$DepositMoney> CREATOR = new Creator();
    private final YBProSdkAgreement agreement;
    private final DepositAmount amount;

    public /* synthetic */ YBProSdkScreenIntent$DepositMoney(YBProSdkAgreement yBProSdkAgreement, DepositAmount depositAmount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yBProSdkAgreement, (i & 2) != 0 ? null : depositAmount);
    }

    public static /* synthetic */ YBProSdkScreenIntent$DepositMoney copy$default(YBProSdkScreenIntent$DepositMoney yBProSdkScreenIntent$DepositMoney, YBProSdkAgreement yBProSdkAgreement, DepositAmount depositAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            yBProSdkAgreement = yBProSdkScreenIntent$DepositMoney.agreement;
        }
        if ((i & 2) != 0) {
            depositAmount = yBProSdkScreenIntent$DepositMoney.amount;
        }
        return yBProSdkScreenIntent$DepositMoney.copy(yBProSdkAgreement, depositAmount);
    }

    /* renamed from: component1, reason: from getter */
    public final YBProSdkAgreement getAgreement() {
        return this.agreement;
    }

    /* renamed from: component2, reason: from getter */
    public final DepositAmount getAmount() {
        return this.amount;
    }

    public final YBProSdkScreenIntent$DepositMoney copy(YBProSdkAgreement agreement, DepositAmount amount) {
        return new YBProSdkScreenIntent$DepositMoney(agreement, amount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBProSdkScreenIntent$DepositMoney)) {
            return false;
        }
        YBProSdkScreenIntent$DepositMoney yBProSdkScreenIntent$DepositMoney = (YBProSdkScreenIntent$DepositMoney) other;
        return jl40.l(this.agreement, yBProSdkScreenIntent$DepositMoney.agreement) && jl40.l(this.amount, yBProSdkScreenIntent$DepositMoney.amount);
    }

    public final YBProSdkAgreement getAgreement() {
        return this.agreement;
    }

    public final DepositAmount getAmount() {
        return this.amount;
    }

    public int hashCode() {
        int hashCode = this.agreement.hashCode() * 31;
        DepositAmount depositAmount = this.amount;
        return hashCode + (depositAmount == null ? 0 : depositAmount.hashCode());
    }

    public String toString() {
        return "DepositMoney(agreement=" + this.agreement + ", amount=" + this.amount + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.agreement.writeToParcel(dest, flags);
        DepositAmount depositAmount = this.amount;
        if (depositAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            depositAmount.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;", "Landroid/os/Parcelable;", "", "currencyCode", "Ljava/math/BigDecimal;", "amount", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/ybsdk/api/pro/YBProSdkScreenIntent$DepositMoney$DepositAmount;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrencyCode", "Ljava/math/BigDecimal;", "getAmount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DepositAmount implements Parcelable {
        public static final Parcelable.Creator<DepositAmount> CREATOR = new Creator();
        private final BigDecimal amount;
        private final String currencyCode;

        public DepositAmount(String str, BigDecimal bigDecimal) {
            this.currencyCode = str;
            this.amount = bigDecimal;
        }

        public static /* synthetic */ DepositAmount copy$default(DepositAmount depositAmount, String str, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                bigDecimal = depositAmount.amount;
            }
            return depositAmount.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final DepositAmount copy(String currencyCode, BigDecimal amount) {
            return new DepositAmount(currencyCode, amount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositAmount)) {
                return false;
            }
            DepositAmount depositAmount = (DepositAmount) other;
            return jl40.l(this.currencyCode, depositAmount.currencyCode) && jl40.l(this.amount, depositAmount.amount);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public int hashCode() {
            return this.amount.hashCode() + (this.currencyCode.hashCode() * 31);
        }

        public String toString() {
            return "DepositAmount(currencyCode=" + this.currencyCode + ", amount=" + this.amount + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.currencyCode);
            dest.writeSerializable(this.amount);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DepositAmount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositAmount createFromParcel(Parcel parcel) {
                return new DepositAmount(parcel.readString(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositAmount[] newArray(int i) {
                return new DepositAmount[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBProSdkScreenIntent$DepositMoney> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkScreenIntent$DepositMoney createFromParcel(Parcel parcel) {
            return new YBProSdkScreenIntent$DepositMoney(YBProSdkAgreement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DepositAmount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkScreenIntent$DepositMoney[] newArray(int i) {
            return new YBProSdkScreenIntent$DepositMoney[i];
        }
    }

    public YBProSdkScreenIntent$DepositMoney(YBProSdkAgreement yBProSdkAgreement, DepositAmount depositAmount) {
        this.agreement = yBProSdkAgreement;
        this.amount = depositAmount;
    }
}
