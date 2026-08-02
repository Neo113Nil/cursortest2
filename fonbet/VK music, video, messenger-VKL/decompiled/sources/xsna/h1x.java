package xsna;

import java.nio.ByteBuffer;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: InputBuffer.java */
/* loaded from: classes8.dex */
public final class h1x {
    public final long a;
    public final AtomicLong b;
    public final TreeMap<Long, ByteBuffer> c = new TreeMap<>();
    public long d;
    public long e;

    public h1x(AtomicLong atomicLong, long j) {
        this.b = atomicLong;
        this.a = j;
    }
}
