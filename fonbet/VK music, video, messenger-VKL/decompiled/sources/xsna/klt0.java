package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.session.transform.task.transcode.WrongPipelineStateException;
import xsna.k0h0;

/* compiled from: VideoTrackDecoder.kt */
/* loaded from: classes3.dex */
public final class klt0 {
    public final csp a;
    public final n6t0 b;
    public final MediaCodec.BufferInfo c = new MediaCodec.BufferInfo();

    public klt0(csp cspVar, n6t0 n6t0Var) {
        this.a = cspVar;
        this.b = n6t0Var;
    }

    public final void a(k0h0.b bVar, k0h0 k0h0Var) {
        n6t0 n6t0Var = this.b;
        if (n6t0Var.d()) {
            throw new IllegalStateException("Wrong state, already flushed");
        }
        n6t0Var.a(k0h0Var);
        if (n6t0Var.d()) {
            return;
        }
        int size = bVar.getSize();
        long a = bVar.a();
        k0h0.a.getClass();
        this.c.set(0, size, a, bVar.b() ? 1 : 0);
        n6t0Var.b(k0h0Var, bVar, this.c);
    }

    public final void b(boolean z) {
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        f100 f100Var2 = cspVar.d;
        if (f100Var != null) {
            f100Var.v("VideoTrackDecoder", "release video track decoder");
        }
        n6t0 n6t0Var = this.b;
        if (!n6t0Var.d() && z) {
            if (f100Var2 != null) {
                f100Var2.d("VideoTrackDecoder", "send EOS to video track decoders ...");
            }
            n6t0Var.g(true);
            if (!n6t0Var.d() && f100Var2 != null) {
                f100Var2.c("VideoTrackDecoder", new WrongPipelineStateException("releasing decoder, but producer hasn't received eos"));
            }
        }
        n6t0Var.f();
    }
}
