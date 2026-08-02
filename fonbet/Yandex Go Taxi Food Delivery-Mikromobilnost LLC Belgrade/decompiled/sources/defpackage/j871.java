package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import yads.xj;

/* loaded from: classes7.dex */
public final class j871 implements lv81 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public mp81 e;
    public mp81 f;
    public mp81 g;
    public mp81 h;
    public boolean i;
    public l571 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public j871() {
        mp81 mp81Var = mp81.e;
        this.e = mp81Var;
        this.f = mp81Var;
        this.g = mp81Var;
        this.h = mp81Var;
        ByteBuffer byteBuffer = lv81.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // defpackage.lv81
    public final ByteBuffer a() {
        l571 l571Var = this.j;
        if (l571Var != null) {
            int i = l571Var.b;
            int i2 = l571Var.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i, l571Var.m);
                int i3 = min * i;
                shortBuffer.put(l571Var.l, 0, i3);
                int i4 = l571Var.m - min;
                l571Var.m = i4;
                short[] sArr = l571Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = lv81.a;
        return byteBuffer;
    }

    @Override // defpackage.lv81
    public final void b() {
        l571 l571Var = this.j;
        if (l571Var != null) {
            int i = l571Var.h;
            int i2 = l571Var.k;
            float f = l571Var.c;
            float f2 = l571Var.d;
            int i3 = l571Var.m + ((int) ((((i2 / (f / f2)) + l571Var.o) / (l571Var.e * f2)) + 0.5f));
            int i4 = i * 2;
            l571Var.j = l571Var.e(l571Var.j, i2, i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = l571Var.b;
                if (i5 >= i4 * i6) {
                    break;
                }
                l571Var.j[(i6 * i2) + i5] = 0;
                i5++;
            }
            l571Var.k = i4 + l571Var.k;
            l571Var.b();
            if (l571Var.m > i3) {
                l571Var.m = i3;
            }
            l571Var.k = 0;
            l571Var.r = 0;
            l571Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.lv81
    public final boolean c() {
        if (!this.p) {
            return false;
        }
        l571 l571Var = this.j;
        return l571Var == null || (l571Var.m * l571Var.b) * 2 == 0;
    }

    @Override // defpackage.lv81
    public final void d() {
        this.c = 1.0f;
        this.d = 1.0f;
        mp81 mp81Var = mp81.e;
        this.e = mp81Var;
        this.f = mp81Var;
        this.g = mp81Var;
        this.h = mp81Var;
        ByteBuffer byteBuffer = lv81.a;
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

    @Override // defpackage.lv81
    public final void flush() {
        if (isActive()) {
            mp81 mp81Var = this.e;
            this.g = mp81Var;
            mp81 mp81Var2 = this.f;
            this.h = mp81Var2;
            if (this.i) {
                this.j = new l571(mp81Var.a, mp81Var.b, mp81Var2.a, this.c, this.d);
            } else {
                l571 l571Var = this.j;
                if (l571Var != null) {
                    l571Var.k = 0;
                    l571Var.m = 0;
                    l571Var.o = 0;
                    l571Var.p = 0;
                    l571Var.q = 0;
                    l571Var.r = 0;
                    l571Var.s = 0;
                    l571Var.t = 0;
                    l571Var.u = 0;
                    l571Var.v = 0;
                }
            }
        }
        this.m = lv81.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.lv81
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.lv81
    public final mp81 b(mp81 mp81Var) {
        if (mp81Var.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = mp81Var.a;
            }
            this.e = mp81Var;
            mp81 mp81Var2 = new mp81(i, mp81Var.b, 2);
            this.f = mp81Var2;
            this.i = true;
            return mp81Var2;
        }
        throw new xj(mp81Var);
    }

    @Override // defpackage.lv81
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            l571 l571Var = this.j;
            l571Var.getClass();
            int i = l571Var.b;
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining() / i;
            short[] e = l571Var.e(l571Var.j, l571Var.k, remaining2);
            l571Var.j = e;
            asShortBuffer.get(e, l571Var.k * i, ((remaining2 * i) * 2) / 2);
            l571Var.k += remaining2;
            l571Var.b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }
}
