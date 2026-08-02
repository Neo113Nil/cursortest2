package com.ybsdk.feature.partnerselection.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ohq0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b4\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\"¨\u00069"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "partnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "resultScreenHeader", "", "receiverName", "receiverPhone", "requestId", "transferId", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "crossBorderData", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "component2", "()Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "copy", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;)Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "getPartnerEntity", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "getResultScreenHeader", "Ljava/lang/String;", "getReceiverName", "getReceiverPhone", "getRequestId", "getTransferId", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "getCrossBorderData", "Companion", "ohq0", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectedPartner implements Parcelable {
    private final SelectedPartnerCrossBorderData crossBorderData;
    private final PartnerEntity partnerEntity;
    private final String receiverName;
    private final String receiverPhone;
    private final String requestId;
    private final ResultScreenHeader resultScreenHeader;
    private final String transferId;
    public static final ohq0 Companion = new ohq0();
    public static final Parcelable.Creator<SelectedPartner> CREATOR = new Creator();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectedPartner(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2, String str3, String str4, SelectedPartnerCrossBorderData selectedPartnerCrossBorderData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(partnerEntity, resultScreenHeader, str, str2, str3, str4, (i & 64) != 0 ? null : selectedPartnerCrossBorderData);
        if ((i & 2) != 0) {
            ResultScreenHeader.Companion.getClass();
            resultScreenHeader = ResultScreenHeader.f23default;
        }
    }

    public static /* synthetic */ SelectedPartner copy$default(SelectedPartner selectedPartner, PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2, String str3, String str4, SelectedPartnerCrossBorderData selectedPartnerCrossBorderData, int i, Object obj) {
        if ((i & 1) != 0) {
            partnerEntity = selectedPartner.partnerEntity;
        }
        if ((i & 2) != 0) {
            resultScreenHeader = selectedPartner.resultScreenHeader;
        }
        if ((i & 4) != 0) {
            str = selectedPartner.receiverName;
        }
        if ((i & 8) != 0) {
            str2 = selectedPartner.receiverPhone;
        }
        if ((i & 16) != 0) {
            str3 = selectedPartner.requestId;
        }
        if ((i & 32) != 0) {
            str4 = selectedPartner.transferId;
        }
        if ((i & 64) != 0) {
            selectedPartnerCrossBorderData = selectedPartner.crossBorderData;
        }
        String str5 = str4;
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData2 = selectedPartnerCrossBorderData;
        String str6 = str3;
        String str7 = str;
        return selectedPartner.copy(partnerEntity, resultScreenHeader, str7, str2, str6, str5, selectedPartnerCrossBorderData2);
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
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component7, reason: from getter */
    public final SelectedPartnerCrossBorderData getCrossBorderData() {
        return this.crossBorderData;
    }

    public final SelectedPartner copy(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String receiverName, String receiverPhone, String requestId, String transferId, SelectedPartnerCrossBorderData crossBorderData) {
        return new SelectedPartner(partnerEntity, resultScreenHeader, receiverName, receiverPhone, requestId, transferId, crossBorderData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedPartner)) {
            return false;
        }
        SelectedPartner selectedPartner = (SelectedPartner) other;
        return jl40.l(this.partnerEntity, selectedPartner.partnerEntity) && jl40.l(this.resultScreenHeader, selectedPartner.resultScreenHeader) && jl40.l(this.receiverName, selectedPartner.receiverName) && jl40.l(this.receiverPhone, selectedPartner.receiverPhone) && jl40.l(this.requestId, selectedPartner.requestId) && jl40.l(this.transferId, selectedPartner.transferId) && jl40.l(this.crossBorderData, selectedPartner.crossBorderData);
    }

    public final SelectedPartnerCrossBorderData getCrossBorderData() {
        return this.crossBorderData;
    }

    public final PartnerEntity getPartnerEntity() {
        return this.partnerEntity;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final ResultScreenHeader getResultScreenHeader() {
        return this.resultScreenHeader;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = (this.resultScreenHeader.hashCode() + (this.partnerEntity.hashCode() * 31)) * 31;
        String str = this.receiverName;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.receiverPhone);
        String str2 = this.requestId;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transferId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData = this.crossBorderData;
        return hashCode3 + (selectedPartnerCrossBorderData != null ? selectedPartnerCrossBorderData.hashCode() : 0);
    }

    public String toString() {
        PartnerEntity partnerEntity = this.partnerEntity;
        ResultScreenHeader resultScreenHeader = this.resultScreenHeader;
        String str = this.receiverName;
        String str2 = this.receiverPhone;
        String str3 = this.requestId;
        String str4 = this.transferId;
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData = this.crossBorderData;
        StringBuilder sb = new StringBuilder("SelectedPartner(partnerEntity=");
        sb.append(partnerEntity);
        sb.append(", resultScreenHeader=");
        sb.append(resultScreenHeader);
        sb.append(", receiverName=");
        g8e.D(sb, str, ", receiverPhone=", str2, ", requestId=");
        g8e.D(sb, str3, ", transferId=", str4, ", crossBorderData=");
        sb.append(selectedPartnerCrossBorderData);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.partnerEntity, flags);
        dest.writeParcelable(this.resultScreenHeader, flags);
        dest.writeString(this.receiverName);
        dest.writeString(this.receiverPhone);
        dest.writeString(this.requestId);
        dest.writeString(this.transferId);
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData = this.crossBorderData;
        if (selectedPartnerCrossBorderData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectedPartnerCrossBorderData.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedPartner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPartner createFromParcel(Parcel parcel) {
            return new SelectedPartner((PartnerEntity) parcel.readParcelable(SelectedPartner.class.getClassLoader()), (ResultScreenHeader) parcel.readParcelable(SelectedPartner.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SelectedPartnerCrossBorderData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPartner[] newArray(int i) {
            return new SelectedPartner[i];
        }
    }

    public SelectedPartner(PartnerEntity partnerEntity, ResultScreenHeader resultScreenHeader, String str, String str2, String str3, String str4, SelectedPartnerCrossBorderData selectedPartnerCrossBorderData) {
        this.partnerEntity = partnerEntity;
        this.resultScreenHeader = resultScreenHeader;
        this.receiverName = str;
        this.receiverPhone = str2;
        this.requestId = str3;
        this.transferId = str4;
        this.crossBorderData = selectedPartnerCrossBorderData;
    }
}
