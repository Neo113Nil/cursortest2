package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/xplat/payment/sdk/NewCard;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "cardNumber", "expirationMonth", "expirationYear", "cvn", "", "shouldBeStored", "Lcom/yandex/xplat/payment/sdk/BankName;", "bank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/xplat/payment/sdk/BankName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCardNumber", "()Ljava/lang/String;", "getExpirationMonth", "getExpirationYear", "getCvn", "Z", "getShouldBeStored", "()Z", "Lcom/yandex/xplat/payment/sdk/BankName;", "getBank", "()Lcom/yandex/xplat/payment/sdk/BankName;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class NewCard implements Parcelable {
    public static final Parcelable.Creator<NewCard> CREATOR = new Creator();
    private final BankName bank;
    private final String cardNumber;
    private final String cvn;
    private final String expirationMonth;
    private final String expirationYear;
    private final boolean shouldBeStored;

    public /* synthetic */ NewCard(String str, String str2, String str3, String str4, boolean z, BankName bankName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? BankName.UnknownBank : bankName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final BankName getBank() {
        return this.bank;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvn() {
        return this.cvn;
    }

    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final boolean getShouldBeStored() {
        return this.shouldBeStored;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardNumber);
        dest.writeString(this.expirationMonth);
        dest.writeString(this.expirationYear);
        dest.writeString(this.cvn);
        dest.writeInt(this.shouldBeStored ? 1 : 0);
        dest.writeString(this.bank.name());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NewCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCard createFromParcel(Parcel parcel) {
            return new NewCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, BankName.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCard[] newArray(int i) {
            return new NewCard[i];
        }
    }

    public NewCard(String str, String str2, String str3, String str4, boolean z, BankName bankName) {
        this.cardNumber = str;
        this.expirationMonth = str2;
        this.expirationYear = str3;
        this.cvn = str4;
        this.shouldBeStored = z;
        this.bank = bankName;
    }
}
