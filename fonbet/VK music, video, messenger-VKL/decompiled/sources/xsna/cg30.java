package xsna;

import android.util.Pair;
import com.coremedia.iso.boxes.FreeBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.google.common.collect.Range;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.rs70;

/* compiled from: Mp4Writer.java */
/* loaded from: classes12.dex */
public final class cg30 {
    public final o9r a;
    public final ki20 b;
    public final h3g0 f;
    public long h;
    public long i;
    public long k;
    public long l;
    public long m;
    public final int g = 400000;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean j = true;
    public Range<Long> n = Range.a(0L, 0L);
    public long o = 0;

    public cg30(o9r o9rVar, ki20 ki20Var) {
        this.a = o9rVar;
        this.b = ki20Var;
        h3g0 h3g0Var = new h3g0();
        h3g0Var.b = ByteBuffer.allocateDirect(0);
        this.f = h3g0Var;
    }

    public final void a() throws IOException {
        if (this.j) {
            d();
            return;
        }
        ByteBuffer l = ya8.l(this.c, this.b);
        int remaining = l.remaining();
        long j = remaining + 8;
        if (this.l - this.m < j) {
            e(this.n.d().longValue() + j, l);
            fxc0.z(this.l - this.m >= j);
        }
        long j2 = this.m;
        o9r o9rVar = this.a;
        o9rVar.h(j2);
        o9rVar.write(l);
        long j3 = remaining + j2;
        long longValue = this.n.d().longValue() - j3;
        fxc0.z(longValue < 2147483647L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) longValue);
        String str = y2r0.a;
        allocate.put(FreeBox.TYPE.getBytes(StandardCharsets.UTF_8));
        allocate.flip();
        o9rVar.write(allocate);
        this.l = j2;
        f(j2 - this.k);
        this.n = Range.a(Long.valueOf(j2), Long.valueOf(j2 + l.limit()));
        o9rVar.c.truncate(j3);
    }

    public final void b() throws IOException {
        ArrayList arrayList;
        long j;
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                break;
            }
            g((tep0) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            g((tep0) arrayList.get(i3));
            i3++;
        }
        if (this.e.get()) {
            a();
            if (arrayList.isEmpty()) {
                return;
            }
            byte[] bArr = new byte[8];
            for (int i4 = 7; i4 >= 0; i4--) {
                bArr[i4] = (byte) 0;
            }
            vo10 vo10Var = new vo10("auxiliary.tracks.offset", bArr, 0, 78);
            ki20 ki20Var = this.b;
            ki20Var.a(vo10Var);
            ByteBuffer g = ya8.g();
            ki20 ki20Var2 = new ki20();
            ki20Var2.a(ki20Var.d);
            ki20Var2.a(new vo10("auxiliary.tracks.interleaved", new byte[]{1}, 0, 75));
            int size = arrayList.size();
            byte[] bArr2 = new byte[size + 2];
            bArr2[0] = 1;
            bArr2[1] = (byte) size;
            for (int i5 = 0; i5 < size; i5++) {
                tep0 tep0Var = (tep0) arrayList.get(i5);
                int i6 = tep0Var.a.g;
                if (i6 == 1) {
                    i = 0;
                } else if (i6 == 2) {
                    i = 1;
                } else if (i6 == 3) {
                    i = 2;
                } else {
                    if (i6 != 4) {
                        throw new IllegalArgumentException("Unsupported auxiliary track type " + tep0Var.a.g);
                    }
                    i = 3;
                }
                bArr2[i5 + 2] = (byte) i;
            }
            ki20Var2.a(new vo10("auxiliary.tracks.map", bArr2, 0, 0));
            ByteBuffer l = ya8.l(arrayList, ki20Var2);
            long remaining = l.remaining() + g.remaining();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            String str = y2r0.a;
            allocate.put("axte".getBytes(StandardCharsets.UTF_8));
            allocate.putLong(remaining + 16);
            allocate.flip();
            ByteBuffer e = wlb0.e(allocate, g, l);
            long remaining2 = e.remaining();
            byte[] bArr3 = new byte[8];
            int i7 = 7;
            while (true) {
                j = 255;
                if (i7 < 0) {
                    break;
                }
                bArr3[i7] = (byte) (255 & remaining2);
                remaining2 >>= 8;
                i7--;
            }
            ki20Var.a(new vo10("auxiliary.tracks.length", bArr3, 0, 78));
            a();
            ki20Var.c.remove(vo10Var);
            o9r o9rVar = this.a;
            FileChannel fileChannel = o9rVar.c;
            long size2 = fileChannel.size();
            byte[] bArr4 = new byte[8];
            int i8 = 7;
            while (i8 >= 0) {
                bArr4[i8] = (byte) (size2 & r17);
                size2 >>= 8;
                i8--;
                j = j;
            }
            ki20Var.a(new vo10("auxiliary.tracks.offset", bArr4, 0, 78));
            long size3 = fileChannel.size();
            a();
            fxc0.z(size3 == fileChannel.size());
            o9rVar.h(fileChannel.size());
            o9rVar.write(e);
        }
    }

    public final void c(long j) throws IOException {
        if (this.j) {
            return;
        }
        long j2 = this.m;
        if (j2 + j >= this.l) {
            e(Math.max(this.l + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, this.n.d().longValue()), ya8.l(this.c, this.b));
        }
    }

    public final void d() throws IOException {
        ByteBuffer l = ya8.l(this.c, this.b);
        int remaining = l.remaining();
        long remaining2 = l.remaining() + 8;
        long j = this.i;
        long j2 = this.h;
        long j3 = j - j2;
        o9r o9rVar = this.a;
        if (remaining2 <= j3) {
            o9rVar.h(j2);
            o9rVar.write(l);
            o9rVar.write(wlb0.x(FreeBox.TYPE, ByteBuffer.allocate((int) ((this.i - o9rVar.c.position()) - 8))));
        } else {
            this.j = false;
            long j4 = this.m;
            this.l = j4;
            o9rVar.h(j4);
            o9rVar.write(l);
            this.n = Range.a(Long.valueOf(this.l), Long.valueOf(this.l + remaining));
            ByteBuffer x = wlb0.x(FreeBox.TYPE, ByteBuffer.allocate((int) ((this.i - this.h) - 8)));
            o9rVar.h(this.h);
            o9rVar.write(x);
        }
        f(this.m - this.k);
    }

    public final void e(long j, ByteBuffer byteBuffer) throws IOException {
        fxc0.z(j >= this.n.d().longValue());
        fxc0.z(j >= this.l);
        o9r o9rVar = this.a;
        o9rVar.h(j);
        o9rVar.write(wlb0.x(FreeBox.TYPE, byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.l = j2;
        f(j2 - this.k);
        this.n = Range.a(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    public final void f(long j) throws IOException {
        long j2 = this.k + 8;
        o9r o9rVar = this.a;
        o9rVar.h(j2);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        o9rVar.write(allocate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        if (((java.lang.Integer) r8.first).intValue() != 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r9.equals("video/hevc") == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(tep0 tep0Var) throws IOException {
        o9r o9rVar = this.a;
        FileChannel fileChannel = o9rVar.c;
        ArrayDeque arrayDeque = tep0Var.f;
        int size = arrayDeque.size();
        ArrayDeque arrayDeque2 = tep0Var.e;
        fxc0.z(size == arrayDeque2.size());
        if (arrayDeque2.isEmpty()) {
            return;
        }
        long j = 0;
        if (!this.e.getAndSet(true)) {
            o9rVar.h(0L);
            o9rVar.write(ya8.g());
            int i = this.g;
            if (i > 0) {
                this.h = fileChannel.position();
                o9rVar.write(wlb0.x(FreeBox.TYPE, ByteBuffer.allocate(i)));
                this.i = fileChannel.position();
            }
            this.k = fileChannel.position();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            String str = y2r0.a;
            allocate.put(MediaDataBox.TYPE.getBytes(StandardCharsets.UTF_8));
            allocate.putLong(16L);
            allocate.flip();
            o9rVar.write(allocate);
            long j2 = this.k + 16;
            this.m = j2;
            if (this.j) {
                j2 = Long.MAX_VALUE;
            }
            this.l = j2;
        }
        while (arrayDeque.iterator().hasNext()) {
            j += ((ByteBuffer) r3.next()).limit();
        }
        c(j);
        tep0Var.c.add(Long.valueOf(this.m));
        tep0Var.d.add(Integer.valueOf(arrayDeque2.size()));
        do {
            dm8 dm8Var = (dm8) arrayDeque2.removeFirst();
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.removeFirst();
            androidx.media3.common.a aVar = tep0Var.a;
            String str2 = aVar.n;
            str2.getClass();
            boolean equals = str2.equals("video/dolby-vision");
            h3g0 h3g0Var = this.f;
            if (equals) {
                Pair<Integer, Integer> h = ya8.h(aVar);
                h.getClass();
            } else {
                if (!str2.equals("video/avc")) {
                }
                ss2.a.getClass();
                if (byteBuffer.hasRemaining()) {
                    com.google.common.collect.g a = ts2.a(byteBuffer);
                    int i2 = 0;
                    for (int i3 = 0; i3 < a.e; i3++) {
                        i2 += ((ByteBuffer) a.get(i3)).remaining() + 4;
                    }
                    ByteBuffer g = h3g0Var.g(i2);
                    for (int i4 = 0; i4 < a.e; i4++) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) a.get(i4);
                        g.putInt(byteBuffer2.remaining());
                        g.put(byteBuffer2);
                    }
                    g.rewind();
                    byteBuffer.position(byteBuffer.limit());
                    byteBuffer = g;
                }
                dm8Var = new dm8(dm8Var.a, byteBuffer.remaining(), dm8Var.c);
            }
            c(byteBuffer.remaining());
            o9rVar.h(this.m);
            this.m += fileChannel.write(byteBuffer);
            ((ByteBuffer) h3g0Var.b).clear();
            tep0Var.b.add(dm8Var);
        } while (!arrayDeque2.isEmpty());
        fxc0.z(this.m <= this.l);
    }

    public final void h(tep0 tep0Var, ByteBuffer byteBuffer, dm8 dm8Var) throws IOException {
        rs70.d dVar;
        int remaining;
        androidx.media3.common.a aVar = tep0Var.a;
        if (Objects.equals(aVar.n, MimeTypes.VIDEO_AV1) && aVar.q.isEmpty() && tep0Var.h == null) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            ArrayList arrayList = new ArrayList();
            ByteBuffer asReadOnlyBuffer = duplicate.asReadOnlyBuffer();
            ArrayList arrayList2 = new ArrayList();
            while (asReadOnlyBuffer.hasRemaining()) {
                try {
                    byte b = asReadOnlyBuffer.get();
                    int i = (b >> 3) & 15;
                    if (((b >> 2) & 1) != 0) {
                        asReadOnlyBuffer.get();
                    }
                    if (((b >> 1) & 1) != 0) {
                        remaining = 0;
                        for (int i2 = 0; i2 < 8; i2++) {
                            byte b2 = asReadOnlyBuffer.get();
                            remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                            if ((b2 & 128) == 0) {
                                break;
                            }
                        }
                    } else {
                        remaining = asReadOnlyBuffer.remaining();
                    }
                    if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                        break;
                    }
                    ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                    duplicate2.limit(asReadOnlyBuffer.position() + remaining);
                    arrayList2.add(new rs70.c(i, duplicate2));
                    asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
                } catch (BufferUnderflowException unused) {
                }
            }
            Iterator it = arrayList2.iterator();
            ByteBuffer byteBuffer2 = null;
            ByteBuffer byteBuffer3 = null;
            while (it.hasNext()) {
                rs70.c cVar = (rs70.c) it.next();
                int i3 = cVar.a;
                if (i3 == 5) {
                    arrayList.add(dp5.a(cVar));
                } else if (i3 == 1 && byteBuffer2 == null) {
                    byteBuffer2 = dp5.a(cVar);
                    byteBuffer3 = ByteBuffer.allocate(4);
                    byteBuffer3.put((byte) -127);
                    try {
                        dVar = new rs70.d(cVar);
                    } catch (rs70.b unused2) {
                        dVar = null;
                    }
                    fxc0.t(dVar, "No sequence header available.");
                    byteBuffer3.put((byte) ((dVar.g << 5) | dVar.h));
                    byteBuffer3.put((byte) ((dVar.i > 0 ? 128 : 0) | (dVar.l ? 64 : 0) | (dVar.m ? 32 : 0) | (dVar.n ? 16 : 0) | (dVar.o ? 8 : 0) | (dVar.p ? 4 : 0) | dVar.q));
                    boolean z = dVar.j;
                    byteBuffer3.put((byte) ((z ? dVar.k & 15 : 0) | (z ? 16 : 0)));
                    byteBuffer3.flip();
                }
            }
            fxc0.t(byteBuffer2, "No sequence header available.");
            ByteBuffer e = wlb0.e(byteBuffer2, wlb0.e((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0])));
            fxc0.t(byteBuffer3, "csdHeader is null.");
            tep0Var.h = wlb0.e(byteBuffer3, e).array();
        }
        fxc0.q(tep0Var.i == C.TIME_UNSET, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
        int i4 = dm8Var.b;
        long j = dm8Var.a;
        int i5 = dm8Var.c;
        if (i4 != 0 && byteBuffer.remaining() != 0) {
            if ((i5 & 1) > 0) {
                tep0Var.g = true;
            }
            if (tep0Var.g || !io20.p(aVar.n)) {
                tep0Var.e.addLast(new dm8(j, byteBuffer.remaining(), i5));
                tep0Var.f.addLast(byteBuffer);
            }
        } else if ((i5 & 4) != 0) {
            tep0Var.i = j;
        }
        g(tep0Var);
        if (this.c.contains(tep0Var) && this.j && j - this.o >= 1000000) {
            d();
            this.o = j;
        }
    }
}
