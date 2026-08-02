package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/GooglePayData;", "Landroid/os/Parcelable;", "<init>", "()V", "Gateway", "Direct", "Lcom/yandex/payment/sdk/core/data/GooglePayData$Direct;", "Lcom/yandex/payment/sdk/core/data/GooglePayData$Gateway;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GooglePayData implements Parcelable {
    public /* synthetic */ GooglePayData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/payment/sdk/core/data/GooglePayData$Direct;", "Lcom/yandex/payment/sdk/core/data/GooglePayData;", "", "publicKey", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/GooglePayData$Direct;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPublicKey", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Direct extends GooglePayData {
        public static final Parcelable.Creator<Direct> CREATOR = new Creator();
        private final String publicKey;

        public Direct(String str) {
            super(null);
            this.publicKey = str;
        }

        public static /* synthetic */ Direct copy$default(Direct direct, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = direct.publicKey;
            }
            return direct.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        public final Direct copy(String publicKey) {
            return new Direct(publicKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Direct) && jl40.l(this.publicKey, ((Direct) other).publicKey);
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public int hashCode() {
            return this.publicKey.hashCode();
        }

        public String toString() {
            return oyr.p("Direct(publicKey=", this.publicKey, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.publicKey);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Direct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Direct createFromParcel(Parcel parcel) {
                return new Direct(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Direct[] newArray(int i) {
                return new Direct[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/payment/sdk/core/data/GooglePayData$Gateway;", "Lcom/yandex/payment/sdk/core/data/GooglePayData;", "", "gatewayId", "gatewayMerchantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/GooglePayData$Gateway;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGatewayId", "getGatewayMerchantId", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gateway extends GooglePayData {
        public static final Parcelable.Creator<Gateway> CREATOR = new Creator();
        private final String gatewayId;
        private final String gatewayMerchantId;

        public Gateway(String str, String str2) {
            super(null);
            this.gatewayId = str;
            this.gatewayMerchantId = str2;
        }

        public static /* synthetic */ Gateway copy$default(Gateway gateway, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gateway.gatewayId;
            }
            if ((i & 2) != 0) {
                str2 = gateway.gatewayMerchantId;
            }
            return gateway.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGatewayId() {
            return this.gatewayId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGatewayMerchantId() {
            return this.gatewayMerchantId;
        }

        public final Gateway copy(String gatewayId, String gatewayMerchantId) {
            return new Gateway(gatewayId, gatewayMerchantId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gateway)) {
                return false;
            }
            Gateway gateway = (Gateway) other;
            return jl40.l(this.gatewayId, gateway.gatewayId) && jl40.l(this.gatewayMerchantId, gateway.gatewayMerchantId);
        }

        public final String getGatewayId() {
            return this.gatewayId;
        }

        public final String getGatewayMerchantId() {
            return this.gatewayMerchantId;
        }

        public int hashCode() {
            return this.gatewayMerchantId.hashCode() + (this.gatewayId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("Gateway(gatewayId=", this.gatewayId, ", gatewayMerchantId=", this.gatewayMerchantId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.gatewayId);
            dest.writeString(this.gatewayMerchantId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gateway> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gateway createFromParcel(Parcel parcel) {
                return new Gateway(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gateway[] newArray(int i) {
                return new Gateway[i];
            }
        }
    }

    private GooglePayData() {
    }
}
