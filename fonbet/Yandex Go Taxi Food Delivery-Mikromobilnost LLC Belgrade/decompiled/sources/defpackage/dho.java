package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class dho {
    public final r8h a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public dho(r8h r8hVar) {
        this.a = r8hVar;
    }

    public final Float a(cho choVar) {
        Long l;
        Long l2 = (Long) this.b.get(choVar);
        if (l2 != null) {
            long longValue = l2.longValue();
            this.a.getClass();
            l = Long.valueOf(System.currentTimeMillis() - longValue);
        } else {
            l = null;
        }
        if (l != null) {
            return Float.valueOf(l.longValue() / 1000.0f);
        }
        return null;
    }

    public final Float b(cho choVar) {
        Long l;
        Long l2 = (Long) this.b.remove(choVar);
        if (l2 != null) {
            long longValue = l2.longValue();
            this.a.getClass();
            l = Long.valueOf(System.currentTimeMillis() - longValue);
        } else {
            l = null;
        }
        if (l != null) {
            return Float.valueOf(l.longValue() / 1000.0f);
        }
        return null;
    }

    public final void c(cho choVar) {
        this.a.getClass();
        this.b.put(choVar, Long.valueOf(System.currentTimeMillis()));
    }
}
