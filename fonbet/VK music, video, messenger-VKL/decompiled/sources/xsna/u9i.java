package xsna;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: ComponentRegistry.java */
/* loaded from: classes8.dex */
public final class u9i<V> {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Object e = new Object();
    public final Set<V> f = Collections.newSetFromMap(new IdentityHashMap());
    public final Function<q8x, V> g;

    public u9i(Function<q8x, V> function) {
        this.g = function;
    }

    public final Object a(bn5 bn5Var) {
        V apply = this.g.apply(bn5Var);
        synchronized (this.e) {
            this.f.add(apply);
        }
        return apply;
    }

    public final V b(final String str, final String str2, String str3, final q94 q94Var) {
        if (str2 != null && str3 != null) {
            return (V) ((Map) ((Map) this.d.computeIfAbsent(str, new n9i())).computeIfAbsent(str2, new oh8(1))).computeIfAbsent(str3, new Function() { // from class: xsna.o9i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = q8x.a;
                    q94 q94Var2 = q94Var;
                    if (q94Var2 == null) {
                        q94Var2 = jk3.e;
                    }
                    return u9i.this.a(q8x.a(str, str2, str4, q94Var2));
                }
            });
        }
        if (str2 != null) {
            return (V) ((Map) this.b.computeIfAbsent(str, new p9i())).computeIfAbsent(str2, new Function() { // from class: xsna.q9i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = q8x.a;
                    q94 q94Var2 = q94Var;
                    if (q94Var2 == null) {
                        q94Var2 = jk3.e;
                    }
                    return u9i.this.a(q8x.a(str, str4, null, q94Var2));
                }
            });
        }
        if (str3 != null) {
            return (V) ((Map) this.c.computeIfAbsent(str, new r9i(0))).computeIfAbsent(str3, new Function() { // from class: xsna.s9i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = q8x.a;
                    q94 q94Var2 = q94Var;
                    if (q94Var2 == null) {
                        q94Var2 = jk3.e;
                    }
                    return u9i.this.a(q8x.a(str, null, str4, q94Var2));
                }
            });
        }
        return (V) this.a.computeIfAbsent(str, new Function() { // from class: xsna.t9i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str4 = (String) obj;
                int i = q8x.a;
                q94 q94Var2 = q94Var;
                if (q94Var2 == null) {
                    q94Var2 = jk3.e;
                }
                return u9i.this.a(q8x.a(str4, null, null, q94Var2));
            }
        });
    }
}
