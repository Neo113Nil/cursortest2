package ru.ok.android.externcalls.analytics.internal.api;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

@Deprecated
/* loaded from: classes9.dex */
public class SimpleItemsApiValue extends BoxedApiValue {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(@NonNull Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(@NonNull JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.beginArray();
        Iterator<CallAnalyticsEvent> it = this.items.iterator();
        while (it.hasNext()) {
            EventSerializer.INSTANCE.serialize(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
