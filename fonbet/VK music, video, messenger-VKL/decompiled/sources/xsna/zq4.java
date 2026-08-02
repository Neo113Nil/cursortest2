package xsna;

import com.vk.media.pipeline.audio.AudioPcm;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: AudioMixer.kt */
/* loaded from: classes3.dex */
public final class zq4 {
    public final AudioPcm a;
    public final AudioPcm b;

    /* compiled from: AudioMixer.kt */
    public static final class a {
    }

    public zq4(AudioPcm audioPcm, AudioPcm audioPcm2) {
        this.a = audioPcm;
        this.b = audioPcm2;
    }

    public static float a(float f, AudioPcm.EncodingType encodingType) {
        if (encodingType != AudioPcm.EncodingType.PCM_16BIT) {
            return (f + 1.0f) / 2;
        }
        short s = (short) f;
        return s >= 0 ? io.reactivex.rxjava3.internal.operators.observable.n0.b(s * 1.0f, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, 0.5f, 0.5f) : (((-32768.0f) - s) / (-32768)) * 0.5f;
    }
}
