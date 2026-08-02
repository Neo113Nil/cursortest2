package ru.ok.android.api.common;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.VectorApiWriterKt;
import ru.ok.android.api.json.JsonWriter;
import xsna.e43;

/* compiled from: VectorApiValue.kt */
/* loaded from: classes9.dex */
public final class VectorApiValue extends RefApiValue<Collection<? extends String>> {
    public VectorApiValue(Collection<String> collection) {
        super(collection);
    }

    @Override // ru.ok.android.api.common.RefApiValue, ru.ok.android.api.common.BoxedApiValue
    public boolean shouldSkipParam() {
        Collection<? extends String> value = getValue();
        return value == null || value.isEmpty();
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(JsonWriter jsonWriter) throws IOException {
        Collection<? extends String> value = getValue();
        if (value == null) {
            value = EmptyList.b;
        }
        VectorApiWriterKt.vectorValue(jsonWriter, value);
    }

    public VectorApiValue(String... strArr) {
        this(e43.l(Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public VectorApiParam intoParam(String str) {
        return new VectorApiParam(str, (Collection<String>) getValue());
    }
}
