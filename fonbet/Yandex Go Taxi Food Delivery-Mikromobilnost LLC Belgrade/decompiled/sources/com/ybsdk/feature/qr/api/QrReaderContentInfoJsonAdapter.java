package com.ybsdk.feature.qr.api;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderContentInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "qrReaderLogoImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrReaderContentInfoJsonAdapter extends JsonAdapter<QrReaderContentInfo> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "action", "accessibility_label", "analytics_button_click");
    private final JsonAdapter<QrReaderLogoImage> qrReaderLogoImageAdapter;
    private final JsonAdapter<String> stringAdapter;

    public QrReaderContentInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.qrReaderLogoImageAdapter = moshi.adapter(QrReaderLogoImage.class, emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "accessibilityLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrReaderContentInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QrReaderLogoImage qrReaderLogoImage = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                qrReaderLogoImage = this.qrReaderLogoImageAdapter.fromJson(jsonReader);
                if (qrReaderLogoImage == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (qrReaderLogoImage == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (str != null) {
            return new QrReaderContentInfo(qrReaderLogoImage, str, str2, str3);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrReaderContentInfo qrReaderContentInfo) {
        QrReaderContentInfo qrReaderContentInfo2 = qrReaderContentInfo;
        if (qrReaderContentInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.qrReaderLogoImageAdapter.toJson(jsonWriter, (JsonWriter) qrReaderContentInfo2.getImage());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrReaderContentInfo2.getAction());
        jsonWriter.name("accessibility_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrReaderContentInfo2.getAccessibilityLabel());
        jsonWriter.name("analytics_button_click");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrReaderContentInfo2.getAnalyticsButtonClick());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(QrReaderContentInfo)");
    }
}
