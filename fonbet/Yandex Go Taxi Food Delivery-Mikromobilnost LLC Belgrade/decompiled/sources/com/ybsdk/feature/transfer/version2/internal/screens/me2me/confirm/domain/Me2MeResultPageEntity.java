package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/domain/Me2MeResultPageEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "header", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "ybInfo", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "component2", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/domain/Me2MeResultPageEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "getHeader", "Lcom/ybsdk/core/transfer/utils/domain/entities/PartnerEntity;", "getYbInfo", "Ljava/lang/String;", "getTitle", "getDescription", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeResultPageEntity implements Parcelable {
    public static final Parcelable.Creator<Me2MeResultPageEntity> CREATOR = new Creator();
    private final String description;
    private final PageHeaderEntity header;
    private final String title;
    private final PartnerEntity ybInfo;

    public Me2MeResultPageEntity(PageHeaderEntity pageHeaderEntity, PartnerEntity partnerEntity, String str, String str2) {
        this.header = pageHeaderEntity;
        this.ybInfo = partnerEntity;
        this.title = str;
        this.description = str2;
    }

    public static /* synthetic */ Me2MeResultPageEntity copy$default(Me2MeResultPageEntity me2MeResultPageEntity, PageHeaderEntity pageHeaderEntity, PartnerEntity partnerEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderEntity = me2MeResultPageEntity.header;
        }
        if ((i & 2) != 0) {
            partnerEntity = me2MeResultPageEntity.ybInfo;
        }
        if ((i & 4) != 0) {
            str = me2MeResultPageEntity.title;
        }
        if ((i & 8) != 0) {
            str2 = me2MeResultPageEntity.description;
        }
        return me2MeResultPageEntity.copy(pageHeaderEntity, partnerEntity, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderEntity getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final PartnerEntity getYbInfo() {
        return this.ybInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Me2MeResultPageEntity copy(PageHeaderEntity header, PartnerEntity ybInfo, String title, String description) {
        return new Me2MeResultPageEntity(header, ybInfo, title, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeResultPageEntity)) {
            return false;
        }
        Me2MeResultPageEntity me2MeResultPageEntity = (Me2MeResultPageEntity) other;
        return jl40.l(this.header, me2MeResultPageEntity.header) && jl40.l(this.ybInfo, me2MeResultPageEntity.ybInfo) && jl40.l(this.title, me2MeResultPageEntity.title) && jl40.l(this.description, me2MeResultPageEntity.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final PageHeaderEntity getHeader() {
        return this.header;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PartnerEntity getYbInfo() {
        return this.ybInfo;
    }

    public int hashCode() {
        return this.description.hashCode() + unr0.b((this.ybInfo.hashCode() + (this.header.hashCode() * 31)) * 31, 31, this.title);
    }

    public String toString() {
        PageHeaderEntity pageHeaderEntity = this.header;
        PartnerEntity partnerEntity = this.ybInfo;
        String str = this.title;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder("Me2MeResultPageEntity(header=");
        sb.append(pageHeaderEntity);
        sb.append(", ybInfo=");
        sb.append(partnerEntity);
        sb.append(", title=");
        return g8e.r(sb, str, ", description=", str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.header, flags);
        dest.writeParcelable(this.ybInfo, flags);
        dest.writeString(this.title);
        dest.writeString(this.description);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Me2MeResultPageEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Me2MeResultPageEntity createFromParcel(Parcel parcel) {
            return new Me2MeResultPageEntity((PageHeaderEntity) parcel.readParcelable(Me2MeResultPageEntity.class.getClassLoader()), (PartnerEntity) parcel.readParcelable(Me2MeResultPageEntity.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Me2MeResultPageEntity[] newArray(int i) {
            return new Me2MeResultPageEntity[i];
        }
    }
}
