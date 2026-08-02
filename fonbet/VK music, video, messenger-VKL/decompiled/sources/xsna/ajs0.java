package xsna;

import android.view.Surface;
import com.vk.media.pipeline.gl.GlException;

/* compiled from: VideoEncoderInputSurface.kt */
/* loaded from: classes3.dex */
public final class ajs0 {
    public final q0u a;
    public final int b;
    public final int c;
    public final Surface d;
    public final f100 e;

    public ajs0(Surface surface, q0u q0uVar, f100 f100Var) {
        this.a = q0uVar;
        this.b = q0uVar.a;
        this.c = q0uVar.b;
        this.d = surface;
        this.e = f100Var;
    }

    public final void a() {
        f100 f100Var = this.e;
        if (f100Var != null) {
            f100Var.v("VideoEncoderInputSurface", "release video encoder surface");
        }
        try {
            this.d.release();
        } catch (Throwable th) {
            if (f100Var != null) {
                f100Var.e("VideoEncoderInputSurface", "Surface release failed", new GlException(th));
            }
        }
        this.a.a();
    }
}
