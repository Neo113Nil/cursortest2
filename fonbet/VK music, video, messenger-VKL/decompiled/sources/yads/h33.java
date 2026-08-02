package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes10.dex */
public final class h33 implements bl {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public zk e;
    public zk f;
    public zk g;
    public zk h;
    public boolean i;
    public g33 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public h33() {
        zk zkVar = zk.e;
        this.e = zkVar;
        this.f = zkVar;
        this.g = zkVar;
        this.h = zkVar;
        ByteBuffer byteBuffer = bl.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) {
        if (zkVar.c != 2) {
            throw new al(zkVar);
        }
        int i = this.b;
        if (i == -1) {
            i = zkVar.a;
        }
        this.e = zkVar;
        zk zkVar2 = new zk(i, zkVar.b, 2);
        this.f = zkVar2;
        this.i = true;
        return zkVar2;
    }

    @Override // yads.bl
    public final void b() {
        int i;
        g33 g33Var = this.j;
        if (g33Var != null) {
            int i2 = g33Var.k;
            float f = g33Var.c;
            float f2 = g33Var.d;
            int i3 = g33Var.m + ((int) ((((i2 / (f / f2)) + g33Var.o) / (g33Var.e * f2)) + 0.5f));
            g33Var.j = g33Var.b(g33Var.j, i2, (g33Var.h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = g33Var.h * 2;
                int i5 = g33Var.b;
                if (i4 >= i * i5) {
                    break;
                }
                g33Var.j[(i5 * i2) + i4] = 0;
                i4++;
            }
            g33Var.k = i + g33Var.k;
            g33Var.a();
            if (g33Var.m > i3) {
                g33Var.m = i3;
            }
            g33Var.k = 0;
            g33Var.r = 0;
            g33Var.o = 0;
        }
        this.p = true;
    }

    @Override // yads.bl
    public final void flush() {
        if (isActive()) {
            zk zkVar = this.e;
            this.g = zkVar;
            zk zkVar2 = this.f;
            this.h = zkVar2;
            if (this.i) {
                this.j = new g33(zkVar.a, zkVar.b, this.c, this.d, zkVar2.a);
            } else {
                g33 g33Var = this.j;
                if (g33Var != null) {
                    g33Var.k = 0;
                    g33Var.m = 0;
                    g33Var.o = 0;
                    g33Var.p = 0;
                    g33Var.q = 0;
                    g33Var.r = 0;
                    g33Var.s = 0;
                    g33Var.t = 0;
                    g33Var.u = 0;
                    g33Var.v = 0;
                }
            }
        }
        this.m = bl.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // yads.bl
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // yads.bl
    public final boolean isEnded() {
        if (!this.p) {
            return false;
        }
        g33 g33Var = this.j;
        return g33Var == null || (g33Var.m * g33Var.b) * 2 == 0;
    }

    @Override // yads.bl
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        zk zkVar = zk.e;
        this.e = zkVar;
        this.f = zkVar;
        this.g = zkVar;
        this.h = zkVar;
        ByteBuffer byteBuffer = bl.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // yads.bl
    public final ByteBuffer a() {
        int i;
        g33 g33Var = this.j;
        if (g33Var != null && (i = g33Var.m * g33Var.b * 2) > 0) {
            if (this.k.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            ShortBuffer shortBuffer = this.l;
            int min = Math.min(shortBuffer.remaining() / g33Var.b, g33Var.m);
            shortBuffer.put(g33Var.l, 0, g33Var.b * min);
            int i2 = g33Var.m - min;
            g33Var.m = i2;
            short[] sArr = g33Var.l;
            int i3 = g33Var.b;
            System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
            this.o += i;
            this.k.limit(i);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = bl.a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            g33 g33Var = this.j;
            g33Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = g33Var.b;
            int i2 = remaining2 / i;
            short[] b = g33Var.b(g33Var.j, g33Var.k, i2);
            g33Var.j = b;
            asShortBuffer.get(b, g33Var.k * g33Var.b, ((i * i2) * 2) / 2);
            g33Var.k += i2;
            g33Var.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }
}
