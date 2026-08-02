package ru.ok.android.api.core;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: VectorApiWriter.kt */
/* loaded from: classes9.dex */
public final class VectorApiWriterKt {
    public static final void vectorValue(JsonWriter jsonWriter, Collection<String> collection) throws IOException {
        if (jsonWriter instanceof VectorApiWriter) {
            ((VectorApiWriter) jsonWriter).vectorValue(collection);
            return;
        }
        jsonWriter.beginArray();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            jsonWriter.nullableValue(it.next());
        }
        jsonWriter.endArray();
    }
}
