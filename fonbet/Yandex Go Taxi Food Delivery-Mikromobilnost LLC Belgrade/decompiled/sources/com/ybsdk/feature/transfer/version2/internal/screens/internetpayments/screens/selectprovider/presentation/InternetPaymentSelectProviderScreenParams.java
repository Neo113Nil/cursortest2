package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "withResult", "", "agreementId", "<init>", "(ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWithResult", "Ljava/lang/String;", "getAgreementId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetPaymentSelectProviderScreenParams implements ScreenParams {
    public static final Parcelable.Creator<InternetPaymentSelectProviderScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final boolean withResult;

    public InternetPaymentSelectProviderScreenParams(boolean z, String str) {
        this.withResult = z;
        this.agreementId = str;
    }

    public static /* synthetic */ InternetPaymentSelectProviderScreenParams copy$default(InternetPaymentSelectProviderScreenParams internetPaymentSelectProviderScreenParams, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = internetPaymentSelectProviderScreenParams.withResult;
        }
        if ((i & 2) != 0) {
            str = internetPaymentSelectProviderScreenParams.agreementId;
        }
        return internetPaymentSelectProviderScreenParams.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWithResult() {
        return this.withResult;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final InternetPaymentSelectProviderScreenParams copy(boolean withResult, String agreementId) {
        return new InternetPaymentSelectProviderScreenParams(withResult, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetPaymentSelectProviderScreenParams)) {
            return false;
        }
        InternetPaymentSelectProviderScreenParams internetPaymentSelectProviderScreenParams = (InternetPaymentSelectProviderScreenParams) other;
        return this.withResult == internetPaymentSelectProviderScreenParams.withResult && jl40.l(this.agreementId, internetPaymentSelectProviderScreenParams.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final boolean getWithResult() {
        return this.withResult;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.withResult) * 31;
        String str = this.agreementId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return xvz.m("InternetPaymentSelectProviderScreenParams(withResult=", this.withResult, ", agreementId=", this.agreementId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.withResult ? 1 : 0);
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InternetPaymentSelectProviderScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetPaymentSelectProviderScreenParams createFromParcel(Parcel parcel) {
            return new InternetPaymentSelectProviderScreenParams(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetPaymentSelectProviderScreenParams[] newArray(int i) {
            return new InternetPaymentSelectProviderScreenParams[i];
        }
    }
}
