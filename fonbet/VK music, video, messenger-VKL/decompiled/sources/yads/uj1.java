package yads;

/* loaded from: classes10.dex */
public final class uj1 extends qx0 {
    public static final Object f = new Object();
    public final Object d;
    public final Object e;

    public uj1(w73 w73Var, Object obj, Object obj2) {
        super(w73Var);
        this.d = obj;
        this.e = obj2;
    }

    @Override // yads.qx0, yads.w73
    public final int a(Object obj) {
        Object obj2;
        w73 w73Var = this.c;
        if (f.equals(obj) && (obj2 = this.e) != null) {
            obj = obj2;
        }
        return w73Var.a(obj);
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        this.c.a(i, t73Var, z);
        if (mc3.a(t73Var.c, this.e) && z) {
            t73Var.c = f;
        }
        return t73Var;
    }

    @Override // yads.qx0, yads.w73
    public final Object a(int i) {
        Object a = this.c.a(i);
        return mc3.a(a, this.e) ? f : a;
    }

    @Override // yads.qx0, yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        this.c.a(i, v73Var, j);
        if (mc3.a(v73Var.b, this.d)) {
            v73Var.b = v73.s;
        }
        return v73Var;
    }

    public static uj1 a(gn1 gn1Var) {
        return new uj1(new vj1(gn1Var), v73.s, f);
    }
}
