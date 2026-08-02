package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsShelfDtoV4JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsShelfDtoV4;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse;", "listOfDivSavingsAccountResponseAdapter", "", "booleanAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsShelfDtoV4JsonAdapter extends JsonAdapter<SavingsShelfDtoV4> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<DivSavingsAccountResponse>> listOfDivSavingsAccountResponseAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "icon", "title", "subtitle", "subtitle_divkit_widget", "divkit_widget", "items", "drag_and_drop_enabled");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SavingsShelfDtoV4JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "icon");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "subtitleDivWidget");
        this.listOfDivSavingsAccountResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, DivSavingsAccountResponse.class), emptySet, "items");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "dragAndDropEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsShelfDtoV4 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        ThemedParameter<String> themedParameter = null;
        String str2 = null;
        String str3 = null;
        DivDataDto divDataDto = null;
        DivDataDto divDataDto2 = null;
        List<DivSavingsAccountResponse> list = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                String str4 = str;
                jsonReader.endObject();
                if (str4 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (themedParameter == null) {
                    throw Util.missingProperty("icon", "icon", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (list == null) {
                    throw Util.missingProperty("items", "items", jsonReader);
                }
                if (bool2 != null) {
                    return new SavingsShelfDtoV4(str4, themedParameter, str2, str3, divDataDto, divDataDto2, list, bool2.booleanValue());
                }
                throw Util.missingProperty("dragAndDropEnabled", "drag_and_drop_enabled", jsonReader);
            }
            String str5 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str = str5;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    bool = bool2;
                case 1:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("icon", "icon", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 4:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str5;
                case 5:
                    divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str5;
                case 6:
                    list = this.listOfDivSavingsAccountResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("items", "items", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 7:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("dragAndDropEnabled", "drag_and_drop_enabled", jsonReader);
                    }
                    str = str5;
                default:
                    bool = bool2;
                    str = str5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsShelfDtoV4 savingsShelfDtoV4) {
        SavingsShelfDtoV4 savingsShelfDtoV42 = savingsShelfDtoV4;
        if (savingsShelfDtoV42 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getId());
        jsonWriter.name("icon");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getIcon());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getSubtitle());
        jsonWriter.name("subtitle_divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getSubtitleDivWidget());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getDivWidget());
        jsonWriter.name("items");
        this.listOfDivSavingsAccountResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsShelfDtoV42.getItems());
        jsonWriter.name("drag_and_drop_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(savingsShelfDtoV42.getDragAndDropEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(SavingsShelfDtoV4)");
    }
}
