package com.ybsdk.feature.transfer.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B7\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0080\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010#J\u0010\u00104\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b4\u0010!J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bD\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bE\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bH\u0010#¨\u0006I"}, d2 = {"Lcom/ybsdk/feature/transfer/api/TransferResultScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "transferId", "Ljava/math/BigDecimal;", "transferringAmount", "offerId", "comment", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "partnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "resultScreenHeader", "receiverName", "phoneNumber", "Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "transferType", "agreementId", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;Ljava/lang/String;)V", "amount", "ybName", "ybId", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "ybImage", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "component4", "component5", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "component6", "()Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "component7", "component8", "component9", "()Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "component10", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/api/TransferResultScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransferId", "Ljava/math/BigDecimal;", "getTransferringAmount", "getOfferId", "getComment", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "getPartnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "getResultScreenHeader", "getReceiverName", "getPhoneNumber", "Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "getTransferType", "getAgreementId", "feature-transfer-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferResultScreenParams implements ScreenParams {
    public static final Parcelable.Creator<TransferResultScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final String comment;
    private final String offerId;
    private final PartnerEntity partnerEntity;
    private final String phoneNumber;
    private final String receiverName;
    private final ResultScreenHeader resultScreenHeader;
    private final String transferId;
    private final TransferType transferType;
    private final BigDecimal transferringAmount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransferResultScreenParams(String str, BigDecimal bigDecimal, String str2, String str3, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str4, String str5, TransferType transferType, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, str2, str3, partnerEntity, r7, str4, str5, transferType, str6);
        ResultScreenHeader resultScreenHeader2;
        ResultScreenHeader resultScreenHeader3;
        if ((i & 32) != 0) {
            ResultScreenHeader.Companion.getClass();
            resultScreenHeader3 = ResultScreenHeader.f23default;
            resultScreenHeader2 = resultScreenHeader3;
        } else {
            resultScreenHeader2 = resultScreenHeader;
        }
    }

    public static /* synthetic */ TransferResultScreenParams copy$default(TransferResultScreenParams transferResultScreenParams, String str, BigDecimal bigDecimal, String str2, String str3, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str4, String str5, TransferType transferType, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferResultScreenParams.transferId;
        }
        if ((i & 2) != 0) {
            bigDecimal = transferResultScreenParams.transferringAmount;
        }
        if ((i & 4) != 0) {
            str2 = transferResultScreenParams.offerId;
        }
        if ((i & 8) != 0) {
            str3 = transferResultScreenParams.comment;
        }
        if ((i & 16) != 0) {
            partnerEntity = transferResultScreenParams.partnerEntity;
        }
        if ((i & 32) != 0) {
            resultScreenHeader = transferResultScreenParams.resultScreenHeader;
        }
        if ((i & 64) != 0) {
            str4 = transferResultScreenParams.receiverName;
        }
        if ((i & 128) != 0) {
            str5 = transferResultScreenParams.phoneNumber;
        }
        if ((i & 256) != 0) {
            transferType = transferResultScreenParams.transferType;
        }
        if ((i & 512) != 0) {
            str6 = transferResultScreenParams.agreementId;
        }
        TransferType transferType2 = transferType;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        PartnerEntity partnerEntity2 = partnerEntity;
        ResultScreenHeader resultScreenHeader2 = resultScreenHeader;
        return transferResultScreenParams.copy(str, bigDecimal, str2, str3, partnerEntity2, resultScreenHeader2, str8, str9, transferType2, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getTransferringAmount() {
        return this.transferringAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component5, reason: from getter */
    public final PartnerEntity getPartnerEntity() {
        return this.partnerEntity;
    }

    /* renamed from: component6, reason: from getter */
    public final ResultScreenHeader getResultScreenHeader() {
        return this.resultScreenHeader;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final TransferResultScreenParams copy(String transferId, BigDecimal transferringAmount, String offerId, String comment, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String receiverName, String phoneNumber, TransferType transferType, String agreementId) {
        return new TransferResultScreenParams(transferId, transferringAmount, offerId, comment, partnerEntity, resultScreenHeader, receiverName, phoneNumber, transferType, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResultScreenParams)) {
            return false;
        }
        TransferResultScreenParams transferResultScreenParams = (TransferResultScreenParams) other;
        return jl40.l(this.transferId, transferResultScreenParams.transferId) && jl40.l(this.transferringAmount, transferResultScreenParams.transferringAmount) && jl40.l(this.offerId, transferResultScreenParams.offerId) && jl40.l(this.comment, transferResultScreenParams.comment) && jl40.l(this.partnerEntity, transferResultScreenParams.partnerEntity) && jl40.l(this.resultScreenHeader, transferResultScreenParams.resultScreenHeader) && jl40.l(this.receiverName, transferResultScreenParams.receiverName) && jl40.l(this.phoneNumber, transferResultScreenParams.phoneNumber) && this.transferType == transferResultScreenParams.transferType && jl40.l(this.agreementId, transferResultScreenParams.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final PartnerEntity getPartnerEntity() {
        return this.partnerEntity;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final ResultScreenHeader getResultScreenHeader() {
        return this.resultScreenHeader;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final BigDecimal getTransferringAmount() {
        return this.transferringAmount;
    }

    public int hashCode() {
        String str = this.transferId;
        int f = smw0.f(this.transferringAmount, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.offerId;
        int hashCode = (f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        int hashCode2 = (this.resultScreenHeader.hashCode() + ((this.partnerEntity.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.receiverName;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int hashCode4 = (this.transferType.hashCode() + ((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.agreementId;
        return hashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.transferId;
        BigDecimal bigDecimal = this.transferringAmount;
        String str2 = this.offerId;
        String str3 = this.comment;
        PartnerEntity partnerEntity = this.partnerEntity;
        ResultScreenHeader resultScreenHeader = this.resultScreenHeader;
        String str4 = this.receiverName;
        String str5 = this.phoneNumber;
        TransferType transferType = this.transferType;
        String str6 = this.agreementId;
        StringBuilder sb = new StringBuilder("TransferResultScreenParams(transferId=");
        sb.append(str);
        sb.append(", transferringAmount=");
        sb.append(bigDecimal);
        sb.append(", offerId=");
        g8e.D(sb, str2, ", comment=", str3, ", partnerEntity=");
        sb.append(partnerEntity);
        sb.append(", resultScreenHeader=");
        sb.append(resultScreenHeader);
        sb.append(", receiverName=");
        g8e.D(sb, str4, ", phoneNumber=", str5, ", transferType=");
        sb.append(transferType);
        sb.append(", agreementId=");
        sb.append(str6);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.transferId);
        dest.writeSerializable(this.transferringAmount);
        dest.writeString(this.offerId);
        dest.writeString(this.comment);
        dest.writeParcelable(this.partnerEntity, flags);
        dest.writeParcelable(this.resultScreenHeader, flags);
        dest.writeString(this.receiverName);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.transferType.name());
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferResultScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferResultScreenParams createFromParcel(Parcel parcel) {
            return new TransferResultScreenParams(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (PartnerEntity) parcel.readParcelable(TransferResultScreenParams.class.getClassLoader()), (ResultScreenHeader) parcel.readParcelable(TransferResultScreenParams.class.getClassLoader()), parcel.readString(), parcel.readString(), TransferType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferResultScreenParams[] newArray(int i) {
            return new TransferResultScreenParams[i];
        }
    }

    public TransferResultScreenParams(String str, BigDecimal bigDecimal, String str2, String str3, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str4, String str5, TransferType transferType, String str6) {
        this.transferId = str;
        this.transferringAmount = bigDecimal;
        this.offerId = str2;
        this.comment = str3;
        this.partnerEntity = partnerEntity;
        this.resultScreenHeader = resultScreenHeader;
        this.receiverName = str4;
        this.phoneNumber = str5;
        this.transferType = transferType;
        this.agreementId = str6;
    }

    public /* synthetic */ TransferResultScreenParams(BigDecimal bigDecimal, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, themedImageUrlEntity, (i & 16) != 0 ? null : str3);
    }

    public TransferResultScreenParams(BigDecimal bigDecimal, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3) {
        this(null, bigDecimal, null, null, new PartnerEntity(str2, str, null, themedImageUrlEntity), null, null, null, TransferType.ME2ME, str3, 32, null);
    }
}
