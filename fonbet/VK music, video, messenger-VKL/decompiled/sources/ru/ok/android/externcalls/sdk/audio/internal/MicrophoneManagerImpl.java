package ru.ok.android.externcalls.sdk.audio.internal;

import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.webrtc.Call;
import xsna.gzs;

/* compiled from: MicrophoneManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MicrophoneManagerImpl implements MicrophoneManager {
    private final Call call;
    private final gzs<Boolean> isPrepared;

    public MicrophoneManagerImpl(Call call, gzs<Boolean> gzsVar) {
        this.call = call;
        this.isPrepared = gzsVar;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public boolean isMicEnabled() {
        return !this.call.isMuted();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void registerAudioSampleCallback(long j, MicSampleListener micSampleListener) {
        this.call.registerAudioSampleCallback(micSampleListener, j);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void removeAudioSampleCallback(MicSampleListener micSampleListener) {
        this.call.removeAudioSampleCallback(micSampleListener);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void setMicEnabled(boolean z) {
        if (this.isPrepared.invoke().booleanValue()) {
            this.call.setMuted(!z);
        }
    }
}
