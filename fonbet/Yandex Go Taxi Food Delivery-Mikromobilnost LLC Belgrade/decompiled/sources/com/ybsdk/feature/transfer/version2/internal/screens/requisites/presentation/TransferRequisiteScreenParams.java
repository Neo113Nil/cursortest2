package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.RequisitesTransferPayloadEntity;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;", "requisitePayload", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", TarifficatorScenarioActivity.RESULT_KEY, "", "transferSessionId", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;", "component2", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/RequisitesTransferPayloadEntity;", "getRequisitePayload", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "getResult", "Ljava/lang/String;", "getTransferSessionId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferRequisiteScreenParams implements ScreenParams {
    public static final Parcelable.Creator<TransferRequisiteScreenParams> CREATOR = new Creator();
    private final RequisitesTransferPayloadEntity requisitePayload;
    private final TransferRequisiteResultEntity result;
    private final String transferSessionId;

    public TransferRequisiteScreenParams(RequisitesTransferPayloadEntity requisitesTransferPayloadEntity, TransferRequisiteResultEntity transferRequisiteResultEntity, String str) {
        this.requisitePayload = requisitesTransferPayloadEntity;
        this.result = transferRequisiteResultEntity;
        this.transferSessionId = str;
    }

    public static /* synthetic */ TransferRequisiteScreenParams copy$default(TransferRequisiteScreenParams transferRequisiteScreenParams, RequisitesTransferPayloadEntity requisitesTransferPayloadEntity, TransferRequisiteResultEntity transferRequisiteResultEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            requisitesTransferPayloadEntity = transferRequisiteScreenParams.requisitePayload;
        }
        if ((i & 2) != 0) {
            transferRequisiteResultEntity = transferRequisiteScreenParams.result;
        }
        if ((i & 4) != 0) {
            str = transferRequisiteScreenParams.transferSessionId;
        }
        return transferRequisiteScreenParams.copy(requisitesTransferPayloadEntity, transferRequisiteResultEntity, str);
    }

    /* renamed from: component1, reason: from getter */
    public final RequisitesTransferPayloadEntity getRequisitePayload() {
        return this.requisitePayload;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferRequisiteResultEntity getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferSessionId() {
        return this.transferSessionId;
    }

    public final TransferRequisiteScreenParams copy(RequisitesTransferPayloadEntity requisitePayload, TransferRequisiteResultEntity result, String transferSessionId) {
        return new TransferRequisiteScreenParams(requisitePayload, result, transferSessionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferRequisiteScreenParams)) {
            return false;
        }
        TransferRequisiteScreenParams transferRequisiteScreenParams = (TransferRequisiteScreenParams) other;
        return jl40.l(this.requisitePayload, transferRequisiteScreenParams.requisitePayload) && jl40.l(this.result, transferRequisiteScreenParams.result) && jl40.l(this.transferSessionId, transferRequisiteScreenParams.transferSessionId);
    }

    public final RequisitesTransferPayloadEntity getRequisitePayload() {
        return this.requisitePayload;
    }

    public final TransferRequisiteResultEntity getResult() {
        return this.result;
    }

    public final String getTransferSessionId() {
        return this.transferSessionId;
    }

    public int hashCode() {
        int hashCode = this.requisitePayload.hashCode() * 31;
        TransferRequisiteResultEntity transferRequisiteResultEntity = this.result;
        return this.transferSessionId.hashCode() + ((hashCode + (transferRequisiteResultEntity == null ? 0 : transferRequisiteResultEntity.hashCode())) * 31);
    }

    public String toString() {
        RequisitesTransferPayloadEntity requisitesTransferPayloadEntity = this.requisitePayload;
        TransferRequisiteResultEntity transferRequisiteResultEntity = this.result;
        String str = this.transferSessionId;
        StringBuilder sb = new StringBuilder("TransferRequisiteScreenParams(requisitePayload=");
        sb.append(requisitesTransferPayloadEntity);
        sb.append(", result=");
        sb.append(transferRequisiteResultEntity);
        sb.append(", transferSessionId=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.requisitePayload.writeToParcel(dest, flags);
        dest.writeParcelable(this.result, flags);
        dest.writeString(this.transferSessionId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferRequisiteScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferRequisiteScreenParams createFromParcel(Parcel parcel) {
            return new TransferRequisiteScreenParams(RequisitesTransferPayloadEntity.CREATOR.createFromParcel(parcel), (TransferRequisiteResultEntity) parcel.readParcelable(TransferRequisiteScreenParams.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferRequisiteScreenParams[] newArray(int i) {
            return new TransferRequisiteScreenParams[i];
        }
    }
}
