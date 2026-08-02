package com.ybsdk.feature.savings.internal.screens.fund.creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/fund/creation/FundCreationParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "fundId", "preselectedAgreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/savings/internal/screens/fund/creation/FundCreationParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFundId", "getPreselectedAgreementId", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundCreationParams implements ScreenParams {
    public static final Parcelable.Creator<FundCreationParams> CREATOR = new Creator();
    private final String fundId;
    private final String preselectedAgreementId;

    public FundCreationParams(String str, String str2) {
        this.fundId = str;
        this.preselectedAgreementId = str2;
    }

    public static /* synthetic */ FundCreationParams copy$default(FundCreationParams fundCreationParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundCreationParams.fundId;
        }
        if ((i & 2) != 0) {
            str2 = fundCreationParams.preselectedAgreementId;
        }
        return fundCreationParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFundId() {
        return this.fundId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreselectedAgreementId() {
        return this.preselectedAgreementId;
    }

    public final FundCreationParams copy(String fundId, String preselectedAgreementId) {
        return new FundCreationParams(fundId, preselectedAgreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundCreationParams)) {
            return false;
        }
        FundCreationParams fundCreationParams = (FundCreationParams) other;
        return jl40.l(this.fundId, fundCreationParams.fundId) && jl40.l(this.preselectedAgreementId, fundCreationParams.preselectedAgreementId);
    }

    public final String getFundId() {
        return this.fundId;
    }

    public final String getPreselectedAgreementId() {
        return this.preselectedAgreementId;
    }

    public int hashCode() {
        int hashCode = this.fundId.hashCode() * 31;
        String str = this.preselectedAgreementId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("FundCreationParams(fundId=", this.fundId, ", preselectedAgreementId=", this.preselectedAgreementId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fundId);
        dest.writeString(this.preselectedAgreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FundCreationParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundCreationParams createFromParcel(Parcel parcel) {
            return new FundCreationParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundCreationParams[] newArray(int i) {
            return new FundCreationParams[i];
        }
    }
}
