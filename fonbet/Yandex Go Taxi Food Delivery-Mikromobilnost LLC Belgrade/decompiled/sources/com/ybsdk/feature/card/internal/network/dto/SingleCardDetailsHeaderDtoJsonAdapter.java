package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsHeaderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsHeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCardDetailsHeaderDtoJsonAdapter extends JsonAdapter<SingleCardDetailsHeaderDto> {
    private final JsonReader.Options options = JsonReader.Options.of("action", "image");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SingleCardDetailsHeaderDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "image");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SingleCardDetailsHeaderDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ThemedParameter<String> themedParameter = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1 && (themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("image", "image", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (themedParameter != null) {
            return new SingleCardDetailsHeaderDto(str, themedParameter);
        }
        throw Util.missingProperty("image", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SingleCardDetailsHeaderDto singleCardDetailsHeaderDto) {
        SingleCardDetailsHeaderDto singleCardDetailsHeaderDto2 = singleCardDetailsHeaderDto;
        if (singleCardDetailsHeaderDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) singleCardDetailsHeaderDto2.getAction());
        jsonWriter.name("image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) singleCardDetailsHeaderDto2.getImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(SingleCardDetailsHeaderDto)");
    }
}
