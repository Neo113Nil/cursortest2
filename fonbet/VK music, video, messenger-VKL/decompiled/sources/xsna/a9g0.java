package xsna;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ReservoirCell.java */
/* loaded from: classes8.dex */
public final class a9g0 {
    public final gcd0 a;
    public q94 b;
    public qhk0 c;
    public long d;
    public long e;
    public double f;

    public a9g0() {
        gcd0 gcd0Var = gcd0.d;
        this.c = kpw.a;
        this.a = gcd0Var;
    }

    public static q94 a(q94 q94Var, q94 q94Var2) {
        if (q94Var2.isEmpty()) {
            return q94Var;
        }
        Set<i94<?>> keySet = q94Var2.i().keySet();
        lk3 builder = q94Var.toBuilder();
        Objects.requireNonNull(keySet);
        ArrayList arrayList = builder.a;
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            Object obj = arrayList.get(i);
            if ((obj instanceof i94) && keySet.contains((i94) obj)) {
                arrayList.set(i, null);
                arrayList.set(i + 1, null);
            }
        }
        return builder.e();
    }

    public final void b(q94 q94Var, wmj wmjVar) {
        this.b = q94Var;
        this.d = this.a.r(false);
        ohk0 o = ohk0.o(wmjVar);
        if (((sm5) o.i()).f) {
            this.c = o.i();
        }
    }

    public final synchronized void c() {
        this.b = null;
        this.e = 0L;
        this.f = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.c = kpw.a;
        this.d = 0L;
    }
}
