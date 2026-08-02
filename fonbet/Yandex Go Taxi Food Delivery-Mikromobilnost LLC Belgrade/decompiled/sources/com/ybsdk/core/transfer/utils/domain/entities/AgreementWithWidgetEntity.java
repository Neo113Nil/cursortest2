package com.ybsdk.core.transfer.utils.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001e¨\u00061"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementWithWidgetEntity;", "Landroid/os/Parcelable;", "", "agreementId", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "image", "tooltip", "Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "component5", "component6", "()Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;)Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementWithWidgetEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getTitle", "getDescription", "Lcom/ybsdk/core/transfer/utils/domain/entities/AgreementImageEntity;", "getImage", "getTooltip", "Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;", "getWidget", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AgreementWithWidgetEntity implements Parcelable {
    public static final Parcelable.Creator<AgreementWithWidgetEntity> CREATOR = new Creator();
    private final String agreementId;
    private final String description;
    private final AgreementImageEntity image;
    private final String title;
    private final String tooltip;
    private final UnconditionalLimitWidgetEntity widget;

    public AgreementWithWidgetEntity(String str, String str2, String str3, AgreementImageEntity agreementImageEntity, String str4, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity) {
        this.agreementId = str;
        this.title = str2;
        this.description = str3;
        this.image = agreementImageEntity;
        this.tooltip = str4;
        this.widget = unconditionalLimitWidgetEntity;
    }

    public static /* synthetic */ AgreementWithWidgetEntity copy$default(AgreementWithWidgetEntity agreementWithWidgetEntity, String str, String str2, String str3, AgreementImageEntity agreementImageEntity, String str4, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementWithWidgetEntity.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = agreementWithWidgetEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = agreementWithWidgetEntity.description;
        }
        if ((i & 8) != 0) {
            agreementImageEntity = agreementWithWidgetEntity.image;
        }
        if ((i & 16) != 0) {
            str4 = agreementWithWidgetEntity.tooltip;
        }
        if ((i & 32) != 0) {
            unconditionalLimitWidgetEntity = agreementWithWidgetEntity.widget;
        }
        String str5 = str4;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity2 = unconditionalLimitWidgetEntity;
        return agreementWithWidgetEntity.copy(str, str2, str3, agreementImageEntity, str5, unconditionalLimitWidgetEntity2);
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

    /* renamed from: component5, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final UnconditionalLimitWidgetEntity getWidget() {
        return this.widget;
    }

    public final AgreementWithWidgetEntity copy(String agreementId, String title, String description, AgreementImageEntity image, String tooltip, UnconditionalLimitWidgetEntity widget) {
        return new AgreementWithWidgetEntity(agreementId, title, description, image, tooltip, widget);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementWithWidgetEntity)) {
            return false;
        }
        AgreementWithWidgetEntity agreementWithWidgetEntity = (AgreementWithWidgetEntity) other;
        return jl40.l(this.agreementId, agreementWithWidgetEntity.agreementId) && jl40.l(this.title, agreementWithWidgetEntity.title) && jl40.l(this.description, agreementWithWidgetEntity.description) && jl40.l(this.image, agreementWithWidgetEntity.image) && jl40.l(this.tooltip, agreementWithWidgetEntity.tooltip) && jl40.l(this.widget, agreementWithWidgetEntity.widget);
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

    public final String getTooltip() {
        return this.tooltip;
    }

    public final UnconditionalLimitWidgetEntity getWidget() {
        return this.widget;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.title), 31, this.description);
        AgreementImageEntity agreementImageEntity = this.image;
        int hashCode = (b + (agreementImageEntity == null ? 0 : agreementImageEntity.hashCode())) * 31;
        String str = this.tooltip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.widget;
        return hashCode2 + (unconditionalLimitWidgetEntity != null ? unconditionalLimitWidgetEntity.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.description;
        AgreementImageEntity agreementImageEntity = this.image;
        String str4 = this.tooltip;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.widget;
        StringBuilder v = b64.v("AgreementWithWidgetEntity(agreementId=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", image=");
        v.append(agreementImageEntity);
        v.append(", tooltip=");
        v.append(str4);
        v.append(", widget=");
        v.append(unconditionalLimitWidgetEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.title);
        dest.writeString(this.description);
        AgreementImageEntity agreementImageEntity = this.image;
        if (agreementImageEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            agreementImageEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.tooltip);
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.widget;
        if (unconditionalLimitWidgetEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            unconditionalLimitWidgetEntity.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AgreementWithWidgetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementWithWidgetEntity createFromParcel(Parcel parcel) {
            return new AgreementWithWidgetEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AgreementImageEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? UnconditionalLimitWidgetEntity.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgreementWithWidgetEntity[] newArray(int i) {
            return new AgreementWithWidgetEntity[i];
        }
    }
}
