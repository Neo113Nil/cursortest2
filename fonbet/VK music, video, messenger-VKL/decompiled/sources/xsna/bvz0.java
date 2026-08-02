package xsna;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class bvz0 implements dwz0 {
    public static final Object d = new Object();
    public volatile dwz0 b;
    public volatile Object c;

    public static dwz0 a(dwz0 dwz0Var) {
        if (dwz0Var instanceof bvz0) {
            return dwz0Var;
        }
        bvz0 bvz0Var = new bvz0();
        bvz0Var.c = d;
        bvz0Var.b = dwz0Var;
        return bvz0Var;
    }

    @Override // xsna.dwz0
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
