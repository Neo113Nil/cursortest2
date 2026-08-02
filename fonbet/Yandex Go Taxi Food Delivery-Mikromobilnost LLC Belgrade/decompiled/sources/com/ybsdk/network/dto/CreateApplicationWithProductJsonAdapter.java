package com.ybsdk.network.dto;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.ybsdk.network.dto.common.Product;
import defpackage.jl40;
import defpackage.v3f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/CreateApplicationWithProductJsonAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/common/Product;", "productAdapter", "Lv3f;", "fromJson", "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Lv3f;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lv3f;Lcom/squareup/moshi/JsonAdapter;)V", "", "productKey", "Ljava/lang/String;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateApplicationWithProductJsonAdapter {
    public static final CreateApplicationWithProductJsonAdapter INSTANCE = new CreateApplicationWithProductJsonAdapter();
    public static final String productKey = "product";

    private CreateApplicationWithProductJsonAdapter() {
    }

    @FromJson
    public final v3f fromJson(JsonReader reader, JsonAdapter<Product> productAdapter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.beginObject();
        Product product = null;
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (jl40.l(nextName, productKey)) {
                product = productAdapter.fromJsonValue(reader.readJsonValue());
            } else if (reader.peek() == JsonReader.Token.STRING) {
                linkedHashMap.put(nextName, reader.nextString());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (product != null) {
            return new v3f(product, linkedHashMap);
        }
        throw new JsonDataException("missing property: product");
    }

    @ToJson
    public final void toJson(JsonWriter writer, v3f value, JsonAdapter<Product> productAdapter) {
        writer.beginObject();
        writer.name(productKey).jsonValue(productAdapter.toJsonValue(value.a));
        Map map = value.b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                writer.name(str).value((String) entry.getValue());
            }
        }
        writer.endObject();
    }
}
