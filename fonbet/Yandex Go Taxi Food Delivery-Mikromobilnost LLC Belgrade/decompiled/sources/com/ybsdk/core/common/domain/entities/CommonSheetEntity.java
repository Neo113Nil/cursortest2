package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;", "primaryButton", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;)Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getDescription", "Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;", "getPrimaryButton", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonSheetEntity implements Parcelable {
    public static final Parcelable.Creator<CommonSheetEntity> CREATOR = new Creator();
    private final Text description;
    private final CommonSheetButtonEntity primaryButton;
    private final Text title;

    public CommonSheetEntity(Text text, Text text2, CommonSheetButtonEntity commonSheetButtonEntity) {
        this.title = text;
        this.description = text2;
        this.primaryButton = commonSheetButtonEntity;
    }

    public static /* synthetic */ CommonSheetEntity copy$default(CommonSheetEntity commonSheetEntity, Text text, Text text2, CommonSheetButtonEntity commonSheetButtonEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            text = commonSheetEntity.title;
        }
        if ((i & 2) != 0) {
            text2 = commonSheetEntity.description;
        }
        if ((i & 4) != 0) {
            commonSheetButtonEntity = commonSheetEntity.primaryButton;
        }
        return commonSheetEntity.copy(text, text2, commonSheetButtonEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonSheetButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    public final CommonSheetEntity copy(Text title, Text description, CommonSheetButtonEntity primaryButton) {
        return new CommonSheetEntity(title, description, primaryButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSheetEntity)) {
            return false;
        }
        CommonSheetEntity commonSheetEntity = (CommonSheetEntity) other;
        return jl40.l(this.title, commonSheetEntity.title) && jl40.l(this.description, commonSheetEntity.description) && jl40.l(this.primaryButton, commonSheetEntity.primaryButton);
    }

    public final Text getDescription() {
        return this.description;
    }

    public final CommonSheetButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.primaryButton.hashCode() + n.c(this.description, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        Text text = this.title;
        Text text2 = this.description;
        CommonSheetButtonEntity commonSheetButtonEntity = this.primaryButton;
        StringBuilder p = n.p("CommonSheetEntity(title=", text, ", description=", text2, ", primaryButton=");
        p.append(commonSheetButtonEntity);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.description, flags);
        this.primaryButton.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonSheetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonSheetEntity createFromParcel(Parcel parcel) {
            return new CommonSheetEntity((Text) parcel.readParcelable(CommonSheetEntity.class.getClassLoader()), (Text) parcel.readParcelable(CommonSheetEntity.class.getClassLoader()), CommonSheetButtonEntity.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonSheetEntity[] newArray(int i) {
            return new CommonSheetEntity[i];
        }
    }
}
