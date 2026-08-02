package com.yandex.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.jl40;
import defpackage.kju0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/pay/YPayResult;", "Landroid/os/Parcelable;", "Success", "Failure", "Cancelled", "Lcom/yandex/pay/YPayResult$Cancelled;", "Lcom/yandex/pay/YPayResult$Failure;", "Lcom/yandex/pay/YPayResult$Success;", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface YPayResult extends Parcelable {

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/pay/YPayResult$Cancelled;", "Lcom/yandex/pay/YPayResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cancelled implements YPayResult {
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

        private Cancelled() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Cancelled);
        }

        public int hashCode() {
            return 2143313093;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancelled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i) {
                return new Cancelled[i];
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/pay/YPayResult$Failure;", "Lcom/yandex/pay/YPayResult;", "", "errorMsg", "Lcom/yandex/pay/Metadata;", kju0.j, "<init>", "(Ljava/lang/String;Lcom/yandex/pay/Metadata;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/pay/Metadata;", "copy", "(Ljava/lang/String;Lcom/yandex/pay/Metadata;)Lcom/yandex/pay/YPayResult$Failure;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMsg", "Lcom/yandex/pay/Metadata;", "getMetadata", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure implements YPayResult {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final String errorMsg;
        private final Metadata metadata;

        public Failure(String str, Metadata metadata) {
            this.errorMsg = str;
            this.metadata = metadata;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, Metadata metadata, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorMsg;
            }
            if ((i & 2) != 0) {
                metadata = failure.metadata;
            }
            return failure.copy(str, metadata);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* renamed from: component2, reason: from getter */
        public final Metadata getMetadata() {
            return this.metadata;
        }

        public final Failure copy(String errorMsg, Metadata metadata) {
            return new Failure(errorMsg, metadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return jl40.l(this.errorMsg, failure.errorMsg) && jl40.l(this.metadata, failure.metadata);
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final Metadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            int hashCode = this.errorMsg.hashCode() * 31;
            Metadata metadata = this.metadata;
            return hashCode + (metadata == null ? 0 : metadata.hashCode());
        }

        public String toString() {
            return "Failure(errorMsg=" + this.errorMsg + ", metadata=" + this.metadata + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.errorMsg);
            Metadata metadata = this.metadata;
            if (metadata == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                metadata.writeToParcel(dest, flags);
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure(parcel.readString(), parcel.readInt() == 0 ? null : Metadata.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/pay/YPayResult$Success;", "Lcom/yandex/pay/YPayResult;", "Lcom/yandex/pay/OrderId;", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lcom/yandex/pay/Metadata;", kju0.j, "<init>", "(Lcom/yandex/pay/OrderId;Lcom/yandex/pay/Metadata;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/pay/OrderId;", "component2", "()Lcom/yandex/pay/Metadata;", "copy", "(Lcom/yandex/pay/OrderId;Lcom/yandex/pay/Metadata;)Lcom/yandex/pay/YPayResult$Success;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/pay/OrderId;", "getOrderId", "Lcom/yandex/pay/Metadata;", "getMetadata", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements YPayResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final Metadata metadata;
        private final OrderId orderId;

        public Success(OrderId orderId, Metadata metadata) {
            this.orderId = orderId;
            this.metadata = metadata;
        }

        public static /* synthetic */ Success copy$default(Success success, OrderId orderId, Metadata metadata, int i, Object obj) {
            if ((i & 1) != 0) {
                orderId = success.orderId;
            }
            if ((i & 2) != 0) {
                metadata = success.metadata;
            }
            return success.copy(orderId, metadata);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderId getOrderId() {
            return this.orderId;
        }

        /* renamed from: component2, reason: from getter */
        public final Metadata getMetadata() {
            return this.metadata;
        }

        public final Success copy(OrderId orderId, Metadata metadata) {
            return new Success(orderId, metadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.orderId, success.orderId) && jl40.l(this.metadata, success.metadata);
        }

        public final Metadata getMetadata() {
            return this.metadata;
        }

        public final OrderId getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            int hashCode = this.orderId.hashCode() * 31;
            Metadata metadata = this.metadata;
            return hashCode + (metadata == null ? 0 : metadata.hashCode());
        }

        public String toString() {
            return "Success(orderId=" + this.orderId + ", metadata=" + this.metadata + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.orderId.writeToParcel(dest, flags);
            Metadata metadata = this.metadata;
            if (metadata == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                metadata.writeToParcel(dest, flags);
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(OrderId.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Metadata.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
