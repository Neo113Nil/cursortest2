package xsna;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: SynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes12.dex */
public final class fpn0 implements dq10 {
    public final MediaCodec a;

    public fpn0(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // xsna.dq10
    public final void a(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // xsna.dq10
    public final void b(int i, tjk tjkVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, tjkVar.i, j, i2);
    }

    @Override // xsna.dq10
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // xsna.dq10
    public final void c() {
    }

    @Override // xsna.dq10
    public final void flush() {
    }

    @Override // xsna.dq10
    public final void shutdown() {
    }

    @Override // xsna.dq10
    public final void start() {
    }
}
