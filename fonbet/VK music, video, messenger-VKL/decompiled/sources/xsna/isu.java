package xsna;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import one.video.player.live.DebugInfo;

/* compiled from: H264Decoder.java */
/* loaded from: classes8.dex */
public final class isu implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ DebugInfo a;

    public isu(DebugInfo debugInfo) {
        this.a = debugInfo;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        this.a.getClass();
        System.nanoTime();
    }
}
