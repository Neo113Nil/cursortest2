package ru.ok.android.onelog;

import androidx.annotation.NonNull;
import java.io.IOException;
import ru.ok.android.api.json.JsonSerializer;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
public class OneLogItemSerializer implements JsonSerializer<OneLogItem> {
    public static final String COLLECTOR = "collector";
    public static final String COUNT = "count";
    public static final String CUSTOM = "custom";
    public static final String DATA = "data";
    public static final String GROUPS = "groups";
    public static final OneLogItemSerializer INSTANCE = new OneLogItemSerializer();
    public static final String NETWORK = "network";
    public static final String OPERATION = "operation";
    public static final String TIME = "time";
    public static final String TIMESTAMP = "timestamp";
    public static final String TYPE = "type";
    public static final String UID = "uid";

    @Override // ru.ok.android.api.json.JsonSerializer
    public void serialize(@NonNull JsonWriter jsonWriter, OneLogItem oneLogItem) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("collector");
        jsonWriter.value(oneLogItem.collector());
        jsonWriter.name("timestamp");
        jsonWriter.value(oneLogItem.timestamp());
        jsonWriter.name("type");
        jsonWriter.value(oneLogItem.type());
        jsonWriter.name("operation");
        jsonWriter.value(oneLogItem.operation());
        jsonWriter.name("time");
        jsonWriter.value(oneLogItem.time());
        String uid = oneLogItem.uid();
        if (uid != null) {
            jsonWriter.name("uid");
            jsonWriter.value(uid);
        }
        String network = oneLogItem.network();
        if (network != null) {
            jsonWriter.name("network");
            jsonWriter.value(network);
        }
        if (oneLogItem.count() != 1) {
            jsonWriter.name("count");
            jsonWriter.value(oneLogItem.count());
        }
        int groupsCount = oneLogItem.groupsCount();
        if (groupsCount > 0) {
            jsonWriter.name("groups");
            jsonWriter.beginArray();
            for (int i = 0; i < groupsCount; i++) {
                jsonWriter.nullableValue(oneLogItem.group(i));
            }
            jsonWriter.endArray();
        }
        int dataCount = oneLogItem.dataCount();
        if (dataCount > 0) {
            jsonWriter.name("data");
            jsonWriter.beginArray();
            for (int i2 = 0; i2 < dataCount; i2++) {
                jsonWriter.nullableValue(oneLogItem.datum(i2));
            }
            jsonWriter.endArray();
        }
        int customCount = oneLogItem.customCount();
        if (customCount > 0) {
            jsonWriter.name("custom");
            jsonWriter.beginObject();
            for (int i3 = 0; i3 < customCount; i3++) {
                jsonWriter.name(oneLogItem.customKey(i3));
                jsonWriter.nullableValue(oneLogItem.customValue(i3));
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
