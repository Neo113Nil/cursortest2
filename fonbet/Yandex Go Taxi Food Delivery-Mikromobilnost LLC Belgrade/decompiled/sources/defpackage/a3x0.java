package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a3x0 implements m6u {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public a3x0(Handler handler) {
        this.a = handler;
    }

    public static z2x0 d() {
        z2x0 z2x0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                z2x0Var = arrayList.isEmpty() ? new z2x0() : (z2x0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2x0Var;
    }

    public final z2x0 a(int i, int i2, int i3) {
        z2x0 d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final z2x0 b(int i, Object obj) {
        z2x0 d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final z2x0 c(int i, Object obj, int i2, int i3) {
        z2x0 d = d();
        d.a = this.a.obtainMessage(i, i2, i3, obj);
        return d;
    }

    public final boolean e(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void f(int i) {
        d6z.l(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean g(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
