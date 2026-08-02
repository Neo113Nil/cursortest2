package com.ybsdk.feature.transfer.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\b\u0010\u001a¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;", "Landroid/os/Parcelable;", "", "transferId", "Lcom/ybsdk/feature/transfer/api/entities/Limit;", "minLimit", "maxLimit", "", "isSbpEnabled", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/api/entities/Limit;Lcom/ybsdk/feature/transfer/api/entities/Limit;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/transfer/api/entities/Limit;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/api/entities/Limit;Lcom/ybsdk/feature/transfer/api/entities/Limit;Z)Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransferId", "Lcom/ybsdk/feature/transfer/api/entities/Limit;", "getMinLimit", "getMaxLimit", "Z", "feature-transfer-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferInfo implements Parcelable {
    public static final Parcelable.Creator<TransferInfo> CREATOR = new Creator();
    private final boolean isSbpEnabled;
    private final Limit maxLimit;
    private final Limit minLimit;
    private final String transferId;

    public /* synthetic */ TransferInfo(String str, Limit limit, Limit limit2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : limit, (i & 4) != 0 ? null : limit2, z);
    }

    public static /* synthetic */ TransferInfo copy$default(TransferInfo transferInfo, String str, Limit limit, Limit limit2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferInfo.transferId;
        }
        if ((i & 2) != 0) {
            limit = transferInfo.minLimit;
        }
        if ((i & 4) != 0) {
            limit2 = transferInfo.maxLimit;
        }
        if ((i & 8) != 0) {
            z = transferInfo.isSbpEnabled;
        }
        return transferInfo.copy(str, limit, limit2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final Limit getMinLimit() {
        return this.minLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final Limit getMaxLimit() {
        return this.maxLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSbpEnabled() {
        return this.isSbpEnabled;
    }

    public final TransferInfo copy(String transferId, Limit minLimit, Limit maxLimit, boolean isSbpEnabled) {
        return new TransferInfo(transferId, minLimit, maxLimit, isSbpEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferInfo)) {
            return false;
        }
        TransferInfo transferInfo = (TransferInfo) other;
        return jl40.l(this.transferId, transferInfo.transferId) && jl40.l(this.minLimit, transferInfo.minLimit) && jl40.l(this.maxLimit, transferInfo.maxLimit) && this.isSbpEnabled == transferInfo.isSbpEnabled;
    }

    public final Limit getMaxLimit() {
        return this.maxLimit;
    }

    public final Limit getMinLimit() {
        return this.minLimit;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = this.transferId.hashCode() * 31;
        Limit limit = this.minLimit;
        int hashCode2 = (hashCode + (limit == null ? 0 : limit.hashCode())) * 31;
        Limit limit2 = this.maxLimit;
        return Boolean.hashCode(this.isSbpEnabled) + ((hashCode2 + (limit2 != null ? limit2.hashCode() : 0)) * 31);
    }

    public final boolean isSbpEnabled() {
        return this.isSbpEnabled;
    }

    public String toString() {
        return "TransferInfo(transferId=" + this.transferId + ", minLimit=" + this.minLimit + ", maxLimit=" + this.maxLimit + ", isSbpEnabled=" + this.isSbpEnabled + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.transferId);
        Limit limit = this.minLimit;
        if (limit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            limit.writeToParcel(dest, flags);
        }
        Limit limit2 = this.maxLimit;
        if (limit2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            limit2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isSbpEnabled ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferInfo createFromParcel(Parcel parcel) {
            return new TransferInfo(parcel.readString(), parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Limit.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferInfo[] newArray(int i) {
            return new TransferInfo[i];
        }
    }

    public TransferInfo(String str, Limit limit, Limit limit2, boolean z) {
        this.transferId = str;
        this.minLimit = limit;
        this.maxLimit = limit2;
        this.isSbpEnabled = z;
    }
}
