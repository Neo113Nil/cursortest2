package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* loaded from: classes.dex */
public abstract class e8e {
    public final t951 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public e8e(Context context, t951 t951Var) {
        this.a = t951Var;
        this.b = context.getApplicationContext();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new iy2(7, a.J0(this.d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
