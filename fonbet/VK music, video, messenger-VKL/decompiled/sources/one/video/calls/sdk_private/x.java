package one.video.calls.sdk_private;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.aP;
import one.video.calls.sdk_private.bx;
import xsna.bey0;
import xsna.cny0;
import xsna.dby0;
import xsna.eny0;
import xsna.gjy0;
import xsna.gny0;
import xsna.go9;
import xsna.hby0;
import xsna.hjy0;
import xsna.iby0;
import xsna.ihy0;
import xsna.ijy0;
import xsna.iny0;
import xsna.jk9;
import xsna.jny0;
import xsna.lgy0;
import xsna.ljy0;
import xsna.mny0;
import xsna.ocy0;
import xsna.ony0;
import xsna.rny0;
import xsna.sby0;
import xsna.sny0;
import xsna.sp;
import xsna.tdy0;
import xsna.tly0;
import xsna.uny0;
import xsna.vdy0;
import xsna.xay0;
import xsna.xqk;
import xsna.yay0;
import xsna.yqk;
import xsna.zby0;

/* compiled from: SenderImpl.java */
/* loaded from: classes8.dex */
public final class x implements hjy0 {
    public final Clock b;
    public volatile int c;
    public volatile DatagramSocket d;
    public final InetSocketAddress e;
    public final bE f;
    public final ax g;
    public final eny0 h;
    public final gjy0[] i;
    public final mny0 j;
    public final vdy0 k;
    public final cny0 l;
    public final bx m;
    public final Thread n;
    public final boolean[] o;
    public sby0 p;
    public final Object q;
    public boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile int u;
    public volatile long v;
    public final AtomicInteger w;
    public volatile boolean x;
    public volatile int y;

    public x(final lgy0 lgy0Var, int i, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, bE bEVar, sp spVar) {
        final Clock systemUTC = Clock.systemUTC();
        gjy0[] gjy0VarArr = new gjy0[aF.values().length];
        this.i = gjy0VarArr;
        this.o = new boolean[aG.values().length];
        this.q = new Object();
        this.w = new AtomicInteger();
        this.x = false;
        this.y = -1;
        this.b = systemUTC;
        this.c = i;
        this.d = datagramSocket;
        this.e = inetSocketAddress;
        this.f = bEVar;
        Arrays.stream(aF.values()).forEach(new Consumer() { // from class: xsna.jjy0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aF aFVar = (aF) obj;
                one.video.calls.sdk_private.x.this.i[aFVar.ordinal()] = new gjy0(systemUTC, aFVar);
            }
        });
        final vdy0 vdy0Var = new vdy0();
        vdy0Var.a = new tdy0[aG.values().length];
        Arrays.stream(aG.values()).forEach(new Consumer() { // from class: xsna.udy0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aG aGVar = (aG) obj;
                vdy0.this.a[aGVar.ordinal()] = new tdy0(aGVar, this);
            }
        });
        this.k = vdy0Var;
        final mny0 mny0Var = new mny0();
        mny0Var.b = new rny0[aF.values().length];
        mny0Var.a = gjy0VarArr;
        final sny0 sny0Var = new sny0();
        Arrays.stream(aF.values()).forEach(new Consumer() { // from class: xsna.hny0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                tdy0 ony0Var;
                mny0 mny0Var2 = mny0.this;
                vdy0 vdy0Var2 = vdy0Var;
                lgy0 lgy0Var2 = lgy0Var;
                sny0 sny0Var2 = sny0Var;
                aF aFVar = (aF) obj;
                int ordinal = aFVar.ordinal();
                if (aFVar != aF.b) {
                    ony0Var = vdy0Var2.a[aFVar.h().ordinal()];
                } else {
                    ony0Var = new ony0(null, null);
                }
                tdy0 tdy0Var = ony0Var;
                int i2 = mny0.a.a[aFVar.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    mny0Var2.b[ordinal] = new rny0(lgy0Var2, aFVar, mny0Var2.a[ordinal], tdy0Var, sny0Var2);
                } else {
                    if (i2 != 3) {
                        mny0Var2.b[ordinal] = new rny0(lgy0Var2, aFVar, mny0Var2.a[ordinal], tdy0Var);
                        return;
                    }
                    mny0Var2.b[ordinal] = new nny0(lgy0Var2, aF.a, mny0Var2.a[ordinal], tdy0Var);
                }
            }
        });
        mny0Var.c = new aF[]{aF.a, aF.b, aF.c};
        this.j = mny0Var;
        ax axVar = new ax(spVar, this);
        axVar.d = Long.MAX_VALUE;
        axVar.e = Instant.MIN;
        this.g = axVar;
        eny0 eny0Var = new eny0();
        eny0Var.b = Integer.MAX_VALUE;
        eny0Var.c = -1;
        eny0Var.d = -1;
        eny0Var.a = 500;
        eny0Var.f = 25;
        this.h = eny0Var;
        cny0 cny0Var = new cny0(bEVar.b, eny0Var, axVar, this, spVar);
        this.l = cny0Var;
        bEVar.h.add(cny0Var);
        bEVar.m = cny0Var;
        this.m = bEVar.j;
        Thread thread = new Thread(new jk9(this, 17), go9.b("sender", ""));
        this.n = thread;
        thread.setDaemon(true);
    }

    public final void a(List<ihy0> list, aF aFVar) {
        synchronized (this.o) {
            try {
                if (this.o[aFVar.h().ordinal()]) {
                    Objects.toString(aFVar.h());
                } else {
                    this.i[aFVar.ordinal()].d.addLast(list);
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Function<Integer, ihy0> function, int i, aF aFVar, Consumer<ihy0> consumer) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.i[aFVar.ordinal()].c;
        gny0 gny0Var = new gny0();
        gny0Var.a = i;
        gny0Var.b = function;
        gny0Var.c = consumer;
        concurrentLinkedDeque.addLast(gny0Var);
    }

    public final void c(aG aGVar) {
        synchronized (this.o) {
            try {
                if (!this.o[aGVar.ordinal()]) {
                    mny0 mny0Var = this.j;
                    rny0 rny0Var = mny0Var.b[aGVar.h().ordinal()];
                    rny0Var.g = new iny0(mny0Var, aGVar);
                    rny0Var.c.d(false);
                    rny0Var.f = true;
                    cny0 cny0Var = this.l;
                    if (!cny0Var.p) {
                        cny0Var.e[aGVar.ordinal()].a();
                        cny0Var.m = 0;
                        cny0Var.g();
                    }
                    aGVar.toString();
                    this.k.a[aGVar.ordinal()] = new ony0(null, null);
                    this.o[aGVar.ordinal()] = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(aG aGVar, int i) {
        gjy0 gjy0Var = this.i[aGVar.h().ordinal()];
        Instant plusMillis = gjy0Var.a.instant().plusMillis(i);
        synchronized (gjy0Var.e) {
            try {
                Instant instant = gjy0Var.f;
                if (instant != null) {
                    if (plusMillis.isBefore(instant)) {
                    }
                }
                gjy0Var.f = plusMillis;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(zby0 zby0Var, aF aFVar) {
        this.i[aFVar.ordinal()].c(zby0Var, new iby0(1));
    }

    public final void f(ihy0 ihy0Var, aF aFVar, Consumer<ihy0> consumer) {
        this.i[aFVar.ordinal()].c(ihy0Var, consumer);
    }

    public final void g() {
        Arrays.stream(this.i).forEach(new ijy0());
        cny0 cny0Var = this.l;
        if (cny0Var.p) {
            return;
        }
        cny0Var.p = true;
        cny0Var.k.cancel(true);
        cny0Var.n = null;
        cny0Var.h.shutdown();
        for (aG aGVar : aG.values()) {
            cny0Var.e[aGVar.ordinal()].a();
        }
    }

    public final void h() {
        synchronized (this.q) {
            this.r = true;
            this.q.notify();
        }
    }

    public final int i() {
        eny0 eny0Var = this.h;
        int i = eny0Var.c == -1 ? eny0Var.a : eny0Var.c;
        eny0 eny0Var2 = this.h;
        return ((eny0Var2.d == -1 ? eny0Var2.a / 4 : eny0Var2.d) * 4) + i + this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0288 A[LOOP:0: B:28:0x006a->B:69:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() throws IOException {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        long j;
        synchronized (this.q) {
            i = 0;
            try {
                try {
                    if (!this.r) {
                        Optional<Instant> a = this.j.a();
                        if (a.isPresent()) {
                            j = Long.max(Duration.between(this.b.instant(), a.get()).toMillis(), 0L);
                            if (j > 0) {
                                this.w.set(0);
                                this.x = false;
                            } else if (!this.x || this.w.incrementAndGet() <= 10003) {
                                this.x = true;
                                j = 0;
                            } else {
                                j = 8000;
                            }
                        } else {
                            j = 5000;
                        }
                        if (j > 0) {
                            this.q.wait(j);
                        }
                    }
                    this.r = false;
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.t) {
            this.s = false;
        }
        while (true) {
            ax axVar = this.g;
            int i4 = (int) (axVar.b - axVar.a);
            int i5 = this.c;
            if (this.y >= 0) {
                if (this.v < this.y) {
                    if (this.y - this.v < i5) {
                        String.format("Sending data may be limited by remaining anti-amplification limit of %d bytes", Long.valueOf(this.y - this.v));
                    }
                    i5 = Integer.min(i5, (int) (this.y - this.v));
                } else {
                    arrayList = Collections.EMPTY_LIST;
                    i2 = i;
                    if (!arrayList.isEmpty()) {
                        byte[] bArr = new byte[this.c];
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                tly0 tly0Var = ((uny0) it.next()).a;
                                try {
                                    wrap.put(tly0Var.j(this.p.e(tly0Var.n())));
                                    tly0Var.p();
                                } catch (aP e) {
                                    if (e.a != aP.a.b) {
                                        throw new IllegalStateException(e.getMessage());
                                    }
                                    Objects.toString(tly0Var);
                                    it.remove();
                                }
                            }
                            if (wrap.position() != 0) {
                                DatagramPacket datagramPacket = new DatagramPacket(bArr, wrap.position(), this.e.getAddress(), this.e.getPort());
                                final Instant instant = this.b.instant();
                                this.d.send(datagramPacket);
                                arrayList.size();
                                this.v += wrap.position();
                                arrayList.stream().forEach(new Consumer() { // from class: xsna.kjy0
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        one.video.calls.sdk_private.x xVar = one.video.calls.sdk_private.x.this;
                                        Instant instant2 = instant;
                                        uny0 uny0Var = (uny0) obj;
                                        cny0 cny0Var = xVar.l;
                                        tly0 tly0Var2 = uny0Var.a;
                                        Consumer<tly0> consumer = uny0Var.b;
                                        if (!cny0Var.p && tly0Var2.u()) {
                                            vmy0 vmy0Var = cny0Var.e[tly0Var2.o().ordinal()];
                                            synchronized (vmy0Var) {
                                                try {
                                                    if (!vmy0Var.k) {
                                                        if (tly0Var2.u()) {
                                                            one.video.calls.sdk_private.ax axVar2 = vmy0Var.d;
                                                            synchronized (axVar2) {
                                                                try {
                                                                    synchronized (axVar2) {
                                                                        if (!tly0Var2.t()) {
                                                                            axVar2.a += tly0Var2.q();
                                                                        }
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        }
                                                        if (tly0Var2.s()) {
                                                            vmy0Var.g.getAndAdd(1);
                                                            vmy0Var.j = instant2;
                                                        }
                                                        vmy0Var.f.put(tly0Var2.p(), new xmy0(instant2, tly0Var2, consumer));
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            cny0Var.f(false);
                                            cny0Var.g();
                                        }
                                        one.video.calls.sdk_private.bx bxVar = xVar.m;
                                        tly0 tly0Var3 = uny0Var.a;
                                        if (bxVar.h && tly0Var3.s() && bxVar.i == bx.a.a) {
                                            bxVar.g = instant2;
                                            bxVar.i = bx.a.b;
                                        }
                                    }
                                });
                                ((List) arrayList.stream().map(new dby0(1)).collect(Collectors.toList())).stream().filter(new ljy0(0)).mapToInt(new bey0(1)).sum();
                            }
                        } catch (BufferOverflowException e2) {
                            Objects.toString(arrayList);
                            throw e2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }
            byte[] bArr2 = (byte[]) this.f.G.d.a.entrySet().stream().filter(new xay0(0)).map(new yay0()).findFirst().orElse(null);
            hby0 hby0Var = this.f.G.e;
            byte[] bArr3 = hby0Var != null ? hby0Var.b : new byte[i];
            mny0 mny0Var = this.j;
            mny0Var.getClass();
            arrayList = new ArrayList();
            int length = bArr3.length + 19;
            int min = Integer.min(i4, i5);
            aF[] aFVarArr = mny0Var.c;
            int length2 = aFVarArr.length;
            int i6 = i;
            int i7 = i6;
            int i8 = i7;
            int i9 = i8;
            while (true) {
                if (i6 >= length2) {
                    i2 = i;
                    break;
                }
                aF aFVar = aFVarArr[i6];
                rny0 rny0Var = mny0Var.b[aFVar.ordinal()];
                if (rny0Var != null) {
                    i3 = i5;
                    Optional<uny0> a2 = rny0Var.a(min, i3 - i7, bArr2, bArr3);
                    if (a2.isPresent()) {
                        arrayList.add(a2.get());
                        tly0 tly0Var2 = a2.get().a;
                        i2 = 0;
                        int b = tly0Var2.b(0);
                        i7 += b;
                        min -= b;
                        if (aFVar == aF.a) {
                            i8 = 1;
                        }
                        if (a2.get().a.c.stream().anyMatch(new jny0())) {
                            i9 = 1;
                        }
                    } else {
                        i2 = 0;
                    }
                    if (min < length && i3 - i7 < length) {
                        break;
                    }
                } else {
                    i3 = i5;
                    i2 = 0;
                }
                i6++;
                i = i2;
                i5 = i3;
            }
            if (i8 != 0 && i7 < 1200) {
                final int i10 = 1200 - i7;
                int i11 = 1;
                arrayList.stream().map(new xqk(i11)).filter(new yqk(i11)).findFirst().ifPresent(new Consumer() { // from class: xsna.kny0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((tly0) obj).i(new wgy0(i10));
                    }
                });
                i7 += i10;
            }
            if (i9 != 0 && i7 < 1200) {
                final int i12 = 1200 - i7;
                arrayList.stream().map(new ocy0(1)).findFirst().ifPresent(new Consumer() { // from class: xsna.lny0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((tly0) obj).i(new wgy0(i12));
                    }
                });
            }
            if (!arrayList.isEmpty()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
    }
}
