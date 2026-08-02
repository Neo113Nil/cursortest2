package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import defpackage.iqs;
import defpackage.pyn;

/* loaded from: classes10.dex */
public final class i implements iqs {
    public final /* synthetic */ pyn a;
    public final /* synthetic */ EncoderImpl$MediaCodecCallback b;

    public i(EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback, pyn pynVar) {
        this.b = encoderImpl$MediaCodecCallback;
        this.a = pynVar;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback = this.b;
        encoderImpl$MediaCodecCallback.this$0.o.remove(this.a);
        boolean z = th instanceof MediaCodec.CodecException;
        j jVar = encoderImpl$MediaCodecCallback.this$0;
        if (!z) {
            jVar.b(0, th.getMessage(), th);
            return;
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        jVar.getClass();
        jVar.b(1, codecException.getMessage(), codecException);
    }

    @Override // defpackage.iqs
    public final void onSuccess(Object obj) {
        this.b.this$0.o.remove(this.a);
    }
}
