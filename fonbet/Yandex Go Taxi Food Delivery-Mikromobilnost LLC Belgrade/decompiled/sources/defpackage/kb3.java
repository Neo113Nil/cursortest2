package defpackage;

import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.e;

/* loaded from: classes10.dex */
public final /* synthetic */ class kb3 implements rhw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ kb3(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(a.h(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(a.h(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            case 2:
                return new HandlerThread(e.d(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 3:
                return new HandlerThread(e.d(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            case 4:
                return new HandlerThread(rii0.a(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(rii0.a(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
