package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes12.dex */
public final class lj9 extends androidx.media3.exoplayer.a {
    public final DecoderInputBuffer t;
    public final xi90 u;

    @Nullable
    public kj9 v;
    public long w;

    public lj9() {
        super(6);
        this.t = new DecoderInputBuffer(1);
        this.u = new xi90();
    }

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(aVar.n) ? androidx.media3.exoplayer.k.f(4, 0, 0, 0) : androidx.media3.exoplayer.k.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.i.b
    public final void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.v = (kj9) obj;
        }
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.j
    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.w < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.t;
            decoderInputBuffer.c();
            w8s w8sVar = this.d;
            w8sVar.a();
            if (B(w8sVar, decoderInputBuffer, 0) != -4 || decoderInputBuffer.b(4)) {
                return;
            }
            long j3 = decoderInputBuffer.g;
            this.w = j3;
            boolean z = j3 < this.m;
            if (this.v != null && !z) {
                decoderInputBuffer.h();
                ByteBuffer byteBuffer = decoderInputBuffer.e;
                String str = y2r0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    xi90 xi90Var = this.u;
                    xi90Var.N(array, limit);
                    xi90Var.P(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(xi90Var.r());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.v.onCameraMotion(this.w - this.l, fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        kj9 kj9Var = this.v;
        if (kj9Var != null) {
            kj9Var.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) {
        this.w = Long.MIN_VALUE;
        kj9 kj9Var = this.v;
        if (kj9Var != null) {
            kj9Var.onCameraMotionReset();
        }
    }
}
