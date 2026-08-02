package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class vf {
    public static final Object j = new Object();
    public static volatile vf k;
    public final long a;
    public final long b;
    public final Set c;
    public final yvj d;
    public final jf e;
    public final pf f;
    public final h73 g;
    public final x10 h = new x10();
    public final AtomicBoolean i = new AtomicBoolean(false);

    public vf(long j2, long j3, Set set, yvj yvjVar, jf jfVar, pf pfVar, h73 h73Var) {
        this.a = j2;
        this.b = j3;
        this.c = set;
        this.d = yvjVar;
        this.e = jfVar;
        this.f = pfVar;
        this.g = h73Var;
    }

    public static final void a(vf vfVar) {
        vfVar.g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = l43.a;
            if (l43.a(stackTraceElementArr, vfVar.c)) {
                vfVar.f.a.reportAnr(allStackTraces);
            }
        }
    }
}
