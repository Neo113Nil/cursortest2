package xsna;

import android.media.MediaFormat;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import com.vk.media.recorder.h;
import ru.ok.gl.util.Consumer;
import xsna.v2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2s0 implements Consumer {
    public final /* synthetic */ v2s0.a a;

    public /* synthetic */ t2s0(v2s0.a aVar) {
        this.a = aVar;
    }

    @Override // ru.ok.gl.util.Consumer
    public final void accept(Object obj) {
        MediaFormat mediaFormat = (MediaFormat) obj;
        v2s0 v2s0Var = v2s0.this;
        ej50 ej50Var = v2s0Var.t.get();
        if (ej50Var == null) {
            v2s0Var.c(new VideoAudioEncoderException("has no muxer to write audio format"), true);
            return;
        }
        if (!ej50Var.f(mediaFormat)) {
            if (ej50Var.d()) {
                return;
            }
            v2s0Var.c(new VideoAudioEncoderException("failed to write audio format"), true);
        } else if (v2s0Var.l.compareAndSet(false, true)) {
            h.a aVar = v2s0Var.p;
            if (aVar.a.get()) {
                return;
            }
            com.vk.media.recorder.h.this.q = true;
            aVar.e.obtainMessage(1).sendToTarget();
        }
    }
}
