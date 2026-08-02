package defpackage;

/* loaded from: classes10.dex */
public final class jy40 extends mh00 implements agx {
    public final xab c;
    public Object w;

    public jy40(xab xabVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.c = xabVar;
        this.w = obj2;
    }

    @Override // defpackage.mh00, java.util.Map.Entry
    public final Object getValue() {
        return this.w;
    }

    @Override // defpackage.mh00, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.w;
        this.w = obj;
        e2b0 e2b0Var = (e2b0) this.c.b;
        d2b0 d2b0Var = e2b0Var.w;
        Object obj3 = this.a;
        if (!d2b0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = e2b0Var.c;
        if (!z) {
            d2b0Var.put(obj3, obj);
        } else {
            if (!z) {
                ny61.p();
                return null;
            }
            de11 de11Var = e2b0Var.a[e2b0Var.b];
            Object obj4 = de11Var.a[de11Var.c];
            d2b0Var.put(obj3, obj);
            e2b0Var.c(obj4 != null ? obj4.hashCode() : 0, d2b0Var.c, obj4, 0);
        }
        e2b0Var.z = d2b0Var.x;
        return obj2;
    }
}
