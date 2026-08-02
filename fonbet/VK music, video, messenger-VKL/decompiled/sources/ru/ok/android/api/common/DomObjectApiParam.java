package ru.ok.android.api.common;

import java.io.IOException;
import java.util.Map;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.dom.DomJsonWriters;
import ru.ok.android.api.json.dom.DomSerializeException;

/* compiled from: DomObjectApiParam.kt */
/* loaded from: classes9.dex */
public final class DomObjectApiParam extends RefApiParam<Map<String, ?>> {
    public DomObjectApiParam(String str, Map<String, ?> map) {
        super(str, map);
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        try {
            DomJsonWriters.domObjectValue(getValue(), jsonWriter);
        } catch (DomSerializeException e) {
            throw new JsonSerializeException(e);
        }
    }
}
