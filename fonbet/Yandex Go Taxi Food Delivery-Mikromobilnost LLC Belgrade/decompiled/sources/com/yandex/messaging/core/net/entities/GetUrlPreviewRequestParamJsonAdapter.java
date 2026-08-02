package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetUrlPreviewRequestParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetUrlPreviewRequestParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetUrlPreviewRequestParamJsonAdapter extends JsonAdapter<GetUrlPreviewRequestParam> {
    private volatile Constructor<GetUrlPreviewRequestParam> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("url", "format");
    private final JsonAdapter<String> stringAdapter;

    public GetUrlPreviewRequestParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "url");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "format");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetUrlPreviewRequestParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("url", "url", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str != null) {
                return new GetUrlPreviewRequestParam(str, str2);
            }
            throw Util.missingProperty("url", "url", jsonReader);
        }
        Constructor<GetUrlPreviewRequestParam> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GetUrlPreviewRequestParam.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, str2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("url", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetUrlPreviewRequestParam getUrlPreviewRequestParam) {
        GetUrlPreviewRequestParam getUrlPreviewRequestParam2 = getUrlPreviewRequestParam;
        if (getUrlPreviewRequestParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewRequestParam2.getUrl());
        jsonWriter.name("format");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewRequestParam2.getFormat());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(GetUrlPreviewRequestParam)");
    }
}
