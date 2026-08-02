package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrErrorMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/QrErrorMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QrErrorMessageJsonAdapter extends JsonAdapter<QrErrorMessage> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("categories", "error_title", "error_description", "image", "button_title", "button_action");
    private final JsonAdapter<String> stringAdapter;

    public QrErrorMessageJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "categories");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "errorTitle");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "image");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "buttonTitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrErrorMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        String str = null;
        String str2 = null;
        ThemedImage themedImage = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("categories", "categories", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("errorTitle", "error_title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("errorDescription", "error_description", jsonReader);
                    }
                    break;
                case 3:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("categories", "categories", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("errorTitle", "error_title", jsonReader);
        }
        if (str2 != null) {
            return new QrErrorMessage(list, str, str2, themedImage, str3, str4);
        }
        throw Util.missingProperty("errorDescription", "error_description", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrErrorMessage qrErrorMessage) {
        QrErrorMessage qrErrorMessage2 = qrErrorMessage;
        if (qrErrorMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("categories");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getCategories());
        jsonWriter.name("error_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getErrorTitle());
        jsonWriter.name("error_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getErrorDescription());
        jsonWriter.name("image");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getImage());
        jsonWriter.name("button_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getButtonTitle());
        jsonWriter.name("button_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessage2.getButtonAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(QrErrorMessage)");
    }
}
