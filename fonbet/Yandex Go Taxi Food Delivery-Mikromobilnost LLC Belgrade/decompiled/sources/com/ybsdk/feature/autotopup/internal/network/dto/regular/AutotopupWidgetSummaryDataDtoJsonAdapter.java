package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupSummaryBlockDto;", "listOfAutotopupSummaryBlockDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SpoilerParamDto;", "spoilerParamDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutotopupWidgetSummaryDataDtoJsonAdapter extends JsonAdapter<AutotopupWidgetSummaryDataDto> {
    private final JsonAdapter<List<AutotopupSummaryBlockDto>> listOfAutotopupSummaryBlockDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "future_income_title", "left_image", "action_image", "future_income_background_color", "background_color", "blocks", "spoiler_params", "tooltip_text");
    private final JsonAdapter<SpoilerParamDto> spoilerParamDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public AutotopupWidgetSummaryDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "futureIncomeTitle");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "leftImage");
        this.listOfAutotopupSummaryBlockDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutotopupSummaryBlockDto.class), emptySet, "blocks");
        this.spoilerParamDtoAdapter = moshi.adapter(SpoilerParamDto.class, emptySet, "spoilerParams");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutotopupWidgetSummaryDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        ThemedParameter<String> themedParameter4 = null;
        List<AutotopupSummaryBlockDto> list = null;
        SpoilerParamDto spoilerParamDto = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            ThemedParameter<String> themedParameter5 = themedParameter;
            ThemedParameter<String> themedParameter6 = themedParameter2;
            ThemedParameter<String> themedParameter7 = themedParameter3;
            ThemedParameter<String> themedParameter8 = themedParameter4;
            List<AutotopupSummaryBlockDto> list2 = list;
            SpoilerParamDto spoilerParamDto2 = spoilerParamDto;
            if (!jsonReader.hasNext()) {
                String str8 = str4;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (themedParameter5 == null) {
                    throw Util.missingProperty("leftImage", "left_image", jsonReader);
                }
                if (themedParameter6 == null) {
                    throw Util.missingProperty("actionImage", "action_image", jsonReader);
                }
                if (themedParameter7 == null) {
                    throw Util.missingProperty("futureIncomeBackgroundColor", "future_income_background_color", jsonReader);
                }
                if (themedParameter8 == null) {
                    throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("blocks", "blocks", jsonReader);
                }
                if (spoilerParamDto2 != null) {
                    return new AutotopupWidgetSummaryDataDto(str5, str6, str7, themedParameter5, themedParameter6, themedParameter7, themedParameter8, list2, spoilerParamDto2, str8);
                }
                throw Util.missingProperty("spoilerParams", "spoiler_params", jsonReader);
            }
            String str9 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str4 = str9;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 3:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("leftImage", "left_image", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 4:
                    themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter2 == null) {
                        throw Util.unexpectedNull("actionImage", "action_image", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 5:
                    themedParameter3 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter3 == null) {
                        throw Util.unexpectedNull("futureIncomeBackgroundColor", "future_income_background_color", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 6:
                    themedParameter4 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter4 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                case 7:
                    list = this.listOfAutotopupSummaryBlockDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("blocks", "blocks", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    spoilerParamDto = spoilerParamDto2;
                case 8:
                    spoilerParamDto = this.spoilerParamDtoAdapter.fromJson(jsonReader);
                    if (spoilerParamDto == null) {
                        throw Util.unexpectedNull("spoilerParams", "spoiler_params", jsonReader);
                    }
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                case 9:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
                default:
                    str4 = str9;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    themedParameter = themedParameter5;
                    themedParameter2 = themedParameter6;
                    themedParameter3 = themedParameter7;
                    themedParameter4 = themedParameter8;
                    list = list2;
                    spoilerParamDto = spoilerParamDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto) {
        AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto2 = autotopupWidgetSummaryDataDto;
        if (autotopupWidgetSummaryDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getSubtitle());
        jsonWriter.name("future_income_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getFutureIncomeTitle());
        jsonWriter.name("left_image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getLeftImage());
        jsonWriter.name("action_image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getActionImage());
        jsonWriter.name("future_income_background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getFutureIncomeBackgroundColor());
        jsonWriter.name("background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getBackgroundColor());
        jsonWriter.name("blocks");
        this.listOfAutotopupSummaryBlockDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getBlocks());
        jsonWriter.name("spoiler_params");
        this.spoilerParamDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getSpoilerParams());
        jsonWriter.name("tooltip_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupWidgetSummaryDataDto2.getTooltipText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(AutotopupWidgetSummaryDataDto)");
    }
}
