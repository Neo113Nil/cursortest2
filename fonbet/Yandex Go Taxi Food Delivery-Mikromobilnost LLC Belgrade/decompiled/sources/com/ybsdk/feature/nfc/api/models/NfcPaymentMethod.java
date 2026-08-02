package com.ybsdk.feature.nfc.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "Lcom/ybsdk/core/navigation/ScreenParams;", "methodType", "", "getMethodType", "()Ljava/lang/String;", "Product", "External", "Yellow", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$External;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Product;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Yellow;", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NfcPaymentMethod extends ScreenParams {
    String getMethodType();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$External;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "", "memberId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$External;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemberId", "getMethodType", "methodType", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class External implements NfcPaymentMethod {
        public static final Parcelable.Creator<External> CREATOR = new Creator();
        private final String memberId;

        public External(String str) {
            this.memberId = str;
        }

        public static /* synthetic */ External copy$default(External external, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = external.memberId;
            }
            return external.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final External copy(String memberId) {
            return new External(memberId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof External) && jl40.l(this.memberId, ((External) other).memberId);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        @Override // com.ybsdk.feature.nfc.api.models.NfcPaymentMethod
        public String getMethodType() {
            return this.memberId;
        }

        public int hashCode() {
            return this.memberId.hashCode();
        }

        public String toString() {
            return oyr.p("External(memberId=", this.memberId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.memberId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<External> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External createFromParcel(Parcel parcel) {
                return new External(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External[] newArray(int i) {
                return new External[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Product;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "Lcom/ybsdk/feature/nfc/api/models/NfcProductType;", "nfcProductType", "<init>", "(Lcom/ybsdk/feature/nfc/api/models/NfcProductType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/nfc/api/models/NfcProductType;", "copy", "(Lcom/ybsdk/feature/nfc/api/models/NfcProductType;)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Product;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/nfc/api/models/NfcProductType;", "getNfcProductType", "getMethodType", "methodType", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product implements NfcPaymentMethod {
        public static final Parcelable.Creator<Product> CREATOR = new Creator();
        private final NfcProductType nfcProductType;

        public Product(NfcProductType nfcProductType) {
            this.nfcProductType = nfcProductType;
        }

        public static /* synthetic */ Product copy$default(Product product, NfcProductType nfcProductType, int i, Object obj) {
            if ((i & 1) != 0) {
                nfcProductType = product.nfcProductType;
            }
            return product.copy(nfcProductType);
        }

        /* renamed from: component1, reason: from getter */
        public final NfcProductType getNfcProductType() {
            return this.nfcProductType;
        }

        public final Product copy(NfcProductType nfcProductType) {
            return new Product(nfcProductType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Product) && this.nfcProductType == ((Product) other).nfcProductType;
        }

        @Override // com.ybsdk.feature.nfc.api.models.NfcPaymentMethod
        public String getMethodType() {
            return this.nfcProductType.name();
        }

        public final NfcProductType getNfcProductType() {
            return this.nfcProductType;
        }

        public int hashCode() {
            return this.nfcProductType.hashCode();
        }

        public String toString() {
            return "Product(nfcProductType=" + this.nfcProductType + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.nfcProductType.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Product> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Product createFromParcel(Parcel parcel) {
                return new Product(NfcProductType.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Product[] newArray(int i) {
                return new Product[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Yellow;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "", "memberId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod$Yellow;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemberId", "getMethodType", "methodType", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Yellow implements NfcPaymentMethod {
        public static final Parcelable.Creator<Yellow> CREATOR = new Creator();
        private final String memberId;

        public Yellow(String str) {
            this.memberId = str;
        }

        public static /* synthetic */ Yellow copy$default(Yellow yellow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yellow.memberId;
            }
            return yellow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final Yellow copy(String memberId) {
            return new Yellow(memberId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Yellow) && jl40.l(this.memberId, ((Yellow) other).memberId);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        @Override // com.ybsdk.feature.nfc.api.models.NfcPaymentMethod
        public String getMethodType() {
            return this.memberId;
        }

        public int hashCode() {
            return this.memberId.hashCode();
        }

        public String toString() {
            return oyr.p("Yellow(memberId=", this.memberId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.memberId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Yellow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Yellow createFromParcel(Parcel parcel) {
                return new Yellow(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Yellow[] newArray(int i) {
                return new Yellow[i];
            }
        }
    }
}
