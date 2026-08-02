package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes10.dex */
public abstract class dg3 {
    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
