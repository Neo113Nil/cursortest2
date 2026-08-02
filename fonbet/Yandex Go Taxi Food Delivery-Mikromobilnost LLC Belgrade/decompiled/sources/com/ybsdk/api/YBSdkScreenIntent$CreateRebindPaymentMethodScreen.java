package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vh51;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$CreateRebindPaymentMethodScreen", "Lvh51;", "Landroid/os/Parcelable;", "", "paymentMethodId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "Lcom/ybsdk/api/YBSdkScreenIntent$CreateRebindPaymentMethodScreen;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/api/YBSdkScreenIntent$CreateRebindPaymentMethodScreen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentMethodId", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$CreateRebindPaymentMethodScreen extends vh51 implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$CreateRebindPaymentMethodScreen> CREATOR = new Creator();
    private final String paymentMethodId;

    public YBSdkScreenIntent$CreateRebindPaymentMethodScreen(String str) {
        this.paymentMethodId = str;
    }

    public static /* synthetic */ YBSdkScreenIntent$CreateRebindPaymentMethodScreen copy$default(YBSdkScreenIntent$CreateRebindPaymentMethodScreen yBSdkScreenIntent$CreateRebindPaymentMethodScreen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yBSdkScreenIntent$CreateRebindPaymentMethodScreen.paymentMethodId;
        }
        return yBSdkScreenIntent$CreateRebindPaymentMethodScreen.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final YBSdkScreenIntent$CreateRebindPaymentMethodScreen copy(String paymentMethodId) {
        return new YBSdkScreenIntent$CreateRebindPaymentMethodScreen(paymentMethodId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YBSdkScreenIntent$CreateRebindPaymentMethodScreen) && jl40.l(this.paymentMethodId, ((YBSdkScreenIntent$CreateRebindPaymentMethodScreen) other).paymentMethodId);
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public int hashCode() {
        return this.paymentMethodId.hashCode();
    }

    public String toString() {
        return oyr.p("CreateRebindPaymentMethodScreen(paymentMethodId=", this.paymentMethodId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.paymentMethodId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$CreateRebindPaymentMethodScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$CreateRebindPaymentMethodScreen createFromParcel(Parcel parcel) {
            return new YBSdkScreenIntent$CreateRebindPaymentMethodScreen(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$CreateRebindPaymentMethodScreen[] newArray(int i) {
            return new YBSdkScreenIntent$CreateRebindPaymentMethodScreen[i];
        }
    }
}
