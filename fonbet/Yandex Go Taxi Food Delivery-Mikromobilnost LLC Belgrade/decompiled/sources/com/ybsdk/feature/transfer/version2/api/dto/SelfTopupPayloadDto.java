package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "", "sourceAgreementId", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionSpoilerEnabled", "", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "autoTopupWidgetData", "Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;", "legalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;Ljava/lang/String;)V", "getSourceAgreementId", "()Ljava/lang/String;", "getTitle", "getDescription", "getDescriptionSpoilerEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAutoTopupWidgetData", "()Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;", "getLegalText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelfTopupPayloadDto {
    private final AutoTopupWidgetDto autoTopupWidgetData;
    private final String description;
    private final Boolean descriptionSpoilerEnabled;
    private final String legalText;
    private final String sourceAgreementId;
    private final Themes<String> themedImage;
    private final String title;

    public SelfTopupPayloadDto(@Json(name = "source_agreement_id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "description_spoiler_enabled") Boolean bool, @Json(name = "image") Themes<String> themes, @Json(name = "autotopup_widget_data") AutoTopupWidgetDto autoTopupWidgetDto, @Json(name = "legal_text") String str4) {
        this.sourceAgreementId = str;
        this.title = str2;
        this.description = str3;
        this.descriptionSpoilerEnabled = bool;
        this.themedImage = themes;
        this.autoTopupWidgetData = autoTopupWidgetDto;
        this.legalText = str4;
    }

    public static /* synthetic */ SelfTopupPayloadDto copy$default(SelfTopupPayloadDto selfTopupPayloadDto, String str, String str2, String str3, Boolean bool, Themes themes, AutoTopupWidgetDto autoTopupWidgetDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfTopupPayloadDto.sourceAgreementId;
        }
        if ((i & 2) != 0) {
            str2 = selfTopupPayloadDto.title;
        }
        if ((i & 4) != 0) {
            str3 = selfTopupPayloadDto.description;
        }
        if ((i & 8) != 0) {
            bool = selfTopupPayloadDto.descriptionSpoilerEnabled;
        }
        if ((i & 16) != 0) {
            themes = selfTopupPayloadDto.themedImage;
        }
        if ((i & 32) != 0) {
            autoTopupWidgetDto = selfTopupPayloadDto.autoTopupWidgetData;
        }
        if ((i & 64) != 0) {
            str4 = selfTopupPayloadDto.legalText;
        }
        AutoTopupWidgetDto autoTopupWidgetDto2 = autoTopupWidgetDto;
        String str5 = str4;
        Themes themes2 = themes;
        String str6 = str3;
        return selfTopupPayloadDto.copy(str, str2, str6, bool, themes2, autoTopupWidgetDto2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
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
    public final Boolean getDescriptionSpoilerEnabled() {
        return this.descriptionSpoilerEnabled;
    }

    public final Themes<String> component5() {
        return this.themedImage;
    }

    /* renamed from: component6, reason: from getter */
    public final AutoTopupWidgetDto getAutoTopupWidgetData() {
        return this.autoTopupWidgetData;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLegalText() {
        return this.legalText;
    }

    public final SelfTopupPayloadDto copy(@Json(name = "source_agreement_id") String sourceAgreementId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "description_spoiler_enabled") Boolean descriptionSpoilerEnabled, @Json(name = "image") Themes<String> themedImage, @Json(name = "autotopup_widget_data") AutoTopupWidgetDto autoTopupWidgetData, @Json(name = "legal_text") String legalText) {
        return new SelfTopupPayloadDto(sourceAgreementId, title, description, descriptionSpoilerEnabled, themedImage, autoTopupWidgetData, legalText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfTopupPayloadDto)) {
            return false;
        }
        SelfTopupPayloadDto selfTopupPayloadDto = (SelfTopupPayloadDto) other;
        return jl40.l(this.sourceAgreementId, selfTopupPayloadDto.sourceAgreementId) && jl40.l(this.title, selfTopupPayloadDto.title) && jl40.l(this.description, selfTopupPayloadDto.description) && jl40.l(this.descriptionSpoilerEnabled, selfTopupPayloadDto.descriptionSpoilerEnabled) && jl40.l(this.themedImage, selfTopupPayloadDto.themedImage) && jl40.l(this.autoTopupWidgetData, selfTopupPayloadDto.autoTopupWidgetData) && jl40.l(this.legalText, selfTopupPayloadDto.legalText);
    }

    public final AutoTopupWidgetDto getAutoTopupWidgetData() {
        return this.autoTopupWidgetData;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getDescriptionSpoilerEnabled() {
        return this.descriptionSpoilerEnabled;
    }

    public final String getLegalText() {
        return this.legalText;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.sourceAgreementId.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.descriptionSpoilerEnabled;
        int c = nnm.c(this.themedImage, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        AutoTopupWidgetDto autoTopupWidgetDto = this.autoTopupWidgetData;
        int hashCode2 = (c + (autoTopupWidgetDto == null ? 0 : autoTopupWidgetDto.hashCode())) * 31;
        String str2 = this.legalText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.sourceAgreementId;
        String str2 = this.title;
        String str3 = this.description;
        Boolean bool = this.descriptionSpoilerEnabled;
        Themes<String> themes = this.themedImage;
        AutoTopupWidgetDto autoTopupWidgetDto = this.autoTopupWidgetData;
        String str4 = this.legalText;
        StringBuilder v = b64.v("SelfTopupPayloadDto(sourceAgreementId=", str, ", title=", str2, ", description=");
        tse0.A(v, str3, ", descriptionSpoilerEnabled=", bool, ", themedImage=");
        v.append(themes);
        v.append(", autoTopupWidgetData=");
        v.append(autoTopupWidgetDto);
        v.append(", legalText=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
