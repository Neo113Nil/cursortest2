package com.ybsdk.feature.partnerselection.internal.network.dto.partner;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/PartnerWithActionDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PartnerWithActionDto {
    private final String action;
    private final String description;
    private final Themes<String> image;
    private final String title;

    public PartnerWithActionDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "action") String str3) {
        this.title = str;
        this.description = str2;
        this.image = themes;
        this.action = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerWithActionDto copy$default(PartnerWithActionDto partnerWithActionDto, String str, String str2, Themes themes, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerWithActionDto.title;
        }
        if ((i & 2) != 0) {
            str2 = partnerWithActionDto.description;
        }
        if ((i & 4) != 0) {
            themes = partnerWithActionDto.image;
        }
        if ((i & 8) != 0) {
            str3 = partnerWithActionDto.action;
        }
        return partnerWithActionDto.copy(str, str2, themes, str3);
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
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final PartnerWithActionDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "action") String action) {
        return new PartnerWithActionDto(title, description, image, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerWithActionDto)) {
            return false;
        }
        PartnerWithActionDto partnerWithActionDto = (PartnerWithActionDto) other;
        return jl40.l(this.title, partnerWithActionDto.title) && jl40.l(this.description, partnerWithActionDto.description) && jl40.l(this.image, partnerWithActionDto.image) && jl40.l(this.action, partnerWithActionDto.action);
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

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.image;
        int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
        String str2 = this.action;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.image;
        String str3 = this.action;
        StringBuilder v = b64.v("PartnerWithActionDto(title=", str, ", description=", str2, ", image=");
        v.append(themes);
        v.append(", action=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
