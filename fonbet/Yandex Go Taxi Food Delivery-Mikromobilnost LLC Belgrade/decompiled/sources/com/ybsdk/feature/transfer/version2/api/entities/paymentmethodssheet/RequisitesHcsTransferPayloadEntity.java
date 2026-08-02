package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;", "validation", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitWidget", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;", "component2", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferPayloadEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesHcsTransferFieldsEntity;", "getValidation", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitWidget", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesHcsTransferPayloadEntity implements Parcelable {
    public static final Parcelable.Creator<RequisitesHcsTransferPayloadEntity> CREATOR = new Creator();
    private final DivDataDto divkitWidget;
    private final RequisitesHcsTransferFieldsEntity validation;

    public RequisitesHcsTransferPayloadEntity(RequisitesHcsTransferFieldsEntity requisitesHcsTransferFieldsEntity, DivDataDto divDataDto) {
        this.validation = requisitesHcsTransferFieldsEntity;
        this.divkitWidget = divDataDto;
    }

    public static /* synthetic */ RequisitesHcsTransferPayloadEntity copy$default(RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity, RequisitesHcsTransferFieldsEntity requisitesHcsTransferFieldsEntity, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            requisitesHcsTransferFieldsEntity = requisitesHcsTransferPayloadEntity.validation;
        }
        if ((i & 2) != 0) {
            divDataDto = requisitesHcsTransferPayloadEntity.divkitWidget;
        }
        return requisitesHcsTransferPayloadEntity.copy(requisitesHcsTransferFieldsEntity, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final RequisitesHcsTransferFieldsEntity getValidation() {
        return this.validation;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final RequisitesHcsTransferPayloadEntity copy(RequisitesHcsTransferFieldsEntity validation, DivDataDto divkitWidget) {
        return new RequisitesHcsTransferPayloadEntity(validation, divkitWidget);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesHcsTransferPayloadEntity)) {
            return false;
        }
        RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = (RequisitesHcsTransferPayloadEntity) other;
        return jl40.l(this.validation, requisitesHcsTransferPayloadEntity.validation) && jl40.l(this.divkitWidget, requisitesHcsTransferPayloadEntity.divkitWidget);
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final RequisitesHcsTransferFieldsEntity getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int hashCode = this.validation.hashCode() * 31;
        DivDataDto divDataDto = this.divkitWidget;
        return hashCode + (divDataDto == null ? 0 : divDataDto.hashCode());
    }

    public String toString() {
        return "RequisitesHcsTransferPayloadEntity(validation=" + this.validation + ", divkitWidget=" + this.divkitWidget + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.validation.writeToParcel(dest, flags);
        dest.writeParcelable(this.divkitWidget, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisitesHcsTransferPayloadEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesHcsTransferPayloadEntity createFromParcel(Parcel parcel) {
            return new RequisitesHcsTransferPayloadEntity(RequisitesHcsTransferFieldsEntity.CREATOR.createFromParcel(parcel), (DivDataDto) parcel.readParcelable(RequisitesHcsTransferPayloadEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesHcsTransferPayloadEntity[] newArray(int i) {
            return new RequisitesHcsTransferPayloadEntity[i];
        }
    }
}
