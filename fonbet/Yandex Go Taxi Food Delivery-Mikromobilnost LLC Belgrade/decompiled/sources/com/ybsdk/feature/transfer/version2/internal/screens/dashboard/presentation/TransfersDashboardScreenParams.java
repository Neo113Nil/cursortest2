package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0014\u0010\u0017\u001a\u00060\u0002j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\u0007\u001a\u00060\u0002j\u0002`\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0014R\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "origin", "agreementId", "autopaymentId", "Lcom/ybsdk/feature/dashboard/api/DashboardV3ProductId;", "tokenizationProductId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrigin", "getAgreementId", "getAutopaymentId", "getTokenizationProductId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransfersDashboardScreenParams implements ScreenParams {
    public static final Parcelable.Creator<TransfersDashboardScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final String autopaymentId;
    private final String origin;
    private final String tokenizationProductId;

    public TransfersDashboardScreenParams(String str, String str2, String str3, String str4) {
        this.origin = str;
        this.agreementId = str2;
        this.autopaymentId = str3;
        this.tokenizationProductId = str4;
    }

    public static /* synthetic */ TransfersDashboardScreenParams copy$default(TransfersDashboardScreenParams transfersDashboardScreenParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transfersDashboardScreenParams.origin;
        }
        if ((i & 2) != 0) {
            str2 = transfersDashboardScreenParams.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = transfersDashboardScreenParams.autopaymentId;
        }
        if ((i & 8) != 0) {
            str4 = transfersDashboardScreenParams.tokenizationProductId;
        }
        return transfersDashboardScreenParams.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTokenizationProductId() {
        return this.tokenizationProductId;
    }

    public final TransfersDashboardScreenParams copy(String origin, String agreementId, String autopaymentId, String tokenizationProductId) {
        return new TransfersDashboardScreenParams(origin, agreementId, autopaymentId, tokenizationProductId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDashboardScreenParams)) {
            return false;
        }
        TransfersDashboardScreenParams transfersDashboardScreenParams = (TransfersDashboardScreenParams) other;
        return jl40.l(this.origin, transfersDashboardScreenParams.origin) && jl40.l(this.agreementId, transfersDashboardScreenParams.agreementId) && jl40.l(this.autopaymentId, transfersDashboardScreenParams.autopaymentId) && jl40.l(this.tokenizationProductId, transfersDashboardScreenParams.tokenizationProductId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getTokenizationProductId() {
        return this.tokenizationProductId;
    }

    public int hashCode() {
        int hashCode = this.origin.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autopaymentId;
        return this.tokenizationProductId.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.origin;
        String str2 = this.agreementId;
        return g8e.r(b64.v("TransfersDashboardScreenParams(origin=", str, ", agreementId=", str2, ", autopaymentId="), this.autopaymentId, ", tokenizationProductId=", this.tokenizationProductId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.origin);
        dest.writeString(this.agreementId);
        dest.writeString(this.autopaymentId);
        dest.writeString(this.tokenizationProductId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransfersDashboardScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDashboardScreenParams createFromParcel(Parcel parcel) {
            return new TransfersDashboardScreenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDashboardScreenParams[] newArray(int i) {
            return new TransfersDashboardScreenParams[i];
        }
    }
}
