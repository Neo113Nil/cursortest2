package xsna;

import java.util.ConcurrentModificationException;
import java.util.Map;
import xsna.kcy;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class huk0 implements Map.Entry<Object, Object>, kcy.a {
    public final Object b;
    public Object c;
    public final /* synthetic */ iuk0<Object, Object> d;

    public huk0(iuk0<Object, Object> iuk0Var) {
        this.d = iuk0Var;
        this.b = iuk0Var.e.getKey();
        this.c = iuk0Var.e.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        iuk0<Object, Object> iuk0Var = this.d;
        if (iuk0Var.b.b().d != iuk0Var.d) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.c;
        iuk0Var.b.put(this.b, obj);
        this.c = obj;
        return obj2;
    }
}
