package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.smw0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$DepositAmount", "Landroid/os/Parcelable;", "", "currencyCode", "Ljava/math/BigDecimal;", "amount", "Lcom/ybsdk/api/DepositType;", "depositType", "", "suppressTopupNotice", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/ybsdk/api/DepositType;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Lcom/ybsdk/api/DepositType;", "component4", "()Z", "Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/ybsdk/api/DepositType;Z)Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrencyCode", "Ljava/math/BigDecimal;", "getAmount", "Lcom/ybsdk/api/DepositType;", "getDepositType", "Z", "getSuppressTopupNotice", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$DepositAmount implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$DepositAmount> CREATOR = new Creator();
    private final BigDecimal amount;
    private final String currencyCode;
    private final DepositType depositType;
    private final boolean suppressTopupNotice;

    public /* synthetic */ YBSdkScreenIntent$DepositAmount(String str, BigDecimal bigDecimal, DepositType depositType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, (i & 4) != 0 ? DepositType.ExactAmount : depositType, (i & 8) != 0 ? false : z);
    }

    public static /* synthetic */ YBSdkScreenIntent$DepositAmount copy$default(YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount, String str, BigDecimal bigDecimal, DepositType depositType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yBSdkScreenIntent$DepositAmount.currencyCode;
        }
        if ((i & 2) != 0) {
            bigDecimal = yBSdkScreenIntent$DepositAmount.amount;
        }
        if ((i & 4) != 0) {
            depositType = yBSdkScreenIntent$DepositAmount.depositType;
        }
        if ((i & 8) != 0) {
            z = yBSdkScreenIntent$DepositAmount.suppressTopupNotice;
        }
        return yBSdkScreenIntent$DepositAmount.copy(str, bigDecimal, depositType, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final DepositType getDepositType() {
        return this.depositType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSuppressTopupNotice() {
        return this.suppressTopupNotice;
    }

    public final YBSdkScreenIntent$DepositAmount copy(String currencyCode, BigDecimal amount, DepositType depositType, boolean suppressTopupNotice) {
        return new YBSdkScreenIntent$DepositAmount(currencyCode, amount, depositType, suppressTopupNotice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBSdkScreenIntent$DepositAmount)) {
            return false;
        }
        YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount = (YBSdkScreenIntent$DepositAmount) other;
        return jl40.l(this.currencyCode, yBSdkScreenIntent$DepositAmount.currencyCode) && jl40.l(this.amount, yBSdkScreenIntent$DepositAmount.amount) && this.depositType == yBSdkScreenIntent$DepositAmount.depositType && this.suppressTopupNotice == yBSdkScreenIntent$DepositAmount.suppressTopupNotice;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final DepositType getDepositType() {
        return this.depositType;
    }

    public final boolean getSuppressTopupNotice() {
        return this.suppressTopupNotice;
    }

    public int hashCode() {
        return Boolean.hashCode(this.suppressTopupNotice) + ((this.depositType.hashCode() + smw0.f(this.amount, this.currencyCode.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "DepositAmount(currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", depositType=" + this.depositType + ", suppressTopupNotice=" + this.suppressTopupNotice + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currencyCode);
        dest.writeSerializable(this.amount);
        dest.writeString(this.depositType.name());
        dest.writeInt(this.suppressTopupNotice ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$DepositAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$DepositAmount createFromParcel(Parcel parcel) {
            return new YBSdkScreenIntent$DepositAmount(parcel.readString(), (BigDecimal) parcel.readSerializable(), DepositType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$DepositAmount[] newArray(int i) {
            return new YBSdkScreenIntent$DepositAmount[i];
        }
    }

    public YBSdkScreenIntent$DepositAmount(String str, BigDecimal bigDecimal, DepositType depositType, boolean z) {
        this.currencyCode = str;
        this.amount = bigDecimal;
        this.depositType = depositType;
        this.suppressTopupNotice = z;
    }
}
