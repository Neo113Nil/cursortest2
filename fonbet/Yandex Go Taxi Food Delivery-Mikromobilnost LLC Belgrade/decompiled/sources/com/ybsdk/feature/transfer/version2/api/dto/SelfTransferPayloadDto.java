package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "", "targetAgreementId", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionSpoilerEnabled", "", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTargetAgreementId", "()Ljava/lang/String;", "getTitle", "getDescription", "getDescriptionSpoilerEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;)Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelfTransferPayloadDto {
    private final String description;
    private final Boolean descriptionSpoilerEnabled;
    private final String targetAgreementId;
    private final Themes<String> themedImage;
    private final String title;

    public SelfTransferPayloadDto(@Json(name = "target_agreement_id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "description_spoiler_enabled") Boolean bool, @Json(name = "image") Themes<String> themes) {
        this.targetAgreementId = str;
        this.title = str2;
        this.description = str3;
        this.descriptionSpoilerEnabled = bool;
        this.themedImage = themes;
    }

    public static /* synthetic */ SelfTransferPayloadDto copy$default(SelfTransferPayloadDto selfTransferPayloadDto, String str, String str2, String str3, Boolean bool, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfTransferPayloadDto.targetAgreementId;
        }
        if ((i & 2) != 0) {
            str2 = selfTransferPayloadDto.title;
        }
        if ((i & 4) != 0) {
            str3 = selfTransferPayloadDto.description;
        }
        if ((i & 8) != 0) {
            bool = selfTransferPayloadDto.descriptionSpoilerEnabled;
        }
        if ((i & 16) != 0) {
            themes = selfTransferPayloadDto.themedImage;
        }
        Themes themes2 = themes;
        String str4 = str3;
        return selfTransferPayloadDto.copy(str, str2, str4, bool, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
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

    public final SelfTransferPayloadDto copy(@Json(name = "target_agreement_id") String targetAgreementId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "description_spoiler_enabled") Boolean descriptionSpoilerEnabled, @Json(name = "image") Themes<String> themedImage) {
        return new SelfTransferPayloadDto(targetAgreementId, title, description, descriptionSpoilerEnabled, themedImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfTransferPayloadDto)) {
            return false;
        }
        SelfTransferPayloadDto selfTransferPayloadDto = (SelfTransferPayloadDto) other;
        return jl40.l(this.targetAgreementId, selfTransferPayloadDto.targetAgreementId) && jl40.l(this.title, selfTransferPayloadDto.title) && jl40.l(this.description, selfTransferPayloadDto.description) && jl40.l(this.descriptionSpoilerEnabled, selfTransferPayloadDto.descriptionSpoilerEnabled) && jl40.l(this.themedImage, selfTransferPayloadDto.themedImage);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getDescriptionSpoilerEnabled() {
        return this.descriptionSpoilerEnabled;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.targetAgreementId.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.descriptionSpoilerEnabled;
        return this.themedImage.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.targetAgreementId;
        String str2 = this.title;
        String str3 = this.description;
        Boolean bool = this.descriptionSpoilerEnabled;
        Themes<String> themes = this.themedImage;
        StringBuilder v = b64.v("SelfTransferPayloadDto(targetAgreementId=", str, ", title=", str2, ", description=");
        tse0.A(v, str3, ", descriptionSpoilerEnabled=", bool, ", themedImage=");
        return smw0.l(v, themes, Extension.C_BRAKE);
    }
}
