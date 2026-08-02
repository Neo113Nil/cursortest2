package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class z0 implements w0 {
    public static final Object f = new Object();
    public static volatile z0 g;
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap c = new WeakHashMap();
    public final y0 d = new y0(this);
    public boolean e;

    public final void a(Context context, l1 l1Var) {
        synchronized (this.a) {
            try {
                this.b.put(l1Var, null);
                if (!a()) {
                    a(context);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.a) {
            this.b.remove(l1Var);
            b(context);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(Context context) {
        synchronized (this.a) {
            if (this.b.isEmpty() && this.c.isEmpty()) {
                try {
                    if (a()) {
                        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
                        this.e = false;
                    }
                } catch (Throwable unused) {
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.a) {
            try {
                this.c.put(d1Var, null);
                if (!a()) {
                    a(context);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final void a(Context context) {
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.d);
            this.e = true;
        } catch (Throwable unused) {
        }
    }
}
