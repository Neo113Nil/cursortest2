package com.ybsdk.core.transfer.utils.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "headerImage", "bottomSheetImage", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getHeaderImage", "getBottomSheetImage", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AgreementImageEntity implements Parcelable {
    public static final Parcelable.Creator<AgreementImageEntity> CREATOR = new Creator();
    private final ThemedImageUrlEntity bottomSheetImage;
    private final ThemedImageUrlEntity headerImage;

    public AgreementImageEntity(ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2) {
        this.headerImage = themedImageUrlEntity;
        this.bottomSheetImage = themedImageUrlEntity2;
    }

    public static /* synthetic */ AgreementImageEntity copy$default(AgreementImageEntity agreementImageEntity, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = agreementImageEntity.headerImage;
        }
        if ((i & 2) != 0) {
            themedImageUrlEntity2 = agreementImageEntity.bottomSheetImage;
        }
        return agreementImageEntity.copy(themedImageUrlEntity, themedImageUrlEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getHeaderImage() {
        return this.headerImage;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImageUrlEntity getBottomSheetImage() {
        return this.bottomSheetImage;
    }

    public final AgreementImageEntity copy(ThemedImageUrlEntity headerImage, ThemedImageUrlEntity bottomSheetImage) {
        return new AgreementImageEntity(headerImage, bottomSheetImage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementImageEntity)) {
            return false;
        }
        AgreementImageEntity agreementImageEntity = (AgreementImageEntity) other;
        return jl40.l(this.headerImage, agreementImageEntity.headerImage) && jl40.l(this.bottomSheetImage, agreementImageEntity.bottomSheetImage);
    }

    public final ThemedImageUrlEntity getBottomSheetImage() {
        return this.bottomSheetImage;
    }

    public final ThemedImageUrlEntity getHeaderImage() {
        return this.headerImage;
    }

    public int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.headerImage;
        int hashCode = (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31;
        ThemedImageUrlEntity themedImageUrlEntity2 = this.bottomSheetImage;
        return hashCode + (themedImageUrlEntity2 != null ? themedImageUrlEntity2.hashCode() : 0);
    }

    public String toString() {
        return "AgreementImageEntity(headerImage=" + this.headerImage + ", bottomSheetImage=" + this.bottomSheetImage + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.headerImage, flags);
        dest.writeParcelable(this.bottomSheetImage, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AgreementImageEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementImageEntity createFromParcel(Parcel parcel) {
            return new AgreementImageEntity((ThemedImageUrlEntity) parcel.readParcelable(AgreementImageEntity.class.getClassLoader()), (ThemedImageUrlEntity) parcel.readParcelable(AgreementImageEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementImageEntity[] newArray(int i) {
            return new AgreementImageEntity[i];
        }
    }
}
