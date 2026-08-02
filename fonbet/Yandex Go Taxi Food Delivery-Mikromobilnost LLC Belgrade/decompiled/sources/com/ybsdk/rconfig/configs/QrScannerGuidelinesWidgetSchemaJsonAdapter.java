package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchemaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelineItemSchema;", "listOfQrScannerGuidelineItemSchemaAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QrScannerGuidelinesWidgetSchemaJsonAdapter extends JsonAdapter<QrScannerGuidelinesWidgetSchema> {
    private final JsonAdapter<List<QrScannerGuidelineItemSchema>> listOfQrScannerGuidelineItemSchemaAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "items");
    private final JsonAdapter<Text> textAdapter;

    public QrScannerGuidelinesWidgetSchemaJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.textAdapter = moshi.adapter(Text.class, emptySet, "title");
        this.listOfQrScannerGuidelineItemSchemaAdapter = moshi.adapter(Types.newParameterizedType(List.class, QrScannerGuidelineItemSchema.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrScannerGuidelinesWidgetSchema fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Text text = null;
        List<QrScannerGuidelineItemSchema> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                text = this.textAdapter.fromJson(jsonReader);
                if (text == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfQrScannerGuidelineItemSchemaAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (text == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new QrScannerGuidelinesWidgetSchema(text, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema) {
        QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema2 = qrScannerGuidelinesWidgetSchema;
        if (qrScannerGuidelinesWidgetSchema2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) qrScannerGuidelinesWidgetSchema2.getTitle());
        jsonWriter.name("items");
        this.listOfQrScannerGuidelineItemSchemaAdapter.toJson(jsonWriter, (JsonWriter) qrScannerGuidelinesWidgetSchema2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(QrScannerGuidelinesWidgetSchema)");
    }
}
