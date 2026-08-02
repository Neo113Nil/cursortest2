package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactInputScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "agreementId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactInputScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobilePaymentSelectContactInputScreenParams implements ScreenParams {
    public static final Parcelable.Creator<MobilePaymentSelectContactInputScreenParams> CREATOR = new Creator();
    private final String agreementId;

    public MobilePaymentSelectContactInputScreenParams(String str) {
        this.agreementId = str;
    }

    public static /* synthetic */ MobilePaymentSelectContactInputScreenParams copy$default(MobilePaymentSelectContactInputScreenParams mobilePaymentSelectContactInputScreenParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobilePaymentSelectContactInputScreenParams.agreementId;
        }
        return mobilePaymentSelectContactInputScreenParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final MobilePaymentSelectContactInputScreenParams copy(String agreementId) {
        return new MobilePaymentSelectContactInputScreenParams(agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MobilePaymentSelectContactInputScreenParams) && jl40.l(this.agreementId, ((MobilePaymentSelectContactInputScreenParams) other).agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public int hashCode() {
        String str = this.agreementId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("MobilePaymentSelectContactInputScreenParams(agreementId=", this.agreementId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MobilePaymentSelectContactInputScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobilePaymentSelectContactInputScreenParams createFromParcel(Parcel parcel) {
            return new MobilePaymentSelectContactInputScreenParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobilePaymentSelectContactInputScreenParams[] newArray(int i) {
            return new MobilePaymentSelectContactInputScreenParams[i];
        }
    }
}
