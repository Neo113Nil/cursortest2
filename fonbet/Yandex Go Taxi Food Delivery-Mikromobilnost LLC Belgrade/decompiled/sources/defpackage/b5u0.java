package defpackage;

import java.util.Map;

/* loaded from: classes10.dex */
public final class b5u0 implements Map.Entry, agx {
    public final Object a;
    public Object b;
    public final /* synthetic */ c5u0 c;

    public b5u0(c5u0 c5u0Var) {
        this.c = c5u0Var;
        this.a = c5u0Var.w.getKey();
        this.b = c5u0Var.w.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c5u0 c5u0Var = this.c;
        l3t0 l3t0Var = c5u0Var.a;
        if (l3t0Var.b().d != c5u0Var.c) {
            ny61.y();
            return null;
        }
        Object obj2 = this.b;
        l3t0Var.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
