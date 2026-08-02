package defpackage;

/* loaded from: classes8.dex */
public final class k1x0 implements yvf0 {
    public final jn2 a;
    public volatile Object b;
    public final Object c = new Object();

    public k1x0(jn2 jn2Var) {
        this.a = jn2Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Object obj;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == null) {
                obj = this.a.invoke();
                this.b = obj;
            }
        }
        return obj;
    }
}
