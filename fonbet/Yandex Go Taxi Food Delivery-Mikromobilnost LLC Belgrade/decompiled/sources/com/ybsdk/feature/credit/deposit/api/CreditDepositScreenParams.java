package com.ybsdk.feature.credit.deposit.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/credit/deposit/api/CreditDepositScreenParams;", "Lcom/ybsdk/feature/credit/deposit/api/CreditScreenParams;", "", "agreementId", "scenario", "creditType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/credit/deposit/api/CreditDepositScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getScenario", "getCreditType", "feature-credit-deposit-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositScreenParams extends CreditScreenParams {
    public static final Parcelable.Creator<CreditDepositScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final String creditType;
    private final String scenario;

    public CreditDepositScreenParams(String str, String str2, String str3) {
        super(null);
        this.agreementId = str;
        this.scenario = str2;
        this.creditType = str3;
    }

    public static /* synthetic */ CreditDepositScreenParams copy$default(CreditDepositScreenParams creditDepositScreenParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositScreenParams.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = creditDepositScreenParams.scenario;
        }
        if ((i & 4) != 0) {
            str3 = creditDepositScreenParams.creditType;
        }
        return creditDepositScreenParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreditType() {
        return this.creditType;
    }

    public final CreditDepositScreenParams copy(String agreementId, String scenario, String creditType) {
        return new CreditDepositScreenParams(agreementId, scenario, creditType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositScreenParams)) {
            return false;
        }
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) other;
        return jl40.l(this.agreementId, creditDepositScreenParams.agreementId) && jl40.l(this.scenario, creditDepositScreenParams.scenario) && jl40.l(this.creditType, creditDepositScreenParams.creditType);
    }

    @Override // com.ybsdk.feature.credit.deposit.api.CreditScreenParams
    public String getAgreementId() {
        return this.agreementId;
    }

    public final String getCreditType() {
        return this.creditType;
    }

    @Override // com.ybsdk.feature.credit.deposit.api.CreditScreenParams
    public String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.scenario;
        return this.creditType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.scenario;
        return oyr.t(b64.v("CreditDepositScreenParams(agreementId=", str, ", scenario=", str2, ", creditType="), this.creditType, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.scenario);
        dest.writeString(this.creditType);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditDepositScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditDepositScreenParams createFromParcel(Parcel parcel) {
            return new CreditDepositScreenParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditDepositScreenParams[] newArray(int i) {
            return new CreditDepositScreenParams[i];
        }
    }
}
