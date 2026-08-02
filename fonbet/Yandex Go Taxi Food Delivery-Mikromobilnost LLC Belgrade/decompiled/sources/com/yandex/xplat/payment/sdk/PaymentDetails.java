package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentDetails;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "Lcom/yandex/xplat/payment/sdk/AvailableMethods;", "methods", "Lcom/yandex/xplat/payment/sdk/PaymentSettings;", "settings", "<init>", "(Lcom/yandex/xplat/payment/sdk/AvailableMethods;Lcom/yandex/xplat/payment/sdk/PaymentSettings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/xplat/payment/sdk/AvailableMethods;", "getMethods", "()Lcom/yandex/xplat/payment/sdk/AvailableMethods;", "Lcom/yandex/xplat/payment/sdk/PaymentSettings;", "getSettings", "()Lcom/yandex/xplat/payment/sdk/PaymentSettings;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymentDetails implements Parcelable {
    public static final Parcelable.Creator<PaymentDetails> CREATOR = new Creator();
    private final AvailableMethods methods;
    private final PaymentSettings settings;

    public PaymentDetails(AvailableMethods availableMethods, PaymentSettings paymentSettings) {
        this.methods = availableMethods;
        this.settings = paymentSettings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AvailableMethods getMethods() {
        return this.methods;
    }

    public final PaymentSettings getSettings() {
        return this.settings;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.methods, flags);
        dest.writeParcelable(this.settings, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetails createFromParcel(Parcel parcel) {
            return new PaymentDetails((AvailableMethods) parcel.readParcelable(PaymentDetails.class.getClassLoader()), (PaymentSettings) parcel.readParcelable(PaymentDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetails[] newArray(int i) {
            return new PaymentDetails[i];
        }
    }
}
