package xsna;

import android.media.MediaCodec;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import java.nio.ByteBuffer;
import ru.ok.gl.util.Consumer;
import xsna.gzf;
import xsna.v2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2s0 implements Consumer {
    public final /* synthetic */ v2s0.a a;

    public /* synthetic */ u2s0(v2s0.a aVar) {
        this.a = aVar;
    }

    @Override // ru.ok.gl.util.Consumer
    public final void accept(Object obj) {
        boolean z;
        v2s0.a aVar = this.a;
        gzf.b bVar = (gzf.b) obj;
        ej50 ej50Var = v2s0.this.t.get();
        if (ej50Var == null) {
            v2s0.this.c(new VideoAudioEncoderException("has no muxer to write audio sample"), true);
            return;
        }
        MediaCodec.BufferInfo bufferInfo = bVar.a;
        if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
            ByteBuffer byteBuffer = bVar.b;
            synchronized (ej50Var.d) {
                try {
                    z = false;
                    if (ej50Var.h != null) {
                        z = ej50Var.g(false, byteBuffer, bufferInfo);
                        if (z) {
                            ej50Var.c(bufferInfo);
                        }
                    }
                } finally {
                }
            }
            if (z || ej50Var.d()) {
                aVar.a.c(bVar.a.presentationTimeUs);
            } else {
                v2s0.this.c(new VideoAudioEncoderException("failed to write audio sample"), true);
            }
        }
    }
}
