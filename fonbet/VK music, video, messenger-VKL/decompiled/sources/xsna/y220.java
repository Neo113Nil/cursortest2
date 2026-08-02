package xsna;

import java.util.Map;

/* compiled from: MemoryMappedMap.kt */
/* loaded from: classes6.dex */
public final class y220 implements Map.Entry<Object, Object>, gcy {
    public final /* synthetic */ Object b;
    public final /* synthetic */ x220<Object, Object> c;

    public y220(Object obj, x220<Object, Object> x220Var) {
        this.b = obj;
        this.c = x220Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        x220<Object, Object> x220Var = this.c;
        Object obj = this.b;
        Object obj2 = x220Var.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("If key exists, it must have value: " + obj);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
