package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.vh51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$DepositMoney", "Lvh51;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;", "amount", "", "paymentMethodId", "<init>", "(Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;", "component2", "()Ljava/lang/String;", "Lcom/ybsdk/api/YBSdkScreenIntent$DepositMoney;", "copy", "(Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;Ljava/lang/String;)Lcom/ybsdk/api/YBSdkScreenIntent$DepositMoney;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/YBSdkScreenIntent$DepositAmount;", "getAmount", "Ljava/lang/String;", "getPaymentMethodId", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$DepositMoney extends vh51 implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$DepositMoney> CREATOR = new Creator();
    private final YBSdkScreenIntent$DepositAmount amount;
    private final String paymentMethodId;

    public /* synthetic */ YBSdkScreenIntent$DepositMoney(YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : yBSdkScreenIntent$DepositAmount, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ YBSdkScreenIntent$DepositMoney copy$default(YBSdkScreenIntent$DepositMoney yBSdkScreenIntent$DepositMoney, YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            yBSdkScreenIntent$DepositAmount = yBSdkScreenIntent$DepositMoney.amount;
        }
        if ((i & 2) != 0) {
            str = yBSdkScreenIntent$DepositMoney.paymentMethodId;
        }
        return yBSdkScreenIntent$DepositMoney.copy(yBSdkScreenIntent$DepositAmount, str);
    }

    /* renamed from: component1, reason: from getter */
    public final YBSdkScreenIntent$DepositAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final YBSdkScreenIntent$DepositMoney copy(YBSdkScreenIntent$DepositAmount amount, String paymentMethodId) {
        return new YBSdkScreenIntent$DepositMoney(amount, paymentMethodId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBSdkScreenIntent$DepositMoney)) {
            return false;
        }
        YBSdkScreenIntent$DepositMoney yBSdkScreenIntent$DepositMoney = (YBSdkScreenIntent$DepositMoney) other;
        return jl40.l(this.amount, yBSdkScreenIntent$DepositMoney.amount) && jl40.l(this.paymentMethodId, yBSdkScreenIntent$DepositMoney.paymentMethodId);
    }

    public final YBSdkScreenIntent$DepositAmount getAmount() {
        return this.amount;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public int hashCode() {
        YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount = this.amount;
        int hashCode = (yBSdkScreenIntent$DepositAmount == null ? 0 : yBSdkScreenIntent$DepositAmount.hashCode()) * 31;
        String str = this.paymentMethodId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DepositMoney(amount=" + this.amount + ", paymentMethodId=" + this.paymentMethodId + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount = this.amount;
        if (yBSdkScreenIntent$DepositAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            yBSdkScreenIntent$DepositAmount.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentMethodId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$DepositMoney> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$DepositMoney createFromParcel(Parcel parcel) {
            return new YBSdkScreenIntent$DepositMoney(parcel.readInt() == 0 ? null : YBSdkScreenIntent$DepositAmount.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$DepositMoney[] newArray(int i) {
            return new YBSdkScreenIntent$DepositMoney[i];
        }
    }

    public YBSdkScreenIntent$DepositMoney(YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount, String str) {
        this.amount = yBSdkScreenIntent$DepositAmount;
        this.paymentMethodId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YBSdkScreenIntent$DepositMoney() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
