package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.AdditionalButtonDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/BottomSheetPayloadDto;", "", "title", "", "subtitle", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "items", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetItemDto;", "additionalButtons", "Lcom/ybsdk/core/common/data/network/dto/AdditionalButtonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItems", "()Ljava/util/List;", "getAdditionalButtons", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BottomSheetPayloadDto {
    private final List<AdditionalButtonDto> additionalButtons;
    private final DivDataDto divkitWidget;
    private final List<TransferSheetItemDto> items;
    private final String subtitle;
    private final String title;

    public BottomSheetPayloadDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "header_divkit_widget") DivDataDto divDataDto, @Json(name = "items") List<TransferSheetItemDto> list, @Json(name = "buttons") List<AdditionalButtonDto> list2) {
        this.title = str;
        this.subtitle = str2;
        this.divkitWidget = divDataDto;
        this.items = list;
        this.additionalButtons = list2;
    }

    public static /* synthetic */ BottomSheetPayloadDto copy$default(BottomSheetPayloadDto bottomSheetPayloadDto, String str, String str2, DivDataDto divDataDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomSheetPayloadDto.title;
        }
        if ((i & 2) != 0) {
            str2 = bottomSheetPayloadDto.subtitle;
        }
        if ((i & 4) != 0) {
            divDataDto = bottomSheetPayloadDto.divkitWidget;
        }
        if ((i & 8) != 0) {
            list = bottomSheetPayloadDto.items;
        }
        if ((i & 16) != 0) {
            list2 = bottomSheetPayloadDto.additionalButtons;
        }
        List list3 = list2;
        DivDataDto divDataDto2 = divDataDto;
        return bottomSheetPayloadDto.copy(str, str2, divDataDto2, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final List<TransferSheetItemDto> component4() {
        return this.items;
    }

    public final List<AdditionalButtonDto> component5() {
        return this.additionalButtons;
    }

    public final BottomSheetPayloadDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "header_divkit_widget") DivDataDto divkitWidget, @Json(name = "items") List<TransferSheetItemDto> items, @Json(name = "buttons") List<AdditionalButtonDto> additionalButtons) {
        return new BottomSheetPayloadDto(title, subtitle, divkitWidget, items, additionalButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetPayloadDto)) {
            return false;
        }
        BottomSheetPayloadDto bottomSheetPayloadDto = (BottomSheetPayloadDto) other;
        return jl40.l(this.title, bottomSheetPayloadDto.title) && jl40.l(this.subtitle, bottomSheetPayloadDto.subtitle) && jl40.l(this.divkitWidget, bottomSheetPayloadDto.divkitWidget) && jl40.l(this.items, bottomSheetPayloadDto.items) && jl40.l(this.additionalButtons, bottomSheetPayloadDto.additionalButtons);
    }

    public final List<AdditionalButtonDto> getAdditionalButtons() {
        return this.additionalButtons;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final List<TransferSheetItemDto> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        int c = unr0.c((hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31, 31, this.items);
        List<AdditionalButtonDto> list = this.additionalButtons;
        return c + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto = this.divkitWidget;
        List<TransferSheetItemDto> list = this.items;
        List<AdditionalButtonDto> list2 = this.additionalButtons;
        StringBuilder v = b64.v("BottomSheetPayloadDto(title=", str, ", subtitle=", str2, ", divkitWidget=");
        v.append(divDataDto);
        v.append(", items=");
        v.append(list);
        v.append(", additionalButtons=");
        return ly3.s(v, list2, Extension.C_BRAKE);
    }
}
