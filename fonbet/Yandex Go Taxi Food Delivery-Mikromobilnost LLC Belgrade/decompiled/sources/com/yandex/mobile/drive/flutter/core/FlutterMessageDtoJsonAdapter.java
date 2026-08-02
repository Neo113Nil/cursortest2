package com.yandex.mobile.drive.flutter.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/drive/flutter/core/FlutterMessageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/mobile/drive/flutter/core/FlutterMessageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlutterMessageDtoJsonAdapter extends JsonAdapter<FlutterMessageDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", Constants.KEY_DATA);

    public FlutterMessageDtoJsonAdapter(Moshi moshi) {
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.a, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FlutterMessageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                z2 = true;
            }
        }
        jsonReader.endObject();
        FlutterMessageDto flutterMessageDto = new FlutterMessageDto();
        if (z) {
            flutterMessageDto.setType(str);
        }
        if (z2) {
            flutterMessageDto.setData(str2);
        }
        return flutterMessageDto;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FlutterMessageDto flutterMessageDto) {
        FlutterMessageDto flutterMessageDto2 = flutterMessageDto;
        if (flutterMessageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) flutterMessageDto2.getType());
        jsonWriter.name(Constants.KEY_DATA);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) flutterMessageDto2.getData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(FlutterMessageDto)");
    }
}
