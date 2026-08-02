package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class gq6 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public gq6(ByteBuffer byteBuffer, hh3 hh3Var, int i, int i2) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit != hh3Var.a()) {
            StringBuilder t = b64.t(limit, "Byte buffer size is not match with packet info: ", " != ");
            t.append(hh3Var.a());
            throw new IllegalStateException(t.toString());
        }
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
        this.d = hh3Var.b();
    }

    public final p34 a(ByteBuffer byteBuffer) {
        int remaining;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            remaining = byteBuffer.remaining();
            this.d += m1b1.a(this.b, m1b1.d(this.a, remaining));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + remaining);
            byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
        } else {
            remaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + remaining).position(position2);
        }
        byteBuffer2.position(position + remaining);
        return new p34(remaining, j);
    }
}
