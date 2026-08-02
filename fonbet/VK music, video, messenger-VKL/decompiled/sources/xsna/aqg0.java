package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.live.DebugInfo;
import one.video.player.live.proto.rtmp.ProtocolException;
import ru.ok.android.commons.nio.charset.CharsetEncoder;

/* compiled from: RtmpClient.java */
/* loaded from: classes8.dex */
public abstract class aqg0 {
    public static final /* synthetic */ int w = 0;
    public final Handler a;
    public final HashMap b;
    public final HashMap c;
    public final String d;
    public Thread i;
    public volatile boolean j;
    public lyj k;
    public DataInputStream l;
    public myj m;
    public int n;
    public final b p;
    public final lkx0 q;
    public String r;
    public boolean s;
    public Socket t;
    public final AtomicLong u;
    public final DebugInfo v;
    public int e = 128;
    public int f = 128;
    public volatile int g = 0;
    public long h = 0;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    /* compiled from: RtmpClient.java */
    public class a extends lcc {
        public a(AtomicLong atomicLong) {
            super(2, atomicLong);
        }

        @Override // xsna.lcc
        public final void a(byte b, int i, int i2, int i3, ByteBuffer byteBuffer) throws ProtocolException, IOException {
            aqg0 aqg0Var = aqg0.this;
            switch (b) {
                case 1:
                    if (byteBuffer.remaining() == 4) {
                        aqg0Var.e = byteBuffer.getInt();
                        return;
                    } else {
                        throw new ProtocolException("'Set chunk size' message has invalid size: " + byteBuffer.remaining());
                    }
                case 2:
                    if (byteBuffer.remaining() != 4) {
                        throw new ProtocolException("Abort message has invalid size: " + byteBuffer.remaining());
                    }
                    lcc lccVar = (lcc) aqg0Var.b.get(Integer.valueOf(byteBuffer.getInt()));
                    if (lccVar != null) {
                        lccVar.g.position(0);
                        return;
                    }
                    return;
                case 3:
                    if (byteBuffer.remaining() == 4) {
                        return;
                    }
                    throw new ProtocolException("Acknowledge message has invalid size: " + byteBuffer.remaining());
                case 4:
                    if (byteBuffer.remaining() < 2) {
                        return;
                    }
                    short s = byteBuffer.getShort();
                    if (s == 6) {
                        if (byteBuffer.remaining() < 4) {
                            return;
                        }
                        aqg0Var.g(new eqg0(aqg0Var, byteBuffer.getInt()));
                        return;
                    } else {
                        if (s != 7 || byteBuffer.remaining() < 4) {
                            return;
                        }
                        int currentTimeMillis = ((int) System.currentTimeMillis()) - byteBuffer.getInt();
                        lkx0 lkx0Var = aqg0Var.q;
                        float f = currentTimeMillis;
                        if (Float.isNaN(lkx0Var.a)) {
                            lkx0Var.a = f;
                        } else {
                            lkx0Var.a = (f * 0.2f) + (0.8f * lkx0Var.a);
                        }
                        float f2 = aqg0Var.q.a;
                        return;
                    }
                case 5:
                    if (byteBuffer.remaining() == 4) {
                        aqg0Var.g = byteBuffer.getInt();
                        return;
                    } else {
                        throw new ProtocolException("'Acknowledge window size' message has invalid size: " + byteBuffer.remaining());
                    }
                case 6:
                    return;
                default:
                    throw new ProtocolException(lhg.a(b, "Unexpected message type: "));
            }
        }
    }

    /* compiled from: RtmpClient.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            aqg0.c(aqg0.this);
        }
    }

    /* compiled from: RtmpClient.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            aqg0.this.e();
        }
    }

    /* compiled from: RtmpClient.java */
    public interface d {
        void a(ByteBuffer byteBuffer) throws ProtocolException;
    }

    public aqg0(HandlerThread handlerThread, String str, @Nullable DebugInfo debugInfo) {
        lkx0 lkx0Var = new lkx0();
        lkx0Var.a = Float.NaN;
        this.q = lkx0Var;
        AtomicLong atomicLong = new AtomicLong(0L);
        this.u = atomicLong;
        this.v = debugInfo;
        this.n = 1;
        this.d = str;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        hashMap2.put(2, new mcc(2));
        hashMap.put(2, new a(atomicLong));
        this.p = new b();
        this.a = new Handler(handlerThread.getLooper());
    }

    public static void a(aqg0 aqg0Var) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        HashMap hashMap = aqg0Var.b;
        byte readByte = aqg0Var.l.readByte();
        int i = (readByte & 192) >>> 6;
        int i2 = readByte & CharsetEncoder.DEFAULT_REPLACEMENT;
        int readByte2 = i2 <= 1 ? aqg0Var.l.readByte() & CharsetEncoder.DEFAULT_REPLACEMENT : i2;
        if (i2 == 1) {
            readByte2 += (aqg0Var.l.readByte() & 255) << 8;
        }
        lcc lccVar = (lcc) hashMap.get(Integer.valueOf(readByte2));
        if (lccVar == null) {
            lccVar = new cqg0(aqg0Var, readByte2, aqg0Var.u);
            hashMap.put(Integer.valueOf(readByte2), lccVar);
        }
        lcc lccVar2 = lccVar;
        DataInputStream dataInputStream = aqg0Var.l;
        int i3 = aqg0Var.e;
        AtomicLong atomicLong = lccVar2.b;
        if (i < 3) {
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                i4 = (i4 << 8) | (dataInputStream.readByte() & 255);
            }
            lccVar2.h = i4;
            lccVar2.i = i4 == 16777215;
            if (i < 2) {
                int i6 = 0;
                for (int i7 = 0; i7 < 3; i7++) {
                    i6 = (i6 << 8) | (dataInputStream.readByte() & 255);
                }
                lccVar2.d = i6;
                lccVar2.e = dataInputStream.readByte();
                if (i < 1) {
                    lccVar2.f = Integer.reverseBytes(dataInputStream.readInt());
                }
            }
        }
        if (lccVar2.i) {
            lccVar2.h = dataInputStream.readInt();
        }
        if (lccVar2.h == 16777215) {
            lccVar2.h = dataInputStream.readInt();
        }
        if (i == 0) {
            lccVar2.c = lccVar2.h;
        } else if ((3 == i && ((byteBuffer = lccVar2.g) == null || byteBuffer.position() == 0)) || 3 != i) {
            lccVar2.c += lccVar2.h;
        }
        if (3 != i && (byteBuffer2 = lccVar2.g) != null && byteBuffer2.position() != 0) {
            lccVar2.g.position(0);
        }
        ByteBuffer byteBuffer3 = lccVar2.g;
        int min = Math.min(i3, lccVar2.d - (byteBuffer3 == null ? 0 : byteBuffer3.position()));
        ByteBuffer byteBuffer4 = lccVar2.g;
        if (byteBuffer4 == null || byteBuffer4.capacity() < lccVar2.d) {
            long andAdd = atomicLong.getAndAdd(lccVar2.d);
            int i8 = lccVar2.d;
            if (i8 + andAdd > 512000) {
                throw new ProtocolException("Trying to allocate too many bytes on this connection: sz=" + lccVar2.d + " allocatedBytes=" + andAdd);
            }
            lccVar2.g = ByteBuffer.allocate(i8);
        }
        lccVar2.g.limit(lccVar2.d);
        ByteBuffer byteBuffer5 = lccVar2.g;
        if (byteBuffer5.hasArray()) {
            mu8.a(dataInputStream, byteBuffer5.array(), byteBuffer5.position() + byteBuffer5.arrayOffset(), min);
            byteBuffer5.position(byteBuffer5.position() + min);
        } else {
            byte[] bArr = new byte[min];
            mu8.a(dataInputStream, bArr, 0, min);
            byteBuffer5.put(bArr);
        }
        int position = lccVar2.g.position();
        int i9 = lccVar2.d;
        if (position != i9 || i9 <= 0) {
            return;
        }
        try {
            lccVar2.g.position(0);
            lccVar2.a(lccVar2.e, lccVar2.a, lccVar2.f, lccVar2.c, lccVar2.g);
        } finally {
            atomicLong.addAndGet(-lccVar2.d);
            lccVar2.g = null;
        }
    }

    public static void b(aqg0 aqg0Var) {
        if (aqg0Var.j || aqg0Var.i.isInterrupted()) {
            throw new InterruptedException("thread is interrupted");
        }
        byte[] bArr = new byte[1536];
        new Random().nextBytes(bArr);
        aqg0Var.m.write(3);
        aqg0Var.m.writeInt((int) (System.currentTimeMillis() & 4294967295L));
        aqg0Var.m.writeInt(0);
        aqg0Var.m.write(bArr, 0, 1528);
        aqg0Var.m.flush();
        int read = aqg0Var.l.read();
        if (read != 3) {
            throw new ProtocolException(tgw.b(read, "Unsupported version of RTMP: ", "; expected: 3"));
        }
        int readInt = aqg0Var.l.readInt();
        aqg0Var.l.readInt();
        mu8.a(aqg0Var.l, bArr, 0, 1528);
        if (aqg0Var.j || aqg0Var.i.isInterrupted()) {
            throw new InterruptedException("thread is interrupted");
        }
        aqg0Var.m.writeInt(readInt);
        aqg0Var.m.writeInt((int) (System.currentTimeMillis() & 4294967295L));
        aqg0Var.m.write(bArr, 0, 1528);
        aqg0Var.m.flush();
        DataInputStream dataInputStream = aqg0Var.l;
        byte[] bArr2 = new byte[8192];
        long j = 0;
        while (j < 1536) {
            long j2 = 1536 - j;
            int available = dataInputStream.available();
            long skip = available == 0 ? 0L : dataInputStream.skip(Math.min(available, j2));
            if (skip == 0) {
                skip = dataInputStream.read(bArr2, 0, (int) Math.min(j2, 8192));
                if (skip == -1) {
                    break;
                }
            }
            j += skip;
        }
        if (j < 1536) {
            throw new EOFException(qlb0.a(j, "reached end of stream after skipping ", " bytes; 1536 bytes expected"));
        }
    }

    public static void c(aqg0 aqg0Var) {
        if (aqg0Var.j) {
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.put((byte) 0);
        allocate.put((byte) 6);
        allocate.putInt((int) System.currentTimeMillis());
        allocate.position(0);
        aqg0Var.u(2, (byte) 4, allocate, false);
        aqg0Var.h();
        b bVar = aqg0Var.p;
        if (aqg0Var.j) {
            return;
        }
        try {
            aqg0Var.a.postDelayed(bVar, 5000);
        } catch (Exception unused) {
            aqg0Var.e();
            aqg0Var.i(10);
        }
    }

    public static void d(aqg0 aqg0Var) {
        if (aqg0Var.g != 0) {
            long j = aqg0Var.m.b;
            if (j >= aqg0Var.h + aqg0Var.g) {
                aqg0Var.h = j;
                aqg0Var.g(new dqg0(aqg0Var, j));
            }
        }
    }

    public abstract void e();

    public abstract void f();

    public final void g(Runnable runnable) {
        if (this.j) {
            return;
        }
        try {
            this.a.post(runnable);
        } catch (Exception unused) {
            e();
            i(10);
        }
    }

    public final void h() {
        myj myjVar;
        try {
            if (this.j || (myjVar = this.m) == null) {
                return;
            }
            myjVar.flush();
        } catch (IOException e) {
            Log.e("xsna.aqg0", "IO exception while flushing messages", e);
            i(10);
            q();
        }
    }

    public void i(int i) {
        this.m = new myj(new xm70());
    }

    public abstract void j(ByteBuffer byteBuffer);

    public abstract void k(lqg0 lqg0Var);

    public void l() {
        this.m = new myj(new xm70());
    }

    public abstract void m(int i);

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public final void q() {
        g(new c());
    }

    public void r(int i, int i2, int i3, byte b2, ByteBuffer byteBuffer) throws ProtocolException {
        String str = null;
        r0 = null;
        Double d2 = null;
        str = null;
        if (b2 != 20) {
            if (b2 == 18) {
                byte b3 = byteBuffer.get();
                if (5 != b3 && b3 == 2) {
                    str = cw1.a(byteBuffer);
                }
                if ("onMetaData".equals(str)) {
                    j(byteBuffer);
                    return;
                }
                return;
            }
            return;
        }
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get();
        String a2 = (5 != b4 && b4 == 2) ? cw1.a(byteBuffer) : null;
        if (!"_result".equals(a2)) {
            if (!"onStatus".equals(a2)) {
                if ("onMetaData".equals(a2)) {
                    j(byteBuffer);
                    return;
                }
                return;
            } else {
                byteBuffer.position(position);
                lqg0 lqg0Var = new lqg0();
                lqg0Var.deserialize(byteBuffer);
                k(lqg0Var);
                return;
            }
        }
        byte b5 = byteBuffer.get();
        if (5 != b5 && b5 == 0) {
            d2 = Double.valueOf(byteBuffer.getDouble());
        }
        if (d2 != null) {
            d dVar = (d) this.o.remove(Integer.valueOf(d2.intValue()));
            if (dVar != null) {
                byteBuffer.position(position);
                dVar.a(byteBuffer);
            }
        }
    }

    public final void s(q8e0 q8e0Var, qqg0 qqg0Var) {
        int i = this.n;
        this.n = i + 1;
        q8e0Var.b.a = i;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(q8e0Var.getSize());
            q8e0Var.serialize(allocate);
            allocate.position(0);
            u(3, (byte) 20, allocate, true);
        } catch (ProtocolException e) {
            Log.e("xsna.aqg0", "Protocol exception while writing message", e);
            i(11);
            q();
        }
        if (qqg0Var != null) {
            ConcurrentHashMap concurrentHashMap = this.o;
            if (concurrentHashMap.size() > 1000) {
                throw new RuntimeException("Too many pending requests");
            }
            concurrentHashMap.put(Integer.valueOf(i), qqg0Var);
        }
    }

    public final synchronized void t() {
        this.j = true;
        Thread thread = this.i;
        if (thread != null) {
            thread.interrupt();
            this.i = null;
        }
    }

    public final void u(int i, byte b2, ByteBuffer byteBuffer, boolean z) {
        List singletonList = Collections.singletonList(byteBuffer);
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.c;
        mcc mccVar = (mcc) hashMap.get(valueOf);
        if (mccVar == null) {
            mccVar = new mcc(i);
            hashMap.put(Integer.valueOf(i), mccVar);
        }
        try {
            myj myjVar = this.m;
            if (myjVar != null && this.s) {
                mccVar.a(myjVar, singletonList, b2, this.f);
                if (z) {
                    h();
                }
            }
        } catch (IOException e) {
            Log.e("xsna.aqg0", "IO exception while writing message", e);
            i(10);
            q();
        }
    }
}
