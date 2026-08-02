package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "accountNumber", "bic", "legalName", "inn", "paymentPurpose", "hcsPersonalAccount", "paymentPeriod", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "getAccountNumber", "getBic", "getLegalName", "getInn", "getPaymentPurpose", "getHcsPersonalAccount", "getPaymentPeriod", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesHcsTransferFieldsEntity implements Parcelable {
    public static final Parcelable.Creator<RequisitesHcsTransferFieldsEntity> CREATOR = new Creator();
    private final RequisiteFieldValidatorEntity accountNumber;
    private final RequisiteFieldValidatorEntity bic;
    private final RequisiteFieldValidatorEntity hcsPersonalAccount;
    private final RequisiteFieldValidatorEntity inn;
    private final RequisiteFieldValidatorEntity legalName;
    private final RequisiteFieldValidatorEntity paymentPeriod;
    private final RequisiteFieldValidatorEntity paymentPurpose;

    public RequisitesHcsTransferFieldsEntity(RequisiteFieldValidatorEntity requisiteFieldValidatorEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity2, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity3, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity4, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity5, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity6, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity7) {
        this.accountNumber = requisiteFieldValidatorEntity;
        this.bic = requisiteFieldValidatorEntity2;
        this.legalName = requisiteFieldValidatorEntity3;
        this.inn = requisiteFieldValidatorEntity4;
        this.paymentPurpose = requisiteFieldValidatorEntity5;
        this.hcsPersonalAccount = requisiteFieldValidatorEntity6;
        this.paymentPeriod = requisiteFieldValidatorEntity7;
    }

    public static /* synthetic */ RequisitesHcsTransferFieldsEntity copy$default(RequisitesHcsTransferFieldsEntity requisitesHcsTransferFieldsEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity2, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity3, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity4, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity5, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity6, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity7, int i, Object obj) {
        if ((i & 1) != 0) {
            requisiteFieldValidatorEntity = requisitesHcsTransferFieldsEntity.accountNumber;
        }
        if ((i & 2) != 0) {
            requisiteFieldValidatorEntity2 = requisitesHcsTransferFieldsEntity.bic;
        }
        if ((i & 4) != 0) {
            requisiteFieldValidatorEntity3 = requisitesHcsTransferFieldsEntity.legalName;
        }
        if ((i & 8) != 0) {
            requisiteFieldValidatorEntity4 = requisitesHcsTransferFieldsEntity.inn;
        }
        if ((i & 16) != 0) {
            requisiteFieldValidatorEntity5 = requisitesHcsTransferFieldsEntity.paymentPurpose;
        }
        if ((i & 32) != 0) {
            requisiteFieldValidatorEntity6 = requisitesHcsTransferFieldsEntity.hcsPersonalAccount;
        }
        if ((i & 64) != 0) {
            requisiteFieldValidatorEntity7 = requisitesHcsTransferFieldsEntity.paymentPeriod;
        }
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity8 = requisiteFieldValidatorEntity6;
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity9 = requisiteFieldValidatorEntity7;
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity10 = requisiteFieldValidatorEntity5;
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity11 = requisiteFieldValidatorEntity3;
        return requisitesHcsTransferFieldsEntity.copy(requisiteFieldValidatorEntity, requisiteFieldValidatorEntity2, requisiteFieldValidatorEntity11, requisiteFieldValidatorEntity4, requisiteFieldValidatorEntity10, requisiteFieldValidatorEntity8, requisiteFieldValidatorEntity9);
    }

    /* renamed from: component1, reason: from getter */
    public final RequisiteFieldValidatorEntity getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final RequisiteFieldValidatorEntity getBic() {
        return this.bic;
    }

    /* renamed from: component3, reason: from getter */
    public final RequisiteFieldValidatorEntity getLegalName() {
        return this.legalName;
    }

    /* renamed from: component4, reason: from getter */
    public final RequisiteFieldValidatorEntity getInn() {
        return this.inn;
    }

    /* renamed from: component5, reason: from getter */
    public final RequisiteFieldValidatorEntity getPaymentPurpose() {
        return this.paymentPurpose;
    }

    /* renamed from: component6, reason: from getter */
    public final RequisiteFieldValidatorEntity getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final RequisiteFieldValidatorEntity getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final RequisitesHcsTransferFieldsEntity copy(RequisiteFieldValidatorEntity accountNumber, RequisiteFieldValidatorEntity bic, RequisiteFieldValidatorEntity legalName, RequisiteFieldValidatorEntity inn, RequisiteFieldValidatorEntity paymentPurpose, RequisiteFieldValidatorEntity hcsPersonalAccount, RequisiteFieldValidatorEntity paymentPeriod) {
        return new RequisitesHcsTransferFieldsEntity(accountNumber, bic, legalName, inn, paymentPurpose, hcsPersonalAccount, paymentPeriod);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesHcsTransferFieldsEntity)) {
            return false;
        }
        RequisitesHcsTransferFieldsEntity requisitesHcsTransferFieldsEntity = (RequisitesHcsTransferFieldsEntity) other;
        return jl40.l(this.accountNumber, requisitesHcsTransferFieldsEntity.accountNumber) && jl40.l(this.bic, requisitesHcsTransferFieldsEntity.bic) && jl40.l(this.legalName, requisitesHcsTransferFieldsEntity.legalName) && jl40.l(this.inn, requisitesHcsTransferFieldsEntity.inn) && jl40.l(this.paymentPurpose, requisitesHcsTransferFieldsEntity.paymentPurpose) && jl40.l(this.hcsPersonalAccount, requisitesHcsTransferFieldsEntity.hcsPersonalAccount) && jl40.l(this.paymentPeriod, requisitesHcsTransferFieldsEntity.paymentPeriod);
    }

    public final RequisiteFieldValidatorEntity getAccountNumber() {
        return this.accountNumber;
    }

    public final RequisiteFieldValidatorEntity getBic() {
        return this.bic;
    }

    public final RequisiteFieldValidatorEntity getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    public final RequisiteFieldValidatorEntity getInn() {
        return this.inn;
    }

    public final RequisiteFieldValidatorEntity getLegalName() {
        return this.legalName;
    }

    public final RequisiteFieldValidatorEntity getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final RequisiteFieldValidatorEntity getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPeriod.hashCode() + ((this.hcsPersonalAccount.hashCode() + ((this.paymentPurpose.hashCode() + ((this.inn.hashCode() + ((this.legalName.hashCode() + ((this.bic.hashCode() + (this.accountNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequisitesHcsTransferFieldsEntity(accountNumber=" + this.accountNumber + ", bic=" + this.bic + ", legalName=" + this.legalName + ", inn=" + this.inn + ", paymentPurpose=" + this.paymentPurpose + ", hcsPersonalAccount=" + this.hcsPersonalAccount + ", paymentPeriod=" + this.paymentPeriod + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.accountNumber.writeToParcel(dest, flags);
        this.bic.writeToParcel(dest, flags);
        this.legalName.writeToParcel(dest, flags);
        this.inn.writeToParcel(dest, flags);
        this.paymentPurpose.writeToParcel(dest, flags);
        this.hcsPersonalAccount.writeToParcel(dest, flags);
        this.paymentPeriod.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisitesHcsTransferFieldsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesHcsTransferFieldsEntity createFromParcel(Parcel parcel) {
            Parcelable.Creator<RequisiteFieldValidatorEntity> creator = RequisiteFieldValidatorEntity.CREATOR;
            return new RequisitesHcsTransferFieldsEntity(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesHcsTransferFieldsEntity[] newArray(int i) {
            return new RequisitesHcsTransferFieldsEntity[i];
        }
    }
}
