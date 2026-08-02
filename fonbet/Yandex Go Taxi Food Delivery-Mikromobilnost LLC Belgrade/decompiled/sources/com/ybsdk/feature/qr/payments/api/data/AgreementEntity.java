package com.ybsdk.feature.qr.payments.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/AgreementEntity;", "Landroid/os/Parcelable;", "", "agreementId", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;)Lcom/ybsdk/feature/qr/payments/api/data/AgreementEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getTitle", "getDescription", "Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "getImage", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AgreementEntity implements Parcelable {
    public static final Parcelable.Creator<AgreementEntity> CREATOR = new Creator();
    private final String agreementId;
    private final String description;
    private final AgreementImageEntity image;
    private final String title;

    public AgreementEntity(String str, String str2, String str3, AgreementImageEntity agreementImageEntity) {
        this.agreementId = str;
        this.title = str2;
        this.description = str3;
        this.image = agreementImageEntity;
    }

    public static /* synthetic */ AgreementEntity copy$default(AgreementEntity agreementEntity, String str, String str2, String str3, AgreementImageEntity agreementImageEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementEntity.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = agreementEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = agreementEntity.description;
        }
        if ((i & 8) != 0) {
            agreementImageEntity = agreementEntity.image;
        }
        return agreementEntity.copy(str, str2, str3, agreementImageEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final AgreementImageEntity getImage() {
        return this.image;
    }

    public final AgreementEntity copy(String agreementId, String title, String description, AgreementImageEntity image) {
        return new AgreementEntity(agreementId, title, description, image);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementEntity)) {
            return false;
        }
        AgreementEntity agreementEntity = (AgreementEntity) other;
        return jl40.l(this.agreementId, agreementEntity.agreementId) && jl40.l(this.title, agreementEntity.title) && jl40.l(this.description, agreementEntity.description) && jl40.l(this.image, agreementEntity.image);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AgreementImageEntity getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.title), 31, this.description);
        AgreementImageEntity agreementImageEntity = this.image;
        return b + (agreementImageEntity == null ? 0 : agreementImageEntity.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.description;
        AgreementImageEntity agreementImageEntity = this.image;
        StringBuilder v = b64.v("AgreementEntity(agreementId=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", image=");
        v.append(agreementImageEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeParcelable(this.image, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AgreementEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementEntity createFromParcel(Parcel parcel) {
            return new AgreementEntity(parcel.readString(), parcel.readString(), parcel.readString(), (AgreementImageEntity) parcel.readParcelable(AgreementEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementEntity[] newArray(int i) {
            return new AgreementEntity[i];
        }
    }
}
