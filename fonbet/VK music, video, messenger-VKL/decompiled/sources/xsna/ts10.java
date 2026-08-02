package xsna;

import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: MediaMuteListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class ts10 implements MediaMuteManagerListener {
    public final us10 a;

    public ts10(us10 us10Var) {
        this.a = us10Var;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteChanged(MuteEvent muteEvent) {
        this.a.onMuteChanged(muteEvent);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteStateInitialized(MuteEvent muteEvent) {
        this.a.onMuteStateInitialized(muteEvent);
    }
}
