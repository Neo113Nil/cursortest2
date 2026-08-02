package ru.ok.android.externcalls.sdk.audio.internal;

import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import xsna.gp;
import xsna.zcl;

/* compiled from: DefaultAudioDeviceSelector.kt */
/* loaded from: classes9.dex */
public final class DefaultAudioDeviceSelector implements AudioDeviceSelector {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DefaultAudioDeviceSelector";
    private final Logger logger;

    /* compiled from: DefaultAudioDeviceSelector.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultAudioDeviceSelector(Logger logger) {
        this.logger = logger;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector
    public CallsAudioManager.AudioDeviceType selectPreferableDevice(CallsAudioManager.State state, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set<? extends CallsAudioManager.AudioDeviceType> set, CallsAudioManager.AudioDeviceType audioDeviceType, VideoTracker videoTracker, ProximityTracker proximityTracker) {
        CallsAudioManager.AudioDeviceType audioDeviceType2;
        CallsAudioManager.AudioDeviceType audioDeviceType3;
        boolean z7 = z && set.contains(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        boolean z8 = (z2 && audioDeviceType == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE) || videoTracker.preferSpeakerOverEarpiece();
        Logger logger = this.logger;
        StringBuilder c = gp.c("selecting the best device: bt: ", ", respectSpeaker: ", ", bt available: ", z, z2);
        c.append(z7);
        c.append(", speaker: ");
        c.append(z8);
        logger.v(LOG_TAG, c.toString());
        if (z3) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        } else if (z7 && (audioDeviceType == (audioDeviceType3 = CallsAudioManager.AudioDeviceType.BLUETOOTH) || !z6)) {
            audioDeviceType2 = audioDeviceType3;
        } else if (!z5 && proximityTracker.getCanUseSpeaker() && z8) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (!z4) {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (state == CallsAudioManager.State.RINGING) {
            this.logger.v(LOG_TAG, "select speaker phone because of RINGING state");
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else {
            audioDeviceType2 = CallsAudioManager.AudioDeviceType.EARPIECE;
        }
        this.logger.v(LOG_TAG, "prefer " + audioDeviceType2);
        return audioDeviceType2;
    }
}
