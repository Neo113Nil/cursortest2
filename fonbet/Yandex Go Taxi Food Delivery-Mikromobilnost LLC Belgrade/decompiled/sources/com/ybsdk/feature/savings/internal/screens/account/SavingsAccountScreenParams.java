package com.ybsdk.feature.savings.internal.screens.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/SavingsAccountScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "agreementId", "Lcom/ybsdk/core/design/theme/ThemedParams;", "backgroundColorParams", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/design/theme/ThemedParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/design/theme/ThemedParams;", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/design/theme/ThemedParams;)Lcom/ybsdk/feature/savings/internal/screens/account/SavingsAccountScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/core/design/theme/ThemedParams;", "getBackgroundColorParams", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountScreenParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsAccountScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final ThemedParams<String> backgroundColorParams;

    public SavingsAccountScreenParams(String str, ThemedParams<String> themedParams) {
        this.agreementId = str;
        this.backgroundColorParams = themedParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsAccountScreenParams copy$default(SavingsAccountScreenParams savingsAccountScreenParams, String str, ThemedParams themedParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountScreenParams.agreementId;
        }
        if ((i & 2) != 0) {
            themedParams = savingsAccountScreenParams.backgroundColorParams;
        }
        return savingsAccountScreenParams.copy(str, themedParams);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ThemedParams<String> component2() {
        return this.backgroundColorParams;
    }

    public final SavingsAccountScreenParams copy(String agreementId, ThemedParams<String> backgroundColorParams) {
        return new SavingsAccountScreenParams(agreementId, backgroundColorParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountScreenParams)) {
            return false;
        }
        SavingsAccountScreenParams savingsAccountScreenParams = (SavingsAccountScreenParams) other;
        return jl40.l(this.agreementId, savingsAccountScreenParams.agreementId) && jl40.l(this.backgroundColorParams, savingsAccountScreenParams.backgroundColorParams);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ThemedParams<String> getBackgroundColorParams() {
        return this.backgroundColorParams;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        ThemedParams<String> themedParams = this.backgroundColorParams;
        return hashCode + (themedParams == null ? 0 : themedParams.hashCode());
    }

    public String toString() {
        return "SavingsAccountScreenParams(agreementId=" + this.agreementId + ", backgroundColorParams=" + this.backgroundColorParams + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeParcelable(this.backgroundColorParams, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountScreenParams createFromParcel(Parcel parcel) {
            return new SavingsAccountScreenParams(parcel.readString(), (ThemedParams) parcel.readParcelable(SavingsAccountScreenParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountScreenParams[] newArray(int i) {
            return new SavingsAccountScreenParams[i];
        }
    }
}
