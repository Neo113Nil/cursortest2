package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.MuxerWrapper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EncodedSampleExporter.java */
/* loaded from: classes12.dex */
public final class vip extends androidx.media3.transformer.x implements hdu {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final androidx.media3.common.a e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;

    @Nullable
    public DecoderInputBuffer n;

    public vip(androidx.media3.common.a aVar, androidx.media3.transformer.z zVar, MuxerWrapper muxerWrapper, androidx.media3.transformer.u uVar, long j) {
        super(aVar, muxerWrapper);
        this.e = aVar;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        uVar.a(zVar);
    }

    @Override // xsna.c880
    public final void a(androidx.media3.transformer.m mVar, long j, @Nullable androidx.media3.common.a aVar, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j);
    }

    @Override // xsna.g0h0
    @Nullable
    public final DecoderInputBuffer e() {
        if (this.n == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.h.poll();
            this.n = decoderInputBuffer;
            if (!this.l) {
                if (decoderInputBuffer == null) {
                    DecoderInputBuffer decoderInputBuffer2 = new DecoderInputBuffer(2);
                    this.n = decoderInputBuffer2;
                    decoderInputBuffer2.e = o;
                } else {
                    long j = this.m;
                    decoderInputBuffer.e.getClass();
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // xsna.g0h0
    public final boolean h() {
        DecoderInputBuffer decoderInputBuffer = this.n;
        decoderInputBuffer.getClass();
        this.n = null;
        if (decoderInputBuffer.b(4)) {
            this.j = true;
        } else {
            decoderInputBuffer.g = this.k + this.f + decoderInputBuffer.g;
            this.i.add(decoderInputBuffer);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j = this.m;
            decoderInputBuffer.e.getClass();
            long capacity = j + r0.capacity();
            this.m = capacity;
            this.l = size >= 10 && (size >= 200 || capacity >= 2097152);
        }
        return true;
    }

    @Override // androidx.media3.transformer.x
    @Nullable
    public final DecoderInputBuffer k() {
        return (DecoderInputBuffer) this.i.peek();
    }

    @Override // androidx.media3.transformer.x
    public final androidx.media3.common.a l() {
        return this.e;
    }

    @Override // androidx.media3.transformer.x
    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    @Override // androidx.media3.transformer.x
    public final void p() {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.i.remove();
        decoderInputBuffer.c();
        decoderInputBuffer.g = 0L;
        this.h.add(decoderInputBuffer);
    }

    @Override // androidx.media3.transformer.x
    public final void o() {
    }

    @Override // androidx.media3.transformer.x
    public final hdu j(androidx.media3.transformer.m mVar, androidx.media3.common.a aVar, int i) {
        return this;
    }
}
