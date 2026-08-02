package xsna;

import java.util.Map;
import xsna.kcy;

/* compiled from: OrderedScatterMap.kt */
/* loaded from: classes4.dex */
public final class tx80 implements Map.Entry<Object, Object>, kcy.a {
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ux80<Object, Object> e;

    public tx80(Object obj, Object obj2, ux80<Object, Object> ux80Var) {
        this.d = obj;
        this.e = ux80Var;
        this.b = obj;
        this.c = obj2;
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
        Object l = this.e.b.l(this.d, obj);
        return l == null ? obj : l;
    }
}
