package com.ybsdk.rconfig.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.ybsdk.rconfig.configs.ShimmersConfigImpl;
import defpackage.bvu0;
import defpackage.mvr0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/adapters/ShimmersConfigAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;)V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShimmersConfigAdapter extends JsonAdapter<ShimmersConfigImpl> {
    public static final ShimmersConfigAdapter a = new ShimmersConfigAdapter();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public ShimmersConfigImpl fromJson(JsonReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            JsonReader.Token peek = reader.peek();
            int i = peek == null ? -1 : mvr0.a[peek.ordinal()];
            if (i == 1) {
                Integer l = bvu0.l(10, reader.nextString());
                if (l != null) {
                    linkedHashMap.put(nextName, Integer.valueOf(l.intValue()));
                }
            } else if (i != 2) {
                reader.skipValue();
            } else {
                linkedHashMap.put(nextName, Integer.valueOf(reader.nextInt()));
            }
        }
        reader.endObject();
        return new ShimmersConfigImpl(linkedHashMap);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, ShimmersConfigImpl value) {
        writer.beginObject();
        if (value != null) {
            Field[] declaredFields = ShimmersConfigImpl.class.getDeclaredFields();
            ArrayList<Field> arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (field.getAnnotation(Json.class) != null) {
                    arrayList.add(field);
                }
            }
            for (Field field2 : arrayList) {
                field2.setAccessible(true);
                writer.name(((Json) field2.getAnnotation(Json.class)).name());
                writer.value(Integer.valueOf(field2.getInt(value)));
                field2.setAccessible(false);
            }
        }
        writer.endObject();
    }
}
