package com.ybsdk.feature.transfer.version2.internal.network.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultErrorInfoDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "imageUrl", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "buttonPrimary", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "buttonSecondary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageUrl", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getButtonPrimary", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getButtonSecondary", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCheckResultErrorInfoDto {
    private final ActionButtonDto buttonPrimary;
    private final ActionButtonDto buttonSecondary;
    private final String description;
    private final Themes<String> imageUrl;
    private final String title;

    public YbCheckResultErrorInfoDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image_url") Themes<String> themes, @Json(name = "primary_button") ActionButtonDto actionButtonDto, @Json(name = "secondary_button") ActionButtonDto actionButtonDto2) {
        this.title = str;
        this.description = str2;
        this.imageUrl = themes;
        this.buttonPrimary = actionButtonDto;
        this.buttonSecondary = actionButtonDto2;
    }

    public static /* synthetic */ YbCheckResultErrorInfoDto copy$default(YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto, String str, String str2, Themes themes, ActionButtonDto actionButtonDto, ActionButtonDto actionButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCheckResultErrorInfoDto.title;
        }
        if ((i & 2) != 0) {
            str2 = ybCheckResultErrorInfoDto.description;
        }
        if ((i & 4) != 0) {
            themes = ybCheckResultErrorInfoDto.imageUrl;
        }
        if ((i & 8) != 0) {
            actionButtonDto = ybCheckResultErrorInfoDto.buttonPrimary;
        }
        if ((i & 16) != 0) {
            actionButtonDto2 = ybCheckResultErrorInfoDto.buttonSecondary;
        }
        ActionButtonDto actionButtonDto3 = actionButtonDto2;
        Themes themes2 = themes;
        return ybCheckResultErrorInfoDto.copy(str, str2, themes2, actionButtonDto, actionButtonDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component3() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionButtonDto getButtonPrimary() {
        return this.buttonPrimary;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getButtonSecondary() {
        return this.buttonSecondary;
    }

    public final YbCheckResultErrorInfoDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image_url") Themes<String> imageUrl, @Json(name = "primary_button") ActionButtonDto buttonPrimary, @Json(name = "secondary_button") ActionButtonDto buttonSecondary) {
        return new YbCheckResultErrorInfoDto(title, description, imageUrl, buttonPrimary, buttonSecondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCheckResultErrorInfoDto)) {
            return false;
        }
        YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto = (YbCheckResultErrorInfoDto) other;
        return jl40.l(this.title, ybCheckResultErrorInfoDto.title) && jl40.l(this.description, ybCheckResultErrorInfoDto.description) && jl40.l(this.imageUrl, ybCheckResultErrorInfoDto.imageUrl) && jl40.l(this.buttonPrimary, ybCheckResultErrorInfoDto.buttonPrimary) && jl40.l(this.buttonSecondary, ybCheckResultErrorInfoDto.buttonSecondary);
    }

    public final ActionButtonDto getButtonPrimary() {
        return this.buttonPrimary;
    }

    public final ActionButtonDto getButtonSecondary() {
        return this.buttonSecondary;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.imageUrl;
        int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
        ActionButtonDto actionButtonDto = this.buttonPrimary;
        int hashCode4 = (hashCode3 + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        ActionButtonDto actionButtonDto2 = this.buttonSecondary;
        return hashCode4 + (actionButtonDto2 != null ? actionButtonDto2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.imageUrl;
        ActionButtonDto actionButtonDto = this.buttonPrimary;
        ActionButtonDto actionButtonDto2 = this.buttonSecondary;
        StringBuilder v = b64.v("YbCheckResultErrorInfoDto(title=", str, ", description=", str2, ", imageUrl=");
        v.append(themes);
        v.append(", buttonPrimary=");
        v.append(actionButtonDto);
        v.append(", buttonSecondary=");
        v.append(actionButtonDto2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
