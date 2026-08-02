package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.CryptoPro.reprov.utils.Cache;

/* loaded from: classes4.dex */
public final class cv61 extends Cache {
    public final LinkedHashMap c;
    public final int d;
    public final int e;
    public final ReferenceQueue f;

    public cv61(boolean z, int i, int i2) {
        this.d = i;
        this.e = i2 * 1000;
        this.f = z ? new ReferenceQueue() : null;
        this.c = new LinkedHashMap(((int) (i / 0.75f)) + 1, 0.75f, true);
    }

    public final void a() {
        uv61 uv61Var;
        ReferenceQueue referenceQueue = this.f;
        if (referenceQueue == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.size();
        while (true) {
            uv61 uv61Var2 = (uv61) referenceQueue.poll();
            if (uv61Var2 == null) {
                return;
            }
            Object b = uv61Var2.b();
            if (b != null && (uv61Var = (uv61) linkedHashMap.remove(b)) != null && uv61Var2 != uv61Var) {
                linkedHashMap.put(b, uv61Var);
            }
        }
    }

    public final void b() {
        a();
        if (this.e == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            if (!((uv61) it.next()).a(currentTimeMillis)) {
                it.remove();
            }
        }
    }

    @Override // ru.CryptoPro.reprov.utils.Cache
    public final synchronized void clear() {
        try {
            if (this.f != null) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    ((uv61) it.next()).a();
                }
                while (this.f.poll() != null) {
                }
            }
            this.c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.reprov.utils.Cache
    public final synchronized Object get(Object obj) {
        a();
        uv61 uv61Var = (uv61) this.c.get(obj);
        if (uv61Var == null) {
            return null;
        }
        if (uv61Var.a(this.e == 0 ? 0L : System.currentTimeMillis())) {
            return uv61Var.c();
        }
        this.c.remove(obj);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.CryptoPro.reprov.utils.Cache
    public final synchronized void put(Object obj, Object obj2) {
        ow61 ow61Var;
        a();
        long currentTimeMillis = this.e == 0 ? 0L : System.currentTimeMillis() + this.e;
        ReferenceQueue referenceQueue = this.f;
        if (referenceQueue != null) {
            cx61 cx61Var = new cx61(obj2, referenceQueue);
            cx61Var.a = obj;
            cx61Var.b = currentTimeMillis;
            ow61Var = cx61Var;
        } else {
            ow61 ow61Var2 = new ow61();
            ow61Var2.a = obj;
            ow61Var2.b = obj2;
            ow61Var2.c = currentTimeMillis;
            ow61Var = ow61Var2;
        }
        uv61 uv61Var = (uv61) this.c.put(obj, ow61Var);
        if (uv61Var != null) {
            uv61Var.a();
            return;
        }
        if (this.c.size() > this.d) {
            b();
            if (this.c.size() > this.d) {
                Iterator it = this.c.values().iterator();
                uv61 uv61Var2 = (uv61) it.next();
                it.remove();
                uv61Var2.a();
            }
        }
    }

    @Override // ru.CryptoPro.reprov.utils.Cache
    public final synchronized void remove(Object obj) {
        a();
        uv61 uv61Var = (uv61) this.c.remove(obj);
        if (uv61Var != null) {
            uv61Var.a();
        }
    }

    @Override // ru.CryptoPro.reprov.utils.Cache
    public final synchronized int size() {
        b();
        return this.c.size();
    }
}
