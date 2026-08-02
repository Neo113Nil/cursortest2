package defpackage;

import android.media.AudioManager;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;

/* loaded from: classes10.dex */
public final /* synthetic */ class nh3 implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AudioSwitchManager.lambda$new$1(i);
    }
}
