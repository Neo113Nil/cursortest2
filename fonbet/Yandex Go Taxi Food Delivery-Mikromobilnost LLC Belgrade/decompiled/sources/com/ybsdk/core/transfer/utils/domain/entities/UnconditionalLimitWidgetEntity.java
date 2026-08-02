package com.ybsdk.core.transfer.utils.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.common.domain.entities.WidgetEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001f¨\u00064"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;", "Landroid/os/Parcelable;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "action", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "widgetType", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "darkTheme", "lightTheme", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component3", "component4", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "component5", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "component6", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;)Lcom/ybsdk/core/transfer/utils/domain/entities/UnconditionalLimitWidgetEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "getAction", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "getWidgetType", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "getDarkTheme", "getLightTheme", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnconditionalLimitWidgetEntity implements Parcelable {
    public static final Parcelable.Creator<UnconditionalLimitWidgetEntity> CREATOR = new Creator();
    private final String action;
    private final WidgetEntity.Theme darkTheme;
    private final String description;
    private final ThemedImageUrlEntity image;
    private final WidgetEntity.Theme lightTheme;
    private final WidgetEntity.Type widgetType;

    public UnconditionalLimitWidgetEntity(String str, ThemedImageUrlEntity themedImageUrlEntity, String str2, WidgetEntity.Type type, WidgetEntity.Theme theme, WidgetEntity.Theme theme2) {
        this.description = str;
        this.image = themedImageUrlEntity;
        this.action = str2;
        this.widgetType = type;
        this.darkTheme = theme;
        this.lightTheme = theme2;
    }

    public static /* synthetic */ UnconditionalLimitWidgetEntity copy$default(UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, String str, ThemedImageUrlEntity themedImageUrlEntity, String str2, WidgetEntity.Type type, WidgetEntity.Theme theme, WidgetEntity.Theme theme2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unconditionalLimitWidgetEntity.description;
        }
        if ((i & 2) != 0) {
            themedImageUrlEntity = unconditionalLimitWidgetEntity.image;
        }
        if ((i & 4) != 0) {
            str2 = unconditionalLimitWidgetEntity.action;
        }
        if ((i & 8) != 0) {
            type = unconditionalLimitWidgetEntity.widgetType;
        }
        if ((i & 16) != 0) {
            theme = unconditionalLimitWidgetEntity.darkTheme;
        }
        if ((i & 32) != 0) {
            theme2 = unconditionalLimitWidgetEntity.lightTheme;
        }
        WidgetEntity.Theme theme3 = theme;
        WidgetEntity.Theme theme4 = theme2;
        return unconditionalLimitWidgetEntity.copy(str, themedImageUrlEntity, str2, type, theme3, theme4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final WidgetEntity.Type getWidgetType() {
        return this.widgetType;
    }

    /* renamed from: component5, reason: from getter */
    public final WidgetEntity.Theme getDarkTheme() {
        return this.darkTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final WidgetEntity.Theme getLightTheme() {
        return this.lightTheme;
    }

    public final UnconditionalLimitWidgetEntity copy(String description, ThemedImageUrlEntity image, String action, WidgetEntity.Type widgetType, WidgetEntity.Theme darkTheme, WidgetEntity.Theme lightTheme) {
        return new UnconditionalLimitWidgetEntity(description, image, action, widgetType, darkTheme, lightTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnconditionalLimitWidgetEntity)) {
            return false;
        }
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = (UnconditionalLimitWidgetEntity) other;
        return jl40.l(this.description, unconditionalLimitWidgetEntity.description) && jl40.l(this.image, unconditionalLimitWidgetEntity.image) && jl40.l(this.action, unconditionalLimitWidgetEntity.action) && this.widgetType == unconditionalLimitWidgetEntity.widgetType && jl40.l(this.darkTheme, unconditionalLimitWidgetEntity.darkTheme) && jl40.l(this.lightTheme, unconditionalLimitWidgetEntity.lightTheme);
    }

    public final String getAction() {
        return this.action;
    }

    public final WidgetEntity.Theme getDarkTheme() {
        return this.darkTheme;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final WidgetEntity.Theme getLightTheme() {
        return this.lightTheme;
    }

    public final WidgetEntity.Type getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int hashCode = this.description.hashCode() * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.image;
        int hashCode2 = (hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str = this.action;
        int hashCode3 = (this.widgetType.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        WidgetEntity.Theme theme = this.darkTheme;
        int hashCode4 = (hashCode3 + (theme == null ? 0 : theme.hashCode())) * 31;
        WidgetEntity.Theme theme2 = this.lightTheme;
        return hashCode4 + (theme2 != null ? theme2.hashCode() : 0);
    }

    public String toString() {
        return "UnconditionalLimitWidgetEntity(description=" + this.description + ", image=" + this.image + ", action=" + this.action + ", widgetType=" + this.widgetType + ", darkTheme=" + this.darkTheme + ", lightTheme=" + this.lightTheme + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.description);
        dest.writeParcelable(this.image, flags);
        dest.writeString(this.action);
        dest.writeString(this.widgetType.name());
        dest.writeParcelable(this.darkTheme, flags);
        dest.writeParcelable(this.lightTheme, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnconditionalLimitWidgetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnconditionalLimitWidgetEntity createFromParcel(Parcel parcel) {
            return new UnconditionalLimitWidgetEntity(parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(UnconditionalLimitWidgetEntity.class.getClassLoader()), parcel.readString(), WidgetEntity.Type.valueOf(parcel.readString()), (WidgetEntity.Theme) parcel.readParcelable(UnconditionalLimitWidgetEntity.class.getClassLoader()), (WidgetEntity.Theme) parcel.readParcelable(UnconditionalLimitWidgetEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnconditionalLimitWidgetEntity[] newArray(int i) {
            return new UnconditionalLimitWidgetEntity[i];
        }
    }
}
