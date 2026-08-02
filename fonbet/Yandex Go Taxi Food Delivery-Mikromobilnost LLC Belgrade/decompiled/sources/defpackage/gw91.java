package defpackage;

/* loaded from: classes.dex */
public final class gw91 {
    public static final Object f = new Object();
    public final String a;
    public final ga91 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ gw91(String str, Object obj, ga91 ga91Var) {
        this.a = str;
        this.c = obj;
        this.b = ga91Var;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (d6z.e == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (rms.k()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (gw91 gw91Var : nw91.a) {
                        if (rms.k()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            ga91 ga91Var = gw91Var.b;
                            if (ga91Var != null) {
                                obj2 = ga91Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            gw91Var.e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                ga91 ga91Var2 = this.b;
                if (ga91Var2 != null) {
                    try {
                        return ga91Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
