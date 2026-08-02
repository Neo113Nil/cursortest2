package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0015¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferFieldsEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "accountNumber", "bic", "lastName", "firstName", "middleName", "paymentPurpose", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferFieldsEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "getAccountNumber", "getBic", "getLastName", "getFirstName", "getMiddleName", "getPaymentPurpose", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesPersonTransferFieldsEntity implements Parcelable {
    public static final Parcelable.Creator<RequisitesPersonTransferFieldsEntity> CREATOR = new Creator();
    private final RequisiteFieldValidatorEntity accountNumber;
    private final RequisiteFieldValidatorEntity bic;
    private final RequisiteFieldValidatorEntity firstName;
    private final RequisiteFieldValidatorEntity lastName;
    private final RequisiteFieldValidatorEntity middleName;
    private final RequisiteFieldValidatorEntity paymentPurpose;

    public RequisitesPersonTransferFieldsEntity(RequisiteFieldValidatorEntity requisiteFieldValidatorEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity2, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity3, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity4, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity5, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity6) {
        this.accountNumber = requisiteFieldValidatorEntity;
        this.bic = requisiteFieldValidatorEntity2;
        this.lastName = requisiteFieldValidatorEntity3;
        this.firstName = requisiteFieldValidatorEntity4;
        this.middleName = requisiteFieldValidatorEntity5;
        this.paymentPurpose = requisiteFieldValidatorEntity6;
    }

    public static /* synthetic */ RequisitesPersonTransferFieldsEntity copy$default(RequisitesPersonTransferFieldsEntity requisitesPersonTransferFieldsEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity2, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity3, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity4, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity5, RequisiteFieldValidatorEntity requisiteFieldValidatorEntity6, int i, Object obj) {
        if ((i & 1) != 0) {
            requisiteFieldValidatorEntity = requisitesPersonTransferFieldsEntity.accountNumber;
        }
        if ((i & 2) != 0) {
            requisiteFieldValidatorEntity2 = requisitesPersonTransferFieldsEntity.bic;
        }
        if ((i & 4) != 0) {
            requisiteFieldValidatorEntity3 = requisitesPersonTransferFieldsEntity.lastName;
        }
        if ((i & 8) != 0) {
            requisiteFieldValidatorEntity4 = requisitesPersonTransferFieldsEntity.firstName;
        }
        if ((i & 16) != 0) {
            requisiteFieldValidatorEntity5 = requisitesPersonTransferFieldsEntity.middleName;
        }
        if ((i & 32) != 0) {
            requisiteFieldValidatorEntity6 = requisitesPersonTransferFieldsEntity.paymentPurpose;
        }
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity7 = requisiteFieldValidatorEntity5;
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity8 = requisiteFieldValidatorEntity6;
        return requisitesPersonTransferFieldsEntity.copy(requisiteFieldValidatorEntity, requisiteFieldValidatorEntity2, requisiteFieldValidatorEntity3, requisiteFieldValidatorEntity4, requisiteFieldValidatorEntity7, requisiteFieldValidatorEntity8);
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
    public final RequisiteFieldValidatorEntity getLastName() {
        return this.lastName;
    }

    /* renamed from: component4, reason: from getter */
    public final RequisiteFieldValidatorEntity getFirstName() {
        return this.firstName;
    }

    /* renamed from: component5, reason: from getter */
    public final RequisiteFieldValidatorEntity getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component6, reason: from getter */
    public final RequisiteFieldValidatorEntity getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final RequisitesPersonTransferFieldsEntity copy(RequisiteFieldValidatorEntity accountNumber, RequisiteFieldValidatorEntity bic, RequisiteFieldValidatorEntity lastName, RequisiteFieldValidatorEntity firstName, RequisiteFieldValidatorEntity middleName, RequisiteFieldValidatorEntity paymentPurpose) {
        return new RequisitesPersonTransferFieldsEntity(accountNumber, bic, lastName, firstName, middleName, paymentPurpose);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesPersonTransferFieldsEntity)) {
            return false;
        }
        RequisitesPersonTransferFieldsEntity requisitesPersonTransferFieldsEntity = (RequisitesPersonTransferFieldsEntity) other;
        return jl40.l(this.accountNumber, requisitesPersonTransferFieldsEntity.accountNumber) && jl40.l(this.bic, requisitesPersonTransferFieldsEntity.bic) && jl40.l(this.lastName, requisitesPersonTransferFieldsEntity.lastName) && jl40.l(this.firstName, requisitesPersonTransferFieldsEntity.firstName) && jl40.l(this.middleName, requisitesPersonTransferFieldsEntity.middleName) && jl40.l(this.paymentPurpose, requisitesPersonTransferFieldsEntity.paymentPurpose);
    }

    public final RequisiteFieldValidatorEntity getAccountNumber() {
        return this.accountNumber;
    }

    public final RequisiteFieldValidatorEntity getBic() {
        return this.bic;
    }

    public final RequisiteFieldValidatorEntity getFirstName() {
        return this.firstName;
    }

    public final RequisiteFieldValidatorEntity getLastName() {
        return this.lastName;
    }

    public final RequisiteFieldValidatorEntity getMiddleName() {
        return this.middleName;
    }

    public final RequisiteFieldValidatorEntity getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPurpose.hashCode() + ((this.middleName.hashCode() + ((this.firstName.hashCode() + ((this.lastName.hashCode() + ((this.bic.hashCode() + (this.accountNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequisitesPersonTransferFieldsEntity(accountNumber=" + this.accountNumber + ", bic=" + this.bic + ", lastName=" + this.lastName + ", firstName=" + this.firstName + ", middleName=" + this.middleName + ", paymentPurpose=" + this.paymentPurpose + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.accountNumber.writeToParcel(dest, flags);
        this.bic.writeToParcel(dest, flags);
        this.lastName.writeToParcel(dest, flags);
        this.firstName.writeToParcel(dest, flags);
        this.middleName.writeToParcel(dest, flags);
        this.paymentPurpose.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisitesPersonTransferFieldsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesPersonTransferFieldsEntity createFromParcel(Parcel parcel) {
            Parcelable.Creator<RequisiteFieldValidatorEntity> creator = RequisiteFieldValidatorEntity.CREATOR;
            return new RequisitesPersonTransferFieldsEntity(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesPersonTransferFieldsEntity[] newArray(int i) {
            return new RequisitesPersonTransferFieldsEntity[i];
        }
    }
}
