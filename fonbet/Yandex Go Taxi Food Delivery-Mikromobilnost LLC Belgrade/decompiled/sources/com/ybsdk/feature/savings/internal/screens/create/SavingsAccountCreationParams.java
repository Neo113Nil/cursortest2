package com.ybsdk.feature.savings.internal.screens.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/create/SavingsAccountCreationParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "tariffId", "sourceAgreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)Lcom/ybsdk/feature/savings/internal/screens/create/SavingsAccountCreationParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTariffId", "getSourceAgreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getAmount", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCreationParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsAccountCreationParams> CREATOR = new Creator();
    private final MoneyEntity amount;
    private final String sourceAgreementId;
    private final String tariffId;

    public SavingsAccountCreationParams(String str, String str2, MoneyEntity moneyEntity) {
        this.tariffId = str;
        this.sourceAgreementId = str2;
        this.amount = moneyEntity;
    }

    public static /* synthetic */ SavingsAccountCreationParams copy$default(SavingsAccountCreationParams savingsAccountCreationParams, String str, String str2, MoneyEntity moneyEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountCreationParams.tariffId;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountCreationParams.sourceAgreementId;
        }
        if ((i & 4) != 0) {
            moneyEntity = savingsAccountCreationParams.amount;
        }
        return savingsAccountCreationParams.copy(str, str2, moneyEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTariffId() {
        return this.tariffId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final MoneyEntity getAmount() {
        return this.amount;
    }

    public final SavingsAccountCreationParams copy(String tariffId, String sourceAgreementId, MoneyEntity amount) {
        return new SavingsAccountCreationParams(tariffId, sourceAgreementId, amount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountCreationParams)) {
            return false;
        }
        SavingsAccountCreationParams savingsAccountCreationParams = (SavingsAccountCreationParams) other;
        return jl40.l(this.tariffId, savingsAccountCreationParams.tariffId) && jl40.l(this.sourceAgreementId, savingsAccountCreationParams.sourceAgreementId) && jl40.l(this.amount, savingsAccountCreationParams.amount);
    }

    public final MoneyEntity getAmount() {
        return this.amount;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTariffId() {
        return this.tariffId;
    }

    public int hashCode() {
        String str = this.tariffId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceAgreementId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MoneyEntity moneyEntity = this.amount;
        return hashCode2 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public String toString() {
        String str = this.tariffId;
        String str2 = this.sourceAgreementId;
        MoneyEntity moneyEntity = this.amount;
        StringBuilder v = b64.v("SavingsAccountCreationParams(tariffId=", str, ", sourceAgreementId=", str2, ", amount=");
        v.append(moneyEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tariffId);
        dest.writeString(this.sourceAgreementId);
        dest.writeParcelable(this.amount, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountCreationParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCreationParams createFromParcel(Parcel parcel) {
            return new SavingsAccountCreationParams(parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(SavingsAccountCreationParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCreationParams[] newArray(int i) {
            return new SavingsAccountCreationParams[i];
        }
    }
}
