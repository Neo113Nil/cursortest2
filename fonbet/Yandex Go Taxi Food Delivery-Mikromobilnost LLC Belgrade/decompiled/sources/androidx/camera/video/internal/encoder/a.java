package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import defpackage.pyn;
import defpackage.xyn;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback = (EncoderImpl$MediaCodecCallback) obj2;
                Objects.requireNonNull(encoderImpl$MediaCodecCallback);
                ((Executor) obj).execute(new c(0, encoderImpl$MediaCodecCallback));
                break;
            case 1:
                ((xyn) obj).C((pyn) obj2);
                break;
            case 2:
                EncoderImpl$MediaCodecCallback.lambda$onOutputFormatChanged$6((xyn) obj, (MediaFormat) obj2);
                break;
            case 3:
                ((EncoderImpl$MediaCodecCallback) obj2).lambda$onError$4((MediaCodec.CodecException) obj);
                break;
            default:
                ((EncoderImpl$MediaCodecCallback) obj2).lambda$onOutputFormatChanged$7((MediaFormat) obj);
                break;
        }
    }

    public /* synthetic */ a(EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback, Object obj, int i) {
        this.a = i;
        this.c = encoderImpl$MediaCodecCallback;
        this.b = obj;
    }
}
