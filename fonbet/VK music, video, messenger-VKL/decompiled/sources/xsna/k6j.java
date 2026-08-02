package xsna;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: ConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class k6j<T> {
    public final hwx0 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet<f6j<T>> d = new LinkedHashSet<>();
    public T e;

    public k6j(Context context, hwx0 hwx0Var) {
        this.a = hwx0Var;
        this.b = context.getApplicationContext();
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 == null || !t2.equals(t)) {
                this.e = t;
                this.a.d.execute(new j6j(0, j5g.O0(this.d), this));
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
