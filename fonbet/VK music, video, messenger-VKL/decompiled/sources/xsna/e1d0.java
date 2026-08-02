package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PreloadItemsContainer.kt */
/* loaded from: classes8.dex */
public final class e1d0 {
    public final HashMap<sht0, d1d0> a = new HashMap<>();
    public final HashMap<q1d0, sht0> b = new HashMap<>();

    public final synchronized void a(t440 t440Var) {
        try {
            b();
            for (Map.Entry<sht0, d1d0> entry : this.a.entrySet()) {
                if (entry.getValue().c == null) {
                    t440Var.invoke(entry.getValue());
                }
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        HashMap<sht0, d1d0> hashMap = this.a;
        Iterator<Map.Entry<sht0, d1d0>> it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap<q1d0, sht0> hashMap2 = this.b;
            if (!hasNext) {
                for (Map.Entry<q1d0, sht0> entry : hashMap2.entrySet()) {
                    q1d0 key = entry.getKey();
                    sht0 value = entry.getValue();
                    if (!hashMap.containsKey(value)) {
                        return;
                    }
                    d1d0 d1d0Var = hashMap.get(value);
                    if (!epx.f(d1d0Var != null ? d1d0Var.c : null, key)) {
                        return;
                    }
                }
                return;
            }
            Map.Entry<sht0, d1d0> next = it.next();
            sht0 key2 = next.getKey();
            q1d0 q1d0Var = next.getValue().c;
            if (!epx.f(key2, next.getValue().a)) {
                return;
            }
            if (q1d0Var != null && !hashMap2.containsKey(q1d0Var)) {
                return;
            }
        }
    }

    public final synchronized q1d0 c(sht0 sht0Var) {
        q1d0 q1d0Var;
        try {
            d1d0 remove = this.a.remove(sht0Var);
            if (remove == null || (q1d0Var = remove.c) == null) {
                q1d0Var = null;
            } else {
                this.b.remove(q1d0Var);
            }
        } finally {
            b();
        }
        return q1d0Var;
    }
}
