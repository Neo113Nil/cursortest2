package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "autoFundAmount", "autoTopupAmount", "autoTopupThreshold", "<init>", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getAutoFundAmount", "getAutoTopupAmount", "getAutoTopupThreshold", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundPayloadEntity implements Parcelable {
    public static final Parcelable.Creator<AutoFundPayloadEntity> CREATOR = new Creator();
    private final MoneyEntity autoFundAmount;
    private final MoneyEntity autoTopupAmount;
    private final MoneyEntity autoTopupThreshold;

    public AutoFundPayloadEntity(MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3) {
        this.autoFundAmount = moneyEntity;
        this.autoTopupAmount = moneyEntity2;
        this.autoTopupThreshold = moneyEntity3;
    }

    public static /* synthetic */ AutoFundPayloadEntity copy$default(AutoFundPayloadEntity autoFundPayloadEntity, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyEntity = autoFundPayloadEntity.autoFundAmount;
        }
        if ((i & 2) != 0) {
            moneyEntity2 = autoFundPayloadEntity.autoTopupAmount;
        }
        if ((i & 4) != 0) {
            moneyEntity3 = autoFundPayloadEntity.autoTopupThreshold;
        }
        return autoFundPayloadEntity.copy(moneyEntity, moneyEntity2, moneyEntity3);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyEntity getAutoFundAmount() {
        return this.autoFundAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyEntity getAutoTopupAmount() {
        return this.autoTopupAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final MoneyEntity getAutoTopupThreshold() {
        return this.autoTopupThreshold;
    }

    public final AutoFundPayloadEntity copy(MoneyEntity autoFundAmount, MoneyEntity autoTopupAmount, MoneyEntity autoTopupThreshold) {
        return new AutoFundPayloadEntity(autoFundAmount, autoTopupAmount, autoTopupThreshold);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoFundPayloadEntity)) {
            return false;
        }
        AutoFundPayloadEntity autoFundPayloadEntity = (AutoFundPayloadEntity) other;
        return jl40.l(this.autoFundAmount, autoFundPayloadEntity.autoFundAmount) && jl40.l(this.autoTopupAmount, autoFundPayloadEntity.autoTopupAmount) && jl40.l(this.autoTopupThreshold, autoFundPayloadEntity.autoTopupThreshold);
    }

    public final MoneyEntity getAutoFundAmount() {
        return this.autoFundAmount;
    }

    public final MoneyEntity getAutoTopupAmount() {
        return this.autoTopupAmount;
    }

    public final MoneyEntity getAutoTopupThreshold() {
        return this.autoTopupThreshold;
    }

    public int hashCode() {
        MoneyEntity moneyEntity = this.autoFundAmount;
        int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
        MoneyEntity moneyEntity2 = this.autoTopupAmount;
        int hashCode2 = (hashCode + (moneyEntity2 == null ? 0 : moneyEntity2.hashCode())) * 31;
        MoneyEntity moneyEntity3 = this.autoTopupThreshold;
        return hashCode2 + (moneyEntity3 != null ? moneyEntity3.hashCode() : 0);
    }

    public String toString() {
        return "AutoFundPayloadEntity(autoFundAmount=" + this.autoFundAmount + ", autoTopupAmount=" + this.autoTopupAmount + ", autoTopupThreshold=" + this.autoTopupThreshold + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.autoFundAmount, flags);
        dest.writeParcelable(this.autoTopupAmount, flags);
        dest.writeParcelable(this.autoTopupThreshold, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoFundPayloadEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoFundPayloadEntity createFromParcel(Parcel parcel) {
            return new AutoFundPayloadEntity((MoneyEntity) parcel.readParcelable(AutoFundPayloadEntity.class.getClassLoader()), (MoneyEntity) parcel.readParcelable(AutoFundPayloadEntity.class.getClassLoader()), (MoneyEntity) parcel.readParcelable(AutoFundPayloadEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoFundPayloadEntity[] newArray(int i) {
            return new AutoFundPayloadEntity[i];
        }
    }
}
