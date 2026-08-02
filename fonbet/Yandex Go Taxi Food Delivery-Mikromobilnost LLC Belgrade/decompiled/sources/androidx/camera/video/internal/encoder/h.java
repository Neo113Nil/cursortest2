package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;

/* loaded from: classes10.dex */
public final /* synthetic */ class h {
    public final /* synthetic */ MediaFormat a;

    public /* synthetic */ h(MediaFormat mediaFormat) {
        this.a = mediaFormat;
    }

    public final MediaFormat a() {
        MediaFormat lambda$onOutputFormatChanged$5;
        lambda$onOutputFormatChanged$5 = EncoderImpl$MediaCodecCallback.lambda$onOutputFormatChanged$5(this.a);
        return lambda$onOutputFormatChanged$5;
    }
}
