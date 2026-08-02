package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public class puy {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static ouy a(Looper looper, Object obj, String str) {
        cvw.m(obj, "Listener must not be null");
        cvw.m(looper, "Looper must not be null");
        return new ouy(looper, obj, str);
    }

    public static ouy b(Object obj, String str, Executor executor) {
        cvw.m(obj, "Listener must not be null");
        cvw.m(executor, "Executor must not be null");
        return new ouy(obj, str, executor);
    }

    public static luy c(Object obj, String str) {
        cvw.m(obj, "Listener must not be null");
        cvw.j(str, "Listener type must not be empty");
        return new luy(obj, str);
    }
}
