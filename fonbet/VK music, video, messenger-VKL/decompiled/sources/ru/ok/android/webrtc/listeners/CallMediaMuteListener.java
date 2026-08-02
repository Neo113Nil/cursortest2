package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.participant.media.MuteEvent;

/* loaded from: classes9.dex */
public interface CallMediaMuteListener {
    void onMuteChanged(MuteEvent muteEvent);

    void onMuteStateInitialized(MuteEvent muteEvent);
}
