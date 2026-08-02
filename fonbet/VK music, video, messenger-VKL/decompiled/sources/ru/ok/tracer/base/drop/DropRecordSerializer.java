package ru.ok.tracer.base.drop;

import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.e43;

/* compiled from: DropRecordSerializer.kt */
/* loaded from: classes9.dex */
public final class DropRecordSerializer {
    public static final DropRecordSerializer INSTANCE = new DropRecordSerializer();

    private DropRecordSerializer() {
    }

    public final List<DropRecord> fromJsonArray$tracer_base_release(JSONArray jSONArray) throws JSONException {
        ListBuilder e = e43.e();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            e.add(new DropRecord(jSONObject.getString(NotificationCompat.CATEGORY_EVENT), jSONObject.getString("reason"), jSONObject.getInt("count")));
        }
        return e.g();
    }

    public final JSONArray toJsonArray(Collection<DropRecord> collection) {
        JSONArray jSONArray = new JSONArray();
        for (DropRecord dropRecord : collection) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, dropRecord.getEvent$tracer_base_release());
            jSONObject.put("reason", dropRecord.getReason$tracer_base_release());
            jSONObject.put("count", dropRecord.getCount$tracer_base_release());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
