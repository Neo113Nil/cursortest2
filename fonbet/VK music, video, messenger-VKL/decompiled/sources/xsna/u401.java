package xsna;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class u401 implements j601, r401 {
    public static final Object d = new Object();
    public volatile j601 b;
    public volatile Object c = d;

    public u401(j601 j601Var) {
        this.b = j601Var;
    }

    public static r401 a(j601 j601Var) {
        return j601Var instanceof r401 ? (r401) j601Var : new u401(j601Var);
    }

    public static j601 b(j601 j601Var) {
        return j601Var instanceof u401 ? j601Var : new u401(j601Var);
    }

    @Override // xsna.j601
    public final Object zza() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = d;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.c;
                if (obj == obj3) {
                    obj = this.b.zza();
                    Object obj4 = this.c;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
