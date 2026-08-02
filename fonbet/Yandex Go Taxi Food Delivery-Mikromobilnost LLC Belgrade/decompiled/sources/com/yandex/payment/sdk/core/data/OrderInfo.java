package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/payment/sdk/core/data/OrderInfo;", "Landroid/os/Parcelable;", "", "orderTag", "Lcom/yandex/payment/sdk/core/data/OrderDetails;", "orderDetails", "<init>", "(Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/OrderDetails;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/payment/sdk/core/data/OrderDetails;", "copy", "(Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/OrderDetails;)Lcom/yandex/payment/sdk/core/data/OrderInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderTag", "Lcom/yandex/payment/sdk/core/data/OrderDetails;", "getOrderDetails", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OrderInfo implements Parcelable {
    public static final Parcelable.Creator<OrderInfo> CREATOR = new Creator();
    private final OrderDetails orderDetails;
    private final String orderTag;

    public OrderInfo(String str, OrderDetails orderDetails) {
        this.orderTag = str;
        this.orderDetails = orderDetails;
    }

    public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, String str, OrderDetails orderDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderInfo.orderTag;
        }
        if ((i & 2) != 0) {
            orderDetails = orderInfo.orderDetails;
        }
        return orderInfo.copy(str, orderDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderTag() {
        return this.orderTag;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final OrderInfo copy(String orderTag, OrderDetails orderDetails) {
        return new OrderInfo(orderTag, orderDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) other;
        return jl40.l(this.orderTag, orderInfo.orderTag) && jl40.l(this.orderDetails, orderInfo.orderDetails);
    }

    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final String getOrderTag() {
        return this.orderTag;
    }

    public int hashCode() {
        String str = this.orderTag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderDetails orderDetails = this.orderDetails;
        return hashCode + (orderDetails != null ? orderDetails.hashCode() : 0);
    }

    public String toString() {
        return "OrderInfo(orderTag=" + this.orderTag + ", orderDetails=" + this.orderDetails + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.orderTag);
        dest.writeParcelable(this.orderDetails, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderInfo createFromParcel(Parcel parcel) {
            return new OrderInfo(parcel.readString(), (OrderDetails) parcel.readParcelable(OrderInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderInfo[] newArray(int i) {
            return new OrderInfo[i];
        }
    }
}
