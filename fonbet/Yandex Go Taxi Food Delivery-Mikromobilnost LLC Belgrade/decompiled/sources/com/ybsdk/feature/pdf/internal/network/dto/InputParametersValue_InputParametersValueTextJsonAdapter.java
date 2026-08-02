package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue_InputParametersValueTextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueText;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "inputParameterTypeAdapter", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputParametersValue_InputParametersValueTextJsonAdapter extends JsonAdapter<InputParametersValue$InputParametersValueText> {
    private final JsonAdapter<InputParameterType> inputParameterTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "type", "value");
    private final JsonAdapter<String> stringAdapter;

    public InputParametersValue_InputParametersValueTextJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.inputParameterTypeAdapter = moshi.adapter(InputParameterType.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InputParametersValue$InputParametersValueText fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        InputParameterType inputParameterType = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 1) {
                inputParameterType = this.inputParameterTypeAdapter.fromJson(jsonReader);
                if (inputParameterType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("value__", "value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (inputParameterType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str2 != null) {
            return new InputParametersValue$InputParametersValueText(str, inputParameterType, str2);
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InputParametersValue$InputParametersValueText inputParametersValue$InputParametersValueText) {
        InputParametersValue$InputParametersValueText inputParametersValue$InputParametersValueText2 = inputParametersValue$InputParametersValueText;
        if (inputParametersValue$InputParametersValueText2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueText2.getName());
        jsonWriter.name("type");
        this.inputParameterTypeAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueText2.getType());
        jsonWriter.name("value");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueText2.getValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(67, "GeneratedJsonAdapter(InputParametersValue.InputParametersValueText)");
    }
}
