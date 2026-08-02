package com.ybsdk.feature.autotopup.internal.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionItemEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "", "text", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionItemEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "Ljava/lang/String;", "getText", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IntroductionItemEntity implements Parcelable {
    public static final Parcelable.Creator<IntroductionItemEntity> CREATOR = new Creator();
    private final ThemedImageUrlEntity image;
    private final String text;

    public IntroductionItemEntity(ThemedImageUrlEntity themedImageUrlEntity, String str) {
        this.image = themedImageUrlEntity;
        this.text = str;
    }

    public static /* synthetic */ IntroductionItemEntity copy$default(IntroductionItemEntity introductionItemEntity, ThemedImageUrlEntity themedImageUrlEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = introductionItemEntity.image;
        }
        if ((i & 2) != 0) {
            str = introductionItemEntity.text;
        }
        return introductionItemEntity.copy(themedImageUrlEntity, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final IntroductionItemEntity copy(ThemedImageUrlEntity image, String text) {
        return new IntroductionItemEntity(image, text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroductionItemEntity)) {
            return false;
        }
        IntroductionItemEntity introductionItemEntity = (IntroductionItemEntity) other;
        return jl40.l(this.image, introductionItemEntity.image) && jl40.l(this.text, introductionItemEntity.text);
    }

    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.image;
        return this.text.hashCode() + ((themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31);
    }

    public String toString() {
        return "IntroductionItemEntity(image=" + this.image + ", text=" + this.text + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.image, flags);
        dest.writeString(this.text);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntroductionItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroductionItemEntity createFromParcel(Parcel parcel) {
            return new IntroductionItemEntity((ThemedImageUrlEntity) parcel.readParcelable(IntroductionItemEntity.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroductionItemEntity[] newArray(int i) {
            return new IntroductionItemEntity[i];
        }
    }
}
