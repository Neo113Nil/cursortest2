package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes10.dex */
public final class b9t0 implements og3 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public ng3 e;
    public ng3 f;
    public ng3 g;
    public ng3 h;
    public boolean i;
    public a9t0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public b9t0() {
        ng3 ng3Var = ng3.e;
        this.e = ng3Var;
        this.f = ng3Var;
        this.g = ng3Var;
        this.h = ng3Var;
        ByteBuffer byteBuffer = og3.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // defpackage.og3
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            a9t0 a9t0Var = this.j;
            a9t0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = a9t0Var.b;
            int i2 = remaining2 / i;
            short[] c = a9t0Var.c(a9t0Var.j, a9t0Var.k, i2);
            a9t0Var.j = c;
            asShortBuffer.get(c, a9t0Var.k * i, ((i2 * i) * 2) / 2);
            a9t0Var.k += i2;
            a9t0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // defpackage.og3
    public final void b() {
        a9t0 a9t0Var = this.j;
        if (a9t0Var != null) {
            int i = a9t0Var.k;
            float f = a9t0Var.c;
            float f2 = a9t0Var.d;
            double d = f / f2;
            int i2 = a9t0Var.m + ((int) (((((((i - r6) / d) + a9t0Var.r) + a9t0Var.w) + a9t0Var.o) / (a9t0Var.e * f2)) + 0.5d));
            a9t0Var.w = 0.0d;
            short[] sArr = a9t0Var.j;
            int i3 = a9t0Var.h * 2;
            a9t0Var.j = a9t0Var.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = a9t0Var.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                a9t0Var.j[(i5 * i) + i4] = 0;
                i4++;
            }
            a9t0Var.k = i3 + a9t0Var.k;
            a9t0Var.f();
            if (a9t0Var.m > i2) {
                a9t0Var.m = Math.max(i2, 0);
            }
            a9t0Var.k = 0;
            a9t0Var.r = 0;
            a9t0Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.og3
    public final ByteBuffer c() {
        a9t0 a9t0Var = this.j;
        if (a9t0Var != null) {
            int i = a9t0Var.b;
            d6z.x(a9t0Var.m >= 0);
            int i2 = a9t0Var.m * i * 2;
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
                d6z.x(a9t0Var.m >= 0);
                int min = Math.min(shortBuffer.remaining() / i, a9t0Var.m);
                int i3 = min * i;
                shortBuffer.put(a9t0Var.l, 0, i3);
                int i4 = a9t0Var.m - min;
                a9t0Var.m = i4;
                short[] sArr = a9t0Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = og3.a;
        return byteBuffer;
    }

    @Override // defpackage.og3
    public final ng3 d(ng3 ng3Var) {
        if (ng3Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
        }
        int i = this.b;
        if (i == -1) {
            i = ng3Var.a;
        }
        this.e = ng3Var;
        ng3 ng3Var2 = new ng3(i, ng3Var.b, 2);
        this.f = ng3Var2;
        this.i = true;
        return ng3Var2;
    }

    @Override // defpackage.og3
    public final void flush() {
        if (isActive()) {
            ng3 ng3Var = this.e;
            this.g = ng3Var;
            ng3 ng3Var2 = this.f;
            this.h = ng3Var2;
            if (this.i) {
                this.j = new a9t0(ng3Var.a, ng3Var.b, ng3Var2.a, this.c, this.d);
            } else {
                a9t0 a9t0Var = this.j;
                if (a9t0Var != null) {
                    a9t0Var.k = 0;
                    a9t0Var.m = 0;
                    a9t0Var.o = 0;
                    a9t0Var.p = 0;
                    a9t0Var.q = 0;
                    a9t0Var.r = 0;
                    a9t0Var.s = 0;
                    a9t0Var.t = 0;
                    a9t0Var.u = 0;
                    a9t0Var.v = 0;
                    a9t0Var.w = 0.0d;
                }
            }
        }
        this.m = og3.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.og3
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.og3
    public final boolean isEnded() {
        if (this.p) {
            a9t0 a9t0Var = this.j;
            if (a9t0Var != null) {
                d6z.x(a9t0Var.m >= 0);
                if (a9t0Var.m * a9t0Var.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.og3
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        ng3 ng3Var = ng3.e;
        this.e = ng3Var;
        this.f = ng3Var;
        this.g = ng3Var;
        this.h = ng3Var;
        ByteBuffer byteBuffer = og3.a;
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
}
