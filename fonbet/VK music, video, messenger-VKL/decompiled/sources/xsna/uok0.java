package xsna;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: StagingArea.java */
/* loaded from: classes12.dex */
public final class uok0 {
    public final HashMap a = new HashMap();

    public final void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
            this.a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            rip ripVar = (rip) arrayList.get(i);
            if (ripVar != null) {
                ripVar.close();
            }
        }
    }

    public final synchronized rip b(ww8 ww8Var) {
        ww8Var.getClass();
        rip ripVar = (rip) this.a.get(ww8Var);
        if (ripVar != null) {
            synchronized (ripVar) {
                if (!rip.x(ripVar)) {
                    this.a.remove(ww8Var);
                    ahq.j(uok0.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(ripVar)), ww8Var.a(), Integer.valueOf(System.identityHashCode(ww8Var)));
                    return null;
                }
                ripVar = rip.b(ripVar);
            }
        }
        return ripVar;
    }

    public final synchronized void c() {
        ahq.f(uok0.class, Integer.valueOf(this.a.size()), "Count = %d");
    }

    public final synchronized void d(ww8 ww8Var, rip ripVar) {
        ww8Var.getClass();
        if (!rip.x(ripVar)) {
            throw new IllegalArgumentException();
        }
        rip.c((rip) this.a.put(ww8Var, rip.b(ripVar)));
        c();
    }

    public final synchronized void e(ww8 ww8Var, rip ripVar) {
        ww8Var.getClass();
        ripVar.getClass();
        if (!rip.x(ripVar)) {
            throw new IllegalArgumentException();
        }
        rip ripVar2 = (rip) this.a.get(ww8Var);
        if (ripVar2 == null) {
            return;
        }
        uvf o = uvf.o(ripVar2.b);
        uvf o2 = uvf.o(ripVar.b);
        if (o != null && o2 != null) {
            try {
                if (o.r() == o2.r()) {
                    this.a.remove(ww8Var);
                    o2.close();
                    o.close();
                    ripVar2.close();
                    c();
                    return;
                }
            } catch (Throwable th) {
                o2.close();
                o.close();
                ripVar2.close();
                throw th;
            }
        }
        uvf.q(o2);
        uvf.q(o);
        ripVar2.close();
    }
}
