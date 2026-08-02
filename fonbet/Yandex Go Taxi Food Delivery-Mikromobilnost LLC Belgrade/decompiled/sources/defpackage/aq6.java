package defpackage;

import android.media.MediaCodec;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class aq6 implements oyn {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final b c;

    public aq6(oyn oynVar) {
        MediaCodec.BufferInfo M = oynVar.M();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, M.size, M.presentationTimeUs, M.flags);
        this.b = bufferInfo;
        ByteBuffer t1 = oynVar.t1();
        MediaCodec.BufferInfo M2 = oynVar.M();
        t1.position(M2.offset);
        t1.limit(M2.offset + M2.size);
        ByteBuffer allocate = ByteBuffer.allocate(M2.size);
        allocate.order(t1.order());
        allocate.put(t1);
        allocate.flip();
        this.a = allocate;
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
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.c = bVar2;
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
        this.c.b(null);
    }

    @Override // defpackage.oyn
    public final long size() {
        return this.b.size;
    }

    @Override // defpackage.oyn
    public final ByteBuffer t1() {
        return this.a;
    }
}
