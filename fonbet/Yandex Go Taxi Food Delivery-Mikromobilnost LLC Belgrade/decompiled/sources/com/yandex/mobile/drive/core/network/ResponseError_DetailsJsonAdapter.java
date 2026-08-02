package com.yandex.mobile.drive.core.network;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.mobile.drive.core.network.ResponseError;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError_DetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/mobile/drive/core/network/ResponseError$Details;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info;", "nullableInfoAdapter", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResponseError_DetailsJsonAdapter extends JsonAdapter<ResponseError.Details> {
    private final JsonAdapter<ResponseError.Info> nullableInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ui_title", "ui_message", "special_info", "debug_message");

    public ResponseError_DetailsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "uiTitle");
        this.nullableInfoAdapter = moshi.adapter(ResponseError.Info.class, emptySet, "specialInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResponseError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ResponseError.Info info = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            } else if (selectName == 1) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                z2 = true;
            } else if (selectName == 2) {
                info = this.nullableInfoAdapter.fromJson(jsonReader);
                z3 = true;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                z4 = true;
            }
        }
        jsonReader.endObject();
        ResponseError.Details details = new ResponseError.Details();
        if (z) {
            details.setUiTitle(str);
        }
        if (z2) {
            details.setUiMessage(str3);
        }
        if (z3) {
            details.setSpecialInfo(info);
        }
        if (z4) {
            details.setDebugMessage(str2);
        }
        return details;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResponseError.Details details) {
        ResponseError.Details details2 = details;
        if (details2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ui_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) details2.getUiTitle());
        jsonWriter.name("ui_message");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) details2.getUiMessage());
        jsonWriter.name("special_info");
        this.nullableInfoAdapter.toJson(jsonWriter, (JsonWriter) details2.getSpecialInfo());
        jsonWriter.name("debug_message");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) details2.getDebugMessage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ResponseError.Details)");
    }
}
