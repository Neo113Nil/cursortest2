package xsna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ClipsFeedRecomEventsAggregator.kt */
/* loaded from: classes17.dex */
public final class p8e {
    public final long a;
    public final int b;
    public volatile LinkedList<o8e> c;

    public p8e() {
        this(20000L, 20);
    }

    public final void a(o8e o8eVar) {
        synchronized (this) {
            o8eVar.toString();
            this.c.addFirst(o8eVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final List<o8e> b() {
        List<o8e> H0;
        synchronized (this) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                LinkedList<o8e> linkedList = this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedList) {
                    if (((o8e) obj).d < currentTimeMillis - this.a) {
                        break;
                    }
                    arrayList.add(obj);
                }
                H0 = j5g.H0(arrayList, this.b);
                this.c = new LinkedList<>(H0);
                j5g.g0(H0, "\n", null, null, 0, null, 62);
            } catch (Throwable th) {
                throw th;
            }
        }
        return H0;
    }

    public p8e(long j, int i) {
        this.a = j;
        this.b = i;
        this.c = new LinkedList<>();
    }
}
