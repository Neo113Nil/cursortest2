package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue_InputParametersValueDateRangeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDateRange;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "inputParameterTypeAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputParametersValue_InputParametersValueDateRangeJsonAdapter extends JsonAdapter<InputParametersValue$InputParametersValueDateRange> {
    private volatile Constructor<InputParametersValue$InputParametersValueDateRange> constructorRef;
    private final JsonAdapter<InputParameterType> inputParameterTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "type", "valueFrom", "valueTo");
    private final JsonAdapter<String> stringAdapter;

    public InputParametersValue_InputParametersValueDateRangeJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.inputParameterTypeAdapter = moshi.adapter(InputParameterType.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "valueTo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InputParametersValue$InputParametersValueDateRange fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        InputParameterType inputParameterType = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
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
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("valueFrom", "valueFrom", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (inputParameterType == null) {
                throw Util.missingProperty("type", "type", jsonReader);
            }
            if (str2 != null) {
                return new InputParametersValue$InputParametersValueDateRange(str, inputParameterType, str2, str3);
            }
            throw Util.missingProperty("valueFrom", "valueFrom", jsonReader);
        }
        Constructor<InputParametersValue$InputParametersValueDateRange> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InputParametersValue$InputParametersValueDateRange.class.getDeclaredConstructor(String.class, InputParameterType.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (inputParameterType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, inputParameterType, str2, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("valueFrom", "valueFrom", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InputParametersValue$InputParametersValueDateRange inputParametersValue$InputParametersValueDateRange) {
        InputParametersValue$InputParametersValueDateRange inputParametersValue$InputParametersValueDateRange2 = inputParametersValue$InputParametersValueDateRange;
        if (inputParametersValue$InputParametersValueDateRange2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueDateRange2.getName());
        jsonWriter.name("type");
        this.inputParameterTypeAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueDateRange2.getType());
        jsonWriter.name("valueFrom");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueDateRange2.getValueFrom());
        jsonWriter.name("valueTo");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) inputParametersValue$InputParametersValueDateRange2.getValueTo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(72, "GeneratedJsonAdapter(InputParametersValue.InputParametersValueDateRange)");
    }
}
