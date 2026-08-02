package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class js7 {
    public final Executor a;
    public lm7 c;
    public us7 d;
    public zn7 e;
    public final Object b = new Object();
    public final is7 f = new is7(0, this);
    public volatile List g = EmptyList.a;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final LinkedHashMap k = new LinkedHashMap();

    public js7(Executor executor) {
        this.a = executor;
    }

    public final void a(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        if (!isEmpty) {
            sgb1.f("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        sgb1.f("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        Iterator it2 = copyOnWriteArrayList.iterator();
        if (it2.hasNext()) {
            throw unr0.i(it2);
        }
    }

    public final void b(String str) {
        synchronized (this.b) {
            pq60 pq60Var = (pq60) this.k.remove(str);
            us7 us7Var = this.d;
            if (pq60Var != null && us7Var != null) {
                try {
                    geb1.f().execute(new nm7(8, us7Var.b(str), pq60Var));
                    sgb1.g(3, "CameraPresencePrvdr");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void c(ar7 ar7Var) {
        String c = ar7Var.c();
        if (this.h.get()) {
            synchronized (this.b) {
                if (this.k.containsKey(c)) {
                    return;
                }
                hs7 hs7Var = new hs7(this, c);
                geb1.f().execute(new nm7(9, ar7Var, hs7Var));
                this.k.put(c, hs7Var);
                sgb1.g(3, "CameraPresencePrvdr");
            }
        }
    }

    public final void d() {
        if (!this.h.getAndSet(false)) {
            sgb1.g(3, "CameraPresencePrvdr");
            return;
        }
        sgb1.f("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        zn7 zn7Var = this.e;
        if (zn7Var != null) {
            zn7Var.a(this.f);
        }
        synchronized (this.b) {
            if (!this.k.isEmpty()) {
                Map t = b.t(this.k);
                this.k.clear();
                us7 us7Var = this.d;
                if (us7Var != null) {
                    LinkedHashSet c = us7Var.c();
                    ArrayList arrayList = new ArrayList(tcc.n(c, 10));
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((br7) it.next()).f());
                    }
                    t.size();
                    sgb1.g(3, "CameraPresencePrvdr");
                    ArrayList arrayList2 = new ArrayList(t.size());
                    for (Map.Entry entry : t.entrySet()) {
                        String str = (String) entry.getKey();
                        geb1.f().execute(new d1(11, arrayList, (pq60) entry.getValue(), str));
                        arrayList2.add(zy11.a);
                    }
                }
            }
        }
        this.i.clear();
        this.j.clear();
        this.g = EmptyList.a;
        this.c = null;
        this.d = null;
    }

    public final void e(lm7 lm7Var, us7 us7Var) {
        if (this.h.compareAndSet(false, true)) {
            sgb1.f("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            LinkedHashSet a = lm7Var.a();
            ArrayList arrayList = new ArrayList(tcc.n(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(new yq7(scc.i((String) it.next()), null));
            }
            this.g = arrayList;
            this.c = lm7Var;
            this.d = us7Var;
            zn7 zn7Var = lm7Var.j;
            this.e = zn7Var;
            if (zn7Var != null) {
                zn7Var.b(this.a, this.f);
            }
        }
    }
}
