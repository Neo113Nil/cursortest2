package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xfq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedCardMethod;", "Landroid/os/Parcelable;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/BankName;", "bankName", "", "methodId", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/PaymentSystemName;", "paymentSystem", "suffix", "<init>", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/BankName;Ljava/lang/String;Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/PaymentSystemName;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/BankName;", "getBankName", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/BankName;", "Ljava/lang/String;", "getMethodId", "()Ljava/lang/String;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/PaymentSystemName;", "getPaymentSystem", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/PaymentSystemName;", "getSuffix", "Companion", "xfq0", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedCardMethod implements Parcelable {
    private final BankName bankName;
    private final String methodId;
    private final PaymentSystemName paymentSystem;
    private final String suffix;
    public static final xfq0 Companion = new xfq0();
    public static final Parcelable.Creator<SelectedCardMethod> CREATOR = new Creator();

    public SelectedCardMethod(BankName bankName, String str, PaymentSystemName paymentSystemName, String str2) {
        this.bankName = bankName;
        this.methodId = str;
        this.paymentSystem = paymentSystemName;
        this.suffix = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BankName getBankName() {
        return this.bankName;
    }

    public final String getMethodId() {
        return this.methodId;
    }

    public final PaymentSystemName getPaymentSystem() {
        return this.paymentSystem;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.bankName.writeToParcel(dest, flags);
        dest.writeString(this.methodId);
        this.paymentSystem.writeToParcel(dest, flags);
        dest.writeString(this.suffix);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedCardMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedCardMethod createFromParcel(Parcel parcel) {
            return new SelectedCardMethod(BankName.CREATOR.createFromParcel(parcel), parcel.readString(), PaymentSystemName.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedCardMethod[] newArray(int i) {
            return new SelectedCardMethod[i];
        }
    }
}
