package xsna;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.util.Map;
import one.video.stat.transport.Param;
import org.json.JSONObject;
import ru.ok.android.api.json.PlainJsonWriter;

/* compiled from: EventDumper.kt */
/* loaded from: classes8.dex */
public final class typ {
    public static void a(yi80 yi80Var, Writer writer) throws IOException {
        PlainJsonWriter plainJsonWriter = new PlainJsonWriter(writer);
        plainJsonWriter.beginObject();
        plainJsonWriter.name("event_name");
        plainJsonWriter.value(yi80Var.a);
        plainJsonWriter.name("vsid");
        plainJsonWriter.value(yi80Var.b);
        String str = yi80Var.c;
        if (str != null) {
            plainJsonWriter.name("isid");
            plainJsonWriter.value(str);
        }
        plainJsonWriter.name("uv_movie_id");
        plainJsonWriter.value(yi80Var.d);
        plainJsonWriter.name("event_number");
        plainJsonWriter.value(yi80Var.e);
        Long l = yi80Var.f;
        if (l != null) {
            long longValue = l.longValue();
            plainJsonWriter.name("playback_position");
            plainJsonWriter.value(longValue);
        }
        plainJsonWriter.name("current_tvt");
        plainJsonWriter.value(yi80Var.g);
        String str2 = yi80Var.h;
        if (str2 != null) {
            plainJsonWriter.name("cdn_host");
            plainJsonWriter.value(str2);
        }
        plainJsonWriter.name("client_time");
        plainJsonWriter.value(yi80Var.j);
        for (Map.Entry entry : yi80Var.i.entrySet()) {
            String h = ((Param) entry.getKey()).h();
            Object value = entry.getValue();
            if (value instanceof String) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(((String) value).toString());
            } else if (value instanceof Long) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(((Number) value).longValue());
            } else if (value instanceof oxp0) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(emi.z(((oxp0) value).b));
            } else if (value instanceof Integer) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(((Number) value).intValue());
            } else if (value instanceof jxp0) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(((jxp0) value).b & 4294967295L);
            } else if (value instanceof Boolean) {
                plainJsonWriter.name(h);
                plainJsonWriter.value(((Boolean) value).booleanValue());
            } else if (value instanceof JSONObject) {
                plainJsonWriter.name(h);
                plainJsonWriter.jsonValue(new StringReader(((JSONObject) value).toString()));
            } else {
                Log.e("EventDumper", "Unexpected type for key \"" + h + "\" (value= " + value + "), skipped");
            }
        }
        plainJsonWriter.endObject();
        plainJsonWriter.flush();
    }
}
