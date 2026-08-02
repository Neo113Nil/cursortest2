package one.video.calls.sdk_private;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import one.video.calls.sdk_private.al;
import one.video.calls.sdk_private.bx;
import one.video.calls.sdk_private.f;
import org.webrtc.PeerConnectionFactory;
import xsna.cny0;
import xsna.hjy0;
import xsna.hly0;
import xsna.igy0;
import xsna.ihy0;
import xsna.jby0;
import xsna.jey0;
import xsna.jgy0;
import xsna.kgy0;
import xsna.kq01;
import xsna.lgy0;
import xsna.mby0;
import xsna.mgy0;
import xsna.mky0;
import xsna.ogy0;
import xsna.q44;
import xsna.ryc;
import xsna.sb;
import xsna.sby0;
import xsna.sp;
import xsna.tly0;
import xsna.uq80;
import xsna.vdy0;
import xsna.vjy0;
import xsna.wby0;
import xsna.zby0;
import xsna.zjy0;
import xsna.zky0;

/* compiled from: QuicConnectionImpl.java */
/* loaded from: classes8.dex */
public abstract class bF implements hly0 {
    public final lgy0 a;
    public final bI b;
    public final sp c;
    public final sby0 e;
    public volatile aF i;
    public bx j;
    public cny0 m;
    public volatile vjy0 o;
    public volatile f p;
    public final zky0 q;
    public volatile zby0 r;
    public final ScheduledExecutorService s;
    public final ExecutorService t;
    public g d = g.a;
    public volatile bv f = bv.a;
    public final Object g = new Object();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public volatile int n = 3;
    public volatile c u = c.a;

    /* compiled from: QuicConnectionImpl.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aF.values().length];
            a = iArr;
            try {
                iArr[aF.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aF.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aF.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: QuicConnectionImpl.java */
    public class b extends mgy0 {
        public final /* synthetic */ bE b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bE bEVar, ogy0 ogy0Var) {
            super(ogy0Var);
            this.b = bEVar;
        }

        @Override // xsna.hly0
        public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
            byte[] v = tly0Var.v();
            if (this.b.G.d.b().stream().anyMatch(new jby0(v, 1))) {
                b(tly0Var, cVar);
            } else {
                kq01.b(v);
                Objects.toString(tly0Var);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicConnectionImpl.java */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        private static final /* synthetic */ c[] e;

        static {
            c cVar = new c("Disabled", 0);
            a = cVar;
            c cVar2 = new c("Enable", 1);
            b = cVar2;
            c cVar3 = new c(PeerConnectionFactory.TRIAL_ENABLED, 2);
            c = cVar3;
            c cVar4 = new c("EnabledReceiveOnly", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicConnectionImpl.java */
    public static final class d {
        public static final d a;
        public static final d b;
        private static final /* synthetic */ d[] c;

        static {
            d dVar = new d("QUIC_LAYER_ERROR", 0);
            a = dVar;
            d dVar2 = new d("APPLICATION_ERROR", 1);
            b = dVar2;
            c = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    /* compiled from: QuicConnectionImpl.java */
    public class e extends mgy0 {
        public final /* synthetic */ bE b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(bE bEVar, bE bEVar2, sp spVar) {
            super(bEVar2, spVar);
            this.b = bEVar;
        }

        @Override // xsna.hly0
        public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
            if (!this.b.p.h()) {
                b(tly0Var, cVar);
                return;
            }
            if (this.b.p != f.d) {
                Objects.toString(tly0Var);
                return;
            }
            bE bEVar = this.b;
            if (tly0Var.c.stream().filter(new jgy0(0)).findAny().isPresent()) {
                bEVar.p = f.e;
                return;
            }
            zky0 zky0Var = bEVar.q;
            int i = zky0Var.b + 1;
            zky0Var.b = i;
            if (i == zky0Var.a) {
                bEVar.r().f(bEVar.r, tly0Var.n(), hjy0.a);
                zky0Var.a <<= 1;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicConnectionImpl.java */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;
        public static final f g;
        public static final f h;
        private static final /* synthetic */ f[] i;

        static {
            f fVar = new f("Created", 0);
            a = fVar;
            f fVar2 = new f("Handshaking", 1);
            b = fVar2;
            f fVar3 = new f("Connected", 2);
            c = fVar3;
            f fVar4 = new f("Closing", 3);
            d = fVar4;
            f fVar5 = new f("Draining", 4);
            e = fVar5;
            f fVar6 = new f("Closed", 5);
            f = fVar6;
            f fVar7 = new f("Failed", 6);
            g = fVar7;
            f fVar8 = new f("Error", 7);
            h = fVar8;
            i = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) i.clone();
        }

        public final boolean h() {
            return this == d || this == e || this == f || this == g || this == h;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicConnectionImpl.java */
    public static final class g {
        public static final g a;
        public static final g b;
        public static final g c;
        private static final /* synthetic */ g[] d;

        static {
            g gVar = new g("NotStarted", 0);
            a = gVar;
            g gVar2 = new g("VersionChangeUnconfirmed", 1);
            b = gVar2;
            g gVar3 = new g("VersionNegotiated", 2);
            c = gVar3;
            d = new g[]{gVar, gVar2, gVar3};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) d.clone();
        }
    }

    /* compiled from: QuicConnectionImpl.java */
    public class h extends mgy0 {
        public final /* synthetic */ bE b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(bE bEVar, e eVar) {
            super(eVar);
            this.b = bEVar;
        }

        @Override // xsna.hly0
        public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
            b(tly0Var, cVar);
            this.b.B.h();
        }
    }

    public bF(kgy0 kgy0Var, bI bIVar, sp spVar) {
        lgy0 lgy0Var = new lgy0(kgy0Var);
        this.a = lgy0Var;
        this.b = bIVar;
        this.c = spVar;
        p();
        this.e = new sby0(lgy0Var, bIVar, spVar);
        this.p = f.a;
        zky0 zky0Var = new zky0();
        zky0Var.a = 1;
        zky0Var.b = 0;
        this.q = zky0Var;
        this.s = Executors.newScheduledThreadPool(1, new mby0("scheduler"));
        this.t = Executors.newSingleThreadExecutor(new mby0("callback-executor"));
        this.i = aF.a;
    }

    @Override // xsna.hly0
    public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        if (tly0Var.d(this, cVar) == bC$a.b) {
            return;
        }
        vdy0 s = s();
        if (tly0Var.r()) {
            s.a[tly0Var.o().ordinal()].c(tly0Var);
        }
        bx bxVar = this.j;
        if (bxVar.h) {
            bxVar.g = bxVar.a.instant();
            bxVar.i = bx.a.a;
        }
    }

    public final wby0 b(aF aFVar) {
        ArrayList arrayList;
        aF aFVar2;
        while (true) {
            arrayList = this.l;
            if (arrayList.size() > aFVar.ordinal()) {
                break;
            }
            arrayList.add(null);
        }
        if (arrayList.get(aFVar.ordinal()) == null) {
            aFVar2 = aFVar;
            arrayList.set(aFVar.ordinal(), new wby0(this.a, aFVar2, this.b, v(), this.c, r()));
        } else {
            aFVar2 = aFVar;
        }
        return (wby0) arrayList.get(aFVar2.ordinal());
    }

    public final zjy0 c(boolean z) throws IOException {
        if (this.p != f.c) {
            throw new IOException("not connected");
        }
        mky0 t = t();
        t.getClass();
        try {
            return t.b(z, 10000L, TimeUnit.DAYS, new uq80(t, 15));
        } catch (TimeoutException unused) {
            throw new RuntimeException();
        }
    }

    public final void d(long j, long j2) {
        long min = Long.min(j, j2);
        if (min == 0) {
            min = Long.max(j, j2);
        }
        if (min != 0) {
            bx bxVar = this.j;
            bxVar.d = min;
            if (bxVar.h) {
                bxVar.j.cancel(true);
            } else {
                bxVar.h = true;
            }
            ScheduledExecutorService scheduledExecutorService = bxVar.b;
            sb sbVar = new sb(bxVar, 15);
            long j3 = bxVar.c;
            bxVar.j = scheduledExecutorService.scheduleAtFixedRate(sbVar, j3, j3, TimeUnit.MILLISECONDS);
        }
    }

    public void e(long j, d dVar, String str) {
        f fVar = this.p;
        f fVar2 = f.d;
        if (fVar == fVar2 || this.p == f.e) {
            return;
        }
        h(new al(al.a.b, false, dVar == d.a ? Long.valueOf(j) : null, dVar == d.b ? Long.valueOf(j) : null));
        r().g();
        n(j, dVar, str);
        this.p = fVar2;
        t().f();
        if (this.i != aF.a) {
            try {
                this.s.schedule(new ryc(this, 15), r().i() * 3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            this.k.add(new q44(this, 16));
        }
        this.c.getClass();
        Instant.now();
    }

    public abstract void f(Exception exc);

    public final void g(Function<Integer, ihy0> function, int i, aF aFVar, Consumer<ihy0> consumer, boolean z) {
        r().b(function, i, aFVar, consumer);
        if (z) {
            r().h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(al alVar) {
        StringBuilder sb;
        Long l = alVar.c;
        Long l2 = alVar.b;
        if (l2 == null && l == null) {
            Objects.toString(alVar.a);
        } else if (l2 != null) {
            l = null;
            int i = 0;
            if (l2.longValue() < 256 || l2.longValue() > 511) {
                ap$a[] values = ap$a.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ap$a ap_a = values[i];
                    if (ap_a.n == l2.longValue()) {
                        l = ap_a;
                        break;
                    }
                    i++;
                }
                sb = new StringBuilder("Transport error: ");
                sb.append(l);
            } else {
                int longValue = (int) (l2.longValue() - 256);
                f.a[] values2 = f.a.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    f.a aVar = values2[i];
                    if (aVar.k == longValue) {
                        l = aVar;
                        break;
                    }
                    i++;
                }
                StringBuilder sb2 = new StringBuilder("Transport error: CRYPTO_ERROR (");
                sb2.append(l);
                sb2.append(")");
            }
        } else if (l != null) {
            sb = new StringBuilder("Application error: ");
            sb.append(l);
        }
        toString();
    }

    public abstract void i(zby0 zby0Var);

    public final void j(ihy0 ihy0Var, Consumer<ihy0> consumer, boolean z) {
        r().f(ihy0Var, aF.d, consumer);
        if (z) {
            r().h();
        }
    }

    public final void k(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        Iterator it = tly0Var.c.iterator();
        while (it.hasNext()) {
            ((ihy0) it.next()).c(this, tly0Var, cVar);
        }
    }

    public final void l() {
        igy0 igy0Var = new igy0();
        ArrayList arrayList = this.k;
        arrayList.forEach(igy0Var);
        arrayList.clear();
    }

    public final void m(long j, String str) {
        e(j, d.a, str);
    }

    public final void n(long j, d dVar, String str) {
        x r;
        aF aFVar;
        if (dVar == d.b && this.i != aF.d) {
            n(ap$a.APPLICATION_ERROR.n, d.a, "");
            return;
        }
        kgy0 kgy0Var = this.a.a;
        int i = 0;
        boolean z = dVar == d.a;
        zby0 zby0Var = new zby0();
        zby0Var.d = new byte[0];
        zby0Var.e = -1;
        zby0Var.f = z ? 28 : 29;
        zby0Var.b = j;
        if (j >= 256 && j < 512) {
            zby0Var.e = (int) (j - 256);
        }
        if (str != null) {
            int length = str.length();
            while (true) {
                if (i >= length) {
                    break;
                }
                int codePointAt = str.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    zby0Var.d = str.getBytes(StandardCharsets.UTF_8);
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        int i2 = a.a[this.i.ordinal()];
        if (i2 == 1) {
            r = r();
            aFVar = aF.a;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    r = r();
                    aFVar = aF.d;
                }
                this.r = zby0Var;
            }
            r().e(zby0Var, aF.a);
            r = r();
            aFVar = aF.c;
        }
        r.e(zby0Var, aFVar);
        this.r = zby0Var;
    }

    public final void o(u uVar) {
        bE bEVar = (bE) this;
        mky0 mky0Var = bEVar.E;
        long j = uVar.g;
        if (mky0Var.k == null || j >= mky0Var.k.longValue()) {
            mky0Var.k = Long.valueOf(j);
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            mky0Var.m.release((int) j);
        }
        mky0 mky0Var2 = bEVar.E;
        long j2 = uVar.h;
        if (mky0Var2.l == null || j2 >= mky0Var2.l.longValue()) {
            mky0Var2.l = Long.valueOf(j2);
            if (j2 > 2147483647L) {
                j2 = 2147483647L;
            }
            mky0Var2.n.release((int) j2);
        }
        this.n = uVar.i;
        x xVar = bEVar.B;
        int i = uVar.l;
        xVar.u = i;
        xVar.h.f = i;
        cny0 cny0Var = xVar.l;
        synchronized (cny0Var) {
            cny0Var.j = i;
        }
        x xVar2 = bEVar.B;
        int i2 = uVar.p;
        if (i2 < xVar2.c) {
            xVar2.c = i2;
        }
        if (uVar.s <= 0) {
            if (this.u == c.b) {
                this.u = c.d;
            }
        } else if (this.u == c.b) {
            this.u = c.c;
            Long.min(65535L, uVar.s);
        }
    }

    public abstract b p();

    public void q() {
        bx bxVar = this.j;
        if (bxVar.h) {
            bxVar.b.shutdown();
        }
        x r = r();
        r.getClass();
        r.t = true;
        r.n.interrupt();
        this.p = f.f;
        this.s.shutdown();
    }

    public abstract x r();

    public abstract vdy0 s();

    public abstract mky0 t();

    public abstract jey0 u();

    public abstract one.video.calls.sdk_private.a v();
}
