package ru.ok.android.onelog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
class SimpleOneLogItemsApiValue extends BoxedApiValue {
    private final Iterable<OneLogItem> items;

    @Nullable
    private final OneLogTrigger trigger;

    public SimpleOneLogItemsApiValue(@NonNull Iterable<OneLogItem> iterable, @Nullable OneLogTrigger oneLogTrigger) {
        this.items = iterable;
        this.trigger = oneLogTrigger;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(@NonNull JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.beginArray();
        Iterator<OneLogItem> it = this.items.iterator();
        while (it.hasNext()) {
            OneLogItemSerializer.INSTANCE.serialize(jsonWriter, it.next());
        }
        OneLogTrigger oneLogTrigger = this.trigger;
        if (oneLogTrigger != null) {
            OneLogItemSerializer.INSTANCE.serialize(jsonWriter, oneLogTrigger.toItem());
        }
        jsonWriter.endArray();
    }
}
