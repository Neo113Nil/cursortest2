package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/ShimmersConfigImplJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "", "mapOfStringIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmersConfigImplJsonAdapter extends JsonAdapter<ShimmersConfigImpl> {
    private final JsonAdapter<Map<String, Integer>> mapOfStringIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("jsonValues");

    public ShimmersConfigImplJsonAdapter(Moshi moshi) {
        this.mapOfStringIntAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Integer.class), EmptySet.a, "jsonValues");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShimmersConfigImpl fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, Integer> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (map = this.mapOfStringIntAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("jsonValues", "jsonValues", jsonReader);
            }
        }
        jsonReader.endObject();
        if (map != null) {
            return new ShimmersConfigImpl(map);
        }
        throw Util.missingProperty("jsonValues", "jsonValues", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShimmersConfigImpl shimmersConfigImpl) {
        ShimmersConfigImpl shimmersConfigImpl2 = shimmersConfigImpl;
        if (shimmersConfigImpl2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("jsonValues");
        this.mapOfStringIntAdapter.toJson(jsonWriter, (JsonWriter) shimmersConfigImpl2.getJsonValues());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ShimmersConfigImpl)");
    }
}
