package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrErrorMessagesConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/QrErrorMessagesConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/rconfig/configs/QrErrorMessage;", "listOfQrErrorMessageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QrErrorMessagesConfigJsonAdapter extends JsonAdapter<QrErrorMessagesConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<QrErrorMessage>> listOfQrErrorMessageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("messages", "is_enabled");

    public QrErrorMessagesConfigJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, QrErrorMessage.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfQrErrorMessageAdapter = moshi.adapter(newParameterizedType, emptySet, "messages");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrErrorMessagesConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<QrErrorMessage> list = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfQrErrorMessageAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("messages", "messages", jsonReader);
                }
            } else if (selectName == 1 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("messages", "messages", jsonReader);
        }
        if (bool != null) {
            return new QrErrorMessagesConfig(list, bool.booleanValue());
        }
        throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrErrorMessagesConfig qrErrorMessagesConfig) {
        QrErrorMessagesConfig qrErrorMessagesConfig2 = qrErrorMessagesConfig;
        if (qrErrorMessagesConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("messages");
        this.listOfQrErrorMessageAdapter.toJson(jsonWriter, (JsonWriter) qrErrorMessagesConfig2.getMessages());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(qrErrorMessagesConfig2.isEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(QrErrorMessagesConfig)");
    }
}
