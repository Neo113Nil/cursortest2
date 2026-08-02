package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import xsna.wyx;

/* compiled from: DefaultInstantJobManagerFactory.kt */
/* loaded from: classes.dex */
public final class rgl implements z6x {
    public static boolean c;

    @SuppressLint({"StaticFieldLeak"})
    public static oal d;
    public static y6x e;
    public static final rgl a = new rgl();
    public static final CountDownLatch b = new CountDownLatch(1);
    public static final ConcurrentHashMap<String, x6x> f = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Object, wyx.a> g = new ConcurrentHashMap<>();

    public static void a(boolean z) {
        if (c == z) {
            return;
        }
        throw new IllegalStateException(("Expect init state to be '" + z + "'. Current value: " + c).toString());
    }

    public static final synchronized y6x b(Context context, String str, String str2, pla plaVar) {
        y6x y6xVar;
        synchronized (rgl.class) {
            a(true);
            oal oalVar = d;
            if (oalVar == null) {
                oalVar = null;
            }
            y6xVar = new y6x(new c7x(context, oalVar, str, str2, plaVar), new dlc(1));
            f.put(str, y6xVar);
        }
        return y6xVar;
    }

    public final x6x c() {
        y6x y6xVar;
        b.await();
        synchronized (rgl.class) {
            a(true);
            y6xVar = e;
            if (y6xVar == null) {
                y6xVar = null;
            }
        }
        return y6xVar;
    }
}
