package defpackage;

import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public interface mei0 {
    Map a();

    String b();

    String c();

    Map d();

    String getEventType();

    Map getPayload();

    long getTimestamp();

    default MapBuilder toMap() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("EventName", getEventType());
        mapBuilder.put("CreativeType", c());
        mapBuilder.put("EventTimestamp", Long.valueOf(getTimestamp()));
        mapBuilder.put("CreativeId", b());
        mapBuilder.put("Payload", getPayload());
        mapBuilder.put("ClientPayload", a());
        mapBuilder.put("ElementPayload", d());
        return mapBuilder.j();
    }
}
