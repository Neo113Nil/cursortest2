package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;", "Landroid/os/Parcelable;", "", "merchantId", "paymentDataRequest", "verificationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchantId", "getPaymentDataRequest", "getVerificationToken", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GooglePayParams implements Parcelable {
    public static final Parcelable.Creator<GooglePayParams> CREATOR = new Creator();
    private final String merchantId;
    private final String paymentDataRequest;
    private final String verificationToken;

    public GooglePayParams(String str, String str2, String str3) {
        this.merchantId = str;
        this.paymentDataRequest = str2;
        this.verificationToken = str3;
    }

    public static /* synthetic */ GooglePayParams copy$default(GooglePayParams googlePayParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayParams.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = googlePayParams.paymentDataRequest;
        }
        if ((i & 4) != 0) {
            str3 = googlePayParams.verificationToken;
        }
        return googlePayParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentDataRequest() {
        return this.paymentDataRequest;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public final GooglePayParams copy(String merchantId, String paymentDataRequest, String verificationToken) {
        return new GooglePayParams(merchantId, paymentDataRequest, verificationToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayParams)) {
            return false;
        }
        GooglePayParams googlePayParams = (GooglePayParams) other;
        return jl40.l(this.merchantId, googlePayParams.merchantId) && jl40.l(this.paymentDataRequest, googlePayParams.paymentDataRequest) && jl40.l(this.verificationToken, googlePayParams.verificationToken);
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getPaymentDataRequest() {
        return this.paymentDataRequest;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        int b = unr0.b(this.merchantId.hashCode() * 31, 31, this.paymentDataRequest);
        String str = this.verificationToken;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.merchantId;
        String str2 = this.paymentDataRequest;
        return oyr.t(b64.v("GooglePayParams(merchantId=", str, ", paymentDataRequest=", str2, ", verificationToken="), this.verificationToken, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.merchantId);
        dest.writeString(this.paymentDataRequest);
        dest.writeString(this.verificationToken);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayParams createFromParcel(Parcel parcel) {
            return new GooglePayParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayParams[] newArray(int i) {
            return new GooglePayParams[i];
        }
    }
}
