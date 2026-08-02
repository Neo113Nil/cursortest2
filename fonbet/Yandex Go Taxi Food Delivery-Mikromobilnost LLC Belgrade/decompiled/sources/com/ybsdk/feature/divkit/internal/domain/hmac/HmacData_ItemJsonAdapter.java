package com.ybsdk.feature.divkit.internal.domain.hmac;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item$Type;", "typeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HmacData_ItemJsonAdapter extends JsonAdapter<HmacData.Item> {
    private volatile Constructor<HmacData.Item> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "value");
    private final JsonAdapter<HmacData.Item.Type> typeAdapter;

    public HmacData_ItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeAdapter = moshi.adapter(HmacData.Item.Type.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "value");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HmacData.Item fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        HmacData.Item.Type type = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                type = this.typeAdapter.fromJson(jsonReader);
                if (type == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (type != null) {
                return new HmacData.Item(type, str);
            }
            throw Util.missingProperty("type", "type", jsonReader);
        }
        Constructor<HmacData.Item> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HmacData.Item.class.getDeclaredConstructor(HmacData.Item.Type.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (type != null) {
            return constructor.newInstance(type, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HmacData.Item item) {
        HmacData.Item item2 = item;
        if (item2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) item2.getType());
        jsonWriter.name("value");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) item2.getValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(HmacData.Item)");
    }
}
