package xsna;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AudioGraphInput.java */
/* loaded from: classes12.dex */
public final class mp4 implements hdu {
    public final AudioProcessor.a a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public pmj0 f;

    @Nullable
    public DecoderInputBuffer g;
    public androidx.media3.common.audio.b h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    /* compiled from: AudioGraphInput.java */
    public static final class a {
        public final androidx.media3.transformer.m a;
        public final long b;

        @Nullable
        public final androidx.media3.common.a c;
        public final boolean d;

        public a(androidx.media3.transformer.m mVar, long j, @Nullable androidx.media3.common.a aVar, boolean z) {
            this.a = mVar;
            this.b = j;
            this.c = aVar;
            this.d = z;
        }
    }

    public mp4(AudioProcessor.a aVar, androidx.media3.transformer.m mVar, androidx.media3.common.a aVar2) throws AudioProcessor.UnhandledAudioFormatException {
        AudioProcessor.a aVar3 = new AudioProcessor.a(aVar2);
        fxc0.q((aVar3.c == -1 || aVar3.a == -1 || aVar3.b == -1) ? false : true, aVar3);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            DecoderInputBuffer decoderInputBuffer = new DecoderInputBuffer(2);
            decoderInputBuffer.e = order;
            this.b.add(decoderInputBuffer);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new pmj0(aVar3);
        androidx.media3.common.audio.b k = k(mVar, aVar2, aVar3, aVar);
        this.h = k;
        k.b(AudioProcessor.b.b);
        AudioProcessor.a aVar4 = this.h.d;
        this.a = aVar4;
        fxc0.q(aVar4.c == 2, aVar4);
        this.e = new AtomicLong(C.TIME_UNSET);
        this.l = C.TIME_UNSET;
    }

    public static androidx.media3.common.audio.b k(androidx.media3.transformer.m mVar, @Nullable androidx.media3.common.a aVar, AudioProcessor.a aVar2, AudioProcessor.a aVar3) throws AudioProcessor.UnhandledAudioFormatException {
        int i;
        ImmutableList.a aVar4 = new ImmutableList.a();
        mVar.getClass();
        aVar4.e(mVar.f.a);
        int i2 = aVar3.a;
        int i3 = aVar3.b;
        if (i2 != -1) {
            androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(false);
            fxc0.p(i2 == -1 || i2 > 0);
            eVar.c = i2;
            aVar4.c(eVar);
        }
        if (i3 == 1 || i3 == 2) {
            androidx.media3.common.audio.d dVar = new androidx.media3.common.audio.d();
            w3b a2 = w3b.a(1, i3);
            int i4 = a2.a;
            SparseArray<w3b> sparseArray = dVar.i;
            sparseArray.put(i4, a2);
            w3b a3 = w3b.a(2, i3);
            sparseArray.put(a3.a, a3);
            aVar4.c(dVar);
        }
        androidx.media3.common.audio.b bVar = new androidx.media3.common.audio.b(aVar4.g());
        AudioProcessor.a a4 = bVar.a(aVar2);
        if ((i2 == -1 || i2 == a4.a) && ((i3 == -1 || i3 == a4.b) && ((i = aVar3.c) == -1 || i == a4.c))) {
            return bVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException("Audio can not be modified to match downstream format", aVar2);
    }

    @Override // xsna.c880
    public final void a(androidx.media3.transformer.m mVar, long j, @Nullable androidx.media3.common.a aVar, boolean z) {
        if (aVar == null) {
            fxc0.A(j != C.TIME_UNSET, "Could not generate silent audio because duration is unknown.");
        } else {
            fxc0.z(io20.l(aVar.n));
            AudioProcessor.a aVar2 = new AudioProcessor.a(aVar);
            if (aVar2.c != -1 && aVar2.a != -1 && aVar2.b != -1) {
                r0 = true;
            }
            fxc0.A(r0, aVar2);
        }
        this.d.add(new a(mVar, j, aVar, z));
    }

    public final void c() {
        pmj0 pmj0Var = this.f;
        long j = this.l;
        long j2 = this.m;
        pmj0Var.c.addAndGet(r3.d * y2r0.q(pmj0Var.a.a, j - y2r0.b0(pmj0Var.a.a, j2 / r5.d)));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    @Override // xsna.g0h0
    @Nullable
    public final DecoderInputBuffer e() {
        if (this.d.isEmpty()) {
            return (DecoderInputBuffer) this.b.peek();
        }
        return null;
    }

    @Override // xsna.g0h0
    public final boolean h() {
        fxc0.z(this.d.isEmpty());
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.b.remove();
        this.c.add(decoderInputBuffer);
        this.e.compareAndSet(C.TIME_UNSET, decoderInputBuffer.g);
        return true;
    }

    public final void j(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.c();
        decoderInputBuffer.g = 0L;
        this.b.add(decoderInputBuffer);
    }

    public final ByteBuffer l() throws AudioProcessor.UnhandledAudioFormatException {
        ByteBuffer d;
        AudioProcessor.a aVar;
        boolean z = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        if (z) {
            boolean f = this.h.f();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.c;
            if (f) {
                while (true) {
                    if (this.f.b()) {
                        ByteBuffer a2 = this.f.a();
                        this.h.i(a2);
                        if (a2.hasRemaining()) {
                            break;
                        }
                        if (!this.f.b()) {
                            this.h.h();
                            break;
                        }
                    } else {
                        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) concurrentLinkedQueue2.peek();
                        if (decoderInputBuffer == null) {
                            if (!concurrentLinkedQueue.isEmpty()) {
                                if (!n()) {
                                    this.h.h();
                                    break;
                                }
                                c();
                            } else {
                                break;
                            }
                        } else if (!decoderInputBuffer.b(4)) {
                            ByteBuffer byteBuffer = decoderInputBuffer.e;
                            byteBuffer.getClass();
                            long remaining = byteBuffer.remaining();
                            this.h.i(byteBuffer);
                            this.m += remaining - byteBuffer.remaining();
                            if (byteBuffer.hasRemaining()) {
                                break;
                            }
                            j((DecoderInputBuffer) concurrentLinkedQueue2.remove());
                        } else {
                            if (!n()) {
                                this.h.h();
                                this.j = true;
                                j((DecoderInputBuffer) concurrentLinkedQueue2.remove());
                                break;
                            }
                            c();
                            j((DecoderInputBuffer) concurrentLinkedQueue2.remove());
                        }
                    }
                }
                d = this.h.d();
            } else if (this.f.b()) {
                d = this.f.a();
            } else {
                DecoderInputBuffer decoderInputBuffer2 = this.g;
                if (decoderInputBuffer2 != null) {
                    d = decoderInputBuffer2.e;
                    d.getClass();
                    if (!d.hasRemaining()) {
                        DecoderInputBuffer decoderInputBuffer3 = this.g;
                        decoderInputBuffer3.getClass();
                        j(decoderInputBuffer3);
                        this.g = null;
                    }
                }
                DecoderInputBuffer decoderInputBuffer4 = (DecoderInputBuffer) concurrentLinkedQueue2.poll();
                if (decoderInputBuffer4 == null) {
                    if (!concurrentLinkedQueue.isEmpty() && n()) {
                        c();
                    }
                    d = AudioProcessor.a;
                } else {
                    ByteBuffer byteBuffer2 = decoderInputBuffer4.e;
                    this.j = decoderInputBuffer4.b(4);
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining() || this.j) {
                        j(decoderInputBuffer4);
                        if (this.j && n()) {
                            c();
                        }
                        d = AudioProcessor.a;
                    } else {
                        this.g = decoderInputBuffer4;
                        this.m += byteBuffer2.remaining();
                        d = byteBuffer2;
                    }
                }
            }
        } else {
            d = AudioProcessor.a;
        }
        if (d.hasRemaining()) {
            return d;
        }
        if (!m() && !concurrentLinkedQueue.isEmpty()) {
            a aVar2 = (a) concurrentLinkedQueue.poll();
            aVar2.getClass();
            androidx.media3.transformer.m mVar = aVar2.a;
            long j = aVar2.b;
            this.m = 0L;
            this.o = aVar2.d;
            this.n = false;
            androidx.media3.common.a aVar3 = aVar2.c;
            if (aVar3 != null) {
                this.l = j;
                aVar = new AudioProcessor.a(aVar3);
                this.f = new pmj0(aVar);
            } else {
                if (mVar.f.a.isEmpty()) {
                    this.l = mVar.b(j);
                } else {
                    this.l = j;
                }
                aVar = this.f.a;
                this.e.compareAndSet(C.TIME_UNSET, 0L);
                c();
            }
            if (this.i) {
                this.h = k(mVar, aVar3, aVar, this.a);
            }
            this.h.b(new AudioProcessor.b(0L));
            this.j = false;
            this.i = true;
        }
        return AudioProcessor.a;
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        DecoderInputBuffer decoderInputBuffer = this.g;
        if ((decoderInputBuffer == null || (byteBuffer = decoderInputBuffer.e) == null || !byteBuffer.hasRemaining()) && !this.f.b() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (this.n) {
            return false;
        }
        long j = this.l;
        if (j == C.TIME_UNSET) {
            return false;
        }
        long j2 = this.m;
        AudioProcessor.a aVar = this.f.a;
        return j - y2r0.b0(aVar.a, j2 / ((long) aVar.d)) > 2000;
    }
}
