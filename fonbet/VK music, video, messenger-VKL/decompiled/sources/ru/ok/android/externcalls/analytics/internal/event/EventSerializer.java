package ru.ok.android.externcalls.analytics.internal.event;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

/* compiled from: EventSerializer.kt */
/* loaded from: classes9.dex */
public final class EventSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
    }

    private final void writeValue(JsonWriter jsonWriter, EventItemValue eventItemValue) {
        if (eventItemValue instanceof EventItemValue.FloatValue) {
            jsonWriter.value(Float.valueOf(((EventItemValue.FloatValue) eventItemValue).m310unboximpl()));
            return;
        }
        if (eventItemValue instanceof EventItemValue.IntValue) {
            jsonWriter.value(((EventItemValue.IntValue) eventItemValue).m317unboximpl());
            return;
        }
        if (eventItemValue instanceof EventItemValue.LongValue) {
            jsonWriter.value(((EventItemValue.LongValue) eventItemValue).m324unboximpl());
            return;
        }
        if (eventItemValue instanceof EventItemValue.BooleanValue) {
            jsonWriter.value(((EventItemValue.BooleanValue) eventItemValue).m303unboximpl());
            return;
        }
        if (eventItemValue instanceof EventItemValue.StringValue) {
            jsonWriter.value(((EventItemValue.StringValue) eventItemValue).m338unboximpl());
        } else if (eventItemValue instanceof EventItemValue.ArrStringValue) {
            m340writeValueiurDigI(jsonWriter, ((EventItemValue.ArrStringValue) eventItemValue).m296unboximpl());
        } else {
            if (!(eventItemValue instanceof EventItemValue.MapStringStringValue)) {
                throw new NoWhenBranchMatchedException();
            }
            m339writeValue4i0utlQ(jsonWriter, ((EventItemValue.MapStringStringValue) eventItemValue).m331unboximpl());
        }
    }

    /* renamed from: writeValue-4i0utlQ, reason: not valid java name */
    private final void m339writeValue4i0utlQ(JsonWriter jsonWriter, Map<String, ? extends String> map) {
        try {
            jsonWriter.beginObject();
            for (Map.Entry<String, ? extends String> entry : map.entrySet()) {
                jsonWriter.name(entry.getKey());
                jsonWriter.value(entry.getValue());
            }
        } finally {
            jsonWriter.endObject();
        }
    }

    /* renamed from: writeValue-iurDigI, reason: not valid java name */
    private final void m340writeValueiurDigI(JsonWriter jsonWriter, Collection<? extends String> collection) {
        try {
            jsonWriter.beginArray();
            Iterator<? extends String> it = collection.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
        } finally {
            jsonWriter.endArray();
        }
    }

    public final void serialize(JsonWriter jsonWriter, CallAnalyticsEvent callAnalyticsEvent) {
        jsonWriter.beginObject();
        for (Map.Entry<String, EventItemValue> entry : callAnalyticsEvent.getItems().entrySet()) {
            jsonWriter.name(entry.getKey());
            writeValue(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
