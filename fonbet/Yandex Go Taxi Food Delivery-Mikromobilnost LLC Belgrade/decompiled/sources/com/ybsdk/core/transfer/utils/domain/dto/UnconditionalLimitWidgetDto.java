package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "widgetType", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "themes", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getDescription", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "getWidgetType", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "getThemes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnconditionalLimitWidgetDto {
    private final String action;
    private final String description;
    private final Themes<String> image;
    private final Themes<WidgetDto.Theme> themes;
    private final WidgetDto.Type widgetType;

    public UnconditionalLimitWidgetDto(@Json(name = "description") String str, @Json(name = "image") Themes<String> themes, @Json(name = "action") String str2, @Json(name = "widget_type") WidgetDto.Type type, @Json(name = "themes") Themes<WidgetDto.Theme> themes2) {
        this.description = str;
        this.image = themes;
        this.action = str2;
        this.widgetType = type;
        this.themes = themes2;
    }

    public static /* synthetic */ UnconditionalLimitWidgetDto copy$default(UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, String str, Themes themes, String str2, WidgetDto.Type type, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unconditionalLimitWidgetDto.description;
        }
        if ((i & 2) != 0) {
            themes = unconditionalLimitWidgetDto.image;
        }
        if ((i & 4) != 0) {
            str2 = unconditionalLimitWidgetDto.action;
        }
        if ((i & 8) != 0) {
            type = unconditionalLimitWidgetDto.widgetType;
        }
        if ((i & 16) != 0) {
            themes2 = unconditionalLimitWidgetDto.themes;
        }
        Themes themes3 = themes2;
        String str3 = str2;
        return unconditionalLimitWidgetDto.copy(str, themes, str3, type, themes3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component2() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final WidgetDto.Type getWidgetType() {
        return this.widgetType;
    }

    public final Themes<WidgetDto.Theme> component5() {
        return this.themes;
    }

    public final UnconditionalLimitWidgetDto copy(@Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "action") String action, @Json(name = "widget_type") WidgetDto.Type widgetType, @Json(name = "themes") Themes<WidgetDto.Theme> themes) {
        return new UnconditionalLimitWidgetDto(description, image, action, widgetType, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnconditionalLimitWidgetDto)) {
            return false;
        }
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = (UnconditionalLimitWidgetDto) other;
        return jl40.l(this.description, unconditionalLimitWidgetDto.description) && jl40.l(this.image, unconditionalLimitWidgetDto.image) && jl40.l(this.action, unconditionalLimitWidgetDto.action) && this.widgetType == unconditionalLimitWidgetDto.widgetType && jl40.l(this.themes, unconditionalLimitWidgetDto.themes);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final Themes<WidgetDto.Theme> getThemes() {
        return this.themes;
    }

    public final WidgetDto.Type getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int hashCode = this.description.hashCode() * 31;
        Themes<String> themes = this.image;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        String str = this.action;
        int hashCode3 = str != null ? str.hashCode() : 0;
        return this.themes.hashCode() + ((this.widgetType.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public String toString() {
        String str = this.description;
        Themes<String> themes = this.image;
        String str2 = this.action;
        WidgetDto.Type type = this.widgetType;
        Themes<WidgetDto.Theme> themes2 = this.themes;
        StringBuilder sb = new StringBuilder("UnconditionalLimitWidgetDto(description=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themes);
        sb.append(", action=");
        sb.append(str2);
        sb.append(", widgetType=");
        sb.append(type);
        sb.append(", themes=");
        return smw0.l(sb, themes2, Extension.C_BRAKE);
    }
}
