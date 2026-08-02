package defpackage;

/* loaded from: classes.dex */
public final class j3y implements zvf0 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile zvf0 b;

    public j3y(zvf0 zvf0Var) {
        this.b = zvf0Var;
    }

    @Override // defpackage.zvf0
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
