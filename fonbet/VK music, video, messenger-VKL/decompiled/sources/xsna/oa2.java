package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: AndroidLog.kt */
/* loaded from: classes11.dex */
public final class oa2 {
    public static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();
    public static final Map<String, String> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = okhttp3.o.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(okhttp3.o.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(uhv.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = pn00.t(linkedHashMap);
    }
}
