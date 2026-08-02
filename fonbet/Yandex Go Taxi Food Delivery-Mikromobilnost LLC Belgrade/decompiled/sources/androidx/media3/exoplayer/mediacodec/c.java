package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaCodec.Callback b;

    public /* synthetic */ c(MediaCodec.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaCodec.Callback callback = this.b;
        switch (i) {
            case 0:
                ((AsynchronousMediaCodecCallback) callback).onFlushCompleted();
                break;
            default:
                ((BaseAsynchronousMediaCodecCallback) callback).onFlushCompleted();
                break;
        }
    }
}
