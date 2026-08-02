package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class i63 implements el1 {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public i63(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (mc3.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.el1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && mc3.a < 21) {
                this.c = this.a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // yads.el1
    public final int b() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // yads.el1
    public final void flush() {
        this.a.flush();
    }

    @Override // yads.el1
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // yads.el1
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // yads.el1
    public final ByteBuffer b(int i) {
        return mc3.a >= 21 ? this.a.getOutputBuffer(i) : this.c[i];
    }

    @Override // yads.el1
    public final MediaFormat a() {
        return this.a.getOutputFormat();
    }

    public final void a(dl1 dl1Var, MediaCodec mediaCodec, long j, long j2) {
        bm1 bm1Var = (bm1) dl1Var;
        bm1Var.getClass();
        if (mc3.a < 30) {
            bm1Var.b.sendMessageAtFrontOfQueue(Message.obtain(bm1Var.b, 0, (int) (j >> 32), (int) j));
            return;
        }
        cm1 cm1Var = bm1Var.c;
        if (bm1Var != cm1Var.n1) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            cm1Var.z0 = true;
            return;
        }
        try {
            cm1Var.b(j);
            cm1Var.D();
            cm1Var.B0.e++;
            cm1Var.V0 = true;
            if (!cm1Var.T0) {
                cm1Var.T0 = true;
                cm1Var.I0.a(cm1Var.P0);
                cm1Var.R0 = true;
            }
            cm1Var.a(j);
        } catch (qn0 e) {
            bm1Var.c.A0 = e;
        }
    }

    @Override // yads.el1
    public final void a(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // yads.el1
    public final void a(int i, m20 m20Var, long j) {
        this.a.queueSecureInputBuffer(i, 0, m20Var.i, j, 0);
    }

    @Override // yads.el1
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // yads.el1
    public final void a(boolean z, int i) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // yads.el1
    public final void a(final dl1 dl1Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: xsna.l0z0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                yads.i63.this.a(dl1Var, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // yads.el1
    public final void a(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // yads.el1
    public final void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // yads.el1
    public final ByteBuffer a(int i) {
        if (mc3.a >= 21) {
            return this.a.getInputBuffer(i);
        }
        return this.b[i];
    }
}
