package defpackage;

import com.yandex.go.network_metrics.NetworkEventParam;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes8.dex */
public abstract class eho {
    public static final String a = NetworkEventParam.REQUEST_SIZE.getKey();
    public static final String b = NetworkEventParam.RESPONSE_SIZE.getKey();

    public static final MapBuilder a(ek7 ek7Var) {
        MapBuilder mapBuilder = new MapBuilder();
        NetworkEventParam networkEventParam = NetworkEventParam.HOST;
        ConcurrentHashMap concurrentHashMap = ek7Var.c;
        c(mapBuilder, networkEventParam, concurrentHashMap.get("request_host"));
        c(mapBuilder, NetworkEventParam.PATH, concurrentHashMap.get("request_path"));
        c(mapBuilder, NetworkEventParam.KIND, concurrentHashMap.get("request_kind"));
        c(mapBuilder, NetworkEventParam.ERROR_DOMAIN, concurrentHashMap.get("error_domain"));
        c(mapBuilder, NetworkEventParam.ERROR_DESCRIPTION, concurrentHashMap.get("error_description"));
        c(mapBuilder, NetworkEventParam.LOCAL_QUEUE_DURATION, concurrentHashMap.get("local_queue_time"));
        c(mapBuilder, NetworkEventParam.LOCAL_ID, concurrentHashMap.get("local_id"));
        c(mapBuilder, NetworkEventParam.HTTP_CODE, concurrentHashMap.get("response_code"));
        c(mapBuilder, NetworkEventParam.RETRY_NUMBER, concurrentHashMap.get("retry_number"));
        c(mapBuilder, NetworkEventParam.TOTAL_DURATION, concurrentHashMap.get("total_duration"));
        c(mapBuilder, NetworkEventParam.TRACE_ID, concurrentHashMap.get("trace_id"));
        return mapBuilder.j();
    }

    public static final MapBuilder b(ek7 ek7Var) {
        MapBuilder mapBuilder = new MapBuilder();
        c(mapBuilder, NetworkEventParam.HOST, ek7Var.c.get("request_host"));
        NetworkEventParam networkEventParam = NetworkEventParam.PATH;
        ConcurrentHashMap concurrentHashMap = ek7Var.c;
        c(mapBuilder, networkEventParam, concurrentHashMap.get("request_path"));
        c(mapBuilder, NetworkEventParam.KIND, concurrentHashMap.get("request_kind"));
        c(mapBuilder, NetworkEventParam.REQUEST_DURATION, concurrentHashMap.get("request_duration"));
        Object obj = concurrentHashMap.get("request_size");
        if (obj != null) {
            mapBuilder.put(a, obj);
        }
        c(mapBuilder, NetworkEventParam.LOCAL_QUEUE_DURATION, concurrentHashMap.get("local_queue_time"));
        c(mapBuilder, NetworkEventParam.LOCAL_ID, concurrentHashMap.get("local_id"));
        c(mapBuilder, NetworkEventParam.HTTP_CODE, concurrentHashMap.get("response_code"));
        c(mapBuilder, NetworkEventParam.RETRY_NUMBER, concurrentHashMap.get("retry_number"));
        Object obj2 = concurrentHashMap.get("response_size");
        if (obj2 != null) {
            mapBuilder.put(b, obj2);
        }
        c(mapBuilder, NetworkEventParam.PARSING_DURATION, concurrentHashMap.get("parsing_duration"));
        c(mapBuilder, NetworkEventParam.TOTAL_DURATION, concurrentHashMap.get("total_duration"));
        c(mapBuilder, NetworkEventParam.TRACE_ID, concurrentHashMap.get("trace_id"));
        return mapBuilder.j();
    }

    public static final void c(MapBuilder mapBuilder, NetworkEventParam networkEventParam, Object obj) {
        String key = networkEventParam.getKey();
        if (obj != null) {
            mapBuilder.put(key, obj);
        }
    }
}
