package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class w5 {
    public final Object a = new Object();
    public final nd2 b = new nd2();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    public final void a() {
        synchronized (this.a) {
            this.c.clear();
            this.d.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(v5 v5Var) {
        a(v5Var, null);
    }

    public final void a(v5 v5Var) {
        a(v5Var, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:13:0x004b, B:18:0x000e, B:20:0x0016), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:13:0x004b, B:18:0x000e, B:20:0x0016), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(v5 v5Var, od2 od2Var, ud3 ud3Var) {
        Long l;
        Long valueOf;
        Map map;
        synchronized (this.a) {
            try {
                Map map2 = (Map) this.c.get(v5Var);
                if (map2 != null && (l = (Long) map2.get(ud3Var)) != null) {
                    valueOf = Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
                    if (valueOf != null) {
                        this.d.add(new u5(v5Var, od2Var.a(valueOf.longValue())));
                    }
                    map = (Map) this.c.get(v5Var);
                    if (map != null) {
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                map = (Map) this.c.get(v5Var);
                if (map != null) {
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(v5 v5Var, ud3 ud3Var) {
        synchronized (this.a) {
            try {
                Map map = (Map) this.c.get(v5Var);
                if (map == null) {
                    map = new LinkedHashMap();
                }
                this.c.put(v5Var, map);
                map.put(ud3Var, Long.valueOf(SystemClock.elapsedRealtime()));
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
