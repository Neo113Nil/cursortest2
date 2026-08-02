package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class ez40 extends mme0 {
    public final LinkedHashMap a;
    public final cot b;

    public /* synthetic */ ez40(boolean z, int i) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    @Override // defpackage.mme0
    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.f());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // defpackage.mme0
    public final boolean b(kme0 kme0Var) {
        return this.a.containsKey(kme0Var);
    }

    @Override // defpackage.mme0
    public final Object c(kme0 kme0Var) {
        Object obj = this.a.get(kme0Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d() {
        if (((AtomicBoolean) this.b.b).get()) {
            ny61.r("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void e() {
        d();
        this.a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof ez40) {
            LinkedHashMap linkedHashMap = ((ez40) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = jl40.l(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(kme0 kme0Var) {
        d();
        this.a.remove(kme0Var);
    }

    public final void g(kme0 kme0Var, Object obj) {
        d();
        if (obj == null) {
            f(kme0Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            linkedHashMap.put(kme0Var, Collections.unmodifiableSet(a.N0((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(kme0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(kme0Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return a.X(this.a.entrySet(), ",\n", "{\n", "\n}", new ej40(9), 24);
    }

    public ez40(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new cot(z);
    }

    public ez40() {
        this(false, 3);
    }
}
