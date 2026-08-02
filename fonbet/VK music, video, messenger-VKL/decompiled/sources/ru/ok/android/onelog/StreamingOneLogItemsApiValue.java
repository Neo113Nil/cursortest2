package ru.ok.android.onelog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
class StreamingOneLogItemsApiValue extends BoxedApiValue {
    private final File file;

    @Nullable
    private final OneLogTrigger trigger;

    public StreamingOneLogItemsApiValue(@NonNull File file, @Nullable OneLogTrigger oneLogTrigger) {
        this.file = file;
        this.trigger = oneLogTrigger;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(@NonNull JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (ApiDebug.isDebug(jsonWriter)) {
            ApiDebug.omitValue(jsonWriter);
            return;
        }
        jsonWriter.beginArray();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.file), StandardCharsets.UTF_8);
            try {
                jsonWriter.jsonValue(inputStreamReader);
                inputStreamReader.close();
                OneLogTrigger oneLogTrigger = this.trigger;
                if (oneLogTrigger != null) {
                    OneLogItemSerializer.INSTANCE.serialize(jsonWriter, oneLogTrigger.toItem());
                }
                jsonWriter.endArray();
            } finally {
            }
        } catch (JsonSyntaxException e) {
            throw new JsonSerializeException(e);
        }
    }
}
