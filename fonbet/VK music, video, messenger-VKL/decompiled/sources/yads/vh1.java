package yads;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public abstract class vh1 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final sh1 a(Context context) {
        return a(context, "YadPreferenceFile");
    }

    public static final sh1 a(Context context, String str) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new uh1(context, str, new sz2())))) != null) {
            obj = putIfAbsent;
        }
        return (sh1) obj;
    }
}
