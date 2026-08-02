package ru.ok.android.api.json;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import xsna.izs;
import xsna.s3q0;

/* compiled from: utils.kt */
/* loaded from: classes9.dex */
public final class UtilsKt {
    public static final void beginArray(JsonWriter jsonWriter, izs<? super JsonWriter, s3q0> izsVar) {
        jsonWriter.beginArray();
        izsVar.invoke(jsonWriter);
        jsonWriter.endArray();
    }

    public static final void beginObject(JsonWriter jsonWriter, izs<? super JsonWriter, s3q0> izsVar) {
        jsonWriter.beginObject();
        izsVar.invoke(jsonWriter);
        jsonWriter.endObject();
    }

    public static final void forArray(JsonReader jsonReader, izs<? super JsonReader, s3q0> izsVar) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            izsVar.invoke(jsonReader);
        }
        jsonReader.endArray();
    }

    public static final void forObject(JsonReader jsonReader, izs<? super JsonReader, s3q0> izsVar) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            izsVar.invoke(jsonReader);
        }
        jsonReader.endObject();
    }

    public static final <T> T parseFromString(JsonParser<T> jsonParser, String str) {
        return jsonParser.parse(JsonReaderJackson.create(str));
    }

    public static final <T> List<T> parseList(JsonParser<T> jsonParser, JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonParser.parse(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static final <T> String serializeToString(JsonSerializer<T> jsonSerializer, T t) {
        StringWriter stringWriter = new StringWriter();
        jsonSerializer.serialize(new PlainJsonWriter(stringWriter), t);
        return stringWriter.toString();
    }
}
