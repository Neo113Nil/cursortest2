package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrReaderScanningConfigSchemaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/QrReaderScanningConfigSchema;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QrReaderScanningConfigSchemaJsonAdapter extends JsonAdapter<QrReaderScanningConfigSchema> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_huawei_area_restriction_enabled", "min_intersection_percent");

    public QrReaderScanningConfigSchemaJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isHuaweiAreaRestrictionEnabled");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "minIntersectionPercent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrReaderScanningConfigSchema fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new QrReaderScanningConfigSchema(bool, num);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrReaderScanningConfigSchema qrReaderScanningConfigSchema) {
        QrReaderScanningConfigSchema qrReaderScanningConfigSchema2 = qrReaderScanningConfigSchema;
        if (qrReaderScanningConfigSchema2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_huawei_area_restriction_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) qrReaderScanningConfigSchema2.isHuaweiAreaRestrictionEnabled());
        jsonWriter.name("min_intersection_percent");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) qrReaderScanningConfigSchema2.getMinIntersectionPercent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(QrReaderScanningConfigSchema)");
    }
}
