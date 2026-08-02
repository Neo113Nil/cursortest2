package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "providerId", "", "withResult", "personalAccount", "agreementId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProviderId", "Z", "getWithResult", "getPersonalAccount", "getAgreementId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetPaymentFormInputScreenParams implements ScreenParams {
    public static final Parcelable.Creator<InternetPaymentFormInputScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final String personalAccount;
    private final String providerId;
    private final boolean withResult;

    public InternetPaymentFormInputScreenParams(String str, boolean z, String str2, String str3) {
        this.providerId = str;
        this.withResult = z;
        this.personalAccount = str2;
        this.agreementId = str3;
    }

    public static /* synthetic */ InternetPaymentFormInputScreenParams copy$default(InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internetPaymentFormInputScreenParams.providerId;
        }
        if ((i & 2) != 0) {
            z = internetPaymentFormInputScreenParams.withResult;
        }
        if ((i & 4) != 0) {
            str2 = internetPaymentFormInputScreenParams.personalAccount;
        }
        if ((i & 8) != 0) {
            str3 = internetPaymentFormInputScreenParams.agreementId;
        }
        return internetPaymentFormInputScreenParams.copy(str, z, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWithResult() {
        return this.withResult;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPersonalAccount() {
        return this.personalAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final InternetPaymentFormInputScreenParams copy(String providerId, boolean withResult, String personalAccount, String agreementId) {
        return new InternetPaymentFormInputScreenParams(providerId, withResult, personalAccount, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetPaymentFormInputScreenParams)) {
            return false;
        }
        InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams = (InternetPaymentFormInputScreenParams) other;
        return jl40.l(this.providerId, internetPaymentFormInputScreenParams.providerId) && this.withResult == internetPaymentFormInputScreenParams.withResult && jl40.l(this.personalAccount, internetPaymentFormInputScreenParams.personalAccount) && jl40.l(this.agreementId, internetPaymentFormInputScreenParams.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getPersonalAccount() {
        return this.personalAccount;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final boolean getWithResult() {
        return this.withResult;
    }

    public int hashCode() {
        int e = unr0.e(this.providerId.hashCode() * 31, 31, this.withResult);
        String str = this.personalAccount;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agreementId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.providerId;
        boolean z = this.withResult;
        return g8e.r(oo31.l("InternetPaymentFormInputScreenParams(providerId=", str, ", withResult=", ", personalAccount=", z), this.personalAccount, ", agreementId=", this.agreementId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.providerId);
        dest.writeInt(this.withResult ? 1 : 0);
        dest.writeString(this.personalAccount);
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InternetPaymentFormInputScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetPaymentFormInputScreenParams createFromParcel(Parcel parcel) {
            return new InternetPaymentFormInputScreenParams(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetPaymentFormInputScreenParams[] newArray(int i) {
            return new InternetPaymentFormInputScreenParams[i];
        }
    }
}
