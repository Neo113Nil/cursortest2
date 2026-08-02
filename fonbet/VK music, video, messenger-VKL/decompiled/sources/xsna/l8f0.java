package xsna;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import xsna.f8f0;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes11.dex */
public final class l8f0 {
    public final long a;
    public final x6o0 b;
    public final k8f0 c = new k8f0(this, i5s.a(new StringBuilder(), x2r0.h, " ConnectionPool"));
    public final ConcurrentLinkedQueue<g8f0> d = new ConcurrentLinkedQueue<>();

    public l8f0(TaskRunner taskRunner, long j) {
        this.a = TimeUnit.MINUTES.toNanos(j);
        this.b = taskRunner.e();
        if (j <= 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "keepAliveDuration <= 0: ").toString());
        }
    }

    public final boolean a(okhttp3.a aVar, f8f0 f8f0Var, ArrayList arrayList, boolean z) {
        Iterator<g8f0> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            g8f0 next = it.next();
            synchronized (next) {
                if (z) {
                    try {
                        if (next.g != null) {
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.k(aVar, arrayList)) {
                    f8f0Var.b(next);
                    return true;
                }
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    public final int b(g8f0 g8f0Var, long j) {
        byte[] bArr = x2r0.a;
        ArrayList arrayList = g8f0Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + g8f0Var.b.a.h + " was leaked. Did you forget to close a response body?";
                fta0 fta0Var = fta0.a;
                fta0.a.k(((f8f0.b) reference).a(), str);
                arrayList.remove(i);
                g8f0Var.j = true;
                if (arrayList.isEmpty()) {
                    g8f0Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
