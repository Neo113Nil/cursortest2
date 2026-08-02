package xsna;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: JsCustomMessageManager.kt */
/* loaded from: classes11.dex */
public final class r3y {
    public static final ConcurrentHashMap<String, izs<JSONObject, JSONObject>> a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, izs<JSONObject, io.reactivex.rxjava3.core.x<JSONObject>>> b = new ConcurrentHashMap<>();

    public static void a(String str, izs izsVar) {
        a.put(str, izsVar);
    }

    public static void b() {
        a.clear();
        b.clear();
    }

    public static void c(String str) {
        a.remove(str);
        b.remove(str);
    }
}
