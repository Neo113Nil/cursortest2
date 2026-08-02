package defpackage;

import android.media.MediaCodec;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class pyn implements oyn {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer w;
    public final gl7 x;
    public final b y;
    public final AtomicBoolean z = new AtomicBoolean(false);

    public pyn(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.w = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            atomicReference.set(bVar);
            bVar.a = "Data closed";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.x = gl7Var;
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.y = bVar2;
    }

    @Override // defpackage.oyn
    public final MediaCodec.BufferInfo M() {
        return this.b;
    }

    @Override // defpackage.oyn
    public final boolean O() {
        return (this.b.flags & 1) != 0;
    }

    @Override // defpackage.oyn
    public final long V() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b bVar = this.y;
        if (this.z.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            bVar.b(null);
        } catch (IllegalStateException e) {
            bVar.d(e);
        }
    }

    @Override // defpackage.oyn
    public final long size() {
        return this.b.size;
    }

    @Override // defpackage.oyn
    public final ByteBuffer t1() {
        if (this.z.get()) {
            ny61.r("encoded data is closed.");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.w;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }
}
