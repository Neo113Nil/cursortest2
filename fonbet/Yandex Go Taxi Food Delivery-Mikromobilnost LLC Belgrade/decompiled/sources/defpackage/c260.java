package defpackage;

import android.content.Context;
import androidx.media3.common.util.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class c260 {
    public static c260 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public c260(Context context) {
        Executor d = fh4.d();
        this.a = d;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        d.execute(new a(context, 0, this));
    }

    public static synchronized c260 a(Context context) {
        c260 c260Var;
        synchronized (c260.class) {
            try {
                if (f == null) {
                    f = new c260(context);
                }
                c260Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c260Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b260 b260Var = (b260) it.next();
            if (b260Var.a.get() == null) {
                copyOnWriteArrayList.remove(b260Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    b260 b260Var2 = (b260) it2.next();
                    b260Var2.b.execute(new sf30(19, b260Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
