package xsna;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class r701 {
    public static final Object g = new Object();
    public final String a;
    public final q701 b;
    public final Object c;
    public final Object d;
    public final Object e = new Object();
    public volatile Object f = null;

    public /* synthetic */ r701(String str, Object obj, Object obj2, q701 q701Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = q701Var;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (pli.e == null) {
            return this.c;
        }
        synchronized (g) {
            try {
                if (fai.G()) {
                    return this.f == null ? this.c : this.f;
                }
                try {
                    for (r701 r701Var : s701.a) {
                        if (fai.G()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            q701 q701Var = r701Var.b;
                            if (q701Var != null) {
                                obj2 = q701Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (g) {
                            r701Var.f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                q701 q701Var2 = this.b;
                if (q701Var2 == null) {
                    return this.c;
                }
                try {
                    return q701Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }
}
