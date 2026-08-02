package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonWriter;
import xsna.ro;
import xsna.s3q0;

/* compiled from: IterableItemsApiValue.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class IterableItemsApiValue extends BoxedApiValue {
    private final Iterator<String> items;

    public IterableItemsApiValue(Iterator<String> it) {
        this.items = it;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (ApiDebug.isDebug(jsonWriter)) {
            ApiDebug.omitValue(jsonWriter);
            return;
        }
        jsonWriter.beginArray();
        while (this.items.hasNext()) {
            try {
                try {
                    StringReader stringReader = new StringReader(this.items.next());
                    try {
                        jsonWriter.jsonValue(stringReader);
                        s3q0 s3q0Var = s3q0.a;
                        stringReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(stringReader, th);
                            throw th2;
                        }
                    }
                } catch (NoSuchElementException unused) {
                } catch (JsonSyntaxException e) {
                    throw new JsonSerializeException(e);
                }
            } finally {
                jsonWriter.endArray();
            }
        }
    }
}
