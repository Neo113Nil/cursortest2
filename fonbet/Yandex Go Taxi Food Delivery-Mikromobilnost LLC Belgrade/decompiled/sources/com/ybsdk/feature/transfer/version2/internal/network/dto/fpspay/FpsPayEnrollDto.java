package com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollDto;", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "agreementsSheetTitle", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "buttonDescription", "agreements", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Ljava/lang/String;Ljava/util/List;)V", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAgreementsSheetTitle", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getButtonDescription", "getAgreements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FpsPayEnrollDto {
    private final List<AgreementSheetItemDto> agreements;
    private final String agreementsSheetTitle;
    private final ActionButtonDto button;
    private final String buttonDescription;
    private final String description;
    private final PageHeaderDto header;
    private final Themes<String> image;
    private final String title;

    public FpsPayEnrollDto(@Json(name = "header") PageHeaderDto pageHeaderDto, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "agreements_sheet_title") String str3, @Json(name = "button") ActionButtonDto actionButtonDto, @Json(name = "button_description") String str4, @Json(name = "agreements") List<AgreementSheetItemDto> list) {
        this.header = pageHeaderDto;
        this.title = str;
        this.description = str2;
        this.image = themes;
        this.agreementsSheetTitle = str3;
        this.button = actionButtonDto;
        this.buttonDescription = str4;
        this.agreements = list;
    }

    public static /* synthetic */ FpsPayEnrollDto copy$default(FpsPayEnrollDto fpsPayEnrollDto, PageHeaderDto pageHeaderDto, String str, String str2, Themes themes, String str3, ActionButtonDto actionButtonDto, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderDto = fpsPayEnrollDto.header;
        }
        if ((i & 2) != 0) {
            str = fpsPayEnrollDto.title;
        }
        if ((i & 4) != 0) {
            str2 = fpsPayEnrollDto.description;
        }
        if ((i & 8) != 0) {
            themes = fpsPayEnrollDto.image;
        }
        if ((i & 16) != 0) {
            str3 = fpsPayEnrollDto.agreementsSheetTitle;
        }
        if ((i & 32) != 0) {
            actionButtonDto = fpsPayEnrollDto.button;
        }
        if ((i & 64) != 0) {
            str4 = fpsPayEnrollDto.buttonDescription;
        }
        if ((i & 128) != 0) {
            list = fpsPayEnrollDto.agreements;
        }
        String str5 = str4;
        List list2 = list;
        String str6 = str3;
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        return fpsPayEnrollDto.copy(pageHeaderDto, str, str2, themes, str6, actionButtonDto2, str5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
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
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component7, reason: from getter */
    public final String getButtonDescription() {
        return this.buttonDescription;
    }

    public final List<AgreementSheetItemDto> component8() {
        return this.agreements;
    }

    public final FpsPayEnrollDto copy(@Json(name = "header") PageHeaderDto header, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "agreements_sheet_title") String agreementsSheetTitle, @Json(name = "button") ActionButtonDto button, @Json(name = "button_description") String buttonDescription, @Json(name = "agreements") List<AgreementSheetItemDto> agreements) {
        return new FpsPayEnrollDto(header, title, description, image, agreementsSheetTitle, button, buttonDescription, agreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpsPayEnrollDto)) {
            return false;
        }
        FpsPayEnrollDto fpsPayEnrollDto = (FpsPayEnrollDto) other;
        return jl40.l(this.header, fpsPayEnrollDto.header) && jl40.l(this.title, fpsPayEnrollDto.title) && jl40.l(this.description, fpsPayEnrollDto.description) && jl40.l(this.image, fpsPayEnrollDto.image) && jl40.l(this.agreementsSheetTitle, fpsPayEnrollDto.agreementsSheetTitle) && jl40.l(this.button, fpsPayEnrollDto.button) && jl40.l(this.buttonDescription, fpsPayEnrollDto.buttonDescription) && jl40.l(this.agreements, fpsPayEnrollDto.agreements);
    }

    public final List<AgreementSheetItemDto> getAgreements() {
        return this.agreements;
    }

    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final String getButtonDescription() {
        return this.buttonDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + unr0.b(nnm.c(this.image, unr0.b(unr0.b(this.header.hashCode() * 31, 31, this.title), 31, this.description), 31), 31, this.agreementsSheetTitle)) * 31;
        String str = this.buttonDescription;
        return this.agreements.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        PageHeaderDto pageHeaderDto = this.header;
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.image;
        String str3 = this.agreementsSheetTitle;
        ActionButtonDto actionButtonDto = this.button;
        String str4 = this.buttonDescription;
        List<AgreementSheetItemDto> list = this.agreements;
        StringBuilder sb = new StringBuilder("FpsPayEnrollDto(header=");
        sb.append(pageHeaderDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        n.B(sb, str2, ", image=", themes, ", agreementsSheetTitle=");
        sb.append(str3);
        sb.append(", button=");
        sb.append(actionButtonDto);
        sb.append(", buttonDescription=");
        return tse0.j(str4, ", agreements=", Extension.C_BRAKE, sb, list);
    }
}
