package xsna;

import com.ironsource.Ad;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bI;

/* compiled from: RecoveryManager.java */
/* loaded from: classes8.dex */
public final class cny0 implements uhy0 {
    public final Clock a;
    public final bI b;
    public final eny0 c;
    public final one.video.calls.sdk_private.ax d;
    public final vmy0[] e;
    public final one.video.calls.sdk_private.x f;
    public final sp g;
    public final ScheduledExecutorService h;
    public final c i;
    public int j;
    public ScheduledFuture<?> k;
    public final Object l;
    public volatile int m;
    public volatile Instant n;
    public volatile one.video.calls.sdk_private.bv o;
    public volatile boolean p;

    /* compiled from: RecoveryManager.java */
    public static class a implements ScheduledFuture<Void> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return false;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final /* bridge */ /* synthetic */ Object get() throws InterruptedException, ExecutionException {
            return null;
        }
    }

    /* compiled from: RecoveryManager.java */
    public static class b {
        public final aG a;
        public final Instant b;

        public b(aG aGVar, Instant instant) {
            this.a = aGVar;
            this.b = instant;
        }

        public final String toString() {
            return this.b.toString() + " (in " + this.a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecoveryManager.java */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        private static final /* synthetic */ c[] d;

        static {
            c cVar = new c("Default", 0);
            a = cVar;
            c cVar2 = new c("SinglePing", 1);
            b = cVar2;
            c cVar3 = new c("DoublePing", 2);
            c = cVar3;
            d = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public cny0(bI bIVar, eny0 eny0Var, one.video.calls.sdk_private.ax axVar, one.video.calls.sdk_private.x xVar, sp spVar) {
        c cVar;
        Clock systemUTC = Clock.systemUTC();
        this.e = new vmy0[aG.values().length];
        this.l = new Object();
        this.o = one.video.calls.sdk_private.bv.a;
        this.p = false;
        this.a = systemUTC;
        this.b = bIVar;
        this.c = eny0Var;
        this.d = axVar;
        for (aG aGVar : aG.values()) {
            vmy0[] vmy0VarArr = this.e;
            int ordinal = aGVar.ordinal();
            o4 o4Var = new o4(xVar, 24);
            spVar.getClass();
            vmy0VarArr[ordinal] = new vmy0(systemUTC, this, eny0Var, axVar, o4Var, new m4s());
        }
        this.f = xVar;
        this.g = spVar;
        this.h = Executors.newScheduledThreadPool(1, new mby0("loss-detection"));
        synchronized (this.l) {
            this.k = new a();
        }
        String property = System.getProperty("tech.kwik.core.probe-type");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("double")) {
                cVar = c.c;
            } else if (lowerCase.equals(Ad.d)) {
                cVar = c.b;
            }
            this.i = cVar;
        }
        cVar = c.a;
        this.i = cVar;
    }

    public static void c(int i, Runnable runnable) {
        for (int i2 = 0; i2 < i; i2++) {
            runnable.run();
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // xsna.uhy0
    public final void a(one.video.calls.sdk_private.bv bvVar) {
        if (this.p) {
            return;
        }
        one.video.calls.sdk_private.bv bvVar2 = this.o;
        this.o = bvVar;
        one.video.calls.sdk_private.bv bvVar3 = one.video.calls.sdk_private.bv.d;
        if (bvVar != bvVar3 || bvVar2 == bvVar3) {
            return;
        }
        Objects.toString(bvVar);
        g();
    }

    public final b b(Function<vmy0, Instant> function) {
        b bVar = null;
        for (aG aGVar : aG.values()) {
            Instant apply = function.apply(this.e[aGVar.ordinal()]);
            if (apply != null) {
                if (bVar == null) {
                    bVar = new b(aGVar, apply);
                } else if (!bVar.b.isBefore(apply)) {
                    bVar = new b(aGVar, apply);
                }
            }
        }
        return bVar;
    }

    public final void d(Instant instant) {
        try {
            synchronized (this.l) {
                this.k.cancel(false);
                this.n = instant;
                this.k = this.h.schedule(new xab(this, 14), Duration.between(this.a.instant(), instant).toMillis(), TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
            if (!this.p) {
                throw e;
            }
        }
    }

    public final void e(aG aGVar, int i) {
        c cVar = c.b;
        c cVar2 = this.i;
        if (cVar2 == cVar) {
            c(i, new b0(5, this, aGVar));
            return;
        }
        if (cVar2 == c.c) {
            c(i, new c0(11, this, aGVar));
            return;
        }
        aG aGVar2 = aG.a;
        if (aGVar == aGVar2) {
            List<ihy0> h = h(aGVar2);
            if (h.isEmpty()) {
                c(i, new ja6(this, 12));
                return;
            } else {
                c(i, new li0(9, this, h));
                return;
            }
        }
        aG aGVar3 = aG.b;
        if (aGVar == aGVar3) {
            List<ihy0> h2 = h(aGVar3);
            if (h2.isEmpty()) {
                c(i, new g0(this, 22));
                return;
            } else {
                c(i, new f0(10, this, h2));
                return;
            }
        }
        aF h3 = aGVar.h();
        List<ihy0> h4 = h(aGVar);
        if (h4.isEmpty()) {
            Objects.toString(h3);
            c(i, new i0(15, this, h3));
        } else {
            Objects.toString(h3);
            c(i, new xj3(this, h4, h3, 7));
        }
    }

    public final void f(boolean z) {
        this.d.getClass();
        this.d.getClass();
        if (!z) {
            this.g.getClass();
            return;
        }
        this.g.getClass();
        this.c.getClass();
        this.c.getClass();
        int i = this.c.e;
    }

    public final void g() {
        b b2 = b(new ymy0());
        Instant instant = b2 != null ? b2.b : null;
        if (instant != null) {
            d(instant);
            return;
        }
        boolean anyMatch = Stream.of((Object[]) this.e).anyMatch(new eqk(1));
        boolean j = j();
        if (!anyMatch && !j) {
            this.k.cancel(true);
            this.n = null;
            return;
        }
        b i = i();
        if (i != null) {
            d(i.b);
        } else {
            this.k.cancel(true);
            this.n = null;
        }
    }

    public final List<ihy0> h(aG aGVar) {
        int i = 1;
        Optional findFirst = ((List) this.e[aGVar.ordinal()].f.values().stream().filter(new z0c0(2)).filter(new ljy0(i)).map(new omy0()).collect(Collectors.toList())).stream().filter(new oqk(i)).filter(new zmy0(0)).findFirst();
        return findFirst.isPresent() ? (List) ((tly0) findFirst.get()).c.stream().filter(new any0()).collect(Collectors.toList()) : Collections.EMPTY_LIST;
    }

    public final b i() {
        aG aGVar;
        eny0 eny0Var = this.c;
        int i = eny0Var.c == -1 ? eny0Var.a : eny0Var.c;
        eny0 eny0Var2 = this.c;
        int max = (Integer.max(1, (eny0Var2.d == -1 ? eny0Var2.a / 4 : eny0Var2.d) * 4) + i) * ((int) Math.pow(2.0d, this.m));
        if (j()) {
            return this.o.ordinal() < one.video.calls.sdk_private.bv.b.ordinal() ? new b(aG.a, this.a.instant().plusMillis(max)) : new b(aG.b, this.a.instant().plusMillis(max));
        }
        Instant instant = Instant.MAX;
        aG aGVar2 = null;
        for (aG aGVar3 : aG.values()) {
            if (this.e[aGVar3.ordinal()].g.get() != 0 && (aGVar3 != (aGVar = aG.c) || this.o.ordinal() >= one.video.calls.sdk_private.bv.d.ordinal())) {
                if (aGVar3 == aGVar) {
                    max += this.j * ((int) Math.pow(2.0d, this.m));
                }
                Instant instant2 = this.e[aGVar3.ordinal()].j;
                if (instant2 != null) {
                    long j = max;
                    if (instant2.plusMillis(j).isBefore(instant)) {
                        instant = instant2.plusMillis(j);
                        aGVar2 = aGVar3;
                    }
                }
            }
        }
        if (aGVar2 != null) {
            return new b(aGVar2, instant);
        }
        return null;
    }

    public final boolean j() {
        return this.b == bI.a && this.o.ordinal() < one.video.calls.sdk_private.bv.d.ordinal() && this.e[aG.b.ordinal()].h < 0;
    }

    public final void k() {
        Instant instant = this.n;
        if (instant == null) {
            return;
        }
        if (!this.a.instant().isBefore(instant) || Duration.between(this.a.instant(), instant).toMillis() <= 0) {
            this.a.instant();
        } else {
            Instant instant2 = this.a.instant();
            Duration.between(this.a.instant(), instant).toMillis();
            Instant instant3 = this.n;
            Objects.toString(instant2);
            Objects.toString(instant3);
            d(this.n);
        }
        b b2 = b(new ymy0());
        if ((b2 != null ? b2.b : null) != null) {
            this.e[b2.a.ordinal()].b();
            f(false);
            this.f.h();
            g();
            return;
        }
        this.m++;
        int i = this.m > 1 ? 2 : 1;
        if (Stream.of((Object[]) this.e).anyMatch(new eqk(1))) {
            b i2 = i();
            if (i2 == null) {
                return;
            }
            e(i2.a, i);
            return;
        }
        if (j()) {
            if (this.o.ordinal() < one.video.calls.sdk_private.bv.b.ordinal()) {
                e(aG.a, 1);
            } else {
                e(aG.b, 1);
            }
        }
    }
}
