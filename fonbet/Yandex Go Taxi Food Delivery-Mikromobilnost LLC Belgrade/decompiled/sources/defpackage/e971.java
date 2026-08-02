package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yads.f5;

/* loaded from: classes7.dex */
public final class e971 {
    public final Object a = new Object();
    public final fl81 b = new fl81();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    public final void a(f5 f5Var) {
        c(f5Var, this.b, null);
    }

    public final void b(f5 f5Var, List list) {
        synchronized (this.a) {
            try {
                Map map = (Map) this.c.get(f5Var);
                if (map == null) {
                    map = new LinkedHashMap();
                }
                this.c.put(f5Var, map);
                map.put(list, Long.valueOf(SystemClock.elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:17:0x000e, B:19:0x0016), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:17:0x000e, B:19:0x0016), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f5 f5Var, lo81 lo81Var, Object obj) {
        Long l;
        Long valueOf;
        Map map;
        synchronized (this.a) {
            try {
                Map map2 = (Map) this.c.get(f5Var);
                if (map2 != null && (l = (Long) map2.get(obj)) != null) {
                    valueOf = Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
                    if (valueOf != null) {
                        this.d.add(new y271(f5Var, lo81Var.mo105a(valueOf.longValue())));
                    }
                    map = (Map) this.c.get(f5Var);
                    if (map != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
                map = (Map) this.c.get(f5Var);
                if (map != null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
