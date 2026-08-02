package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.v;

/* loaded from: classes.dex */
public class dy40 extends v {
    public void m(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == v.k;
            this.f = obj;
        }
        if (z) {
            c43 a = c43.a();
            mbs mbsVar = this.j;
            ylh ylhVar = a.a;
            if (ylhVar.c == null) {
                synchronized (ylhVar.a) {
                    try {
                        if (ylhVar.c == null) {
                            ylhVar.c = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            ylhVar.c.post(mbsVar);
        }
    }
}
