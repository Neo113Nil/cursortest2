package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesConfigSchemaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesConfigSchema;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "nullableQrScannerGuidelinesWidgetSchemaAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QrScannerGuidelinesConfigSchemaJsonAdapter extends JsonAdapter<QrScannerGuidelinesConfigSchema> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<QrScannerGuidelinesWidgetSchema> nullableQrScannerGuidelinesWidgetSchemaAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "min_screen_height_to_show", "widget");

    public QrScannerGuidelinesConfigSchemaJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "minScreenHeightToShow");
        this.nullableQrScannerGuidelinesWidgetSchemaAdapter = moshi.adapter(QrScannerGuidelinesWidgetSchema.class, emptySet, "widget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrScannerGuidelinesConfigSchema fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                qrScannerGuidelinesWidgetSchema = this.nullableQrScannerGuidelinesWidgetSchemaAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool != null) {
            return new QrScannerGuidelinesConfigSchema(bool.booleanValue(), num, qrScannerGuidelinesWidgetSchema);
        }
        throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrScannerGuidelinesConfigSchema qrScannerGuidelinesConfigSchema) {
        QrScannerGuidelinesConfigSchema qrScannerGuidelinesConfigSchema2 = qrScannerGuidelinesConfigSchema;
        if (qrScannerGuidelinesConfigSchema2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(qrScannerGuidelinesConfigSchema2.isEnabled()));
        jsonWriter.name("min_screen_height_to_show");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) qrScannerGuidelinesConfigSchema2.getMinScreenHeightToShow());
        jsonWriter.name("widget");
        this.nullableQrScannerGuidelinesWidgetSchemaAdapter.toJson(jsonWriter, (JsonWriter) qrScannerGuidelinesConfigSchema2.getWidget());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(QrScannerGuidelinesConfigSchema)");
    }
}
