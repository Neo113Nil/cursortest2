package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ju\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementWithWidgetDto;", "", "agreementId", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;", "tooltip", "tooltipAction", "tooltipActionText", "tooltipActionImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "widget", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;)V", "getAgreementId", "()Ljava/lang/String;", "getTitle", "getDescription", "getImage", "()Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;", "getTooltip", "getTooltipAction", "getTooltipActionText", "getTooltipActionImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getWidget", "()Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AgreementWithWidgetDto {
    private final String agreementId;
    private final String description;
    private final AgreementImageDto image;
    private final String title;
    private final String tooltip;
    private final String tooltipAction;
    private final Themes<String> tooltipActionImage;
    private final String tooltipActionText;
    private final UnconditionalLimitWidgetDto widget;

    public AgreementWithWidgetDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "image") AgreementImageDto agreementImageDto, @Json(name = "tooltip") String str4, @Json(name = "tooltip_action") String str5, @Json(name = "tooltip_action_text") String str6, @Json(name = "tooltip_action_image") Themes<String> themes, @Json(name = "widget") UnconditionalLimitWidgetDto unconditionalLimitWidgetDto) {
        this.agreementId = str;
        this.title = str2;
        this.description = str3;
        this.image = agreementImageDto;
        this.tooltip = str4;
        this.tooltipAction = str5;
        this.tooltipActionText = str6;
        this.tooltipActionImage = themes;
        this.widget = unconditionalLimitWidgetDto;
    }

    public static /* synthetic */ AgreementWithWidgetDto copy$default(AgreementWithWidgetDto agreementWithWidgetDto, String str, String str2, String str3, AgreementImageDto agreementImageDto, String str4, String str5, String str6, Themes themes, UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementWithWidgetDto.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = agreementWithWidgetDto.title;
        }
        if ((i & 4) != 0) {
            str3 = agreementWithWidgetDto.description;
        }
        if ((i & 8) != 0) {
            agreementImageDto = agreementWithWidgetDto.image;
        }
        if ((i & 16) != 0) {
            str4 = agreementWithWidgetDto.tooltip;
        }
        if ((i & 32) != 0) {
            str5 = agreementWithWidgetDto.tooltipAction;
        }
        if ((i & 64) != 0) {
            str6 = agreementWithWidgetDto.tooltipActionText;
        }
        if ((i & 128) != 0) {
            themes = agreementWithWidgetDto.tooltipActionImage;
        }
        if ((i & 256) != 0) {
            unconditionalLimitWidgetDto = agreementWithWidgetDto.widget;
        }
        Themes themes2 = themes;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto2 = unconditionalLimitWidgetDto;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return agreementWithWidgetDto.copy(str, str2, str10, agreementImageDto, str9, str7, str8, themes2, unconditionalLimitWidgetDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final AgreementImageDto getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    public final Themes<String> component8() {
        return this.tooltipActionImage;
    }

    /* renamed from: component9, reason: from getter */
    public final UnconditionalLimitWidgetDto getWidget() {
        return this.widget;
    }

    public final AgreementWithWidgetDto copy(@Json(name = "id") String agreementId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") AgreementImageDto image, @Json(name = "tooltip") String tooltip, @Json(name = "tooltip_action") String tooltipAction, @Json(name = "tooltip_action_text") String tooltipActionText, @Json(name = "tooltip_action_image") Themes<String> tooltipActionImage, @Json(name = "widget") UnconditionalLimitWidgetDto widget) {
        return new AgreementWithWidgetDto(agreementId, title, description, image, tooltip, tooltipAction, tooltipActionText, tooltipActionImage, widget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementWithWidgetDto)) {
            return false;
        }
        AgreementWithWidgetDto agreementWithWidgetDto = (AgreementWithWidgetDto) other;
        return jl40.l(this.agreementId, agreementWithWidgetDto.agreementId) && jl40.l(this.title, agreementWithWidgetDto.title) && jl40.l(this.description, agreementWithWidgetDto.description) && jl40.l(this.image, agreementWithWidgetDto.image) && jl40.l(this.tooltip, agreementWithWidgetDto.tooltip) && jl40.l(this.tooltipAction, agreementWithWidgetDto.tooltipAction) && jl40.l(this.tooltipActionText, agreementWithWidgetDto.tooltipActionText) && jl40.l(this.tooltipActionImage, agreementWithWidgetDto.tooltipActionImage) && jl40.l(this.widget, agreementWithWidgetDto.widget);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AgreementImageDto getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    public final Themes<String> getTooltipActionImage() {
        return this.tooltipActionImage;
    }

    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    public final UnconditionalLimitWidgetDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.title), 31, this.description);
        AgreementImageDto agreementImageDto = this.image;
        int hashCode = (b + (agreementImageDto == null ? 0 : agreementImageDto.hashCode())) * 31;
        String str = this.tooltip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tooltipAction;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipActionText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Themes<String> themes = this.tooltipActionImage;
        int hashCode5 = (hashCode4 + (themes == null ? 0 : themes.hashCode())) * 31;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.widget;
        return hashCode5 + (unconditionalLimitWidgetDto != null ? unconditionalLimitWidgetDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.description;
        AgreementImageDto agreementImageDto = this.image;
        String str4 = this.tooltip;
        String str5 = this.tooltipAction;
        String str6 = this.tooltipActionText;
        Themes<String> themes = this.tooltipActionImage;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.widget;
        StringBuilder v = b64.v("AgreementWithWidgetDto(agreementId=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", image=");
        v.append(agreementImageDto);
        v.append(", tooltip=");
        g8e.D(v, str4, ", tooltipAction=", str5, ", tooltipActionText=");
        n.B(v, str6, ", tooltipActionImage=", themes, ", widget=");
        v.append(unconditionalLimitWidgetDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
