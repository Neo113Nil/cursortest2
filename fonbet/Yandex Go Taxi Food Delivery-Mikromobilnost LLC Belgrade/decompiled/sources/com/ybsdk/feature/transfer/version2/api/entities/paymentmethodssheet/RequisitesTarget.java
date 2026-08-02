package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesTarget;", "Landroid/os/Parcelable;", "", "title", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisitesTarget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesTarget implements Parcelable {
    public static final Parcelable.Creator<RequisitesTarget> CREATOR = new Creator();
    private final ThemedImageUrlEntity image;
    private final String title;

    public RequisitesTarget(String str, ThemedImageUrlEntity themedImageUrlEntity) {
        this.title = str;
        this.image = themedImageUrlEntity;
    }

    public static /* synthetic */ RequisitesTarget copy$default(RequisitesTarget requisitesTarget, String str, ThemedImageUrlEntity themedImageUrlEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesTarget.title;
        }
        if ((i & 2) != 0) {
            themedImageUrlEntity = requisitesTarget.image;
        }
        return requisitesTarget.copy(str, themedImageUrlEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final RequisitesTarget copy(String title, ThemedImageUrlEntity image) {
        return new RequisitesTarget(title, image);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesTarget)) {
            return false;
        }
        RequisitesTarget requisitesTarget = (RequisitesTarget) other;
        return jl40.l(this.title, requisitesTarget.title) && jl40.l(this.image, requisitesTarget.image);
    }

    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.image.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "RequisitesTarget(title=" + this.title + ", image=" + this.image + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeParcelable(this.image, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisitesTarget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesTarget createFromParcel(Parcel parcel) {
            return new RequisitesTarget(parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(RequisitesTarget.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisitesTarget[] newArray(int i) {
            return new RequisitesTarget[i];
        }
    }
}
