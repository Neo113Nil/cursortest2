package com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferPayloadEntity;", "personValidation", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesLegalTransferPayloadEntity;", "legalValidation", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;", "hcsValidation", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesLegalTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferPayloadEntity;", "component2", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesLegalTransferPayloadEntity;", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesLegalTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;)Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesPersonTransferPayloadEntity;", "getPersonValidation", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesLegalTransferPayloadEntity;", "getLegalValidation", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;", "getHcsValidation", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesTransferPayloadEntity implements Parcelable {
    public static final Parcelable.Creator<RequisitesTransferPayloadEntity> CREATOR = new Creator();
    private final RequisitesHcsTransferPayloadEntity hcsValidation;
    private final RequisitesLegalTransferPayloadEntity legalValidation;
    private final RequisitesPersonTransferPayloadEntity personValidation;

    public RequisitesTransferPayloadEntity(RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity, RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity, RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity) {
        this.personValidation = requisitesPersonTransferPayloadEntity;
        this.legalValidation = requisitesLegalTransferPayloadEntity;
        this.hcsValidation = requisitesHcsTransferPayloadEntity;
    }

    public static /* synthetic */ RequisitesTransferPayloadEntity copy$default(RequisitesTransferPayloadEntity requisitesTransferPayloadEntity, RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity, RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity, RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            requisitesPersonTransferPayloadEntity = requisitesTransferPayloadEntity.personValidation;
        }
        if ((i & 2) != 0) {
            requisitesLegalTransferPayloadEntity = requisitesTransferPayloadEntity.legalValidation;
        }
        if ((i & 4) != 0) {
            requisitesHcsTransferPayloadEntity = requisitesTransferPayloadEntity.hcsValidation;
        }
        return requisitesTransferPayloadEntity.copy(requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final RequisitesPersonTransferPayloadEntity getPersonValidation() {
        return this.personValidation;
    }

    /* renamed from: component2, reason: from getter */
    public final RequisitesLegalTransferPayloadEntity getLegalValidation() {
        return this.legalValidation;
    }

    /* renamed from: component3, reason: from getter */
    public final RequisitesHcsTransferPayloadEntity getHcsValidation() {
        return this.hcsValidation;
    }

    public final RequisitesTransferPayloadEntity copy(RequisitesPersonTransferPayloadEntity personValidation, RequisitesLegalTransferPayloadEntity legalValidation, RequisitesHcsTransferPayloadEntity hcsValidation) {
        return new RequisitesTransferPayloadEntity(personValidation, legalValidation, hcsValidation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesTransferPayloadEntity)) {
            return false;
        }
        RequisitesTransferPayloadEntity requisitesTransferPayloadEntity = (RequisitesTransferPayloadEntity) other;
        return jl40.l(this.personValidation, requisitesTransferPayloadEntity.personValidation) && jl40.l(this.legalValidation, requisitesTransferPayloadEntity.legalValidation) && jl40.l(this.hcsValidation, requisitesTransferPayloadEntity.hcsValidation);
    }

    public final RequisitesHcsTransferPayloadEntity getHcsValidation() {
        return this.hcsValidation;
    }

    public final RequisitesLegalTransferPayloadEntity getLegalValidation() {
        return this.legalValidation;
    }

    public final RequisitesPersonTransferPayloadEntity getPersonValidation() {
        return this.personValidation;
    }

    public int hashCode() {
        RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity = this.personValidation;
        int hashCode = (requisitesPersonTransferPayloadEntity == null ? 0 : requisitesPersonTransferPayloadEntity.hashCode()) * 31;
        RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity = this.legalValidation;
        int hashCode2 = (hashCode + (requisitesLegalTransferPayloadEntity == null ? 0 : requisitesLegalTransferPayloadEntity.hashCode())) * 31;
        RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = this.hcsValidation;
        return hashCode2 + (requisitesHcsTransferPayloadEntity != null ? requisitesHcsTransferPayloadEntity.hashCode() : 0);
    }

    public String toString() {
        return "RequisitesTransferPayloadEntity(personValidation=" + this.personValidation + ", legalValidation=" + this.legalValidation + ", hcsValidation=" + this.hcsValidation + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.personValidation, flags);
        dest.writeParcelable(this.legalValidation, flags);
        dest.writeParcelable(this.hcsValidation, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisitesTransferPayloadEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesTransferPayloadEntity createFromParcel(Parcel parcel) {
            return new RequisitesTransferPayloadEntity((RequisitesPersonTransferPayloadEntity) parcel.readParcelable(RequisitesTransferPayloadEntity.class.getClassLoader()), (RequisitesLegalTransferPayloadEntity) parcel.readParcelable(RequisitesTransferPayloadEntity.class.getClassLoader()), (RequisitesHcsTransferPayloadEntity) parcel.readParcelable(RequisitesTransferPayloadEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesTransferPayloadEntity[] newArray(int i) {
            return new RequisitesTransferPayloadEntity[i];
        }
    }
}
