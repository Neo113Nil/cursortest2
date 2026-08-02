package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;", "", "emptyStateDiv", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "headerWidgetDiv", "sections", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetSectionDto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;)V", "getEmptyStateDiv", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getHeaderWidgetDiv", "getSections", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionsSheetPayloadDto {
    private final DivDataDto emptyStateDiv;
    private final DivDataDto headerWidgetDiv;
    private final List<TransferSheetSectionDto> sections;

    public SectionsSheetPayloadDto(@Json(name = "empty_state_div") DivDataDto divDataDto, @Json(name = "header_widget_div") DivDataDto divDataDto2, @Json(name = "sections") List<TransferSheetSectionDto> list) {
        this.emptyStateDiv = divDataDto;
        this.headerWidgetDiv = divDataDto2;
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionsSheetPayloadDto copy$default(SectionsSheetPayloadDto sectionsSheetPayloadDto, DivDataDto divDataDto, DivDataDto divDataDto2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = sectionsSheetPayloadDto.emptyStateDiv;
        }
        if ((i & 2) != 0) {
            divDataDto2 = sectionsSheetPayloadDto.headerWidgetDiv;
        }
        if ((i & 4) != 0) {
            list = sectionsSheetPayloadDto.sections;
        }
        return sectionsSheetPayloadDto.copy(divDataDto, divDataDto2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getEmptyStateDiv() {
        return this.emptyStateDiv;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getHeaderWidgetDiv() {
        return this.headerWidgetDiv;
    }

    public final List<TransferSheetSectionDto> component3() {
        return this.sections;
    }

    public final SectionsSheetPayloadDto copy(@Json(name = "empty_state_div") DivDataDto emptyStateDiv, @Json(name = "header_widget_div") DivDataDto headerWidgetDiv, @Json(name = "sections") List<TransferSheetSectionDto> sections) {
        return new SectionsSheetPayloadDto(emptyStateDiv, headerWidgetDiv, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionsSheetPayloadDto)) {
            return false;
        }
        SectionsSheetPayloadDto sectionsSheetPayloadDto = (SectionsSheetPayloadDto) other;
        return jl40.l(this.emptyStateDiv, sectionsSheetPayloadDto.emptyStateDiv) && jl40.l(this.headerWidgetDiv, sectionsSheetPayloadDto.headerWidgetDiv) && jl40.l(this.sections, sectionsSheetPayloadDto.sections);
    }

    public final DivDataDto getEmptyStateDiv() {
        return this.emptyStateDiv;
    }

    public final DivDataDto getHeaderWidgetDiv() {
        return this.headerWidgetDiv;
    }

    public final List<TransferSheetSectionDto> getSections() {
        return this.sections;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.emptyStateDiv;
        int hashCode = (divDataDto == null ? 0 : divDataDto.hashCode()) * 31;
        DivDataDto divDataDto2 = this.headerWidgetDiv;
        return this.sections.hashCode() + ((hashCode + (divDataDto2 != null ? divDataDto2.hashCode() : 0)) * 31);
    }

    public String toString() {
        DivDataDto divDataDto = this.emptyStateDiv;
        DivDataDto divDataDto2 = this.headerWidgetDiv;
        List<TransferSheetSectionDto> list = this.sections;
        StringBuilder sb = new StringBuilder("SectionsSheetPayloadDto(emptyStateDiv=");
        sb.append(divDataDto);
        sb.append(", headerWidgetDiv=");
        sb.append(divDataDto2);
        sb.append(", sections=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
