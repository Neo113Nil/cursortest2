package com.ybsdk.feature.transfer.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import defpackage.yu01;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/transfer/api/TransferYbScreenArguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "transferType", "", "backVisible", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "component2", "()Z", "copy", "(Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;Z)Lcom/ybsdk/feature/transfer/api/TransferYbScreenArguments;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "getTransferType", "Z", "getBackVisible", "Companion", "yu01", "feature-transfer-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferYbScreenArguments implements ScreenParams {
    private final boolean backVisible;
    private final TransferType transferType;
    public static final yu01 Companion = new yu01();
    public static final Parcelable.Creator<TransferYbScreenArguments> CREATOR = new Creator();

    public TransferYbScreenArguments(TransferType transferType, boolean z) {
        this.transferType = transferType;
        this.backVisible = z;
    }

    public static /* synthetic */ TransferYbScreenArguments copy$default(TransferYbScreenArguments transferYbScreenArguments, TransferType transferType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transferType = transferYbScreenArguments.transferType;
        }
        if ((i & 2) != 0) {
            z = transferYbScreenArguments.backVisible;
        }
        return transferYbScreenArguments.copy(transferType, z);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBackVisible() {
        return this.backVisible;
    }

    public final TransferYbScreenArguments copy(TransferType transferType, boolean backVisible) {
        return new TransferYbScreenArguments(transferType, backVisible);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferYbScreenArguments)) {
            return false;
        }
        TransferYbScreenArguments transferYbScreenArguments = (TransferYbScreenArguments) other;
        return this.transferType == transferYbScreenArguments.transferType && this.backVisible == transferYbScreenArguments.backVisible;
    }

    public final boolean getBackVisible() {
        return this.backVisible;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.backVisible) + (this.transferType.hashCode() * 31);
    }

    public String toString() {
        return "TransferYbScreenArguments(transferType=" + this.transferType + ", backVisible=" + this.backVisible + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.transferType.name());
        dest.writeInt(this.backVisible ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferYbScreenArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferYbScreenArguments createFromParcel(Parcel parcel) {
            return new TransferYbScreenArguments(TransferType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferYbScreenArguments[] newArray(int i) {
            return new TransferYbScreenArguments[i];
        }
    }
}
