package xsna;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import ru.ok.media.api.LiveStreamStatReporter;

/* compiled from: BaseConnection.java */
/* loaded from: classes3.dex */
public abstract class wb6 {
    public SocketChannel a;
    public final Streamer.MODE b;
    public final g4j c;
    public int d;
    public final String e;
    public final int f;
    public final ByteBuffer i;

    @Nullable
    public LiveStreamStatReporter r;
    public final nd7 q = new nd7();
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public long g = 0;
    public long h = 0;
    public final ByteBuffer j = ByteBuffer.allocate(4096);

    public wb6(g4j g4jVar, int i, Streamer.MODE mode, String str, int i2, int i3, @Nullable LiveStreamStatReporter liveStreamStatReporter) throws IOException {
        this.r = liveStreamStatReporter;
        this.c = g4jVar;
        this.d = i;
        this.b = mode;
        this.e = str;
        this.f = i2;
        ByteBuffer allocate = ByteBuffer.allocate(i3 + 1024);
        this.i = allocate;
        allocate.position(0);
        allocate.limit(0);
        this.a = SocketChannel.open();
        g4jVar.getClass();
        this.a.configureBlocking(false);
    }

    public final void a(int i, int i2, byte[] bArr) throws IOException {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            b();
            return;
        }
        byteBuffer.compact();
        byteBuffer.put(bArr, i, i2);
        byteBuffer.flip();
    }

    public synchronized void b() {
        try {
            SocketChannel socketChannel = this.a;
            if (socketChannel != null) {
                try {
                    socketChannel.close();
                    SelectionKey keyFor = this.a.keyFor(this.c.c);
                    if (keyFor != null) {
                        keyFor.cancel();
                    }
                    this.a = null;
                } catch (IOException e) {
                    Log.e("BaseConnection", Log.getStackTraceString(e));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int c() {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            return 0;
        }
        return byteBuffer.remaining();
    }

    public final void d(Streamer.CONNECTION_STATE connection_state, Streamer.STATUS status) {
        Handler handler;
        g4j g4jVar = this.c;
        if (g4jVar != null) {
            int i = this.d;
            Streamer.b bVar = g4jVar.j;
            if (bVar == null || (handler = bVar.getHandler()) == null) {
                return;
            }
            handler.post(new e4j(g4jVar, i, connection_state, status));
        }
    }

    public abstract void e();

    public abstract int f(ByteBuffer byteBuffer);

    public abstract void g();

    public final void h(SelectionKey selectionKey) {
        ByteBuffer byteBuffer = this.j;
        try {
            if (selectionKey.isConnectable() && this.a.finishConnect()) {
                l(1);
                e();
            }
            if (selectionKey.isReadable()) {
                int read = this.a.read(byteBuffer);
                if (read <= 0) {
                    b();
                    return;
                }
                this.h += read;
                int f = f(byteBuffer);
                if (byteBuffer.position() <= f) {
                    byteBuffer.clear();
                } else {
                    int position = byteBuffer.position() - f;
                    int i = 0;
                    while (f < position) {
                        byteBuffer.put(i, byteBuffer.get(f));
                        f++;
                        i++;
                    }
                    byteBuffer.position(position);
                }
            }
            if (selectionKey.isWritable()) {
                k();
            }
        } catch (Exception e) {
            Log.e("BaseConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final void i(int i, int i2, byte[] bArr) throws IOException {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            b();
            return;
        }
        byteBuffer.compact();
        byteBuffer.put(bArr, i, i2);
        byteBuffer.flip();
        int write = this.a.write(byteBuffer);
        if (write > 0) {
            long j = write;
            this.g += j;
            this.q.a(System.currentTimeMillis(), j);
        }
        if (byteBuffer.hasRemaining()) {
            l(5);
        }
    }

    public final void j(String str) throws IOException {
        byte[] bytes = str.getBytes(C.ASCII_NAME);
        i(0, bytes.length, bytes);
    }

    public final void k() {
        ByteBuffer byteBuffer = this.i;
        try {
            int write = this.a.write(byteBuffer);
            if (write > 0) {
                long j = write;
                this.g += j;
                this.q.a(System.currentTimeMillis(), j);
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            l(1);
            g();
        } catch (IOException e) {
            Log.e("BaseConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final void l(int i) {
        SocketChannel socketChannel = this.a;
        if (socketChannel != null) {
            SelectionKey keyFor = socketChannel.keyFor(this.c.c);
            if (keyFor == null) {
                b();
            } else {
                keyFor.interestOps(i);
            }
        }
    }

    public final void m(BufferItem bufferItem) {
        long j = bufferItem.a;
        if (j < this.o) {
            this.o = 0L;
        }
        long j2 = (j - this.o) - 1;
        if (this.k != 0 && j2 != 0) {
            this.l += j2;
        }
        this.o = j;
    }

    public final void n(BufferItem bufferItem) {
        long j = bufferItem.a;
        if (j < this.p) {
            this.p = 0L;
        }
        long j2 = (j - this.p) - 1;
        if (this.m != 0 && j2 != 0) {
            this.n += j2;
        }
        this.p = j;
    }
}
