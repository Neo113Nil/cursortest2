package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupDataDto;", "", BackendConfig.Restrictions.ENABLED, "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "typeSettings", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeSetting;", "titleEndBadge", "Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;)V", "getEnabled", "()Z", "getTitle", "()Ljava/lang/String;", "getDescription", "getTypeSettings", "()Ljava/util/List;", "getTitleEndBadge", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupDataDto {
    private final String description;
    private final boolean enabled;
    private final String title;
    private final TextBadgeDto titleEndBadge;
    private final List<AutoTopupTypeSetting> typeSettings;

    public AutoTopupDataDto(@Json(name = "enabled") boolean z, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "types_settings") List<AutoTopupTypeSetting> list, @Json(name = "title_end_badge") TextBadgeDto textBadgeDto) {
        this.enabled = z;
        this.title = str;
        this.description = str2;
        this.typeSettings = list;
        this.titleEndBadge = textBadgeDto;
    }

    public static /* synthetic */ AutoTopupDataDto copy$default(AutoTopupDataDto autoTopupDataDto, boolean z, String str, String str2, List list, TextBadgeDto textBadgeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoTopupDataDto.enabled;
        }
        if ((i & 2) != 0) {
            str = autoTopupDataDto.title;
        }
        if ((i & 4) != 0) {
            str2 = autoTopupDataDto.description;
        }
        if ((i & 8) != 0) {
            list = autoTopupDataDto.typeSettings;
        }
        if ((i & 16) != 0) {
            textBadgeDto = autoTopupDataDto.titleEndBadge;
        }
        TextBadgeDto textBadgeDto2 = textBadgeDto;
        String str3 = str2;
        return autoTopupDataDto.copy(z, str, str3, list, textBadgeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<AutoTopupTypeSetting> component4() {
        return this.typeSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final TextBadgeDto getTitleEndBadge() {
        return this.titleEndBadge;
    }

    public final AutoTopupDataDto copy(@Json(name = "enabled") boolean enabled, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "types_settings") List<AutoTopupTypeSetting> typeSettings, @Json(name = "title_end_badge") TextBadgeDto titleEndBadge) {
        return new AutoTopupDataDto(enabled, title, description, typeSettings, titleEndBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupDataDto)) {
            return false;
        }
        AutoTopupDataDto autoTopupDataDto = (AutoTopupDataDto) other;
        return this.enabled == autoTopupDataDto.enabled && jl40.l(this.title, autoTopupDataDto.title) && jl40.l(this.description, autoTopupDataDto.description) && jl40.l(this.typeSettings, autoTopupDataDto.typeSettings) && jl40.l(this.titleEndBadge, autoTopupDataDto.titleEndBadge);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TextBadgeDto getTitleEndBadge() {
        return this.titleEndBadge;
    }

    public final List<AutoTopupTypeSetting> getTypeSettings() {
        return this.typeSettings;
    }

    public int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.enabled) * 31, 31, this.title);
        String str = this.description;
        int c = unr0.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.typeSettings);
        TextBadgeDto textBadgeDto = this.titleEndBadge;
        return c + (textBadgeDto != null ? textBadgeDto.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.title;
        String str2 = this.description;
        List<AutoTopupTypeSetting> list = this.typeSettings;
        TextBadgeDto textBadgeDto = this.titleEndBadge;
        StringBuilder v = ly3.v("AutoTopupDataDto(enabled=", ", title=", str, ", description=", z);
        tse0.x(str2, ", typeSettings=", ", titleEndBadge=", v, list);
        v.append(textBadgeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
