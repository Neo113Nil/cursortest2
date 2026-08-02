package xsna;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ImItemWeight.kt */
/* loaded from: classes18.dex */
public final class x7w implements Comparable<x7w> {
    public static final x7w f = new x7w(0, 0, 0);
    public static final x7w g = new x7w(Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE);
    public final long b;
    public final long c;
    public final long d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new xyh(this, 23));

    /* compiled from: ImItemWeight.kt */
    public static final class a {
        public static x7w a(byte[] bArr) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            return new x7w(order.getLong(), order.getLong(), order.getLong());
        }
    }

    public x7w(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(x7w x7wVar) {
        int h = epx.h(this.b, x7wVar.b);
        if (h != 0) {
            return h;
        }
        int h2 = epx.h(this.c, x7wVar.c);
        return h2 != 0 ? h2 : epx.h(this.d, x7wVar.d);
    }

    public final byte[] c() {
        return ByteBuffer.allocate(24).order(ByteOrder.BIG_ENDIAN).putLong(this.b).putLong(this.c).putLong(this.d).array();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x7w)) {
            return false;
        }
        x7w x7wVar = (x7w) obj;
        return x7wVar.b == this.b && x7wVar.c == this.c && x7wVar.d == this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int hashCode() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('|');
        sb.append(this.c);
        sb.append('|');
        sb.append(this.d);
        return sb.toString();
    }
}
