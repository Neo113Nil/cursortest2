package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003JS\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/core/stories/dto/AdvertisementDisclosureDto;", "", "text", "", "action", "trailingIcon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "contentColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getAction", "getTrailingIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getContentColor", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdvertisementDisclosureDto {
    private final String action;
    private final Themes<String> backgroundColor;
    private final Themes<String> contentColor;
    private final String text;
    private final Themes<String> trailingIcon;

    public AdvertisementDisclosureDto(@Json(name = "text") String str, @Json(name = "action") String str2, @Json(name = "trailing_icon") Themes<String> themes, @Json(name = "content_color") Themes<String> themes2, @Json(name = "background_color") Themes<String> themes3) {
        this.text = str;
        this.action = str2;
        this.trailingIcon = themes;
        this.contentColor = themes2;
        this.backgroundColor = themes3;
    }

    public static /* synthetic */ AdvertisementDisclosureDto copy$default(AdvertisementDisclosureDto advertisementDisclosureDto, String str, String str2, Themes themes, Themes themes2, Themes themes3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advertisementDisclosureDto.text;
        }
        if ((i & 2) != 0) {
            str2 = advertisementDisclosureDto.action;
        }
        if ((i & 4) != 0) {
            themes = advertisementDisclosureDto.trailingIcon;
        }
        if ((i & 8) != 0) {
            themes2 = advertisementDisclosureDto.contentColor;
        }
        if ((i & 16) != 0) {
            themes3 = advertisementDisclosureDto.backgroundColor;
        }
        Themes themes4 = themes3;
        Themes themes5 = themes;
        return advertisementDisclosureDto.copy(str, str2, themes5, themes2, themes4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component3() {
        return this.trailingIcon;
    }

    public final Themes<String> component4() {
        return this.contentColor;
    }

    public final Themes<String> component5() {
        return this.backgroundColor;
    }

    public final AdvertisementDisclosureDto copy(@Json(name = "text") String text, @Json(name = "action") String action, @Json(name = "trailing_icon") Themes<String> trailingIcon, @Json(name = "content_color") Themes<String> contentColor, @Json(name = "background_color") Themes<String> backgroundColor) {
        return new AdvertisementDisclosureDto(text, action, trailingIcon, contentColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertisementDisclosureDto)) {
            return false;
        }
        AdvertisementDisclosureDto advertisementDisclosureDto = (AdvertisementDisclosureDto) other;
        return jl40.l(this.text, advertisementDisclosureDto.text) && jl40.l(this.action, advertisementDisclosureDto.action) && jl40.l(this.trailingIcon, advertisementDisclosureDto.trailingIcon) && jl40.l(this.contentColor, advertisementDisclosureDto.contentColor) && jl40.l(this.backgroundColor, advertisementDisclosureDto.backgroundColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Themes<String> getContentColor() {
        return this.contentColor;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        int b = unr0.b(this.text.hashCode() * 31, 31, this.action);
        Themes<String> themes = this.trailingIcon;
        int hashCode = (b + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.contentColor;
        int hashCode2 = (hashCode + (themes2 == null ? 0 : themes2.hashCode())) * 31;
        Themes<String> themes3 = this.backgroundColor;
        return hashCode2 + (themes3 != null ? themes3.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.action;
        Themes<String> themes = this.trailingIcon;
        Themes<String> themes2 = this.contentColor;
        Themes<String> themes3 = this.backgroundColor;
        StringBuilder v = b64.v("AdvertisementDisclosureDto(text=", str, ", action=", str2, ", trailingIcon=");
        v.append(themes);
        v.append(", contentColor=");
        v.append(themes2);
        v.append(", backgroundColor=");
        return smw0.l(v, themes3, Extension.C_BRAKE);
    }
}
