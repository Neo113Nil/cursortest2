package xsna;

import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningPlayEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningStopEvent;

/* compiled from: PlaybackEventResolver.kt */
/* loaded from: classes3.dex */
public final class cwa0 {
    public final bkl a;

    public cwa0(jkl jklVar, bkl bklVar, tml tmlVar) {
        this.a = bklVar;
    }

    public static CommonAudioStat$AudioListeningEvent a(CommonAudioStat$AudioListeningEvent.a aVar) {
        if (aVar instanceof CommonAudioStat$AudioListeningPlayEvent) {
            return new CommonAudioStat$AudioListeningEvent(CommonAudioStat$AudioListeningEvent.Type.PLAY, (CommonAudioStat$AudioListeningPlayEvent) aVar, null, 4, null);
        }
        if (aVar instanceof CommonAudioStat$AudioListeningStopEvent) {
            return new CommonAudioStat$AudioListeningEvent(CommonAudioStat$AudioListeningEvent.Type.STOP, null, (CommonAudioStat$AudioListeningStopEvent) aVar, 2, null);
        }
        throw new IllegalArgumentException("payload must be one of(AudioListeningPlayEvent, AudioListeningStopEvent)");
    }
}
