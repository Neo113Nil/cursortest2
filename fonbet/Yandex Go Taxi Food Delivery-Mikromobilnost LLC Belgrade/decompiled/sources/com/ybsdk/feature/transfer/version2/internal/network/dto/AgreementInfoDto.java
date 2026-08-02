package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.transfer.version2.api.dto.AgreementPrerequisiteDto;
import com.ybsdk.feature.transfer.version2.api.dto.TransferButtonDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u0010;\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006B"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AgreementInfoDto;", "", "id", "", "type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "agreementSheetDescription", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "buttons", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferButtonDto;", "prerequisite", "Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;", "suggests", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto;", "action", "onSelectedAction", "infoText", "onNewM2mBankSelectedAction", "fee", "infoSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTitle", "getDescription", "getAgreementSheetDescription", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getButtons", "()Ljava/util/List;", "getPrerequisite", "()Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;", "getSuggests", "getAction", "getOnSelectedAction", "getInfoText", "getOnNewM2mBankSelectedAction", "getFee", "getInfoSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AgreementInfoDto {
    private final String action;
    private final String agreementSheetDescription;
    private final List<TransferButtonDto> buttons;
    private final String description;
    private final String fee;
    private final String id;
    private final String infoSubtitle;
    private final String infoText;
    private final String onNewM2mBankSelectedAction;
    private final String onSelectedAction;
    private final AgreementPrerequisiteDto prerequisite;
    private final List<SuggestDto> suggests;
    private final Themes<String> themedImage;
    private final String title;
    private final String type;

    public AgreementInfoDto(@Json(name = "id") String str, @Json(name = "type") String str2, @Json(name = "title") String str3, @Json(name = "description") String str4, @Json(name = "agreement_sheet_description") String str5, @Json(name = "image") Themes<String> themes, @Json(name = "buttons") List<TransferButtonDto> list, @Json(name = "prerequisite") AgreementPrerequisiteDto agreementPrerequisiteDto, @Json(name = "suggests") List<SuggestDto> list2, @Json(name = "action") String str6, @Json(name = "on_selected_action") String str7, @Json(name = "info_text") String str8, @Json(name = "JSON_FIELD_ON_NEW_M2M_MEMBER_SELECTED_ACTION") String str9, @Json(name = "fee") String str10, @Json(name = "info_subtitle") String str11) {
        this.id = str;
        this.type = str2;
        this.title = str3;
        this.description = str4;
        this.agreementSheetDescription = str5;
        this.themedImage = themes;
        this.buttons = list;
        this.prerequisite = agreementPrerequisiteDto;
        this.suggests = list2;
        this.action = str6;
        this.onSelectedAction = str7;
        this.infoText = str8;
        this.onNewM2mBankSelectedAction = str9;
        this.fee = str10;
        this.infoSubtitle = str11;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOnSelectedAction() {
        return this.onSelectedAction;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInfoText() {
        return this.infoText;
    }

    /* renamed from: component13, reason: from getter */
    public final String getOnNewM2mBankSelectedAction() {
        return this.onNewM2mBankSelectedAction;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    /* renamed from: component15, reason: from getter */
    public final String getInfoSubtitle() {
        return this.infoSubtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementSheetDescription() {
        return this.agreementSheetDescription;
    }

    public final Themes<String> component6() {
        return this.themedImage;
    }

    public final List<TransferButtonDto> component7() {
        return this.buttons;
    }

    /* renamed from: component8, reason: from getter */
    public final AgreementPrerequisiteDto getPrerequisite() {
        return this.prerequisite;
    }

    public final List<SuggestDto> component9() {
        return this.suggests;
    }

    public final AgreementInfoDto copy(@Json(name = "id") String id, @Json(name = "type") String type, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "agreement_sheet_description") String agreementSheetDescription, @Json(name = "image") Themes<String> themedImage, @Json(name = "buttons") List<TransferButtonDto> buttons, @Json(name = "prerequisite") AgreementPrerequisiteDto prerequisite, @Json(name = "suggests") List<SuggestDto> suggests, @Json(name = "action") String action, @Json(name = "on_selected_action") String onSelectedAction, @Json(name = "info_text") String infoText, @Json(name = "JSON_FIELD_ON_NEW_M2M_MEMBER_SELECTED_ACTION") String onNewM2mBankSelectedAction, @Json(name = "fee") String fee, @Json(name = "info_subtitle") String infoSubtitle) {
        return new AgreementInfoDto(id, type, title, description, agreementSheetDescription, themedImage, buttons, prerequisite, suggests, action, onSelectedAction, infoText, onNewM2mBankSelectedAction, fee, infoSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementInfoDto)) {
            return false;
        }
        AgreementInfoDto agreementInfoDto = (AgreementInfoDto) other;
        return jl40.l(this.id, agreementInfoDto.id) && jl40.l(this.type, agreementInfoDto.type) && jl40.l(this.title, agreementInfoDto.title) && jl40.l(this.description, agreementInfoDto.description) && jl40.l(this.agreementSheetDescription, agreementInfoDto.agreementSheetDescription) && jl40.l(this.themedImage, agreementInfoDto.themedImage) && jl40.l(this.buttons, agreementInfoDto.buttons) && jl40.l(this.prerequisite, agreementInfoDto.prerequisite) && jl40.l(this.suggests, agreementInfoDto.suggests) && jl40.l(this.action, agreementInfoDto.action) && jl40.l(this.onSelectedAction, agreementInfoDto.onSelectedAction) && jl40.l(this.infoText, agreementInfoDto.infoText) && jl40.l(this.onNewM2mBankSelectedAction, agreementInfoDto.onNewM2mBankSelectedAction) && jl40.l(this.fee, agreementInfoDto.fee) && jl40.l(this.infoSubtitle, agreementInfoDto.infoSubtitle);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAgreementSheetDescription() {
        return this.agreementSheetDescription;
    }

    public final List<TransferButtonDto> getButtons() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFee() {
        return this.fee;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInfoSubtitle() {
        return this.infoSubtitle;
    }

    public final String getInfoText() {
        return this.infoText;
    }

    public final String getOnNewM2mBankSelectedAction() {
        return this.onNewM2mBankSelectedAction;
    }

    public final String getOnSelectedAction() {
        return this.onSelectedAction;
    }

    public final AgreementPrerequisiteDto getPrerequisite() {
        return this.prerequisite;
    }

    public final List<SuggestDto> getSuggests() {
        return this.suggests;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.type;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        String str2 = this.description;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreementSheetDescription;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Themes<String> themes = this.themedImage;
        int c = unr0.c((hashCode3 + (themes == null ? 0 : themes.hashCode())) * 31, 31, this.buttons);
        AgreementPrerequisiteDto agreementPrerequisiteDto = this.prerequisite;
        int hashCode4 = (c + (agreementPrerequisiteDto == null ? 0 : agreementPrerequisiteDto.hashCode())) * 31;
        List<SuggestDto> list = this.suggests;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.action;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onSelectedAction;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.infoText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.onNewM2mBankSelectedAction;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fee;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.infoSubtitle;
        return hashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.agreementSheetDescription;
        Themes<String> themes = this.themedImage;
        List<TransferButtonDto> list = this.buttons;
        AgreementPrerequisiteDto agreementPrerequisiteDto = this.prerequisite;
        List<SuggestDto> list2 = this.suggests;
        String str6 = this.action;
        String str7 = this.onSelectedAction;
        String str8 = this.infoText;
        String str9 = this.onNewM2mBankSelectedAction;
        String str10 = this.fee;
        String str11 = this.infoSubtitle;
        StringBuilder v = b64.v("AgreementInfoDto(id=", str, ", type=", str2, ", title=");
        g8e.D(v, str3, ", description=", str4, ", agreementSheetDescription=");
        n.B(v, str5, ", themedImage=", themes, ", buttons=");
        v.append(list);
        v.append(", prerequisite=");
        v.append(agreementPrerequisiteDto);
        v.append(", suggests=");
        oyr.D(", action=", str6, ", onSelectedAction=", v, list2);
        g8e.D(v, str7, ", infoText=", str8, ", onNewM2mBankSelectedAction=");
        g8e.D(v, str9, ", fee=", str10, ", infoSubtitle=");
        return oyr.t(v, str11, Extension.C_BRAKE);
    }
}
