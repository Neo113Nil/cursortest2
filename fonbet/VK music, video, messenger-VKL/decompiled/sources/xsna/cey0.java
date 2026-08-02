package xsna;

import java.util.List;

/* compiled from: AbstractCongestionController.java */
/* loaded from: classes8.dex */
public class cey0 {
    public volatile long a;
    public volatile long b = 12000;
    public final one.video.calls.sdk_private.x c;

    public cey0(sp spVar, one.video.calls.sdk_private.x xVar) {
        this.c = xVar;
    }

    public synchronized void a(List<? extends jly0> list) {
        int sum = list.stream().map(new aey0()).mapToInt(new bey0(0)).sum();
        if (sum > 0) {
            this.a -= sum;
            this.c.h();
            c();
            list.size();
        }
    }

    public final synchronized void b(List<? extends jly0> list) {
        long sum = list.stream().map(new ydy0()).mapToInt(new zdy0()).sum();
        this.a -= sum;
        this.c.h();
        if (sum > 0) {
            c();
            list.size();
        }
    }

    public final void c() {
        if (this.a < 0) {
            this.a = 0L;
            this.c.h();
        }
    }
}
