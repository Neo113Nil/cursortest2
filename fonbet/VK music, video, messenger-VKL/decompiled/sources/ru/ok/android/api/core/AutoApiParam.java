package ru.ok.android.api.core;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: AutoApiParam.kt */
/* loaded from: classes9.dex */
public abstract class AutoApiParam {
    private final String name;

    public AutoApiParam(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public boolean isSuitable(String str) {
        return true;
    }

    public abstract void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException;
}
