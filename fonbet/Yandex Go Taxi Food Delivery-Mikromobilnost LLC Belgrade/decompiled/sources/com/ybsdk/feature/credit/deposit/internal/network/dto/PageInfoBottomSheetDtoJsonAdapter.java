package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PageInfoBottomSheetDtoJsonAdapter extends JsonAdapter<PageInfoBottomSheetDto> {
    private final JsonReader.Options options = JsonReader.Options.of("bottom_sheet_image", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "button_text", "toolbar_image");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public PageInfoBottomSheetDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "bottomSheetImage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PageInfoBottomSheetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ThemedParameter<String> themedParameter2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            ThemedParameter<String> themedParameter3 = themedParameter;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("bottomSheetImage", "bottom_sheet_image", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("buttonText", "button_text", jsonReader);
                }
            } else if (selectName == 4 && (themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("toolbarImage", "toolbar_image", jsonReader);
            }
            themedParameter = themedParameter3;
        }
        ThemedParameter<String> themedParameter4 = themedParameter;
        jsonReader.endObject();
        if (themedParameter4 == null) {
            throw Util.missingProperty("bottomSheetImage", "bottom_sheet_image", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("buttonText", "button_text", jsonReader);
        }
        if (themedParameter2 != null) {
            return new PageInfoBottomSheetDto(themedParameter4, str, str2, str3, themedParameter2);
        }
        throw Util.missingProperty("toolbarImage", "toolbar_image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PageInfoBottomSheetDto pageInfoBottomSheetDto) {
        PageInfoBottomSheetDto pageInfoBottomSheetDto2 = pageInfoBottomSheetDto;
        if (pageInfoBottomSheetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("bottom_sheet_image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) pageInfoBottomSheetDto2.getBottomSheetImage());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pageInfoBottomSheetDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pageInfoBottomSheetDto2.getDescription());
        jsonWriter.name("button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pageInfoBottomSheetDto2.getButtonText());
        jsonWriter.name("toolbar_image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) pageInfoBottomSheetDto2.getToolbarImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(PageInfoBottomSheetDto)");
    }
}
