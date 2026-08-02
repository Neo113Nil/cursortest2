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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderContentLogoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "qrReaderLogoImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrReaderContentLogoJsonAdapter extends JsonAdapter<QrReaderContentLogo> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "width", "height", "top_margin");
    private final JsonAdapter<QrReaderLogoImage> qrReaderLogoImageAdapter;

    public QrReaderContentLogoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.qrReaderLogoImageAdapter = moshi.adapter(QrReaderLogoImage.class, emptySet, "image");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrReaderContentLogo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QrReaderLogoImage qrReaderLogoImage = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("width", "width", jsonReader);
                }
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("height", "height", jsonReader);
                }
            } else if (selectName == 3 && (num3 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("topMargin", "top_margin", jsonReader);
            }
        }
        jsonReader.endObject();
        if (qrReaderLogoImage == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("width", "width", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("height", "height", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new QrReaderContentLogo(qrReaderLogoImage, intValue, intValue2, num3.intValue());
        }
        throw Util.missingProperty("topMargin", "top_margin", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrReaderContentLogo qrReaderContentLogo) {
        QrReaderContentLogo qrReaderContentLogo2 = qrReaderContentLogo;
        if (qrReaderContentLogo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.qrReaderLogoImageAdapter.toJson(jsonWriter, (JsonWriter) qrReaderContentLogo2.getImage());
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(qrReaderContentLogo2.getWidth()));
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(qrReaderContentLogo2.getHeight()));
        jsonWriter.name("top_margin");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(qrReaderContentLogo2.getTopMargin()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(QrReaderContentLogo)");
    }
}
