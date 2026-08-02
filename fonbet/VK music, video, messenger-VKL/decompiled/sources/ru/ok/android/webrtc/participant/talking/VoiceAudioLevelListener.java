package ru.ok.android.webrtc.participant.talking;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import xsna.mf3;

/* loaded from: classes9.dex */
public final class VoiceAudioLevelListener extends AudioLevelListener {

    @Deprecated
    public static final long VOICE_REPORT_DELAY = 200;
    public final Listener a;

    public interface Listener {
        void onVoiceDetected();
    }

    public VoiceAudioLevelListener(Listener listener) {
        super((short) 500, new Handler(Looper.getMainLooper()), new mf3(listener, 15));
        this.a = listener;
    }

    public final Listener getListener() {
        return this.a;
    }
}
