package ru.ok.android.webrtc.participant.current;

import ru.ok.android.webrtc.MutableMediaSettings;
import xsna.epx;

/* loaded from: classes9.dex */
public final class CurrentParticipantMediaChangedReporter implements MutableMediaSettings.EventListener {
    public final Listener a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public interface Listener {
        void onCurrentUserChanged();
    }

    public CurrentParticipantMediaChangedReporter(Listener listener) {
        this.a = listener;
    }

    @Override // ru.ok.android.webrtc.MutableMediaSettings.EventListener
    public void onMediaSettingsChanged(MutableMediaSettings mutableMediaSettings) {
        boolean z = (epx.f(this.b, Boolean.valueOf(mutableMediaSettings.isAudioEnabled())) && epx.f(this.c, Boolean.valueOf(mutableMediaSettings.isVideoEnabled())) && epx.f(this.d, Boolean.valueOf(mutableMediaSettings.isAnimojiEnabled())) && epx.f(this.e, Boolean.valueOf(mutableMediaSettings.isScreenCaptureEnabled()))) ? false : true;
        this.b = Boolean.valueOf(mutableMediaSettings.isAudioEnabled());
        this.c = Boolean.valueOf(mutableMediaSettings.isVideoEnabled());
        this.d = Boolean.valueOf(mutableMediaSettings.isAnimojiEnabled());
        this.e = Boolean.valueOf(mutableMediaSettings.isScreenCaptureEnabled());
        if (z) {
            this.a.onCurrentUserChanged();
        }
    }
}
