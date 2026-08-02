package defpackage;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.j;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class czn {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final gl7 d;
    public final b e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;
    public final /* synthetic */ j i;

    public czn(j jVar, MediaCodec mediaCodec, int i) {
        this.i = jVar;
        mediaCodec.getClass();
        this.a = mediaCodec;
        d6z.r(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            atomicReference.set(bVar);
            bVar.a = "Terminate InputBuffer";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.d = gl7Var;
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.e = bVar2;
    }

    public final boolean a() {
        b bVar = this.e;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            bVar.b(null);
        } catch (IllegalStateException e) {
            bVar.d(e);
        }
        return true;
    }

    public final void b(long j) {
        j jVar = this.i;
        if (!jVar.c) {
            j = jVar.n(j);
        }
        if (this.f.get()) {
            ny61.r("The buffer is submitted or canceled.");
        } else {
            d6z.n(j >= 0);
            this.g = j;
        }
    }

    public final boolean c() {
        b bVar = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            bVar.b(null);
            return true;
        } catch (IllegalStateException e) {
            bVar.d(e);
            return false;
        }
    }
}
