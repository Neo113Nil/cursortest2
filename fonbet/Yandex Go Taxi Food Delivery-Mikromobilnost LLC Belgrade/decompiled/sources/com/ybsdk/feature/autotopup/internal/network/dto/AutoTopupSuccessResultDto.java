package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSuccessResultDto;", "", "autoTopupId", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "firstButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "secondButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getAutoTopupId", "()Ljava/lang/String;", "getTitle", "getDescription", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getFirstButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getSecondButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSuccessResultDto {
    private final String autoTopupId;
    private final String description;
    private final ActionButtonDto firstButton;
    private final Themes<String> logo;
    private final ActionButtonDto secondButton;
    private final String title;

    public AutoTopupSuccessResultDto(@Json(name = "autotopup_id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "logo") Themes<String> themes, @Json(name = "ok_button") ActionButtonDto actionButtonDto, @Json(name = "second_button") ActionButtonDto actionButtonDto2) {
        this.autoTopupId = str;
        this.title = str2;
        this.description = str3;
        this.logo = themes;
        this.firstButton = actionButtonDto;
        this.secondButton = actionButtonDto2;
    }

    public static /* synthetic */ AutoTopupSuccessResultDto copy$default(AutoTopupSuccessResultDto autoTopupSuccessResultDto, String str, String str2, String str3, Themes themes, ActionButtonDto actionButtonDto, ActionButtonDto actionButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSuccessResultDto.autoTopupId;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupSuccessResultDto.title;
        }
        if ((i & 4) != 0) {
            str3 = autoTopupSuccessResultDto.description;
        }
        if ((i & 8) != 0) {
            themes = autoTopupSuccessResultDto.logo;
        }
        if ((i & 16) != 0) {
            actionButtonDto = autoTopupSuccessResultDto.firstButton;
        }
        if ((i & 32) != 0) {
            actionButtonDto2 = autoTopupSuccessResultDto.secondButton;
        }
        ActionButtonDto actionButtonDto3 = actionButtonDto;
        ActionButtonDto actionButtonDto4 = actionButtonDto2;
        return autoTopupSuccessResultDto.copy(str, str2, str3, themes, actionButtonDto3, actionButtonDto4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component4() {
        return this.logo;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ActionButtonDto getSecondButton() {
        return this.secondButton;
    }

    public final AutoTopupSuccessResultDto copy(@Json(name = "autotopup_id") String autoTopupId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") Themes<String> logo, @Json(name = "ok_button") ActionButtonDto firstButton, @Json(name = "second_button") ActionButtonDto secondButton) {
        return new AutoTopupSuccessResultDto(autoTopupId, title, description, logo, firstButton, secondButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSuccessResultDto)) {
            return false;
        }
        AutoTopupSuccessResultDto autoTopupSuccessResultDto = (AutoTopupSuccessResultDto) other;
        return jl40.l(this.autoTopupId, autoTopupSuccessResultDto.autoTopupId) && jl40.l(this.title, autoTopupSuccessResultDto.title) && jl40.l(this.description, autoTopupSuccessResultDto.description) && jl40.l(this.logo, autoTopupSuccessResultDto.logo) && jl40.l(this.firstButton, autoTopupSuccessResultDto.firstButton) && jl40.l(this.secondButton, autoTopupSuccessResultDto.secondButton);
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ActionButtonDto getFirstButton() {
        return this.firstButton;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final ActionButtonDto getSecondButton() {
        return this.secondButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.autoTopupId.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.logo;
        int hashCode2 = (this.firstButton.hashCode() + ((hashCode + (themes == null ? 0 : themes.hashCode())) * 31)) * 31;
        ActionButtonDto actionButtonDto = this.secondButton;
        return hashCode2 + (actionButtonDto != null ? actionButtonDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.autoTopupId;
        String str2 = this.title;
        String str3 = this.description;
        Themes<String> themes = this.logo;
        ActionButtonDto actionButtonDto = this.firstButton;
        ActionButtonDto actionButtonDto2 = this.secondButton;
        StringBuilder v = b64.v("AutoTopupSuccessResultDto(autoTopupId=", str, ", title=", str2, ", description=");
        n.B(v, str3, ", logo=", themes, ", firstButton=");
        v.append(actionButtonDto);
        v.append(", secondButton=");
        v.append(actionButtonDto2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
