package ru.ok.android.externcalls.sdk.video.internal;

import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.webrtc.Call;

/* compiled from: ScreenCaptureManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final Call call;

    public ScreenCaptureManagerImpl(Call call) {
        this.call = call;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public boolean isScreenCaptureEnabled() {
        return this.call.isMyScreenCaptureEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setAudioCaptureEnabled(boolean z) {
        this.call.setAudioCaptureEnabled(z);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setScreenCaptureEnabled(boolean z, boolean z2) {
        Call call = this.call;
        call.setScreenCaptureEnabled(z, z2);
        if (z) {
            return;
        }
        call.setAudioCaptureEnabled(false);
    }
}
