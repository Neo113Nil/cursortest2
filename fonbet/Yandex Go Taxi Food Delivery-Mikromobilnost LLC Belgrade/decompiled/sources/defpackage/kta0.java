package defpackage;

import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class kta0 {
    public final Looper a;
    public final HashMap b = new HashMap();
    public final zq60 c;
    public final sq60 d;

    public kta0(Looper looper) {
        this.a = looper;
        zq60 zq60Var = new zq60();
        this.c = zq60Var;
        this.d = new sq60(zq60Var);
    }

    public final void a(long j, long j2) {
        z83.g(null, this.a, Looper.myLooper());
        ita0 ita0Var = new ita0(j, j2);
        synchronized (this) {
        }
        this.d.rewind();
        while (this.d.hasNext()) {
            jta0 jta0Var = (jta0) this.d.next();
            z83.g(null, jta0Var.c.a, Looper.myLooper());
            if (jta0Var.a.equals(ita0Var)) {
                jta0Var.b.a(null);
            }
        }
    }
}
