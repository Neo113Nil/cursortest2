package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.o0u;

/* compiled from: TimestampAdjustmentShaderProgram.java */
/* loaded from: classes12.dex */
public final class yxo0 implements o0u {
    public final mrc0 a;

    @Nullable
    public r0u d;
    public o0u.b e = new wxo0();
    public o0u.c f = new xxo0();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicBoolean c = new AtomicBoolean();

    public yxo0(mrc0 mrc0Var) {
        this.a = mrc0Var;
    }

    @Override // xsna.o0u
    public final void b(o0u.b bVar) {
        this.e = bVar;
        if (this.d == null) {
            bVar.e();
        }
    }

    @Override // xsna.o0u
    public final void c(k0u k0uVar, r0u r0uVar, long j) {
        this.d = r0uVar;
        mrc0 mrc0Var = this.a;
        zxo0 zxo0Var = new zxo0() { // from class: xsna.vxo0
            @Override // xsna.zxo0
            public final void a(long j2) {
                yxo0 yxo0Var = yxo0.this;
                o0u.c cVar = yxo0Var.f;
                r0u r0uVar2 = yxo0Var.d;
                r0uVar2.getClass();
                cVar.d(r0uVar2, j2);
                AtomicBoolean atomicBoolean = yxo0Var.c;
                if (atomicBoolean.get()) {
                    yxo0Var.f.c();
                    atomicBoolean.set(false);
                }
                yxo0Var.b.decrementAndGet();
            }
        };
        androidx.media3.common.audio.f fVar = (androidx.media3.common.audio.f) mrc0Var.c;
        synchronized (fVar.b) {
            try {
                int i = fVar.j.a;
                if (i == -1) {
                    fVar.e.a(j);
                    fVar.f.add(zxo0Var);
                } else {
                    zxo0Var.a(androidx.media3.common.audio.f.d(i, j, fVar.c));
                }
            } finally {
            }
        }
        this.b.incrementAndGet();
    }

    @Override // xsna.o0u
    public final void d(o0u.c cVar) {
        this.f = cVar;
    }

    @Override // xsna.o0u
    public final void e(r0u r0uVar) {
        int i = r0uVar.a;
        r0u r0uVar2 = this.d;
        r0uVar2.getClass();
        fxc0.z(i == r0uVar2.a);
        this.e.b(r0uVar);
        this.e.e();
    }

    @Override // xsna.o0u
    public final void f() {
        if (this.b.get() == 0) {
            this.f.c();
        } else {
            this.c.set(true);
        }
    }

    @Override // xsna.o0u
    public final void flush() {
        throw new UnsupportedOperationException("This effect is not supported for previewing.");
    }

    @Override // xsna.o0u
    public final void release() throws VideoFrameProcessingException {
        this.d = null;
    }

    @Override // xsna.o0u
    public final void a(Executor executor, tp1 tp1Var) {
    }
}
