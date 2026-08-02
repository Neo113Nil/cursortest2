package com.ybsdk.feature.transfer.internal.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.transfer.api.entities.TransferInfo;
import defpackage.jl40;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/domain/PartnersEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;", "transferInfo", "", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "partners", "<init>", "(Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;", "component2", "()Ljava/util/List;", "copy", "(Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;Ljava/util/List;)Lcom/ybsdk/feature/transfer/internal/domain/PartnersEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/api/entities/TransferInfo;", "getTransferInfo", "Ljava/util/List;", "getPartners", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PartnersEntity implements Parcelable {
    public static final Parcelable.Creator<PartnersEntity> CREATOR = new Creator();
    private final List<PartnerEntity> partners;
    private final TransferInfo transferInfo;

    public PartnersEntity(TransferInfo transferInfo, List<PartnerEntity> list) {
        this.transferInfo = transferInfo;
        this.partners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnersEntity copy$default(PartnersEntity partnersEntity, TransferInfo transferInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            transferInfo = partnersEntity.transferInfo;
        }
        if ((i & 2) != 0) {
            list = partnersEntity.partners;
        }
        return partnersEntity.copy(transferInfo, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferInfo getTransferInfo() {
        return this.transferInfo;
    }

    public final List<PartnerEntity> component2() {
        return this.partners;
    }

    public final PartnersEntity copy(TransferInfo transferInfo, List<PartnerEntity> partners) {
        return new PartnersEntity(transferInfo, partners);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnersEntity)) {
            return false;
        }
        PartnersEntity partnersEntity = (PartnersEntity) other;
        return jl40.l(this.transferInfo, partnersEntity.transferInfo) && jl40.l(this.partners, partnersEntity.partners);
    }

    public final List<PartnerEntity> getPartners() {
        return this.partners;
    }

    public final TransferInfo getTransferInfo() {
        return this.transferInfo;
    }

    public int hashCode() {
        return this.partners.hashCode() + (this.transferInfo.hashCode() * 31);
    }

    public String toString() {
        return "PartnersEntity(transferInfo=" + this.transferInfo + ", partners=" + this.partners + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.transferInfo, flags);
        Iterator t = vfc.t(dest, this.partners);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartnersEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnersEntity createFromParcel(Parcel parcel) {
            TransferInfo transferInfo = (TransferInfo) parcel.readParcelable(PartnersEntity.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(PartnersEntity.class, parcel, arrayList, i, 1);
            }
            return new PartnersEntity(transferInfo, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnersEntity[] newArray(int i) {
            return new PartnersEntity[i];
        }
    }
}
