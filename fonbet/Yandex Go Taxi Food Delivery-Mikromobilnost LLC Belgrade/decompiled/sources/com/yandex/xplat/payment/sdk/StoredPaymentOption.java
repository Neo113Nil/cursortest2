package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gfa0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/xplat/payment/sdk/StoredPaymentOption;", "Lcom/yandex/xplat/payment/sdk/PaymentOption;", "Lcom/yandex/xplat/payment/sdk/PaymentMethod;", "method", "<init>", "(Lcom/yandex/xplat/payment/sdk/PaymentMethod;)V", "", "getId", "()Ljava/lang/String;", "T", "Lgfa0;", "visitor", "accept", "(Lgfa0;)Ljava/lang/Object;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/xplat/payment/sdk/PaymentMethod;", "getMethod", "()Lcom/yandex/xplat/payment/sdk/PaymentMethod;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class StoredPaymentOption implements PaymentOption {
    public static final Parcelable.Creator<StoredPaymentOption> CREATOR = new Creator();
    private final PaymentMethod method;

    public StoredPaymentOption(PaymentMethod paymentMethod) {
        this.method = paymentMethod;
    }

    @Override // com.yandex.xplat.payment.sdk.PaymentOption
    public <T> T accept(gfa0 visitor) {
        return (T) visitor.g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.xplat.payment.sdk.PaymentOption
    public String getId() {
        return this.method.getIdentifier();
    }

    public final PaymentMethod getMethod() {
        return this.method;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.method, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoredPaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoredPaymentOption createFromParcel(Parcel parcel) {
            return new StoredPaymentOption((PaymentMethod) parcel.readParcelable(StoredPaymentOption.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoredPaymentOption[] newArray(int i) {
            return new StoredPaymentOption[i];
        }
    }
}
