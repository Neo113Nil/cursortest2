package xsna;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: CronetConnectionBuilder.kt */
/* loaded from: classes.dex */
public final class eek {
    public final ExperimentalCronetEngine a;
    public final wjv b;
    public final boolean c;
    public final Executor d;
    public final ExecutorService e = Executors.newSingleThreadExecutor(new bek());

    public eek(ExperimentalCronetEngine experimentalCronetEngine, wjv wjvVar, boolean z, Executor executor) {
        this.a = experimentalCronetEngine;
        this.b = wjvVar;
        this.c = z;
        this.d = executor;
    }

    public static final String a(eek eekVar, Map map, String str) {
        String g0;
        eekVar.getClass();
        List list = (List) map.get(str);
        if (list != null && (g0 = j5g.g0(list, null, null, null, 0, null, 63)) != null) {
            return g0;
        }
        List list2 = (List) map.get(str.toLowerCase(Locale.ROOT));
        if (list2 != null) {
            return j5g.g0(list2, null, null, null, 0, null, 63);
        }
        return null;
    }
}
