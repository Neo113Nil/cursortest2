package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/AdditionalButtonDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "themedLogo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLogo$annotations", "()V", "getLogo", "getThemedLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AdditionalButtonDto {
    private final String action;
    private final String description;
    private final String logo;
    private final Themes<String> themedLogo;
    private final String title;

    public AdditionalButtonDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "logo") String str3, @Json(name = "themed_logo") Themes<String> themes, @Json(name = "action") String str4) {
        this.title = str;
        this.description = str2;
        this.logo = str3;
        this.themedLogo = themes;
        this.action = str4;
    }

    public static /* synthetic */ AdditionalButtonDto copy$default(AdditionalButtonDto additionalButtonDto, String str, String str2, String str3, Themes themes, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalButtonDto.title;
        }
        if ((i & 2) != 0) {
            str2 = additionalButtonDto.description;
        }
        if ((i & 4) != 0) {
            str3 = additionalButtonDto.logo;
        }
        if ((i & 8) != 0) {
            themes = additionalButtonDto.themedLogo;
        }
        if ((i & 16) != 0) {
            str4 = additionalButtonDto.action;
        }
        String str5 = str4;
        String str6 = str3;
        return additionalButtonDto.copy(str, str2, str6, themes, str5);
    }

    @jxi
    public static /* synthetic */ void getLogo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> component4() {
        return this.themedLogo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final AdditionalButtonDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") String logo, @Json(name = "themed_logo") Themes<String> themedLogo, @Json(name = "action") String action) {
        return new AdditionalButtonDto(title, description, logo, themedLogo, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalButtonDto)) {
            return false;
        }
        AdditionalButtonDto additionalButtonDto = (AdditionalButtonDto) other;
        return jl40.l(this.title, additionalButtonDto.title) && jl40.l(this.description, additionalButtonDto.description) && jl40.l(this.logo, additionalButtonDto.logo) && jl40.l(this.themedLogo, additionalButtonDto.themedLogo) && jl40.l(this.action, additionalButtonDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> getThemedLogo() {
        return this.themedLogo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes = this.themedLogo;
        return this.action.hashCode() + ((hashCode3 + (themes != null ? themes.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.logo;
        Themes<String> themes = this.themedLogo;
        String str4 = this.action;
        StringBuilder v = b64.v("AdditionalButtonDto(title=", str, ", description=", str2, ", logo=");
        n.B(v, str3, ", themedLogo=", themes, ", action=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
