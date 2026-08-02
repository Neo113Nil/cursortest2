package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: ChunkStreamReader.java */
/* loaded from: classes8.dex */
public class lcc {
    public final int a;
    public final AtomicLong b;
    public int c;
    public int d;
    public byte e = 0;
    public int f;
    public ByteBuffer g;
    public int h;
    public boolean i;

    public lcc(int i, AtomicLong atomicLong) {
        this.a = i;
        this.b = atomicLong;
    }

    public void a(byte b, int i, int i2, int i3, ByteBuffer byteBuffer) throws ProtocolException, IOException {
    }
}
