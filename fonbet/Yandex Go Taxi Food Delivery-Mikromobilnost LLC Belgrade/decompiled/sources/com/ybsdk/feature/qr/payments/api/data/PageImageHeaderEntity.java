package com.ybsdk.feature.qr.payments.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "titleImage", "cornerImage", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getTitleImage", "getCornerImage", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageImageHeaderEntity implements Parcelable {
    public static final Parcelable.Creator<PageImageHeaderEntity> CREATOR = new Creator();
    private final ThemedImageUrlEntity cornerImage;
    private final ThemedImageUrlEntity titleImage;

    public PageImageHeaderEntity(ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2) {
        this.titleImage = themedImageUrlEntity;
        this.cornerImage = themedImageUrlEntity2;
    }

    public static /* synthetic */ PageImageHeaderEntity copy$default(PageImageHeaderEntity pageImageHeaderEntity, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = pageImageHeaderEntity.titleImage;
        }
        if ((i & 2) != 0) {
            themedImageUrlEntity2 = pageImageHeaderEntity.cornerImage;
        }
        return pageImageHeaderEntity.copy(themedImageUrlEntity, themedImageUrlEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getTitleImage() {
        return this.titleImage;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImageUrlEntity getCornerImage() {
        return this.cornerImage;
    }

    public final PageImageHeaderEntity copy(ThemedImageUrlEntity titleImage, ThemedImageUrlEntity cornerImage) {
        return new PageImageHeaderEntity(titleImage, cornerImage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageImageHeaderEntity)) {
            return false;
        }
        PageImageHeaderEntity pageImageHeaderEntity = (PageImageHeaderEntity) other;
        return jl40.l(this.titleImage, pageImageHeaderEntity.titleImage) && jl40.l(this.cornerImage, pageImageHeaderEntity.cornerImage);
    }

    public final ThemedImageUrlEntity getCornerImage() {
        return this.cornerImage;
    }

    public final ThemedImageUrlEntity getTitleImage() {
        return this.titleImage;
    }

    public int hashCode() {
        int hashCode = this.titleImage.hashCode() * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.cornerImage;
        return hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode());
    }

    public String toString() {
        return "PageImageHeaderEntity(titleImage=" + this.titleImage + ", cornerImage=" + this.cornerImage + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.titleImage, flags);
        dest.writeParcelable(this.cornerImage, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PageImageHeaderEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageImageHeaderEntity createFromParcel(Parcel parcel) {
            return new PageImageHeaderEntity((ThemedImageUrlEntity) parcel.readParcelable(PageImageHeaderEntity.class.getClassLoader()), (ThemedImageUrlEntity) parcel.readParcelable(PageImageHeaderEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageImageHeaderEntity[] newArray(int i) {
            return new PageImageHeaderEntity[i];
        }
    }
}
