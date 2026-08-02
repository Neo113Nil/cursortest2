package ru.ok.android.api.debug;

import java.io.IOException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: DebugApiWriter.kt */
/* loaded from: classes9.dex */
public final class ApiDebug {
    public static final boolean isDebug(JsonWriter jsonWriter) {
        return (jsonWriter instanceof DebugApiWriter) && ((DebugApiWriter) jsonWriter).isDebug();
    }

    public static final void omitValue(JsonWriter jsonWriter) throws IOException, UnsupportedOperationException {
        if (!(jsonWriter instanceof DebugApiWriter)) {
            throw new UnsupportedOperationException("Cannot omitValue");
        }
        ((DebugApiWriter) jsonWriter).omitValue();
    }

    public static final void sensitiveValue(JsonWriter jsonWriter, String str) throws IOException {
        if (jsonWriter instanceof DebugApiWriter) {
            DebugApiWriter debugApiWriter = (DebugApiWriter) jsonWriter;
            if (debugApiWriter.isDebug()) {
                debugApiWriter.omitValue();
                return;
            }
        }
        jsonWriter.nullableValue(str);
    }
}
