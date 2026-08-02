package com.ybsdk.feature.settings.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/settings/api/data/SettingDto;", "", "key", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionColor", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", BackendConfig.Restrictions.ENABLED, "", "property", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;ZLcom/ybsdk/feature/settings/api/data/SettingPropertyDto;)V", "getKey", "()Ljava/lang/String;", "getTitle", "getDescription", "getDescriptionColor", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getEnabled", "()Z", "getProperty", "()Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SettingDto {
    private final String description;
    private final ThemedParameter<String> descriptionColor;
    private final boolean enabled;
    private final String key;
    private final SettingPropertyDto property;
    private final String title;

    public SettingDto(@Json(name = "key") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "description_color") ThemedParameter<String> themedParameter, @Json(name = "enabled") boolean z, @Json(name = "property") SettingPropertyDto settingPropertyDto) {
        this.key = str;
        this.title = str2;
        this.description = str3;
        this.descriptionColor = themedParameter;
        this.enabled = z;
        this.property = settingPropertyDto;
    }

    public static /* synthetic */ SettingDto copy$default(SettingDto settingDto, String str, String str2, String str3, ThemedParameter themedParameter, boolean z, SettingPropertyDto settingPropertyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingDto.key;
        }
        if ((i & 2) != 0) {
            str2 = settingDto.title;
        }
        if ((i & 4) != 0) {
            str3 = settingDto.description;
        }
        if ((i & 8) != 0) {
            themedParameter = settingDto.descriptionColor;
        }
        if ((i & 16) != 0) {
            z = settingDto.enabled;
        }
        if ((i & 32) != 0) {
            settingPropertyDto = settingDto.property;
        }
        boolean z2 = z;
        SettingPropertyDto settingPropertyDto2 = settingPropertyDto;
        return settingDto.copy(str, str2, str3, themedParameter, z2, settingPropertyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> component4() {
        return this.descriptionColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final SettingPropertyDto getProperty() {
        return this.property;
    }

    public final SettingDto copy(@Json(name = "key") String key, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "description_color") ThemedParameter<String> descriptionColor, @Json(name = "enabled") boolean enabled, @Json(name = "property") SettingPropertyDto property) {
        return new SettingDto(key, title, description, descriptionColor, enabled, property);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingDto)) {
            return false;
        }
        SettingDto settingDto = (SettingDto) other;
        return jl40.l(this.key, settingDto.key) && jl40.l(this.title, settingDto.title) && jl40.l(this.description, settingDto.description) && jl40.l(this.descriptionColor, settingDto.descriptionColor) && this.enabled == settingDto.enabled && jl40.l(this.property, settingDto.property);
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> getDescriptionColor() {
        return this.descriptionColor;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getKey() {
        return this.key;
    }

    public final SettingPropertyDto getProperty() {
        return this.property;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.key.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.descriptionColor;
        int e = unr0.e((hashCode + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31, 31, this.enabled);
        SettingPropertyDto settingPropertyDto = this.property;
        return e + (settingPropertyDto != null ? settingPropertyDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        String str3 = this.description;
        ThemedParameter<String> themedParameter = this.descriptionColor;
        boolean z = this.enabled;
        SettingPropertyDto settingPropertyDto = this.property;
        StringBuilder v = b64.v("SettingDto(key=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", descriptionColor=");
        v.append(themedParameter);
        v.append(", enabled=");
        v.append(z);
        v.append(", property=");
        v.append(settingPropertyDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ SettingDto(String str, String str2, String str3, ThemedParameter themedParameter, boolean z, SettingPropertyDto settingPropertyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, themedParameter, z, (i & 32) != 0 ? null : settingPropertyDto);
    }
}
