package com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "nullableStringAdapter", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;", "listOfAgreementSheetItemDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FpsPayEnrollDtoJsonAdapter extends JsonAdapter<FpsPayEnrollDto> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonAdapter<List<AgreementSheetItemDto>> listOfAgreementSheetItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "agreements_sheet_title", "button", "button_description", "agreements");
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public FpsPayEnrollDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "buttonDescription");
        this.listOfAgreementSheetItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AgreementSheetItemDto.class), emptySet, "agreements");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FpsPayEnrollDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PageHeaderDto pageHeaderDto = null;
        String str = null;
        String str2 = null;
        Themes<String> themes = null;
        String str3 = null;
        ActionButtonDto actionButtonDto = null;
        String str4 = null;
        List<AgreementSheetItemDto> list = null;
        while (true) {
            PageHeaderDto pageHeaderDto2 = pageHeaderDto;
            String str5 = str;
            String str6 = str2;
            if (!jsonReader.hasNext()) {
                Themes<String> themes2 = themes;
                jsonReader.endObject();
                if (pageHeaderDto2 == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (themes2 == null) {
                    throw Util.missingProperty("image", "image", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
                }
                if (actionButtonDto == null) {
                    throw Util.missingProperty("button", "button", jsonReader);
                }
                if (list != null) {
                    return new FpsPayEnrollDto(pageHeaderDto2, str5, str6, themes2, str3, actionButtonDto, str4, list);
                }
                throw Util.missingProperty("agreements", "agreements", jsonReader);
            }
            Themes<String> themes3 = themes;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                case 0:
                    pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader);
                    if (pageHeaderDto == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    themes = themes3;
                    str = str5;
                    str2 = str6;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str2 = str6;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
                    }
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                case 5:
                    actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader);
                    if (actionButtonDto == null) {
                        throw Util.unexpectedNull("button", "button", jsonReader);
                    }
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                case 7:
                    list = this.listOfAgreementSheetItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("agreements", "agreements", jsonReader);
                    }
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
                default:
                    themes = themes3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str5;
                    str2 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FpsPayEnrollDto fpsPayEnrollDto) {
        FpsPayEnrollDto fpsPayEnrollDto2 = fpsPayEnrollDto;
        if (fpsPayEnrollDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getHeader());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getDescription());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getImage());
        jsonWriter.name("agreements_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getAgreementsSheetTitle());
        jsonWriter.name("button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getButton());
        jsonWriter.name("button_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getButtonDescription());
        jsonWriter.name("agreements");
        this.listOfAgreementSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) fpsPayEnrollDto2.getAgreements());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(FpsPayEnrollDto)");
    }
}
