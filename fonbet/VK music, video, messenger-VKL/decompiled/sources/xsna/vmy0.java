package xsna;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* compiled from: LossDetector.java */
/* loaded from: classes8.dex */
public final class vmy0 {
    public final Clock a;
    public final cny0 b;
    public final eny0 c;
    public final one.video.calls.sdk_private.ax d;
    public final o4 e;
    public volatile Instant i;
    public volatile Instant j;
    public volatile boolean k;
    public volatile long h = -1;
    public final AtomicInteger g = new AtomicInteger();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public vmy0(Clock clock, cny0 cny0Var, eny0 eny0Var, one.video.calls.sdk_private.ax axVar, o4 o4Var, m4s m4sVar) {
        this.a = clock;
        this.b = cny0Var;
        this.c = eny0Var;
        this.d = axVar;
        this.e = o4Var;
    }

    public final synchronized void a() {
        this.d.b((List) this.f.values().stream().filter(new qmy0()).filter(new jnz(2)).collect(Collectors.toList()));
        this.g.set(0);
        this.f.clear();
        this.i = null;
        this.j = null;
        this.k = true;
    }

    public final void b() {
        if (this.k) {
            return;
        }
        long max = (int) (Integer.max(this.c.c == -1 ? r0.a : r0.c, this.c.e) * 1.125f);
        final Instant minusMillis = Instant.now(this.a).minusMillis(max);
        List list = (List) this.f.values().stream().filter(new v030(2)).filter(new Predicate() { // from class: xsna.kmy0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                vmy0 vmy0Var = vmy0.this;
                Instant instant = minusMillis;
                xmy0 xmy0Var = (xmy0) obj;
                vmy0Var.getClass();
                if (xmy0Var.b.p().longValue() <= vmy0Var.h - 3) {
                    return true;
                }
                return xmy0Var.b.p().longValue() <= vmy0Var.h && xmy0Var.a.isBefore(instant);
            }
        }).filter(new bby0(1)).collect(Collectors.toList());
        if (!list.isEmpty()) {
            List list2 = (List) list.stream().filter(new jgy0(1)).collect(Collectors.toList());
            int i = 1;
            this.g.getAndAdd(((int) list2.stream().filter(new g0y0(i)).count()) * (-1));
            list2.stream().forEach(new nmy0());
            this.e.run();
            one.video.calls.sdk_private.ax axVar = this.d;
            List list3 = (List) list2.stream().filter(new mjy0(i)).collect(Collectors.toList());
            synchronized (axVar) {
                long sum = list3.stream().map(new wdy0()).mapToInt(new xdy0()).sum();
                axVar.a -= sum;
                axVar.c.h();
                if (sum > 0) {
                    axVar.c();
                    list3.size();
                }
            }
            if (!list3.isEmpty() && ((jly0) list3.stream().max(new dey0(0)).get()).a.isAfter(axVar.e)) {
                axVar.e = Instant.now();
                axVar.b /= 2;
                long j = 2400;
                if (axVar.b < j) {
                    axVar.b = j;
                }
                axVar.d = axVar.b;
            }
            list2.stream().forEach(new hey0(this, 1));
        }
        int i2 = 2;
        Optional min = this.f.values().stream().filter(new lmy0()).filter(new xqp(this, i2)).filter(new ylu(i2)).map(new dby0(i2)).min(new mmy0(0));
        this.i = (min.isPresent() && ((Instant) min.get()).isAfter(minusMillis)) ? ((Instant) min.get()).plusMillis(max) : null;
    }
}
