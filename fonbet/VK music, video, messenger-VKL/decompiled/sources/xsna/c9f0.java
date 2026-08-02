package xsna;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ReceiveStream.java */
/* loaded from: classes8.dex */
public final class c9f0 {
    public final h1x a;
    public int b;
    public long c;
    public ByteBuffer d;
    public final ByteBuffer e = ByteBuffer.allocate(4);
    public boolean f;
    public one.video.streaming.oktp.a g;

    public c9f0(AtomicLong atomicLong) {
        this.a = new h1x(atomicLong, 20000000);
    }

    public final void a(ByteBuffer byteBuffer) {
        h1x h1xVar = this.a;
        TreeMap<Long, ByteBuffer> treeMap = h1xVar.c;
        long j = h1xVar.d;
        Iterator<Map.Entry<Long, ByteBuffer>> it = treeMap.entrySet().iterator();
        while (true) {
            if (byteBuffer.remaining() <= 0 || !it.hasNext()) {
                break;
            }
            Map.Entry<Long, ByteBuffer> next = it.next();
            if (next.getKey().longValue() != h1xVar.d) {
                break;
            }
            ByteBuffer value = next.getValue();
            int min = Math.min(byteBuffer.remaining(), value.remaining());
            k7b0.c(value, byteBuffer, min);
            h1xVar.d += min;
            it.remove();
            if (value.remaining() > 0) {
                treeMap.put(Long.valueOf(h1xVar.d), next.getValue());
                break;
            }
        }
        long j2 = h1xVar.d;
        h1xVar.e = j2;
        h1xVar.b.addAndGet(-(j2 - j));
    }
}
