package ru.ok.android.api.common;

import java.io.IOException;
import java.util.Arrays;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.dom.DomJsonWriters;
import ru.ok.android.api.json.dom.DomSerializeException;
import xsna.e43;

/* compiled from: DomArrayApiParam.kt */
/* loaded from: classes9.dex */
public final class DomArrayApiParam extends RefApiParam<Iterable<?>> {
    public DomArrayApiParam(String str, Iterable<?> iterable) {
        super(str, iterable);
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        try {
            DomJsonWriters.domArrayValue(getValue(), jsonWriter);
        } catch (DomSerializeException e) {
            throw new JsonSerializeException(e);
        }
    }

    public DomArrayApiParam(String str, Object... objArr) {
        this(str, e43.l(Arrays.copyOf(objArr, objArr.length)));
    }
}
