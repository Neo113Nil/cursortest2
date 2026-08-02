package com.ybsdk.feature.transfer.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0019R\u001d\u0010+\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b+\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103R\u001d\u00105\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b5\u0010(\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\u0019¨\u00068"}, d2 = {"Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "partnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "resultScreenHeader", "", "transferId", "receiverName", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "component2", "()Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "getPartnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "getResultScreenHeader", "Ljava/lang/String;", "getTransferId", "getReceiverName", "title", "getTitle", "getTitle$annotations", "()V", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "themedImageEntity", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getThemedImageEntity", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getThemedImageEntity$annotations", "ybId", "getYbId", "getYbId$annotations", "feature-transfer-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferSelectedTargetEntity implements Parcelable {
    public static final Parcelable.Creator<TransferSelectedTargetEntity> CREATOR = new Creator();
    private final PartnerEntity partnerEntity;
    private final String receiverName;
    private final ResultScreenHeader resultScreenHeader;
    private final ThemedImageUrlEntity themedImageEntity;
    private final String title;
    private final String transferId;
    private final String ybId;

    public TransferSelectedTargetEntity(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2) {
        this.partnerEntity = partnerEntity;
        this.resultScreenHeader = resultScreenHeader;
        this.transferId = str;
        this.receiverName = str2;
        this.title = partnerEntity.getTitle();
        this.themedImageEntity = partnerEntity.getThemedImage();
        this.ybId = partnerEntity.getPartnerId();
    }

    public static /* synthetic */ TransferSelectedTargetEntity copy$default(TransferSelectedTargetEntity transferSelectedTargetEntity, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            partnerEntity = transferSelectedTargetEntity.partnerEntity;
        }
        if ((i & 2) != 0) {
            resultScreenHeader = transferSelectedTargetEntity.resultScreenHeader;
        }
        if ((i & 4) != 0) {
            str = transferSelectedTargetEntity.transferId;
        }
        if ((i & 8) != 0) {
            str2 = transferSelectedTargetEntity.receiverName;
        }
        return transferSelectedTargetEntity.copy(partnerEntity, resultScreenHeader, str, str2);
    }

    public static /* synthetic */ void getThemedImageEntity$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getYbId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final PartnerEntity getPartnerEntity() {
        return this.partnerEntity;
    }

    /* renamed from: component2, reason: from getter */
    public final ResultScreenHeader getResultScreenHeader() {
        return this.resultScreenHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReceiverName() {
        return this.receiverName;
    }

    public final TransferSelectedTargetEntity copy(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String transferId, String receiverName) {
        return new TransferSelectedTargetEntity(partnerEntity, resultScreenHeader, transferId, receiverName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferSelectedTargetEntity)) {
            return false;
        }
        TransferSelectedTargetEntity transferSelectedTargetEntity = (TransferSelectedTargetEntity) other;
        return jl40.l(this.partnerEntity, transferSelectedTargetEntity.partnerEntity) && jl40.l(this.resultScreenHeader, transferSelectedTargetEntity.resultScreenHeader) && jl40.l(this.transferId, transferSelectedTargetEntity.transferId) && jl40.l(this.receiverName, transferSelectedTargetEntity.receiverName);
    }

    public final PartnerEntity getPartnerEntity() {
        return this.partnerEntity;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final ResultScreenHeader getResultScreenHeader() {
        return this.resultScreenHeader;
    }

    public final ThemedImageUrlEntity getThemedImageEntity() {
        return this.themedImageEntity;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int hashCode = (this.resultScreenHeader.hashCode() + (this.partnerEntity.hashCode() * 31)) * 31;
        String str = this.transferId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.receiverName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        PartnerEntity partnerEntity = this.partnerEntity;
        ResultScreenHeader resultScreenHeader = this.resultScreenHeader;
        String str = this.transferId;
        String str2 = this.receiverName;
        StringBuilder sb = new StringBuilder("TransferSelectedTargetEntity(partnerEntity=");
        sb.append(partnerEntity);
        sb.append(", resultScreenHeader=");
        sb.append(resultScreenHeader);
        sb.append(", transferId=");
        return g8e.r(sb, str, ", receiverName=", str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.partnerEntity, flags);
        dest.writeParcelable(this.resultScreenHeader, flags);
        dest.writeString(this.transferId);
        dest.writeString(this.receiverName);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferSelectedTargetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferSelectedTargetEntity createFromParcel(Parcel parcel) {
            return new TransferSelectedTargetEntity((PartnerEntity) parcel.readParcelable(TransferSelectedTargetEntity.class.getClassLoader()), (ResultScreenHeader) parcel.readParcelable(TransferSelectedTargetEntity.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferSelectedTargetEntity[] newArray(int i) {
            return new TransferSelectedTargetEntity[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransferSelectedTargetEntity(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(partnerEntity, resultScreenHeader, str, str2);
        if ((i & 2) != 0) {
            ResultScreenHeader.Companion.getClass();
            resultScreenHeader = ResultScreenHeader.f23default;
        }
    }
}
