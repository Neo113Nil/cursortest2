package xsna;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.uyc0;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public final class nh50 extends uyc0 {
    public final LinkedHashMap a;
    public final o04 b;

    /* compiled from: Preferences.kt */
    /* loaded from: classes12.dex */
    public static final class a extends Lambda implements izs<Map.Entry<uyc0.a<?>, Object>, CharSequence> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final CharSequence invoke(Map.Entry<uyc0.a<?>, Object> entry) {
            Map.Entry<uyc0.a<?>, Object> entry2 = entry;
            Object value = entry2.getValue();
            return tdj.a(new StringBuilder("  "), entry2.getKey().a, " = ", value instanceof byte[] ? rl3.Y((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public nh50() {
        this(false, 3);
    }

    @Override // xsna.uyc0
    public final Map<uyc0.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.i(), pair.j());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.uyc0
    public final <T> T b(uyc0.a<T> aVar) {
        T t = (T) this.a.get(aVar);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    public final void c() {
        if (((AtomicBoolean) this.b.a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(uyc0.a<?> aVar, Object obj) {
        c();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            c();
            linkedHashMap.remove(aVar);
        } else if (obj instanceof Set) {
            linkedHashMap.put(aVar, Collections.unmodifiableSet(j5g.S0((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(aVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(aVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof nh50) {
            nh50 nh50Var = (nh50) obj;
            LinkedHashMap linkedHashMap = nh50Var.a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = nh50Var.a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = epx.f(value, obj2);
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
        return j5g.g0(this.a.entrySet(), ",\n", "{\n", "\n}", 0, a.i, 24);
    }

    public /* synthetic */ nh50(boolean z, int i) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    public nh50(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new o04(z);
    }
}
