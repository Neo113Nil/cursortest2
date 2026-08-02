package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/FundDocsNoticeInfo;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "", "transferId", "targetAgreementId", "sourceAgreementId", "<init>", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/entities/FundDocsNoticeInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "Ljava/lang/String;", "getTransferId", "getTargetAgreementId", "getSourceAgreementId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundDocsNoticeInfo implements Parcelable {
    public static final Parcelable.Creator<FundDocsNoticeInfo> CREATOR = new Creator();
    private final MoneyEntity money;
    private final String sourceAgreementId;
    private final String targetAgreementId;
    private final String transferId;

    public FundDocsNoticeInfo(MoneyEntity moneyEntity, String str, String str2, String str3) {
        this.money = moneyEntity;
        this.transferId = str;
        this.targetAgreementId = str2;
        this.sourceAgreementId = str3;
    }

    public static /* synthetic */ FundDocsNoticeInfo copy$default(FundDocsNoticeInfo fundDocsNoticeInfo, MoneyEntity moneyEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyEntity = fundDocsNoticeInfo.money;
        }
        if ((i & 2) != 0) {
            str = fundDocsNoticeInfo.transferId;
        }
        if ((i & 4) != 0) {
            str2 = fundDocsNoticeInfo.targetAgreementId;
        }
        if ((i & 8) != 0) {
            str3 = fundDocsNoticeInfo.sourceAgreementId;
        }
        return fundDocsNoticeInfo.copy(moneyEntity, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyEntity getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final FundDocsNoticeInfo copy(MoneyEntity money, String transferId, String targetAgreementId, String sourceAgreementId) {
        return new FundDocsNoticeInfo(money, transferId, targetAgreementId, sourceAgreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundDocsNoticeInfo)) {
            return false;
        }
        FundDocsNoticeInfo fundDocsNoticeInfo = (FundDocsNoticeInfo) other;
        return jl40.l(this.money, fundDocsNoticeInfo.money) && jl40.l(this.transferId, fundDocsNoticeInfo.transferId) && jl40.l(this.targetAgreementId, fundDocsNoticeInfo.targetAgreementId) && jl40.l(this.sourceAgreementId, fundDocsNoticeInfo.sourceAgreementId);
    }

    public final MoneyEntity getMoney() {
        return this.money;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        return this.sourceAgreementId.hashCode() + unr0.b(unr0.b(this.money.hashCode() * 31, 31, this.transferId), 31, this.targetAgreementId);
    }

    public String toString() {
        MoneyEntity moneyEntity = this.money;
        String str = this.transferId;
        String str2 = this.targetAgreementId;
        String str3 = this.sourceAgreementId;
        StringBuilder sb = new StringBuilder("FundDocsNoticeInfo(money=");
        sb.append(moneyEntity);
        sb.append(", transferId=");
        sb.append(str);
        sb.append(", targetAgreementId=");
        return g8e.r(sb, str2, ", sourceAgreementId=", str3, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.money, flags);
        dest.writeString(this.transferId);
        dest.writeString(this.targetAgreementId);
        dest.writeString(this.sourceAgreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FundDocsNoticeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundDocsNoticeInfo createFromParcel(Parcel parcel) {
            return new FundDocsNoticeInfo((MoneyEntity) parcel.readParcelable(FundDocsNoticeInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundDocsNoticeInfo[] newArray(int i) {
            return new FundDocsNoticeInfo[i];
        }
    }
}
