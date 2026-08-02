package xsna;

import android.graphics.SurfaceTexture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SurfaceTexture.kt */
/* loaded from: classes3.dex */
public final class ckn0 extends SurfaceTexture {
    public final int a;
    public final int b;
    public final int c;
    public final f100 d;
    public final AtomicBoolean e;

    public ckn0(int i, int i2, int i3, f100 f100Var) {
        super(i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f100Var;
        this.e = new AtomicBoolean();
        if (i2 > 0 && i3 > 0) {
            setDefaultBufferSize(i2, i3);
            return;
        }
        throw new IllegalArgumentException(("Wrong resolution=" + i2 + 'x' + i3).toString());
    }

    @Override // android.graphics.SurfaceTexture
    public final void release() {
        if (this.e.compareAndSet(false, true)) {
            f100 f100Var = this.d;
            if (f100Var != null) {
                f100Var.d("SurfaceTexture", "release SurfaceTexture");
            }
            setOnFrameAvailableListener(null);
            try {
                super.release();
            } catch (Throwable th) {
                if (f100Var != null) {
                    f100Var.c("SurfaceTexture", th);
                }
            }
        }
    }
}
