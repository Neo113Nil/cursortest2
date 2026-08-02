package defpackage;

/* loaded from: classes.dex */
public final class fi61 implements wi61 {
    public static final Object c = new Object();
    public volatile wi61 a;
    public volatile Object b;

    public static fi61 b(wi61 wi61Var) {
        if (wi61Var instanceof fi61) {
            return (fi61) wi61Var;
        }
        fi61 fi61Var = new fi61();
        fi61Var.b = c;
        fi61Var.a = wi61Var;
        return fi61Var;
    }

    @Override // defpackage.wi61
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.a();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
