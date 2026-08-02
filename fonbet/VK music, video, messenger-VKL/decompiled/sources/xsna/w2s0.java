package xsna;

import android.media.MediaRecorder;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import com.vk.media.recorder.h;
import java.io.File;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.gzf;

/* compiled from: VideoAudioEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class w2s0 {
    public final h.a a;
    public File b;
    public vhf0 c;
    public gb4 d;
    public ExtraAudioSupplier e;
    public boolean f;
    public boolean g = true;
    public boolean h = false;

    public w2s0(@NonNull h.a aVar) {
        this.a = aVar;
    }

    public final v2s0 a() {
        vhf0 vhf0Var = this.c;
        gzf.c cVar = vhf0Var.b;
        gzf.a aVar = vhf0Var.a;
        if (cVar.c <= 0 || cVar.d <= 0) {
            throw new VideoAudioEncoderException("Illegal video params specified");
        }
        if (cVar.a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new VideoAudioEncoderException("Illegal video params specified");
        }
        if (1 > MediaRecorder.getAudioSourceMax()) {
            throw new VideoAudioEncoderException("Invalid audio source specified: 1");
        }
        if (this.c.c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new VideoAudioEncoderException("Invalid record speed specified: " + this.c.c);
        }
        float f = aVar.e;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new v2s0(this);
        }
        throw new VideoAudioEncoderException(n23.a(f, "Invalid audio pitch factor specified: "));
    }
}
