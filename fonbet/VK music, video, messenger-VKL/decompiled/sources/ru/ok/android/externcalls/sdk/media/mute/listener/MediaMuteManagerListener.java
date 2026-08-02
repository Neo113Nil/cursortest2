package ru.ok.android.externcalls.sdk.media.mute.listener;

import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: MediaMuteManagerListener.kt */
/* loaded from: classes9.dex */
public interface MediaMuteManagerListener {
    void onMuteChanged(MuteEvent muteEvent);

    void onMuteStateInitialized(MuteEvent muteEvent);
}
