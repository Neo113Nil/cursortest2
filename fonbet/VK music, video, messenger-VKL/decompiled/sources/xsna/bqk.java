package xsna;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: CycledByteBuffer.kt */
/* loaded from: classes3.dex */
public final class bqk {
    public final f100 b;
    public int d;
    public int e;
    public int f;
    public int a = 4096;
    public ByteBuffer c = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());

    public bqk(f100 f100Var) {
        this.b = f100Var;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() + this.d <= this.a) {
            int remaining = byteBuffer.remaining();
            int i = this.d + remaining;
            int min = Integer.min(remaining, this.a - this.f);
            int max = Math.max(remaining - min, 0);
            this.c.limit(this.a);
            this.c.position(this.f);
            byteBuffer.limit(byteBuffer.position() + min);
            this.c.put(byteBuffer);
            this.c.position(0);
            byteBuffer.limit(byteBuffer.limit() + max);
            this.c.put(byteBuffer);
            this.d = i;
            this.f = (this.e + i) % this.a;
            return;
        }
        int remaining2 = this.d + byteBuffer.remaining();
        int max2 = Math.max(this.a * 2, remaining2);
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.w("CycledByteBuffer", bd3.b(", new=", this.a, max2, new StringBuilder("increasing capacity, was=")));
        }
        ByteBuffer order = ByteBuffer.allocateDirect(max2).order(ByteOrder.nativeOrder());
        int min2 = Integer.min(this.d, this.a - this.e);
        int max3 = Math.max(this.d - min2, 0);
        this.c.limit(this.e + min2);
        this.c.position(this.e);
        order.put(this.c);
        this.c.limit(max3);
        this.c.position(0);
        order.put(this.c);
        order.put(byteBuffer);
        this.a = max2;
        this.d = remaining2;
        this.e = 0;
        this.f = remaining2;
        this.c = order;
        order.limit(max2);
    }

    public final void b(int i, ByteBuffer byteBuffer) {
        int min = Integer.min(i, this.a - this.e);
        int i2 = 0;
        int max = Math.max(i - min, 0);
        int position = byteBuffer.position();
        this.c.limit(this.e + min);
        this.c.position(this.e);
        byteBuffer.put(this.c);
        this.c.limit(max);
        this.c.position(0);
        byteBuffer.put(this.c);
        if (max == 0) {
            int i3 = this.e;
            if (i3 + min < this.a) {
                i2 = i3 + min;
            }
        } else {
            i2 = max;
        }
        this.e = i2;
        this.d -= i;
        byteBuffer.position(position);
    }
}
